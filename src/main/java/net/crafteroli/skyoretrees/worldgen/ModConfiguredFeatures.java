package net.crafteroli.skyoretrees.worldgen;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> DIRT_KEY = registerKey("tree_dirt");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONE_KEY = registerKey("tree_stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAL_KEY = registerKey("tree_coal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_KEY = registerKey("tree_copper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_KEY = registerKey("tree_iron");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_KEY = registerKey("tree_gold");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_KEY = registerKey("tree_redstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_KEY = registerKey("tree_lapis");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_KEY = registerKey("tree_emerald");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_KEY = registerKey("tree_diamond");
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_KEY = registerKey("tree_quartz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEBRIS_KEY = registerKey("tree_debris");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
    }



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(SkyOreTrees.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
