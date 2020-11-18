package com.maideniles.maidensmaterials.block.vase;


import init.ModBlocks;
import init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class BlockClayVaseCyan extends Block {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(4.8, 0, 4.8, 11.2, 6.0, 11.2);


    public BlockClayVaseCyan(Properties properties) {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5F).sound(SoundType.STONE));
        this.setDefaultState(this.getDefaultState());
    }



    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {  return SHAPE;

    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPE;
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack blossom = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {



            if (blossom.getItem() == ModItems.CRABAPPLE_BLOSSOMS){

                System.out.println("RED FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseRedFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.POINCIANA_BLOSSOMS){

                System.out.println("ORANGE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseOrangeFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.LABURNUM_BLOSSOMS){

                System.out.println("YELLOW FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseYellowFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.JADE_BLOSSOMS){

                System.out.println("GREEN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseGreenFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.PAULOWNIA_BLOSSOMS){

                System.out.println("CYAN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseCyanFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.WISTERIA_BLOSSOMS){

                System.out.println("BLUE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseBlueFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.JACARANDA_BLOSSOMS){

                System.out.println("PURPLE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVasePurpleFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.DOGWOOD_BLOSSOMS){

                System.out.println("PINK FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVasePinkFlower.getDefaultState());
            }

            if (blossom.getItem() == ModItems.SILVERBELL_BLOSSOMS){

                System.out.println("WHITE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseWhiteFlower.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.crabappleSapling)){

                System.out.println("RED SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseRedSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.poincianaSapling)){

                System.out.println("ORANGE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseOrangeSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.laburnumSapling)){

                System.out.println("YELLOW SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseYellowSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.jadeSapling)){

                System.out.println("GREEN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseGreenSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.paulowniaSapling)){

                System.out.println("CYAN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseCyanSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.wisteriaSapling)){

                System.out.println("BLUE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseBlueSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.jacarandaSapling)){

                System.out.println("PURPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVasePurpleSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.dogwoodSapling)){

                System.out.println("PINK SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVasePinkSapling.getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.silverbellSapling)){

                System.out.println("WHITE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.cyanVaseWhiteSapling.getDefaultState());
            }

        }




        return true;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}


