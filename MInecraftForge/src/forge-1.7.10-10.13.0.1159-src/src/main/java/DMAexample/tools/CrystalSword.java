package DMAexample.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CrystalSword extends ItemSword {

	public CrystalSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName("dmaexample:crystalsword");
		setUnlocalizedName("Crystal Sword");
	}
}
