package com.maideniles.maidensmaterials;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.potion.MaidensPotions;
import com.maideniles.maidensmaterials.init.ItemInit;
import com.maideniles.maidensmaterials.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Mod(MarvelousMaterials.MODID)
public final class MarvelousMaterials {

    public static MarvelousMaterials instance;

    public static final String MODID = "maidensmaterials";

    public static final Logger LOGGER = LogManager.getLogger(MODID);



    public MarvelousMaterials() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        LOGGER.debug("Hello from Maiden's Materials!");

        MaidensPotions.EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MaidensPotions.POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());



        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);

    }






    private void setup(final FMLCommonSetupEvent event) {// K9#8016

        /*
         * DeferredWorkQueue.runLater(() -> { for (Biome biome : ForgeRegistries.BIOMES)
         * { if (biome instanceof ExampleBiome) {
         * biome.getSpawns(EntityClassification.MONSTER) .add(new
         * Biome.SpawnListEntry(EntityType.ZOMBIE, 1000, 1, 4)); } } });
         */
    }

}