package com.rendy.hammering.init;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.tags.BlockTags.NEEDS_DIAMOND_TOOL;

public class TiersInit {

    public static final Tier EMERALD_TIER = new SimpleTier(3, 2945,10f,4.3F,25, NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items.EMERALD));
    public static final Tier POWERED_NETHERITE_TIER = new SimpleTier(4, Tiers.NETHERITE.getUses() + Tiers.DIAMOND.getUses(), 16f,5.3F,20, NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemInit.POWERED_NETHERITE_INGOT));
    public static final Tier REINFORCED_NETHERITE_TIER = new SimpleTier(5, Tiers.NETHERITE.getUses() * 2, 12f,6.3F,35, NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ItemInit.REINFORCED_NETHERITE_INGOT));
    public static final Tier SUPER_NETHERITE_TIER = new SimpleTier(5, (Tiers.NETHERITE.getUses() + EMERALD_TIER.getUses())*2, 18f,7.3F,50, NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemInit.SUPER_NETHERITE_INGOT));

}
