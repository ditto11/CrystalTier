package DMAexample.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CrystalShovel extends ItemSpade {

	public CrystalShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName("dmaexample:crystalshovel");
		setUnlocalizedName("Crystal Shovel");
	}

}