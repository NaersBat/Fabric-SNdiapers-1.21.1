package net.naersbunk.sndiapers.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.naersbunk.sndiapers.SNDiapers;

public class ModBlocks {
    public static final Block PAIL = registerBlock("pail",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.METAL)));

    public static final Block USED_DIAPER_PILE = registerBlock("used_diaper_pile",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.MUD)));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SNDiapers.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SNDiapers.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SNDiapers.LOGGER.info("Registering mod blocks for " + SNDiapers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY)
                .register(entries -> {
                    entries.add(ModBlocks.PAIL);
                    entries.add(ModBlocks.USED_DIAPER_PILE);
                });
    }
}
