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


        basicItem(ModItems.GOLD_ACORN.get());
        basicItem(ModItems.GOLD_RESIN.get());

        saplingItem(ModBlocks.GOLD_SAPLING);
        buttonItem(ModBlocks.GOLD_BUTTON, ModBlocks.GOLD_PLANKS);
        fenceItem(ModBlocks.GOLD_FENCE, ModBlocks.GOLD_PLANKS);


        basicItem(ModItems.REDSTONE_ACORN.get());
        basicItem(ModItems.REDSTONE_RESIN.get());

        saplingItem(ModBlocks.REDSTONE_SAPLING);
        buttonItem(ModBlocks.REDSTONE_BUTTON, ModBlocks.REDSTONE_PLANKS);
        fenceItem(ModBlocks.REDSTONE_FENCE, ModBlocks.REDSTONE_PLANKS);


        basicItem(ModItems.LAPIS_ACORN.get());
        basicItem(ModItems.LAPIS_RESIN.get());

        saplingItem(ModBlocks.LAPIS_SAPLING);
        buttonItem(ModBlocks.LAPIS_BUTTON, ModBlocks.LAPIS_PLANKS);
        fenceItem(ModBlocks.LAPIS_FENCE, ModBlocks.LAPIS_PLANKS);


        basicItem(ModItems.EMERALD_ACORN.get());
        basicItem(ModItems.EMERALD_RESIN.get());

        saplingItem(ModBlocks.EMERALD_SAPLING);
        buttonItem(ModBlocks.EMERALD_BUTTON, ModBlocks.EMERALD_PLANKS);
        fenceItem(ModBlocks.EMERALD_FENCE, ModBlocks.EMERALD_PLANKS);


        basicItem(ModItems.DIAMOND_ACORN.get());
        basicItem(ModItems.DIAMOND_RESIN.get());

        saplingItem(ModBlocks.DIAMOND_SAPLING);
        buttonItem(ModBlocks.DIAMOND_BUTTON, ModBlocks.DIAMOND_PLANKS);
        fenceItem(ModBlocks.DIAMOND_FENCE, ModBlocks.DIAMOND_PLANKS);


        basicItem(ModItems.QUARTZ_ACORN.get());
        basicItem(ModItems.QUARTZ_RESIN.get());

        saplingItem(ModBlocks.QUARTZ_SAPLING);
        buttonItem(ModBlocks.QUARTZ_BUTTON, ModBlocks.QUARTZ_PLANKS);
        fenceItem(ModBlocks.QUARTZ_FENCE, ModBlocks.QUARTZ_PLANKS);


        basicItem(ModItems.DEBRIS_ACORN.get());
        basicItem(ModItems.DEBRIS_RESIN.get());

        saplingItem(ModBlocks.DEBRIS_SAPLING);
        buttonItem(ModBlocks.DEBRIS_BUTTON, ModBlocks.DEBRIS_PLANKS);
        fenceItem(ModBlocks.DEBRIS_FENCE, ModBlocks.DEBRIS_PLANKS);


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
