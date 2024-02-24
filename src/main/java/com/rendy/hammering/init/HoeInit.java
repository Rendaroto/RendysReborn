package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HoeInit {
    public final static DeferredRegister.Items HOE_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<HoeItem> EMERLAD_HOE = HOE_ITEMS.register  ("emerald_hoe",
            () -> new HoeItem(CustomMaterialsInit.EMERALD_MATERIAL,1,1f,new Item.Properties()));

    public static final DeferredItem<HoeItem> POWERED_NETHERITE_HOE = HOE_ITEMS.register  ("powered_netherite_hoe",
            () -> new HoeItem(CustomMaterialsInit.POWERED_NETHERITE_MATERIAL,1,1f, new Item.Properties()));

    public static final DeferredItem<HoeItem> REINFORCED_NETHERITE_HOE = HOE_ITEMS.register  ("reinforced_netherite_hoe",
            () -> new HoeItem(CustomMaterialsInit.REINFORCED_NETHERITE_MATERIAL,1,1f, new Item.Properties()));

    public static final DeferredItem<HoeItem> SUPER_NETHERITE_HOE = HOE_ITEMS.register  ("super_netherite_hoe",
            () -> new HoeItem(CustomMaterialsInit.SUPER_NETHERITE_MATERIAL,1,1f, new Item.Properties()));

}
