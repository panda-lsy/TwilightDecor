package io.github.jodlodi.twilightdecor.types;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

import static twilightforest.block.Experiment115Block.BITES_TAKEN;
import static twilightforest.block.Experiment115Block.REGENERATE;

@ParametersAreNonnullByDefault
public class Experiment115Pie extends BlockItem {
    public Experiment115Pie(Block block, Properties properties){
        super(block, properties);
    }

    @Override
    protected BlockState getPlacementState(BlockPlaceContext context) {
        BlockState blockstate = this.getBlock().getStateForPlacement(context).setValue(BITES_TAKEN, 0).setValue(REGENERATE, true);
        return this.canPlace(context, blockstate) ? blockstate : null;
    }

    @OnlyIn(Dist.CLIENT)
    public @NotNull String getDescriptionId() {
        return "item.twilightdecor.experiment_115_pie";
    }
}
