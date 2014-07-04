package DMAexample;

import java.lang.reflect.Field;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import DMAexample.biomes.FieldBiome;
import DMAexample.blocks.CrystalBlock;
import DMAexample.blocks.CrystallineOre;
import DMAexample.crops.Snakeroot;
import DMAexample.items.CrystalDust;
import DMAexample.items.CrystalIngot;
import DMAexample.items.SnakerootSeed;
import DMAexample.tools.CrystalArmor;
import DMAexample.tools.CrystalAxe;
import DMAexample.tools.CrystalHoe;
import DMAexample.tools.CrystalPickaxe;
import DMAexample.tools.CrystalShovel;
import DMAexample.tools.CrystalSword;
import DMAexample.worldGen.SampleGenerationClass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

public class MyCode {
	
	//Ore Generation
	public static SampleGenerationClass crystalGeneration = new SampleGenerationClass();
	
	public static BiomeGenBase fieldBiome;
	
	//block variables
	public static Block crystalBlock;
	public static Block crystallineOre;
	
	//item variables
	public static Item crystalIngot;
	public static Item crystalDust;
	
	//crop variables
	public static Block snakeroot;
	public static ItemSeeds snakerootSeed;
	
	//potion variables
	
	
	//Enum Materials
	public static ToolMaterial crystal = EnumHelper.addToolMaterial("Crystal", 4, 1650, 9.0f, 5.0f, 27);
	public static ArmorMaterial crystalarmor = EnumHelper.addArmorMaterial("Crystal", 45, new int[] {5, 8, 7, 4}, 12);
	
	//Crystal Tool Variables
	public static Item crystalSword;
	public static Item crystalPickaxe;
	public static Item crystalAxe;
	public static Item crystalShovel;
	public static Item crystalHoe;
	
	//Crystal Armor Variables
	public static Item crystalHelmet;
	public static Item crystalChestPlate;
	public static Item crystalLeggings;
	public static Item crystalBoots;
	
	public static void MyItems() {
		//Item Declarations
		// Miscellaneous items
		crystalIngot = new CrystalIngot();
		crystalDust = new CrystalDust();
		snakerootSeed = new SnakerootSeed(MyCode.snakeroot, Blocks.farmland);		
		//Tools
		crystalSword = new CrystalSword(crystal);
		crystalPickaxe = new CrystalPickaxe(crystal);
		crystalAxe = new CrystalAxe(crystal);
		crystalShovel = new CrystalShovel(crystal);
		crystalHoe = new CrystalHoe(crystal);
		//Armor
		crystalHelmet = new CrystalArmor(crystalarmor, 0, 0);
		crystalChestPlate = new CrystalArmor(crystalarmor, 0, 1);
		crystalLeggings = new CrystalArmor(crystalarmor, 0, 2);
		crystalBoots = new CrystalArmor(crystalarmor, 0, 3);
		//Alchemy
		
		
		//game registration
		GameRegistry.registerItem(crystalDust, "Crystalline Dust");
		GameRegistry.registerItem(crystalSword, "Crystal Sword");
		GameRegistry.registerItem(crystalIngot, "Crystal Ingot");
		GameRegistry.registerItem(crystalPickaxe, "Crystal Pickaxe");
		GameRegistry.registerItem(crystalAxe, "Crystal Axe");
		GameRegistry.registerItem(crystalShovel, "Crystal Shovel");
		GameRegistry.registerItem(crystalHoe, "Crystal Hoe");
		GameRegistry.registerItem(crystalHelmet, "Crystal Helmet");
		GameRegistry.registerItem(crystalChestPlate, "Crystal ChestPlate");
		GameRegistry.registerItem(crystalLeggings, "Crystal Leggings");
		GameRegistry.registerItem(crystalBoots, "Crystal Boots");
		
		//Seeds
		MinecraftForge.addGrassSeed(new ItemStack(snakerootSeed), 0);
		
		
		//lang registrations
		LanguageRegistry.addName(crystalDust, "Crystal Dust");
		LanguageRegistry.addName(crystalSword, "Crystal Sword");
		LanguageRegistry.addName(crystalIngot, "Crystal Ingot");
		LanguageRegistry.addName(crystalPickaxe, "Crystal Pickaxe");
		LanguageRegistry.addName(crystalAxe, "Crystal Axe");
		LanguageRegistry.addName(crystalShovel, "Crystal Shovel");
		LanguageRegistry.addName(crystalHoe, "Crystal Hoe");
		LanguageRegistry.addName(snakerootSeed, "Snakeroot Seed");
	}
	public static void MyBlocks() {
		
		//Block Declarations
		crystalBlock = new CrystalBlock(Material.glass);
		crystallineOre = new CrystallineOre(Material.ground);
		snakeroot = new Snakeroot(Material.plants);
		
		fieldBiome = new FieldBiome(2);
		
		//Game Registration
		GameRegistry.registerBlock(crystalBlock, "CrystalBlock");
		GameRegistry.registerBlock(crystallineOre, "CrystallineOre");
		GameRegistry.registerBlock(snakeroot, "Snakeroot");
		
		//Lang Registration
		LanguageRegistry.addName(crystalBlock, "Crystal");
		LanguageRegistry.addName(crystallineOre, "Crystalline Ore");
		LanguageRegistry.addName(snakeroot, "Snakeroot");
		
		//World Registration
		GameRegistry.registerWorldGenerator(crystalGeneration, 1);

	}
	public static void MyRecipes() {

		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalIngot), new Object[] {
			"AAA","AAA","AAA",
			'A', MyCode.crystalDust
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalSword), new Object[] {
			" A "," A "," B ",
			'A', MyCode.crystalIngot, 'B', Items.diamond
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalPickaxe), new Object[] {
			"AAA"," B "," B ",
			'A', MyCode.crystalIngot, 'B', Items.diamond
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalAxe), new Object[] {
			" AA"," BA"," B ",
			'A', MyCode.crystalIngot, 'B', Items.diamond
		});	
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalShovel), new Object[] {
			" A "," B "," B ",
			'A', MyCode.crystalIngot, 'B', Items.diamond
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalHoe), new Object[] {
			" AA"," B "," B ",
			'A', MyCode.crystalIngot, 'B', Items.diamond
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalBlock), new Object[] {
			"AAA","AAA","AAA",
			'A', MyCode.crystalIngot
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalHelmet), new Object[] {
			"AAA","A A","   ",
			'A', MyCode.crystalIngot
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalChestPlate), new Object[] {
			"A A","AAA","AAA",
			'A', MyCode.crystalIngot
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalLeggings), new Object[] {
			"AAA","A A","A A",
			'A', MyCode.crystalIngot
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalBoots), new Object[] {
			"   ","A A","A A",
			'A', MyCode.crystalIngot
		});
		GameRegistry.addShapedRecipe(new ItemStack(MyCode.crystalBoots), new Object[] {
			"A A","A A","   ",
			'A', MyCode.crystalIngot
		});
		GameRegistry.addShapelessRecipe(new ItemStack(MyCode.crystalIngot, 9), MyCode.crystalBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(MyCode.crystalDust, 9), MyCode.crystalIngot);
		GameRegistry.addSmelting(new ItemStack(MyCode.crystallineOre), new ItemStack(MyCode.crystalIngot), 5);
	}
}