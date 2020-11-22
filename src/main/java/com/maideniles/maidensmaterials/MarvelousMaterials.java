package com.maideniles.maidensmaterials;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.potion.MaidensPotions;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MarvelousMaterials.MODID)
public final class MarvelousMaterials {

    public static MarvelousMaterials instance;

    public static final String MODID = "maidensmaterials";

    public static final Logger LOGGER = LogManager.getLogger(MODID);



    public MarvelousMaterials() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::FMLLoadCompleteEvent);

        LOGGER.debug("Hello from Maiden's Materials!");

        MaidensPotions.EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MaidensPotions.POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());



        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);


        instance = this;
        MinecraftForge.EVENT_BUS.register(this);






    }






    public void setup(final FMLCommonSetupEvent event) {// K9#8016

        /*
         * DeferredWorkQueue.runLater(() -> { for (Biome biome : ForgeRegistries.BIOMES)
         * { if (biome instanceof ExampleBiome) {
         * biome.getSpawns(EntityClassification.MONSTER) .add(new
         * Biome.SpawnListEntry(EntityType.ZOMBIE, 1000, 1, 4)); } } });
         */

    }


    public void FMLLoadCompleteEvent(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //Amethyst
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.amethystOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                    new CountRangeConfig(40, 32, 0, 196)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.amethystOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                    new CountRangeConfig(40, 32, 0, 196)));

            //Aventurine
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.aventurineOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                    new CountRangeConfig(40, 32, 0, 196)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.aventurineOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                    new CountRangeConfig(40, 32, 0, 196)));

            //Carnelian
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.carnelianOre.get().getDefaultState(), 17), Placement.COUNT_RANGE,
                    new CountRangeConfig(40, 32, 0, 196)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.carnelianOreNether.get().getDefaultState(), 17), Placement.COUNT_RANGE,
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