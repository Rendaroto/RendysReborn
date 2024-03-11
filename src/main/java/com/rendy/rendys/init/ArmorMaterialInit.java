package com.rendy.rendys.init;

import com.rendy.rendys.Rendys;
import com.rendy.rendys.init.item.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ArmorMaterialInit implements ArmorMaterial {
    COPPER("copper", 8, new int[]{ 1, 5, 4, 1}, 10,SoundEvents.ARMOR_EQUIP_IRON, 1f, 0.1f, () -> Ingredient.of(Items.COPPER_INGOT)),
    EMERALD("emerald", 43, new int[]{ 4, 9, 7, 4 }, 25,SoundEvents.ARMOR_EQUIP_DIAMOND, 2.2f, 0.2f, () -> Ingredient.of(Items.EMERALD)),
    POWERED_NETHERITE("powered_netherite", 53, new int[]{ 6, 11, 9, 6 }, 35,SoundEvents.ARMOR_EQUIP_NETHERITE, 3.1f, 0.28f, () -> Ingredient.of(ItemInit.POWERED_NETHERITE_INGOT)),
    REINFORCED_NETHERITE("reinforced_netherite", 58, new int[]{ 8, 13, 11, 8 }, 45,SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.35f, () -> Ingredient.of(ItemInit.REINFORCED_NETHERITE_INGOT)),
    SUPER_NETHERITE("super_netherite", 65, new int[]{ 10, 16, 14, 10 }, 55,SoundEvents.ARMOR_EQUIP_NETHERITE, 5f, 0.4f, () -> Ingredient.of(ItemInit.SUPER_NETHERITE_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 10, 15, 15, 12 };

    ArmorMaterialInit(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Rendys.MOD_ID + ':' + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}