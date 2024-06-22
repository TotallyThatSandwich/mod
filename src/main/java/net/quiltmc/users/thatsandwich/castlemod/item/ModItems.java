package net.quiltmc.users.thatsandwich.castlemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.quiltmc.users.thatsandwich.castlemod.Castlemod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item TEST_ITEM = registerItem("test_item", new Item(new QuiltItemSettings()));

	private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries group) {
		group.addItem(TEST_ITEM);
	}

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Castlemod.MOD_ID, name), item);
	}

	public static void RegisterModItems() {
		Castlemod.LOGGER.info("Registering Mod Blocks for" + Castlemod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
	}

}
