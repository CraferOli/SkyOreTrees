package net.crafteroli.skyoretrees.datagen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.custom.ModFlammableBlock;
import net.crafteroli.skyoretrees.init.ItemInit;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SkyOreTrees.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemInit.DIRT_ACORN.get());
        basicItem(ItemInit.DIRT_RESIN.get());

        basicItem(ItemInit.COAL_ACORN.get());
        basicItem(ItemInit.COAL_RESIN.get());

        saplingItem(TreeInit.DIRT_TREE_BLOCKS.SAPLING);

        buttonItem(TreeInit.DIRT_TREE_BLOCKS.BUTTON, TreeInit.DIRT_TREE_BLOCKS.PLANKS);
        fenceItem(TreeInit.DIRT_TREE_BLOCKS.FENCE, TreeInit.DIRT_TREE_BLOCKS.PLANKS);
    }

    private ItemModelBuilder saplingItem(DeferredBlock<SaplingBlock> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredHolder<Block, ModFlammableBlock> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredHolder<Block, ModFlammableBlock> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
