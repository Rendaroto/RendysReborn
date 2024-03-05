package com.rendy.hammering.ui;

import com.rendy.hammering.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.rendy.hammering.Hammering.MOD_ID;

public class CreativeTab {

    public static final DeferredRegister<CreativeModeTab> TAB_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HAMMERING_TAB = TAB_REG.register("hammering_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.hammering")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(HammerInit.NETHERITE_HAMMER.get())).displayItems((config, builder) -> {
        builder.accept(HammerInit.WOODEN_HAMMER.get());
        builder.accept(HammerInit.STONE_HAMMER.get());
        builder.accept(HammerInit.IRON_HAMMER.get());
        builder.accept(HammerInit.GOLDEN_HAMMER.get());
        builder.accept(HammerInit.DIAMOND_HAMMER.get());
        builder.accept(HammerInit.NETHERITE_HAMMER.get());
        builder.accept(HammerInit.EMERALD_HAMMER.get());
        builder.accept(HammerInit.POWERED_NETHERITE_HAMMER.get());
        builder.accept(HammerInit.REINFORCED_NETHERITE_HAMMER.get());
        builder.accept(HammerInit.SUPER_NETHERITE_HAMMER.get());
        builder.accept(AxeInit.EMERLAD_AXE.get());
        builder.accept(AxeInit.POWERED_NETHERITE_AXE.get());
        builder.accept(AxeInit.REINFORCED_NETHERITE_AXE.get());
        builder.accept(AxeInit.SUPER_NETHERITE_AXE.get());
        builder.accept(PickaxeInit.EMERLAD_PICKAXE.get());
        builder.accept(PickaxeInit.POWERED_NETHERITE_PICKAXE.get());
        builder.accept(PickaxeInit.REINFORCED_NETHERITE_PICKAXE.get());
        builder.accept(PickaxeInit.SUPER_NETHERITE_PICKAXE.get());
        builder.accept(ShovelInit.EMERLAD_PICKAXE.get());
        builder.accept(ShovelInit.POWERED_NETHERITE_PICKAXE.get());
        builder.accept(ShovelInit.REINFORCED_NETHERITE_PICKAXE.get());
        builder.accept(ShovelInit.SUPER_NETHERITE_PICKAXE.get());
        builder.accept(SwordInit.EMERLAD_SWORD.get());
        builder.accept(SwordInit.POWERED_NETHERITE_SWORD.get());
        builder.accept(SwordInit.REINFORCED_NETHERITE_SWORD.get());
        builder.accept(SwordInit.SUPER_NETHERITE_SWORD.get());
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
        builder.accept(ItemInit.SUPER_NETHERITE_APPLE);
    }).build());

}
