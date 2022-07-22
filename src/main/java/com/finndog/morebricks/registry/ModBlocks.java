package com.finndog.morebricks.registry;

import com.finndog.morebricks.MoreBricks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block COBBLESTONE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block ANDESITE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block DIORITE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block CALCITE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block DRIPSTONE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block BASALT_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block TUFF_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block SMOOTH_STONE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 30.0f)
            .sounds(BlockSoundGroup.STONE));



    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "cobblestone_bricks"), COBBLESTONE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "andesite_bricks"), ANDESITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "diorite_bricks"), DIORITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "granite_bricks"), GRANITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "calcite_bricks"), CALCITE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "dripstone_bricks"), DRIPSTONE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "basalt_bricks"), BASALT_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "tuff_bricks"), TUFF_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MoreBricks.MOD_ID, "smooth_stone_bricks"), SMOOTH_STONE_BRICKS);
    }
}
