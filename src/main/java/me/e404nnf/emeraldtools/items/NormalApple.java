package me.e404nnf.emeraldtools.items;

import net.minecraft.entity.*;
import net.minecraft.entity.effect.*;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class NormalApple extends Item{

	public NormalApple(Settings settings) {
		super(new Item.Settings().food((new  FoodComponent.Builder().hunger(10).saturationModifier(.5f).alwaysEdible().build())));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ItemStack finishUsing(ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1) {
		livingEntity_1.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(10), 100, 1));
		livingEntity_1.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1));
		return this.isFood() ? livingEntity_1.eatFood(world_1, itemStack_1) : itemStack_1;
		
	}
	
	

}
