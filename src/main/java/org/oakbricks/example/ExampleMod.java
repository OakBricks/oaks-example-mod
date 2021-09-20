package org.oakbricks.example;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMod implements ModInitializer {

	private static Logger LOGGER = LogManager.getLogger("Example Mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric World!");
	}
}
