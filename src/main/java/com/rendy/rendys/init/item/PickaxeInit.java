package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.TiersInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class PickaxeInit {

    public final static DeferredRegister.Items PICKAXES_ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = PICKAXES_ITEMS.register  ("copper_pickaxe",
            () -> new PickaxeItem(TiersInit.COPPER_TIER,1,-2.8f,new Item.Properties()));
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = PICKAXES_ITEMS.register  ("emerald_pickaxe",
            () -> new PickaxeItem(TiersInit.EMERALD_TIER,1,-2.8f,new Item.Properties()));

    public static final DeferredItem<PickaxeItem> POWERED_NETHERITE_PICKAXE = PICKAXES_ITEMS.register  ("powered_netherite_pickaxe",
            () -> new PickaxeItem(TiersInit.POWERED_NETHERITE_TIER,1,-2.8f, new Item.Properties().fireResistant()));

    public static final DeferredItem<PickaxeItem> REINFORCED_NETHERITE_PICKAXE = PICKAXES_ITEMS.register  ("reinforced_netherite_pickaxe",
            () -> new PickaxeItem(TiersInit.REINFORCED_NETHERITE_TIER,1,-2.8f, new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final DeferredItem<PickaxeItem> SUPER_NETHERITE_PICKAXE = PICKAXES_ITEMS.register  ("super_netherite_pickaxe",
            () -> new PickaxeItem(TiersInit.SUPER_NETHERITE_TIER,1,-2.8f, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

}
