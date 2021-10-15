package com.johleb.originmobmod.entity.type;

import com.johleb.originmobmod.OriginMM;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, OriginMM.MOD_ID);
	public static final RegistryObject<EntityType<TyAngel>> ANGEL = ENTITY_TYPES
			.register("angel", () -> EntityType.Builder.<TyAngel>of(TyAngel::new, MobCategory.CREATURE).sized(0.6f, 1.95f).build(new ResourceLocation(OriginMM.MOD_ID, "angel").toString()));

}
