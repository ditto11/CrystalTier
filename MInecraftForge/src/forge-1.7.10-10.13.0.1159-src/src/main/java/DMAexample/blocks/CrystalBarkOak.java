package DMAexample.blocks;

import java.util.Random;

import DMAexample.MyCode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class CrystalBarkOak extends Block {
	
	//Side Variables
	public IIcon side0;//bottom
	public IIcon side1;//top
	public IIcon side2;//front
	public IIcon side3;//back
	public IIcon side4;//left
	public IIcon side5;//right

	public CrystalBarkOak(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
		
		setHardness(2.2f); //Slightly Harder than Oak
		setStepSound(soundTypeWood);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("axe", 1); //Needs stone axe to mine
		setResistance(5.0f);
		setBlockName("Crystal Bark Oak");
	}
	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return MyCode.crystallineShard;
	}
	public void registerBlockIcons(IIconRegister icon) {
		side0 = icon.registerIcon("dmaexample:feyoaktop");
		side1 = icon.registerIcon("dmaexample:feyoaktop");
		side2 = icon.registerIcon("dmaexample:crystalbarkoakside");
		side3 = icon.registerIcon("dmaexample:crystalbarkoakside");
		side4 = icon.registerIcon("dmaexample:crystalbarkoakside");
		side5 = icon.registerIcon("dmaexample:crystalbarkoakside");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if(side == 0) {
			return side0;
		}
		else if(side == 1) { 
			return side1;
		}
		else if(side == 2) {
			return side2;
		}
		else if(side == 3) {
			return side3;
		}
		else if(side == 4) {
			return side4;
		}
		else {
			return side5;
		}
	}
}
