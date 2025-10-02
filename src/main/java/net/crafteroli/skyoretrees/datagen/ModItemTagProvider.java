package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.ModBlocks;
import net.crafteroli.skyoretrees.item.ModItems;
import net.crafteroli.skyoretrees.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SkyOreTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.ACORN)
                .add(ModItems.DIRT_ACORN.get())
                .add(ModItems.STONE_ACORN.get())
                .add(ModItems.COAL_ACORN.get())
                .add(ModItems.COPPER_ACORN.get())
                .add(ModItems.IRON_ACORN.get())
        ;

        tag(ModTags.Items.RESIN)
                .add(ModItems.DIRT_RESIN.get())
                .add(ModItems.STONE_RESIN.get())
                .add(ModItems.COAL_RESIN.get())
                .add(ModItems.COPPER_RESIN.get())
                .add(ModItems.IRON_RESIN.get())
        ;

        tag(ModTags.Items.PLANKS)
                .add(ModBlocks.DIRT_PLANKS.get().asItem())
                .add(ModBlocks.STONE_PLANKS.get().asItem())
                .add(ModBlocks.COAL_PLANKS.get().asItem())
                .add(ModBlocks.COPPER_PLANKS.get().asItem())
                .add(ModBlocks.IRON_PLANKS.get().asItem())
        ;

        tag(ModTags.Items.LEAVES)
                .add(ModBlocks.DIRT_LEAVES.get().asItem())
                .add(ModBlocks.STONE_LEAVES.get().asItem())
                .add(ModBlocks.COAL_LEAVES.get().asItem())
                .add(ModBlocks.COPPER_LEAVES.get().asItem())
                .add(ModBlocks.IRON_LEAVES.get().asItem())
        ;

        this.tag(ItemTags.LOGS_THAT_BURN)
                .addTag(ModTags.Items.DIRT_LOGS)
                .addTag(ModTags.Items.STONE_LOGS)
                .addTag(ModTags.Items.COAL_LOGS)
                .addTag(ModTags.Items.COPPER_LOGS)
                .addTag(ModTags.Items.IRON_LOGS)
        ;

        tag(ModTags.Items.DIRT_LOGS)
                .add(ModBlocks.SATURATED_DIRT_LOG.get().asItem())
                .add(ModBlocks.SATURATED_DIRT_WOOD.get().asItem())
                .add(ModBlocks.DIRT_LOG.get().asItem())
                .add(ModBlocks.DIRT_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_DIRT_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_DIRT_WOOD.get().asItem())
        ;

        tag(ModTags.Items.STONE_LOGS)
                .add(ModBlocks.SATURATED_STONE_LOG.get().asItem())
                .add(ModBlocks.SATURATED_STONE_WOOD.get().asItem())
                .add(ModBlocks.STONE_LOG.get().asItem())
                .add(ModBlocks.STONE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_STONE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_STONE_WOOD.get().asItem())
        ;

        tag(ModTags.Items.COAL_LOGS)
                .add(ModBlocks.SATURATED_COAL_LOG.get().asItem())
                .add(ModBlocks.SATURATED_COAL_WOOD.get().asItem())
                .add(ModBlocks.COAL_LOG.get().asItem())
                .add(ModBlocks.COAL_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_COAL_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_COAL_WOOD.get().asItem())
        ;

        tag(ModTags.Items.COPPER_LOGS)
                .add(ModBlocks.SATURATED_COPPER_LOG.get().asItem())
                .add(ModBlocks.SATURATED_COPPER_WOOD.get().asItem())
                .add(ModBlocks.COPPER_LOG.get().asItem())
                .add(ModBlocks.COPPER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_COPPER_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_COPPER_WOOD.get().asItem())
        ;

        tag(ModTags.Items.IRON_LOGS)
                .add(ModBlocks.SATURATED_IRON_LOG.get().asItem())
                .add(ModBlocks.SATURATED_IRON_WOOD.get().asItem())
                .add(ModBlocks.IRON_LOG.get().asItem())
                .add(ModBlocks.IRON_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_IRON_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_IRON_WOOD.get().asItem())
        ;

        this.tag(ItemTags.LEAVES)
                .addTag(ModTags.Items.LEAVES)
        ;

        this.tag(ItemTags.PLANKS)
                .addTag(ModTags.Items.PLANKS)
        ;
    }
}
