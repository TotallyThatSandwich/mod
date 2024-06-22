package net.quiltmc.users.thatsandwich.castlemod;

import net.quiltmc.users.thatsandwich.castlemod.block.ModBlocks;
import net.quiltmc.users.thatsandwich.castlemod.item.ModItemGroups;
import net.quiltmc.users.thatsandwich.castlemod.item.ModItems;
import net.quiltmc.users.thatsandwich.castlemod.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Castlemod implements ModInitializer {
	public static final String MOD_ID = "castlemod";
    public static final Logger LOGGER = LoggerFactory.getLogger("castle mod");



    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
		ModItemGroups.registerItemGroups();
		ModBlocks.RegisterModBlocks();
    }
}
