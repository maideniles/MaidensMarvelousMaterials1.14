package com.maideniles.maidensmaterials.world.gen;

import com.maideniles.maidensmaterials.config.ConfigBuilder;
import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {

    public static void setupOreGeneration() {
        if(ConfigBuilder.generate_overworld.get()) {
            for (Biome biome : ForgeRegistries.BIOMES) {

                //Amethyst
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.amethystOre.get().getDefaultState(), ConfigBuilder.amethyst_chance.get()), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.amethystOreNether.get().getDefaultState(), ConfigBuilder.amethyst_nether_chance.get()), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Aventurine
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.aventurineOre.get().getDefaultState(), ConfigBuilder.aventurine_chance.get()), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.aventurineOreNether.get().getDefaultState(), ConfigBuilder.aventurine_nether_chance.get()), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Carnelian
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.carnelianOre.get().getDefaultState(), ConfigBuilder.carnelian_chance.get()), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.carnelianOreNether.get().getDefaultState(), ConfigBuilder.carnelian_nether_chance.get()), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Chalcopyrite
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.chalcopyriteOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.chalcopyriteOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Citrine
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.citrineOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.citrineOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Jade
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.jadeOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.jadeOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Jasper
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.jasperOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.jasperOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Labradorite
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.labradoriteOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.labradoriteOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Mica
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.micaOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.micaOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Moonstone
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.moonstoneOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.moonstoneOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //RoseQuartz
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.roseQuartzOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.roseQuartzOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                //Sodalite
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.sodaliteOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.sodaliteOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                        new CountRangeConfig(40, 32, 0, 196)));

            }
        }
    }

}
