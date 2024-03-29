package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.TiersInit;
import com.rendy.rendys.items.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HammerInit {

    public final static DeferredRegister.Items HAMMER_ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<HammerItem> WOODEN_HAMMER = HAMMER_ITEMS.register  ("wooden_hammer",
            () -> new HammerItem(Tiers.WOOD,1,-2.8f,
                    new Item.Properties()));
    public static final DeferredItem<HammerItem> STONE_HAMMER = HAMMER_ITEMS.register  ("stone_hammer",
            () -> new HammerItem(Tiers.STONE,1,-2.8f,
                    new Item.Properties()));
    public static final DeferredItem<HammerItem> GOLDEN_HAMMER = HAMMER_ITEMS.register  ("golden_hammer",
            () -> new HammerItem(Tiers.GOLD,1,-2.8f,
                    new Item.Properties()));
    public static final DeferredItem<HammerItem> COPPER_HAMMER = HAMMER_ITEMS.register  ("copper_hammer",
            () -> new HammerItem(TiersInit.COPPER_TIER,1,-2.8f,
                    new Item.Properties()));
    public static final DeferredItem<HammerItem> IRON_HAMMER = HAMMER_ITEMS.register  ("iron_hammer",
            () -> new HammerItem(Tiers.IRON,1,-2.8f,
                    new Item.Properties()));
    public static final DeferredItem<HammerItem> DIAMOND_HAMMER = HAMMER_ITEMS.register  ("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND,1,-2.8f,
                    new Item.Properties()));
    public static final DeferredItem<HammerItem> NETHERITE_HAMMER = HAMMER_ITEMS.register  ("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE,1,-2.8f,
                    new Item.Properties().fireResistant()));

    public static final DeferredItem<HammerItem> EMERALD_HAMMER = HAMMER_ITEMS.register  ("emerald_hammer",
            () -> new HammerItem(TiersInit.EMERALD_TIER,1,-2.8f,
                    new Item.Properties()));

    public static final DeferredItem<HammerItem> POWERED_NETHERITE_HAMMER = HAMMER_ITEMS.register  ("powered_netherite_hammer",
            () -> new HammerItem(TiersInit.POWERED_NETHERITE_TIER,1,-2.8f,
                    new Item.Properties().fireResistant()));

    public static final DeferredItem<HammerItem> REINFORCED_NETHERITE_HAMMER = HAMMER_ITEMS.register  ("reinforced_netherite_hammer",
            () -> new HammerItem(TiersInit.REINFORCED_NETHERITE_TIER,1,-2.8f,
                    new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final DeferredItem<HammerItem> SUPER_NETHERITE_HAMMER = HAMMER_ITEMS.register  ("super_netherite_hammer",
            () -> new HammerItem(TiersInit.SUPER_NETHERITE_TIER,1,-2.8f,
                    new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));
}
