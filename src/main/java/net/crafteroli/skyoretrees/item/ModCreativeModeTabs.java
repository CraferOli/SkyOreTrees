package net.crafteroli.skyoretrees.item;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyOreTrees.MOD_ID);

    public static final Supplier<CreativeModeTab> SKYORETREES_ITEM_TAB = CREATIVE_MODE_TAB.register("skyoretrees_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DIRT_RESIN.get()))
                    .title(Component.translatable("creativetab.skyoretrees.items_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.DIRT_ACORN);
                        output.accept(ModItems.DIRT_RESIN);
                        output.accept(ModItems.COAL_ACORN);
                        output.accept(ModItems.COAL_RESIN);

                    }).build());

    public static final Supplier<CreativeModeTab> SKYORETREES_BLOCK_TAB = CREATIVE_MODE_TAB.register("skyoretrees_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.DIRT_PLANKS.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, "skyoretrees_items_tab"))
                    .title(Component.translatable("creativetab.skyoretrees.blocks_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.DIRT_SAPLING);
                        output.accept(ModBlocks.DIRT_LEAVES);
                        output.accept(ModBlocks.SATURATED_DIRT_LOG);
                        output.accept(ModBlocks.SATURATED_DIRT_WOOD);
                        output.accept(ModBlocks.DIRT_LOG);
                        output.accept(ModBlocks.DIRT_WOOD);
                        output.accept(ModBlocks.STRIPPED_DIRT_LOG);
                        output.accept(ModBlocks.STRIPPED_DIRT_WOOD);
                        output.accept(ModBlocks.DIRT_PLANKS);
                        output.accept(ModBlocks.DIRT_STAIRS);
                        output.accept(ModBlocks.DIRT_SLAB);
                        output.accept(ModBlocks.DIRT_FENCE_GATE);
                        output.accept(ModBlocks.DIRT_FENCE);
                        output.accept(ModBlocks.DIRT_BUTTON);
                        output.accept(ModBlocks.DIRT_PRESSURE_PLATE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
