package DMAexample.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class SugarCookie extends ItemFood {
	
	public SugarCookie(int i, float healthRestored, boolean petFriendly) {
		super(i, healthRestored, petFriendly);
		
		setCreativeTab(CreativeTabs.tabFood);
		setTextureName("dmaexample:sugarcookie");
		setUnlocalizedName("Sugar Cookie");
	}
}
