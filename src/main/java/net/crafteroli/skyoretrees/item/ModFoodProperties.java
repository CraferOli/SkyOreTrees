package net.crafteroli.skyoretrees.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ACORN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .fast()
            .alwaysEdible()

            .build();

    public static final FoodProperties DIRT_ACORN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .fast()
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.OOZING, 100, 2), 0.45f)

            .build();

    public static final FoodProperties COAL_ACORN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.25f)
            .fast()
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 0.45f)

            .build();
}
