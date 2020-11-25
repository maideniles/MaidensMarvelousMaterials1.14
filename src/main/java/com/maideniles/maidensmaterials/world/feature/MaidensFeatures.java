package com.maideniles.maidensmaterials.world.feature;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeFeature;
import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeFeatureVines;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.JungleTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.registries.ForgeRegistries;


public abstract class MaidensFeatures<FC extends IFeatureConfig> extends net.minecraftforge.registries.ForgeRegistryEntry<net.minecraft.world.gen.feature.Feature<?>>{

    public static final Feature<NoFeatureConfig> CRABAPPLE_TREE_VINES = register("crabapple_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.crabappleLog.get().getDefaultState(), ModBlocks.crabappleLeaves.get().getDefaultState(), ModBlocks.crabappleVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> POINCIANA_TREE_VINES = register("poinciana_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.poincianaLog.get().getDefaultState(), ModBlocks.poincianaLeaves.get().getDefaultState(), ModBlocks.poincianaVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> LABURNUM_TREE_VINES = register("laburnum_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.laburnumLog.get().getDefaultState(), ModBlocks.laburnumLeaves.get().getDefaultState(), ModBlocks.laburnumVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> JADE_TREE_VINES = register("jade_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.jadeLog.get().getDefaultState(), ModBlocks.jadeLeaves.get().getDefaultState(), ModBlocks.jadeVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> PAULOWNIA_TREE_VINES = register("paulownia_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.paulowniaLog.get().getDefaultState(), ModBlocks.paulowniaLeaves.get().getDefaultState(), ModBlocks.paulowniaVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> WISTERIA_TREE_VINES = register("wisteria_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.wisteriaLog.get().getDefaultState(), ModBlocks.wisteriaLeaves.get().getDefaultState(), ModBlocks.wisteriaVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> JACARANDA_TREE_VINES = register("jacaranda_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.jacarandaLog.get().getDefaultState(), ModBlocks.jacarandaLeaves.get().getDefaultState(), ModBlocks.jacarandaVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> DOGWOOD_TREE_VINES = register("dogwood_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.dogwoodLog.get().getDefaultState(), ModBlocks.dogwoodLeaves.get().getDefaultState(), ModBlocks.dogwoodVine.get().getDefaultState(), true));
    public static final Feature<NoFeatureConfig> SILVERBELL_TREE_VINES = register("silverbell_tree_vines", new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true,ModBlocks.silverbellLog.get().getDefaultState(), ModBlocks.silverbellLeaves.get().getDefaultState(), ModBlocks.silverbellVine.get().getDefaultState(), true));
    //NO VINES//
    public static final Feature<NoFeatureConfig> CEDAR_TREE = register("cedar_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.cedarLeaves.get().getDefaultState()));

    public static final Feature<NoFeatureConfig> CRABAPPLE_TREE = register("crabapple_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.crabappleLog.get().getDefaultState(), ModBlocks.crabappleLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> POINCIANA_TREE = register("poinciana_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.poincianaLog.get().getDefaultState(), ModBlocks.poincianaLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> LABURNUM_TREE = register("laburnum_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.laburnumLog.get().getDefaultState(), ModBlocks.laburnumLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> JADE_TREE = register("jade_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jadeLog.get().getDefaultState(), ModBlocks.jadeLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> PAULOWNIA_TREE = register("paulownia_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.paulowniaLog.get().getDefaultState(), ModBlocks.paulowniaLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> WISTERIA_TREE = register("wisteria_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.wisteriaLog.get().getDefaultState(), ModBlocks.wisteriaLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> JACARANDA_TREE = register("jacaranda_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jacarandaLog.get().getDefaultState(), ModBlocks.jacarandaLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> DOGWOOD_TREE = register("dogwood_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.dogwoodLog.get().getDefaultState(), ModBlocks.dogwoodLeaves.get().getDefaultState()));
    public static final Feature<NoFeatureConfig> SILVERBELL_TREE = register("silverbell_tree",new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.silverbellLog.get().getDefaultState(), ModBlocks.silverbellLeaves.get().getDefaultState()));



    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value)
    {
        value.setRegistryName(new ResourceLocation(MarvelousMaterials.MODID, key));
        ForgeRegistries.FEATURES.register(value);
        return value;
    }
}
