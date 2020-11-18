package init;


import com.maideniles.maidensmaterials.block.*;

import com.maideniles.maidensmaterials.block.leaves.*;
import com.maideniles.maidensmaterials.block.vase.*;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;
import com.maideniles.maidensmaterials.world.feature.tree.MaidensTrees;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{

    public static Block ornamentalGrass;
    public static Block walkFlowers;

    public static final List<Block> GRASS = new ArrayList<>();

    public static Block crabappleLog;
    public static Block poincianaLog;
    public static Block laburnumLog;
    public static Block jadeLog;
    public static Block paulowniaLog;
    public static Block wisteriaLog;
    public static Block jacarandaLog;
    public static Block dogwoodLog;
    public static Block silverbellLog;



    public static Block crabappleLeaves;
    public static Block poincianaLeaves;
    public static Block laburnumLeaves;
    public static Block jadeLeaves;
    public static Block paulowniaLeaves;
    public static Block wisteriaLeaves;
    public static Block jacarandaLeaves;
    public static Block dogwoodLeaves;
    public static Block silverbellLeaves;



    public static Block crabappleVine;
    public static Block poincianaVine;
    public static Block laburnumVine;
    public static Block jadeVine;
    public static Block paulowniaVine;
    public static Block wisteriaVine;
    public static Block jacarandaVine;
    public static Block dogwoodVine;
    public static Block silverbellVine;

    public static Block crabappleSapling;
    public static Block poincianaSapling;
    public static Block laburnumSapling;
    public static Block jadeSapling;
    public static Block paulowniaSapling;
    public static Block wisteriaSapling;
    public static Block jacarandaSapling;
    public static Block dogwoodSapling;
    public static Block silverbellSapling;

    public static Block fairyGlowCup;
    public static Block redClayBlock;

    public static Block redVaseNoFlower;
    public static Block orangeVaseNoFlower;
    public static Block yellowVaseNoFlower;
    public static Block limeVaseNoFlower;
    public static Block greenVaseNoFlower;
    public static Block cyanVaseNoFlower;
    public static Block lightBlueVaseNoFlower;
    public static Block blueVaseNoFlower;
    public static Block purpleVaseNoFlower;
    public static Block magentaVaseNoFlower;
    public static Block pinkVaseNoFlower;
    public static Block whiteVaseNoFlower;
    public static Block lightGrayVaseNoFlower;
    public static Block grayVaseNoFlower;
    public static Block blackVaseNoFlower;
    public static Block brownVaseNoFlower;

    public static Block redVaseRedFlower;
   public static Block orangeVaseRedFlower;
    public static Block yellowVaseRedFlower;
    public static Block limeVaseRedFlower;
    public static Block greenVaseRedFlower;
    public static Block cyanVaseRedFlower;
    public static Block lightBlueVaseRedFlower;
    public static Block blueVaseRedFlower;
    public static Block purpleVaseRedFlower;
    public static Block magentaVaseRedFlower;
    public static Block pinkVaseRedFlower;
    public static Block whiteVaseRedFlower;
    public static Block lightGrayVaseRedFlower;
    public static Block grayVaseRedFlower;
    public static Block blackVaseRedFlower;
    public static Block brownVaseRedFlower;

    public static Block redVaseOrangeFlower;
    public static Block orangeVaseOrangeFlower;
    public static Block yellowVaseOrangeFlower;
    public static Block limeVaseOrangeFlower;
    public static Block greenVaseOrangeFlower;
    public static Block cyanVaseOrangeFlower;
    public static Block lightBlueVaseOrangeFlower;
    public static Block blueVaseOrangeFlower;
    public static Block purpleVaseOrangeFlower;
    public static Block magentaVaseOrangeFlower;
    public static Block pinkVaseOrangeFlower;
    public static Block whiteVaseOrangeFlower;
    public static Block lightGrayVaseOrangeFlower;
    public static Block grayVaseOrangeFlower;
    public static Block blackVaseOrangeFlower;
    public static Block brownVaseOrangeFlower;

    public static Block redVaseYellowFlower;
    public static Block orangeVaseYellowFlower;
    public static Block yellowVaseYellowFlower;
    public static Block limeVaseYellowFlower;
    public static Block greenVaseYellowFlower;
    public static Block cyanVaseYellowFlower;
    public static Block lightBlueVaseYellowFlower;
    public static Block blueVaseYellowFlower;
    public static Block purpleVaseYellowFlower;
    public static Block magentaVaseYellowFlower;
    public static Block pinkVaseYellowFlower;
    public static Block whiteVaseYellowFlower;
    public static Block lightGrayVaseYellowFlower;
    public static Block grayVaseYellowFlower;
    public static Block blackVaseYellowFlower;
    public static Block brownVaseYellowFlower;

    public static Block redVaseGreenFlower;
    public static Block orangeVaseGreenFlower;
    public static Block yellowVaseGreenFlower;
    public static Block limeVaseGreenFlower;
    public static Block greenVaseGreenFlower;
    public static Block cyanVaseGreenFlower;
    public static Block lightBlueVaseGreenFlower;
    public static Block blueVaseGreenFlower;
    public static Block purpleVaseGreenFlower;
    public static Block magentaVaseGreenFlower;
    public static Block pinkVaseGreenFlower;
    public static Block whiteVaseGreenFlower;
    public static Block lightGrayVaseGreenFlower;
    public static Block grayVaseGreenFlower;
    public static Block blackVaseGreenFlower;
    public static Block brownVaseGreenFlower;

    public static Block redVaseCyanFlower;
    public static Block orangeVaseCyanFlower;
    public static Block yellowVaseCyanFlower;
    public static Block limeVaseCyanFlower;
    public static Block greenVaseCyanFlower;
    public static Block cyanVaseCyanFlower;
    public static Block lightBlueVaseCyanFlower;
    public static Block blueVaseCyanFlower;
    public static Block purpleVaseCyanFlower;
    public static Block magentaVaseCyanFlower;
    public static Block pinkVaseCyanFlower;
    public static Block whiteVaseCyanFlower;
    public static Block lightGrayVaseCyanFlower;
    public static Block grayVaseCyanFlower;
    public static Block blackVaseCyanFlower;
    public static Block brownVaseCyanFlower;

    public static Block redVaseBlueFlower;
    public static Block orangeVaseBlueFlower;
    public static Block yellowVaseBlueFlower;
    public static Block limeVaseBlueFlower;
    public static Block greenVaseBlueFlower;
    public static Block cyanVaseBlueFlower;
    public static Block lightBlueVaseBlueFlower;
    public static Block blueVaseBlueFlower;
    public static Block purpleVaseBlueFlower;
    public static Block magentaVaseBlueFlower;
    public static Block pinkVaseBlueFlower;
    public static Block whiteVaseBlueFlower;
    public static Block lightGrayVaseBlueFlower;
    public static Block grayVaseBlueFlower;
    public static Block blackVaseBlueFlower;
    public static Block brownVaseBlueFlower;

    public static Block redVasePurpleFlower;
    public static Block orangeVasePurpleFlower;
    public static Block yellowVasePurpleFlower;
    public static Block limeVasePurpleFlower;
    public static Block greenVasePurpleFlower;
    public static Block cyanVasePurpleFlower;
    public static Block lightBlueVasePurpleFlower;
    public static Block blueVasePurpleFlower;
    public static Block purpleVasePurpleFlower;
    public static Block magentaVasePurpleFlower;
    public static Block pinkVasePurpleFlower;
    public static Block whiteVasePurpleFlower;
    public static Block lightGrayVasePurpleFlower;
    public static Block grayVasePurpleFlower;
    public static Block blackVasePurpleFlower;
    public static Block brownVasePurpleFlower;

    public static Block redVasePinkFlower;
    public static Block orangeVasePinkFlower;
    public static Block yellowVasePinkFlower;
    public static Block limeVasePinkFlower;
    public static Block greenVasePinkFlower;
    public static Block cyanVasePinkFlower;
    public static Block lightBlueVasePinkFlower;
    public static Block blueVasePinkFlower;
    public static Block purpleVasePinkFlower;
    public static Block magentaVasePinkFlower;
    public static Block pinkVasePinkFlower;
    public static Block whiteVasePinkFlower;
    public static Block lightGrayVasePinkFlower;
    public static Block grayVasePinkFlower;
    public static Block blackVasePinkFlower;
    public static Block brownVasePinkFlower;

    public static Block redVaseWhiteFlower;
    public static Block orangeVaseWhiteFlower;
    public static Block yellowVaseWhiteFlower;
    public static Block limeVaseWhiteFlower;
    public static Block greenVaseWhiteFlower;
    public static Block cyanVaseWhiteFlower;
    public static Block lightBlueVaseWhiteFlower;
    public static Block blueVaseWhiteFlower;
    public static Block purpleVaseWhiteFlower;
    public static Block magentaVaseWhiteFlower;
    public static Block pinkVaseWhiteFlower;
    public static Block whiteVaseWhiteFlower;
    public static Block lightGrayVaseWhiteFlower;
    public static Block grayVaseWhiteFlower;
    public static Block blackVaseWhiteFlower;
    public static Block brownVaseWhiteFlower;

    public static Block redVaseRedSapling;
    public static Block redVaseOrangeSapling;
    public static Block redVaseYellowSapling;
    public static Block redVaseGreenSapling;
    public static Block redVaseCyanSapling;
    public static Block redVaseBlueSapling;
    public static Block redVasePurpleSapling;
    public static Block redVasePinkSapling;
    public static Block redVaseWhiteSapling;

    public static Block orangeVaseRedSapling;
    public static Block orangeVaseOrangeSapling;
    public static Block orangeVaseYellowSapling;
    public static Block orangeVaseGreenSapling;
    public static Block orangeVaseCyanSapling;
    public static Block orangeVaseBlueSapling;
    public static Block orangeVasePurpleSapling;
    public static Block orangeVasePinkSapling;
    public static Block orangeVaseWhiteSapling;

    public static Block yellowVaseRedSapling;
    public static Block yellowVaseOrangeSapling;
    public static Block yellowVaseYellowSapling;
    public static Block yellowVaseGreenSapling;
    public static Block yellowVaseCyanSapling;
    public static Block yellowVaseBlueSapling;
    public static Block yellowVasePurpleSapling;
    public static Block yellowVasePinkSapling;
    public static Block yellowVaseWhiteSapling;

    public static Block limeVaseRedSapling;
    public static Block limeVaseOrangeSapling;
    public static Block limeVaseYellowSapling;
    public static Block limeVaseGreenSapling;
    public static Block limeVaseCyanSapling;
    public static Block limeVaseBlueSapling;
    public static Block limeVasePurpleSapling;
    public static Block limeVasePinkSapling;
    public static Block limeVaseWhiteSapling;

    public static Block greenVaseRedSapling;
    public static Block greenVaseOrangeSapling;
    public static Block greenVaseYellowSapling;
    public static Block greenVaseGreenSapling;
    public static Block greenVaseCyanSapling;
    public static Block greenVaseBlueSapling;
    public static Block greenVasePurpleSapling;
    public static Block greenVasePinkSapling;
    public static Block greenVaseWhiteSapling;

    public static Block cyanVaseRedSapling;
    public static Block cyanVaseOrangeSapling;
    public static Block cyanVaseYellowSapling;
    public static Block cyanVaseGreenSapling;
    public static Block cyanVaseCyanSapling;
    public static Block cyanVaseBlueSapling;
    public static Block cyanVasePurpleSapling;
    public static Block cyanVasePinkSapling;
    public static Block cyanVaseWhiteSapling;

    public static Block lightBlueVaseRedSapling;
    public static Block lightBlueVaseOrangeSapling;
    public static Block lightBlueVaseYellowSapling;
    public static Block lightBlueVaseGreenSapling;
    public static Block lightBlueVaseCyanSapling;
    public static Block lightBlueVaseBlueSapling;
    public static Block lightBlueVasePurpleSapling;
    public static Block lightBlueVasePinkSapling;
    public static Block lightBlueVaseWhiteSapling;

    public static Block blueVaseRedSapling;
    public static Block blueVaseOrangeSapling;
    public static Block blueVaseYellowSapling;
    public static Block blueVaseGreenSapling;
    public static Block blueVaseCyanSapling;
    public static Block blueVaseBlueSapling;
    public static Block blueVasePurpleSapling;
    public static Block blueVasePinkSapling;
    public static Block blueVaseWhiteSapling;

    public static Block purpleVaseRedSapling;
    public static Block purpleVaseOrangeSapling;
    public static Block purpleVaseYellowSapling;
    public static Block purpleVaseGreenSapling;
    public static Block purpleVaseCyanSapling;
    public static Block purpleVaseBlueSapling;
    public static Block purpleVasePurpleSapling;
    public static Block purpleVasePinkSapling;
    public static Block purpleVaseWhiteSapling;

    public static Block magentaVaseRedSapling;
    public static Block magentaVaseOrangeSapling;
    public static Block magentaVaseYellowSapling;
    public static Block magentaVaseGreenSapling;
    public static Block magentaVaseCyanSapling;
    public static Block magentaVaseBlueSapling;
    public static Block magentaVasePurpleSapling;
    public static Block magentaVasePinkSapling;
    public static Block magentaVaseWhiteSapling;

    public static Block pinkVaseRedSapling;
    public static Block pinkVaseOrangeSapling;
    public static Block pinkVaseYellowSapling;
    public static Block pinkVaseGreenSapling;
    public static Block pinkVaseCyanSapling;
    public static Block pinkVaseBlueSapling;
    public static Block pinkVasePurpleSapling;
    public static Block pinkVasePinkSapling;
    public static Block pinkVaseWhiteSapling;

    public static Block whiteVaseRedSapling;
    public static Block whiteVaseOrangeSapling;
    public static Block whiteVaseYellowSapling;
    public static Block whiteVaseGreenSapling;
    public static Block whiteVaseCyanSapling;
    public static Block whiteVaseBlueSapling;
    public static Block whiteVasePurpleSapling;
    public static Block whiteVasePinkSapling;
    public static Block whiteVaseWhiteSapling;

    public static Block lightGrayVaseRedSapling;
    public static Block lightGrayVaseOrangeSapling;
    public static Block lightGrayVaseYellowSapling;
    public static Block lightGrayVaseGreenSapling;
    public static Block lightGrayVaseCyanSapling;
    public static Block lightGrayVaseBlueSapling;
    public static Block lightGrayVasePurpleSapling;
    public static Block lightGrayVasePinkSapling;
    public static Block lightGrayVaseWhiteSapling;

    public static Block grayVaseRedSapling;
    public static Block grayVaseOrangeSapling;
    public static Block grayVaseYellowSapling;
    public static Block grayVaseGreenSapling;
    public static Block grayVaseCyanSapling;
    public static Block grayVaseBlueSapling;
    public static Block grayVasePurpleSapling;
    public static Block grayVasePinkSapling;
    public static Block grayVaseWhiteSapling;

    public static Block blackVaseRedSapling;
    public static Block blackVaseOrangeSapling;
    public static Block blackVaseYellowSapling;
    public static Block blackVaseGreenSapling;
    public static Block blackVaseCyanSapling;
    public static Block blackVaseBlueSapling;
    public static Block blackVasePurpleSapling;
    public static Block blackVasePinkSapling;
    public static Block blackVaseWhiteSapling;

    public static Block brownVaseRedSapling;
    public static Block brownVaseOrangeSapling;
    public static Block brownVaseYellowSapling;
    public static Block brownVaseGreenSapling;
    public static Block brownVaseCyanSapling;
    public static Block brownVaseBlueSapling;
    public static Block brownVasePurpleSapling;
    public static Block brownVasePinkSapling;
    public static Block brownVaseWhiteSapling;

    public static Block ornamentalPath;











    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        ornamentalGrass = registerBlock(new BlockOrnamentalGrass(BlockOrnamentalGrass.Properties.create(Material.PLANTS).hardnessAndResistance(1.0F, 1.0F)),"ornamental_grass");
        walkFlowers = registerBlock(new BlockFlowerGrass(BlockFlowerGrass.Properties.create(Material.PLANTS)),"flower_grass");
        ornamentalPath = registerBlock(new BlockPrettyPath(BlockPrettyPath.Properties.create(Material.PLANTS).hardnessAndResistance(1.0F, 1.0F)), "ornamental_path");

        Block earthenEssenceBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "earthen_essence_block");
        Block floralEssenceBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "floral_essence_block");


        redVaseNoFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 2.0F)), "red_vase_no_flower");
        orangeVaseNoFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_no_flower");
        yellowVaseNoFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_no_flower");
        limeVaseNoFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_no_flower");
        greenVaseNoFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_no_flower");
        cyanVaseNoFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_no_flower");
        lightBlueVaseNoFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_no_flower");
        blueVaseNoFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_no_flower");
        purpleVaseNoFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_no_flower");
        magentaVaseNoFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_no_flower");
        pinkVaseNoFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_no_flower");
        whiteVaseNoFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_no_flower");
        lightGrayVaseNoFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_no_flower");
        grayVaseNoFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_no_flower");
        blackVaseNoFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_no_flower");
        brownVaseNoFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_no_flower");

        //RED VASE
        redVaseRedFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_red_flower");
        redVaseOrangeFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_orange_flower");
        redVaseYellowFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_yellow_flower");
        redVaseGreenFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_green_flower");
        redVaseCyanFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_cyan_flower");
        redVaseBlueFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_blue_flower");
        redVasePurpleFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_purple_flower");
        redVasePinkFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_pink_flower");
        redVaseWhiteFlower = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_white_flower");

        redVaseRedSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_red_sapling");
        redVaseOrangeSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_orange_sapling");
        redVaseYellowSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_yellow_sapling");
        redVaseGreenSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_green_sapling");
        redVaseCyanSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_cyan_sapling");
        redVaseBlueSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_blue_sapling");
        redVasePurpleSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_purple_sapling");
        redVasePinkSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_pink_sapling");
        redVaseWhiteSapling = registerBlock(new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "red_vase_white_sapling");


        //ORANGE VASE
        orangeVaseRedFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_red_flower");
        orangeVaseOrangeFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_orange_flower");
        orangeVaseYellowFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_yellow_flower");
        orangeVaseGreenFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_green_flower");
        orangeVaseCyanFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_cyan_flower");
        orangeVaseBlueFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_blue_flower");
        orangeVasePurpleFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_purple_flower");
        orangeVasePinkFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_pink_flower");
        orangeVaseWhiteFlower = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_white_flower");

        orangeVaseRedSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_red_sapling");
        orangeVaseOrangeSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_orange_sapling");
        orangeVaseYellowSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_yellow_sapling");
        orangeVaseGreenSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_green_sapling");
        orangeVaseCyanSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_cyan_sapling");
        orangeVaseBlueSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_blue_sapling");
        orangeVasePurpleSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_purple_sapling");
        orangeVasePinkSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_pink_sapling");
        orangeVaseWhiteSapling = registerBlock(new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "orange_vase_white_sapling");

        //YELLOW VASE
        yellowVaseRedFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_red_flower");
        yellowVaseOrangeFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_orange_flower");
        yellowVaseYellowFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_yellow_flower");
        yellowVaseGreenFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_green_flower");
        yellowVaseCyanFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_cyan_flower");
        yellowVaseBlueFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_blue_flower");
        yellowVasePurpleFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_purple_flower");
        yellowVasePinkFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_pink_flower");
        yellowVaseWhiteFlower = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_white_flower");

        yellowVaseRedSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_red_sapling");
        yellowVaseOrangeSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_orange_sapling");
        yellowVaseYellowSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_yellow_sapling");
        yellowVaseGreenSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_green_sapling");
        yellowVaseCyanSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_cyan_sapling");
        yellowVaseBlueSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_blue_sapling");
        yellowVasePurpleSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_purple_sapling");
        yellowVasePinkSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_pink_sapling");
        yellowVaseWhiteSapling = registerBlock(new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "yellow_vase_white_sapling");

        //LIME VASE
        limeVaseRedFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_red_flower");
        limeVaseOrangeFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_orange_flower");
        limeVaseYellowFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_yellow_flower");
        limeVaseGreenFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_green_flower");
        limeVaseCyanFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_cyan_flower");
        limeVaseBlueFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_blue_flower");
        limeVasePurpleFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_purple_flower");
        limeVasePinkFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_pink_flower");
        limeVaseWhiteFlower = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_white_flower");

        limeVaseRedSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_red_sapling");
        limeVaseOrangeSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_orange_sapling");
        limeVaseYellowSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_yellow_sapling");
        limeVaseGreenSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_green_sapling");
        limeVaseCyanSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_cyan_sapling");
        limeVaseBlueSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_blue_sapling");
        limeVasePurpleSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_purple_sapling");
        limeVasePinkSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_pink_sapling");
        limeVaseWhiteSapling = registerBlock(new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "lime_vase_white_sapling");

        //GREEN VASE
        greenVaseRedFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_red_flower");
        greenVaseOrangeFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_orange_flower");
        greenVaseYellowFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_yellow_flower");
        greenVaseGreenFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_green_flower");
        greenVaseCyanFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_cyan_flower");
        greenVaseBlueFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_blue_flower");
        greenVasePurpleFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_purple_flower");
        greenVasePinkFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_pink_flower");
        greenVaseWhiteFlower = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_white_flower");

        greenVaseRedSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_red_sapling");
        greenVaseOrangeSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_orange_sapling");
        greenVaseYellowSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_yellow_sapling");
        greenVaseGreenSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_green_sapling");
        greenVaseCyanSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_cyan_sapling");
        greenVaseBlueSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_blue_sapling");
        greenVasePurpleSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_purple_sapling");
        greenVasePinkSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_pink_sapling");
        greenVaseWhiteSapling = registerBlock(new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "green_vase_white_sapling");

        //CYAN VASE
        cyanVaseRedFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_red_flower");
        cyanVaseOrangeFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_orange_flower");
        cyanVaseYellowFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_yellow_flower");
        cyanVaseGreenFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_green_flower");
        cyanVaseCyanFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_cyan_flower");
        cyanVaseBlueFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_blue_flower");
        cyanVasePurpleFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_purple_flower");
        cyanVasePinkFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_pink_flower");
        cyanVaseWhiteFlower = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_white_flower");

        cyanVaseRedSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_red_sapling");
        cyanVaseOrangeSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_orange_sapling");
        cyanVaseYellowSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_yellow_sapling");
        cyanVaseGreenSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_green_sapling");
        cyanVaseCyanSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_cyan_sapling");
        cyanVaseBlueSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_blue_sapling");
        cyanVasePurpleSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_purple_sapling");
        cyanVasePinkSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_pink_sapling");
        cyanVaseWhiteSapling = registerBlock(new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "cyan_vase_white_sapling");

        //LIGHT BLUE VASE
        lightBlueVaseRedFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_red_flower");
        lightBlueVaseOrangeFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_orange_flower");
        lightBlueVaseYellowFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_yellow_flower");
        lightBlueVaseGreenFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_green_flower");
        lightBlueVaseCyanFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_cyan_flower");
        lightBlueVaseBlueFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_blue_flower");
        lightBlueVasePurpleFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_purple_flower");
        lightBlueVasePinkFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_pink_flower");
        lightBlueVaseWhiteFlower = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_white_flower");

        lightBlueVaseRedSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_red_sapling");
        lightBlueVaseOrangeSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_orange_sapling");
        lightBlueVaseYellowSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_yellow_sapling");
        lightBlueVaseGreenSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_green_sapling");
        lightBlueVaseCyanSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_cyan_sapling");
        lightBlueVaseBlueSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_blue_sapling");
        lightBlueVasePurpleSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_purple_sapling");
        lightBlueVasePinkSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_pink_sapling");
        lightBlueVaseWhiteSapling = registerBlock(new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_blue_vase_white_sapling");

        //BLUE VASE
        blueVaseRedFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_red_flower");
        blueVaseOrangeFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_orange_flower");
        blueVaseYellowFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_yellow_flower");
        blueVaseGreenFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_green_flower");
        blueVaseCyanFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_cyan_flower");
        blueVaseBlueFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_blue_flower");
        blueVasePurpleFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_purple_flower");
        blueVasePinkFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_pink_flower");
        blueVaseWhiteFlower = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_white_flower");

        blueVaseRedSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_red_sapling");
        blueVaseOrangeSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_orange_sapling");
        blueVaseYellowSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_yellow_sapling");
        blueVaseGreenSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_green_sapling");
        blueVaseCyanSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_cyan_sapling");
        blueVaseBlueSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_blue_sapling");
        blueVasePurpleSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_purple_sapling");
        blueVasePinkSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_pink_sapling");
        blueVaseWhiteSapling = registerBlock(new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "blue_vase_white_sapling");

        //PURPLE VASE
        purpleVaseRedFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_red_flower");
        purpleVaseOrangeFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_orange_flower");
        purpleVaseYellowFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_yellow_flower");
        purpleVaseGreenFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_green_flower");
        purpleVaseCyanFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_cyan_flower");
        purpleVaseBlueFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_blue_flower");
        purpleVasePurpleFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_purple_flower");
        purpleVasePinkFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_pink_flower");
        purpleVaseWhiteFlower = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_white_flower");

        purpleVaseRedSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_red_sapling");
        purpleVaseOrangeSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_orange_sapling");
        purpleVaseYellowSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_yellow_sapling");
        purpleVaseGreenSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_green_sapling");
        purpleVaseCyanSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_cyan_sapling");
        purpleVaseBlueSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_blue_sapling");
        purpleVasePurpleSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_purple_sapling");
        purpleVasePinkSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_pink_sapling");
        purpleVaseWhiteSapling = registerBlock(new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "purple_vase_white_sapling");

        //MAGENTA VASE
        magentaVaseRedFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_red_flower");
        magentaVaseOrangeFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_orange_flower");
        magentaVaseYellowFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_yellow_flower");
        magentaVaseGreenFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_green_flower");
        magentaVaseCyanFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_cyan_flower");
        magentaVaseBlueFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_blue_flower");
        magentaVasePurpleFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_purple_flower");
        magentaVasePinkFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_pink_flower");
        magentaVaseWhiteFlower = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_white_flower");

        magentaVaseRedSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_red_sapling");
        magentaVaseOrangeSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_orange_sapling");
        magentaVaseYellowSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_yellow_sapling");
        magentaVaseGreenSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_green_sapling");
        magentaVaseCyanSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_cyan_sapling");
        magentaVaseBlueSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_blue_sapling");
        magentaVasePurpleSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_purple_sapling");
        magentaVasePinkSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_pink_sapling");
        magentaVaseWhiteSapling = registerBlock(new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "magenta_vase_white_sapling");

        //PINK VASE
        pinkVaseRedFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_red_flower");
        pinkVaseOrangeFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_orange_flower");
        pinkVaseYellowFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_yellow_flower");
        pinkVaseGreenFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_green_flower");
        pinkVaseCyanFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_cyan_flower");
        pinkVaseBlueFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_blue_flower");
        pinkVasePurpleFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_purple_flower");
        pinkVasePinkFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_pink_flower");
        pinkVaseWhiteFlower = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_white_flower");

        pinkVaseRedSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_red_sapling");
        pinkVaseOrangeSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_orange_sapling");
        pinkVaseYellowSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_yellow_sapling");
        pinkVaseGreenSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_green_sapling");
        pinkVaseCyanSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_cyan_sapling");
        pinkVaseBlueSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_blue_sapling");
        pinkVasePurpleSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_purple_sapling");
        pinkVasePinkSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_pink_sapling");
        pinkVaseWhiteSapling = registerBlock(new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "pink_vase_white_sapling");

        //WHITE VASE
        whiteVaseRedFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_red_flower");
        whiteVaseOrangeFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_orange_flower");
        whiteVaseYellowFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_yellow_flower");
        whiteVaseGreenFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_green_flower");
        whiteVaseCyanFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_cyan_flower");
        whiteVaseBlueFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_blue_flower");
        whiteVasePurpleFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_purple_flower");
        whiteVasePinkFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_pink_flower");
        whiteVaseWhiteFlower = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_white_flower");

        whiteVaseRedSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_red_sapling");
        whiteVaseOrangeSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_orange_sapling");
        whiteVaseYellowSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_yellow_sapling");
        whiteVaseGreenSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_green_sapling");
        whiteVaseCyanSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_cyan_sapling");
        whiteVaseBlueSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_blue_sapling");
        whiteVasePurpleSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_purple_sapling");
        whiteVasePinkSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_pink_sapling");
        whiteVaseWhiteSapling = registerBlock(new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "white_vase_white_sapling");

        //LIGHT GRAY VASE
        lightGrayVaseRedFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_red_flower");
        lightGrayVaseOrangeFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_orange_flower");
        lightGrayVaseYellowFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_yellow_flower");
        lightGrayVaseGreenFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_green_flower");
        lightGrayVaseCyanFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_cyan_flower");
        lightGrayVaseBlueFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_blue_flower");
        lightGrayVasePurpleFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_purple_flower");
        lightGrayVasePinkFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_pink_flower");
        lightGrayVaseWhiteFlower = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_white_flower");

        lightGrayVaseRedSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_red_sapling");
        lightGrayVaseOrangeSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_orange_sapling");
        lightGrayVaseYellowSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_yellow_sapling");
        lightGrayVaseGreenSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_green_sapling");
        lightGrayVaseCyanSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_cyan_sapling");
        lightGrayVaseBlueSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_blue_sapling");
        lightGrayVasePurpleSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_purple_sapling");
        lightGrayVasePinkSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_pink_sapling");
        lightGrayVaseWhiteSapling = registerBlock(new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "light_gray_vase_white_sapling");

        //GRAY VASE
        grayVaseRedFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_red_flower");
        grayVaseOrangeFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_orange_flower");
        grayVaseYellowFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_yellow_flower");
        grayVaseGreenFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_green_flower");
        grayVaseCyanFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_cyan_flower");
        grayVaseBlueFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_blue_flower");
        grayVasePurpleFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_purple_flower");
        grayVasePinkFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_pink_flower");
        grayVaseWhiteFlower = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_white_flower");

        grayVaseRedSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_red_sapling");
        grayVaseOrangeSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_orange_sapling");
        grayVaseYellowSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_yellow_sapling");
        grayVaseGreenSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_green_sapling");
        grayVaseCyanSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_cyan_sapling");
        grayVaseBlueSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_blue_sapling");
        grayVasePurpleSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_purple_sapling");
        grayVasePinkSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_pink_sapling");
        grayVaseWhiteSapling = registerBlock(new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "gray_vase_white_sapling");

        //BLACK VASE
        blackVaseRedFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_red_flower");
        blackVaseOrangeFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_orange_flower");
        blackVaseYellowFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_yellow_flower");
        blackVaseGreenFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_green_flower");
        blackVaseCyanFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_cyan_flower");
        blackVaseBlueFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_blue_flower");
        blackVasePurpleFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_purple_flower");
        blackVasePinkFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_pink_flower");
        blackVaseWhiteFlower = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_white_flower");

        blackVaseRedSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_red_sapling");
        blackVaseOrangeSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_orange_sapling");
        blackVaseYellowSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_yellow_sapling");
        blackVaseGreenSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_green_sapling");
        blackVaseCyanSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_cyan_sapling");
        blackVaseBlueSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_blue_sapling");
        blackVasePurpleSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_purple_sapling");
        blackVasePinkSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_pink_sapling");
        blackVaseWhiteSapling = registerBlock(new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "black_vase_white_sapling");

        //BROWN VASE
        brownVaseRedFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_red_flower");
        brownVaseOrangeFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_orange_flower");
        brownVaseYellowFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_yellow_flower");
        brownVaseGreenFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_green_flower");
        brownVaseCyanFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_cyan_flower");
        brownVaseBlueFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_blue_flower");
        brownVasePurpleFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_purple_flower");
        brownVasePinkFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_pink_flower");
        brownVaseWhiteFlower = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_white_flower");

        brownVaseRedSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_red_sapling");
        brownVaseOrangeSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_orange_sapling");
        brownVaseYellowSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_yellow_sapling");
        brownVaseGreenSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_green_sapling");
        brownVaseCyanSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_cyan_sapling");
        brownVaseBlueSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_blue_sapling");
        brownVasePurpleSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_purple_sapling");
        brownVasePinkSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_pink_sapling");
        brownVaseWhiteSapling = registerBlock(new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), "brown_vase_white_sapling");



    //ORES
        Block amethystOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "amethyst_ore");
        Block aventurineOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "aventurine_ore");
        Block carnelianOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "carnelian_ore");
        Block chalcopyriteOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "chalcopyrite_ore");
        Block citrineOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "citrine_ore");
        Block jadeOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "jade_ore");
        Block jasperOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "jasper_ore");
        Block labradoriteOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "labradorite_ore");
        Block micaOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "mica_ore");
        Block moonstoneOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "moonstone_ore");
        Block roseQuartzOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "rose_quartz_ore");
        Block sodaliteOre = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "sodalite_ore");

        Block amethystOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "amethyst_ore_nether");
        Block aventurineOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "aventurine_ore_nether");
        Block carnelianOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "carnelian_ore_nether");
        Block chalcopyriteOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "chalcopyrite_ore_nether");
        Block citrineOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "citrine_ore_nether");
        Block jadeOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "jade_ore_nether");
        Block jasperOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "jasper_ore_nether");
        Block labradoriteOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "labradorite_ore_nether");
        Block micaOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "mica_ore_nether");
        Block moonstoneOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "moonstone_ore_nether");
        Block roseQuartzOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "rose_quartz_ore_nether");
        Block sodaliteOreNether = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "sodalite_ore_nether");

        Block amethystOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "amethyst_ore_end");
        Block aventurineOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "aventurine_ore_end");
        Block carnelianOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "carnelian_ore_end");
        Block chalcopyriteOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "chalcopyrite_ore_end");
        Block citrineOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "citrine_ore_end");
        Block jadeOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "jade_ore_end");
        Block jasperOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "jasper_ore_end");
        Block labradoriteOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "labradorite_ore_end");
        Block micaOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "mica_ore_end");
        Block moonstoneOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "moonstone_ore_end");
        Block roseQuartzOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "rose_quartz_ore_end");
        Block sodaliteOreEnd = registerBlock(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0F, 4.0F)), "sodalite_ore_end");

    //GEM BLOCKS
        Block amethystBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_block");
        Block aventurineBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_block");
        Block carnelianBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_block");
        Block chalcopyriteBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_block");
        Block citrineBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_block");
        Block jadeBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_block");
        Block jasperBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_block");
        Block labradoriteBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_block");
        Block micaBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_block");
        Block moonstoneBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_block");
        Block roseQuartzBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_block");
        Block sodaliteBlock = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_block");

        //tile1
        Block amethystTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_tile_1");
        Block aventurineTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_tile_1");
        Block carnelianTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_tile_1");
        Block chalcopyriteTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_tile_1");
        Block citrineTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_tile_1");
        Block jadeTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_tile_1");
        Block jasperTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_tile_1");
        Block labradoriteTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_tile_1");
        Block micaTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_tile_1");
        Block moonstoneTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_tile_1");
        Block roseQuartzTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_tile_1");
        Block sodaliteTile1 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_tile_1");

        //tile1 stairs
        Block amethystTile1Stairs = registerBlock(new CustomStairs(amethystTile1.getDefaultState(), Block.Properties.from(amethystTile1)), "amethyst_tile_1_stairs");
        Block aventurineTile1Stairs = registerBlock(new CustomStairs(aventurineTile1.getDefaultState(), Block.Properties.from(aventurineTile1)), "aventurine_tile_1_stairs");
        Block carnelianTile1Stairs = registerBlock(new CustomStairs(carnelianTile1.getDefaultState(), Block.Properties.from(carnelianTile1)), "carnelian_tile_1_stairs");
        Block chalcopyriteTile1Stairs = registerBlock(new CustomStairs(chalcopyriteTile1.getDefaultState(), Block.Properties.from(chalcopyriteTile1)), "chalcopyrite_tile_1_stairs");
        Block citrineTile1Stairs = registerBlock(new CustomStairs(citrineTile1.getDefaultState(), Block.Properties.from(citrineTile1)), "citrine_tile_1_stairs");
        Block jadeTile1Stairs = registerBlock(new CustomStairs(jadeTile1.getDefaultState(), Block.Properties.from(jadeTile1)), "jade_tile_1_stairs");
        Block jasperTile1Stairs = registerBlock(new CustomStairs(jasperTile1.getDefaultState(), Block.Properties.from(jasperTile1)), "jasper_tile_1_stairs");
        Block labradoriteTile1Stairs = registerBlock(new CustomStairs(labradoriteTile1.getDefaultState(), Block.Properties.from(labradoriteTile1)), "labradorite_tile_1_stairs");
        Block micaTile1Stairs = registerBlock(new CustomStairs(micaTile1.getDefaultState(), Block.Properties.from(micaTile1)), "mica_tile_1_stairs");
        Block moonstoneTile1Stairs = registerBlock(new CustomStairs(moonstoneTile1.getDefaultState(), Block.Properties.from(moonstoneTile1)), "moonstone_tile_1_stairs");
        Block roseQuartzTile1Stairs = registerBlock(new CustomStairs(roseQuartzTile1.getDefaultState(), Block.Properties.from(roseQuartzTile1)), "rose_quartz_tile_1_stairs");
        Block sodaliteTile1Stairs = registerBlock(new CustomStairs(sodaliteTile1.getDefaultState(), Block.Properties.from(sodaliteTile1)), "sodalite_tile_1_stairs");

        //tile1 slabs
        Block amethystSlab1 = registerBlock(new SlabBlock(Block.Properties.from(amethystTile1)), "amethyst_tile_1_slab");
        Block aventurineSlab1 = registerBlock(new SlabBlock(Block.Properties.from(aventurineTile1)), "aventurine_tile_1_slab");
        Block carnelianSlab1 = registerBlock(new SlabBlock(Block.Properties.from(carnelianTile1)), "carnelian_tile_1_slab");
        Block chalcopyriteSlab1 = registerBlock(new SlabBlock(Block.Properties.from(chalcopyriteTile1)), "chalcopyrite_tile_1_slab");
        Block citrineSlab1 = registerBlock(new SlabBlock(Block.Properties.from(citrineTile1)), "citrine_tile_1_slab");
        Block jadeSlab1 = registerBlock(new SlabBlock(Block.Properties.from(jadeTile1)), "jade_tile_1_slab");
        Block jasperSlab1 = registerBlock(new SlabBlock(Block.Properties.from(jasperTile1)), "jasper_tile_1_slab");
        Block labradoriteSlab1 = registerBlock(new SlabBlock(Block.Properties.from(labradoriteTile1)), "labradorite_tile_1_slab");
        Block micaSlab1 = registerBlock(new SlabBlock(Block.Properties.from(micaTile1)), "mica_tile_1_slab");
        Block moonstoneSlab1 = registerBlock(new SlabBlock(Block.Properties.from(moonstoneTile1)), "moonstone_tile_1_slab");
        Block roseQuartzSlab1 = registerBlock(new SlabBlock(Block.Properties.from(roseQuartzTile1)), "rose_quartz_tile_1_slab");
        Block sodaliteSlab1 = registerBlock(new SlabBlock(Block.Properties.from(sodaliteTile1)), "sodalite_tile_1_slab");

        //tile2
        Block amethystTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_tile_2");
        Block aventurineTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_tile_2");
        Block carnelianTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_tile_2");
        Block chalcopyriteTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_tile_2");
        Block citrineTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_tile_2");
        Block jadeTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_tile_2");
        Block jasperTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_tile_2");
        Block labradoriteTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_tile_2");
        Block micaTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_tile_2");
        Block moonstoneTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_tile_2");
        Block roseQuartzTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_tile_2");
        Block sodaliteTile2 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_tile_2");

        //tile2 stairs
        Block amethystTile2Stairs = registerBlock(new CustomStairs(amethystTile2.getDefaultState(), Block.Properties.from(amethystTile2)), "amethyst_tile_2_stairs");
        Block aventurineTile2Stairs = registerBlock(new CustomStairs(aventurineTile2.getDefaultState(), Block.Properties.from(aventurineTile2)), "aventurine_tile_2_stairs");
        Block carnelianTile2Stairs = registerBlock(new CustomStairs(carnelianTile2.getDefaultState(), Block.Properties.from(carnelianTile2)), "carnelian_tile_2_stairs");
        Block chalcopyriteTile2Stairs = registerBlock(new CustomStairs(chalcopyriteTile2.getDefaultState(), Block.Properties.from(chalcopyriteTile2)), "chalcopyrite_tile_2_stairs");
        Block citrineTile2Stairs = registerBlock(new CustomStairs(citrineTile2.getDefaultState(), Block.Properties.from(citrineTile2)), "citrine_tile_2_stairs");
        Block jadeTile2Stairs = registerBlock(new CustomStairs(jadeTile2.getDefaultState(), Block.Properties.from(jadeTile2)), "jade_tile_2_stairs");
        Block jasperTile2Stairs = registerBlock(new CustomStairs(jasperTile2.getDefaultState(), Block.Properties.from(jasperTile2)), "jasper_tile_2_stairs");
        Block labradoriteTile2Stairs = registerBlock(new CustomStairs(labradoriteTile2.getDefaultState(), Block.Properties.from(labradoriteTile2)), "labradorite_tile_2_stairs");
        Block micaTile2Stairs = registerBlock(new CustomStairs(micaTile2.getDefaultState(), Block.Properties.from(micaTile2)), "mica_tile_2_stairs");
        Block moonstoneTile2Stairs = registerBlock(new CustomStairs(moonstoneTile2.getDefaultState(), Block.Properties.from(moonstoneTile2)), "moonstone_tile_2_stairs");
        Block roseQuartzTile2Stairs = registerBlock(new CustomStairs(roseQuartzTile2.getDefaultState(), Block.Properties.from(roseQuartzTile2)), "rose_quartz_tile_2_stairs");
        Block sodaliteTile2Stairs = registerBlock(new CustomStairs(sodaliteTile2.getDefaultState(), Block.Properties.from(sodaliteTile2)), "sodalite_tile_2_stairs");

        //tile2 slabs
        Block amethystSlab2 = registerBlock(new SlabBlock(Block.Properties.from(amethystTile2)), "amethyst_tile_2_slab");
        Block aventurineSlab2 = registerBlock(new SlabBlock(Block.Properties.from(aventurineTile2)), "aventurine_tile_2_slab");
        Block carnelianSlab2 = registerBlock(new SlabBlock(Block.Properties.from(carnelianTile2)), "carnelian_tile_2_slab");
        Block chalcopyriteSlab2 = registerBlock(new SlabBlock(Block.Properties.from(chalcopyriteTile2)), "chalcopyrite_tile_2_slab");
        Block citrineSlab2 = registerBlock(new SlabBlock(Block.Properties.from(citrineTile2)), "citrine_tile_2_slab");
        Block jadeSlab2 = registerBlock(new SlabBlock(Block.Properties.from(jadeTile2)), "jade_tile_2_slab");
        Block jasperSlab2 = registerBlock(new SlabBlock(Block.Properties.from(jasperTile2)), "jasper_tile_2_slab");
        Block labradoriteSlab2 = registerBlock(new SlabBlock(Block.Properties.from(labradoriteTile2)), "labradorite_tile_2_slab");
        Block micaSlab2 = registerBlock(new SlabBlock(Block.Properties.from(micaTile2)), "mica_tile_2_slab");
        Block moonstoneSlab2 = registerBlock(new SlabBlock(Block.Properties.from(moonstoneTile2)), "moonstone_tile_2_slab");
        Block roseQuartzSlab2 = registerBlock(new SlabBlock(Block.Properties.from(roseQuartzTile2)), "rose_quartz_tile_2_slab");
        Block sodaliteSlab2 = registerBlock(new SlabBlock(Block.Properties.from(sodaliteTile2)), "sodalite_tile_2_slab");

        //tile3
        Block amethystTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_tile_3");
        Block aventurineTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_tile_3");
        Block carnelianTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_tile_3");
        Block chalcopyriteTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_tile_3");
        Block citrineTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_tile_3");
        Block jadeTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_tile_3");
        Block jasperTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_tile_3");
        Block labradoriteTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_tile_3");
        Block micaTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_tile_3");
        Block moonstoneTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_tile_3");
        Block roseQuartzTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_tile_3");
        Block sodaliteTile3 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_tile_3");

        //tile3 stairs
        Block amethystTile3Stairs = registerBlock(new CustomStairs(amethystTile3.getDefaultState(), Block.Properties.from(amethystTile3)), "amethyst_tile_3_stairs");
        Block aventurineTile3Stairs = registerBlock(new CustomStairs(aventurineTile3.getDefaultState(), Block.Properties.from(aventurineTile3)), "aventurine_tile_3_stairs");
        Block carnelianTile3Stairs = registerBlock(new CustomStairs(carnelianTile3.getDefaultState(), Block.Properties.from(carnelianTile3)), "carnelian_tile_3_stairs");
        Block chalcopyriteTile3Stairs = registerBlock(new CustomStairs(chalcopyriteTile3.getDefaultState(), Block.Properties.from(chalcopyriteTile3)), "chalcopyrite_tile_3_stairs");
        Block citrineTile3Stairs = registerBlock(new CustomStairs(citrineTile3.getDefaultState(), Block.Properties.from(citrineTile3)), "citrine_tile_3_stairs");
        Block jadeTile3Stairs = registerBlock(new CustomStairs(jadeTile3.getDefaultState(), Block.Properties.from(jadeTile3)), "jade_tile_3_stairs");
        Block jasperTile3Stairs = registerBlock(new CustomStairs(jasperTile3.getDefaultState(), Block.Properties.from(jasperTile3)), "jasper_tile_3_stairs");
        Block labradoriteTile3Stairs = registerBlock(new CustomStairs(labradoriteTile3.getDefaultState(), Block.Properties.from(labradoriteTile3)), "labradorite_tile_3_stairs");
        Block micaTile3Stairs = registerBlock(new CustomStairs(micaTile3.getDefaultState(), Block.Properties.from(micaTile3)), "mica_tile_3_stairs");
        Block moonstoneTile3Stairs = registerBlock(new CustomStairs(moonstoneTile3.getDefaultState(), Block.Properties.from(moonstoneTile3)), "moonstone_tile_3_stairs");
        Block roseQuartzTile3Stairs = registerBlock(new CustomStairs(roseQuartzTile3.getDefaultState(), Block.Properties.from(roseQuartzTile3)), "rose_quartz_tile_3_stairs");
        Block sodaliteTile3Stairs = registerBlock(new CustomStairs(sodaliteTile3.getDefaultState(), Block.Properties.from(sodaliteTile3)), "sodalite_tile_3_stairs");

        //tile3 slabs
        Block amethystSlab3 = registerBlock(new SlabBlock(Block.Properties.from(amethystTile3)), "amethyst_tile_3_slab");
        Block aventurineSlab3 = registerBlock(new SlabBlock(Block.Properties.from(aventurineTile3)), "aventurine_tile_3_slab");
        Block carnelianSlab3 = registerBlock(new SlabBlock(Block.Properties.from(carnelianTile3)), "carnelian_tile_3_slab");
        Block chalcopyriteSlab3 = registerBlock(new SlabBlock(Block.Properties.from(chalcopyriteTile3)), "chalcopyrite_tile_3_slab");
        Block citrineSlab3 = registerBlock(new SlabBlock(Block.Properties.from(citrineTile3)), "citrine_tile_3_slab");
        Block jadeSlab3 = registerBlock(new SlabBlock(Block.Properties.from(jadeTile3)), "jade_tile_3_slab");
        Block jasperSlab3 = registerBlock(new SlabBlock(Block.Properties.from(jasperTile3)), "jasper_tile_3_slab");
        Block labradoriteSlab3 = registerBlock(new SlabBlock(Block.Properties.from(labradoriteTile3)), "labradorite_tile_3_slab");
        Block micaSlab3 = registerBlock(new SlabBlock(Block.Properties.from(micaTile3)), "mica_tile_3_slab");
        Block moonstoneSlab3 = registerBlock(new SlabBlock(Block.Properties.from(moonstoneTile3)), "moonstone_tile_3_slab");
        Block roseQuartzSlab3 = registerBlock(new SlabBlock(Block.Properties.from(roseQuartzTile3)), "rose_quartz_tile_3_slab");
        Block sodaliteSlab3 = registerBlock(new SlabBlock(Block.Properties.from(sodaliteTile3)), "sodalite_tile_3_slab");

        //tile4
        Block amethystTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_tile_4");
        Block aventurineTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_tile_4");
        Block carnelianTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_tile_4");
        Block chalcopyriteTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_tile_4");
        Block citrineTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_tile_4");
        Block jadeTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_tile_4");
        Block jasperTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_tile_4");
        Block labradoriteTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_tile_4");
        Block micaTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_tile_4");
        Block moonstoneTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_tile_4");
        Block roseQuartzTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_tile_4");
        Block sodaliteTile4 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_tile_4");

        //tile4 stairs
        Block amethystTile4Stairs = registerBlock(new CustomStairs(amethystTile4.getDefaultState(), Block.Properties.from(amethystTile4)), "amethyst_tile_4_stairs");
        Block aventurineTile4Stairs = registerBlock(new CustomStairs(aventurineTile4.getDefaultState(), Block.Properties.from(aventurineTile4)), "aventurine_tile_4_stairs");
        Block carnelianTile4Stairs = registerBlock(new CustomStairs(carnelianTile4.getDefaultState(), Block.Properties.from(carnelianTile4)), "carnelian_tile_4_stairs");
        Block chalcopyriteTile4Stairs = registerBlock(new CustomStairs(chalcopyriteTile4.getDefaultState(), Block.Properties.from(chalcopyriteTile4)), "chalcopyrite_tile_4_stairs");
        Block citrineTile4Stairs = registerBlock(new CustomStairs(citrineTile4.getDefaultState(), Block.Properties.from(citrineTile4)), "citrine_tile_4_stairs");
        Block jadeTile4Stairs = registerBlock(new CustomStairs(jadeTile4.getDefaultState(), Block.Properties.from(jadeTile4)), "jade_tile_4_stairs");
        Block jasperTile4Stairs = registerBlock(new CustomStairs(jasperTile4.getDefaultState(), Block.Properties.from(jasperTile4)), "jasper_tile_4_stairs");
        Block labradoriteTile4Stairs = registerBlock(new CustomStairs(labradoriteTile4.getDefaultState(), Block.Properties.from(labradoriteTile4)), "labradorite_tile_4_stairs");
        Block micaTile4Stairs = registerBlock(new CustomStairs(micaTile4.getDefaultState(), Block.Properties.from(micaTile4)), "mica_tile_4_stairs");
        Block moonstoneTile4Stairs = registerBlock(new CustomStairs(moonstoneTile4.getDefaultState(), Block.Properties.from(moonstoneTile4)), "moonstone_tile_4_stairs");
        Block roseQuartzTile4Stairs = registerBlock(new CustomStairs(roseQuartzTile4.getDefaultState(), Block.Properties.from(roseQuartzTile4)), "rose_quartz_tile_4_stairs");
        Block sodaliteTile4Stairs = registerBlock(new CustomStairs(sodaliteTile4.getDefaultState(), Block.Properties.from(sodaliteTile4)), "sodalite_tile_4_stairs");

        //tile4 slabs
        Block amethystSlab4 = registerBlock(new SlabBlock(Block.Properties.from(amethystTile4)), "amethyst_tile_4_slab");
        Block aventurineSlab4 = registerBlock(new SlabBlock(Block.Properties.from(aventurineTile4)), "aventurine_tile_4_slab");
        Block carnelianSlab4 = registerBlock(new SlabBlock(Block.Properties.from(carnelianTile4)), "carnelian_tile_4_slab");
        Block chalcopyriteSlab4 = registerBlock(new SlabBlock(Block.Properties.from(chalcopyriteTile4)), "chalcopyrite_tile_4_slab");
        Block citrineSlab4 = registerBlock(new SlabBlock(Block.Properties.from(citrineTile4)), "citrine_tile_4_slab");
        Block jadeSlab4 = registerBlock(new SlabBlock(Block.Properties.from(jadeTile4)), "jade_tile_4_slab");
        Block jasperSlab4 = registerBlock(new SlabBlock(Block.Properties.from(jasperTile4)), "jasper_tile_4_slab");
        Block labradoriteSlab4 = registerBlock(new SlabBlock(Block.Properties.from(labradoriteTile4)), "labradorite_tile_4_slab");
        Block micaSlab4 = registerBlock(new SlabBlock(Block.Properties.from(micaTile4)), "mica_tile_4_slab");
        Block moonstoneSlab4 = registerBlock(new SlabBlock(Block.Properties.from(moonstoneTile4)), "moonstone_tile_4_slab");
        Block roseQuartzSlab4 = registerBlock(new SlabBlock(Block.Properties.from(roseQuartzTile4)), "rose_quartz_tile_4_slab");
        Block sodaliteSlab4 = registerBlock(new SlabBlock(Block.Properties.from(sodaliteTile4)), "sodalite_tile_4_slab");

        //tile5
        Block amethystTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_tile_5");
        Block aventurineTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_tile_5");
        Block carnelianTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_tile_5");
        Block chalcopyriteTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_tile_5");
        Block citrineTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_tile_5");
        Block jadeTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_tile_5");
        Block jasperTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_tile_5");
        Block labradoriteTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_tile_5");
        Block micaTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_tile_5");
        Block moonstoneTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_tile_5");
        Block roseQuartzTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_tile_5");
        Block sodaliteTile5 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_tile_5");

        //tile5 stairs
        Block amethystTile5Stairs = registerBlock(new CustomStairs(amethystTile5.getDefaultState(), Block.Properties.from(amethystTile5)), "amethyst_tile_5_stairs");
        Block aventurineTile5Stairs = registerBlock(new CustomStairs(aventurineTile5.getDefaultState(), Block.Properties.from(aventurineTile5)), "aventurine_tile_5_stairs");
        Block carnelianTile5Stairs = registerBlock(new CustomStairs(carnelianTile5.getDefaultState(), Block.Properties.from(carnelianTile5)), "carnelian_tile_5_stairs");
        Block chalcopyriteTile5Stairs = registerBlock(new CustomStairs(chalcopyriteTile5.getDefaultState(), Block.Properties.from(chalcopyriteTile5)), "chalcopyrite_tile_5_stairs");
        Block citrineTile5Stairs = registerBlock(new CustomStairs(citrineTile5.getDefaultState(), Block.Properties.from(citrineTile5)), "citrine_tile_5_stairs");
        Block jadeTile5Stairs = registerBlock(new CustomStairs(jadeTile5.getDefaultState(), Block.Properties.from(jadeTile5)), "jade_tile_5_stairs");
        Block jasperTile5Stairs = registerBlock(new CustomStairs(jasperTile5.getDefaultState(), Block.Properties.from(jasperTile5)), "jasper_tile_5_stairs");
        Block labradoriteTile5Stairs = registerBlock(new CustomStairs(labradoriteTile5.getDefaultState(), Block.Properties.from(labradoriteTile5)), "labradorite_tile_5_stairs");
        Block micaTile5Stairs = registerBlock(new CustomStairs(micaTile5.getDefaultState(), Block.Properties.from(micaTile5)), "mica_tile_5_stairs");
        Block moonstoneTile5Stairs = registerBlock(new CustomStairs(moonstoneTile5.getDefaultState(), Block.Properties.from(moonstoneTile5)), "moonstone_tile_5_stairs");
        Block roseQuartzTile5Stairs = registerBlock(new CustomStairs(roseQuartzTile5.getDefaultState(), Block.Properties.from(roseQuartzTile5)), "rose_quartz_tile_5_stairs");
        Block sodaliteTile5Stairs = registerBlock(new CustomStairs(sodaliteTile5.getDefaultState(), Block.Properties.from(sodaliteTile5)), "sodalite_tile_5_stairs");

        //tile5 slabs
        Block amethystSlab5 = registerBlock(new SlabBlock(Block.Properties.from(amethystTile5)), "amethyst_tile_5_slab");
        Block aventurineSlab5 = registerBlock(new SlabBlock(Block.Properties.from(aventurineTile5)), "aventurine_tile_5_slab");
        Block carnelianSlab5 = registerBlock(new SlabBlock(Block.Properties.from(carnelianTile5)), "carnelian_tile_5_slab");
        Block chalcopyriteSlab5 = registerBlock(new SlabBlock(Block.Properties.from(chalcopyriteTile5)), "chalcopyrite_tile_5_slab");
        Block citrineSlab5 = registerBlock(new SlabBlock(Block.Properties.from(citrineTile5)), "citrine_tile_5_slab");
        Block jadeSlab5 = registerBlock(new SlabBlock(Block.Properties.from(jadeTile5)), "jade_tile_5_slab");
        Block jasperSlab5 = registerBlock(new SlabBlock(Block.Properties.from(jasperTile5)), "jasper_tile_5_slab");
        Block labradoriteSlab5 = registerBlock(new SlabBlock(Block.Properties.from(labradoriteTile5)), "labradorite_tile_5_slab");
        Block micaSlab5 = registerBlock(new SlabBlock(Block.Properties.from(micaTile5)), "mica_tile_5_slab");
        Block moonstoneSlab5 = registerBlock(new SlabBlock(Block.Properties.from(moonstoneTile5)), "moonstone_tile_5_slab");
        Block roseQuartzSlab5 = registerBlock(new SlabBlock(Block.Properties.from(roseQuartzTile5)), "rose_quartz_tile_5_slab");
        Block sodaliteSlab5 = registerBlock(new SlabBlock(Block.Properties.from(sodaliteTile5)), "sodalite_tile_5_slab");

        //tile6
        Block amethystTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "amethyst_tile_6");
        Block aventurineTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "aventurine_tile_6");
        Block carnelianTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "carnelian_tile_6");
        Block chalcopyriteTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "chalcopyrite_tile_6");
        Block citrineTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "citrine_tile_6");
        Block jadeTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jade_tile_6");
        Block jasperTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "jasper_tile_6");
        Block labradoriteTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "labradorite_tile_6");
        Block micaTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "mica_tile_6");
        Block moonstoneTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "moonstone_tile_6");
        Block roseQuartzTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "rose_quartz_tile_6");
        Block sodaliteTile6 = registerBlock(new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)), "sodalite_tile_6");

        //tile6 stairs
        Block amethystTile6Stairs = registerBlock(new CustomStairs(amethystTile6.getDefaultState(), Block.Properties.from(amethystTile6)), "amethyst_tile_6_stairs");
        Block aventurineTile6Stairs = registerBlock(new CustomStairs(aventurineTile6.getDefaultState(), Block.Properties.from(aventurineTile6)), "aventurine_tile_6_stairs");
        Block carnelianTile6Stairs = registerBlock(new CustomStairs(carnelianTile6.getDefaultState(), Block.Properties.from(carnelianTile6)), "carnelian_tile_6_stairs");
        Block chalcopyriteTile6Stairs = registerBlock(new CustomStairs(chalcopyriteTile6.getDefaultState(), Block.Properties.from(chalcopyriteTile6)), "chalcopyrite_tile_6_stairs");
        Block citrineTile6Stairs = registerBlock(new CustomStairs(citrineTile6.getDefaultState(), Block.Properties.from(citrineTile6)), "citrine_tile_6_stairs");
        Block jadeTile6Stairs = registerBlock(new CustomStairs(jadeTile6.getDefaultState(), Block.Properties.from(jadeTile6)), "jade_tile_6_stairs");
        Block jasperTile6Stairs = registerBlock(new CustomStairs(jasperTile6.getDefaultState(), Block.Properties.from(jasperTile6)), "jasper_tile_6_stairs");
        Block labradoriteTile6Stairs = registerBlock(new CustomStairs(labradoriteTile6.getDefaultState(), Block.Properties.from(labradoriteTile6)), "labradorite_tile_6_stairs");
        Block micaTile6Stairs = registerBlock(new CustomStairs(micaTile6.getDefaultState(), Block.Properties.from(micaTile6)), "mica_tile_6_stairs");
        Block moonstoneTile6Stairs = registerBlock(new CustomStairs(moonstoneTile6.getDefaultState(), Block.Properties.from(moonstoneTile6)), "moonstone_tile_6_stairs");
        Block roseQuartzTile6Stairs = registerBlock(new CustomStairs(roseQuartzTile6.getDefaultState(), Block.Properties.from(roseQuartzTile6)), "rose_quartz_tile_6_stairs");
        Block sodaliteTile6Stairs = registerBlock(new CustomStairs(sodaliteTile6.getDefaultState(), Block.Properties.from(sodaliteTile6)), "sodalite_tile_6_stairs");

        //tile6 slabs
        Block amethystSlab6 = registerBlock(new SlabBlock(Block.Properties.from(amethystTile6)), "amethyst_tile_6_slab");
        Block aventurineSlab6 = registerBlock(new SlabBlock(Block.Properties.from(aventurineTile6)), "aventurine_tile_6_slab");
        Block carnelianSlab6 = registerBlock(new SlabBlock(Block.Properties.from(carnelianTile6)), "carnelian_tile_6_slab");
        Block chalcopyriteSlab6 = registerBlock(new SlabBlock(Block.Properties.from(chalcopyriteTile6)), "chalcopyrite_tile_6_slab");
        Block citrineSlab6 = registerBlock(new SlabBlock(Block.Properties.from(citrineTile6)), "citrine_tile_6_slab");
        Block jadeSlab6 = registerBlock(new SlabBlock(Block.Properties.from(jadeTile6)), "jade_tile_6_slab");
        Block jasperSlab6 = registerBlock(new SlabBlock(Block.Properties.from(jasperTile6)), "jasper_tile_6_slab");
        Block labradoriteSlab6 = registerBlock(new SlabBlock(Block.Properties.from(labradoriteTile6)), "labradorite_tile_6_slab");
        Block micaSlab6 = registerBlock(new SlabBlock(Block.Properties.from(micaTile6)), "mica_tile_6_slab");
        Block moonstoneSlab6 = registerBlock(new SlabBlock(Block.Properties.from(moonstoneTile6)), "moonstone_tile_6_slab");
        Block roseQuartzSlab6 = registerBlock(new SlabBlock(Block.Properties.from(roseQuartzTile6)), "rose_quartz_tile_6_slab");
        Block sodaliteSlab6 = registerBlock(new SlabBlock(Block.Properties.from(sodaliteTile6)), "sodalite_tile_6_slab");


        //clay blocks
        Block redClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "red_clay_block");
        Block orangeClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "orange_clay_block");
        Block yellowClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "yellow_clay_block");
        Block limeClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "lime_clay_block");
        Block greenClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "green_clay_block");
        Block cyanClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "cyan_clay_block");
        Block lightBlueClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_blue_clay_block");
        Block blueClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "blue_clay_block");
        Block purpleClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "purple_clay_block");
        Block magentaClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "magenta_clay_block");
        Block pinkClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "pink_clay_block");
        Block whiteClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "white_clay_block");
        Block lightGrayClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_gray_clay_block");
        Block grayClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "gray_clay_block");
        Block blackClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "black_clay_block");
        Block brownClayBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "brown_clay_block");






        //log
        crabappleLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "crabapple_log");
        poincianaLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "poinciana_log");
        laburnumLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "laburnum_log");
        jadeLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jade_log");
        paulowniaLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "paulownia_log");
        wisteriaLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "wisteria_log");
        jacarandaLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jacaranda_log");
        dogwoodLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "dogwood_log");
        silverbellLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "silverbell_log");


        //leaves
        crabappleLeaves = registerBlock(new BlockCrabappleLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "crabapple_leaves");
        laburnumLeaves = registerBlock(new BlockLaburnumLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "laburnum_leaves");
        poincianaLeaves = registerBlock(new BlockPoincianaLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "poinciana_leaves");
        jadeLeaves = registerBlock(new BlockJadeLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "jade_leaves");
        paulowniaLeaves = registerBlock(new BlockPaulowniaLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "paulownia_leaves");
        wisteriaLeaves = registerBlock(new BlockWisteriaLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "wisteria_leaves");
        jacarandaLeaves = registerBlock(new BlockJacarandaLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "jacaranda_leaves");
        dogwoodLeaves = registerBlock(new BlockDogwoodLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "dogwood_leaves");
        silverbellLeaves = registerBlock(new BlockSilverbellLeaves(Block.Properties.create(Material.LEAVES).hardnessAndResistance(1.0F, 0.0F)), "silverbell_leaves");


        //sapling
        crabappleSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.RED)),"crabapple_sapling");
        laburnumSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.YELLOW)),"laburnum_sapling");
        poincianaSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.ORANGE)),"poinciana_sapling");
        jadeSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.GREEN)),"jade_sapling");
        paulowniaSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.TEAL)),"paulownia_sapling");
        wisteriaSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.BLUE)),"wisteria_sapling");
        jacarandaSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PURPLE)),"jacaranda_sapling");
        dogwoodSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PINK)),"dogwood_sapling");
        silverbellSapling = registerBlock(new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.WHITE)),"silverbell_sapling");


        //vine
        crabappleVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "crabapple_vine");
        poincianaVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "poinciana_vine");
        laburnumVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "laburnum_vine");
        jadeVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "jade_vine");
        paulowniaVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "paulownia_vine");
        wisteriaVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "wisteria_vine");
        jacarandaVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "jacaranda_vine");
        dogwoodVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "dogwood_vine");
        silverbellVine = registerBlock(new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), "silverbell_vine");


        //wood
        Block crabappleWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "crabapple_wood");
        Block poincianaWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "poinciana_wood");
        Block laburnumWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "laburnum_wood");
        Block jadeWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jade_wood");
        Block paulowniaWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "paulownia_wood");
        Block wisteriaWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "wisteria_wood");
        Block jacarandaWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jacaranda_wood");
        Block dogwoodWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "dogwood_wood");
        Block silverbellWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "silverbell_wood");

        //stripped log
        Block crabappleStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "crabapple_stripped_log");
        Block poincianaStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "poinciana_stripped_log");
        Block laburnumStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "laburnum_stripped_log");
        Block jadeStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jade_stripped_log");
        Block paulowniaStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "paulownia_stripped_log");
        Block wisteriaStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "wisteria_stripped_log");
        Block jacarandaStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jacaranda_stripped_log");
        Block dogwoodStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "dogwood_stripped_log");
        Block silverbellStrippedLog = registerBlock(new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "silverbell_stripped_log");

        //stripped wood
        Block crabappleStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "crabapple_stripped_wood");
        Block poincianaStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "poinciana_stripped_wood");
        Block laburnumStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "laburnum_stripped_wood");
        Block jadeStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jade_stripped_wood");
        Block paulowniaStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "paulownia_stripped_wood");
        Block wisteriaStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "wisteria_stripped_wood");
        Block jacarandaStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jacaranda_stripped_wood");
        Block dogwoodStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "dogwood_stripped_wood");
        Block silverbellStrippedWood = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "silverbell_stripped_wood");


        //planks
        Block crabapplePlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "crabapple_planks");
        Block poincianaPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "poinciana_planks");
        Block laburnumPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "laburnum_planks");
        Block jadePlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jade_planks");
        Block paulowniaPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "paulownia_planks");
        Block wisteriaPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "wisteria_planks");
        Block jacarandaPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "jacaranda_planks");
        Block dogwoodPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "dogwood_planks");
        Block silverbellPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "silverbell_planks");

        Block redStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "red_stained_planks");
        Block orangeStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "orange_stained_planks");
        Block yellowStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "yellow_stained_planks");
        Block limeStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "lime_stained_planks");
        Block greenStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "green_stained_planks");
        Block cyanStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "cyan_stained_planks");
        Block lightBlueStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_blue_stained_planks");
        Block blueStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "blue_stained_planks");
        Block purpleStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "purple_stained_planks");

        Block magentaStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "magenta_stained_planks");
        Block pinkStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "pink_stained_planks");
        Block whiteStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "white_stained_planks");
        Block lightGrayStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_gray_stained_planks");
        Block grayStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "gray_stained_planks");
        Block blackStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "black_stained_planks");
        Block brownStainedPlanks = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "brown_stained_planks");

        //stairs
        Block crabappleStairs = registerBlock(new CustomStairs(crabapplePlanks.getDefaultState(), Block.Properties.from(crabapplePlanks)), "crabapple_stairs");
        Block poincianaStairs = registerBlock(new CustomStairs(poincianaPlanks.getDefaultState(), Block.Properties.from(poincianaPlanks)), "poinciana_stairs");
        Block laburnumStairs = registerBlock(new CustomStairs(laburnumPlanks.getDefaultState(), Block.Properties.from(laburnumPlanks)), "laburnum_stairs");
        Block jadeStairs = registerBlock(new CustomStairs(jadePlanks.getDefaultState(), Block.Properties.from(jadePlanks)), "jade_stairs");
        Block paulowniaStairs = registerBlock(new CustomStairs(paulowniaPlanks.getDefaultState(), Block.Properties.from(paulowniaPlanks)), "paulownia_stairs");
        Block wisteriaStairs = registerBlock(new CustomStairs(wisteriaPlanks.getDefaultState(), Block.Properties.from(wisteriaPlanks)), "wisteria_stairs");
        Block jacarandaStairs = registerBlock(new CustomStairs(jacarandaPlanks.getDefaultState(), Block.Properties.from(jacarandaPlanks)), "jacaranda_stairs");
        Block dogwoodStairs = registerBlock(new CustomStairs(dogwoodPlanks.getDefaultState(), Block.Properties.from(dogwoodPlanks)), "dogwood_stairs");
        Block silverbellStairs = registerBlock(new CustomStairs(silverbellPlanks.getDefaultState(), Block.Properties.from(silverbellPlanks)), "silverbell_stairs");

        Block redStainedStairs = registerBlock(new CustomStairs(redStainedPlanks.getDefaultState(), Block.Properties.from(redStainedPlanks)), "red_stained_stairs");
        Block orangeStainedStairs = registerBlock(new CustomStairs(orangeStainedPlanks.getDefaultState(), Block.Properties.from(orangeStainedPlanks)), "orange_stained_stairs");
        Block yellowStainedStairs = registerBlock(new CustomStairs(yellowStainedPlanks.getDefaultState(), Block.Properties.from(yellowStainedPlanks)), "yellow_stained_stairs");
        Block limeStainedStairs = registerBlock(new CustomStairs(limeStainedPlanks.getDefaultState(), Block.Properties.from(limeStainedPlanks)), "lime_stained_stairs");
        Block greenStainedStairs = registerBlock(new CustomStairs(greenStainedPlanks.getDefaultState(), Block.Properties.from(greenStainedPlanks)), "green_stained_stairs");
        Block cyanStainedStairs = registerBlock(new CustomStairs(cyanStainedPlanks.getDefaultState(), Block.Properties.from(cyanStainedPlanks)), "cyan_stained_stairs");
        Block lightBlueStainedStairs = registerBlock(new CustomStairs(lightBlueStainedPlanks.getDefaultState(), Block.Properties.from(lightBlueStainedPlanks)), "light_blue_stained_stairs");
        Block blueStainedStairs = registerBlock(new CustomStairs(blueStainedPlanks.getDefaultState(), Block.Properties.from(blueStainedPlanks)), "blue_stained_stairs");
        Block purpleStainedStairs = registerBlock(new CustomStairs(purpleStainedPlanks.getDefaultState(), Block.Properties.from(purpleStainedPlanks)), "purple_stained_stairs");
        Block magentaStainedStairs = registerBlock(new CustomStairs(magentaStainedPlanks.getDefaultState(), Block.Properties.from(magentaStainedPlanks)), "magenta_stained_stairs");
        Block pinkStainedStairs = registerBlock(new CustomStairs(pinkStainedPlanks.getDefaultState(), Block.Properties.from(pinkStainedPlanks)), "pink_stained_stairs");
        Block whiteStainedStairs = registerBlock(new CustomStairs(whiteStainedPlanks.getDefaultState(), Block.Properties.from(whiteStainedPlanks)), "white_stained_stairs");
        Block lightGrayStainedStairs = registerBlock(new CustomStairs(lightGrayStainedPlanks.getDefaultState(), Block.Properties.from(lightGrayStainedPlanks)), "light_gray_stained_stairs");
        Block grayStainedStairs = registerBlock(new CustomStairs(grayStainedPlanks.getDefaultState(), Block.Properties.from(grayStainedPlanks)), "gray_stained_stairs");
        Block blackStainedStairs = registerBlock(new CustomStairs(blackStainedPlanks.getDefaultState(), Block.Properties.from(blackStainedPlanks)), "black_stained_stairs");
        Block brownStainedStairs = registerBlock(new CustomStairs(brownStainedPlanks.getDefaultState(), Block.Properties.from(brownStainedPlanks)), "brown_stained_stairs");

        Block redClayStairs = registerBlock(new CustomStairs(redClayBlock.getDefaultState(), Block.Properties.from(redClayBlock)), "red_clay_stairs");
        Block orangeClayStairs = registerBlock(new CustomStairs(orangeClayBlock.getDefaultState(), Block.Properties.from(orangeClayBlock)), "orange_clay_stairs");
        Block yellowClayStairs = registerBlock(new CustomStairs(yellowClayBlock.getDefaultState(), Block.Properties.from(yellowClayBlock)), "yellow_clay_stairs");
        Block limeClayStairs = registerBlock(new CustomStairs(limeClayBlock.getDefaultState(), Block.Properties.from(limeClayBlock)), "lime_clay_stairs");
        Block greenClayStairs = registerBlock(new CustomStairs(greenClayBlock.getDefaultState(), Block.Properties.from(greenClayBlock)), "green_clay_stairs");
        Block cyanClayStairs = registerBlock(new CustomStairs(cyanClayBlock.getDefaultState(), Block.Properties.from(cyanClayBlock)), "cyan_clay_stairs");
        Block lightBlueClayStairs = registerBlock(new CustomStairs(lightBlueClayBlock.getDefaultState(), Block.Properties.from(lightBlueClayBlock)), "light_blue_clay_stairs");
        Block blueClayStairs = registerBlock(new CustomStairs(blueClayBlock.getDefaultState(), Block.Properties.from(blueClayBlock)), "blue_clay_stairs");
        Block purpleClayStairs = registerBlock(new CustomStairs(purpleClayBlock.getDefaultState(), Block.Properties.from(purpleClayBlock)), "purple_clay_stairs");
        Block magentaClayStairs = registerBlock(new CustomStairs(magentaClayBlock.getDefaultState(), Block.Properties.from(magentaClayBlock)), "magenta_clay_stairs");
        Block pinkClayStairs = registerBlock(new CustomStairs(pinkClayBlock.getDefaultState(), Block.Properties.from(pinkClayBlock)), "pink_clay_stairs");
        Block whiteClayStairs = registerBlock(new CustomStairs(whiteClayBlock.getDefaultState(), Block.Properties.from(whiteClayBlock)), "white_clay_stairs");
        Block lightGrayClayStairs = registerBlock(new CustomStairs(lightGrayClayBlock.getDefaultState(), Block.Properties.from(lightGrayClayBlock)), "light_gray_clay_stairs");
        Block grayClayStairs = registerBlock(new CustomStairs(grayClayBlock.getDefaultState(), Block.Properties.from(grayClayBlock)), "gray_clay_stairs");
        Block blackClayStairs = registerBlock(new CustomStairs(blackClayBlock.getDefaultState(), Block.Properties.from(blackClayBlock)), "black_clay_stairs");
        Block brownClayStairs = registerBlock(new CustomStairs(brownClayBlock.getDefaultState(), Block.Properties.from(brownClayBlock)), "brown_clay_stairs");

        Block redClaySlab = registerBlock(new SlabBlock(Block.Properties.from(redClayBlock)), "red_clay_slab");
        Block orangeClaySlab = registerBlock(new SlabBlock(Block.Properties.from(orangeClayBlock)), "orange_clay_slab");
        Block yellowClaySlab = registerBlock(new SlabBlock(Block.Properties.from(yellowClayBlock)), "yellow_clay_slab");
        Block limeClaySlab = registerBlock(new SlabBlock(Block.Properties.from(limeClayBlock)), "lime_clay_slab");
        Block greenClaySlab = registerBlock(new SlabBlock(Block.Properties.from(greenClayBlock)), "green_clay_slab");
        Block cyanClaySlab = registerBlock(new SlabBlock(Block.Properties.from(cyanClayBlock)), "cyan_clay_slab");
        Block lightBlueClaySlab = registerBlock(new SlabBlock(Block.Properties.from(lightBlueClayBlock)), "light_blue_clay_slab");
        Block blueClaySlab = registerBlock(new SlabBlock(Block.Properties.from(blueClayBlock)), "blue_clay_slab");
        Block purpleClaySlab = registerBlock(new SlabBlock(Block.Properties.from(purpleClayBlock)), "purple_clay_slab");
        Block magentaClaySlab = registerBlock(new SlabBlock(Block.Properties.from(magentaClayBlock)), "magenta_clay_slab");
        Block pinkClaySlab = registerBlock(new SlabBlock(Block.Properties.from(pinkClayBlock)), "pink_clay_slab");
        Block whiteClaySlab = registerBlock(new SlabBlock(Block.Properties.from(whiteClayBlock)), "white_clay_slab");
        Block lightGrayClaySlab = registerBlock(new SlabBlock(Block.Properties.from(lightGrayClayBlock)), "light_gray_clay_slab");
        Block grayClaySlab = registerBlock(new SlabBlock(Block.Properties.from(grayClayBlock)), "gray_clay_slab");
        Block blackClaySlab = registerBlock(new SlabBlock(Block.Properties.from(blackClayBlock)), "black_clay_slab");
        Block brownClaySlab = registerBlock(new SlabBlock(Block.Properties.from(brownClayBlock)), "brown_clay_slab");

        Block redBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "red_brick_block");
        Block orangeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "orange_brick_block");
        Block yellowBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "yellow_brick_block");
        Block limeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "lime_brick_block");
        Block greenBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "green_brick_block");
        Block cyanBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "cyan_brick_block");
        Block lightBlueBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_blue_brick_block");
        Block blueBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "blue_brick_block");
        Block purpleBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "purple_brick_block");
        Block magentaBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "magenta_brick_block");
        Block pinkBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "pink_brick_block");
        Block whiteBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "white_brick_block");
        Block lightGrayBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_gray_brick_block");
        Block grayBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "gray_brick_block");
        Block blackBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "black_brick_block");
        Block brownBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "brown_brick_block");

        Block redBrickStairs = registerBlock(new CustomStairs(redBrickBlock.getDefaultState(), Block.Properties.from(redBrickBlock)), "red_brick_stairs");
        Block orangeBrickStairs = registerBlock(new CustomStairs(orangeBrickBlock.getDefaultState(), Block.Properties.from(orangeBrickBlock)), "orange_brick_stairs");
        Block yellowBrickStairs = registerBlock(new CustomStairs(yellowBrickBlock.getDefaultState(), Block.Properties.from(yellowBrickBlock)), "yellow_brick_stairs");
        Block limeBrickStairs = registerBlock(new CustomStairs(limeBrickBlock.getDefaultState(), Block.Properties.from(limeBrickBlock)), "lime_brick_stairs");
        Block greenBrickStairs = registerBlock(new CustomStairs(greenBrickBlock.getDefaultState(), Block.Properties.from(greenBrickBlock)), "green_brick_stairs");
        Block cyanBrickStairs = registerBlock(new CustomStairs(cyanBrickBlock.getDefaultState(), Block.Properties.from(cyanBrickBlock)), "cyan_brick_stairs");
        Block lightBlueBrickStairs = registerBlock(new CustomStairs(lightBlueBrickBlock.getDefaultState(), Block.Properties.from(lightBlueBrickBlock)), "light_blue_brick_stairs");
        Block blueBrickStairs = registerBlock(new CustomStairs(blueBrickBlock.getDefaultState(), Block.Properties.from(blueBrickBlock)), "blue_brick_stairs");
        Block purpleBrickStairs = registerBlock(new CustomStairs(purpleBrickBlock.getDefaultState(), Block.Properties.from(purpleBrickBlock)), "purple_brick_stairs");
        Block magentaBrickStairs = registerBlock(new CustomStairs(magentaBrickBlock.getDefaultState(), Block.Properties.from(magentaBrickBlock)), "magenta_brick_stairs");
        Block pinkBrickStairs = registerBlock(new CustomStairs(pinkBrickBlock.getDefaultState(), Block.Properties.from(pinkBrickBlock)), "pink_brick_stairs");
        Block whiteBrickStairs = registerBlock(new CustomStairs(whiteBrickBlock.getDefaultState(), Block.Properties.from(whiteBrickBlock)), "white_brick_stairs");
        Block lightGrayBrickStairs = registerBlock(new CustomStairs(lightGrayBrickBlock.getDefaultState(), Block.Properties.from(lightGrayBrickBlock)), "light_gray_brick_stairs");
        Block grayBrickStairs = registerBlock(new CustomStairs(grayBrickBlock.getDefaultState(), Block.Properties.from(grayBrickBlock)), "gray_brick_stairs");
        Block blackBrickStairs = registerBlock(new CustomStairs(blackBrickBlock.getDefaultState(), Block.Properties.from(blackBrickBlock)), "black_brick_stairs");
        Block brownBrickStairs = registerBlock(new CustomStairs(brownBrickBlock.getDefaultState(), Block.Properties.from(brownBrickBlock)), "brown_brick_stairs");

        Block redBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(redBrickBlock)), "red_brick_slab");
        Block orangeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(orangeBrickBlock)), "orange_brick_slab");
        Block yellowBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(yellowBrickBlock)), "yellow_brick_slab");
        Block limeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(limeBrickBlock)), "lime_brick_slab");
        Block greenBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(greenBrickBlock)), "green_brick_slab");
        Block cyanBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(cyanBrickBlock)), "cyan_brick_slab");
        Block lightBlueBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(lightBlueBrickBlock)), "light_blue_brick_slab");
        Block blueBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(blueBrickBlock)), "blue_brick_slab");
        Block purpleBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(purpleBrickBlock)), "purple_brick_slab");
        Block magentaBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(magentaBrickBlock)), "magenta_brick_slab");
        Block pinkBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(pinkBrickBlock)), "pink_brick_slab");
        Block whiteBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(whiteBrickBlock)), "white_brick_slab");
        Block lightGrayBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(lightGrayBrickBlock)), "light_gray_brick_slab");
        Block grayBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(grayBrickBlock)), "gray_brick_slab");
        Block blackBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(blackBrickBlock)), "black_brick_slab");
        Block brownBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(brownBrickBlock)), "brown_brick_slab");

        Block redLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "red_large_brick_block");
        Block orangeLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "orange_large_brick_block");
        Block yellowLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "yellow_large_brick_block");
        Block limeLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "lime_large_brick_block");
        Block greenLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "green_large_brick_block");
        Block cyanLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "cyan_large_brick_block");
        Block lightBlueLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_blue_large_brick_block");
        Block blueLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "blue_large_brick_block");
        Block purpleLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "purple_large_brick_block");
        Block magentaLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "magenta_large_brick_block");
        Block pinkLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "pink_large_brick_block");
        Block whiteLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "white_large_brick_block");
        Block lightGrayLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "light_gray_large_brick_block");
        Block grayLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "gray_large_brick_block");
        Block blackLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "black_large_brick_block");
        Block brownLargeBrickBlock = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 2.0F)), "brown_large_brick_block");

        Block redLargeBrickStairs = registerBlock(new CustomStairs(redLargeBrickBlock.getDefaultState(), Block.Properties.from(redLargeBrickBlock)), "red_large_brick_stairs");
        Block orangeLargeBrickStairs = registerBlock(new CustomStairs(orangeLargeBrickBlock.getDefaultState(), Block.Properties.from(orangeLargeBrickBlock)), "orange_large_brick_stairs");
        Block yellowLargeBrickStairs = registerBlock(new CustomStairs(yellowLargeBrickBlock.getDefaultState(), Block.Properties.from(yellowLargeBrickBlock)), "yellow_large_brick_stairs");
        Block limeLargeBrickStairs = registerBlock(new CustomStairs(limeLargeBrickBlock.getDefaultState(), Block.Properties.from(limeLargeBrickBlock)), "lime_large_brick_stairs");
        Block greenLargeBrickStairs = registerBlock(new CustomStairs(greenLargeBrickBlock.getDefaultState(), Block.Properties.from(greenLargeBrickBlock)), "green_large_brick_stairs");
        Block cyanLargeBrickStairs = registerBlock(new CustomStairs(cyanLargeBrickBlock.getDefaultState(), Block.Properties.from(cyanLargeBrickBlock)), "cyan_large_brick_stairs");
        Block lightBlueLargeBrickStairs = registerBlock(new CustomStairs(lightBlueLargeBrickBlock.getDefaultState(), Block.Properties.from(lightBlueLargeBrickBlock)), "light_blue_large_brick_stairs");
        Block blueLargeBrickStairs = registerBlock(new CustomStairs(blueLargeBrickBlock.getDefaultState(), Block.Properties.from(blueLargeBrickBlock)), "blue_large_brick_stairs");
        Block purpleLargeBrickStairs = registerBlock(new CustomStairs(purpleLargeBrickBlock.getDefaultState(), Block.Properties.from(purpleLargeBrickBlock)), "purple_large_brick_stairs");
        Block magentaLargeBrickStairs = registerBlock(new CustomStairs(magentaLargeBrickBlock.getDefaultState(), Block.Properties.from(magentaLargeBrickBlock)), "magenta_large_brick_stairs");
        Block pinkLargeBrickStairs = registerBlock(new CustomStairs(pinkLargeBrickBlock.getDefaultState(), Block.Properties.from(pinkLargeBrickBlock)), "pink_large_brick_stairs");
        Block whiteLargeBrickStairs = registerBlock(new CustomStairs(whiteLargeBrickBlock.getDefaultState(), Block.Properties.from(whiteLargeBrickBlock)), "white_large_brick_stairs");
        Block lightGrayLargeBrickStairs = registerBlock(new CustomStairs(lightGrayLargeBrickBlock.getDefaultState(), Block.Properties.from(lightGrayLargeBrickBlock)), "light_gray_large_brick_stairs");
        Block grayLargeBrickStairs = registerBlock(new CustomStairs(grayLargeBrickBlock.getDefaultState(), Block.Properties.from(grayLargeBrickBlock)), "gray_large_brick_stairs");
        Block blackLargeBrickStairs = registerBlock(new CustomStairs(blackLargeBrickBlock.getDefaultState(), Block.Properties.from(blackLargeBrickBlock)), "black_large_brick_stairs");
        Block brownLargeBrickStairs = registerBlock(new CustomStairs(brownLargeBrickBlock.getDefaultState(), Block.Properties.from(brownLargeBrickBlock)), "brown_large_brick_stairs");

        Block redLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(redLargeBrickBlock)), "red_large_brick_slab");
        Block orangeLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(orangeLargeBrickBlock)), "orange_large_brick_slab");
        Block yellowLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(yellowLargeBrickBlock)), "yellow_large_brick_slab");
        Block limeLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(limeLargeBrickBlock)), "lime_large_brick_slab");
        Block greenLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(greenLargeBrickBlock)), "green_large_brick_slab");
        Block cyanLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(cyanLargeBrickBlock)), "cyan_large_brick_slab");
        Block lightBlueLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(lightBlueLargeBrickBlock)), "light_blue_large_brick_slab");
        Block blueLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(blueLargeBrickBlock)), "blue_large_brick_slab");
        Block purpleLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(purpleLargeBrickBlock)), "purple_large_brick_slab");
        Block magentaLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(magentaLargeBrickBlock)), "magenta_large_brick_slab");
        Block pinkLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(pinkLargeBrickBlock)), "pink_large_brick_slab");
        Block whiteLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(whiteLargeBrickBlock)), "white_large_brick_slab");
        Block lightGrayLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(lightGrayLargeBrickBlock)), "light_gray_large_brick_slab");
        Block grayLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(grayLargeBrickBlock)), "gray_large_brick_slab");
        Block blackLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(blackLargeBrickBlock)), "black_large_brick_slab");
        Block brownLargeBrickSlab = registerBlock(new SlabBlock(Block.Properties.from(brownLargeBrickBlock)), "brown_large_brick_slab");



        //slab
        Block crabappleSlab = registerBlock(new SlabBlock(Block.Properties.from(crabapplePlanks)), "crabapple_slab");
        Block poincianaSlab = registerBlock(new SlabBlock(Block.Properties.from(poincianaPlanks)), "poinciana_slab");
        Block laburnumSlab = registerBlock(new SlabBlock(Block.Properties.from(laburnumPlanks)), "laburnum_slab");
        Block jadeSlab = registerBlock(new SlabBlock(Block.Properties.from(jadePlanks)), "jade_slab");
        Block paulowniaSlab = registerBlock(new SlabBlock(Block.Properties.from(paulowniaPlanks)), "paulownia_slab");
        Block wisteriaSlab = registerBlock(new SlabBlock(Block.Properties.from(wisteriaPlanks)), "wisteria_slab");
        Block jacarandaSlab = registerBlock(new SlabBlock(Block.Properties.from(jacarandaPlanks)), "jacaranda_slab");
        Block dogwoodSlab = registerBlock(new SlabBlock(Block.Properties.from(dogwoodPlanks)), "dogwood_slab");
        Block silverbellSlab = registerBlock(new SlabBlock(Block.Properties.from(silverbellPlanks)), "silverbell_slab");

        Block redStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(crabapplePlanks)), "red_stained_slab");
        Block orangeStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(poincianaPlanks)), "orange_stained_slab");
        Block yellowStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(laburnumPlanks)), "yellow_stained_slab");
        Block limeStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(jadePlanks)), "lime_stained_slab");
        Block greenStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(paulowniaPlanks)), "green_stained_slab");
        Block cyanStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(wisteriaPlanks)), "cyan_stained_slab");
        Block lightBlueStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(jacarandaPlanks)), "light_blue_stained_slab");
        Block blueStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(dogwoodPlanks)), "blue_stained_slab");
        Block purpleStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(silverbellPlanks)), "purple_stained_slab");
        Block magentaStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(crabapplePlanks)), "magenta_stained_slab");
        Block pinkStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(poincianaPlanks)), "pink_stained_slab");
        Block whiteStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(laburnumPlanks)), "white_stained_slab");
        Block lightGrayStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(jadePlanks)), "light_gray_stained_slab");
        Block grayStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(paulowniaPlanks)), "gray_stained_slab");
        Block blackStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(wisteriaPlanks)), "black_stained_slab");
        Block brownStainedSlab = registerBlock(new SlabBlock(Block.Properties.from(jacarandaPlanks)), "brown_stained_slab");


        //fence
        Block crabappleFence = registerBlock(new FenceBlock(Block.Properties.from(crabapplePlanks)), "crabapple_fence");
        Block poincianaFence = registerBlock(new FenceBlock(Block.Properties.from(poincianaPlanks)), "poinciana_fence");
        Block laburnumFence = registerBlock(new FenceBlock(Block.Properties.from(laburnumPlanks)), "laburnum_fence");
        Block jadeFence = registerBlock(new FenceBlock(Block.Properties.from(jadePlanks)), "jade_fence");
        Block paulowniaFence = registerBlock(new FenceBlock(Block.Properties.from(paulowniaPlanks)), "paulownia_fence");
        Block wisteriaFence = registerBlock(new FenceBlock(Block.Properties.from(wisteriaPlanks)), "wisteria_fence");
        Block jacarandaFence = registerBlock(new FenceBlock(Block.Properties.from(jacarandaPlanks)), "jacaranda_fence");
        Block dogwoodFence = registerBlock(new FenceBlock(Block.Properties.from(dogwoodPlanks)), "dogwood_fence");
        Block silverbellFence = registerBlock(new FenceBlock(Block.Properties.from(silverbellPlanks)), "silverbell_fence");

        Block redStainedFence = registerBlock(new FenceBlock(Block.Properties.from(redStainedPlanks)), "red_stained_fence");
        Block orangeStainedFence = registerBlock(new FenceBlock(Block.Properties.from(orangeStainedPlanks)), "orange_stained_fence");
        Block yellowStainedFence = registerBlock(new FenceBlock(Block.Properties.from(yellowStainedPlanks)), "yellow_stained_fence");
        Block limeStainedFence = registerBlock(new FenceBlock(Block.Properties.from(limeStainedPlanks)), "lime_stained_fence");
        Block greenStainedFence = registerBlock(new FenceBlock(Block.Properties.from(greenStainedPlanks)), "green_stained_fence");
        Block cyanStainedFence = registerBlock(new FenceBlock(Block.Properties.from(cyanStainedPlanks)), "cyan_stained_fence");
        Block lightBlueStainedFence = registerBlock(new FenceBlock(Block.Properties.from(lightBlueStainedPlanks)), "light_blue_stained_fence");
        Block blueStainedFence = registerBlock(new FenceBlock(Block.Properties.from(blueStainedPlanks)), "blue_stained_fence");
        Block purpleStainedFence = registerBlock(new FenceBlock(Block.Properties.from(purpleStainedPlanks)), "purple_stained_fence");
        Block magentaStainedFence = registerBlock(new FenceBlock(Block.Properties.from(magentaStainedPlanks)), "magenta_stained_fence");
        Block pinkStainedFence = registerBlock(new FenceBlock(Block.Properties.from(pinkStainedPlanks)), "pink_stained_fence");
        Block whiteStainedFence = registerBlock(new FenceBlock(Block.Properties.from(whiteStainedPlanks)), "white_stained_fence");
        Block lightGrayStainedFence = registerBlock(new FenceBlock(Block.Properties.from(lightGrayStainedPlanks)), "light_gray_stained_fence");
        Block grayStainedFence = registerBlock(new FenceBlock(Block.Properties.from(grayStainedPlanks)), "gray_stained_fence");
        Block blackStainedFence = registerBlock(new FenceBlock(Block.Properties.from(blackStainedPlanks)), "black_stained_fence");
        Block brownStainedFence = registerBlock(new FenceBlock(Block.Properties.from(brownStainedPlanks)), "brown_stained_fence");




        //fence gate
        Block crabappleFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(crabapplePlanks)), "crabapple_fence_gate");
        Block poincianaFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(poincianaPlanks)), "poinciana_fence_gate");
        Block laburnumFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(laburnumPlanks)), "laburnum_fence_gate");
        Block jadeFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(jadePlanks)), "jade_fence_gate");
        Block paulowniaFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(paulowniaPlanks)), "paulownia_fence_gate");
        Block wisteriaFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(wisteriaPlanks)), "wisteria_fence_gate");
        Block jacarandaFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(jacarandaPlanks)), "jacaranda_fence_gate");
        Block dogwoodFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(dogwoodPlanks)), "dogwood_fence_gate");
        Block silverbellFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(silverbellPlanks)), "silverbell_fence_gate");

        Block redStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(redStainedPlanks)), "red_stained_fence_gate");
        Block orangeStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(orangeStainedPlanks)), "orange_stained_fence_gate");
        Block yellowStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(yellowStainedPlanks)), "yellow_stained_fence_gate");
        Block limeStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(limeStainedPlanks)), "lime_stained_fence_gate");
        Block greenStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(greenStainedPlanks)), "green_stained_fence_gate");
        Block cyanStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(cyanStainedPlanks)), "cyan_stained_fence_gate");
        Block lightBlueStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(lightBlueStainedPlanks)), "light_blue_stained_fence_gate");
        Block blueStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(blueStainedPlanks)), "blue_stained_fence_gate");
        Block purpleStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(purpleStainedPlanks)), "purple_stained_fence_gate");
        Block magentaStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(magentaStainedPlanks)), "magenta_stained_fence_gate");
        Block pinkStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(pinkStainedPlanks)), "pink_stained_fence_gate");
        Block whiteStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(whiteStainedPlanks)), "white_stained_fence_gate");
        Block lightGrayStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(lightGrayStainedPlanks)), "light_gray_stained_fence_gate");
        Block grayStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(grayStainedPlanks)), "gray_stained_fence_gate");
        Block blackStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(blackStainedPlanks)), "black_stained_fence_gate");
        Block brownStainedFenceGate = registerBlock(new FenceGateBlock(Block.Properties.from(brownStainedPlanks)), "brown_stained_fence_gate");

        //wall
        Block crabappleWall = registerBlock(new WallBlock(Block.Properties.from(crabapplePlanks)), "crabapple_wall");
        Block poincianaWall = registerBlock(new WallBlock(Block.Properties.from(poincianaPlanks)), "poinciana_wall");
        Block laburnumWall = registerBlock(new WallBlock(Block.Properties.from(laburnumPlanks)), "laburnum_wall");
        Block jadeWall = registerBlock(new WallBlock(Block.Properties.from(jadePlanks)), "jade_wall");
        Block paulowniaWall = registerBlock(new WallBlock(Block.Properties.from(paulowniaPlanks)), "paulownia_wall");
        Block wisteriaWall = registerBlock(new WallBlock(Block.Properties.from(wisteriaPlanks)), "wisteria_wall");
        Block jacarandaWall = registerBlock(new WallBlock(Block.Properties.from(jacarandaPlanks)), "jacaranda_wall");
        Block dogwoodWall = registerBlock(new WallBlock(Block.Properties.from(dogwoodPlanks)), "dogwood_wall");
        Block silverbellWall = registerBlock(new WallBlock(Block.Properties.from(silverbellPlanks)), "silverbell_wall");

        //bookshelf
        Block crabappleBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "crabapple_bookshelf");
        Block poincianaBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "poinciana_bookshelf" );
        Block laburnumBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "laburnum_bookshelf" );
        Block jadeBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "jade_bookshelf" );
        Block paulowniaBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "paulownia_bookshelf" );
        Block wisteriaBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "wisteria_bookshelf" );
        Block jacarandaBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "jacaranda_bookshelf" );
        Block dogwoodBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "dogwood_bookshelf" );
        Block silverbellBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "silverbell_bookshelf" );
        Block redStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "red_stained_bookshelf" );
        Block orangeStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "orange_stained_bookshelf" );
        Block yellowStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "yellow_stained_bookshelf" );
        Block limeStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "lime_stained_bookshelf" );
        Block greenStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "green_stained_bookshelf" );
        Block cyanStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "cyan_stained_bookshelf" );
        Block lightBlueStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "light_blue_stained_bookshelf" );
        Block blueStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "blue_stained_bookshelf" );
        Block purpleStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "purple_stained_bookshelf" );
        Block magentaStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "magenta_stained_bookshelf" );
        Block pinkStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "pink_stained_bookshelf" );
        Block whiteStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "white_stained_bookshelf" );
        Block lightGrayStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "light_gray_stained_bookshelf" );
        Block grayStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "gray_stained_bookshelf" );
        Block blackStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "black_stained_bookshelf" );
        Block brownStainedBookshelf = registerBlock(new CustomBookshelf(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD)), "brown_stained_bookshelf" );

        //button
        Block crabappleButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "crabapple_button");
        Block poincianaButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "poinciana_button");
        Block laburnumButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "laburnum_button");
        Block jadeButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "jade_button");
        Block paulowniaButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "paulownia_button");
        Block wisteriaButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "wisteria_button");
        Block jacarandaButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "jacaranda_button");
        Block dogwoodButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "dogwood_button");
        Block silverbellButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "silverbell_button");

        Block redStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "red_stained_button");
        Block orangeStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "orange_stained_button");
        Block yellowStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "yellow_stained_button");
        Block limeStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "lime_stained_button");
        Block greenStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "green_stained_button");
        Block cyanStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "cyan_stained_button");
        Block lightBlueStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "light_blue_stained_button");
        Block blueStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "blue_stained_button");
        Block purpleStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "purple_stained_button");
        Block magentaStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "magenta_stained_button");
        Block pinkStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "pink_stained_button");
        Block whiteStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "white_stained_button");
        Block lightGrayStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "light_gray_stained_button");
        Block grayStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "gray_stained_button");
        Block blackStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "black_stained_button");
        Block brownStainedButton = registerBlock(new CustomWoodButton(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "brown_stained_button");


        //pressure plate
        Block crabapplePressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "crabapple_pressure_plate");
        Block poincianaPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "poinciana_pressure_plate");
        Block laburnumPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "laburnum_pressure_plate");
        Block jadePressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "jade_pressure_plate");
        Block paulowniaPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "paulownia_pressure_plate");
        Block wisteriaPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "wisteria_pressure_plate");
        Block jacarandaPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "jacaranda_pressure_plate");
        Block dogwoodPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "dogwood_pressure_plate");
        Block silverbellPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "silverbell_pressure_plate");

        Block redStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "red_stained_pressure_plate");
        Block orangeStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "orange_stained_pressure_plate");
        Block yellowStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "yellow_stained_pressure_plate");
        Block limeStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "lime_stained_pressure_plate");
        Block greenStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "green_stained_pressure_plate");
        Block cyanStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "cyan_stained_pressure_plate");
        Block lightBlueStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "light_blue_stained_pressure_plate");
        Block blueStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "blue_stained_pressure_plate");
        Block purpleStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "purple_stained_pressure_plate");
        Block magentaStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "magenta_stained_pressure_plate");
        Block pinkStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "pink_stained_pressure_plate");
        Block whiteStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "white_stained_pressure_plate");
        Block lightGrayStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "light_gray_stained_pressure_plate");
        Block grayStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "gray_stained_pressure_plate");
        Block blackStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "black_stained_pressure_plate");
        Block brownStainedPressurePlate = registerBlock(new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)), "brown_stained_pressure_plate");

        //door
            //door1
        Block crabappleDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"crabapple_door_1");
        Block poincianaDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"poinciana_door_1");
        Block laburnumDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"laburnum_door_1");
        Block jadeDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jade_door_1");
        Block paulowniaDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"paulownia_door_1");
        Block wisteriaDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"wisteria_door_1");
        Block jacarandaDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jacaranda_door_1");
        Block dogwoodDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dogwood_door_1");
        Block silverbellDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"silverbell_door_1");

        Block acaciaDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"acacia_door_1");
        Block birchDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"birch_door_1");
        Block oakDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"oak_door_1");
        Block darkOakDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dark_oak_door_1");
        Block spruceDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"spruce_door_1");
        Block jungleDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jungle_door_1");

        Block redStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"red_stained_door_1");
        Block orangeStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"orange_stained_door_1");
        Block yellowStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"yellow_stained_door_1");
        Block limeStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"lime_stained_door_1");
        Block greenStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"green_stained_door_1");
        Block cyanStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"cyan_stained_door_1");
        Block lightBlueStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"light_blue_stained_door_1");
        Block blueStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"blue_stained_door_1");
        Block purpleStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"purple_stained_door_1");
        Block magentaStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"magenta_stained_door_1");
        Block pinkStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"pink_stained_door_1");
        Block whiteStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"white_stained_door_1");
        Block lightGrayStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"light_gray_stained_door_1");
        Block grayStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"gray_stained_door_1");
        Block blackStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"black_stained_door_1");
        Block brownStainedDoor1 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"brown_stained_door_1");

            //door2
        Block crabappleDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"crabapple_door_2");
        Block poincianaDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"poinciana_door_2");
        Block laburnumDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"laburnum_door_2");
        Block jadeDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jade_door_2");
        Block paulowniaDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"paulownia_door_2");
        Block wisteriaDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"wisteria_door_2");
        Block jacarandaDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jacaranda_door_2");
        Block dogwoodDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dogwood_door_2");
        Block silverbellDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"silverbell_door_2");

        Block acaciaDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"acacia_door_2");
        Block birchDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"birch_door_2");
        Block oakDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"oak_door_2");
        Block darkOakDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dark_oak_door_2");
        Block spruceDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"spruce_door_2");
        Block jungleDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jungle_door_2");

        Block redStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"red_stained_door_2");
        Block orangeStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"orange_stained_door_2");
        Block yellowStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"yellow_stained_door_2");
        Block limeStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"lime_stained_door_2");
        Block greenStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"green_stained_door_2");
        Block cyanStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"cyan_stained_door_2");
        Block lightBlueStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"light_blue_stained_door_2");
        Block blueStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"blue_stained_door_2");
        Block purpleStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"purple_stained_door_2");
        Block magentaStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"magenta_stained_door_2");
        Block pinkStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"pink_stained_door_2");
        Block whiteStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"white_stained_door_2");
        Block lightGrayStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"light_gray_stained_door_2");
        Block grayStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"gray_stained_door_2");
        Block blackStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"black_stained_door_2");
        Block brownStainedDoor2 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"brown_stained_door_2");

        //door3
        Block crabappleDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"crabapple_door_3");
        Block poincianaDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"poinciana_door_3");
        Block laburnumDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"laburnum_door_3");
        Block jadeDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jade_door_3");
        Block paulowniaDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"paulownia_door_3");
        Block wisteriaDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"wisteria_door_3");
        Block jacarandaDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jacaranda_door_3");
        Block dogwoodDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dogwood_door_3");
        Block silverbellDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"silverbell_door_3");

        Block acaciaDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"acacia_door_3");
        Block birchDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"birch_door_3");
        Block oakDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"oak_door_3");
        Block darkOakDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dark_oak_door_3");
        Block spruceDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"spruce_door_3");
        Block jungleDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jungle_door_3");

        Block redStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"red_stained_door_3");
        Block orangeStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"orange_stained_door_3");
        Block yellowStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"yellow_stained_door_3");
        Block limeStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"lime_stained_door_3");
        Block greenStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"green_stained_door_3");
        Block cyanStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"cyan_stained_door_3");
        Block lightBlueStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"light_blue_stained_door_3");
        Block blueStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"blue_stained_door_3");
        Block purpleStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"purple_stained_door_3");
        Block magentaStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"magenta_stained_door_3");
        Block pinkStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"pink_stained_door_3");
        Block whiteStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"white_stained_door_3");
        Block lightGrayStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"light_gray_stained_door_3");
        Block grayStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"gray_stained_door_3");
        Block blackStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"black_stained_door_3");
        Block brownStainedDoor3 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"brown_stained_door_3");

        //door4
        Block crabappleDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"crabapple_door_4");
        Block poincianaDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"poinciana_door_4");
        Block laburnumDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"laburnum_door_4");
        Block jadeDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jade_door_4");
        Block paulowniaDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"paulownia_door_4");
        Block wisteriaDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"wisteria_door_4");
        Block jacarandaDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jacaranda_door_4");
        Block dogwoodDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dogwood_door_4");
        Block silverbellDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"silverbell_door_4");

        Block acaciaDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"acacia_door_4");
        Block birchDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"birch_door_4");
        Block oakDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"oak_door_4");
        Block darkOakDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dark_oak_door_4");
        Block spruceDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"spruce_door_4");
        Block jungleDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jungle_door_4");

        Block redStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"red_stained_door_4");
        Block orangeStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"orange_stained_door_4");
        Block yellowStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"yellow_stained_door_4");
        Block limeStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"lime_stained_door_4");
        Block greenStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"green_stained_door_4");
        Block cyanStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"cyan_stained_door_4");
        Block lightBlueStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"light_blue_stained_door_4");
        Block blueStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"blue_stained_door_4");
        Block purpleStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"purple_stained_door_4");
        Block magentaStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"magenta_stained_door_4");
        Block pinkStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"pink_stained_door_4");
        Block whiteStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"white_stained_door_4");
        Block lightGrayStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"light_gray_stained_door_4");
        Block grayStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"gray_stained_door_4");
        Block blackStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"black_stained_door_4");
        Block brownStainedDoor4 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F).sound(SoundType.WOOD)),"brown_stained_door_4");


        //door5
        Block crabappleDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"crabapple_door_5");
        Block poincianaDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"poinciana_door_5");
        Block laburnumDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"laburnum_door_5");
        Block jadeDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jade_door_5");
        Block paulowniaDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"paulownia_door_5");
        Block wisteriaDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"wisteria_door_5");
        Block jacarandaDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jacaranda_door_5");
        Block dogwoodDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dogwood_door_5");
        Block silverbellDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"silverbell_door_5");

        Block acaciaDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"acacia_door_5");
        Block birchDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"birch_door_5");
        Block oakDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"oak_door_5");
        Block darkOakDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dark_oak_door_5");
        Block spruceDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"spruce_door_5");
        Block jungleDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jungle_door_5");

        Block redStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"red_stained_door_5");
        Block orangeStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"orange_stained_door_5");
        Block yellowStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"yellow_stained_door_5");
        Block limeStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"lime_stained_door_5");
        Block greenStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"green_stained_door_5");
        Block cyanStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"cyan_stained_door_5");
        Block lightBlueStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"light_blue_stained_door_5");
        Block blueStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"blue_stained_door_5");
        Block purpleStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"purple_stained_door_5");
        Block magentaStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"magenta_stained_door_5");
        Block pinkStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"pink_stained_door_5");
        Block whiteStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"white_stained_door_5");
        Block lightGrayStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"light_gray_stained_door_5");
        Block grayStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"gray_stained_door_5");
        Block blackStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"black_stained_door_5");
        Block brownStainedDoor5 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(5.0F).sound(SoundType.WOOD)),"brown_stained_door_5");

        //door6
        Block crabappleDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"crabapple_door_6");
        Block poincianaDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"poinciana_door_6");
        Block laburnumDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"laburnum_door_6");
        Block jadeDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jade_door_6");
        Block paulowniaDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"paulownia_door_6");
        Block wisteriaDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"wisteria_door_6");
        Block jacarandaDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jacaranda_door_6");
        Block dogwoodDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dogwood_door_6");
        Block silverbellDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"silverbell_door_6");

        Block acaciaDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"acacia_door_6");
        Block birchDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"birch_door_6");
        Block oakDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"oak_door_6");
        Block darkOakDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"dark_oak_door_6");
        Block spruceDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"spruce_door_6");
        Block jungleDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)),"jungle_door_6");

        Block redStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"red_stained_door_6");
        Block orangeStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"orange_stained_door_6");
        Block yellowStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"yellow_stained_door_6");
        Block limeStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"lime_stained_door_6");
        Block greenStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"green_stained_door_6");
        Block cyanStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"cyan_stained_door_6");
        Block lightBlueStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_blue_stained_door_6");
        Block blueStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"blue_stained_door_6");
        Block purpleStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"purple_stained_door_6");
        Block magentaStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"magenta_stained_door_6");
        Block pinkStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"pink_stained_door_6");
        Block whiteStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"white_stained_door_6");
        Block lightGrayStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_gray_stained_door_6");
        Block grayStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"gray_stained_door_6");
        Block blackStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"black_stained_door_6");
        Block brownStainedDoor6 = registerBlock(new CustomDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"brown_stained_door_6");


        //trapdoor
        Block crabappleTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "crabapple_trapdoor_1");
        Block poincianaTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "poinciana_trapdoor_1");
        Block laburnumTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "laburnum_trapdoor_1");
        Block jadeTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jade_trapdoor_1");
        Block paulowniaTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "paulownia_trapdoor_1");
        Block wisteriaTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "wisteria_trapdoor_1");
        Block jacarandaTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jacaranda_trapdoor_1");
        Block dogwoodTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dogwood_trapdoor_1");
        Block silverbellTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "silverbell_trapdoor_1");
        Block acaciaTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "acacia_trapdoor_1");
        Block birchTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "birch_trapdoor_1");
        Block oakTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "oak_trapdoor_1");
        Block dark_oakTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dark_oak_trapdoor_1");
        Block spruceTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "spruce_trapdoor_1");
        Block jungleTrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jungle_trapdoor_1");


        Block redStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"red_stained_trapdoor_1");
        Block orangeStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"orange_stained_trapdoor_1");
        Block yellowStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"yellow_stained_trapdoor_1");
        Block limeStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"lime_stained_trapdoor_1");
        Block greenStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"green_stained_trapdoor_1");
        Block cyanStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"cyan_stained_trapdoor_1");
        Block lightBlueStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_blue_stained_trapdoor_1");
        Block blueStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"blue_stained_trapdoor_1");
        Block purpleStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"purple_stained_trapdoor_1");
        Block magentaStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"magenta_stained_trapdoor_1");
        Block pinkStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"pink_stained_trapdoor_1");
        Block whiteStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"white_stained_trapdoor_1");
        Block lightGrayStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_gray_stained_trapdoor_1");
        Block grayStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"gray_stained_trapdoor_1");
        Block blackStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"black_stained_trapdoor_1");
        Block brownStainedtrapDoor1 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"brown_stained_trapdoor_1");

        Block crabappleTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "crabapple_trapdoor_2");
        Block poincianaTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "poinciana_trapdoor_2");
        Block laburnumTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "laburnum_trapdoor_2");
        Block jadeTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jade_trapdoor_2");
        Block paulowniaTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "paulownia_trapdoor_2");
        Block wisteriaTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "wisteria_trapdoor_2");
        Block jacarandaTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jacaranda_trapdoor_2");
        Block dogwoodTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dogwood_trapdoor_2");
        Block silverbellTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "silverbell_trapdoor_2");
        Block acaciaTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "acacia_trapdoor_2");
        Block birchTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "birch_trapdoor_2");
        Block oakTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "oak_trapdoor_2");
        Block dark_oakTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dark_oak_trapdoor_2");
        Block spruceTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "spruce_trapdoor_2");
        Block jungleTrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jungle_trapdoor_2");


        Block redStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"red_stained_trapdoor_2");
        Block orangeStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"orange_stained_trapdoor_2");
        Block yellowStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"yellow_stained_trapdoor_2");
        Block limeStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"lime_stained_trapdoor_2");
        Block greenStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"green_stained_trapdoor_2");
        Block cyanStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"cyan_stained_trapdoor_2");
        Block lightBlueStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_blue_stained_trapdoor_2");
        Block blueStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"blue_stained_trapdoor_2");
        Block purpleStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"purple_stained_trapdoor_2");
        Block magentaStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"magenta_stained_trapdoor_2");
        Block pinkStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"pink_stained_trapdoor_2");
        Block whiteStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"white_stained_trapdoor_2");
        Block lightGrayStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_gray_stained_trapdoor_2");
        Block grayStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"gray_stained_trapdoor_2");
        Block blackStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"black_stained_trapdoor_2");
        Block brownStainedtrapDoor2 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"brown_stained_trapdoor_2");

        Block crabappleTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "crabapple_trapdoor_3");
        Block poincianaTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "poinciana_trapdoor_3");
        Block laburnumTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "laburnum_trapdoor_3");
        Block jadeTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jade_trapdoor_3");
        Block paulowniaTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "paulownia_trapdoor_3");
        Block wisteriaTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "wisteria_trapdoor_3");
        Block jacarandaTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jacaranda_trapdoor_3");
        Block dogwoodTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dogwood_trapdoor_3");
        Block silverbellTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "silverbell_trapdoor_3");
        Block acaciaTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "acacia_trapdoor_3");
        Block birchTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "birch_trapdoor_3");
        Block oakTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "oak_trapdoor_3");
        Block dark_oakTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dark_oak_trapdoor_3");
        Block spruceTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "spruce_trapdoor_3");
        Block jungleTrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jungle_trapdoor_3");


        Block redStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"red_stained_trapdoor_3");
        Block orangeStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"orange_stained_trapdoor_3");
        Block yellowStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"yellow_stained_trapdoor_3");
        Block limeStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"lime_stained_trapdoor_3");
        Block greenStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"green_stained_trapdoor_3");
        Block cyanStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"cyan_stained_trapdoor_3");
        Block lightBlueStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_blue_stained_trapdoor_3");
        Block blueStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"blue_stained_trapdoor_3");
        Block purpleStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"purple_stained_trapdoor_3");
        Block magentaStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"magenta_stained_trapdoor_3");
        Block pinkStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"pink_stained_trapdoor_3");
        Block whiteStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"white_stained_trapdoor_3");
        Block lightGrayStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_gray_stained_trapdoor_3");
        Block grayStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"gray_stained_trapdoor_3");
        Block blackStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"black_stained_trapdoor_3");
        Block brownStainedtrapDoor3 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"brown_stained_trapdoor_3");

        Block crabappleTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "crabapple_trapdoor_4");
        Block poincianaTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "poinciana_trapdoor_4");
        Block laburnumTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "laburnum_trapdoor_4");
        Block jadeTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jade_trapdoor_4");
        Block paulowniaTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "paulownia_trapdoor_4");
        Block wisteriaTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "wisteria_trapdoor_4");
        Block jacarandaTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jacaranda_trapdoor_4");
        Block dogwoodTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dogwood_trapdoor_4");
        Block silverbellTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "silverbell_trapdoor_4");
        Block acaciaTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "acacia_trapdoor_4");
        Block birchTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "birch_trapdoor_4");
        Block oakTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "oak_trapdoor_4");
        Block dark_oakTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "dark_oak_trapdoor_4");
        Block spruceTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "spruce_trapdoor_4");
        Block jungleTrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD)), "jungle_trapdoor_4");


        Block redStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"red_stained_trapdoor_4");
        Block orangeStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"orange_stained_trapdoor_4");
        Block yellowStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"yellow_stained_trapdoor_4");
        Block limeStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"lime_stained_trapdoor_4");
        Block greenStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"green_stained_trapdoor_4");
        Block cyanStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"cyan_stained_trapdoor_4");
        Block lightBlueStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_blue_stained_trapdoor_4");
        Block blueStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"blue_stained_trapdoor_4");
        Block purpleStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"purple_stained_trapdoor_4");
        Block magentaStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"magenta_stained_trapdoor_4");
        Block pinkStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"pink_stained_trapdoor_4");
        Block whiteStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"white_stained_trapdoor_4");
        Block lightGrayStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"light_gray_stained_trapdoor_4");
        Block grayStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"gray_stained_trapdoor_4");
        Block blackStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"black_stained_trapdoor_4");
        Block brownStainedtrapDoor4 = registerBlock(new CustomTrapDoorBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(6.0F).sound(SoundType.WOOD)),"brown_stained_trapdoor_4");

        fairyGlowCup = registerBlock(new FairyGlowCup(Block.Properties.create(Material.PLANTS).lightValue(15)), "fairy_glow_cup");


        GRASS.add(ModBlocks.ornamentalGrass);
    }





        public static Block registerBlock(Block block, String name)
        {
            BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(ModItemGroups.MAIDENS_BLOCKS_GROUP));
            block.setRegistryName(name);
            itemBlock.setRegistryName(name);
            ForgeRegistries.BLOCKS.register(block);
            ForgeRegistries.ITEMS.register(itemBlock);
            return block;
        }

        public static Block registerBlockNoTab(Block block, String name)
        {
            BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(null));
            block.setRegistryName(name);
            itemBlock.setRegistryName(name);
            ForgeRegistries.BLOCKS.register(block);
            ForgeRegistries.ITEMS.register(itemBlock);
            return block;
        }

        public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);


        }

        return block;
    }




}

