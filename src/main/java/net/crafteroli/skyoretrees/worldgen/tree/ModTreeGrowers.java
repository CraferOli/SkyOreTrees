package net.crafteroli.skyoretrees.worldgen.tree;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower DIRT = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_dirt",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DIRT_KEY), Optional.empty());

    public static final TreeGrower STONE = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_stone",
            Optional.empty(), Optional.of(ModConfiguredFeatures.STONE_KEY), Optional.empty());

    public static final TreeGrower COAL = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_coal",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COAL_KEY), Optional.empty());

    public static final TreeGrower COPPER = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_copper",
            Optional.empty(), Optional.of(ModConfiguredFeatures.COPPER_KEY), Optional.empty());

    public static final TreeGrower IRON = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_iron",
            Optional.empty(), Optional.of(ModConfiguredFeatures.IRON_KEY), Optional.empty());

    public static final TreeGrower GOLD = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_gold",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GOLD_KEY), Optional.empty());

    public static final TreeGrower REDSTONE = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_redstone",
            Optional.empty(), Optional.of(ModConfiguredFeatures.REDSTONE_KEY), Optional.empty());

    public static final TreeGrower LAPIS = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_lapis",
            Optional.empty(), Optional.of(ModConfiguredFeatures.LAPIS_KEY), Optional.empty());

    public static final TreeGrower EMERALD = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_emerald",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EMERALD_KEY), Optional.empty());

    public static final TreeGrower DIAMOND = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_diamond",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DIAMOND_KEY), Optional.empty());

    public static final TreeGrower QUARTZ = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_quartz",
            Optional.empty(), Optional.of(ModConfiguredFeatures.QUARTZ_KEY), Optional.empty());

    public static final TreeGrower DEBRIS = new TreeGrower(SkyOreTrees.MOD_ID + ":tree_debris",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DEBRIS_KEY), Optional.empty());
}
