package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.init.ItemInit;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.crafteroli.skyoretrees.util.ModTags;
import net.crafteroli.skyoretrees.util.TreeBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, (ItemLike) TreeInit.DIRT_TREE_BLOCKS.PLANKS, 4)
                .requires(ModTags.Items.DIRT_LOGS)
                .unlockedBy("has_dirt_logs", has(ModTags.Items.DIRT_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIRT, 1)
                .requires(ItemInit.DIRT_ACORN.get(), 2)
                .requires(ItemInit.DIRT_RESIN.get(), 2)
                .unlockedBy("has_dirt_tree_item", has(ItemInit.DIRT_ACORN.get()))
                .save(recipeOutput, "skyoretrees:1x_dirt");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIRT, 2)
                .requires(ItemInit.DIRT_ACORN.get(), 4)
                .requires(ItemInit.DIRT_RESIN.get(), 4)
                .unlockedBy("has_dirt_tree_item", has(ItemInit.DIRT_ACORN.get()))
                .save(recipeOutput, "skyoretrees:2x_dirt");


        for(TreeBlocks treeBlocks : TreeInit.registeredTrees) {
            woodFromLogs(recipeOutput, (ItemLike) treeBlocks.SATURATED_WOOD, (ItemLike) treeBlocks.SATURATED_LOG);
            woodFromLogs(recipeOutput, (ItemLike) treeBlocks.WOOD, (ItemLike) treeBlocks.LOG);
            woodFromLogs(recipeOutput, (ItemLike) treeBlocks.STRIPPED_WOOD, (ItemLike) treeBlocks.STRIPPED_LOG);
            stairBuilder(treeBlocks.STAIRS, Ingredient.of((ItemLike) treeBlocks.PLANKS)).save(recipeOutput);
            slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, (ItemLike) treeBlocks.SLAB, (ItemLike) treeBlocks.PLANKS);
            fenceGateBuilder(treeBlocks.FENCE_GATE, Ingredient.of((ItemLike) treeBlocks.PLANKS)).save(recipeOutput);
            fenceBuilder(treeBlocks.FENCE, Ingredient.of((ItemLike) treeBlocks.PLANKS)).save(recipeOutput);
            buttonBuilder(treeBlocks.BUTTON, Ingredient.of((ItemLike) treeBlocks.PLANKS)).save(recipeOutput);
            pressurePlate(recipeOutput, (ItemLike) treeBlocks.PRESSURE_PLATE, (ItemLike) treeBlocks.PLANKS);

        }
    }
}
