package org.blockserver.level;

/**
 * Source: https://github.com/erich666/Mineways/blob/master/Win/biomes.h and
 * https://github.com/erich666/Mineways/blob/master/Win/biomes.cpp
 */
public enum BiomeType{
	OCEAN("Ocean", 0, 0.5f, 0.5f, 0x92BD59, 0x77AB2F),
	PLAINS("Plains", 1, 0.8f, 0.4f, 0x92BD59, 0x77AB2F),
	DESERT("Desert", 2, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	EXTREME_HILLS("Extreme Hills", 3, 0.2f, 0.3f, 0x92BD59, 0x77AB2F),
	FOREST("Forest", 4, 0.7f, 0.8f, 0x92BD59, 0x77AB2F),
	TAIGA("Taiga", 5, 0.05f, 0.8f, 0x92BD59, 0x77AB2F),
	SWAMPLAND("Swampland", 6, 0.8f, 0.9f, 0x92BD59, 0x77AB2F),
	RIVER("River", 7, 0.5f, 0.5f, 0x92BD59, 0x77AB2F),
	NETHER("Nether", 8, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	END("End", 9, 0.5f, 0.5f, 0x92BD59, 0x77AB2F),
	FROZEN_OCEAN("Frozen Ocean", 10, 0.0f, 0.5f, 0x92BD59, 0x77AB2F),
	FROZEN_RIVER("Frozen River", 11, 0.0f, 0.5f, 0x92BD59, 0x77AB2F),
	ICE_PLAINS("Ice Plains", 12, 0.0f, 0.5f, 0x92BD59, 0x77AB2F),
	ICE_MOUNTAINS("Ice Mountains", 13, 0.0f, 0.5f, 0x92BD59, 0x77AB2F),
	MUSHROOM_ISLAND("Mushroom Island", 14, 0.9f, 1.0f, 0x92BD59, 0x77AB2F),
	MUSHROOM_ISLAND_SHORE("Mushroom Island Shore", 15, 0.9f, 1.0f, 0x92BD59, 0x77AB2F),
	BEACH("Beach", 16, 0.8f, 0.4f, 0x92BD59, 0x77AB2F),
	DESERT_HILLS("Desert Hills", 17, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	FOREST_HILLS("Forest Hills", 18, 0.7f, 0.8f, 0x92BD59, 0x77AB2F),
	TAIGA_HILLS("Taiga Hills", 19, 0.2f, 0.7f, 0x92BD59, 0x77AB2F),
	EXTREME_HILLS_EDGE("Extreme Hills Edge", 20, 0.2f, 0.3f, 0x92BD59, 0x77AB2F),
	JUNGLE("Jungle", 21, 1.2f, 0.9f, 0x92BD59, 0x77AB2F),
	JUNGLE_HILLS("Jungle Hills", 22, 1.2f, 0.9f, 0x92BD59, 0x77AB2F),
	JUNGLE_EDGE("Jungle Edge", 23, 0.95f, 0.8f, 0x92BD59, 0x77AB2F),
	DEEP_OCEAN("Deep Ocean", 24, 0.5f, 0.5f, 0x92BD59, 0x77AB2F),
	STONE_BEACH("Stone Beach", 25, 0.2f, 0.3f, 0x92BD59, 0x77AB2F),
	COLD_BEACH("Cold Beach", 26, 0.05f, 0.3f, 0x92BD59, 0x77AB2F),
	BIRCH_FOREST("Birch Forest", 27, 0.6f, 0.6f, 0x92BD59, 0x77AB2F),
 	BIRCH_FOREST_HILLS("Birch Forest Hills", 28, 0.6f, 0.6f, 0x92BD59, 0x77AB2F),
	ROOFED_FOREST("Roofed Forest", 29, 0.7f, 0.8f, 0x92BD59, 0x77AB2F),
	COLD_TAIGA("Cold Taiga", 30, -0.5f, 0.4f, 0x92BD59, 0x77AB2F),
	COLD_TAIGA_HILLS("Cold Taiga Hills", 31, -0.5f, 0.4f, 0x92BD59, 0x77AB2F),
	MEGA_TAIGA("Mega Taiga", 32, 0.3f, 0.8f, 0x92BD59, 0x77AB2F),
	MEGA_TAIGA_HILLS("Mega Taiga Hills", 33, 0.3f, 0.8f, 0x92BD59, 0x77AB2F),
	EXTREME_HILLS_PLUS("Extreme Hills+", 34, 0.2f, 0.3f, 0x92BD59, 0x77AB2F),
	SAVANNA("Savanna", 35, 1.2f, 0.0f, 0x92BD59, 0x77AB2F),
	SAVANNA_PLATEAU("Savanna Plateau", 36, 1.0f, 0.0f, 0x92BD59, 0x77AB2F),
	MESA("Mesa", 37, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	MESA_PLATEAU_F("Mesa Plateau F", 38, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	MESA_PLATEAU("Mesa Plateau", 39, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	SUNFLOWER_PLAINS("Sunflower Plains", 129, 0.8f, 0.4f, 0x92BD59, 0x77AB2F),
	DESERT_M("Desert M", 130, 2.0f, 0.0f, 0x92BD59, 0x77AB2F),
	//    { /* 131 */ "Extreme Hills M",			0.2f, 0.3f, 0x92BD59, 0x77AB2F },
	//    { /* 132 */ "Flower Forest",			0.7f, 0.8f, 0x92BD59, 0x77AB2F },
	//    { /* 133 */ "Taiga M",					0.05f, 0.8f, 0x92BD59, 0x77AB2F },
	//    { /* 134 */ "Swampland M",				0.8f, 0.9f, 0x92BD59, 0x77AB2F },
	//    { /* 140 */ "Ice Plains Spikes",		0.0f, 0.5f, 0x92BD59, 0x77AB2F },
	//    { /* 149 */ "Jungle M",					1.2f, 0.9f, 0x92BD59, 0x77AB2F },
	//    { /* 151 */ "JungleEdge M",				0.95f, 0.8f, 0x92BD59, 0x77AB2F },
	//    { /* 156 */ "Birch Forest Hills M",		0.6f, 0.6f, 0x92BD59, 0x77AB2F },
	//    { /* 157 */ "Roofed Forest M",			0.7f, 0.8f, 0x92BD59, 0x77AB2F },
	//    { /* 158 */ "Cold Taiga M",				-0.5f, 0.4f, 0x92BD59, 0x77AB2F },
	//    { /* 160 */ "Mega Spruce Taiga",		0.25f, 0.8f, 0x92BD59, 0x77AB2F },	// special exception look down
	//    { /* 161 */ "Mega Spruce Taiga Hills",	0.3f, 0.8f, 0x92BD59, 0x77AB2F },
	//    { /* 162 */ "Extreme Hills+ M",			0.2f, 0.3f, 0x92BD59, 0x77AB2F },
	//    { /* 163 */ "Savanna M",				1.2f, 0.0f, 0x92BD59, 0x77AB2F },
	//    { /* 164 */ "Savanna Plateau M",		1.0f, 0.0f, 0x92BD59, 0x77AB2F },
	//    { /* 165 */ "Mesa (Bryce)",				2.0f, 0.0f, 0x92BD59, 0x77AB2F },
	//    { /* 166 */ "Mesa Plateau F M",			2.0f, 0.0f, 0x92BD59, 0x77AB2F },
	//    { /* 167 */ "Mesa Plateau M",			2.0f, 0.0f, 0x92BD59, 0x77AB2F },
	;
	private byte id;
	private String name;
	private final float temperature, rainfall;
	private final int grass, foliage;
	BiomeType(String name, int id, float temperature, float rainfall, int grass, int foliage){
		this.name = name;
		this.id = (byte) id;
		this.temperature = temperature;
		this.rainfall = rainfall;
		this.grass = grass;
		this.foliage = foliage;
	}
	public String getName(){
		return name;
	}
	public byte getID(){
		return id;
	}
	public float getTemperature(){
		return temperature;
	}
	public float getRainfall(){
		return rainfall;
	}
	public int getGrass(){
		return grass;
	}
	public int getFoliage(){
		return foliage;
	}
	public static BiomeType get(int in){
		byte id = (byte) (in & 0x7F);
		for(BiomeType t: values()){
			if(t.getID() == id){
				return t;
			}
		}
		return null;
	}
}

//Biome gBiomes[256]={	// IMPORTANT: do not change 256 size here.
//    { /*   0 */ "Ocean",					0.5f, 0.5f, 0x92BD59, 0x77AB2F },	// default values of temp and rain
//    { /*   1 */ "Plains",					0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*   2 */ "Desert",					2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*   3 */ "Extreme Hills",			0.2f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /*   4 */ "Forest",					0.7f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*   5 */ "Taiga",					0.05f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*   6 */ "Swampland",				0.8f, 0.9f, 0x92BD59, 0x77AB2F },
//    { /*   7 */ "River",					0.5f, 0.5f, 0x92BD59, 0x77AB2F },	// default values of temp and rain
//    { /*   8 */ "Nether",					2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*   9 */ "End",						0.5f, 0.5f, 0x92BD59, 0x77AB2F },	// default values of temp and rain
//    { /*  10 */ "Frozen Ocean",				0.0f, 0.5f, 0x92BD59, 0x77AB2F },
//    { /*  11 */ "Frozen River",				0.0f, 0.5f, 0x92BD59, 0x77AB2F },
//    { /*  12 */ "Ice Plains",				0.0f, 0.5f, 0x92BD59, 0x77AB2F },
//    { /*  13 */ "Ice Mountains",			0.0f, 0.5f, 0x92BD59, 0x77AB2F },
//    { /*  14 */ "Mushroom Island",			0.9f, 1.0f, 0x92BD59, 0x77AB2F },
//    { /*  15 */ "Mushroom Island Shore",	0.9f, 1.0f, 0x92BD59, 0x77AB2F },
//    { /*  16 */ "Beach",					0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  17 */ "Desert Hills",				2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*  18 */ "Forest Hills",				0.7f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*  19 */ "Taiga Hills",				0.2f, 0.7f, 0x92BD59, 0x77AB2F },
//    { /*  20 */ "Extreme Hills Edge",		0.2f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /*  21 */ "Jungle",					1.2f, 0.9f, 0x92BD59, 0x77AB2F },
//    { /*  22 */ "Jungle Hills",				1.2f, 0.9f, 0x92BD59, 0x77AB2F },
//    { /*  23 */ "Jungle Edge",				0.95f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*  24 */ "Deep Ocean",				0.5f, 0.5f, 0x92BD59, 0x77AB2F },
//    { /*  25 */ "Stone Beach",				0.2f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /*  26 */ "Cold Beach",				0.05f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /*  27 */ "Birch Forest",				0.6f, 0.6f, 0x92BD59, 0x77AB2F },
//    { /*  28 */ "Birch Forest Hills",		0.6f, 0.6f, 0x92BD59, 0x77AB2F },
//    { /*  29 */ "Roofed Forest",			0.7f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*  30 */ "Cold Taiga",				-0.5f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  31 */ "Cold Taiga Hills",			-0.5f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  32 */ "Mega Taiga",				0.3f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*  33 */ "Mega Taiga Hills",			0.3f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /*  34 */ "Extreme Hills+",			0.2f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /*  35 */ "Savanna",					1.2f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*  36 */ "Savanna Plateau",			1.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*  37 */ "Mesa",						2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*  38 */ "Mesa Plateau F",			2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*  39 */ "Mesa Plateau",				2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /*  40 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  41 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  42 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  43 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  44 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  45 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  46 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  47 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  48 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  49 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  50 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  51 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  52 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  53 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  54 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  55 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  56 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  57 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  58 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  59 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  60 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  61 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  62 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  63 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  64 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  65 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  66 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  67 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  68 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  69 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  70 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  71 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  72 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  73 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  74 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  75 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  76 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  77 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  78 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  79 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  80 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  81 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  82 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  83 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  84 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  85 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  86 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  87 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  88 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  89 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  90 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  91 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  92 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  93 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  94 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  95 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  96 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  97 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  98 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /*  99 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 100 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 101 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 102 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 103 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 104 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 105 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 106 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 107 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 108 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 109 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 110 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 111 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 112 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 113 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 114 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 115 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 116 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 117 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 118 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 119 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 120 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 121 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 122 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 123 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 124 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 125 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 126 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 127 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 128 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 129 */ "Sunflower Plains",			0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 130 */ "Desert M",					2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /* 131 */ "Extreme Hills M",			0.2f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /* 132 */ "Flower Forest",			0.7f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /* 133 */ "Taiga M",					0.05f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /* 134 */ "Swampland M",				0.8f, 0.9f, 0x92BD59, 0x77AB2F },
//    { /* 135 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 136 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 137 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 138 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 139 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 140 */ "Ice Plains Spikes",		0.0f, 0.5f, 0x92BD59, 0x77AB2F },
//    { /* 141 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 142 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 143 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 144 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 145 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 146 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 147 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 148 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 149 */ "Jungle M",					1.2f, 0.9f, 0x92BD59, 0x77AB2F },
//    { /* 150 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 151 */ "JungleEdge M",				0.95f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /* 152 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 153 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 154 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 155 */ "Birch Forest M",			0.6f, 0.6f, 0x92BD59, 0x77AB2F },
//    { /* 156 */ "Birch Forest Hills M",		0.6f, 0.6f, 0x92BD59, 0x77AB2F },
//    { /* 157 */ "Roofed Forest M",			0.7f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /* 158 */ "Cold Taiga M",				-0.5f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 159 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 160 */ "Mega Spruce Taiga",		0.25f, 0.8f, 0x92BD59, 0x77AB2F },	// special exception, temperature not 0.3
//    { /* 161 */ "Mega Spruce Taiga Hills",	0.3f, 0.8f, 0x92BD59, 0x77AB2F },
//    { /* 162 */ "Extreme Hills+ M",			0.2f, 0.3f, 0x92BD59, 0x77AB2F },
//    { /* 163 */ "Savanna M",				1.2f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /* 164 */ "Savanna Plateau M",		1.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /* 165 */ "Mesa (Bryce)",				2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /* 166 */ "Mesa Plateau F M",			2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /* 167 */ "Mesa Plateau M",			2.0f, 0.0f, 0x92BD59, 0x77AB2F },
//    { /* 168 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 169 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 170 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 171 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 172 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 173 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 174 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 175 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 176 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 177 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 178 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 179 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 180 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 181 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 182 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 183 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 184 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 185 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 186 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 187 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 188 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 189 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 190 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 191 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 192 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 193 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 194 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 195 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 196 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 197 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 198 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 199 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 200 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 201 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 202 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 203 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 204 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 205 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 206 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 207 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 208 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 209 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 210 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 211 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 212 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 213 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 214 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 215 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 216 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 217 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 218 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 219 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 220 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 221 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 222 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 223 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 224 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 225 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 226 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 227 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 228 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 229 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 230 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 231 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 232 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 233 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 234 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 235 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 236 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 237 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 238 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 239 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 240 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 241 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 242 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 243 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 244 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 245 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 246 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 247 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 248 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 249 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 250 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 251 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 252 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 253 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 254 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//    { /* 255 */ "Unknown Biome",				0.8f, 0.4f, 0x92BD59, 0x77AB2F },
//};