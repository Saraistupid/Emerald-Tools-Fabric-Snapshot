package me.e404nnf.emeraldtools.materials.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NormalTool implements ToolMaterial{
	
	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 780;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return 3.0F;
	}

	@Override
	public int getMiningLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(Items.EMERALD);
	}

    @Override
    public float getMiningSpeed() {
        return 7.5F;
    }

}
