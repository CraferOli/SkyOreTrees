package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.ModBlocks;
import net.crafteroli.skyoretrees.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SkyOreTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DIRT_ACORN.get());
        basicItem(ModItems.DIRT_RESIN.get());

        saplingItem(ModBlocks.DIRT_SAPLING);
        buttonItem(ModBlocks.DIRT_BUTTON, ModBlocks.DIRT_PLANKS);
        fenceItem(ModBlocks.DIRT_FENCE, ModBlocks.DIRT_PLANKS);


        basicItem(ModItems.STONE_ACORN.get());
        basicItem(ModItems.STONE_RESIN.get());

        saplingItem(ModBlocks.STONE_SAPLING);
        buttonItem(ModBlocks.STONE_BUTTON, ModBlocks.STONE_PLANKS);
        fenceItem(ModBlocks.STONE_FENCE, ModBlocks.STONE_PLANKS);


        basicItem(ModItems.COAL_ACORN.get());
        basicItem(ModItems.COAL_RESIN.get());

        saplingItem(ModBlocks.COAL_SAPLING);
        buttonItem(ModBlocks.COAL_BUTTON, ModBlocks.COAL_PLANKS);
        fenceItem(ModBlocks.COAL_FENCE, ModBlocks.COAL_PLANKS);


        basicItem(ModItems.COPPER_ACORN.get());
        basicItem(ModItems.COPPER_RESIN.get());

        saplingItem(ModBlocks.COPPER_SAPLING);
        buttonItem(ModBlocks.COPPER_BUTTON, ModBlocks.COPPER_PLANKS);
        fenceItem(ModBlocks.COPPER_FENCE, ModBlocks.COPPER_PLANKS);


        basicItem(ModItems.IRON_ACORN.get());
        basicItem(ModItems.IRON_RESIN.get());

        saplingItem(ModBlocks.IRON_SAPLING);
        buttonItem(ModBlocks.IRON_BUTTON, ModBlocks.IRON_PLANKS);
        fenceItem(ModBlocks.IRON_FENCE, ModBlocks.IRON_PLANKS);


    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
