package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShovelInit {
    public final static DeferredRegister.Items SHOVEL_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<ShovelItem> EMERLAD_PICKAXE = SHOVEL_ITEMS.register  ("emerald_shovel",
            () -> new ShovelItem(CustomMaterialsInit.EMERALD_MATERIAL,1,-2.8f,new Item.Properties()));

    public static final DeferredItem<ShovelItem> POWERED_NETHERITE_PICKAXE = SHOVEL_ITEMS.register  ("powered_netherite_shovel",
            () -> new ShovelItem(CustomMaterialsInit.POWERED_NETHERITE_MATERIAL,1,-2.8f, new Item.Properties()));

    public static final DeferredItem<ShovelItem> REINFORCED_NETHERITE_PICKAXE = SHOVEL_ITEMS.register  ("reinforced_netherite_shovel",
            () -> new ShovelItem(CustomMaterialsInit.REINFORCED_NETHERITE_MATERIAL,1,-2.8f, new Item.Properties()));

    public static final DeferredItem<ShovelItem> SUPER_NETHERITE_PICKAXE = SHOVEL_ITEMS.register  ("super_netherite_shovel",
            () -> new ShovelItem(CustomMaterialsInit.SUPER_NETHERITE_MATERIAL,1,-2.8f, new Item.Properties()));

}