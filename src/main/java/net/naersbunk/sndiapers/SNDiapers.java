package net.naersbunk.sndiapers;

import net.fabricmc.api.ModInitializer;

import net.naersbunk.sndiapers.block.ModBlocks;
import net.naersbunk.sndiapers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SNDiapers implements ModInitializer {
	public static final String MOD_ID = "sndiapers";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}