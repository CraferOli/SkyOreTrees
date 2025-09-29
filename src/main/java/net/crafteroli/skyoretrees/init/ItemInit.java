package net.crafteroli.skyoretrees.init;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.crafteroli.skyoretrees.item.ModFoodProperties;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.monster.breeze.Slide;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SkyOreTrees.MOD_ID);


    public static final DeferredItem<Item> DIRT_ACORN = ITEMS.register("dirt_acorn", () -> new
            Item(new Item.Properties().food(ModFoodProperties.DIRT_ACORN)));

    public static final DeferredItem<Item> COAL_ACORN = ITEMS.register("coal_acorn", () -> new
            Item(new Item.Properties().food(ModFoodProperties.COAL_ACORN)));


    public static final DeferredItem<Item> DIRT_RESIN = ITEMS.register("dirt_resin", () -> new
            Item(new Item.Properties()));

    public static final DeferredItem<Item> COAL_RESIN = ITEMS.register("coal_resin", () -> new
            Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
