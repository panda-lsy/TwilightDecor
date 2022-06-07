package io.github.jodlodi.twilightdecor.types;

import com.teamabnormals.blueprint.common.block.LeafCarpetBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import twilightforest.client.particle.TFParticleType;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

@ParametersAreNonnullByDefault
public class MagicCarpet extends LeafCarpetBlock {

    public MagicCarpet(BlockBehaviour.Properties properties) { super(properties); }

    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        this.carpetSparkleRunes(level, pos, random);
    }

    private void carpetSparkleRunes(Level level, BlockPos pos, Random rand) {
        Direction side = Direction.getRandom(rand);
        double rx = ((float)pos.getX() + rand.nextFloat());
        double ry;
        double rz = ((float)pos.getZ() + rand.nextFloat());

        if (side == Direction.DOWN) {
            ry = (double)(pos.getY()) + 0.125D;
            level.addParticle(TFParticleType.LEAF_RUNE.get(), rx, ry, rz, 0.0D, 0.0D, 0.0D);
        }
    }
}
