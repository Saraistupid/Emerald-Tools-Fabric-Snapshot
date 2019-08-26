/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.e404nnf.emeraldtools.materials.armors;

import me.e404nnf.emeraldtools.main.Main;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 *
 * @author E404NNF
 */
public class DiamondArmor implements ArmorMaterial{

	private static final int[] BASE_DURABILITY = new int[]{1, 2, 3, 1};
	private final int durabilityMultiplier = 33;
	   private final int[] protectionAmounts= new int[]{3, 9, 12, 5};
	@Override
	public int getDurability(EquipmentSlot var1) {
		// TODO Auto-generated method stub
		return BASE_DURABILITY[var1.getEntitySlotId()] * this.durabilityMultiplier;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot var1) {
		// TODO Auto-generated method stub
		return this.protectionAmounts[var1.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 14;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(Main.EMERALD_QUARTZ);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "emerald";
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return 1;
	}


}

