package io.github.jodlodi.twilightdecor;

import com.google.common.collect.ImmutableMap;
import com.teamabnormals.blueprint.common.block.*;
import com.teamabnormals.blueprint.common.block.wood.WoodPostBlock;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import io.github.jodlodi.twilightdecor.types.Experiment115Pie;
import io.github.jodlodi.twilightdecor.types.MagicCarpet;
import io.github.jodlodi.twilightdecor.types.MagicHedge;
import io.github.jodlodi.twilightdecor.types.WoodTypes;
import lilypuree.decorative_blocks.Constants;
import lilypuree.decorative_blocks.blocks.BeamBlock;
import lilypuree.decorative_blocks.blocks.PalisadeBlock;
import lilypuree.decorative_blocks.blocks.SeatBlock;
import lilypuree.decorative_blocks.blocks.SupportBlock;
import lilypuree.decorative_blocks.blocks.types.IWoodType;
import lilypuree.decorative_blocks.blocks.types.WoodDecorativeBlockTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.block.TFBlocks;

@Mod.EventBusSubscriber(modid = TwilightDecor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DecorReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TwilightDecor.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TwilightDecor.MOD_ID);
    public static final BlockSubRegistryHelper HELPER = TwilightDecor.REGISTRY_HELPER.getBlockSubHelper();
    public static final ItemSubRegistryHelper ITEMER = TwilightDecor.REGISTRY_HELPER.getItemSubHelper();

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
    }
    public static final Item.Properties modItemProperties = new Item.Properties().tab(Constants.ITEM_GROUP);
    
    public static final RegistryObject<Item> EXPERIMENT_115_PIE = ITEMER.createCompatItem("farmersdelight", "experiment_115_pie", new Experiment115Pie.Properties().stacksTo(1), CreativeModeTab.TAB_FOOD);

    public static BlockBehaviour.Properties LEAF_CARPET_PROP = BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_GREEN).strength(0.0F).sound(SoundType.GRASS).noOcclusion();

    public static final RegistryObject<Block> VERTICAL_TWILIGHT_OAK_PLANKS = HELPER.createCompatBlock("quark", "vertical_twilight_oak_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TWILIGHT_OAK_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "twilight_oak_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TWILIGHT_OAK_LADDER = HELPER.createCompatFuelBlock("quark", "twilight_oak_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> TWILIGHT_OAK_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "twilight_oak_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TWILIGHT_OAK_LEAF_CARPET = HELPER.createCompatBlock("quark", "twilight_oak_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_TWILIGHT_OAK_POST = HELPER.createCompatFuelBlock("quark", "stripped_twilight_oak_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TWILIGHT_OAK_POST = HELPER.createCompatFuelBlock("quark", "twilight_oak_post", () -> new WoodPostBlock(STRIPPED_TWILIGHT_OAK_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TWILIGHT_OAK_HEDGE = HELPER.createCompatFuelBlock("quark", "twilight_oak_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> TWILIGHT_OAK_BOAT = ITEMER.createBoatItem("twilight_oak", TFBlocks.TWILIGHT_OAK_PLANKS);

    public static final RegistryObject<Block> RAINBOAK_LEAF_CARPET = HELPER.createCompatBlock("quark", "rainboak_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOAK_HEDGE = HELPER.createCompatFuelBlock("quark", "rainboak_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> VERTICAL_CANOPY_PLANKS = HELPER.createCompatBlock("quark", "vertical_canopy_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CANOPY_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "canopy_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CANOPY_LADDER = HELPER.createCompatFuelBlock("quark", "canopy_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> CANOPY_LEAF_CARPET = HELPER.createCompatBlock("quark", "canopy_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_CANOPY_POST = HELPER.createCompatFuelBlock("quark", "stripped_canopy_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CANOPY_POST = HELPER.createCompatFuelBlock("quark", "canopy_post", () -> new WoodPostBlock(STRIPPED_CANOPY_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CANOPY_HEDGE = HELPER.createCompatFuelBlock("quark", "canopy_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> CANOPY_BOAT = ITEMER.createBoatItem("canopy", TFBlocks.CANOPY_PLANKS);

    public static final RegistryObject<Block> VERTICAL_MANGROVE_PLANKS = HELPER.createCompatBlock("quark", "vertical_mangrove_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANGROVE_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "mangrove_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANGROVE_LADDER = HELPER.createCompatFuelBlock("quark", "mangrove_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MANGROVE_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "mangrove_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANGROVE_LEAF_CARPET = HELPER.createCompatBlock("quark", "mangrove_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_POST = HELPER.createCompatFuelBlock("quark", "stripped_mangrove_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANGROVE_POST = HELPER.createCompatFuelBlock("quark", "mangrove_post", () -> new WoodPostBlock(STRIPPED_MANGROVE_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MANGROVE_HEDGE = HELPER.createCompatFuelBlock("quark", "mangrove_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> MANGROVE_BOAT = ITEMER.createBoatItem("mangrove", TFBlocks.MANGROVE_PLANKS);

    public static final RegistryObject<Block> VERTICAL_DARKWOOD_PLANKS = HELPER.createCompatBlock("quark", "vertical_darkwood_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARKWOOD_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "darkwood_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARKWOOD_LADDER = HELPER.createCompatFuelBlock("quark", "darkwood_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> DARKWOOD_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "darkwood_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARKWOOD_LEAF_CARPET = HELPER.createCompatBlock("quark", "darkwood_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_DARKWOOD_POST = HELPER.createCompatFuelBlock("quark", "stripped_darkwood_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARKWOOD_POST = HELPER.createCompatFuelBlock("quark", "darkwood_post", () -> new WoodPostBlock(STRIPPED_DARKWOOD_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DARKWOOD_HEDGE = HELPER.createCompatFuelBlock("quark", "darkwood_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> DARKWOOD_BOAT = ITEMER.createBoatItem("darkwood", TFBlocks.DARK_PLANKS);

    public static final RegistryObject<Block> VERTICAL_TIMEWOOD_PLANKS = HELPER.createCompatBlock("quark", "vertical_timewood_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMEWOOD_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "timewood_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMEWOOD_LADDER = HELPER.createCompatFuelBlock("quark", "timewood_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> TIMEWOOD_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "timewood_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMEWOOD_LEAF_CARPET = HELPER.createCompatBlock("quark", "timewood_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_TIMEWOOD_POST = HELPER.createCompatFuelBlock("quark", "stripped_timewood_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMEWOOD_POST = HELPER.createCompatFuelBlock("quark", "timewood_post", () -> new WoodPostBlock(STRIPPED_TIMEWOOD_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TIMEWOOD_HEDGE = HELPER.createCompatFuelBlock("quark", "timewood_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> TIMEWOOD_BOAT = ITEMER.createBoatItem("timewood", TFBlocks.TIME_PLANKS);

    public static final RegistryObject<Block> VERTICAL_TRANSFORMATION_PLANKS = HELPER.createCompatBlock("quark", "vertical_transformation_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TRANSFORMATION_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "transformation_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TRANSFORMATION_LADDER = HELPER.createCompatFuelBlock("quark", "transformation_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> TRANSFORMATION_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "transformation_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TRANSFORMATION_LEAF_CARPET = HELPER.createCompatBlock("quark", "transformation_leaf_carpet", () -> new MagicCarpet(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_TRANSFORMATION_POST = HELPER.createCompatFuelBlock("quark", "stripped_transformation_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TRANSFORMATION_POST = HELPER.createCompatFuelBlock("quark", "transformation_post", () -> new WoodPostBlock(STRIPPED_TRANSFORMATION_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TRANSFORMATION_HEDGE = HELPER.createCompatFuelBlock("quark", "transformation_hedge", () -> new MagicHedge(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> TRANSFORMATION_BOAT = ITEMER.createBoatItem("transformation", TFBlocks.TRANSFORMATION_PLANKS);

    public static final RegistryObject<Block> VERTICAL_MINING_PLANKS = HELPER.createCompatBlock("quark", "vertical_mining_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MINING_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "mining_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MINING_LADDER = HELPER.createCompatFuelBlock("quark", "mining_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MINING_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "mining_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MINING_LEAF_CARPET = HELPER.createCompatBlock("quark", "mining_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_MINING_POST = HELPER.createCompatFuelBlock("quark", "stripped_mining_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MINING_POST = HELPER.createCompatFuelBlock("quark", "mining_post", () -> new WoodPostBlock(STRIPPED_MINING_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MINING_HEDGE = HELPER.createCompatFuelBlock("quark", "mining_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> MINING_BOAT = ITEMER.createBoatItem("mining", TFBlocks.MINING_PLANKS);

    public static final RegistryObject<Block> VERTICAL_SORTING_PLANKS = HELPER.createCompatBlock("quark", "vertical_sorting_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SORTING_VERTICAL_SLAB = HELPER.createCompatFuelBlock("quark", "sorting_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SORTING_LADDER = HELPER.createCompatFuelBlock("quark", "sorting_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SORTING_BOOKSHELF = HELPER.createCompatFuelBlock("quark", "sorting_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SORTING_LEAF_CARPET = HELPER.createCompatBlock("quark", "sorting_leaf_carpet", () -> new LeafCarpetBlock(LEAF_CARPET_PROP), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_SORTING_POST = HELPER.createCompatFuelBlock("quark", "stripped_sorting_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SORTING_POST = HELPER.createCompatFuelBlock("quark", "sorting_post", () -> new WoodPostBlock(STRIPPED_SORTING_POST, BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SORTING_HEDGE = HELPER.createCompatFuelBlock("quark", "sorting_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Item> SORTING_BOAT = ITEMER.createBoatItem("sorting", TFBlocks.SORTING_PLANKS);

    public static ImmutableMap<String, RegistryObject<Block>> decorWoodBlocks;
    public static ImmutableMap<String, RegistryObject<Item>> decorWoodItems;

    static {
        ImmutableMap.Builder<String, RegistryObject<Block>> decorativeBlockBuilder = ImmutableMap.builder();
        ImmutableMap.Builder<String, RegistryObject<Item>> itemBuilder = ImmutableMap.builder();


        for (WoodDecorativeBlockTypes type : WoodDecorativeBlockTypes.values()) {
            for (IWoodType wood : WoodTypes.allWoodTypes()) {
                String name = wood + "_" + type;
                decorativeBlockBuilder.put(name, BLOCKS.register(name, () -> createDecorativeBlock(wood, type)));
            }
        }
        decorWoodBlocks = decorativeBlockBuilder.build();

        for (WoodDecorativeBlockTypes type : WoodDecorativeBlockTypes.values()) {
            for (IWoodType wood : WoodTypes.allWoodTypes()) {
                String name = wood + "_" + type;

                itemBuilder.put(name, ITEMS.register(name, () ->
                        new BlockItem(decorWoodBlocks.get(name).get(), modItemProperties)));
            }
        }
        decorWoodItems = itemBuilder.build();
    }

    private static Block createDecorativeBlock(IWoodType wood, WoodDecorativeBlockTypes woodDecorativeBlockType) {
        Block.Properties woodProperty = BlockBehaviour.Properties.of(wood.getMaterial(), wood.getMaterialColor()).strength(1.2F).sound(wood.getSoundType());
        Block.Properties palisadeProperty = BlockBehaviour.Properties.of(wood.getMaterial(), wood.getMaterialColor()).strength(2.0F, 4.0F).sound(wood.getSoundType());

        return switch (woodDecorativeBlockType) {
            case BEAM -> new BeamBlock(woodProperty, wood);
            case SUPPORT -> new SupportBlock(woodProperty, wood);
            case PALISADE -> new PalisadeBlock(palisadeProperty, wood);
            case SEAT -> new SeatBlock(woodProperty, wood);
        };
    }
}