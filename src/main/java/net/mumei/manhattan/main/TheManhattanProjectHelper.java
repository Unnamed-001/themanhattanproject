package net.mumei.manhattan.main;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;

import net.mumei.manhattan.blockentities.UraniumBlockEntity;
import net.mumei.manhattan.main.modthings.ModBlockEntities;

public class TheManhattanProjectHelper {




    public int checkRadiationLevel(Level level, BlockPos pos) {
        BlockEntity be =  level.getBlockEntity(pos);

        if (be instanceof UraniumBlockEntity uraniumBE) {
            return uraniumBE.getRadiationLevel();
        }
        return 0;
    }
}
