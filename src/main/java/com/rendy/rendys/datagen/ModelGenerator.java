package com.rendy.rendys.datagen;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.item.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModelGenerator extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Rendys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        trimmedArmorItem(ItemInit.COPPER_HELMET);
        trimmedArmorItem(ItemInit.COPPER_CHESTPLATE);
        trimmedArmorItem(ItemInit.COPPER_LEGGINGS);
        trimmedArmorItem(ItemInit.COPPER_BOOTS);
        trimmedArmorItem(ItemInit.EMERALD_HELMET);
        trimmedArmorItem(ItemInit.EMERALD_CHESTPLATE);
        trimmedArmorItem(ItemInit.EMERALD_LEGGINGS);
        trimmedArmorItem(ItemInit.EMERALD_BOOTS);
        trimmedArmorItem(ItemInit.POWERED_NETHERITE_HELMET);
        trimmedArmorItem(ItemInit.POWERED_NETHERITE_CHESTPLATE);
        trimmedArmorItem(ItemInit.POWERED_NETHERITE_LEGGINGS);
        trimmedArmorItem(ItemInit.POWERED_NETHERITE_BOOTS);
        trimmedArmorItem(ItemInit.REINFORCED_NETHERITE_HELMET);
        trimmedArmorItem(ItemInit.REINFORCED_NETHERITE_CHESTPLATE);
        trimmedArmorItem(ItemInit.REINFORCED_NETHERITE_LEGGINGS);
        trimmedArmorItem(ItemInit.REINFORCED_NETHERITE_BOOTS);
        trimmedArmorItem(ItemInit.SUPER_NETHERITE_HELMET);
        trimmedArmorItem(ItemInit.SUPER_NETHERITE_CHESTPLATE);
        trimmedArmorItem(ItemInit.SUPER_NETHERITE_LEGGINGS);
        trimmedArmorItem(ItemInit.SUPER_NETHERITE_BOOTS);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemRegistryObject) {
        final String MOD_ID = Rendys.MOD_ID; // Change this to your mod id

        trimMaterials.entrySet().forEach(entry -> {

            ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
            float trimValue = entry.getValue();

            String armorType = switch (itemRegistryObject.get().getEquipmentSlot()) {
                case HEAD -> "helmet";
                case CHEST -> "chestplate";
                case LEGS -> "leggings";
                case FEET -> "boots";
                default -> "";
            };

            String armorItemPath = "item/" + itemRegistryObject.get().asItem();
            String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
            String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
            ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
            ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
            ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

            // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
            // avoid an IllegalArgumentException
            existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

            // Trimmed armorItem files
            getBuilder(currentTrimName)
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", armorItemResLoc)
                    .texture("layer1", trimResLoc);

            // Non-trimmed armorItem file (normal variant)
            this.withExistingParent(itemRegistryObject.getId().getPath(),
                            mcLoc("item/generated"))
                    .override()
                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                    .predicate(mcLoc("trim_type"), trimValue).end()
                    .texture("layer0",
                            new ResourceLocation(MOD_ID, "item/" + itemRegistryObject.getId().getPath()));
        });
    }
}