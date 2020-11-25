package com.maideniles.maidensmaterials.block;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.block.*;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.Random;

public class BlockOrnamentalGrass extends GrassBlock implements IGrowable {
    public BlockOrnamentalGrass(Properties properties) {
        super(properties);
    }

  //  @Override
  //  public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {

        // TODO Auto-generated method stub
  //      if(player.getHeldItem(handIn).toString().toLowerCase().contains("hoe")) {
   //         worldIn.setBlockState(pos, Blocks.FARMLAND.getDefaultState());
   //         worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
   //     }

   //     int howextraisthis = EnchantmentHelper.getEnchantmentLevel(
   //             ModEnchantments.FLOWER_POWER,
   //             player.getHeldItem(handIn));
    //    if (howextraisthis > 0) {

   //         worldIn.setBlockState(pos, ModBlocks.ornamentalPath.get().getDefaultState());
    //    }

   //     return true;
  //  }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return worldIn.getBlockState(pos.up()).isAir();
    }



    public void Tick(World worldIn, BlockPos pos, BlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (!worldIn.isAreaLoaded(pos, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            if (worldIn.getNeighborAwareLightSubtracted(pos.up(),4) >= 4)
            {
                worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
            }
            else
            {
                if (worldIn.getNeighborAwareLightSubtracted(pos.up(), 9) >= 9)
                {
                    for (int i = 0; i < 4; ++i)
                    {
                        BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

                        if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos))
                        {
                            return;
                        }

                        BlockState iblockstate = worldIn.getBlockState(blockpos.up());
                        BlockState iblockstate1 = worldIn.getBlockState(blockpos);

                        if (iblockstate1.getBlock() instanceof SpreadableSnowyDirtBlock && worldIn.getNeighborAwareLightSubtracted(blockpos.up(),4) >= 4)
                        {
                            worldIn.setBlockState(blockpos, ModBlocks.ornamentalGrass.get().getDefaultState());
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }
}









