package com.maideniles.maidensmaterials.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigBuilder {

    public static ForgeConfigSpec.IntValue amethyst_chance;
    public static ForgeConfigSpec.IntValue amethyst_nether_chance;
    public static ForgeConfigSpec.IntValue aventurine_chance;
    public static ForgeConfigSpec.IntValue aventurine_nether_chance;
    public static ForgeConfigSpec.IntValue carnelian_chance;
    public static ForgeConfigSpec.IntValue carnelian_nether_chance;
    public static ForgeConfigSpec.BooleanValue generate_overworld;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Oregen Config");

        generate_overworld = server
                .comment("Decide if you want Marvelous Material ores to generate")
                .define("oregen.generate_overworld", true);

        amethyst_chance = server
                .comment("Maximum number of ore veins of the amethyst ore that can spawn in one chunk.")
                .defineInRange("oregen.amethyst_chance", 17, 1, 1000000);

        amethyst_nether_chance = server
                .comment("Maximum number of ore veins of the amethyst nether ore that can spawn in one chunk.")
                .defineInRange("oregen.amethyst_nether_chance", 17, 1, 1000000);

        aventurine_chance = server
                .comment("Maximum number of ore veins of the aventurine ore that can spawn in one chunk.")
                .defineInRange("oregen.aventurine_chance", 17, 1, 1000000);

        aventurine_nether_chance = server
                .comment("Maximum number of ore veins of the aventurine nether ore that can spawn in one chunk.")
                .defineInRange("oregen.aventurine_nether_chance", 17, 1, 1000000);

        carnelian_chance = server
                .comment("Maximum number of ore veins of the carnelian ore that can spawn in one chunk.")
                .defineInRange("oregen.carnelian_chance", 17, 1, 1000000);

        carnelian_nether_chance = server
                .comment("Maximum number of ore veins of the carnelian nether ore that can spawn in one chunk.")
                .defineInRange("oregen.carnelian_nether_chance", 17, 1, 1000000);

    }
}
