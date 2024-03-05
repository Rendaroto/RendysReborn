package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.FoodInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.registerItem;

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

}