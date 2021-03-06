package DMAexample.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CrystalBlock extends Block {

	public CrystalBlock(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
		
		setHardness(0.3f); //As hard as glowstone
		setStepSound(soundTypeGlass);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHarvestLevel("pickaxe", 1); //Needs stone pickaxe to mine
		setResistance(2.0f);
		setBlockTextureName("dmaexample:crystalskin");
		setLightLevel(15.0f); //Same light level as glowstone
		setLightOpacity(0);
		setBlockName("Crystal");
	}
}