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
