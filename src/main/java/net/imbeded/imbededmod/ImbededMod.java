package net.imbeded.imbededmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImbededMod implements ModInitializer {
	public static final String Mod_ID = "imbededmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("imbededmod");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}