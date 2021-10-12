package io.github.jodlodi.core.types;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

import static twilightforest.block.Experiment115Block.BITES_TAKEN;
import static twilightforest.block.Experiment115Block.REGENERATE;

public class Experiment115Pie extends BlockItem {
    public Experiment115Pie(Block block, Properties properties){
        super(block, properties);
    }

    @Nullable
    public BlockState getPlacementState(BlockItemUseContext p_195945_1_) {
        BlockState blockstate = this.getBlock().getStateForPlacement(p_195945_1_).setValue(BITES_TAKEN, 0).setValue(REGENERATE, true);
        return blockstate != null && this.canPlace(p_195945_1_, blockstate) ? blockstate : null;
    }

    @OnlyIn(Dist.CLIENT)
    public String getDescriptionId() {
        return "item.twilightdecor.experiment_115_pie";
    }
}
