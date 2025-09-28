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

        woodFromLogs(recipeOutput, ModBlocks.SATURATED_DIRT_WOOD.get(), ModBlocks.STRIPPED_DIRT_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DIRT_WOOD.get(), ModBlocks.DIRT_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DIRT_WOOD.get(), ModBlocks.STRIPPED_DIRT_LOG.get());
        stairBuilder(ModBlocks.DIRT_STAIRS, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRT_SLAB, ModBlocks.DIRT_PLANKS);
        fenceGateBuilder(ModBlocks.DIRT_FENCE_GATE, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        fenceBuilder(ModBlocks.DIRT_FENCE, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        buttonBuilder(ModBlocks.DIRT_BUTTON, Ingredient.of(ModBlocks.DIRT_PLANKS)).group("dirt").unlockedBy("has_dirt_planks", has(ModBlocks.DIRT_PLANKS)).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.DIRT_PRESSURE_PLATE, ModBlocks.DIRT_PLANKS);


    }
}
