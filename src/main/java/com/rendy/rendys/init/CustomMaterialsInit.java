package com.rendy.rendys.init;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.TierSortingRegistry;

import java.util.List;

import static com.rendy.rendys.Rendys.MOD_ID;

public class CustomMaterialsInit {
        private CustomMaterialsInit() {
        }

        public static Tier getCopperMaterial(){return COPPER_MATERIAL;}
        private static Tier getEmeraldMaterial() {return EMERALD_MATERIAL;}
        public static Tier getPoweredNetheriteMaterial() {return POWERED_NETHERITE_MATERIAL;}
        public static Tier getReinforcedNetheriteMaterial() {
                return REINFORCED_NETHERITE_MATERIAL;
        }
        public static Tier getSuperNetheriteMaterial() {
                return SUPER_NETHERITE_MATERIAL;
        }

        protected static final Tier COPPER_MATERIAL = TierSortingRegistry.registerTier(TiersInit.COPPER_TIER, new ResourceLocation("minecraft","copper"), List.of(Tiers.STONE), List.of(Tiers.IRON));

        protected static final Tier EMERALD_MATERIAL = TierSortingRegistry.registerTier(TiersInit.EMERALD_TIER, new ResourceLocation("minecraft","emerald"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
        protected static final Tier POWERED_NETHERITE_MATERIAL =
                TierSortingRegistry.registerTier
                        (TiersInit.POWERED_NETHERITE_TIER,
                                new ResourceLocation(MOD_ID,"powered_netherite_material"),
                                List.of(Tiers.NETHERITE),
                                List.of(getReinforcedNetheriteMaterial()));

        protected static final Tier REINFORCED_NETHERITE_MATERIAL =
                TierSortingRegistry.registerTier
                        (TiersInit.REINFORCED_NETHERITE_TIER,new ResourceLocation(MOD_ID,"reinforced_netherite_material"),List.of(POWERED_NETHERITE_MATERIAL),List.of(getSuperNetheriteMaterial()));

        protected static final Tier SUPER_NETHERITE_MATERIAL =
                TierSortingRegistry.registerTier
                        (TiersInit.SUPER_NETHERITE_TIER,new ResourceLocation(MOD_ID,"super_netherite_material"),
                                List.of(REINFORCED_NETHERITE_MATERIAL),
                                List.of());

}