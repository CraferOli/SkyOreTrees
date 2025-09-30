package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.ModBlocks;
import net.crafteroli.skyoretrees.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SkyOreTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Blocks.LOGS)
        ;

        tag(ModTags.Blocks.PLANKS)
                .add(ModBlocks.DIRT_PLANKS.get())
                .add(ModBlocks.STONE_PLANKS.get())
        ;

        tag(ModTags.Blocks.LEAVES)
                .add(ModBlocks.DIRT_LEAVES.get())
                .add(ModBlocks.STONE_LEAVES.get())
        ;

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.DIRT_STAIRS.get())
                .add(ModBlocks.STONE_STAIRS.get())
        ;

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.DIRT_SLAB.get())
                .add(ModBlocks.STONE_SLAB.get())
        ;

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.DIRT_FENCE_GATE.get())
                .add(ModBlocks.STONE_FENCE_GATE.get())
        ;

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.DIRT_FENCE.get())
                .add(ModBlocks.STONE_FENCE.get())
        ;

        this.tag(BlockTags.BUTTONS)
                .add(ModBlocks.DIRT_BUTTON.get())
                .add(ModBlocks.STONE_BUTTON.get())
        ;

        this.tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.DIRT_PRESSURE_PLATE.get())
                .add(ModBlocks.STONE_PRESSURE_PLATE.get())
        ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.DIRT_LOGS)
                .addTag(ModTags.Blocks.STONE_LOGS)
        ;

        tag(ModTags.Blocks.LOGS)
                .addTag(ModTags.Blocks.DIRT_LOGS)
                .addTag(ModTags.Blocks.STONE_LOGS)
        ;

        tag(ModTags.Blocks.DIRT_LOGS)
                .add(ModBlocks.SATURATED_DIRT_LOG.get())
                .add(ModBlocks.SATURATED_DIRT_WOOD.get())
                .add(ModBlocks.DIRT_LOG.get())
                .add(ModBlocks.DIRT_WOOD.get())
                .add(ModBlocks.STRIPPED_DIRT_LOG.get())
                .add(ModBlocks.STRIPPED_DIRT_WOOD.get())
        ;

        tag(ModTags.Blocks.STONE_LOGS)
                .add(ModBlocks.SATURATED_STONE_LOG.get())
                .add(ModBlocks.SATURATED_STONE_WOOD.get())
                .add(ModBlocks.STONE_LOG.get())
                .add(ModBlocks.STONE_WOOD.get())
                .add(ModBlocks.STRIPPED_STONE_LOG.get())
                .add(ModBlocks.STRIPPED_STONE_WOOD.get())
        ;

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(ModTags.Blocks.PLANKS)
                .addTag(ModTags.Blocks.LOGS)
        ;

        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .addTag(ModTags.Blocks.LEAVES)
        ;

        this.tag(BlockTags.LEAVES)
                .addTag(ModTags.Blocks.LEAVES)
        ;

        this.tag(BlockTags.PLANKS)
                .addTag(ModTags.Blocks.PLANKS)
        ;
    }
}
