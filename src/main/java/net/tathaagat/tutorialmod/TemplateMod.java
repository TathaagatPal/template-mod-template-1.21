package net.tathaagat.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.tathaagat.tutorialmod.block.ModBlocks;
import net.tathaagat.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "templatemod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}