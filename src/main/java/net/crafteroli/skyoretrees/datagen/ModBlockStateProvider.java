package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SkyOreTrees.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DIRT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DIRT_WOOD.get()), blockTexture(ModBlocks.SATURATED_DIRT_LOG.get()), blockTexture(ModBlocks.SATURATED_DIRT_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DIRT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DIRT_WOOD.get()), blockTexture(ModBlocks.DIRT_LOG.get()), blockTexture(ModBlocks.DIRT_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DIRT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DIRT_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DIRT_LOG.get()), blockTexture(ModBlocks.STRIPPED_DIRT_LOG.get()));

        saplingBlock(ModBlocks.DIRT_SAPLING);
        leavesBlock(ModBlocks.DIRT_LEAVES);
        blockItem(ModBlocks.SATURATED_DIRT_LOG);
        blockItem(ModBlocks.SATURATED_DIRT_WOOD);
        blockItem(ModBlocks.DIRT_LOG);
        blockItem(ModBlocks.DIRT_WOOD);
        blockItem(ModBlocks.STRIPPED_DIRT_LOG);
        blockItem(ModBlocks.STRIPPED_DIRT_WOOD);
        blockWithItem(ModBlocks.DIRT_PLANKS);
        stairsBlock(ModBlocks.DIRT_STAIRS.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
        slabBlock(ModBlocks.DIRT_SLAB.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()), blockTexture(ModBlocks.DIRT_PLANKS.get()));
        fenceGateBlock(ModBlocks.DIRT_FENCE_GATE.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
        fenceBlock(ModBlocks.DIRT_FENCE.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
        buttonBlock(ModBlocks.DIRT_BUTTON.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
        pressurePlateBlock(ModBlocks.DIRT_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
        blockItem(ModBlocks.DIRT_STAIRS);
        blockItem(ModBlocks.DIRT_SLAB);
        blockItem(ModBlocks.DIRT_FENCE_GATE);
        blockItem(ModBlocks.DIRT_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_STONE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_STONE_WOOD.get()), blockTexture(ModBlocks.SATURATED_STONE_LOG.get()), blockTexture(ModBlocks.SATURATED_STONE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STONE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STONE_WOOD.get()), blockTexture(ModBlocks.STONE_LOG.get()), blockTexture(ModBlocks.STONE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_STONE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_STONE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_STONE_LOG.get()), blockTexture(ModBlocks.STRIPPED_STONE_LOG.get()));

        saplingBlock(ModBlocks.STONE_SAPLING);
        leavesBlock(ModBlocks.STONE_LEAVES);
        blockItem(ModBlocks.SATURATED_STONE_LOG);
        blockItem(ModBlocks.SATURATED_STONE_WOOD);
        blockItem(ModBlocks.STONE_LOG);
        blockItem(ModBlocks.STONE_WOOD);
        blockItem(ModBlocks.STRIPPED_STONE_LOG);
        blockItem(ModBlocks.STRIPPED_STONE_WOOD);
        blockWithItem(ModBlocks.STONE_PLANKS);
        stairsBlock(ModBlocks.STONE_STAIRS.get(), blockTexture(ModBlocks.STONE_PLANKS.get()));
        slabBlock(ModBlocks.STONE_SLAB.get(), blockTexture(ModBlocks.STONE_PLANKS.get()), blockTexture(ModBlocks.STONE_PLANKS.get()));
        fenceGateBlock(ModBlocks.STONE_FENCE_GATE.get(), blockTexture(ModBlocks.STONE_PLANKS.get()));
        fenceBlock(ModBlocks.STONE_FENCE.get(), blockTexture(ModBlocks.STONE_PLANKS.get()));
        buttonBlock(ModBlocks.STONE_BUTTON.get(), blockTexture(ModBlocks.STONE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.STONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.STONE_PLANKS.get()));
        blockItem(ModBlocks.STONE_STAIRS);
        blockItem(ModBlocks.STONE_SLAB);
        blockItem(ModBlocks.STONE_FENCE_GATE);
        blockItem(ModBlocks.STONE_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_COAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_COAL_WOOD.get()), blockTexture(ModBlocks.SATURATED_COAL_LOG.get()), blockTexture(ModBlocks.SATURATED_COAL_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.COAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.COAL_WOOD.get()), blockTexture(ModBlocks.COAL_LOG.get()), blockTexture(ModBlocks.COAL_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_COAL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_COAL_WOOD.get()), blockTexture(ModBlocks.STRIPPED_COAL_LOG.get()), blockTexture(ModBlocks.STRIPPED_COAL_LOG.get()));

        saplingBlock(ModBlocks.COAL_SAPLING);
        leavesBlock(ModBlocks.COAL_LEAVES);
        blockItem(ModBlocks.SATURATED_COAL_LOG);
        blockItem(ModBlocks.SATURATED_COAL_WOOD);
        blockItem(ModBlocks.COAL_LOG);
        blockItem(ModBlocks.COAL_WOOD);
        blockItem(ModBlocks.STRIPPED_COAL_LOG);
        blockItem(ModBlocks.STRIPPED_COAL_WOOD);
        blockWithItem(ModBlocks.COAL_PLANKS);
        stairsBlock(ModBlocks.COAL_STAIRS.get(), blockTexture(ModBlocks.COAL_PLANKS.get()));
        slabBlock(ModBlocks.COAL_SLAB.get(), blockTexture(ModBlocks.COAL_PLANKS.get()), blockTexture(ModBlocks.COAL_PLANKS.get()));
        fenceGateBlock(ModBlocks.COAL_FENCE_GATE.get(), blockTexture(ModBlocks.COAL_PLANKS.get()));
        fenceBlock(ModBlocks.COAL_FENCE.get(), blockTexture(ModBlocks.COAL_PLANKS.get()));
        buttonBlock(ModBlocks.COAL_BUTTON.get(), blockTexture(ModBlocks.COAL_PLANKS.get()));
        pressurePlateBlock(ModBlocks.COAL_PRESSURE_PLATE.get(), blockTexture(ModBlocks.COAL_PLANKS.get()));
        blockItem(ModBlocks.COAL_STAIRS);
        blockItem(ModBlocks.COAL_SLAB);
        blockItem(ModBlocks.COAL_FENCE_GATE);
        blockItem(ModBlocks.COAL_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_COPPER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_COPPER_WOOD.get()), blockTexture(ModBlocks.SATURATED_COPPER_LOG.get()), blockTexture(ModBlocks.SATURATED_COPPER_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.COPPER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.COPPER_WOOD.get()), blockTexture(ModBlocks.COPPER_LOG.get()), blockTexture(ModBlocks.COPPER_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_COPPER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_COPPER_WOOD.get()), blockTexture(ModBlocks.STRIPPED_COPPER_LOG.get()), blockTexture(ModBlocks.STRIPPED_COPPER_LOG.get()));

        saplingBlock(ModBlocks.COPPER_SAPLING);
        leavesBlock(ModBlocks.COPPER_LEAVES);
        blockItem(ModBlocks.SATURATED_COPPER_LOG);
        blockItem(ModBlocks.SATURATED_COPPER_WOOD);
        blockItem(ModBlocks.COPPER_LOG);
        blockItem(ModBlocks.COPPER_WOOD);
        blockItem(ModBlocks.STRIPPED_COPPER_LOG);
        blockItem(ModBlocks.STRIPPED_COPPER_WOOD);
        blockWithItem(ModBlocks.COPPER_PLANKS);
        stairsBlock(ModBlocks.COPPER_STAIRS.get(), blockTexture(ModBlocks.COPPER_PLANKS.get()));
        slabBlock(ModBlocks.COPPER_SLAB.get(), blockTexture(ModBlocks.COPPER_PLANKS.get()), blockTexture(ModBlocks.COPPER_PLANKS.get()));
        fenceGateBlock(ModBlocks.COPPER_FENCE_GATE.get(), blockTexture(ModBlocks.COPPER_PLANKS.get()));
        fenceBlock(ModBlocks.COPPER_FENCE.get(), blockTexture(ModBlocks.COPPER_PLANKS.get()));
        buttonBlock(ModBlocks.COPPER_BUTTON.get(), blockTexture(ModBlocks.COPPER_PLANKS.get()));
        pressurePlateBlock(ModBlocks.COPPER_PRESSURE_PLATE.get(), blockTexture(ModBlocks.COPPER_PLANKS.get()));
        blockItem(ModBlocks.COPPER_STAIRS);
        blockItem(ModBlocks.COPPER_SLAB);
        blockItem(ModBlocks.COPPER_FENCE_GATE);
        blockItem(ModBlocks.COPPER_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_IRON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_IRON_WOOD.get()), blockTexture(ModBlocks.SATURATED_IRON_LOG.get()), blockTexture(ModBlocks.SATURATED_IRON_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.IRON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.IRON_WOOD.get()), blockTexture(ModBlocks.IRON_LOG.get()), blockTexture(ModBlocks.IRON_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_IRON_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_IRON_WOOD.get()), blockTexture(ModBlocks.STRIPPED_IRON_LOG.get()), blockTexture(ModBlocks.STRIPPED_IRON_LOG.get()));

        saplingBlock(ModBlocks.IRON_SAPLING);
        leavesBlock(ModBlocks.IRON_LEAVES);
        blockItem(ModBlocks.SATURATED_IRON_LOG);
        blockItem(ModBlocks.SATURATED_IRON_WOOD);
        blockItem(ModBlocks.IRON_LOG);
        blockItem(ModBlocks.IRON_WOOD);
        blockItem(ModBlocks.STRIPPED_IRON_LOG);
        blockItem(ModBlocks.STRIPPED_IRON_WOOD);
        blockWithItem(ModBlocks.IRON_PLANKS);
        stairsBlock(ModBlocks.IRON_STAIRS.get(), blockTexture(ModBlocks.IRON_PLANKS.get()));
        slabBlock(ModBlocks.IRON_SLAB.get(), blockTexture(ModBlocks.IRON_PLANKS.get()), blockTexture(ModBlocks.IRON_PLANKS.get()));
        fenceGateBlock(ModBlocks.IRON_FENCE_GATE.get(), blockTexture(ModBlocks.IRON_PLANKS.get()));
        fenceBlock(ModBlocks.IRON_FENCE.get(), blockTexture(ModBlocks.IRON_PLANKS.get()));
        buttonBlock(ModBlocks.IRON_BUTTON.get(), blockTexture(ModBlocks.IRON_PLANKS.get()));
        pressurePlateBlock(ModBlocks.IRON_PRESSURE_PLATE.get(), blockTexture(ModBlocks.IRON_PLANKS.get()));
        blockItem(ModBlocks.IRON_STAIRS);
        blockItem(ModBlocks.IRON_SLAB);
        blockItem(ModBlocks.IRON_FENCE_GATE);
        blockItem(ModBlocks.IRON_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_GOLD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_GOLD_WOOD.get()), blockTexture(ModBlocks.SATURATED_GOLD_LOG.get()), blockTexture(ModBlocks.SATURATED_GOLD_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GOLD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GOLD_WOOD.get()), blockTexture(ModBlocks.GOLD_LOG.get()), blockTexture(ModBlocks.GOLD_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GOLD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GOLD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GOLD_LOG.get()), blockTexture(ModBlocks.STRIPPED_GOLD_LOG.get()));

        saplingBlock(ModBlocks.GOLD_SAPLING);
        leavesBlock(ModBlocks.GOLD_LEAVES);
        blockItem(ModBlocks.SATURATED_GOLD_LOG);
        blockItem(ModBlocks.SATURATED_GOLD_WOOD);
        blockItem(ModBlocks.GOLD_LOG);
        blockItem(ModBlocks.GOLD_WOOD);
        blockItem(ModBlocks.STRIPPED_GOLD_LOG);
        blockItem(ModBlocks.STRIPPED_GOLD_WOOD);
        blockWithItem(ModBlocks.GOLD_PLANKS);
        stairsBlock(ModBlocks.GOLD_STAIRS.get(), blockTexture(ModBlocks.GOLD_PLANKS.get()));
        slabBlock(ModBlocks.GOLD_SLAB.get(), blockTexture(ModBlocks.GOLD_PLANKS.get()), blockTexture(ModBlocks.GOLD_PLANKS.get()));
        fenceGateBlock(ModBlocks.GOLD_FENCE_GATE.get(), blockTexture(ModBlocks.GOLD_PLANKS.get()));
        fenceBlock(ModBlocks.GOLD_FENCE.get(), blockTexture(ModBlocks.GOLD_PLANKS.get()));
        buttonBlock(ModBlocks.GOLD_BUTTON.get(), blockTexture(ModBlocks.GOLD_PLANKS.get()));
        pressurePlateBlock(ModBlocks.GOLD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GOLD_PLANKS.get()));
        blockItem(ModBlocks.GOLD_STAIRS);
        blockItem(ModBlocks.GOLD_SLAB);
        blockItem(ModBlocks.GOLD_FENCE_GATE);
        blockItem(ModBlocks.GOLD_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_REDSTONE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_REDSTONE_WOOD.get()), blockTexture(ModBlocks.SATURATED_REDSTONE_LOG.get()), blockTexture(ModBlocks.SATURATED_REDSTONE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.REDSTONE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.REDSTONE_WOOD.get()), blockTexture(ModBlocks.REDSTONE_LOG.get()), blockTexture(ModBlocks.REDSTONE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDSTONE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDSTONE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_REDSTONE_LOG.get()), blockTexture(ModBlocks.STRIPPED_REDSTONE_LOG.get()));

        saplingBlock(ModBlocks.REDSTONE_SAPLING);
        leavesBlock(ModBlocks.REDSTONE_LEAVES);
        blockItem(ModBlocks.SATURATED_REDSTONE_LOG);
        blockItem(ModBlocks.SATURATED_REDSTONE_WOOD);
        blockItem(ModBlocks.REDSTONE_LOG);
        blockItem(ModBlocks.REDSTONE_WOOD);
        blockItem(ModBlocks.STRIPPED_REDSTONE_LOG);
        blockItem(ModBlocks.STRIPPED_REDSTONE_WOOD);
        blockWithItem(ModBlocks.REDSTONE_PLANKS);
        stairsBlock(ModBlocks.REDSTONE_STAIRS.get(), blockTexture(ModBlocks.REDSTONE_PLANKS.get()));
        slabBlock(ModBlocks.REDSTONE_SLAB.get(), blockTexture(ModBlocks.REDSTONE_PLANKS.get()), blockTexture(ModBlocks.REDSTONE_PLANKS.get()));
        fenceGateBlock(ModBlocks.REDSTONE_FENCE_GATE.get(), blockTexture(ModBlocks.REDSTONE_PLANKS.get()));
        fenceBlock(ModBlocks.REDSTONE_FENCE.get(), blockTexture(ModBlocks.REDSTONE_PLANKS.get()));
        buttonBlock(ModBlocks.REDSTONE_BUTTON.get(), blockTexture(ModBlocks.REDSTONE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.REDSTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.REDSTONE_PLANKS.get()));
        blockItem(ModBlocks.REDSTONE_STAIRS);
        blockItem(ModBlocks.REDSTONE_SLAB);
        blockItem(ModBlocks.REDSTONE_FENCE_GATE);
        blockItem(ModBlocks.REDSTONE_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_LAPIS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_LAPIS_WOOD.get()), blockTexture(ModBlocks.SATURATED_LAPIS_LOG.get()), blockTexture(ModBlocks.SATURATED_LAPIS_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.LAPIS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LAPIS_WOOD.get()), blockTexture(ModBlocks.LAPIS_LOG.get()), blockTexture(ModBlocks.LAPIS_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LAPIS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_LAPIS_WOOD.get()), blockTexture(ModBlocks.STRIPPED_LAPIS_LOG.get()), blockTexture(ModBlocks.STRIPPED_LAPIS_LOG.get()));

        saplingBlock(ModBlocks.LAPIS_SAPLING);
        leavesBlock(ModBlocks.LAPIS_LEAVES);
        blockItem(ModBlocks.SATURATED_LAPIS_LOG);
        blockItem(ModBlocks.SATURATED_LAPIS_WOOD);
        blockItem(ModBlocks.LAPIS_LOG);
        blockItem(ModBlocks.LAPIS_WOOD);
        blockItem(ModBlocks.STRIPPED_LAPIS_LOG);
        blockItem(ModBlocks.STRIPPED_LAPIS_WOOD);
        blockWithItem(ModBlocks.LAPIS_PLANKS);
        stairsBlock(ModBlocks.LAPIS_STAIRS.get(), blockTexture(ModBlocks.LAPIS_PLANKS.get()));
        slabBlock(ModBlocks.LAPIS_SLAB.get(), blockTexture(ModBlocks.LAPIS_PLANKS.get()), blockTexture(ModBlocks.LAPIS_PLANKS.get()));
        fenceGateBlock(ModBlocks.LAPIS_FENCE_GATE.get(), blockTexture(ModBlocks.LAPIS_PLANKS.get()));
        fenceBlock(ModBlocks.LAPIS_FENCE.get(), blockTexture(ModBlocks.LAPIS_PLANKS.get()));
        buttonBlock(ModBlocks.LAPIS_BUTTON.get(), blockTexture(ModBlocks.LAPIS_PLANKS.get()));
        pressurePlateBlock(ModBlocks.LAPIS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.LAPIS_PLANKS.get()));
        blockItem(ModBlocks.LAPIS_STAIRS);
        blockItem(ModBlocks.LAPIS_SLAB);
        blockItem(ModBlocks.LAPIS_FENCE_GATE);
        blockItem(ModBlocks.LAPIS_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_EMERALD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_EMERALD_WOOD.get()), blockTexture(ModBlocks.SATURATED_EMERALD_LOG.get()), blockTexture(ModBlocks.SATURATED_EMERALD_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.EMERALD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.EMERALD_WOOD.get()), blockTexture(ModBlocks.EMERALD_LOG.get()), blockTexture(ModBlocks.EMERALD_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_EMERALD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_EMERALD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_EMERALD_LOG.get()), blockTexture(ModBlocks.STRIPPED_EMERALD_LOG.get()));

        saplingBlock(ModBlocks.EMERALD_SAPLING);
        leavesBlock(ModBlocks.EMERALD_LEAVES);
        blockItem(ModBlocks.SATURATED_EMERALD_LOG);
        blockItem(ModBlocks.SATURATED_EMERALD_WOOD);
        blockItem(ModBlocks.EMERALD_LOG);
        blockItem(ModBlocks.EMERALD_WOOD);
        blockItem(ModBlocks.STRIPPED_EMERALD_LOG);
        blockItem(ModBlocks.STRIPPED_EMERALD_WOOD);
        blockWithItem(ModBlocks.EMERALD_PLANKS);
        stairsBlock(ModBlocks.EMERALD_STAIRS.get(), blockTexture(ModBlocks.EMERALD_PLANKS.get()));
        slabBlock(ModBlocks.EMERALD_SLAB.get(), blockTexture(ModBlocks.EMERALD_PLANKS.get()), blockTexture(ModBlocks.EMERALD_PLANKS.get()));
        fenceGateBlock(ModBlocks.EMERALD_FENCE_GATE.get(), blockTexture(ModBlocks.EMERALD_PLANKS.get()));
        fenceBlock(ModBlocks.EMERALD_FENCE.get(), blockTexture(ModBlocks.EMERALD_PLANKS.get()));
        buttonBlock(ModBlocks.EMERALD_BUTTON.get(), blockTexture(ModBlocks.EMERALD_PLANKS.get()));
        pressurePlateBlock(ModBlocks.EMERALD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.EMERALD_PLANKS.get()));
        blockItem(ModBlocks.EMERALD_STAIRS);
        blockItem(ModBlocks.EMERALD_SLAB);
        blockItem(ModBlocks.EMERALD_FENCE_GATE);
        blockItem(ModBlocks.EMERALD_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DIAMOND_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DIAMOND_WOOD.get()), blockTexture(ModBlocks.SATURATED_DIAMOND_LOG.get()), blockTexture(ModBlocks.SATURATED_DIAMOND_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_WOOD.get()), blockTexture(ModBlocks.DIAMOND_LOG.get()), blockTexture(ModBlocks.DIAMOND_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DIAMOND_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DIAMOND_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DIAMOND_LOG.get()), blockTexture(ModBlocks.STRIPPED_DIAMOND_LOG.get()));

        saplingBlock(ModBlocks.DIAMOND_SAPLING);
        leavesBlock(ModBlocks.DIAMOND_LEAVES);
        blockItem(ModBlocks.SATURATED_DIAMOND_LOG);
        blockItem(ModBlocks.SATURATED_DIAMOND_WOOD);
        blockItem(ModBlocks.DIAMOND_LOG);
        blockItem(ModBlocks.DIAMOND_WOOD);
        blockItem(ModBlocks.STRIPPED_DIAMOND_LOG);
        blockItem(ModBlocks.STRIPPED_DIAMOND_WOOD);
        blockWithItem(ModBlocks.DIAMOND_PLANKS);
        stairsBlock(ModBlocks.DIAMOND_STAIRS.get(), blockTexture(ModBlocks.DIAMOND_PLANKS.get()));
        slabBlock(ModBlocks.DIAMOND_SLAB.get(), blockTexture(ModBlocks.DIAMOND_PLANKS.get()), blockTexture(ModBlocks.DIAMOND_PLANKS.get()));
        fenceGateBlock(ModBlocks.DIAMOND_FENCE_GATE.get(), blockTexture(ModBlocks.DIAMOND_PLANKS.get()));
        fenceBlock(ModBlocks.DIAMOND_FENCE.get(), blockTexture(ModBlocks.DIAMOND_PLANKS.get()));
        buttonBlock(ModBlocks.DIAMOND_BUTTON.get(), blockTexture(ModBlocks.DIAMOND_PLANKS.get()));
        pressurePlateBlock(ModBlocks.DIAMOND_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DIAMOND_PLANKS.get()));
        blockItem(ModBlocks.DIAMOND_STAIRS);
        blockItem(ModBlocks.DIAMOND_SLAB);
        blockItem(ModBlocks.DIAMOND_FENCE_GATE);
        blockItem(ModBlocks.DIAMOND_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_QUARTZ_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_QUARTZ_WOOD.get()), blockTexture(ModBlocks.SATURATED_QUARTZ_LOG.get()), blockTexture(ModBlocks.SATURATED_QUARTZ_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.QUARTZ_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.QUARTZ_WOOD.get()), blockTexture(ModBlocks.QUARTZ_LOG.get()), blockTexture(ModBlocks.QUARTZ_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_QUARTZ_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_QUARTZ_WOOD.get()), blockTexture(ModBlocks.STRIPPED_QUARTZ_LOG.get()), blockTexture(ModBlocks.STRIPPED_QUARTZ_LOG.get()));

        saplingBlock(ModBlocks.QUARTZ_SAPLING);
        leavesBlock(ModBlocks.QUARTZ_LEAVES);
        blockItem(ModBlocks.SATURATED_QUARTZ_LOG);
        blockItem(ModBlocks.SATURATED_QUARTZ_WOOD);
        blockItem(ModBlocks.QUARTZ_LOG);
        blockItem(ModBlocks.QUARTZ_WOOD);
        blockItem(ModBlocks.STRIPPED_QUARTZ_LOG);
        blockItem(ModBlocks.STRIPPED_QUARTZ_WOOD);
        blockWithItem(ModBlocks.QUARTZ_PLANKS);
        stairsBlock(ModBlocks.QUARTZ_STAIRS.get(), blockTexture(ModBlocks.QUARTZ_PLANKS.get()));
        slabBlock(ModBlocks.QUARTZ_SLAB.get(), blockTexture(ModBlocks.QUARTZ_PLANKS.get()), blockTexture(ModBlocks.QUARTZ_PLANKS.get()));
        fenceGateBlock(ModBlocks.QUARTZ_FENCE_GATE.get(), blockTexture(ModBlocks.QUARTZ_PLANKS.get()));
        fenceBlock(ModBlocks.QUARTZ_FENCE.get(), blockTexture(ModBlocks.QUARTZ_PLANKS.get()));
        buttonBlock(ModBlocks.QUARTZ_BUTTON.get(), blockTexture(ModBlocks.QUARTZ_PLANKS.get()));
        pressurePlateBlock(ModBlocks.QUARTZ_PRESSURE_PLATE.get(), blockTexture(ModBlocks.QUARTZ_PLANKS.get()));
        blockItem(ModBlocks.QUARTZ_STAIRS);
        blockItem(ModBlocks.QUARTZ_SLAB);
        blockItem(ModBlocks.QUARTZ_FENCE_GATE);
        blockItem(ModBlocks.QUARTZ_PRESSURE_PLATE);


        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DEBRIS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DEBRIS_WOOD.get()), blockTexture(ModBlocks.SATURATED_DEBRIS_LOG.get()), blockTexture(ModBlocks.SATURATED_DEBRIS_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DEBRIS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DEBRIS_WOOD.get()), blockTexture(ModBlocks.DEBRIS_LOG.get()), blockTexture(ModBlocks.DEBRIS_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DEBRIS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DEBRIS_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DEBRIS_LOG.get()), blockTexture(ModBlocks.STRIPPED_DEBRIS_LOG.get()));

        saplingBlock(ModBlocks.DEBRIS_SAPLING);
        leavesBlock(ModBlocks.DEBRIS_LEAVES);
        blockItem(ModBlocks.SATURATED_DEBRIS_LOG);
        blockItem(ModBlocks.SATURATED_DEBRIS_WOOD);
        blockItem(ModBlocks.DEBRIS_LOG);
        blockItem(ModBlocks.DEBRIS_WOOD);
        blockItem(ModBlocks.STRIPPED_DEBRIS_LOG);
        blockItem(ModBlocks.STRIPPED_DEBRIS_WOOD);
        blockWithItem(ModBlocks.DEBRIS_PLANKS);
        stairsBlock(ModBlocks.DEBRIS_STAIRS.get(), blockTexture(ModBlocks.DEBRIS_PLANKS.get()));
        slabBlock(ModBlocks.DEBRIS_SLAB.get(), blockTexture(ModBlocks.DEBRIS_PLANKS.get()), blockTexture(ModBlocks.DEBRIS_PLANKS.get()));
        fenceGateBlock(ModBlocks.DEBRIS_FENCE_GATE.get(), blockTexture(ModBlocks.DEBRIS_PLANKS.get()));
        fenceBlock(ModBlocks.DEBRIS_FENCE.get(), blockTexture(ModBlocks.DEBRIS_PLANKS.get()));
        buttonBlock(ModBlocks.DEBRIS_BUTTON.get(), blockTexture(ModBlocks.DEBRIS_PLANKS.get()));
        pressurePlateBlock(ModBlocks.DEBRIS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DEBRIS_PLANKS.get()));
        blockItem(ModBlocks.DEBRIS_STAIRS);
        blockItem(ModBlocks.DEBRIS_SLAB);
        blockItem(ModBlocks.DEBRIS_FENCE_GATE);
        blockItem(ModBlocks.DEBRIS_PRESSURE_PLATE);



    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("skyoretrees:block/" + deferredBlock.getId().getPath()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("skyoretrees:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
