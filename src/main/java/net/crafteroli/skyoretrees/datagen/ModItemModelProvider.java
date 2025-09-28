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

        basicItem(ModItems.COAL_ACORN.get());
        basicItem(ModItems.COAL_RESIN.get());

        saplingItem(ModBlocks.DIRT_SAPLING);

        buttonItem(ModBlocks.DIRT_BUTTON, ModBlocks.DIRT_PLANKS);
        fenceItem(ModBlocks.DIRT_FENCE, ModBlocks.DIRT_PLANKS);
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
