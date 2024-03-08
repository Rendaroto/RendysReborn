package com.rendy.rendys.datagen;

import com.mojang.logging.LogUtils;
import com.rendy.rendys.Rendys;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Rendys.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        LOGGER.info("Inizio DataGen");

        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        LOGGER.info("Inizio Tag");

        BlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(), new BlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(), new TagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter() , existingFileHelper));

        //LOGGER.info("Inizio Trims");
        //generator.addProvider(event.includeClient(), new ModelGenerator(packOutput, existingFileHelper));

    }
}