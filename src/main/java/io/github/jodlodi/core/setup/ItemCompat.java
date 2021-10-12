package io.github.jodlodi.core.setup;

import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import io.github.jodlodi.core.DecorReg;

public class ItemCompat {
    public static void regCompat(){
        DataUtil.registerCompostable(DecorReg.EXPERIMENT_115_PIE.get(), 1.0F);
        DataUtil.registerCompostable(DecorReg.TWILIGHT_OAK_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.RAINBOAK_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.CANOPY_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.MANGROVE_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.DARKWOOD_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.TIMEWOOD_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.TRANSFORMATION_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.MINING_LEAF_CARPET.get(), 0.3F);
        DataUtil.registerCompostable(DecorReg.SORTING_LEAF_CARPET.get(), 0.3F);

        DataUtil.registerFlammable(DecorReg.TWILIGHT_OAK_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(DecorReg.RAINBOAK_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(DecorReg.CANOPY_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(DecorReg.MANGROVE_LEAF_CARPET.get(), 30, 60);
        //DataUtil.registerFlammable(DecorReg.DARKWOOD_LEAF_CARPET.get(), 30, 60); jk, its not flammable
        DataUtil.registerFlammable(DecorReg.TIMEWOOD_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(DecorReg.TRANSFORMATION_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(DecorReg.MINING_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(DecorReg.SORTING_LEAF_CARPET.get(), 30, 60);

        DataUtil.registerFlammable(DecorReg.TWILIGHT_OAK_HEDGE.get(), 5, 20);
        DataUtil.registerFlammable(DecorReg.RAINBOAK_HEDGE.get(), 5, 20);
        DataUtil.registerFlammable(DecorReg.CANOPY_HEDGE.get(), 5, 20);
        DataUtil.registerFlammable(DecorReg.MANGROVE_HEDGE.get(), 5, 20);
        //DataUtil.registerFlammable(DecorReg.DARKWOOD_HEDGE.get(), 5, 20); jk, its not flammable
        DataUtil.registerFlammable(DecorReg.TIMEWOOD_HEDGE.get(), 5, 20);
        DataUtil.registerFlammable(DecorReg.TRANSFORMATION_HEDGE.get(), 5, 20);
        DataUtil.registerFlammable(DecorReg.MINING_HEDGE.get(), 5, 20);
        DataUtil.registerFlammable(DecorReg.SORTING_HEDGE.get(), 5, 20);
    }
}
