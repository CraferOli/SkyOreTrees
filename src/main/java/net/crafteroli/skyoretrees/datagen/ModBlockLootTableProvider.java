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

        dropSelf(ModBlocks.COAL_SAPLING.get());
        this.add(ModBlocks.COAL_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.COAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_COAL_LOG.get());
        dropSelf(ModBlocks.SATURATED_COAL_WOOD.get());
        dropSelf(ModBlocks.COAL_LOG.get());
        dropSelf(ModBlocks.COAL_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_COAL_LOG.get());
        dropSelf(ModBlocks.STRIPPED_COAL_WOOD.get());
        dropSelf(ModBlocks.COAL_PLANKS.get());
        dropSelf(ModBlocks.COAL_STAIRS.get());
        add(ModBlocks.COAL_SLAB.get(), block -> createSlabItemTable(ModBlocks.COAL_SLAB.get()));
        dropSelf(ModBlocks.COAL_FENCE_GATE.get());
        dropSelf(ModBlocks.COAL_FENCE.get());
        dropSelf(ModBlocks.COAL_BUTTON.get());
        dropSelf(ModBlocks.COAL_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.COPPER_SAPLING.get());
        this.add(ModBlocks.COPPER_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.COPPER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_COPPER_LOG.get());
        dropSelf(ModBlocks.SATURATED_COPPER_WOOD.get());
        dropSelf(ModBlocks.COPPER_LOG.get());
        dropSelf(ModBlocks.COPPER_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_COPPER_LOG.get());
        dropSelf(ModBlocks.STRIPPED_COPPER_WOOD.get());
        dropSelf(ModBlocks.COPPER_PLANKS.get());
        dropSelf(ModBlocks.COPPER_STAIRS.get());
        add(ModBlocks.COPPER_SLAB.get(), block -> createSlabItemTable(ModBlocks.COPPER_SLAB.get()));
        dropSelf(ModBlocks.COPPER_FENCE_GATE.get());
        dropSelf(ModBlocks.COPPER_FENCE.get());
        dropSelf(ModBlocks.COPPER_BUTTON.get());
        dropSelf(ModBlocks.COPPER_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.IRON_SAPLING.get());
        this.add(ModBlocks.IRON_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.IRON_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_IRON_LOG.get());
        dropSelf(ModBlocks.SATURATED_IRON_WOOD.get());
        dropSelf(ModBlocks.IRON_LOG.get());
        dropSelf(ModBlocks.IRON_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_IRON_LOG.get());
        dropSelf(ModBlocks.STRIPPED_IRON_WOOD.get());
        dropSelf(ModBlocks.IRON_PLANKS.get());
        dropSelf(ModBlocks.IRON_STAIRS.get());
        add(ModBlocks.IRON_SLAB.get(), block -> createSlabItemTable(ModBlocks.IRON_SLAB.get()));
        dropSelf(ModBlocks.IRON_FENCE_GATE.get());
        dropSelf(ModBlocks.IRON_FENCE.get());
        dropSelf(ModBlocks.IRON_BUTTON.get());
        dropSelf(ModBlocks.IRON_PRESSURE_PLATE.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
