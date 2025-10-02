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
                        output.accept(ModItems.STONE_ACORN);
                        output.accept(ModItems.STONE_RESIN);
                        output.accept(ModItems.COAL_ACORN);
                        output.accept(ModItems.COAL_RESIN);
                        output.accept(ModItems.COPPER_ACORN);
                        output.accept(ModItems.COPPER_RESIN);
                        output.accept(ModItems.IRON_ACORN);
                        output.accept(ModItems.IRON_RESIN);
                        output.accept(ModItems.GOLD_ACORN);
                        output.accept(ModItems.GOLD_RESIN);
                        output.accept(ModItems.REDSTONE_ACORN);
                        output.accept(ModItems.REDSTONE_RESIN);
                        output.accept(ModItems.LAPIS_ACORN);
                        output.accept(ModItems.LAPIS_RESIN);
                        output.accept(ModItems.EMERALD_ACORN);
                        output.accept(ModItems.EMERALD_RESIN);
                        output.accept(ModItems.DIAMOND_ACORN);
                        output.accept(ModItems.DIAMOND_RESIN);
                        output.accept(ModItems.QUARTZ_ACORN);
                        output.accept(ModItems.QUARTZ_RESIN);
                        output.accept(ModItems.DEBRIS_ACORN);
                        output.accept(ModItems.DEBRIS_RESIN);

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

                        output.accept(ModBlocks.STONE_SAPLING);
                        output.accept(ModBlocks.STONE_LEAVES);
                        output.accept(ModBlocks.SATURATED_STONE_LOG);
                        output.accept(ModBlocks.SATURATED_STONE_WOOD);
                        output.accept(ModBlocks.STONE_LOG);
                        output.accept(ModBlocks.STONE_WOOD);
                        output.accept(ModBlocks.STRIPPED_STONE_LOG);
                        output.accept(ModBlocks.STRIPPED_STONE_WOOD);
                        output.accept(ModBlocks.STONE_PLANKS);
                        output.accept(ModBlocks.STONE_STAIRS);
                        output.accept(ModBlocks.STONE_SLAB);
                        output.accept(ModBlocks.STONE_FENCE_GATE);
                        output.accept(ModBlocks.STONE_FENCE);
                        output.accept(ModBlocks.STONE_BUTTON);
                        output.accept(ModBlocks.STONE_PRESSURE_PLATE);

                        output.accept(ModBlocks.COAL_SAPLING);
                        output.accept(ModBlocks.COAL_LEAVES);
                        output.accept(ModBlocks.SATURATED_COAL_LOG);
                        output.accept(ModBlocks.SATURATED_COAL_WOOD);
                        output.accept(ModBlocks.COAL_LOG);
                        output.accept(ModBlocks.COAL_WOOD);
                        output.accept(ModBlocks.STRIPPED_COAL_LOG);
                        output.accept(ModBlocks.STRIPPED_COAL_WOOD);
                        output.accept(ModBlocks.COAL_PLANKS);
                        output.accept(ModBlocks.COAL_STAIRS);
                        output.accept(ModBlocks.COAL_SLAB);
                        output.accept(ModBlocks.COAL_FENCE_GATE);
                        output.accept(ModBlocks.COAL_FENCE);
                        output.accept(ModBlocks.COAL_BUTTON);
                        output.accept(ModBlocks.COAL_PRESSURE_PLATE);

                        output.accept(ModBlocks.COPPER_SAPLING);
                        output.accept(ModBlocks.COPPER_LEAVES);
                        output.accept(ModBlocks.SATURATED_COPPER_LOG);
                        output.accept(ModBlocks.SATURATED_COPPER_WOOD);
                        output.accept(ModBlocks.COPPER_LOG);
                        output.accept(ModBlocks.COPPER_WOOD);
                        output.accept(ModBlocks.STRIPPED_COPPER_LOG);
                        output.accept(ModBlocks.STRIPPED_COPPER_WOOD);
                        output.accept(ModBlocks.COPPER_PLANKS);
                        output.accept(ModBlocks.COPPER_STAIRS);
                        output.accept(ModBlocks.COPPER_SLAB);
                        output.accept(ModBlocks.COPPER_FENCE_GATE);
                        output.accept(ModBlocks.COPPER_FENCE);
                        output.accept(ModBlocks.COPPER_BUTTON);
                        output.accept(ModBlocks.COPPER_PRESSURE_PLATE);

                        output.accept(ModBlocks.IRON_SAPLING);
                        output.accept(ModBlocks.IRON_LEAVES);
                        output.accept(ModBlocks.SATURATED_IRON_LOG);
                        output.accept(ModBlocks.SATURATED_IRON_WOOD);
                        output.accept(ModBlocks.IRON_LOG);
                        output.accept(ModBlocks.IRON_WOOD);
                        output.accept(ModBlocks.STRIPPED_IRON_LOG);
                        output.accept(ModBlocks.STRIPPED_IRON_WOOD);
                        output.accept(ModBlocks.IRON_PLANKS);
                        output.accept(ModBlocks.IRON_STAIRS);
                        output.accept(ModBlocks.IRON_SLAB);
                        output.accept(ModBlocks.IRON_FENCE_GATE);
                        output.accept(ModBlocks.IRON_FENCE);
                        output.accept(ModBlocks.IRON_BUTTON);
                        output.accept(ModBlocks.IRON_PRESSURE_PLATE);

                        output.accept(ModBlocks.GOLD_SAPLING);
                        output.accept(ModBlocks.GOLD_LEAVES);
                        output.accept(ModBlocks.SATURATED_GOLD_LOG);
                        output.accept(ModBlocks.SATURATED_GOLD_WOOD);
                        output.accept(ModBlocks.GOLD_LOG);
                        output.accept(ModBlocks.GOLD_WOOD);
                        output.accept(ModBlocks.STRIPPED_GOLD_LOG);
                        output.accept(ModBlocks.STRIPPED_GOLD_WOOD);
                        output.accept(ModBlocks.GOLD_PLANKS);
                        output.accept(ModBlocks.GOLD_STAIRS);
                        output.accept(ModBlocks.GOLD_SLAB);
                        output.accept(ModBlocks.GOLD_FENCE_GATE);
                        output.accept(ModBlocks.GOLD_FENCE);
                        output.accept(ModBlocks.GOLD_BUTTON);
                        output.accept(ModBlocks.GOLD_PRESSURE_PLATE);

                        output.accept(ModBlocks.REDSTONE_SAPLING);
                        output.accept(ModBlocks.REDSTONE_LEAVES);
                        output.accept(ModBlocks.SATURATED_REDSTONE_LOG);
                        output.accept(ModBlocks.SATURATED_REDSTONE_WOOD);
                        output.accept(ModBlocks.REDSTONE_LOG);
                        output.accept(ModBlocks.REDSTONE_WOOD);
                        output.accept(ModBlocks.STRIPPED_REDSTONE_LOG);
                        output.accept(ModBlocks.STRIPPED_REDSTONE_WOOD);
                        output.accept(ModBlocks.REDSTONE_PLANKS);
                        output.accept(ModBlocks.REDSTONE_STAIRS);
                        output.accept(ModBlocks.REDSTONE_SLAB);
                        output.accept(ModBlocks.REDSTONE_FENCE_GATE);
                        output.accept(ModBlocks.REDSTONE_FENCE);
                        output.accept(ModBlocks.REDSTONE_BUTTON);
                        output.accept(ModBlocks.REDSTONE_PRESSURE_PLATE);

                        output.accept(ModBlocks.LAPIS_SAPLING);
                        output.accept(ModBlocks.LAPIS_LEAVES);
                        output.accept(ModBlocks.SATURATED_LAPIS_LOG);
                        output.accept(ModBlocks.SATURATED_LAPIS_WOOD);
                        output.accept(ModBlocks.LAPIS_LOG);
                        output.accept(ModBlocks.LAPIS_WOOD);
                        output.accept(ModBlocks.STRIPPED_LAPIS_LOG);
                        output.accept(ModBlocks.STRIPPED_LAPIS_WOOD);
                        output.accept(ModBlocks.LAPIS_PLANKS);
                        output.accept(ModBlocks.LAPIS_STAIRS);
                        output.accept(ModBlocks.LAPIS_SLAB);
                        output.accept(ModBlocks.LAPIS_FENCE_GATE);
                        output.accept(ModBlocks.LAPIS_FENCE);
                        output.accept(ModBlocks.LAPIS_BUTTON);
                        output.accept(ModBlocks.LAPIS_PRESSURE_PLATE);

                        output.accept(ModBlocks.EMERALD_SAPLING);
                        output.accept(ModBlocks.EMERALD_LEAVES);
                        output.accept(ModBlocks.SATURATED_EMERALD_LOG);
                        output.accept(ModBlocks.SATURATED_EMERALD_WOOD);
                        output.accept(ModBlocks.EMERALD_LOG);
                        output.accept(ModBlocks.EMERALD_WOOD);
                        output.accept(ModBlocks.STRIPPED_EMERALD_LOG);
                        output.accept(ModBlocks.STRIPPED_EMERALD_WOOD);
                        output.accept(ModBlocks.EMERALD_PLANKS);
                        output.accept(ModBlocks.EMERALD_STAIRS);
                        output.accept(ModBlocks.EMERALD_SLAB);
                        output.accept(ModBlocks.EMERALD_FENCE_GATE);
                        output.accept(ModBlocks.EMERALD_FENCE);
                        output.accept(ModBlocks.EMERALD_BUTTON);
                        output.accept(ModBlocks.EMERALD_PRESSURE_PLATE);

                        output.accept(ModBlocks.DIAMOND_SAPLING);
                        output.accept(ModBlocks.DIAMOND_LEAVES);
                        output.accept(ModBlocks.SATURATED_DIAMOND_LOG);
                        output.accept(ModBlocks.SATURATED_DIAMOND_WOOD);
                        output.accept(ModBlocks.DIAMOND_LOG);
                        output.accept(ModBlocks.DIAMOND_WOOD);
                        output.accept(ModBlocks.STRIPPED_DIAMOND_LOG);
                        output.accept(ModBlocks.STRIPPED_DIAMOND_WOOD);
                        output.accept(ModBlocks.DIAMOND_PLANKS);
                        output.accept(ModBlocks.DIAMOND_STAIRS);
                        output.accept(ModBlocks.DIAMOND_SLAB);
                        output.accept(ModBlocks.DIAMOND_FENCE_GATE);
                        output.accept(ModBlocks.DIAMOND_FENCE);
                        output.accept(ModBlocks.DIAMOND_BUTTON);
                        output.accept(ModBlocks.DIAMOND_PRESSURE_PLATE);

                        output.accept(ModBlocks.QUARTZ_SAPLING);
                        output.accept(ModBlocks.QUARTZ_LEAVES);
                        output.accept(ModBlocks.SATURATED_QUARTZ_LOG);
                        output.accept(ModBlocks.SATURATED_QUARTZ_WOOD);
                        output.accept(ModBlocks.QUARTZ_LOG);
                        output.accept(ModBlocks.QUARTZ_WOOD);
                        output.accept(ModBlocks.STRIPPED_QUARTZ_LOG);
                        output.accept(ModBlocks.STRIPPED_QUARTZ_WOOD);
                        output.accept(ModBlocks.QUARTZ_PLANKS);
                        output.accept(ModBlocks.QUARTZ_STAIRS);
                        output.accept(ModBlocks.QUARTZ_SLAB);
                        output.accept(ModBlocks.QUARTZ_FENCE_GATE);
                        output.accept(ModBlocks.QUARTZ_FENCE);
                        output.accept(ModBlocks.QUARTZ_BUTTON);
                        output.accept(ModBlocks.QUARTZ_PRESSURE_PLATE);

                        output.accept(ModBlocks.DEBRIS_SAPLING);
                        output.accept(ModBlocks.DEBRIS_LEAVES);
                        output.accept(ModBlocks.SATURATED_DEBRIS_LOG);
                        output.accept(ModBlocks.SATURATED_DEBRIS_WOOD);
                        output.accept(ModBlocks.DEBRIS_LOG);
                        output.accept(ModBlocks.DEBRIS_WOOD);
                        output.accept(ModBlocks.STRIPPED_DEBRIS_LOG);
                        output.accept(ModBlocks.STRIPPED_DEBRIS_WOOD);
                        output.accept(ModBlocks.DEBRIS_PLANKS);
                        output.accept(ModBlocks.DEBRIS_STAIRS);
                        output.accept(ModBlocks.DEBRIS_SLAB);
                        output.accept(ModBlocks.DEBRIS_FENCE_GATE);
                        output.accept(ModBlocks.DEBRIS_FENCE);
                        output.accept(ModBlocks.DEBRIS_BUTTON);
                        output.accept(ModBlocks.DEBRIS_PRESSURE_PLATE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
