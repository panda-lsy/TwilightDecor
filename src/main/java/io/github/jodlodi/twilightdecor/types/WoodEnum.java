package io.github.jodlodi.twilightdecor.types;

import lilypuree.decorative_blocks.blocks.types.IWoodType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import twilightforest.TwilightForestMod;
import twilightforest.block.TFBlocks;

public enum WoodEnum implements IWoodType {
    TWILIGHT_OAK("twilight_oak") {
        public Block getLog(){ return TFBlocks.TWILIGHT_OAK_LOG.get();}
        public Block getStrippedLog(){return TFBlocks.STRIPPED_TWILIGHT_OAK_LOG.get();}
        public Block getSlab(){ return TFBlocks.TWILIGHT_OAK_SLAB.get();}
        public Block getFence() { return TFBlocks.TWILIGHT_OAK_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.TWILIGHT_OAK_PLANKS.get(); }
    },
    CANOPY("canopy") {
        public Block getLog() { return TFBlocks.CANOPY_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_CANOPY_LOG.get(); }
        public Block getSlab() { return TFBlocks.CANOPY_SLAB.get(); }
        public Block getFence() { return TFBlocks.CANOPY_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.CANOPY_PLANKS.get(); }
    },
    MANGROVE("mangrove") {
        public Block getLog() { return TFBlocks.MANGROVE_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_MANGROVE_LOG.get(); }
        public Block getSlab() { return TFBlocks.MANGROVE_SLAB.get(); }
        public Block getFence() { return TFBlocks.MANGROVE_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.MANGROVE_PLANKS.get(); }
    },
    DARKWOOD("darkwood") {
        public Block getLog() { return TFBlocks.DARK_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_DARK_LOG.get(); }
        public Block getSlab() { return TFBlocks.DARK_SLAB.get(); }
        public Block getFence() { return TFBlocks.DARK_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.DARK_PLANKS.get(); }
    },
    TIMEWOOD("timewood") {
        public Block getLog() { return TFBlocks.TIME_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_TIME_LOG.get(); }
        public Block getSlab() { return TFBlocks.TIME_SLAB.get(); }
        public Block getFence() { return TFBlocks.TIME_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.TIME_PLANKS.get(); }
    },
    TRANSFORMATION("transformation") {
        public Block getLog() { return TFBlocks.TRANSFORMATION_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_TRANSFORMATION_LOG.get(); }
        public Block getSlab() { return TFBlocks.TRANSFORMATION_SLAB.get(); }
        public Block getFence() { return TFBlocks.TRANSFORMATION_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.TRANSFORMATION_PLANKS.get(); }
    },
    MINING("mining") {
        public Block getLog() { return TFBlocks.MINING_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_MINING_LOG.get(); }
        public Block getSlab() { return TFBlocks.MINING_SLAB.get(); }
        public Block getFence() { return TFBlocks.MINING_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.MINING_PLANKS.get(); }
    },
    SORTING("sorting") {
        public Block getLog() { return TFBlocks.SORTING_LOG.get(); }
        public Block getStrippedLog() { return TFBlocks.STRIPPED_SORTING_LOG.get(); }
        public Block getSlab() { return TFBlocks.SORTING_SLAB.get(); }
        public Block getFence() { return TFBlocks.SORTING_FENCE.get(); }
        public Block getPlanks() { return TFBlocks.SORTING_PLANKS.get(); }
    };
    private final String name;
    WoodEnum(String name) { this.name = name; }
    public String namespace() { return TwilightForestMod.ID; }
    public String toString() { return getName(); }
    public Block getLog() { return null; }
    public Block getStrippedLog() { return null; }
    public Block getSlab() { return null; }
    public Block getFence() { return null; }
    public Block getPlanks() { return null; }
    public String getName() { return this.name; }
    public boolean isAvailable() { return ModList.get().isLoaded("twilightforest"); }
    public boolean isFlammable() { return true; }
}