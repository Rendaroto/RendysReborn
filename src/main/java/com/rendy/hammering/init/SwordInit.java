package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SwordInit {
    public final static DeferredRegister.Items SWORD_ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<SwordItem> EMERLAD_SWORD = SWORD_ITEMS.register  ("emerald_sword",
            () -> new SwordItem(TiersInit.EMERALD_TIER,6,4.8f,new Item.Properties()));

    public static final DeferredItem<SwordItem> POWERED_NETHERITE_SWORD = SWORD_ITEMS.register  ("powered_netherite_sword",
            () -> new SwordItem(TiersInit.POWERED_NETHERITE_TIER,7,5.8f, new Item.Properties().fireResistant()));

    public static final DeferredItem<SwordItem> REINFORCED_NETHERITE_SWORD = SWORD_ITEMS.register  ("reinforced_netherite_sword",
            () -> new SwordItem(TiersInit.REINFORCED_NETHERITE_TIER,9,7.8f, new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final DeferredItem<SwordItem> SUPER_NETHERITE_SWORD = SWORD_ITEMS.register  ("super_netherite_sword",
            () -> new SwordItem(TiersInit.SUPER_NETHERITE_TIER,11,9.8f, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

}
