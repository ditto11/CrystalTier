package DMAexample.tools;

import DMAexample.MyCode;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CrystalArmor extends ItemArmor {

	public CrystalArmor(ArmorMaterial crystalarmor, int renderIndex,
			int armorType) {
		super(crystalarmor, renderIndex, armorType);
	
		setCreativeTab(CreativeTabs.tabCombat);
		
		if(armorType == 0) {
			setTextureName("dmaexample:crystalhelmet");
			setUnlocalizedName("crystalHelmet");
		}
		else if(armorType == 1) {
			setTextureName("dmaexample:crystalchestpiece");
			setUnlocalizedName("crystalChestPlate");
		}
		else if(armorType == 2) {
			setTextureName("dmaexample:crystalleggings");
			setUnlocalizedName("crystalLeggings");
		}
		else if(armorType == 3) {
			setTextureName("dmaexample:crystalboots");
			setUnlocalizedName("crystalBoots");
		}		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == MyCode.crystalHelmet || stack.getItem() == MyCode.crystalChestPlate || stack.getItem() == MyCode.crystalBoots) {
			return "dmaexample:textures/models/armor/crystal_layer_1.png";
		}
		else if(stack.getItem() == MyCode.crystalLeggings) {
			return "dmaexample:textures/models/armor/crystal_layer_2.png";
		}
		else
			return null;
	}
}