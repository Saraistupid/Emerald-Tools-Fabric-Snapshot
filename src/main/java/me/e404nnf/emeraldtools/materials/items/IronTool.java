package me.e404nnf.emeraldtools.materials.items;

import me.e404nnf.emeraldtools.main.Main;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronTool implements ToolMaterial{
	
	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 1170;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return 4.5F;
	}

	@Override
	public int getMiningLevel() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 19;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(Main.EMERALD_IRON);
	}

    @Override
    public float getMiningSpeed() {
        return 11.25F;
    }

}
