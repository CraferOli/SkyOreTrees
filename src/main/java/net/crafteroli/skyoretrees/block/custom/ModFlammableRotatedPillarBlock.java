package net.crafteroli.skyoretrees.block.custom;

import net.crafteroli.skyoretrees.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }


    private static final Map<Block, Block> STRIPPING = new HashMap<>();

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context,
                                                     ItemAbility itemAbility, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (STRIPPING.isEmpty()) {
                STRIPPING.put(ModBlocks.SATURATED_DIRT_LOG.get(), ModBlocks.DIRT_LOG.get());
                STRIPPING.put(ModBlocks.SATURATED_DIRT_WOOD.get(), ModBlocks.DIRT_WOOD.get());
                STRIPPING.put(ModBlocks.DIRT_LOG.get(), ModBlocks.STRIPPED_DIRT_LOG.get());
                STRIPPING.put(ModBlocks.DIRT_WOOD.get(), ModBlocks.STRIPPED_DIRT_WOOD.get());
            }

            Block strippedBlock = STRIPPING.get(state.getBlock());
            if (strippedBlock != null) {
                return strippedBlock.defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
