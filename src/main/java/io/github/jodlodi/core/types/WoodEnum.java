package io.github.jodlodi.core.types;

import com.lilypuree.decorative_blocks.datagen.types.IWoodType;
import net.minecraft.block.Block;
import net.minecraftforge.fml.ModList;
import twilightforest.block.TFBlocks;

public enum WoodEnum implements IWoodType {
    TWILIGHT_OAK("twilight_oak") {
        public Block getLog(){ return TFBlocks.oak_log.get();}
        public Block getStrippedLog(){return TFBlocks.stripped_oak_log.get();}
        public Block getSlab(){ return TFBlocks.twilight_oak_slab.get();}
        public Block getFence() { return TFBlocks.twilight_oak_fence.get(); }
        public Block getPlanks() { return TFBlocks.twilight_oak_planks.get(); }
    },
    CANOPY("canopy") {
        public Block getLog() { return TFBlocks.canopy_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_canopy_log.get(); }
        public Block getSlab() { return TFBlocks.canopy_slab.get(); }
        public Block getFence() { return TFBlocks.canopy_fence.get(); }
        public Block getPlanks() { return TFBlocks.canopy_planks.get(); }
    },
    MANGROVE("mangrove") {
        public Block getLog() { return TFBlocks.mangrove_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_mangrove_log.get(); }
        public Block getSlab() { return TFBlocks.mangrove_slab.get(); }
        public Block getFence() { return TFBlocks.mangrove_fence.get(); }
        public Block getPlanks() { return TFBlocks.mangrove_planks.get(); }
    },
    DARKWOOD("darkwood") {
        public Block getLog() { return TFBlocks.dark_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_dark_log.get(); }
        public Block getSlab() { return TFBlocks.dark_slab.get(); }
        public Block getFence() { return TFBlocks.dark_fence.get(); }
        public Block getPlanks() { return TFBlocks.dark_planks.get(); }
    },
    TIMEWOOD("timewood") {
        public Block getLog() { return TFBlocks.time_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_time_log.get(); }
        public Block getSlab() { return TFBlocks.time_slab.get(); }
        public Block getFence() { return TFBlocks.time_fence.get(); }
        public Block getPlanks() { return TFBlocks.time_planks.get(); }
    },
    TRANSFORMATION("transformation") {
        public Block getLog() { return TFBlocks.transformation_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_transformation_log.get(); }
        public Block getSlab() { return TFBlocks.trans_slab.get(); }
        public Block getFence() { return TFBlocks.trans_fence.get(); }
        public Block getPlanks() { return TFBlocks.trans_planks.get(); }
    },
    MINING("mining") {
        public Block getLog() { return TFBlocks.mining_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_mining_log.get(); }
        public Block getSlab() { return TFBlocks.mine_slab.get(); }
        public Block getFence() { return TFBlocks.mine_fence.get(); }
        public Block getPlanks() { return TFBlocks.mine_planks.get(); }
    },
    SORTING("sorting") {
        public Block getLog() { return TFBlocks.sorting_log.get(); }
        public Block getStrippedLog() { return TFBlocks.stripped_sorting_log.get(); }
        public Block getSlab() { return TFBlocks.sort_slab.get(); }
        public Block getFence() { return TFBlocks.sort_fence.get(); }
        public Block getPlanks() { return TFBlocks.sort_planks.get(); }
    };
    private final String name;
    WoodEnum(String name) { this.name = name; }
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