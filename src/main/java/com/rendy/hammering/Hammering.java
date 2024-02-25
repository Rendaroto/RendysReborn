package com.rendy.hammering;

import com.mojang.logging.LogUtils;
import com.rendy.hammering.events.HammerEvents;
import com.rendy.hammering.init.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

import static com.rendy.hammering.ui.CreativeTab.TAB_REG;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Hammering.MOD_ID)
public class Hammering
{
    public static final String MOD_ID = "hammering";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Hammering(IEventBus modEventBus)
    {
        //INIZIO LOG
        LOGGER.info("Inizio loading");

        modEventBus.register(HammerEvents.class);

        //ITEMS
        ItemInit.ITEMS.register(modEventBus);

        //TOOLS
        PickaxeInit.PICKAXES_ITEMS.register(modEventBus);
        SwordInit.SWORD_ITEMS.register(modEventBus);
        AxeInit.AXE_ITEMS.register(modEventBus);
        ShovelInit.SHOVEL_ITEMS.register(modEventBus);
        HoeInit.HOE_ITEMS.register(modEventBus);

        //HAMMERS
        HammerInit.HAMMER_ITEMS.register(modEventBus);

        //CREATIVE_TAB
        TAB_REG.register(modEventBus);

        //LOG
        LOGGER.info("Fine loading");

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HAMMERING COMMON SETUP");
    }

}
