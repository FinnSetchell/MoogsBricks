package com.finndog.morebricks;

import com.finndog.morebricks.registry.ModBlocks;
import com.finndog.morebricks.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class MoreBricks implements ModInitializer{

    public static final String MOD_ID = "bricks";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();


    }
}
