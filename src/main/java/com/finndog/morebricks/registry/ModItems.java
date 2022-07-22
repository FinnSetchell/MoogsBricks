package com.finndog.morebricks.registry;

import com.finndog.morebricks.MoreBricks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    //public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //Block Items
    public static final BlockItem COBBLESTONE_BRICKS = new BlockItem(ModBlocks.COBBLESTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ANDESITE_BRICKS = new BlockItem(ModBlocks.ANDESITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DIORITE_BRICKS = new BlockItem(ModBlocks.DIORITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem GRANITE_BRICKS = new BlockItem(ModBlocks.GRANITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CALCITE_BRICKS = new BlockItem(ModBlocks.CALCITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DRIPSTONE_BRICKS = new BlockItem(ModBlocks.DRIPSTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BASALT_BRICKS = new BlockItem(ModBlocks.BASALT_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TUFF_BRICKS = new BlockItem(ModBlocks.TUFF_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem SMOOTH_STONE_BRICKS = new BlockItem(ModBlocks.SMOOTH_STONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        //Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "cobblestone_bricks"), COBBLESTONE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "andesite_bricks"), ANDESITE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "diorite_bricks"), DIORITE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "granite_bricks"), GRANITE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "calcite_bricks"), CALCITE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "dripstone_bricks"), DRIPSTONE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "basalt_bricks"), BASALT_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "tuff_bricks"), TUFF_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(MoreBricks.MOD_ID, "smooth_stone_bricks"), SMOOTH_STONE_BRICKS);
    }

}
