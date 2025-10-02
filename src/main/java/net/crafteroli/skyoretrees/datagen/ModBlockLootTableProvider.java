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

        dropSelf(ModBlocks.GOLD_SAPLING.get());
        this.add(ModBlocks.GOLD_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.GOLD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_GOLD_LOG.get());
        dropSelf(ModBlocks.SATURATED_GOLD_WOOD.get());
        dropSelf(ModBlocks.GOLD_LOG.get());
        dropSelf(ModBlocks.GOLD_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_GOLD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_GOLD_WOOD.get());
        dropSelf(ModBlocks.GOLD_PLANKS.get());
        dropSelf(ModBlocks.GOLD_STAIRS.get());
        add(ModBlocks.GOLD_SLAB.get(), block -> createSlabItemTable(ModBlocks.GOLD_SLAB.get()));
        dropSelf(ModBlocks.GOLD_FENCE_GATE.get());
        dropSelf(ModBlocks.GOLD_FENCE.get());
        dropSelf(ModBlocks.GOLD_BUTTON.get());
        dropSelf(ModBlocks.GOLD_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.REDSTONE_SAPLING.get());
        this.add(ModBlocks.REDSTONE_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.REDSTONE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_REDSTONE_LOG.get());
        dropSelf(ModBlocks.SATURATED_REDSTONE_WOOD.get());
        dropSelf(ModBlocks.REDSTONE_LOG.get());
        dropSelf(ModBlocks.REDSTONE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_REDSTONE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_REDSTONE_WOOD.get());
        dropSelf(ModBlocks.REDSTONE_PLANKS.get());
        dropSelf(ModBlocks.REDSTONE_STAIRS.get());
        add(ModBlocks.REDSTONE_SLAB.get(), block -> createSlabItemTable(ModBlocks.REDSTONE_SLAB.get()));
        dropSelf(ModBlocks.REDSTONE_FENCE_GATE.get());
        dropSelf(ModBlocks.REDSTONE_FENCE.get());
        dropSelf(ModBlocks.REDSTONE_BUTTON.get());
        dropSelf(ModBlocks.REDSTONE_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.LAPIS_SAPLING.get());
        this.add(ModBlocks.LAPIS_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.LAPIS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_LAPIS_LOG.get());
        dropSelf(ModBlocks.SATURATED_LAPIS_WOOD.get());
        dropSelf(ModBlocks.LAPIS_LOG.get());
        dropSelf(ModBlocks.LAPIS_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_LAPIS_LOG.get());
        dropSelf(ModBlocks.STRIPPED_LAPIS_WOOD.get());
        dropSelf(ModBlocks.LAPIS_PLANKS.get());
        dropSelf(ModBlocks.LAPIS_STAIRS.get());
        add(ModBlocks.LAPIS_SLAB.get(), block -> createSlabItemTable(ModBlocks.LAPIS_SLAB.get()));
        dropSelf(ModBlocks.LAPIS_FENCE_GATE.get());
        dropSelf(ModBlocks.LAPIS_FENCE.get());
        dropSelf(ModBlocks.LAPIS_BUTTON.get());
        dropSelf(ModBlocks.LAPIS_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.EMERALD_SAPLING.get());
        this.add(ModBlocks.EMERALD_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.EMERALD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_EMERALD_LOG.get());
        dropSelf(ModBlocks.SATURATED_EMERALD_WOOD.get());
        dropSelf(ModBlocks.EMERALD_LOG.get());
        dropSelf(ModBlocks.EMERALD_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_EMERALD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_EMERALD_WOOD.get());
        dropSelf(ModBlocks.EMERALD_PLANKS.get());
        dropSelf(ModBlocks.EMERALD_STAIRS.get());
        add(ModBlocks.EMERALD_SLAB.get(), block -> createSlabItemTable(ModBlocks.EMERALD_SLAB.get()));
        dropSelf(ModBlocks.EMERALD_FENCE_GATE.get());
        dropSelf(ModBlocks.EMERALD_FENCE.get());
        dropSelf(ModBlocks.EMERALD_BUTTON.get());
        dropSelf(ModBlocks.EMERALD_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.DIAMOND_SAPLING.get());
        this.add(ModBlocks.DIAMOND_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.DIAMOND_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_DIAMOND_LOG.get());
        dropSelf(ModBlocks.SATURATED_DIAMOND_WOOD.get());
        dropSelf(ModBlocks.DIAMOND_LOG.get());
        dropSelf(ModBlocks.DIAMOND_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DIAMOND_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DIAMOND_WOOD.get());
        dropSelf(ModBlocks.DIAMOND_PLANKS.get());
        dropSelf(ModBlocks.DIAMOND_STAIRS.get());
        add(ModBlocks.DIAMOND_SLAB.get(), block -> createSlabItemTable(ModBlocks.DIAMOND_SLAB.get()));
        dropSelf(ModBlocks.DIAMOND_FENCE_GATE.get());
        dropSelf(ModBlocks.DIAMOND_FENCE.get());
        dropSelf(ModBlocks.DIAMOND_BUTTON.get());
        dropSelf(ModBlocks.DIAMOND_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.QUARTZ_SAPLING.get());
        this.add(ModBlocks.QUARTZ_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.QUARTZ_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_QUARTZ_LOG.get());
        dropSelf(ModBlocks.SATURATED_QUARTZ_WOOD.get());
        dropSelf(ModBlocks.QUARTZ_LOG.get());
        dropSelf(ModBlocks.QUARTZ_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_QUARTZ_LOG.get());
        dropSelf(ModBlocks.STRIPPED_QUARTZ_WOOD.get());
        dropSelf(ModBlocks.QUARTZ_PLANKS.get());
        dropSelf(ModBlocks.QUARTZ_STAIRS.get());
        add(ModBlocks.QUARTZ_SLAB.get(), block -> createSlabItemTable(ModBlocks.QUARTZ_SLAB.get()));
        dropSelf(ModBlocks.QUARTZ_FENCE_GATE.get());
        dropSelf(ModBlocks.QUARTZ_FENCE.get());
        dropSelf(ModBlocks.QUARTZ_BUTTON.get());
        dropSelf(ModBlocks.QUARTZ_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.DEBRIS_SAPLING.get());
        this.add(ModBlocks.DEBRIS_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.DEBRIS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(ModBlocks.SATURATED_DEBRIS_LOG.get());
        dropSelf(ModBlocks.SATURATED_DEBRIS_WOOD.get());
        dropSelf(ModBlocks.DEBRIS_LOG.get());
        dropSelf(ModBlocks.DEBRIS_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DEBRIS_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DEBRIS_WOOD.get());
        dropSelf(ModBlocks.DEBRIS_PLANKS.get());
        dropSelf(ModBlocks.DEBRIS_STAIRS.get());
        add(ModBlocks.DEBRIS_SLAB.get(), block -> createSlabItemTable(ModBlocks.DEBRIS_SLAB.get()));
        dropSelf(ModBlocks.DEBRIS_FENCE_GATE.get());
        dropSelf(ModBlocks.DEBRIS_FENCE.get());
        dropSelf(ModBlocks.DEBRIS_BUTTON.get());
        dropSelf(ModBlocks.DEBRIS_PRESSURE_PLATE.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
