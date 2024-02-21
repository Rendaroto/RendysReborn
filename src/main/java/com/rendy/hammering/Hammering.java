package com.rendy.hammering;

import com.mojang.logging.LogUtils;
import com.rendy.hammering.events.HammerEvents;
import com.rendy.hammering.util.ItemRegisterUtil;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import static com.rendy.hammering.init.HammerInit.WOODEN_HAMMER;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Hammering.MOD_ID)
public class Hammering
{
    public static final String MOD_ID = "hammering";
    private static final Logger LOGGER = LogUtils.getLogger();


    public Hammering(IEventBus modEventBus)
    {
        Mod.EventBusSubscriber.Bus.FORGE.bus().get().register(HammerEvents.class);
        ItemRegisterUtil.HAMMER_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        LOGGER.info("Kittemuort");

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HAMMERING COMMON SETUP");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("Hammering mod started");
    }

}
