package DMAexample.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class SnakerootSeed extends ItemSeeds {

	public SnakerootSeed(Block crop, Block soil) {
		super(crop, soil);
		setUnlocalizedName("Snakeroot Seed");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
