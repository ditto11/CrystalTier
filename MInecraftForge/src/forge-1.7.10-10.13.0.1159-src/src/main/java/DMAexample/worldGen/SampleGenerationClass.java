 package DMAexample.worldGen;

import java.util.Random;

import DMAexample.MyCode;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SampleGenerationClass implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId) 
		{
			case -1:
				generateInNether(world,random,chunkX*16,chunkZ*16);
				break;
				
			case 0:
				generateInOverworld(world,random,chunkX*16,chunkZ*16);
				break;
				
			case 1:
				generateInEnd(world,random,chunkX*16,chunkZ*16);
				break;
				
			default:
				break;
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) 
	{
		//Generate Ores
		
		for(int i = 0; i<3; i++)//25 == Rarity how many times it runs per chunk when world is generated
		{
			int chunkX = x + random.nextInt(16);//width
			int chunkY = random.nextInt(200);//How high do you want it to generate? 14==Diamond
			int chunkZ = z + random.nextInt(16);//Z depth
			
			//50 - How large is the vein? How many spawn together?
			(new WorldGenMinable(MyCode.crystallineOre, 4)).generate(world, random, chunkX, chunkY, chunkZ);
		}		
	}
	
	private void generateInEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}
}