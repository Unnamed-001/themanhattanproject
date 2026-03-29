package net.mumei.manhattan.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.mumei.manhattan.main.modthings.ModBlockEntities;

public class UraniumBlockEntity extends BlockEntity {
    private int radiationLevel = 10; // Valor base de radiación

    public UraniumBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.URANIUM_BE.get(), pos, state);
    }

    // Getter para que el Helper lo lea
    public int getRadiationLevel() {
        return this.radiationLevel;
    }

    // Setter por si quieres cambiarlo dinámicamente
    public void setRadiationLevel(int level) {
        this.radiationLevel = level;
        this.setChanged(); // Importante: avisa a Minecraft que el NBT cambió
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("radiation_level", this.radiationLevel);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.radiationLevel = tag.getInt("radiation_level");
    }
}