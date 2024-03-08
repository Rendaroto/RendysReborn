package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.TiersInit;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HoeInit {
    public final static DeferredRegister.Items HOE_ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<HoeItem> COPPER_HOE = HOE_ITEMS.register  ("copper_hoe",
            () -> new HoeItem(TiersInit.COPPER_TIER,1,-1f,new Item.Properties()));
    public static final DeferredItem<HoeItem> EMERLAD_HOE = HOE_ITEMS.register  ("emerald_hoe",
            () -> new HoeItem(TiersInit.EMERALD_TIER,1,-1f,new Item.Properties()));

    public static final DeferredItem<HoeItem> POWERED_NETHERITE_HOE = HOE_ITEMS.register  ("powered_netherite_hoe",
            () -> new HoeItem(TiersInit.POWERED_NETHERITE_TIER,1,-1f, new Item.Properties().fireResistant()));

    public static final DeferredItem<HoeItem> REINFORCED_NETHERITE_HOE = HOE_ITEMS.register  ("reinforced_netherite_hoe",
            () -> new HoeItem(TiersInit.REINFORCED_NETHERITE_TIER,1,-1f, new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final DeferredItem<HoeItem> SUPER_NETHERITE_HOE = HOE_ITEMS.register  ("super_netherite_hoe",
            () -> new HoeItem(TiersInit.SUPER_NETHERITE_TIER,1,-1f, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

}
