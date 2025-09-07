package com.hardcoresuffering;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

@Mod(HardcoreSufferingMod.MODID)
public class HardcoreSufferingMod {
    public static final String MODID = "hardcoresuffering";
    private static final Logger LOGGER = LogManager.getLogger();

    public HardcoreSufferingMod() {
        LOGGER.info("Hardcore Suffering mod initialized");
    }
}
