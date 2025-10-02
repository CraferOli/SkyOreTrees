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


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_PLANKS.get(), 4)
                .requires(ModTags.Items.GOLD_LOGS)
                .unlockedBy("has_gold_logs", has(ModTags.Items.GOLD_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_GOLD, 1)
                .requires(ModItems.GOLD_ACORN, 2)
                .requires(ModItems.GOLD_RESIN, 2)
                .unlockedBy("has_gold_acorn", has(ModItems.GOLD_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_raw_gold");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RAW_GOLD, 2)
                .requires(ModItems.GOLD_ACORN, 4)
                .requires(ModItems.GOLD_RESIN, 4)
                .unlockedBy("has_gold_acorn", has(ModItems.GOLD_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_raw_gold");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_GOLD_WOOD.get(), ModBlocks.SATURATED_GOLD_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.GOLD_WOOD.get(), ModBlocks.GOLD_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_GOLD_WOOD.get(), ModBlocks.STRIPPED_GOLD_LOG.get());
        stairBuilder(ModBlocks.GOLD_STAIRS, Ingredient.of(ModBlocks.GOLD_PLANKS)).group("gold").unlockedBy("has_gold_planks", has(ModBlocks.GOLD_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, ModBlocks.GOLD_PLANKS);
        fenceGateBuilder(ModBlocks.GOLD_FENCE_GATE, Ingredient.of(ModBlocks.GOLD_PLANKS)).group("gold").unlockedBy("has_gold_planks", has(ModBlocks.GOLD_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.GOLD_FENCE, Ingredient.of(ModBlocks.GOLD_PLANKS)).group("gold").unlockedBy("has_gold_planks", has(ModBlocks.GOLD_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.GOLD_BUTTON, Ingredient.of(ModBlocks.GOLD_PLANKS)).group("gold").unlockedBy("has_gold_planks", has(ModBlocks.GOLD_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.GOLD_PRESSURE_PLATE, ModBlocks.GOLD_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_PLANKS.get(), 4)
                .requires(ModTags.Items.REDSTONE_LOGS)
                .unlockedBy("has_redstone_logs", has(ModTags.Items.REDSTONE_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.REDSTONE, 2)
                .requires(ModItems.REDSTONE_ACORN, 1)
                .requires(ModItems.REDSTONE_RESIN, 1)
                .unlockedBy("has_redstone_acorn", has(ModItems.REDSTONE_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_redstone");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.REDSTONE, 4)
                .requires(ModItems.REDSTONE_ACORN, 2)
                .requires(ModItems.REDSTONE_RESIN, 2)
                .unlockedBy("has_redstone_acorn", has(ModItems.REDSTONE_ACORN))
                        .save(recipeOutput, "skyoretrees:4x_redstone");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.REDSTONE, 8)
                .requires(ModItems.REDSTONE_ACORN, 4)
                .requires(ModItems.REDSTONE_RESIN, 4)
                .unlockedBy("has_redstone_acorn", has(ModItems.REDSTONE_ACORN))
                        .save(recipeOutput, "skyoretrees:8x_redstone");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_REDSTONE_WOOD.get(), ModBlocks.SATURATED_REDSTONE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.REDSTONE_WOOD.get(), ModBlocks.REDSTONE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_REDSTONE_WOOD.get(), ModBlocks.STRIPPED_REDSTONE_LOG.get());
        stairBuilder(ModBlocks.REDSTONE_STAIRS, Ingredient.of(ModBlocks.REDSTONE_PLANKS)).group("redstone").unlockedBy("has_redstone_planks", has(ModBlocks.REDSTONE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.REDSTONE_SLAB, ModBlocks.REDSTONE_PLANKS);
        fenceGateBuilder(ModBlocks.REDSTONE_FENCE_GATE, Ingredient.of(ModBlocks.REDSTONE_PLANKS)).group("redstone").unlockedBy("has_redstone_planks", has(ModBlocks.REDSTONE_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.REDSTONE_FENCE, Ingredient.of(ModBlocks.REDSTONE_PLANKS)).group("redstone").unlockedBy("has_redstone_planks", has(ModBlocks.REDSTONE_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.REDSTONE_BUTTON, Ingredient.of(ModBlocks.REDSTONE_PLANKS)).group("redstone").unlockedBy("has_redstone_planks", has(ModBlocks.REDSTONE_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.REDSTONE_PRESSURE_PLATE, ModBlocks.REDSTONE_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_PLANKS.get(), 4)
                .requires(ModTags.Items.LAPIS_LOGS)
                .unlockedBy("has_lapis_logs", has(ModTags.Items.LAPIS_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LAPIS_LAZULI, 1)
                .requires(ModItems.LAPIS_ACORN, 1)
                .requires(ModItems.LAPIS_RESIN, 1)
                .unlockedBy("has_lapis_acorn", has(ModItems.LAPIS_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_lapis");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LAPIS_LAZULI, 2)
                .requires(ModItems.LAPIS_ACORN, 2)
                .requires(ModItems.LAPIS_RESIN, 2)
                .unlockedBy("has_lapis_acorn", has(ModItems.LAPIS_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_lapis");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LAPIS_LAZULI, 4)
                .requires(ModItems.LAPIS_ACORN, 4)
                .requires(ModItems.LAPIS_RESIN, 4)
                .unlockedBy("has_lapis_acorn", has(ModItems.LAPIS_ACORN))
                        .save(recipeOutput, "skyoretrees:4x_lapis");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_LAPIS_WOOD.get(), ModBlocks.SATURATED_LAPIS_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.LAPIS_WOOD.get(), ModBlocks.LAPIS_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_LAPIS_WOOD.get(), ModBlocks.STRIPPED_LAPIS_LOG.get());
        stairBuilder(ModBlocks.LAPIS_STAIRS, Ingredient.of(ModBlocks.LAPIS_PLANKS)).group("lapis").unlockedBy("has_lapis_planks", has(ModBlocks.LAPIS_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB, ModBlocks.LAPIS_PLANKS);
        fenceGateBuilder(ModBlocks.LAPIS_FENCE_GATE, Ingredient.of(ModBlocks.LAPIS_PLANKS)).group("lapis").unlockedBy("has_lapis_planks", has(ModBlocks.LAPIS_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.LAPIS_FENCE, Ingredient.of(ModBlocks.LAPIS_PLANKS)).group("lapis").unlockedBy("has_lapis_planks", has(ModBlocks.LAPIS_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.LAPIS_BUTTON, Ingredient.of(ModBlocks.LAPIS_PLANKS)).group("lapis").unlockedBy("has_lapis_planks", has(ModBlocks.LAPIS_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.LAPIS_PRESSURE_PLATE, ModBlocks.LAPIS_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_PLANKS.get(), 4)
                .requires(ModTags.Items.EMERALD_LOGS)
                .unlockedBy("has_emerald_logs", has(ModTags.Items.EMERALD_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.EMERALD, 1)
                .requires(ModItems.EMERALD_ACORN, 4)
                .requires(ModItems.EMERALD_RESIN, 4)
                .unlockedBy("has_emerald_acorn", has(ModItems.EMERALD_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_emerald");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_EMERALD_WOOD.get(), ModBlocks.SATURATED_EMERALD_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.EMERALD_WOOD.get(), ModBlocks.EMERALD_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_EMERALD_WOOD.get(), ModBlocks.STRIPPED_EMERALD_LOG.get());
        stairBuilder(ModBlocks.EMERALD_STAIRS, Ingredient.of(ModBlocks.EMERALD_PLANKS)).group("emerald").unlockedBy("has_emerald_planks", has(ModBlocks.EMERALD_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, ModBlocks.EMERALD_PLANKS);
        fenceGateBuilder(ModBlocks.EMERALD_FENCE_GATE, Ingredient.of(ModBlocks.EMERALD_PLANKS)).group("emerald").unlockedBy("has_emerald_planks", has(ModBlocks.EMERALD_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.EMERALD_FENCE, Ingredient.of(ModBlocks.EMERALD_PLANKS)).group("emerald").unlockedBy("has_emerald_planks", has(ModBlocks.EMERALD_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.EMERALD_BUTTON, Ingredient.of(ModBlocks.EMERALD_PLANKS)).group("emerald").unlockedBy("has_emerald_planks", has(ModBlocks.EMERALD_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.EMERALD_PRESSURE_PLATE, ModBlocks.EMERALD_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_PLANKS.get(), 4)
                .requires(ModTags.Items.DIAMOND_LOGS)
                .unlockedBy("has_diamond_logs", has(ModTags.Items.DIAMOND_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.DIAMOND, 1)
                .requires(ModItems.DIAMOND_ACORN, 4)
                .requires(ModItems.DIAMOND_RESIN, 4)
                .unlockedBy("has_diamond_acorn", has(ModItems.DIAMOND_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_diamond");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_DIAMOND_WOOD.get(), ModBlocks.SATURATED_DIAMOND_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DIAMOND_WOOD.get(), ModBlocks.DIAMOND_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DIAMOND_WOOD.get(), ModBlocks.STRIPPED_DIAMOND_LOG.get());
        stairBuilder(ModBlocks.DIAMOND_STAIRS, Ingredient.of(ModBlocks.DIAMOND_PLANKS)).group("diamond").unlockedBy("has_diamond_planks", has(ModBlocks.DIAMOND_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, ModBlocks.DIAMOND_PLANKS);
        fenceGateBuilder(ModBlocks.DIAMOND_FENCE_GATE, Ingredient.of(ModBlocks.DIAMOND_PLANKS)).group("diamond").unlockedBy("has_diamond_planks", has(ModBlocks.DIAMOND_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.DIAMOND_FENCE, Ingredient.of(ModBlocks.DIAMOND_PLANKS)).group("diamond").unlockedBy("has_diamond_planks", has(ModBlocks.DIAMOND_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.DIAMOND_BUTTON, Ingredient.of(ModBlocks.DIAMOND_PLANKS)).group("diamond").unlockedBy("has_diamond_planks", has(ModBlocks.DIAMOND_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.DIAMOND_PRESSURE_PLATE, ModBlocks.DIAMOND_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PLANKS.get(), 4)
                .requires(ModTags.Items.QUARTZ_LOGS)
                .unlockedBy("has_quartz_logs", has(ModTags.Items.QUARTZ_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.QUARTZ, 1)
                .requires(ModItems.QUARTZ_ACORN, 2)
                .requires(ModItems.QUARTZ_RESIN, 2)
                .unlockedBy("has_quartz_acorn", has(ModItems.QUARTZ_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_raw_quartz");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.QUARTZ, 2)
                .requires(ModItems.QUARTZ_ACORN, 4)
                .requires(ModItems.QUARTZ_RESIN, 4)
                .unlockedBy("has_quartz_acorn", has(ModItems.QUARTZ_ACORN))
                        .save(recipeOutput, "skyoretrees:2x_quartz");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_QUARTZ_WOOD.get(), ModBlocks.SATURATED_QUARTZ_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.QUARTZ_WOOD.get(), ModBlocks.QUARTZ_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_QUARTZ_WOOD.get(), ModBlocks.STRIPPED_QUARTZ_LOG.get());
        stairBuilder(ModBlocks.QUARTZ_STAIRS, Ingredient.of(ModBlocks.QUARTZ_PLANKS)).group("quartz").unlockedBy("has_quartz_planks", has(ModBlocks.QUARTZ_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_SLAB, ModBlocks.QUARTZ_PLANKS);
        fenceGateBuilder(ModBlocks.QUARTZ_FENCE_GATE, Ingredient.of(ModBlocks.QUARTZ_PLANKS)).group("quartz").unlockedBy("has_quartz_planks", has(ModBlocks.QUARTZ_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.QUARTZ_FENCE, Ingredient.of(ModBlocks.QUARTZ_PLANKS)).group("quartz").unlockedBy("has_quartz_planks", has(ModBlocks.QUARTZ_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.QUARTZ_BUTTON, Ingredient.of(ModBlocks.QUARTZ_PLANKS)).group("quartz").unlockedBy("has_quartz_planks", has(ModBlocks.QUARTZ_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.QUARTZ_PRESSURE_PLATE, ModBlocks.QUARTZ_PLANKS);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEBRIS_PLANKS.get(), 4)
                .requires(ModTags.Items.DEBRIS_LOGS)
                .unlockedBy("has_debris_logs", has(ModTags.Items.DEBRIS_LOGS))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.NETHERITE_SCRAP, 1)
                .requires(ModItems.DEBRIS_ACORN, 4)
                .requires(ModItems.DEBRIS_RESIN, 4)
                .unlockedBy("has_debris_acorn", has(ModItems.DEBRIS_ACORN))
                        .save(recipeOutput, "skyoretrees:1x_netherite_scrap");

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_DEBRIS_WOOD.get(), ModBlocks.SATURATED_DEBRIS_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DEBRIS_WOOD.get(), ModBlocks.DEBRIS_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DEBRIS_WOOD.get(), ModBlocks.STRIPPED_DEBRIS_LOG.get());
        stairBuilder(ModBlocks.DEBRIS_STAIRS, Ingredient.of(ModBlocks.DEBRIS_PLANKS)).group("debris").unlockedBy("has_debris_planks", has(ModBlocks.DEBRIS_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEBRIS_SLAB, ModBlocks.DEBRIS_PLANKS);
        fenceGateBuilder(ModBlocks.DEBRIS_FENCE_GATE, Ingredient.of(ModBlocks.DEBRIS_PLANKS)).group("debris").unlockedBy("has_debris_planks", has(ModBlocks.DEBRIS_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.DEBRIS_FENCE, Ingredient.of(ModBlocks.DEBRIS_PLANKS)).group("debris").unlockedBy("has_debris_planks", has(ModBlocks.DEBRIS_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.DEBRIS_BUTTON, Ingredient.of(ModBlocks.DEBRIS_PLANKS)).group("debris").unlockedBy("has_debris_planks", has(ModBlocks.DEBRIS_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.DEBRIS_PRESSURE_PLATE, ModBlocks.DEBRIS_PLANKS);


    }
}
