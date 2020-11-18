package com.maideniles.maidensmaterials;


import com.maideniles.maidensmaterials.potion.MaidensPotions;
import init.ItemInit;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MarvelousMaterials.MODID)
public final class MarvelousMaterials {

    public static final String MODID = "maidensmaterials";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public MarvelousMaterials() {
        LOGGER.debug("Hello from Maiden's Materials!");

        MaidensPotions.EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
       MaidensPotions.POTIONS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }


}