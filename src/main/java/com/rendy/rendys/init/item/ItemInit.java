package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.ArmorMaterialInit;
import com.rendy.rendys.init.FoodInit;
import com.rendy.rendys.items.ArmorItemEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public final static DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<Item> POWERED_NETHERITE_INGOT = ITEMS.register("powered_netherite_ingot",() -> new Item(new Item.Properties().stacksTo(32).fireResistant()));
    public static final DeferredItem<Item> REINFORCED_NETHERITE_INGOT = ITEMS.register("reinforced_netherite_ingot",() -> new Item(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SUPER_NETHERITE_INGOT = ITEMS.register("super_netherite_ingot",() -> new Item(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> POWERED_NETHERITE_TEMPLATE = ITEMS.register("powered_netherite_upgrade_smithing_template",() -> new Item(new Item.Properties().stacksTo(32).fireResistant()));
    public static final DeferredItem<Item> REINFORCED_NETHERITE_TEMPLATE = ITEMS.register("reinforced_netherite_upgrade_smithing_template",() -> new Item(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SUPER_NETHERITE_TEMPLATE = ITEMS.register("super_netherite_upgrade_smithing_template",() -> new Item(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> POWERED_NETHERITE_DUST = ITEMS.register("powered_netherite_dust",() -> new Item(new Item.Properties().stacksTo(64).fireResistant()));
    public static final DeferredItem<Item> REINFORCED_NETHERITE_DUST = ITEMS.register("reinforced_netherite_dust",() -> new Item(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> NETHERSTAR_DUST = ITEMS.register("netherstar_dust",() -> new Item(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",() -> new Item(new Item.Properties().stacksTo(48).fireResistant().food(FoodInit.DIAMOND_APPLE)));
    public static final DeferredItem<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",() -> new Item(new Item.Properties().stacksTo(32).fireResistant().food(FoodInit.EMERALD_APPLE)));
    public static final DeferredItem<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",() -> new Item(new Item.Properties().stacksTo(16).fireResistant().food(FoodInit.NETHERITE_APPLE)));
    public static final DeferredItem<Item> POWERED_NETHERITE_APPLE = ITEMS.register("powered_netherite_apple",() -> new Item(new Item.Properties().stacksTo(8).fireResistant().food(FoodInit.POWERED_NETHERITE_APPLE)));
    public static final DeferredItem<Item> REINFORCED_NETHERITE_APPLE = ITEMS.register("reinforced_netherite_apple",() -> new Item(new Item.Properties().stacksTo(8).fireResistant().rarity(Rarity.EPIC).food(FoodInit.REINFORCED_NETHERITE_APPLE)));
    public static final DeferredItem<Item> SUPER_NETHERITE_APPLE = ITEMS.register("super_netherite_apple",() -> new Item(new Item.Properties().stacksTo(4).fireResistant().rarity(Rarity.UNCOMMON).food(FoodInit.SUPER_NETHERITE_APPLE)));
    public static final DeferredItem<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",() -> new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",() -> new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",() -> new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",() -> new ArmorItem(ArmorMaterialInit.COPPER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",() -> new ArmorItemEffects(ArmorMaterialInit.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",() -> new ArmorItemEffects(ArmorMaterialInit.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",() -> new ArmorItemEffects(ArmorMaterialInit.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",() -> new ArmorItemEffects(ArmorMaterialInit.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> POWERED_NETHERITE_HELMET = ITEMS.register("powered_netherite_helmet",() -> new ArmorItemEffects(ArmorMaterialInit.POWERED_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> POWERED_NETHERITE_CHESTPLATE = ITEMS.register("powered_netherite_chestplate",() -> new ArmorItemEffects(ArmorMaterialInit.POWERED_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> POWERED_NETHERITE_LEGGINGS = ITEMS.register("powered_netherite_leggings",() -> new ArmorItemEffects(ArmorMaterialInit.POWERED_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> POWERED_NETHERITE_BOOTS = ITEMS.register("powered_netherite_boots",() -> new ArmorItemEffects(ArmorMaterialInit.POWERED_NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> REINFORCED_NETHERITE_HELMET = ITEMS.register("reinforced_netherite_helmet",() -> new ArmorItemEffects(ArmorMaterialInit.REINFORCED_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> REINFORCED_NETHERITE_CHESTPLATE = ITEMS.register("reinforced_netherite_chestplate",() -> new ArmorItemEffects(ArmorMaterialInit.REINFORCED_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> REINFORCED_NETHERITE_LEGGINGS = ITEMS.register("reinforced_netherite_leggings",() -> new ArmorItemEffects(ArmorMaterialInit.REINFORCED_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> REINFORCED_NETHERITE_BOOTS = ITEMS.register("reinforced_netherite_boots",() -> new ArmorItemEffects(ArmorMaterialInit.REINFORCED_NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SUPER_NETHERITE_HELMET = ITEMS.register("super_netherite_helmet",() -> new ArmorItemEffects(ArmorMaterialInit.SUPER_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SUPER_NETHERITE_CHESTPLATE = ITEMS.register("super_netherite_chestplate",() -> new ArmorItemEffects(ArmorMaterialInit.SUPER_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SUPER_NETHERITE_LEGGINGS = ITEMS.register("super_netherite_leggings",() -> new ArmorItemEffects(ArmorMaterialInit.SUPER_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SUPER_NETHERITE_BOOTS = ITEMS.register("super_netherite_boots",() -> new ArmorItemEffects(ArmorMaterialInit.SUPER_NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));
}