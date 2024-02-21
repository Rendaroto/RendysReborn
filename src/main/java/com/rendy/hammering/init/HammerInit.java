package com.rendy.hammering.init;

import com.rendy.hammering.Hammering;
import com.rendy.hammering.util.HammerItem;
import com.rendy.hammering.util.ItemRegisterUtil;
import net.minecraft.world.item.Tiers;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredItem;

@Mod(Hammering.MOD_ID)
public class HammerInit {

    public static final DeferredItem<HammerItem> WOODEN_HAMMER =
            ItemRegisterUtil.HAMMER_ITEMS.register
                    ("wooden_hammer",() -> new HammerItem(Tiers.WOOD,1,-2.8f, null));
}
