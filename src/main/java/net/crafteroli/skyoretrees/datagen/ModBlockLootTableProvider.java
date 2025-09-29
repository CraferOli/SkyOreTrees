package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.init.BlockInit;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.crafteroli.skyoretrees.util.TreeBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        for(TreeBlocks treeBlocks : TreeInit.registeredTrees) {
            this.dropSelf((Block)treeBlocks.SAPLING.get());
            this.add((Block)treeBlocks.LEAVES.get(), (block) -> this.createLeavesDrops(block, (Block)treeBlocks.SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
            this.dropSelf((Block)treeBlocks.SATURATED_LOG.get());
            this.dropSelf((Block)treeBlocks.SATURATED_WOOD.get());
            this.dropSelf((Block)treeBlocks.LOG.get());
            this.dropSelf((Block)treeBlocks.WOOD.get());
            this.dropSelf((Block)treeBlocks.STRIPPED_LOG.get());
            this.dropSelf((Block)treeBlocks.STRIPPED_WOOD.get());
            this.dropSelf((Block)treeBlocks.PLANKS.get());
            this.dropSelf((Block)treeBlocks.STAIRS.get());
            this.add((Block)treeBlocks.SLAB.get(), (block) -> this.createSlabItemTable((Block)treeBlocks.SLAB.get()));
            this.dropSelf((Block)treeBlocks.FENCE_GATE.get());
            this.dropSelf((Block)treeBlocks.FENCE.get());
            this.dropSelf((Block)treeBlocks.BUTTON.get());
            this.dropSelf((Block)treeBlocks.PRESSURE_PLATE.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
