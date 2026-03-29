package net.mumei.manhattan.main.modthings;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.mumei.manhattan.blockentities.UraniumBlockEntity;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, "themanhattanproject");

    // Registro del tipo de BlockEntity
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<UraniumBlockEntity>> URANIUM_BE =
            BLOCK_ENTITIES.register("uranium_be", () ->
                    BlockEntityType.Builder.of(UraniumBlockEntity::new, ModBlock.URANIUM_ORE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

    // CLASE INTERNA DEBE SER STATIC

}