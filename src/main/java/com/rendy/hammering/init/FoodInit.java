package com.rendy.hammering.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodInit {

    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(1.25F).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300,3), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 300), 1F)
            .build();

    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(1.25F).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 450,3), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 450, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 450), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 450), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 450, 10), 1F)
            .build();

    public static final FoodProperties NETHERITE_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(1.45F).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600,4), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600,3), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 600), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 10, 2), 0.01F)
            .build();

    public static final FoodProperties POWERED_NETHERITE_APPLE = new FoodProperties.Builder().nutrition(10).saturationMod(1.55F).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200,6), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200,2), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 1200), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 10, 5), 0.01F)
            .build();

    public static final FoodProperties REINFORCED_NETHERITE_APPLE = new FoodProperties.Builder().nutrition(14).saturationMod(1.75F).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000,8), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 6000,2), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 6000), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 10, 3), 0.01F)
            .build();

    public static final FoodProperties SUPER_NETHERITE_APPLE = new FoodProperties.Builder().nutrition(20).saturationMod(2.35F).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 24000,10), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 24000,5), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 24000, 1), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 24000), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 24000), 1F)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 24000, 666), 1F)
            .build();

}
