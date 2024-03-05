package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.TiersInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ShovelInit {
    public final static DeferredRegister.Items SHOVEL_ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<ShovelItem> COPPER_SHOVEL = SHOVEL_ITEMS.register  ("copper_shovel",
            () -> new ShovelItem(TiersInit.COPPER_TIER,1,-2.8f,new Item.Properties()));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = SHOVEL_ITEMS.register  ("emerald_shovel",
            () -> new ShovelItem(TiersInit.EMERALD_TIER,1,-2.8f,new Item.Properties()));

    public static final DeferredItem<ShovelItem> POWERED_NETHERITE_SHOVEL = SHOVEL_ITEMS.register  ("powered_netherite_shovel",
            () -> new ShovelItem(TiersInit.POWERED_NETHERITE_TIER,1,-2.8f, new Item.Properties()));

    public static final DeferredItem<ShovelItem> REINFORCED_NETHERITE_SHOVEL = SHOVEL_ITEMS.register  ("reinforced_netherite_shovel",
            () -> new ShovelItem(TiersInit.REINFORCED_NETHERITE_TIER,1,-2.8f, new Item.Properties().rarity(Rarity.EPIC)));

    public static final DeferredItem<ShovelItem> SUPER_NETHERITE_SHOVEL = SHOVEL_ITEMS.register  ("super_netherite_shovel",
            () -> new ShovelItem(TiersInit.SUPER_NETHERITE_TIER,1,-2.8f, new Item.Properties().rarity(Rarity.UNCOMMON)));

}