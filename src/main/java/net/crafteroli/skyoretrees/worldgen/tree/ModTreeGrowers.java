package net.crafteroli.skyoretrees.worldgen.tree;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower DIRT = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_dirt",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DIRT_KEY), Optional.empty());
}
