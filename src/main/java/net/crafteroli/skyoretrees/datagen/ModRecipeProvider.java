package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.block.ModBlocks;
import net.crafteroli.skyoretrees.item.ModItems;
import net.crafteroli.skyoretrees.util.ModTags;
import net.minecraft.client.sounds.ChunkedSampleByteBuf;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_PLANKS.get(), 4)
                .requires(ModTags.Items.DIRT_LOGS)
                .unlockedBy("has_dirt_logs", has(ModTags.Items.DIRT_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIRT, 1)
                .requires(ModItems.DIRT_ACORN, 1)
                .requires(ModItems.DIRT_RESIN, 1)
                .unlockedBy("has_dirt_acorn", has(ModItems.DIRT_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_dirt");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIRT, 2)
                .requires(ModItems.DIRT_ACORN, 2)
                .requires(ModItems.DIRT_RESIN, 2)
                .unlockedBy("has_dirt_acorn", has(ModItems.DIRT_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_dirt");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIRT, 4)
                .requires(ModItems.DIRT_ACORN, 4)
                .requires(ModItems.DIRT_RESIN, 4)
                .unlockedBy("has_dirt_acorn", has(ModItems.DIRT_ACORN))
                        .save(recipeOutput, "skyoretrees:4x_dirt");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_DIRT_WOOD.get(), ModBlocks.SATURATED_DIRT_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DIRT_WOOD.get(), ModBlocks.DIRT_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DIRT_WOOD.get(), ModBlocks.STRIPPED_DIRT_LOG.get());
        stairBuilder(ModBlocks.DIRT_STAIRS, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_SLAB, ModBlocks.DIRT_PLANKS);
        fenceGateBuilder(ModBlocks.DIRT_FENCE_GATE, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.DIRT_FENCE, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.DIRT_BUTTON, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.DIRT_PRESSURE_PLATE, ModBlocks.DIRT_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PLANKS.get(), 4)
                .requires(ModTags.Items.STONE_LOGS)
                .unlockedBy("has_stone_logs", has(ModTags.Items.STONE_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COBBLESTONE, 1)
                .requires(ModItems.STONE_ACORN, 1)
                .requires(ModItems.STONE_RESIN, 1)
                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_cobblestone");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COBBLESTONE, 2)
                .requires(ModItems.STONE_ACORN, 2)
                .requires(ModItems.STONE_RESIN, 2)
                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_cobblestone");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COBBLESTONE, 4)
                .requires(ModItems.STONE_ACORN, 4)
                .requires(ModItems.STONE_RESIN, 4)
                .unlockedBy("has_stone_acorn", has(ModItems.STONE_ACORN))
                        .save(recipeOutput, "skyoretrees:4x_cobblestone");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_STONE_WOOD.get(), ModBlocks.SATURATED_STONE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STONE_WOOD.get(), ModBlocks.STONE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_STONE_WOOD.get(), ModBlocks.STRIPPED_STONE_LOG.get());
        stairBuilder(ModBlocks.STONE_STAIRS, Ingredient.of(ModBlocks.STONE_PLANKS)).group("stone").unlockedBy("has_stone_planks", has(ModBlocks.STONE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SLAB, ModBlocks.STONE_PLANKS);
        fenceGateBuilder(ModBlocks.STONE_FENCE_GATE, Ingredient.of(ModBlocks.STONE_PLANKS)).group("stone").unlockedBy("has_stone_planks", has(ModBlocks.STONE_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.STONE_FENCE, Ingredient.of(ModBlocks.STONE_PLANKS)).group("stone").unlockedBy("has_stone_planks", has(ModBlocks.STONE_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.STONE_BUTTON, Ingredient.of(ModBlocks.STONE_PLANKS)).group("stone").unlockedBy("has_stone_planks", has(ModBlocks.STONE_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.STONE_PRESSURE_PLATE, ModBlocks.STONE_PLANKS);


    }
}
