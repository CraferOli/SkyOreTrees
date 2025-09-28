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
