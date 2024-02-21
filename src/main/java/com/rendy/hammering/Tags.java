package com.rendy.hammering;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.TagKey;
import net.neoforged.fml.common.Mod;

@Mod(Hammering.MOD_ID)
public class Tags {

    public static TagKey<Block> CAN_HAMMER = TagKey.create(Registries.BLOCK, new ResourceLocation("hammering", "can_hammer"));
    public static TagKey<Block> CAN_SHOVEL = TagKey.create(Registries.BLOCK, new ResourceLocation("hammering", "can_shovel"));

}
