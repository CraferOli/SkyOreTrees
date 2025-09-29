package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.crafteroli.skyoretrees.util.ModTags;
import net.crafteroli.skyoretrees.util.TreeBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.BlockTags;
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
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_saplings = this.tag(ModTags.Blocks.SAPLINGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_leaves = this.tag(ModTags.Blocks.LEAVES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_saturated_logs = this.tag(ModTags.Blocks.SATURATED_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_logs = this.tag(ModTags.Blocks.LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_stripped_logs = this.tag(ModTags.Blocks.STRIPPED_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_planks = this.tag(ModTags.Blocks.PLANKS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_stairs= this.tag(ModTags.Blocks.STAIRS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_slabs= this.tag(ModTags.Blocks.SLABS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_fence_gates= this.tag(ModTags.Blocks.FENCE_GATES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_fences= this.tag(ModTags.Blocks.FENCES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_buttons= this.tag(ModTags.Blocks.BUTTONS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_wooden_pressure_plate= this.tag(ModTags.Blocks.WOODEN_PRESSURE_PLATES);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_dirt_logs = this.tag(ModTags.Blocks.DIRT_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_stone_logs = this.tag(ModTags.Blocks.STONE_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_coal_logs = this.tag(ModTags.Blocks.COAL_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_copper_logs = this.tag(ModTags.Blocks.COPPER_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_iron_logs = this.tag(ModTags.Blocks.IRON_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_gold_logs = this.tag(ModTags.Blocks.GOLD_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_diamond_logs = this.tag(ModTags.Blocks.DIAMOND_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_emerald_logs = this.tag(ModTags.Blocks.EMERALD_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_redstone_logs = this.tag(ModTags.Blocks.REDSTONE_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_lapis_logs = this.tag(ModTags.Blocks.LAPIS_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_quartz_logs = this.tag(ModTags.Blocks.QUARTZ_LOGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mod_debris_logs = this.tag(ModTags.Blocks.DEBRIS_LOGS);


        IntrinsicHolderTagsProvider.IntrinsicTagAppender log_that_burn = this.tag(BlockTags.LOGS_THAT_BURN);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender saplings = this.tag(BlockTags.SAPLINGS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender leaves = this.tag(BlockTags.LEAVES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender planks = this.tag(BlockTags.PLANKS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender stairs = this.tag(BlockTags.STAIRS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender slabs = this.tag(BlockTags.SLABS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender fence_gates = this.tag(BlockTags.FENCE_GATES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender fences = this.tag(BlockTags.FENCES);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender buttons = this.tag(BlockTags.BUTTONS);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender wooden_pressure_plate = this.tag(BlockTags.WOODEN_PRESSURE_PLATES);

        IntrinsicHolderTagsProvider.IntrinsicTagAppender mineable_with_axe = this.tag(BlockTags.MINEABLE_WITH_AXE);
        IntrinsicHolderTagsProvider.IntrinsicTagAppender mineable_with_hoe = this.tag(BlockTags.MINEABLE_WITH_HOE);


        for (TreeBlocks treeBlocks : TreeInit.registeredTrees) {

            mod_saplings.add(treeBlocks.SAPLING.get());
            mod_leaves.add(treeBlocks.LEAVES.get());
            mod_saturated_logs.add(treeBlocks.SATURATED_LOG.get(), treeBlocks.SATURATED_WOOD.get());
            mod_logs.add(treeBlocks.LOG.get(), treeBlocks.WOOD.get());
            mod_stripped_logs.add(treeBlocks.STRIPPED_LOG.get(), treeBlocks.STRIPPED_WOOD.get());
            mod_planks.add(treeBlocks.PLANKS.get());
            mod_stairs.add(treeBlocks.STAIRS.get());
            mod_slabs.add(treeBlocks.SLAB.get());
            mod_fence_gates.add(treeBlocks.FENCE_GATE.get());
            mod_fences.add(treeBlocks.FENCE.get());
            mod_buttons.add(treeBlocks.BUTTON.get());
            mod_wooden_pressure_plate.add(treeBlocks.PRESSURE_PLATE.get());

            mod_dirt_logs.add(TreeInit.DIRT_TREE_BLOCKS.SATURATED_LOG, TreeInit.DIRT_TREE_BLOCKS.SATURATED_WOOD, TreeInit.DIRT_TREE_BLOCKS.LOG, TreeInit.DIRT_TREE_BLOCKS.WOOD, TreeInit.DIRT_TREE_BLOCKS.STRIPPED_LOG, TreeInit.DIRT_TREE_BLOCKS.STRIPPED_WOOD);

            log_that_burn.addTags(ModTags.Blocks.DIRT_LOGS, ModTags.Blocks.STONE_LOGS, ModTags.Blocks.COAL_LOGS, ModTags.Blocks.COPPER_LOGS, ModTags.Blocks.IRON_LOGS, ModTags.Blocks.GOLD_LOGS, ModTags.Blocks.DIAMOND_LOGS, ModTags.Blocks.EMERALD_LOGS, ModTags.Blocks.REDSTONE_LOGS, ModTags.Blocks.LAPIS_LOGS);
            saplings.addTag(ModTags.Blocks.SAPLINGS);
            leaves.addTag(ModTags.Blocks.LEAVES);
            planks.addTag(ModTags.Blocks.PLANKS);
            stairs.addTag(ModTags.Blocks.STAIRS);
            slabs.addTag(ModTags.Blocks.SLABS);
            fence_gates.addTag(ModTags.Blocks.FENCE_GATES);
            fences.addTag(ModTags.Blocks.FENCES);
            buttons.addTag(ModTags.Blocks.BUTTONS);
            wooden_pressure_plate.addTag(ModTags.Blocks.WOODEN_PRESSURE_PLATES);

            mineable_with_axe.addTags(ModTags.Blocks.SAPLINGS, ModTags.Blocks.SATURATED_LOGS, ModTags.Blocks.LOGS, ModTags.Blocks.STRIPPED_LOGS, ModTags.Blocks.PLANKS, ModTags.Blocks.STAIRS, ModTags.Blocks.SLABS, ModTags.Blocks.FENCE_GATES, ModTags.Blocks.FENCES, ModTags.Blocks.BUTTONS, ModTags.Blocks.WOODEN_PRESSURE_PLATES);
            mineable_with_hoe.addTag(ModTags.Blocks.LEAVES);
        }

        this.tag(BlockTags.LOGS)
                .addTags(ModTags.Blocks.QUARTZ_LOGS, ModTags.Blocks.DEBRIS_LOGS)
        ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.DIRT_LOGS);
        ;

        this.tag(BlockTags.MINEABLE_WITH_AXE).addTag(ModTags.Blocks.PLANKS).addTag(ModTags.Blocks.LOGS);
        this.tag(BlockTags.MINEABLE_WITH_HOE).addTag(ModTags.Blocks.LEAVES);
    }
}
