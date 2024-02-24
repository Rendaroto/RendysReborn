package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AxeInit {
    public final static DeferredRegister.Items AXE_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<AxeItem> EMERLAD_AXE = AXE_ITEMS.register  ("emerald_axe",
            () -> new AxeItem(CustomMaterialsInit.EMERALD_MATERIAL,8,2.6f,new Item.Properties()));

    public static final DeferredItem<AxeItem> POWERED_NETHERITE_AXE = AXE_ITEMS.register  ("powered_netherite_axe",
            () -> new AxeItem(CustomMaterialsInit.POWERED_NETHERITE_MATERIAL,11,2.8f, new Item.Properties()));

    public static final DeferredItem<AxeItem> REINFORCED_NETHERITE_AXE = AXE_ITEMS.register  ("reinforced_netherite_axe",
            () -> new AxeItem(CustomMaterialsInit.REINFORCED_NETHERITE_MATERIAL,12,3.5f, new Item.Properties()));

    public static final DeferredItem<AxeItem> SUPER_NETHERITE_AXE = AXE_ITEMS.register  ("super_netherite_axe",
            () -> new AxeItem(CustomMaterialsInit.SUPER_NETHERITE_MATERIAL,14,3.8f, new Item.Properties()));

}