package com.rendy.hammering;

import com.mojang.logging.LogUtils;
import com.rendy.hammering.events.HammerEvents;
import com.rendy.hammering.hammers.HammerInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Hammering.MOD_ID)
public class Hammering
{
    public static final String MOD_ID = "hammering";
    public static final DeferredRegister<CreativeModeTab> TAB_REG       = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MOD_ID);
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> VANILLA_PLUS_TAB = TAB_REG.register(MOD_ID, () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 1).withTabsBefore(
            CreativeModeTabs.SEARCH).icon(() -> new ItemStack(HammerInit.NETHERITE_HAMMER.get())).displayItems((config, builder) -> {
        builder.accept(HammerInit.WOODEN_HAMMER.get());
        builder.accept(HammerInit.STONE_HAMMER.get());
        builder.accept(HammerInit.IRON_HAMMER.get());
        builder.accept(HammerInit.GOLDEN_HAMMER.get());
        builder.accept(HammerInit.DIAMOND_HAMMER.get());
        builder.accept(HammerInit.NETHERITE_HAMMER.get());
    }).build());


    public Hammering()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        LOGGER.info("KTM");
        LOGGER.info(modEventBus.toString());

        Mod.EventBusSubscriber.Bus.FORGE.bus().get().register(HammerEvents.class);
        Mod.EventBusSubscriber.Bus.MOD.bus().get().register(Hammering.class);

        HammerInit.HAMMER_ITEMS.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        TAB_REG.register(modEventBus);

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
