package com.rendy.rendys.init.item;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.TiersInit;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AxeInit {
    public final static DeferredRegister.Items AXE_ITEMS = DeferredRegister.createItems(Rendys.MOD_ID);

    public static final DeferredItem<AxeItem> COPPER_AXE = AXE_ITEMS.register  ("copper_axe",
            () -> new AxeItem(TiersInit.COPPER_TIER,8,-2.6f,new Item.Properties()));
    public static final DeferredItem<AxeItem> EMERLAD_AXE = AXE_ITEMS.register  ("emerald_axe",
            () -> new AxeItem(TiersInit.EMERALD_TIER,8,-2.6f,new Item.Properties()));

    public static final DeferredItem<AxeItem> POWERED_NETHERITE_AXE = AXE_ITEMS.register  ("powered_netherite_axe",
            () -> new AxeItem(TiersInit.POWERED_NETHERITE_TIER,11,-2.8f, new Item.Properties().fireResistant()));

    public static final DeferredItem<AxeItem> REINFORCED_NETHERITE_AXE = AXE_ITEMS.register  ("reinforced_netherite_axe",
            () -> new AxeItem(TiersInit.REINFORCED_NETHERITE_TIER,12,-3.5f, new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final DeferredItem<AxeItem> SUPER_NETHERITE_AXE = AXE_ITEMS.register  ("super_netherite_axe",
            () -> new AxeItem(TiersInit.SUPER_NETHERITE_TIER,14,-3.8f, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));

}