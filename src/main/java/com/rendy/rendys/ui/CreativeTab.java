package com.rendy.rendys.ui;

import com.rendy.rendys.init.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.rendy.rendys.Rendys.MOD_ID;

public class CreativeTab {

    public static final DeferredRegister<CreativeModeTab> TAB_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RENDYS_TAB = TAB_REG.register("rendys_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.rendys")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(ItemInit.NETHERSTAR_DUST.get())).displayItems((config, builder) -> {
        builder.accept(HammerInit.WOODEN_HAMMER.get());
        builder.accept(HammerInit.STONE_HAMMER.get());
        builder.accept(HammerInit.COPPER_HAMMER.get());
        builder.accept(HammerInit.IRON_HAMMER.get());
        builder.accept(HammerInit.GOLDEN_HAMMER.get());
        builder.accept(HammerInit.DIAMOND_HAMMER.get());
        builder.accept(HammerInit.NETHERITE_HAMMER.get());
        builder.accept(HammerInit.EMERALD_HAMMER.get());
        builder.accept(HammerInit.POWERED_NETHERITE_HAMMER.get());
        builder.accept(HammerInit.REINFORCED_NETHERITE_HAMMER.get());
        builder.accept(HammerInit.SUPER_NETHERITE_HAMMER.get());
        builder.accept(AxeInit.COPPER_AXE.get());
        builder.accept(AxeInit.EMERLAD_AXE.get());
        builder.accept(AxeInit.POWERED_NETHERITE_AXE.get());
        builder.accept(AxeInit.REINFORCED_NETHERITE_AXE.get());
        builder.accept(AxeInit.SUPER_NETHERITE_AXE.get());
        builder.accept(PickaxeInit.COPPER_PICKAXE.get());
        builder.accept(PickaxeInit.EMERALD_PICKAXE.get());
        builder.accept(PickaxeInit.POWERED_NETHERITE_PICKAXE.get());
        builder.accept(PickaxeInit.REINFORCED_NETHERITE_PICKAXE.get());
        builder.accept(PickaxeInit.SUPER_NETHERITE_PICKAXE.get());
        builder.accept(ShovelInit.COPPER_SHOVEL.get());
        builder.accept(ShovelInit.EMERALD_SHOVEL.get());
        builder.accept(ShovelInit.POWERED_NETHERITE_SHOVEL.get());
        builder.accept(ShovelInit.REINFORCED_NETHERITE_SHOVEL.get());
        builder.accept(ShovelInit.SUPER_NETHERITE_SHOVEL.get());
        builder.accept(SwordInit.COPPER_SWORD.get());
        builder.accept(SwordInit.EMERLAD_SWORD.get());
        builder.accept(SwordInit.POWERED_NETHERITE_SWORD.get());
        builder.accept(SwordInit.REINFORCED_NETHERITE_SWORD.get());
        builder.accept(SwordInit.SUPER_NETHERITE_SWORD.get());
        builder.accept(HoeInit.COPPER_HOE.get());
        builder.accept(HoeInit.EMERLAD_HOE.get());
        builder.accept(HoeInit.POWERED_NETHERITE_HOE.get());
        builder.accept(HoeInit.REINFORCED_NETHERITE_HOE.get());
        builder.accept(HoeInit.SUPER_NETHERITE_HOE.get());
        builder.accept(ItemInit.POWERED_NETHERITE_DUST.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_DUST.get());
        builder.accept(ItemInit.NETHERSTAR_DUST.get());
        builder.accept(ItemInit.POWERED_NETHERITE_INGOT.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_INGOT.get());
        builder.accept(ItemInit.SUPER_NETHERITE_INGOT.get());
        builder.accept(ItemInit.POWERED_NETHERITE_TEMPLATE);
        builder.accept(ItemInit.REINFORCED_NETHERITE_TEMPLATE.get());
        builder.accept(ItemInit.SUPER_NETHERITE_TEMPLATE.get());
        builder.accept(ItemInit.DIAMOND_APPLE.get());
        builder.accept(ItemInit.EMERALD_APPLE.get());
        builder.accept(ItemInit.NETHERITE_APPLE.get());
        builder.accept(ItemInit.POWERED_NETHERITE_APPLE.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_APPLE.get());
        builder.accept(ItemInit.SUPER_NETHERITE_APPLE.get());
        builder.accept(ItemInit.COPPER_HELMET.get());
        builder.accept(ItemInit.COPPER_CHESTPLATE.get());
        builder.accept(ItemInit.COPPER_LEGGINGS.get());
        builder.accept(ItemInit.COPPER_BOOTS.get());
        builder.accept(ItemInit.EMERALD_HELMET.get());
        builder.accept(ItemInit.EMERALD_CHESTPLATE.get());
        builder.accept(ItemInit.EMERALD_LEGGINGS.get());
        builder.accept(ItemInit.EMERALD_BOOTS.get());
        builder.accept(ItemInit.POWERED_NETHERITE_HELMET.get());
        builder.accept(ItemInit.POWERED_NETHERITE_CHESTPLATE.get());
        builder.accept(ItemInit.POWERED_NETHERITE_LEGGINGS.get());
        builder.accept(ItemInit.POWERED_NETHERITE_BOOTS.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_HELMET.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_CHESTPLATE.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_LEGGINGS.get());
        builder.accept(ItemInit.REINFORCED_NETHERITE_BOOTS.get());
        builder.accept(ItemInit.SUPER_NETHERITE_HELMET.get());
        builder.accept(ItemInit.SUPER_NETHERITE_CHESTPLATE.get());
        builder.accept(ItemInit.SUPER_NETHERITE_LEGGINGS.get());
        builder.accept(ItemInit.SUPER_NETHERITE_BOOTS.get());
    }).build());

}
