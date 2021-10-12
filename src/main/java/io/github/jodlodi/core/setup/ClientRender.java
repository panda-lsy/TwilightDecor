package io.github.jodlodi.core.setup;

import io.github.jodlodi.core.*;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import twilightforest.block.TFBlocks;

public class ClientRender {
    public static void regRenderLayers(){
        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_TWILIGHT_OAK_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.TWILIGHT_OAK_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.TWILIGHT_OAK_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.TWILIGHT_OAK_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.TWILIGHT_OAK_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.RAINBOAK_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.RAINBOAK_HEDGE.get(), RenderType.cutoutMipped());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_CANOPY_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.CANOPY_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.CANOPY_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.CANOPY_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.CANOPY_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_MANGROVE_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.MANGROVE_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.MANGROVE_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.MANGROVE_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.MANGROVE_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_DARKWOOD_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.DARKWOOD_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.DARKWOOD_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.DARKWOOD_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.DARKWOOD_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_TIMEWOOD_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.TIMEWOOD_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.TIMEWOOD_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.TIMEWOOD_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.TIMEWOOD_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_TRANSFORMATION_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.TRANSFORMATION_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.TRANSFORMATION_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.TRANSFORMATION_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.TRANSFORMATION_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_MINING_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.MINING_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.MINING_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.MINING_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.MINING_LADDER.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(DecorReg.STRIPPED_SORTING_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.SORTING_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(DecorReg.SORTING_LEAF_CARPET.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.SORTING_HEDGE.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(DecorReg.SORTING_LADDER.get(), RenderType.cutout());
    }

    public static void registerBlockColors() {
        BlockColors blockcolors = Minecraft.getInstance().getBlockColors();
        ItemColors itemcolors = Minecraft.getInstance().getItemColors();

        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.oak_leaves.get().defaultBlockState(), level, pos, tintIndex),              DecorReg.TWILIGHT_OAK_HEDGE.get(),      DecorReg.TWILIGHT_OAK_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.rainboak_leaves.get().defaultBlockState(), level, pos, tintIndex),         DecorReg.RAINBOAK_HEDGE.get(),          DecorReg.RAINBOAK_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.canopy_leaves.get().defaultBlockState(), level, pos, tintIndex),           DecorReg.CANOPY_HEDGE.get(),            DecorReg.CANOPY_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.mangrove_leaves.get().defaultBlockState(), level, pos, tintIndex),         DecorReg.MANGROVE_HEDGE.get(),          DecorReg.MANGROVE_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.dark_leaves.get().defaultBlockState(), level, pos, tintIndex),             DecorReg.DARKWOOD_HEDGE.get(),          DecorReg.DARKWOOD_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.time_leaves.get().defaultBlockState(), level, pos, tintIndex),             DecorReg.TIMEWOOD_HEDGE.get(),          DecorReg.TIMEWOOD_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.transformation_leaves.get().defaultBlockState(), level, pos, tintIndex),   DecorReg.TRANSFORMATION_HEDGE.get(),    DecorReg.TRANSFORMATION_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.mining_leaves.get().defaultBlockState(), level, pos, tintIndex),           DecorReg.MINING_HEDGE.get(),            DecorReg.MINING_LEAF_CARPET.get());
        blockcolors.register((state, level, pos, tintIndex) -> blockcolors.getColor(TFBlocks.sorting_leaves.get().defaultBlockState(), level, pos, tintIndex),          DecorReg.SORTING_HEDGE.get(),           DecorReg.SORTING_LEAF_CARPET.get());

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
