package io.github.jodlodi.core.types;

import com.minecraftabnormals.abnormals_core.common.blocks.HedgeBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import twilightforest.client.particle.TFParticleType;

import java.util.Random;

public class MagicHedge extends HedgeBlock {

    public MagicHedge(Properties properties) { super(properties); }

    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        this.hedgeSparkleRunes(world, pos, random);
    }

    private void hedgeSparkleRunes(World world, BlockPos pos, Random rand) {
        double offset = 0.0625D;
        Direction side = Direction.getRandom(rand);
        double rx = ((float)pos.getX() + rand.nextFloat() * 0.75D);
        double ry = ((float)pos.getY() + rand.nextFloat());
        double rz = ((float)pos.getZ() + rand.nextFloat() * 0.75D);
        if (side == Direction.DOWN && world.isEmptyBlock(pos.above())) {
            ry = (double)(pos.getY() + 1) + offset;
        }

        if (side == Direction.UP && world.isEmptyBlock(pos.below())) {
            ry = (double)pos.getY() - offset;
        }

        if (side == Direction.NORTH && world.isEmptyBlock(pos.south())) {
            rz = (double)pos.getZ() + 0.875D + offset;
        }

        if (side == Direction.SOUTH && world.isEmptyBlock(pos.north())) {
            rz = (double)pos.getZ() + 0.125D - offset;
        }

        if (side == Direction.WEST && world.isEmptyBlock(pos.east())) {
            rx = (double)pos.getX() + 0.875D + offset;
        }

        if (side == Direction.EAST && world.isEmptyBlock(pos.west())) {
            rx = (double)pos.getX() + 0.125D - offset;
        }

        if (rx < (double)pos.getX() + 0.125D || rx > (double)pos.getX() + 0.875D || ry < (double)pos.getY() || ry > (double)(pos.getY() + 1) || rz < (double)pos.getZ() + 0.125D || rz > (double)pos.getZ() + 0.875D) {
            world.addParticle(TFParticleType.LEAF_RUNE.get(), rx, ry, rz, 0.0D, 0.0D, 0.0D);
        }
    }
}
