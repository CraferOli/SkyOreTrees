package net.crafteroli.skyoretrees.block.custom;

import net.crafteroli.skyoretrees.init.TreeInit;
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
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        return context.getItemInHand().getItem() instanceof AxeItem && TreeInit.debarkingMap.containsKey(state.getBlock()) ? (BlockState) ((Block) TreeInit.debarkingMap.get(state.getBlock())).defaultBlockState().setValue(AXIS, (Direction.Axis) state.getValue(AXIS)) : super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
