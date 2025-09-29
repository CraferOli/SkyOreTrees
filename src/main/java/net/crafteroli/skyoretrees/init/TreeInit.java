package net.crafteroli.skyoretrees.init;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.util.TreeBlocks;
import net.crafteroli.skyoretrees.worldgen.ModConfiguredFeatures;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Supplier;

public class TreeInit {
    public static final DeferredRegister<Block> TREE_BLOCKS;
    public static ArrayList<TreeBlocks> registeredTrees;
    public static HashMap<Block, Block> debarkingMap;

    public static final TreeGrower DIRT_TREE_GROWER;

    public static final TreeBlocks DIRT_TREE_BLOCKS;


    public static <T extends Block> DeferredHolder<Block, T> registerBlock(String name, Supplier<T> block){
        DeferredHolder<Block, T> registerBlock = TREE_BLOCKS.register(name, block);
        BlockInit.registerBlockItem(name, registerBlock);
        return registerBlock;
    }

    public static void register(IEventBus eventBus ) {
        TREE_BLOCKS.register(eventBus);
    }

    public static void loadDebarkMap() {
        for (TreeBlocks treeBlocks : registeredTrees) {
            debarkingMap.put(((Block) treeBlocks.SATURATED_LOG.get()), ((Block) treeBlocks.LOG.get()));
            debarkingMap.put(((Block) treeBlocks.SATURATED_WOOD.get()), ((Block) treeBlocks.WOOD.get()));
            debarkingMap.put(((Block) treeBlocks.LOG.get()), ((Block) treeBlocks.STRIPPED_LOG.get()));
            debarkingMap.put(((Block) treeBlocks.WOOD.get()), ((Block) treeBlocks.STRIPPED_WOOD.get()));
        }

    }

    static {
        TREE_BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, SkyOreTrees.MOD_ID);
        registeredTrees = new ArrayList<>();
        debarkingMap = new HashMap<>();
        DIRT_TREE_GROWER = new TreeGrower(SkyOreTrees.MOD_ID, Optional.empty(), Optional.of(ModConfiguredFeatures.DIRT_KEY), Optional.empty());

        DIRT_TREE_BLOCKS = new TreeBlocks("dirt", DIRT_TREE_GROWER);


    }

}
