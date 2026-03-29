package net.mumei.manhattan.main.modthings;

import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.mumei.manhattan.main.modthings.ModBlock.URANIUM_ORE;


public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("TheManhattanProject");
    public static final DeferredItem<BlockItem> URANIUM_ORE_ITEM = ModItem.ITEMS.registerSimpleBlockItem("uranium_ore", URANIUM_ORE);




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
