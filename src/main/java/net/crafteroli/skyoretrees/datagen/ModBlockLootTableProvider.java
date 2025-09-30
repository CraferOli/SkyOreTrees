package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.block.ModBlocks;
import net.crafteroli.skyoretrees.item.ModItems;
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


        dropSelf(ModBlocks.DIRT_SAPLING.get());
        this.add(ModBlocks.DIRT_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.DIRT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_DIRT_LOG.get());
        dropSelf(ModBlocks.SATURATED_DIRT_WOOD.get());
        dropSelf(ModBlocks.DIRT_LOG.get());
        dropSelf(ModBlocks.DIRT_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DIRT_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DIRT_WOOD.get());
        dropSelf(ModBlocks.DIRT_PLANKS.get());
        dropSelf(ModBlocks.DIRT_STAIRS.get());
        add(ModBlocks.DIRT_SLAB.get(), block -> createSlabItemTable(ModBlocks.DIRT_SLAB.get()));
        dropSelf(ModBlocks.DIRT_FENCE_GATE.get());
        dropSelf(ModBlocks.DIRT_FENCE.get());
        dropSelf(ModBlocks.DIRT_BUTTON.get());
        dropSelf(ModBlocks.DIRT_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.STONE_SAPLING.get());
        this.add(ModBlocks.STONE_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.STONE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_STONE_LOG.get());
        dropSelf(ModBlocks.SATURATED_STONE_WOOD.get());
        dropSelf(ModBlocks.STONE_LOG.get());
        dropSelf(ModBlocks.STONE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_STONE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_STONE_WOOD.get());
        dropSelf(ModBlocks.STONE_PLANKS.get());
        dropSelf(ModBlocks.STONE_STAIRS.get());
        add(ModBlocks.STONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.STONE_SLAB.get()));
        dropSelf(ModBlocks.STONE_FENCE_GATE.get());
        dropSelf(ModBlocks.STONE_FENCE.get());
        dropSelf(ModBlocks.STONE_BUTTON.get());
        dropSelf(ModBlocks.STONE_PRESSURE_PLATE.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
