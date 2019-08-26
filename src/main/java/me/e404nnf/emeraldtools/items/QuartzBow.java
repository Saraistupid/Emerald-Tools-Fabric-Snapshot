package me.e404nnf.emeraldtools.items;

import java.util.function.Predicate;

import me.e404nnf.emeraldtools.main.Main;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.item.*;
import net.minecraft.sound.*;
import net.minecraft.stat.Stats;
import net.minecraft.util.*;
import net.minecraft.world.World;
        
public class QuartzBow extends RangedWeaponItem {
	  public QuartzBow(Item.Settings item$Settings_1) {
		    super(item$Settings_1);
		    addPropertyGetter(new Identifier("pull"), (itemStack_1, world_1, livingEntity_1) -> {

		          
		          if (livingEntity_1 == null) {
		            return 0.0F;
		          }
		          if (livingEntity_1.getActiveItem().getItem() != Main.QUARTZ_EMERALD_BOW) {
		            return 0.0F;
		          }
		          
		          return (itemStack_1.getMaxUseTime() - livingEntity_1.getItemUseTimeLeft()) / 20.0F;
		        });
		    
		    addPropertyGetter(new Identifier("pulling"), (itemStack_1, world_1, livingEntity_1) -> 
		        
		        (livingEntity_1 != null && livingEntity_1.isUsingItem() && livingEntity_1.getActiveItem() == itemStack_1) ? 1.0F : 0.0F);
		  }


		  
		  public void onStoppedUsing(ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1, int int_1) {
		    if (!(livingEntity_1 instanceof PlayerEntity)) {
		      return;
		    }
		    
		    PlayerEntity playerEntity_1 = (PlayerEntity)livingEntity_1;
		    boolean boolean_1 = (playerEntity_1.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, itemStack_1) > 0);
		    ItemStack itemStack_2 = playerEntity_1.getArrowType(itemStack_1);
		    
		    if (itemStack_2.isEmpty() && !boolean_1) {
		      return;
		    }
		    
		    if (itemStack_2.isEmpty()) {
		      itemStack_2 = new ItemStack(Items.ARROW);
		    }
		    
		    int int_2 = getMaxUseTime(itemStack_1) - int_1;
		    float float_1 = getPullProgress(int_2);
		    if (float_1 < 0.1D) {
		      return;
		    }
		    
		    boolean boolean_2 = (boolean_1 && itemStack_2.getItem() == Items.ARROW);
		    if (!world_1.isClient) {
		      ArrowItem arrowItem_1 = (ArrowItem)((itemStack_2.getItem() instanceof ArrowItem) ? itemStack_2.getItem() : Items.ARROW);
		      
		      ProjectileEntity projectileEntity_1 = arrowItem_1.createArrow(world_1, itemStack_2, playerEntity_1);
		      projectileEntity_1.setProperties(playerEntity_1, playerEntity_1.pitch, playerEntity_1.yaw, 0.0F, float_1 * 3.0F, 1.0F);
            projectileEntity_1.setDamage(projectileEntity_1.getDamage() * 0.7D + 0.7D);
		      if (float_1 == 1.0F) {
		        projectileEntity_1.setCritical(true);
		      }
		      int int_3 = EnchantmentHelper.getLevel(Enchantments.POWER, itemStack_1);
		      if (int_3 > 0) {
		        projectileEntity_1.setDamage(projectileEntity_1.getDamage() + int_3 * 0.5D + 0.5D);
		      }
		      int int_4 = EnchantmentHelper.getLevel(Enchantments.PUNCH, itemStack_1);
		      if (int_4 > 0) {
		        projectileEntity_1.method_7449(int_4);
		      }
		      if (EnchantmentHelper.getLevel(Enchantments.FLAME, itemStack_1) > 0) {
		        projectileEntity_1.setOnFireFor(100);
		      }
		      itemStack_1.damage(1, playerEntity_1, playerEntity_2 -> playerEntity_2.sendToolBreakStatus(playerEntity_1.getActiveHand()));
		      
		      if (boolean_2 || (playerEntity_1.abilities.creativeMode && (itemStack_2.getItem() == Items.SPECTRAL_ARROW || itemStack_2.getItem() == Items.TIPPED_ARROW))) {
		        projectileEntity_1.pickupType = ProjectileEntity.PickupPermission.CREATIVE_ONLY;
		      }
		      
		      world_1.spawnEntity(projectileEntity_1);
		    } 
		    
		    world_1.playSound(null, playerEntity_1.x, playerEntity_1.y, playerEntity_1.z, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (RANDOM.nextFloat() * 0.4F + 1.2F) + float_1 * 0.5F);
		    if (!boolean_2 && !playerEntity_1.abilities.creativeMode) {
		      itemStack_2.decrement(1);
		      if (itemStack_2.isEmpty())
		      {
		        playerEntity_1.inventory.removeOne(itemStack_2);
		      }
		    } 
		    playerEntity_1.incrementStat(Stats.USED.getOrCreateStat(this));
		  }
		  
		  public static float getPullProgress(int int_1) {
		    float float_1 = int_1 / 20.0F;
		    float_1 = (float_1 * float_1 + float_1 * 2.0F) / 3.0F;
		    if (float_1 > 1.0F) {
		      float_1 = 1.0F;
		    }
		    return float_1;
		  }


		  
		  public int getMaxUseTime(ItemStack itemStack_1) { return 72000; }



		  
		  public UseAction getUseAction(ItemStack itemStack_1) { return UseAction.BOW; }


		  
		  public TypedActionResult<ItemStack> use(World world_1, PlayerEntity playerEntity_1, Hand hand_1) {
		    ItemStack itemStack_1 = playerEntity_1.getStackInHand(hand_1);
		    boolean boolean_1 = !playerEntity_1.getArrowType(itemStack_1).isEmpty();
		    if (playerEntity_1.abilities.creativeMode || boolean_1) {
		      playerEntity_1.setCurrentHand(hand_1);
		      return new TypedActionResult(ActionResult.SUCCESS, itemStack_1);
		    } 
		    if (boolean_1) {
		      return new TypedActionResult(ActionResult.PASS, itemStack_1);
		    }
		    return new TypedActionResult(ActionResult.FAIL, itemStack_1);
		  }


		  
		  public Predicate<ItemStack> getProjectiles() { return BOW_PROJECTILES; }
}
