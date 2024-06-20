package net.zuredragon.templatemod;

import net.zuredragon.templatemod.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.zuredragon.templatemod.item.ModItemGroups;
import net.zuredragon.templatemod.item.ModItems;
import net.zuredragon.templatemod.util.ModLootTableModifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "templatemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifier.modifyLootTables();
	}
}