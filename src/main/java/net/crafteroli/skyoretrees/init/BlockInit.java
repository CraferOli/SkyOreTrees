package net.crafteroli.skyoretrees.init;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SkyOreTrees.MOD_ID);

    public static <T extends Block> DeferredHolder<Block, T> registerBlock(String name, Supplier<T> block){
        DeferredHolder<Block, T> registeredBlock = BLOCKS.register(name, block);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }

    public static <T extends Block> void registerBlockItem(String name, DeferredHolder<Block, T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(((Block) block.get()), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
