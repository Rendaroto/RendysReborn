package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import com.rendy.hammering.items.HammerItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HammerInit {

    public final static DeferredRegister.Items HAMMER_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<HammerItem> WOODEN_HAMMER = HAMMER_ITEMS.register  ("wooden_hammer",
            () -> new HammerItem(Tiers.WOOD,1,-2.8f,
                    null));
    public static final DeferredItem<HammerItem> STONE_HAMMER = HAMMER_ITEMS.register  ("stone_hammer",
            () -> new HammerItem(Tiers.STONE,1,-2.8f,
                    null));
    public static final DeferredItem<HammerItem> GOLDEN_HAMMER = HAMMER_ITEMS.register  ("golden_hammer",
            () -> new HammerItem(Tiers.GOLD,1,-2.8f,
                    null));
    public static final DeferredItem<HammerItem> IRON_HAMMER = HAMMER_ITEMS.register  ("iron_hammer",
            () -> new HammerItem(Tiers.IRON,1,-2.8f,
                    null));
    public static final DeferredItem<HammerItem> DIAMOND_HAMMER = HAMMER_ITEMS.register  ("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND,1,-2.8f,
                    null));
    public static final DeferredItem<HammerItem> NETHERITE_HAMMER = HAMMER_ITEMS.register  ("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE,1,-2.8f,
                    null));

    public static final DeferredItem<HammerItem> EMERALD_HAMMER = HAMMER_ITEMS.register  ("emerald_hammer",
            () -> new HammerItem(CustomMaterialsInit.EMERALD_MATERIAL,1,-2.8f,
                    null));

    public static final DeferredItem<HammerItem> POWERED_NETHERITE_HAMMER = HAMMER_ITEMS.register  ("powered_netherite_hammer",
            () -> new HammerItem(CustomMaterialsInit.POWERED_NETHERITE_MATERIAL,1,-2.8f,
                    null));

    public static final DeferredItem<HammerItem> REINFORCED_NETHERITE_HAMMER = HAMMER_ITEMS.register  ("reinforced_netherite_hammer",
            () -> new HammerItem(CustomMaterialsInit.REINFORCED_NETHERITE_MATERIAL,1,-2.8f,
                    null));

    public static final DeferredItem<HammerItem> SUPER_NETHERITE_HAMMER = HAMMER_ITEMS.register  ("super_netherite_hammer",
            () -> new HammerItem(CustomMaterialsInit.SUPER_NETHERITE_MATERIAL,1,-2.8f,
                    null));
}
