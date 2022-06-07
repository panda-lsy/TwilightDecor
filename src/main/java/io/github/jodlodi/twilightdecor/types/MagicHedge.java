package io.github.jodlodi.twilightdecor.types;

import com.teamabnormals.blueprint.common.block.HedgeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import twilightforest.client.particle.TFParticleType;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

@ParametersAreNonnullByDefault
public class MagicHedge extends HedgeBlock {

    public MagicHedge(Properties properties) { super(properties); }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        this.hedgeSparkleRunes(level, pos, random);
    }

    private void hedgeSparkleRunes(Level level, BlockPos pos, Random rand) {
        double offset = 0.0625D;
        Direction side = Direction.getRandom(rand);
        double rx = ((float)pos.getX() + rand.nextFloat() * 0.75D);
        double ry = ((float)pos.getY() + rand.nextFloat());
        double rz = ((float)pos.getZ() + rand.nextFloat() * 0.75D);
        if (side == Direction.DOWN && level.isEmptyBlock(pos.above())) {
            ry = (double)(pos.getY() + 1) + offset;
        }

        if (side == Direction.UP && level.isEmptyBlock(pos.below())) {
            ry = (double)pos.getY() - offset;
        }

        if (side == Direction.NORTH && level.isEmptyBlock(pos.south())) {
            rz = (double)pos.getZ() + 0.875D + offset;
        }

        if (side == Direction.SOUTH && level.isEmptyBlock(pos.north())) {
            rz = (double)pos.getZ() + 0.125D - offset;
        }

        if (side == Direction.WEST && level.isEmptyBlock(pos.east())) {
            rx = (double)pos.getX() + 0.875D + offset;
        }

        if (side == Direction.EAST && level.isEmptyBlock(pos.west())) {
            rx = (double)pos.getX() + 0.125D - offset;
        }

        if (rx < (double)pos.getX() + 0.125D || rx > (double)pos.getX() + 0.875D || ry < (double)pos.getY() || ry > (double)(pos.getY() + 1) || rz < (double)pos.getZ() + 0.125D || rz > (double)pos.getZ() + 0.875D) {
            level.addParticle(TFParticleType.LEAF_RUNE.get(), rx, ry, rz, 0.0D, 0.0D, 0.0D);
        }
    }
}
