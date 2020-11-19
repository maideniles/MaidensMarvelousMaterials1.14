package com.maideniles.maidensmaterials.world.feature.tree;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MaidensTrees extends Tree {
    private MaidensTreeColor color;

    public MaidensTrees(MaidensTreeColor colorIn) {
        color = colorIn;
    }


    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {

        switch (color) {
            case RED:

                 return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.crabappleLog.getDefaultState(), ModBlocks.crabappleLeaves.getDefaultState(), ModBlocks.crabappleVine.getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.crabappleLog.getDefaultState(), ModBlocks.crabappleLeaves.getDefaultState()));

            case ORANGE:

                return  (random.nextInt(3) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.poincianaLog.getDefaultState(), ModBlocks.poincianaLeaves.getDefaultState(), ModBlocks.poincianaVine.getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.poincianaLog.getDefaultState(), ModBlocks.poincianaLeaves.getDefaultState()));

            case YELLOW: return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.laburnumLog.getDefaultState(), ModBlocks.laburnumLeaves.getDefaultState(), ModBlocks.laburnumVine.getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.laburnumLog.getDefaultState(), ModBlocks.laburnumLeaves.getDefaultState()));

            case GREEN:

                return  (random.nextInt(5) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jadeLog.getDefaultState(), ModBlocks.jadeLeaves.getDefaultState(), ModBlocks.jadeVine.getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jadeLog.getDefaultState(), ModBlocks.jadeLeaves.getDefaultState()));

            case TEAL: return  (random.nextInt(5) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.paulowniaLog.getDefaultState(), ModBlocks.paulowniaLeaves.getDefaultState(), ModBlocks.paulowniaVine.getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.paulowniaLog.getDefaultState(), ModBlocks.paulowniaLeaves.getDefaultState()));


            case BLUE: return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.wisteriaLog.getDefaultState(), ModBlocks.wisteriaLeaves.getDefaultState(), ModBlocks.wisteriaVine.getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.wisteriaLog.getDefaultState(), ModBlocks.wisteriaLeaves.getDefaultState()));


            case PURPLE:

                return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jacarandaLog.getDefaultState(), ModBlocks.jacarandaLeaves.getDefaultState(), ModBlocks.jacarandaVine.getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jacarandaLog.getDefaultState(), ModBlocks.jacarandaLeaves.getDefaultState()));


            case PINK:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.dogwoodLog.getDefaultState(), ModBlocks.dogwoodLeaves.getDefaultState(), ModBlocks.dogwoodVine.getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.dogwoodLog.getDefaultState(), ModBlocks.dogwoodLeaves.getDefaultState()));


            case WHITE:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.silverbellLog.getDefaultState(), ModBlocks.silverbellLeaves.getDefaultState(), ModBlocks.silverbellVine.getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.silverbellLog.getDefaultState(), ModBlocks.silverbellLeaves.getDefaultState()));
        }

        return getTreeFeature(random);
    }
}