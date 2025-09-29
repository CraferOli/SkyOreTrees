package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.init.ItemInit;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.crafteroli.skyoretrees.util.ModTags;
import net.crafteroli.skyoretrees.util.TreeBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
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
                .add(ItemInit.DIRT_ACORN.get())
                .add(ItemInit.COAL_ACORN.get())
        ;
        tag(ModTags.Items.RESIN)
                .add(ItemInit.DIRT_RESIN.get())
                .add(ItemInit.COAL_RESIN.get())
        ;

        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_saplings = this.tag(ModTags.Items.SAPLINGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_leaves = this.tag(ModTags.Items.LEAVES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_saturated_logs = this.tag(ModTags.Items.SATURATED_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_logs = this.tag(ModTags.Items.LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_stripped_logs = this.tag(ModTags.Items.STRIPPED_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_planks = this.tag(ModTags.Items.PLANKS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_stairs= this.tag(ModTags.Items.STAIRS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_slabs= this.tag(ModTags.Items.SLABS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_fence_gates= this.tag(ModTags.Items.FENCE_GATES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_fences= this.tag(ModTags.Items.FENCES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_buttons= this.tag(ModTags.Items.BUTTONS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_wooden_pressure_plate= this.tag(ModTags.Items.WOODEN_PRESSURE_PLATES);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_dirt_logs = this.tag(ModTags.Items.DIRT_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_stone_logs = this.tag(ModTags.Items.STONE_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_coal_logs = this.tag(ModTags.Items.COAL_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_copper_logs = this.tag(ModTags.Items.COPPER_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_iron_logs = this.tag(ModTags.Items.IRON_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_gold_logs = this.tag(ModTags.Items.GOLD_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_diamond_logs = this.tag(ModTags.Items.DIAMOND_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_emerald_logs = this.tag(ModTags.Items.EMERALD_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_redstone_logs = this.tag(ModTags.Items.REDSTONE_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_lapis_logs = this.tag(ModTags.Items.LAPIS_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_quartz_logs = this.tag(ModTags.Items.QUARTZ_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_debris_logs = this.tag(ModTags.Items.DEBRIS_LOGS);


        IntrinsicHolderTagsProvider.IntrinsicTagAppender log_that_burn = this.tag(ItemTags.LOGS_THAT_BURN);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender saplings = this.tag(ItemTags.SAPLINGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender leaves = this.tag(ItemTags.LEAVES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender planks = this.tag(ItemTags.PLANKS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender stairs = this.tag(ItemTags.STAIRS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender slabs = this.tag(ItemTags.SLABS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender fence_gates = this.tag(ItemTags.FENCE_GATES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender fences = this.tag(ItemTags.FENCES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender buttons = this.tag(ItemTags.BUTTONS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender wooden_pressure_plate = this.tag(ItemTags.WOODEN_PRESSURE_PLATES);

        for (TreeBlocks treeBlocks : TreeInit.registeredTrees) {

            mod_saplings.add(treeBlocks.SAPLING.get().asItem());
            mod_leaves.add(treeBlocks.LEAVES.get().asItem());
            mod_saturated_logs.add(treeBlocks.SATURATED_LOG.get().asItem(), treeBlocks.SATURATED_WOOD.get().asItem());
            mod_logs.add(treeBlocks.LOG.get().asItem(), treeBlocks.WOOD.get().asItem());
            mod_stripped_logs.add(treeBlocks.STRIPPED_LOG.get().asItem(), treeBlocks.STRIPPED_WOOD.get().asItem());
            mod_planks.add(treeBlocks.PLANKS.get().asItem());
            mod_stairs.add(treeBlocks.STAIRS.get().asItem());
            mod_slabs.add(treeBlocks.SLAB.get().asItem());
            mod_fence_gates.add(treeBlocks.FENCE_GATE.get().asItem());
            mod_fences.add(treeBlocks.FENCE.get().asItem());
            mod_buttons.add(treeBlocks.BUTTON.get().asItem());
            mod_wooden_pressure_plate.add(treeBlocks.PRESSURE_PLATE.get().asItem());

            mod_dirt_logs.add(TreeInit.DIRT_TREE_BLOCKS.SATURATED_LOG, TreeInit.DIRT_TREE_BLOCKS.SATURATED_WOOD, TreeInit.DIRT_TREE_BLOCKS.LOG, TreeInit.DIRT_TREE_BLOCKS.WOOD, TreeInit.DIRT_TREE_BLOCKS.STRIPPED_LOG, TreeInit.DIRT_TREE_BLOCKS.STRIPPED_WOOD);

            log_that_burn.addTags(ModTags.Items.DIRT_LOGS, ModTags.Items.STONE_LOGS, ModTags.Items.COAL_LOGS, ModTags.Items.COPPER_LOGS, ModTags.Items.IRON_LOGS, ModTags.Items.GOLD_LOGS, ModTags.Items.DIAMOND_LOGS, ModTags.Items.EMERALD_LOGS, ModTags.Items.REDSTONE_LOGS, ModTags.Items.LAPIS_LOGS);
            saplings.addTag(ModTags.Items.SAPLINGS);
            leaves.addTag(ModTags.Items.LEAVES);
            planks.addTag(ModTags.Items.PLANKS);
            stairs.addTag(ModTags.Items.STAIRS);
            slabs.addTag(ModTags.Items.SLABS);
            fence_gates.addTag(ModTags.Items.FENCE_GATES);
            fences.addTag(ModTags.Items.FENCES);
            buttons.addTag(ModTags.Items.BUTTONS);
            wooden_pressure_plate.addTag(ModTags.Items.WOODEN_PRESSURE_PLATES);
        }


    }
}
