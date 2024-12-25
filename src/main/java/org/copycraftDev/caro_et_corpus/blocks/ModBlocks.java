package org.copycraftDev.caro_et_corpus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.copycraftDev.caro_et_corpus.Caro_et_corpus;

public class ModBlocks {
    public static final Block FLESH_BLOCK = new Block(Block.Settings.of(Material.ORGANIC_PRODUCT)
            .strength(1.0f, 2.0f)
            .sounds(BlockSoundGroup.HONEY));

    public static final Block ROTTEN_FLESH_BLOCK = new Block(Block.Settings.of(Material.ORGANIC_PRODUCT)
            .strength(1.0f, 2.0f)
            .sounds(BlockSoundGroup.HONEY));

    public static final Block HEART_BLOCK = new Block(Block.Settings.of(Material.ORGANIC_PRODUCT)
            .strength(1.0f, 2.0f)
            .sounds(BlockSoundGroup.HONEY));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Caro_et_corpus.MOD_ID, "flesh_block"), FLESH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Caro_et_corpus.MOD_ID, "rotting_flesh_block"), ROTTEN_FLESH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Caro_et_corpus.MOD_ID, "heart_block"), HEART_BLOCK);
    }
}
