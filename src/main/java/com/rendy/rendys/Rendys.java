package com.rendy.rendys;

import com.mojang.logging.LogUtils;
import com.rendy.rendys.datagen.DataGenerators;
import com.rendy.rendys.events.HammerEvents;
import com.rendy.rendys.init.item.*;
import com.rendy.rendys.ui.CreativeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Rendys.MOD_ID)
public class Rendys
{
    public static final String MOD_ID = "rendys";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Rendys(IEventBus modEventBus)
    {
        //INIZIO LOG
        LOGGER.info("Inizio loading");

        NeoForge.EVENT_BUS.register(HammerEvents.class);

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
        CreativeTab.TAB_REG.register(modEventBus);

        //LOG
        LOGGER.info("Fine loading");

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HAMMERING COMMON SETUP");
    }

}
