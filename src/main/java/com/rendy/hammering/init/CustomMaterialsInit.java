package com.rendy.hammering.init;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.TierSortingRegistry;

import java.util.List;

import static com.rendy.hammering.Hammering.MOD_ID;
import static net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE;

public class CustomMaterialsInit {
    private CustomMaterialsInit() {
    }

    protected static final Tier EMERALD_MATERIAL =
            TierSortingRegistry.registerTier
                    (new SimpleTier(3, 2945,10f,4.3F,25, MINEABLE_WITH_PICKAXE,() -> Ingredient.of(Items.EMERALD)),
                            new ResourceLocation(MOD_ID,"emerald_material"),
                            List.of(Tiers.DIAMOND),
                            List.of(Tiers.NETHERITE));
    protected static final Tier POWERED_NETHERITE_MATERIAL =
            TierSortingRegistry.registerTier
                    (new SimpleTier(4, Tiers.NETHERITE.getUses() + Tiers.DIAMOND.getUses(), 16f,5.3F,20, MINEABLE_WITH_PICKAXE,() -> Ingredient.of(Items.EMERALD)),
                            new ResourceLocation(MOD_ID,"powered_netherite_material"),
                            List.of(Tiers.NETHERITE),
                            List.of());

    protected static final Tier REINFORCED_NETHERITE_MATERIAL =
            TierSortingRegistry.registerTier
                    (new SimpleTier(5, Tiers.NETHERITE.getUses() * 2, 12f,6.3F,35, MINEABLE_WITH_PICKAXE,() -> Ingredient.of(Items.EMERALD)),
                            new ResourceLocation(MOD_ID,"reinforced_netherite_material"),
                            List.of(POWERED_NETHERITE_MATERIAL),
                            List.of());

    protected static final Tier SUPER_NETHERITE_MATERIAL =
            TierSortingRegistry.registerTier
                    (new SimpleTier(5, (Tiers.NETHERITE.getUses() + EMERALD_MATERIAL.getUses())*2, 18f,7.3F,50, MINEABLE_WITH_PICKAXE,() -> Ingredient.of(Items.EMERALD)),
                            new ResourceLocation(MOD_ID,"super_netherite_material"),
                            List.of(REINFORCED_NETHERITE_MATERIAL),
                            List.of());

}