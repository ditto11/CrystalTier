package DMAexample.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CrystalAxe extends ItemAxe {

	public CrystalAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName("dmaexample:crystalaxe");
		setUnlocalizedName("Crystal Axe");
	}

}
