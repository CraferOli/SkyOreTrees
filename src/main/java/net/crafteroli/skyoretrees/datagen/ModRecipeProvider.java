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


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_PLANKS.get(), 4)
                .requires(ModTags.Items.COAL_LOGS)
                .unlockedBy("has_coal_logs", has(ModTags.Items.COAL_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COAL, 1)
                .requires(ModItems.COAL_ACORN, 2)
                .requires(ModItems.COAL_RESIN, 2)
                .unlockedBy("has_coal_acorn", has(ModItems.COAL_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_coal");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.COAL, 2)
                .requires(ModItems.COAL_ACORN, 4)
                .requires(ModItems.COAL_RESIN, 4)
                .unlockedBy("has_coal_acorn", has(ModItems.COAL_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_coal");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_COAL_WOOD.get(), ModBlocks.SATURATED_COAL_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.COAL_WOOD.get(), ModBlocks.COAL_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_COAL_WOOD.get(), ModBlocks.STRIPPED_COAL_LOG.get());
        stairBuilder(ModBlocks.COAL_STAIRS, Ingredient.of(ModBlocks.COAL_PLANKS)).group("coal").unlockedBy("has_coal_planks", has(ModBlocks.COAL_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_SLAB, ModBlocks.COAL_PLANKS);
        fenceGateBuilder(ModBlocks.COAL_FENCE_GATE, Ingredient.of(ModBlocks.COAL_PLANKS)).group("coal").unlockedBy("has_coal_planks", has(ModBlocks.COAL_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.COAL_FENCE, Ingredient.of(ModBlocks.COAL_PLANKS)).group("coal").unlockedBy("has_coal_planks", has(ModBlocks.COAL_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.COAL_BUTTON, Ingredient.of(ModBlocks.COAL_PLANKS)).group("coal").unlockedBy("has_coal_planks", has(ModBlocks.COAL_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.COAL_PRESSURE_PLATE, ModBlocks.COAL_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_PLANKS.get(), 4)
                .requires(ModTags.Items.COPPER_LOGS)
                .unlockedBy("has_copper_logs", has(ModTags.Items.COPPER_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_COPPER, 1)
                .requires(ModItems.COPPER_ACORN, 2)
                .requires(ModItems.COPPER_RESIN, 2)
                .unlockedBy("has_copper_acorn", has(ModItems.COPPER_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_raw_copper");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_COPPER, 2)
                .requires(ModItems.COPPER_ACORN, 4)
                .requires(ModItems.COPPER_RESIN, 4)
                .unlockedBy("has_copper_acorn", has(ModItems.COPPER_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_raw_copper");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_COPPER_WOOD.get(), ModBlocks.SATURATED_COPPER_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.COPPER_WOOD.get(), ModBlocks.COPPER_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_COPPER_WOOD.get(), ModBlocks.STRIPPED_COPPER_LOG.get());
        stairBuilder(ModBlocks.COPPER_STAIRS, Ingredient.of(ModBlocks.COPPER_PLANKS)).group("copper").unlockedBy("has_copper_planks", has(ModBlocks.COPPER_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_SLAB, ModBlocks.COPPER_PLANKS);
        fenceGateBuilder(ModBlocks.COPPER_FENCE_GATE, Ingredient.of(ModBlocks.COPPER_PLANKS)).group("copper").unlockedBy("has_copper_planks", has(ModBlocks.COPPER_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.COPPER_FENCE, Ingredient.of(ModBlocks.COPPER_PLANKS)).group("copper").unlockedBy("has_copper_planks", has(ModBlocks.COPPER_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.COPPER_BUTTON, Ingredient.of(ModBlocks.COPPER_PLANKS)).group("copper").unlockedBy("has_copper_planks", has(ModBlocks.COPPER_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.COPPER_PRESSURE_PLATE, ModBlocks.COPPER_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_PLANKS.get(), 4)
                .requires(ModTags.Items.IRON_LOGS)
                .unlockedBy("has_iron_logs", has(ModTags.Items.IRON_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_IRON, 1)
                .requires(ModItems.IRON_ACORN, 2)
                .requires(ModItems.IRON_RESIN, 2)
                .unlockedBy("has_iron_acorn", has(ModItems.IRON_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_raw_iron");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_IRON, 2)
                .requires(ModItems.IRON_ACORN, 4)
                .requires(ModItems.IRON_RESIN, 4)
                .unlockedBy("has_iron_acorn", has(ModItems.IRON_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_raw_iron");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_IRON_WOOD.get(), ModBlocks.SATURATED_IRON_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.IRON_WOOD.get(), ModBlocks.IRON_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_IRON_WOOD.get(), ModBlocks.STRIPPED_IRON_LOG.get());
        stairBuilder(ModBlocks.IRON_STAIRS, Ingredient.of(ModBlocks.IRON_PLANKS)).group("iron").unlockedBy("has_iron_planks", has(ModBlocks.IRON_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, ModBlocks.IRON_PLANKS);
        fenceGateBuilder(ModBlocks.IRON_FENCE_GATE, Ingredient.of(ModBlocks.IRON_PLANKS)).group("iron").unlockedBy("has_iron_planks", has(ModBlocks.IRON_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.IRON_FENCE, Ingredient.of(ModBlocks.IRON_PLANKS)).group("iron").unlockedBy("has_iron_planks", has(ModBlocks.IRON_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.IRON_BUTTON, Ingredient.of(ModBlocks.IRON_PLANKS)).group("iron").unlockedBy("has_iron_planks", has(ModBlocks.IRON_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.IRON_PRESSURE_PLATE, ModBlocks.IRON_PLANKS);


    }
}
