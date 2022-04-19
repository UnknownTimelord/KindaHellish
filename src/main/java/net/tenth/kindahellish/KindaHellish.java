package net.tenth.kindahellish;

import net.fabricmc.api.ModInitializer;
import net.tenth.kindahellish.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KindaHellish implements ModInitializer {
	public static final String MOD_ID = "kindahellish";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
