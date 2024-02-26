package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    public final static DeferredRegister.Items ITEMS = DeferredRegister.createItems(Hammering.MOD_ID);

    public static final DeferredItem<Item> POWERED_NETHERITE_INGOT = ITEMS.register("powered_netherite_ingot",() -> new Item(new Item.Properties().stacksTo(32).fireResistant()));
    public static final DeferredItem<Item> REINFORCED_NETHERITE_INGOT = ITEMS.register("reinforced_netherite_ingot",() -> new Item(new Item.Properties().stacksTo(32).fireResistant()));
    public static final DeferredItem<Item> SUPER_NETHERITE_INGOT = ITEMS.register("super_netherite_ingot",() -> new Item(new Item.Properties().stacksTo(32).fireResistant()));

    public static final DeferredItem<Item> NETHERSTAR_DUST = ITEMS.register("netherstar_dust",() -> new Item(new Item.Properties().stacksTo(64).fireResistant()));

}
