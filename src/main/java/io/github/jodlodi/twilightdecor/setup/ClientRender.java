package io.github.jodlodi.twilightdecor.setup;

import io.github.jodlodi.twilightdecor.DecorReg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.state.BlockState;
import twilightforest.block.TFBlocks;

public class ClientRender {
    public static void regRenderLayers(){
        RenderType cutout = RenderType.cutout();
        RenderType cutoutMipped = RenderType.cutoutMipped();
        
        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_TWILIGHT_OAK_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TWILIGHT_OAK_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TWILIGHT_OAK_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TWILIGHT_OAK_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TWILIGHT_OAK_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.RAINBOAK_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.RAINBOAK_HEDGE.get(), cutoutMipped);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_CANOPY_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.CANOPY_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.CANOPY_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.CANOPY_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.CANOPY_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_MANGROVE_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MANGROVE_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MANGROVE_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MANGROVE_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MANGROVE_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_DARKWOOD_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.DARKWOOD_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.DARKWOOD_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.DARKWOOD_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.DARKWOOD_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_TIMEWOOD_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TIMEWOOD_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TIMEWOOD_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TIMEWOOD_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TIMEWOOD_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_TRANSFORMATION_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TRANSFORMATION_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TRANSFORMATION_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TRANSFORMATION_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.TRANSFORMATION_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_MINING_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MINING_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MINING_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MINING_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.MINING_LADDER.get(), cutout);

        ItemBlockRenderTypes.setRenderLayer(DecorReg.STRIPPED_SORTING_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.SORTING_POST.get(), cutout);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.SORTING_LEAF_CARPET.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.SORTING_HEDGE.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(DecorReg.SORTING_LADDER.get(), cutout);
    }

    public static void registerBlockColors() {
        BlockColors blockcolors = Minecraft.getInstance().getBlockColors();
        ItemColors itemcolors = Minecraft.getInstance().getItemColors();

        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.TWILIGHT_OAK_LEAVES.get().defaultBlockState(), level, pos, tintIndex),              DecorReg.TWILIGHT_OAK_HEDGE.get(),      DecorReg.TWILIGHT_OAK_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.RAINBOW_OAK_LEAVES.get().defaultBlockState(), level, pos, tintIndex),         DecorReg.RAINBOAK_HEDGE.get(),          DecorReg.RAINBOAK_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.CANOPY_LEAVES.get().defaultBlockState(), level, pos, tintIndex),           DecorReg.CANOPY_HEDGE.get(),            DecorReg.CANOPY_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.MANGROVE_LEAVES.get().defaultBlockState(), level, pos, tintIndex),         DecorReg.MANGROVE_HEDGE.get(),          DecorReg.MANGROVE_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.DARK_LEAVES.get().defaultBlockState(), level, pos, tintIndex),             DecorReg.DARKWOOD_HEDGE.get(),          DecorReg.DARKWOOD_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.TIME_LEAVES.get().defaultBlockState(), level, pos, tintIndex),             DecorReg.TIMEWOOD_HEDGE.get(),          DecorReg.TIMEWOOD_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.TRANSFORMATION_LEAVES.get().defaultBlockState(), level, pos, tintIndex),   DecorReg.TRANSFORMATION_HEDGE.get(),    DecorReg.TRANSFORMATION_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.MINING_LEAVES.get().defaultBlockState(), level, pos, tintIndex),           DecorReg.MINING_HEDGE.get(),            DecorReg.MINING_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.SORTING_LEAVES.get().defaultBlockState(), level, pos, tintIndex),          DecorReg.SORTING_HEDGE.get(),           DecorReg.SORTING_LEAF_CARPET.get());

        itemcolors.register((stack, tintIndex) -> {
            BlockState blockstate = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return blockcolors.getColor(blockstate, null, null, tintIndex);
        },      DecorReg.TWILIGHT_OAK_HEDGE.get(),      DecorReg.TWILIGHT_OAK_LEAF_CARPET.get(),
                DecorReg.RAINBOAK_HEDGE.get(),          DecorReg.RAINBOAK_LEAF_CARPET.get(),
                DecorReg.CANOPY_HEDGE.get(),            DecorReg.CANOPY_LEAF_CARPET.get(),
                DecorReg.MANGROVE_HEDGE.get(),          DecorReg.MANGROVE_LEAF_CARPET.get(),
                DecorReg.DARKWOOD_HEDGE.get(),          DecorReg.DARKWOOD_LEAF_CARPET.get(),
                DecorReg.TIMEWOOD_HEDGE.get(),          DecorReg.TIMEWOOD_LEAF_CARPET.get(),
                DecorReg.TRANSFORMATION_HEDGE.get(),    DecorReg.TRANSFORMATION_LEAF_CARPET.get(),
                DecorReg.MINING_HEDGE.get(),            DecorReg.MINING_LEAF_CARPET.get(),
                DecorReg.SORTING_HEDGE.get(),           DecorReg.SORTING_LEAF_CARPET.get());
    }
}
