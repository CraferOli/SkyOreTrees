package net.crafteroli.skyoretrees.item;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.init.ItemInit;
import net.crafteroli.skyoretrees.init.TreeInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyOreTrees.MOD_ID);

    public static final Supplier<CreativeModeTab> SKYORETREES_ITEM_TAB = CREATIVE_MODE_TAB.register("skyoretrees_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ItemInit.DIRT_ACORN.get()))
                    .title(Component.translatable("creativetab.skyoretrees.items_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ItemInit.DIRT_ACORN);
                        output.accept(ItemInit.DIRT_RESIN);
                        output.accept(ItemInit.COAL_ACORN);
                        output.accept(ItemInit.COAL_RESIN);

                    }).build());


    public static final Supplier<CreativeModeTab> SKYORETREES_BLOCK_TAB = CREATIVE_MODE_TAB.register("skyoretrees_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(((ItemLike) TreeInit.DIRT_TREE_BLOCKS.SAPLING.get())))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, "skyoretrees_items_tab"))
                    .title(Component.translatable("creativetab.skyoretrees.blocks_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(TreeInit.DIRT_TREE_BLOCKS.SAPLING);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.LEAVES);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.SATURATED_LOG);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.SATURATED_WOOD);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.LOG);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.WOOD);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.STRIPPED_LOG);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.STRIPPED_WOOD);
                        output.accept((ItemLike) TreeInit.DIRT_TREE_BLOCKS.PLANKS);
                        output.accept(TreeInit.DIRT_TREE_BLOCKS.STAIRS);
                        output.accept(TreeInit.DIRT_TREE_BLOCKS.SLAB);
                        output.accept(TreeInit.DIRT_TREE_BLOCKS.FENCE_GATE);
                        output.accept(TreeInit.DIRT_TREE_BLOCKS.FENCE);
                        output.accept(TreeInit.DIRT_TREE_BLOCKS.BUTTON);
                        output.accept(TreeInit.DIRT_TREE_BLOCKS.PRESSURE_PLATE);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
