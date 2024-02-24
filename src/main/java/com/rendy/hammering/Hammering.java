package com.rendy.hammering;

import com.mojang.logging.LogUtils;
import com.rendy.hammering.events.HammerEvents;
import com.rendy.hammering.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import static com.rendy.hammering.ui.CreativeTab.TAB_REG;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Hammering.MOD_ID)
public class Hammering
{
    public static final String MOD_ID = "hammering";
    private static final Logger LOGGER = LogUtils.getLogger();

<<<<<<< HEAD
    public Hammering(IEventBus modEventBus)
=======
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HAMMERING_TAB = TAB_REG.register(MOD_ID, () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 1).withTabsBefore(
            CreativeModeTabs.SEARCH).icon(() -> new ItemStack(HammerInit.NETHERITE_HAMMER.get())).displayItems((config, builder) -> {
        builder.accept(HammerInit.WOODEN_HAMMER.get());
        builder.accept(HammerInit.STONE_HAMMER.get());
        builder.accept(HammerInit.IRON_HAMMER.get());
        builder.accept(HammerInit.GOLDEN_HAMMER.get());
        builder.accept(HammerInit.DIAMOND_HAMMER.get());
        builder.accept(HammerInit.NETHERITE_HAMMER.get());
    }).build());


    public Hammering()
>>>>>>> dd970d9a1e156e702056c445144c6e93fb85c136
    {
        //INIZIO LOG
        LOGGER.info("Inizio loading");

<<<<<<< HEAD
        NeoForge.EVENT_BUS.register(HammerEvents.class);

        //ITEMS
        ItemInit.ITEMS.register(modEventBus);
=======
        LOGGER.info("KTM");
        //LOGGER.info(modEventBus.toString());

        Mod.EventBusSubscriber.Bus.FORGE.bus().get().register(HammerEvents.class);
>>>>>>> dd970d9a1e156e702056c445144c6e93fb85c136

        //TOOLS
        PickaxeInit.PICKAXES_ITEMS.register(modEventBus);
        SwordInit.SWORD_ITEMS.register(modEventBus);
        AxeInit.AXE_ITEMS.register(modEventBus);
        ShovelInit.SHOVEL_ITEMS.register(modEventBus);
        HoeInit.HOE_ITEMS.register(modEventBus);

        //HAMMERS
        HammerInit.HAMMER_ITEMS.register(modEventBus);
<<<<<<< HEAD

        //CREATIVE_TAB
=======
        //NeoForge.EVENT_BUS.register(this);
>>>>>>> dd970d9a1e156e702056c445144c6e93fb85c136
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
