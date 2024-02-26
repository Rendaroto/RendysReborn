package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AxeInit {
    public final static DeferredRegister.Items AXE_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<AxeItem> EMERLAD_AXE = AXE_ITEMS.register  ("emerald_axe",
            () -> new AxeItem(TiersInit.EMERALD_TIER,8,2.6f,new Item.Properties()));

    public static final DeferredItem<AxeItem> POWERED_NETHERITE_AXE = AXE_ITEMS.register  ("powered_netherite_axe",
            () -> new AxeItem(TiersInit.POWERED_NETHERITE_TIER,11,2.8f, new Item.Properties()));

    public static final DeferredItem<AxeItem> REINFORCED_NETHERITE_AXE = AXE_ITEMS.register  ("reinforced_netherite_axe",
            () -> new AxeItem(TiersInit.REINFORCED_NETHERITE_TIER,12,3.5f, new Item.Properties()));

    public static final DeferredItem<AxeItem> SUPER_NETHERITE_AXE = AXE_ITEMS.register  ("super_netherite_axe",
            () -> new AxeItem(TiersInit.SUPER_NETHERITE_TIER,14,3.8f, new Item.Properties()));

}