package net.crafteroli.skyoretrees.util;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> LEAVES = createTag("leaves");
        public static final TagKey<Block> LOGS = createTag("logs");
        public static final TagKey<Block> PLANKS = createTag("planks");
        public static final TagKey<Block> DIRT_LOGS = createTag("dirt_logs");
        public static final TagKey<Block> STONE_LOGS = createTag("stone_logs");
        public static final TagKey<Block> COAL_LOGS = createTag("coal_logs");
        public static final TagKey<Block> COPPER_LOGS = createTag("copper_logs");
        public static final TagKey<Block> IRON_LOGS = createTag("iron_logs");
        public static final TagKey<Block> GOLD_LOGS = createTag("gold_logs");
        public static final TagKey<Block> REDSTONE_LOGS = createTag("redstone_logs");
        public static final TagKey<Block> LAPIS_LOGS = createTag("lapis_logs");
        public static final TagKey<Block> EMERALD_LOGS = createTag("emerald_logs");
        public static final TagKey<Block> DIAMOND_LOGS = createTag("diamond_logs");
        public static final TagKey<Block> QUARTZ_LOGS = createTag("quartz_logs");
        public static final TagKey<Block> DEBRIS_LOGS = createTag("debris_logs");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, name));
        }
    }


    public static class Items {

        public static final TagKey<Item> ACORN = createTag("acorn");
        public static final TagKey<Item> RESIN = createTag("resin");

        public static final TagKey<Item> PLANKS = createTag("planks");
        public static final TagKey<Item> LEAVES = createTag("leaves");
        public static final TagKey<Item> DIRT_LOGS = createTag("dirt_logs");
        public static final TagKey<Item> STONE_LOGS = createTag("stone_logs");
        public static final TagKey<Item> COAL_LOGS = createTag("coal_logs");
        public static final TagKey<Item> COPPER_LOGS = createTag("copper_logs");
        public static final TagKey<Item> IRON_LOGS = createTag("iron_logs");
        public static final TagKey<Item> GOLD_LOGS = createTag("gold_logs");
        public static final TagKey<Item> REDSTONE_LOGS = createTag("redstone_logs");
        public static final TagKey<Item> LAPIS_LOGS = createTag("lapis_logs");
        public static final TagKey<Item> EMERALD_LOGS = createTag("emerald_logs");
        public static final TagKey<Item> DIAMOND_LOGS = createTag("diamond_logs");
        public static final TagKey<Item> QUARTZ_LOGS = createTag("quartz_logs");
        public static final TagKey<Item> DEBRIS_LOGS = createTag("debris_logs");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, name));
        }
    }
}
