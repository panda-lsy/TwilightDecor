package io.github.jodlodi.core.types;

import com.minecraftabnormals.abnormals_core.common.blocks.LeafCarpetBlock;
import net.minecraft.block.BlockState;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import twilightforest.client.particle.TFParticleType;

import java.util.Random;

public class MagicCarpet extends LeafCarpetBlock {

    public MagicCarpet(Properties properties) { super(properties); }

    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        this.carpetSparkleRunes(world, pos, random);
    }

    private void carpetSparkleRunes(World world, BlockPos pos, Random rand) {
        Direction side = Direction.getRandom(rand);
        double rx = (double)((float)pos.getX() + rand.nextFloat());
        double ry;
        double rz = (double)((float)pos.getZ() + rand.nextFloat());

        if (side == Direction.DOWN) {
            ry = (double)(pos.getY()) + 0.125D;
            world.addParticle((IParticleData) TFParticleType.LEAF_RUNE.get(), rx, ry, rz, 0.0D, 0.0D, 0.0D);
        }
    }
}
