package com.rendy.rendys.datagen;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.item.ItemInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class TagGenerator extends ItemTagsProvider {

    public TagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Rendys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                     ItemInit.COPPER_HELMET.get(),
                     ItemInit.COPPER_CHESTPLATE.get(),
                     ItemInit.COPPER_LEGGINGS.get(),
                     ItemInit.COPPER_BOOTS.get(),
                        ItemInit.EMERALD_HELMET.get(),
                        ItemInit.EMERALD_CHESTPLATE.get(),
                        ItemInit.EMERALD_LEGGINGS.get(),
                        ItemInit.EMERALD_BOOTS.get(),
                        ItemInit.POWERED_NETHERITE_HELMET.get(),
                        ItemInit.POWERED_NETHERITE_CHESTPLATE.get(),
                        ItemInit.POWERED_NETHERITE_LEGGINGS.get(),
                        ItemInit.POWERED_NETHERITE_BOOTS.get(),
                        ItemInit.REINFORCED_NETHERITE_HELMET.get(),
                        ItemInit.REINFORCED_NETHERITE_CHESTPLATE.get(),
                        ItemInit.REINFORCED_NETHERITE_LEGGINGS.get(),
                        ItemInit.REINFORCED_NETHERITE_BOOTS.get(),
                        ItemInit.SUPER_NETHERITE_HELMET.get(),
                        ItemInit.SUPER_NETHERITE_CHESTPLATE.get(),
                        ItemInit.SUPER_NETHERITE_LEGGINGS.get(),
                        ItemInit.SUPER_NETHERITE_BOOTS.get()
                );
        this.tag(ItemTags.PIGLIN_FOOD)
                .add(
                        ItemInit.DIAMOND_APPLE.get(),
                        ItemInit.EMERALD_APPLE.get(),
                        ItemInit.NETHERITE_APPLE.get(),
                        ItemInit.POWERED_NETHERITE_APPLE.get(),
                        ItemInit.REINFORCED_NETHERITE_APPLE.get(),
                        ItemInit.SUPER_NETHERITE_APPLE.get()
                );
        this.tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(
                        ItemInit.POWERED_NETHERITE_INGOT.get(),
                        ItemInit.REINFORCED_NETHERITE_INGOT.get(),
                        ItemInit.SUPER_NETHERITE_INGOT.get()
                );
    }
}