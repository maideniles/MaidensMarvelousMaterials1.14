package com.maideniles.maidensmaterials.world.biomes;

import com.maideniles.maidensmaterials.util.MaidensTreeColor;
import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeFeature;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class BiomeOrnamentalForest extends Biome {


    public BiomeOrnamentalForest(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 10, 2, 5));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SKELETON, 20, 2, 10));
        this.addCarver(GenerationStage.Carving.AIR,
                Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
        DefaultBiomeFeatures.addDoubleFlowers(this);

        DefaultBiomeFeatures.addOres(this);
    }
}
