package DMAexample.biomes;

import java.util.ArrayList;

import DMAexample.MyCode;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class FieldBiome extends BiomeGenBase {

	public FieldBiome(int height) {
		super(height);
		
		setHeight(height_PartiallySubmerged);
		topBlock = Blocks.dirt;
		fillerBlock = Blocks.monster_egg;
		
		setBiomeName("Field");
		
		spawnableCreatureList = new ArrayList();
		
		theBiomeDecorator.clayPerChunk = 5;
		theBiomeDecorator.waterlilyPerChunk = 3;
		theBiomeDecorator.mushroomsPerChunk = 6;
		theBiomeDecorator.reedsPerChunk = 3;
		theBiomeDecorator.deadBushPerChunk = 7;
		

	}
}

//-2251921242369960617
//-5419849716547697294
//-4152381309175553704