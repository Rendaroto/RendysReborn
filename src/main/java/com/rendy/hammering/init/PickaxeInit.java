package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PickaxeInit {

    public final static DeferredRegister.Items PICKAXES_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<PickaxeItem> EMERLAD_PICKAXE = PICKAXES_ITEMS.register  ("emerald_pickaxe",
            () -> new PickaxeItem(TiersInit.EMERALD_TIER,1,-2.8f,new Item.Properties()));

    public static final DeferredItem<PickaxeItem> POWERED_NETHERITE_PICKAXE = PICKAXES_ITEMS.register  ("powered_netherite_pickaxe",
            () -> new PickaxeItem(TiersInit.POWERED_NETHERITE_TIER,1,-2.8f, new Item.Properties()));

    public static final DeferredItem<PickaxeItem> REINFORCED_NETHERITE_PICKAXE = PICKAXES_ITEMS.register  ("reinforced_netherite_pickaxe",
            () -> new PickaxeItem(TiersInit.REINFORCED_NETHERITE_TIER,1,-2.8f, new Item.Properties()));

    public static final DeferredItem<PickaxeItem> SUPER_NETHERITE_PICKAXE = PICKAXES_ITEMS.register  ("super_netherite_pickaxe",
            () -> new PickaxeItem(TiersInit.SUPER_NETHERITE_TIER,1,-2.8f, new Item.Properties()));

}
