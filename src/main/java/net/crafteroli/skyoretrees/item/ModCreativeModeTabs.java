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

                    }).build());

    public static final Supplier<CreativeModeTab> SKYORETREES_BLOCK_TAB = CREATIVE_MODE_TAB.register("skyoretrees_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.DIRT_PLANKS.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, "skyoretrees_items_tab"))
                    .title(Component.translatable("creativetab.skyoretrees.blocks_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.DIRT_PLANKS);
                        output.accept(ModBlocks.DIRT_LEAVES);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
