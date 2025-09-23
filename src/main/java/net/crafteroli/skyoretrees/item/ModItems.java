package net.crafteroli.skyoretrees.item;

import net.crafteroli.skyoretrees.SkyOreTrees;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SkyOreTrees.MOD_ID);

    public static final DeferredItem<Item> DIRT_RESIN = ITEMS.register("dirt_resin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIRT_ACORN = ITEMS.register("dirt_acorn",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
