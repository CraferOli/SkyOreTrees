package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.custom.ModFlammableLeavesBlock;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.crafteroli.skyoretrees.util.TreeBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SkyOreTrees.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        for(TreeBlocks treeBlocks : TreeInit.registeredTrees) {
            this.saplingBlock(treeBlocks.SAPLING);

            this.leavesBlock(treeBlocks.LEAVES);
            this.blockItem((DeferredBlock<?>) treeBlocks.LEAVES);

            this.logBlock((RotatedPillarBlock)treeBlocks.SATURATED_LOG.get());
            this.blockItem((DeferredBlock<?>) treeBlocks.SATURATED_LOG);

            this.logBlock((RotatedPillarBlock)treeBlocks.SATURATED_WOOD.get());
            this.blockItem((DeferredBlock<?>) treeBlocks.SATURATED_WOOD);

            this.logBlock((RotatedPillarBlock)treeBlocks.LOG.get());
            this.blockItem((DeferredBlock<?>) treeBlocks.LOG);

            this.logBlock((RotatedPillarBlock)treeBlocks.WOOD.get());
            this.blockItem((DeferredBlock<?>) treeBlocks.WOOD);

            this.logBlock((RotatedPillarBlock)treeBlocks.STRIPPED_LOG.get());
            this.blockItem((DeferredBlock<?>) treeBlocks.STRIPPED_LOG);

            this.logBlock((RotatedPillarBlock)treeBlocks.STRIPPED_WOOD.get());
            this.blockItem((DeferredBlock<?>) treeBlocks.STRIPPED_WOOD);

            this.blockWithItem((DeferredBlock<?>) treeBlocks.PLANKS);

            this.stairsBlock((StairBlock)treeBlocks.STAIRS.get(), this.blockTexture((Block)treeBlocks.PLANKS.get()));
            this.blockItem(treeBlocks.STAIRS);

            this.slabBlock((SlabBlock)treeBlocks.SLAB.get(), this.blockTexture((Block)treeBlocks.PLANKS.get()), this.blockTexture((Block)treeBlocks.PLANKS.get()));
            this.blockItem(treeBlocks.SLAB);

            this.fenceGateBlock((FenceGateBlock)treeBlocks.FENCE_GATE.get(), this.blockTexture((Block)treeBlocks.PLANKS.get()));
            this.blockItem(treeBlocks.FENCE_GATE);

            this.fenceBlock((FenceBlock)treeBlocks.FENCE.get(), this.blockTexture((Block)treeBlocks.PLANKS.get()));

            this.buttonBlock((ButtonBlock)treeBlocks.BUTTON.get(), this.blockTexture((Block)treeBlocks.PLANKS.get()));

            this.pressurePlateBlock((PressurePlateBlock)treeBlocks.PRESSURE_PLATE.get(), this.blockTexture((Block)treeBlocks.PLANKS.get()));
            this.blockItem(treeBlocks.PRESSURE_PLATE);



        }




//        logBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DIRT_LOG.get()));
//        axisBlock(((RotatedPillarBlock) ModBlocks.SATURATED_DIRT_WOOD.get()), blockTexture(ModBlocks.SATURATED_DIRT_LOG.get()), blockTexture(ModBlocks.SATURATED_DIRT_LOG.get()));
//        logBlock(((RotatedPillarBlock) ModBlocks.DIRT_LOG.get()));
//        axisBlock(((RotatedPillarBlock) ModBlocks.DIRT_WOOD.get()), blockTexture(ModBlocks.DIRT_LOG.get()), blockTexture(ModBlocks.DIRT_LOG.get()));
//        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DIRT_LOG.get()));
//        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DIRT_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DIRT_LOG.get()), blockTexture(ModBlocks.STRIPPED_DIRT_LOG.get()));
//
//        saplingBlock(ModBlocks.DIRT_SAPLING);
//        leavesBlock(ModBlocks.DIRT_LEAVES);
//        blockItem(ModBlocks.SATURATED_DIRT_LOG);
//        blockItem(ModBlocks.SATURATED_DIRT_WOOD);
//        blockItem(ModBlocks.DIRT_LOG);
//        blockItem(ModBlocks.DIRT_WOOD);
//        blockItem(ModBlocks.STRIPPED_DIRT_LOG);
//        blockItem(ModBlocks.STRIPPED_DIRT_WOOD);
//        blockWithItem(ModBlocks.DIRT_PLANKS);
//        stairsBlock(ModBlocks.DIRT_STAIRS.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
//        slabBlock(ModBlocks.DIRT_SLAB.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()), blockTexture(ModBlocks.DIRT_PLANKS.get()));
//        fenceGateBlock(ModBlocks.DIRT_FENCE_GATE.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
//        fenceBlock(ModBlocks.DIRT_FENCE.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
//        buttonBlock(ModBlocks.DIRT_BUTTON.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
//        pressurePlateBlock(ModBlocks.DIRT_PRESSURE_PLATE.get(), blockTexture(ModBlocks.DIRT_PLANKS.get()));
//        blockItem(ModBlocks.DIRT_STAIRS);
//        blockItem(ModBlocks.DIRT_SLAB);
//        blockItem(ModBlocks.DIRT_FENCE_GATE);
//        blockItem(ModBlocks.DIRT_PRESSURE_PLATE);

    }

    private void saplingBlock(DeferredBlock<SaplingBlock> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredHolder<Block, ModFlammableLeavesBlock> block) {
        this.simpleBlock((Block)block.get(), ((BlockModelBuilder)this.models().singleTexture(BuiltInRegistries.BLOCK.getKey((Block)block.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"), "all", this.blockTexture((Block)block.get()))).renderType("cutout"));
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
