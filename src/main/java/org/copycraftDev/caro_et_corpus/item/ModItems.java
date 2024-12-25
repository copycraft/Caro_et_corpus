package org.copycraftDev.caro_et_corpus.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.copycraftDev.caro_et_corpus.Caro_et_corpus;
import org.copycraftDev.caro_et_corpus.blocks.ModBlocks;

public class ModItems {
    public static final Item FLESH_BLOCK_ITEM = new BlockItem(ModBlocks.FLESH_BLOCK, new Item.Settings());
    public static final Item ROTTEN_FLESH_BLOCK_ITEM = new BlockItem(ModBlocks.ROTTEN_FLESH_BLOCK, new Item.Settings());
    public static final Item HEART_BLOCK_ITEM = new BlockItem(ModBlocks.HEART_BLOCK, new Item.Settings());

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Caro_et_corpus.MOD_ID, "flesh_block"), FLESH_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Caro_et_corpus.MOD_ID, "rotten_flesh_block"), ROTTEN_FLESH_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Caro_et_corpus.MOD_ID, "heart_block"), HEART_BLOCK_ITEM);
    }
}
