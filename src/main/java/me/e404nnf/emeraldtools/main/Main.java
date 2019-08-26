package me.e404nnf.emeraldtools.main;

import me.e404nnf.emeraldtools.items.*;
import me.e404nnf.emeraldtools.materials.armors.*;
import me.e404nnf.emeraldtools.materials.items.*;
import net.fabricmc.api.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.registry.*;
import net.minecraft.entity.*;

public class Main implements ModInitializer {

    public static final SwordItem EMERALD_SWORD = new SwordItem(new NormalTool(), 0, -2.4F,new Item.Settings().group(ItemGroup.COMBAT));
    public static final Picakxe EMERALD_PICKAXE = new Picakxe(new NormalTool(), -2, -2.8F,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Axe EMERALD_AXE = new Axe(new NormalTool(), 2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Shovel EMERALD_SHOVEL = new Shovel(new NormalTool(), -2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Armor EMERALD_HELMET = new Armor(new NormalArmor(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor EMERALD_CHESTPLATE = new Armor(new NormalArmor(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor EMERALD_LEGGINGS = new Armor(new NormalArmor(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor EMERALD_BOOTS = new Armor(new NormalArmor(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final NormalApple EMERALD_APPLE = new NormalApple(new Item.Settings().group(ItemGroup.FOOD));
    public static final NormalBow EMERALD_BOW = new NormalBow(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(696));
	public static final Item EMERALD_IRON = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Armor IRON_EMERALD_HELMET = new Armor(new IronArmor(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor IRON_EMERALD_CHESTPLATE = new Armor(new IronArmor(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor IRON_EMERALD_LEGGINGS = new Armor(new IronArmor(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor IRON_EMERALD_BOOTS = new Armor(new IronArmor(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final SwordItem IRON_EMERALD_SWORD = new SwordItem(new IronTool(), 0, -2.4F,new Item.Settings().group(ItemGroup.COMBAT));
    public static final Picakxe IRON_EMERALD_PICKAXE = new Picakxe(new IronTool(), -2, -2.8F,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Axe IRON_EMERALD_AXE = new Axe(new IronTool(), 2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Shovel IRON_EMERALD_SHOVEL = new Shovel(new IronTool(), -2, -3,new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item EMERALD_QUARTZ = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final IronBow IRON_EMERALD_BOW = new IronBow(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(1044));
    public static final Armor QUARTZ_EMERALD_HELMET = new Armor(new QuartzArmor(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor QUARTZ_EMERALD_CHESTPLATE = new Armor(new QuartzArmor(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor QUARTZ_EMERALD_LEGGINGS = new Armor(new QuartzArmor(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor QUARTZ_EMERALD_BOOTS = new Armor(new QuartzArmor(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final SwordItem QUARTZ_EMERALD_SWORD = new SwordItem(new QuartzTool(), 0, -2.4F,new Item.Settings().group(ItemGroup.COMBAT));
    public static final Picakxe QUARTZ_EMERALD_PICKAXE = new Picakxe(new QuartzTool(), -2, -2.8F,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Axe QUARTZ_EMERALD_AXE = new Axe(new QuartzTool(), 2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Shovel QUARTZ_EMERALD_SHOVEL = new Shovel(new QuartzTool(), -2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final QuartzBow QUARTZ_EMERALD_BOW = new QuartzBow(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(1566));
	public static final Item EMERALD_DIAMOND = new Item(new Item.Settings().group(ItemGroup.MATERIALS));	
    public static final Armor DIAMOND_EMERALD_HELMET = new Armor(new DiamondArmor(), EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor DIAMOND_EMERALD_CHESTPLATE = new Armor(new DiamondArmor(), EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor DIAMOND_EMERALD_LEGGINGS = new Armor(new DiamondArmor(), EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Armor DIAMOND_EMERALD_BOOTS = new Armor(new DiamondArmor(), EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final SwordItem DIAMOND_EMERALD_SWORD = new SwordItem(new DiamondTool(), 0, -2.4F,new Item.Settings().group(ItemGroup.COMBAT));
    public static final Picakxe DIAMOND_EMERALD_PICKAXE = new Picakxe(new DiamondTool(), -2, -2.8F,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Axe DIAMOND_EMERALD_AXE = new Axe(new DiamondTool(), 2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final Shovel DIAMOND_EMERALD_SHOVEL = new Shovel(new DiamondTool(), -2, -3,new Item.Settings().group(ItemGroup.TOOLS));
    public static final HoeItem EMERALD_HOE = new HoeItem(new NormalTool(), 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final HoeItem IRON_EMERALD_HOE = new HoeItem(new IronTool(), 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final HoeItem QUARTZ_EMERALD_HOE = new HoeItem(new QuartzTool(), 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final HoeItem DIAMOND_EMERALD_HOE = new HoeItem(new DiamondTool(), 0, new Item.Settings().group(ItemGroup.TOOLS));

    @Override
	public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_sword"), EMERALD_SWORD);   
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_pickaxe"), EMERALD_PICKAXE);     
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_axe"), EMERALD_AXE);           
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_shovel"), EMERALD_SHOVEL);      
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_hoe"), EMERALD_HOE);  
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_helmet"), EMERALD_HELMET);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_chestplate"), EMERALD_CHESTPLATE);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_boots"), EMERALD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_apple"), EMERALD_APPLE);
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_bow"), EMERALD_BOW);
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_iron"), EMERALD_IRON); 
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_helmet"), IRON_EMERALD_HELMET);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_chestplate"), IRON_EMERALD_CHESTPLATE);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_leggings"), IRON_EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_boots"), IRON_EMERALD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_sword"), IRON_EMERALD_SWORD);   
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_pickaxe"), IRON_EMERALD_PICKAXE);     
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_axe"), IRON_EMERALD_AXE);           
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_shovel"), IRON_EMERALD_SHOVEL);   
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_hoe"), IRON_EMERALD_HOE);     
        Registry.register(Registry.ITEM, new Identifier("emerald", "iron_emerald_bow"), IRON_EMERALD_BOW);
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_quartz"), EMERALD_QUARTZ); 
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_helmet"), QUARTZ_EMERALD_HELMET);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_chestplate"), QUARTZ_EMERALD_CHESTPLATE);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_leggings"), QUARTZ_EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_boots"), QUARTZ_EMERALD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_sword"), QUARTZ_EMERALD_SWORD);   
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_pickaxe"), QUARTZ_EMERALD_PICKAXE);     
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_axe"), QUARTZ_EMERALD_AXE);           
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_shovel"), QUARTZ_EMERALD_SHOVEL);  
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_hoe"), QUARTZ_EMERALD_HOE);      
        Registry.register(Registry.ITEM, new Identifier("emerald", "quartz_emerald_bow"), QUARTZ_EMERALD_BOW);
        Registry.register(Registry.ITEM, new Identifier("emerald", "emerald_diamond"), EMERALD_DIAMOND); 
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_helmet"), DIAMOND_EMERALD_HELMET);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_chestplate"), DIAMOND_EMERALD_CHESTPLATE);    
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_leggings"), DIAMOND_EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_boots"), DIAMOND_EMERALD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_sword"), DIAMOND_EMERALD_SWORD);   
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_pickaxe"), DIAMOND_EMERALD_PICKAXE);     
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_axe"), DIAMOND_EMERALD_AXE);           
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_shovel"), DIAMOND_EMERALD_SHOVEL);   
        Registry.register(Registry.ITEM, new Identifier("emerald", "diamond_emerald_hoe"), DIAMOND_EMERALD_HOE);  
    }
	

}
