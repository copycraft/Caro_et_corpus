package org.copycraftDev.caro_et_corpus;

import net.fabricmc.api.ModInitializer;
import org.copycraftDev.caro_et_corpus.blocks.ModBlocks;
import org.copycraftDev.caro_et_corpus.item.ModItems;

public class Caro_et_corpus implements ModInitializer {
    public static final String MOD_ID = "caro_et_corpus";

    @Override
    public void onInitialize() {
        // Register blocks and items
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
