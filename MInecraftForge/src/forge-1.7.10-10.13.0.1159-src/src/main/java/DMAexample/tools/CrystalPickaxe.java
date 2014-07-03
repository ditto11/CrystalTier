package DMAexample.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CrystalPickaxe extends ItemPickaxe {

	public CrystalPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName("dmaexample:crystalpick");
		setUnlocalizedName("Crystal Pickaxe");
	}

}
