package org.oakbricks.example;

import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {

	private static Logger LOGGER = new LogManager("Example Mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric World!")
	}
}
