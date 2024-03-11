package com.rendy.rendys.items;

import com.google.common.collect.ImmutableMap;
import com.rendy.rendys.init.ArmorMaterialInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArmorItemEffects extends ArmorItem{


    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>())
                    .put(ArmorMaterialInit.EMERALD,
                            new ArrayList<>() {{
                                add(new MobEffectInstance(MobEffects.LUCK, 200, 2, false, true, false));
                            }})
                    .put(ArmorMaterialInit.POWERED_NETHERITE, new ArrayList<>(){{
                        add(new MobEffectInstance (MobEffects.MOVEMENT_SPEED, 200, 0,false,false, true));}})
                    .put(ArmorMaterialInit.REINFORCED_NETHERITE,
                            new ArrayList<>(){{
                                add(new MobEffectInstance (MobEffects.MOVEMENT_SPEED, 200, 0,false,false, true));
                                add(new MobEffectInstance (MobEffects.DAMAGE_RESISTANCE, 200, 0,false,false, true));
                    }})
                    .put(ArmorMaterialInit.SUPER_NETHERITE,
                            new ArrayList<>(){{
                                add(new MobEffectInstance (MobEffects.MOVEMENT_SPEED, 200, 0,false,false, true));
                                add(new MobEffectInstance (MobEffects.DAMAGE_RESISTANCE, 200, 0,false,false, true));
                                add(new MobEffectInstance (MobEffects.FIRE_RESISTANCE, 200, 0,false,false, true));
                                add(new MobEffectInstance (MobEffects.GLOWING, 200, 0,false,false, true));
                    }}).build();

    public ArmorItemEffects(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @SuppressWarnings(value = "Deprecated")
    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapStatusEffect = entry.getValue();

                for(MobEffectInstance effect : mapStatusEffect){
                    if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                        addStatusEffectForMaterial(player, mapArmorMaterial, effect);
                    }
                }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}