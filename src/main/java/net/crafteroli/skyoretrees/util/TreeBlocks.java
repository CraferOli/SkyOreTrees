package net.crafteroli.skyoretrees.util;

import net.crafteroli.skyoretrees.block.custom.ModFlammableBlock;
import net.crafteroli.skyoretrees.block.custom.ModFlammableLeavesBlock;
import net.crafteroli.skyoretrees.block.custom.ModFlammableRotatedPillarBlock;
import net.crafteroli.skyoretrees.init.ItemInit;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static net.crafteroli.skyoretrees.init.BlockInit.BLOCKS;

public class TreeBlocks {

    public final DeferredBlock<SaplingBlock> SAPLING;
    public final DeferredHolder<Block, ModFlammableLeavesBlock> LEAVES;
    public final DeferredHolder<Block, ModFlammableRotatedPillarBlock> SATURATED_LOG;
    public final DeferredHolder<Block, ModFlammableRotatedPillarBlock> SATURATED_WOOD;
    public final DeferredHolder<Block, ModFlammableRotatedPillarBlock> LOG;
    public final DeferredHolder<Block, ModFlammableRotatedPillarBlock> WOOD;
    public final DeferredHolder<Block, ModFlammableRotatedPillarBlock> STRIPPED_LOG;
    public final DeferredHolder<Block, ModFlammableRotatedPillarBlock> STRIPPED_WOOD;
    public final DeferredHolder<Block, ModFlammableBlock> PLANKS;
    public final DeferredBlock<StairBlock> STAIRS;
    public final DeferredBlock<SlabBlock> SLAB;
    public final DeferredBlock<FenceGateBlock> FENCE_GATE;
    public final DeferredBlock<FenceBlock> FENCE;
    public final DeferredBlock<ButtonBlock> BUTTON;
    public final DeferredBlock<PressurePlateBlock> PRESSURE_PLATE;

    public TreeBlocks(String woodType, TreeGrower treeGrower) {
        this.SAPLING = (DeferredBlock<SaplingBlock>) TreeInit.registerBlock(woodType + "_sapling", () -> new SaplingBlock(treeGrower, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
        this.LEAVES = TreeInit.registerBlock(woodType + "_leaves", () -> new ModFlammableLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
        this.SATURATED_LOG = TreeInit.registerBlock("saturated_" + woodType + "_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
        this.SATURATED_WOOD = TreeInit.registerBlock("saturated_" + woodType + "_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
        this.LOG = TreeInit.registerBlock(woodType + "_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
        this.WOOD = TreeInit.registerBlock(woodType + "_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
        this.STRIPPED_LOG = TreeInit.registerBlock("stripped_" + woodType + "_log", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
        this.STRIPPED_WOOD = TreeInit.registerBlock("stripped_" + woodType + "_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
        this.PLANKS = TreeInit.registerBlock(woodType + "_planks", () -> new ModFlammableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
        this.STAIRS = (DeferredBlock<StairBlock>) TreeInit.registerBlock(woodType + "_stairs", () -> new StairBlock(((Block) this.PLANKS.get()).defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
        this.SLAB = (DeferredBlock<SlabBlock>) TreeInit.registerBlock(woodType + "_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
        this.FENCE_GATE = (DeferredBlock<FenceGateBlock>) TreeInit.registerBlock(woodType + "_fence_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
        this.FENCE = (DeferredBlock<FenceBlock>) TreeInit.registerBlock(woodType + "_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
        this.BUTTON = (DeferredBlock<ButtonBlock>) TreeInit.registerBlock(woodType + "_button", () -> new ButtonBlock(BlockSetType.OAK, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
        this.PRESSURE_PLATE = (DeferredBlock<PressurePlateBlock>) TreeInit.registerBlock(woodType + "_pressure_plate", () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
        TreeInit.registeredTrees.add(this);
    }
//    private static <T extends Block> @NotNull DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
//        DeferredBlock<T> toReturn = (DeferredBlock<T>) BLOCKS.register(name, block);
//        registerBlockItem(name, toReturn);
//        return toReturn;
//    }
//
//    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
//        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
//    }
//
//    public static void register(IEventBus eventBus) {
//        BLOCKS.register(eventBus);
//    }
}
