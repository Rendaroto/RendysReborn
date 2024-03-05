package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.TiersInit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SwordInit {
    public final static DeferredRegister.Items SWORD_ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<SwordItem> COPPER_SWORD = SWORD_ITEMS.register  ("copper_sword",
            () -> new SwordItem(TiersInit.COPPER_TIER,2,-2.8f,new Item.Properties()));
    public static final DeferredItem<SwordItem> EMERLAD_SWORD = SWORD_ITEMS.register  ("emerald_sword",
            () -> new SwordItem(TiersInit.EMERALD_TIER,6,-1.8f,new Item.Properties()));

    public static final DeferredItem<SwordItem> POWERED_NETHERITE_SWORD = SWORD_ITEMS.register  ("powered_netherite_sword",
            () -> new SwordItem(TiersInit.POWERED_NETHERITE_TIER,7,-1.45f, new Item.Properties().fireResistant()));

    public static final DeferredItem<SwordItem> REINFORCED_NETHERITE_SWORD = SWORD_ITEMS.register  ("reinforced_netherite_sword",
            () -> new SwordItem(TiersInit.REINFORCED_NETHERITE_TIER,9,-1.2f, new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final DeferredItem<SwordItem> SUPER_NETHERITE_SWORD = SWORD_ITEMS.register  ("super_netherite_sword",
            () -> new SwordItem(TiersInit.SUPER_NETHERITE_TIER,11,-0.9f, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

}
