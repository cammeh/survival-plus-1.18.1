package com.cammeh.survivalplus;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SurvivalPlus implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
