package net.quiltmc.users.thatsandwich.castlemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.quiltmc.users.thatsandwich.castlemod.Castlemod;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	public static final Block CASTLE_BRICK = registerBlock("castle_brick",
		new Block(QuiltBlockSettings.create()));
	public static final Block CRACKED_CASTLE_BRICK = registerBlock("cracked_castle_brick",
		new Block(QuiltBlockSettings.create()));
	public static final Block CHISELED_CASTLE_BRICK = registerBlock("chiseled_castle_brick",
		new Block(QuiltBlockSettings.create()));

	public static final Block BLOOD_LOG = registerBlock("blood_log",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.OAK_LOG).strength(3f)));
	public static final Block BLOOD_WOOD = registerBlock("blood_wood",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.OAK_WOOD).strength(3f)));
	public static final Block STRIPPED_BLOOD_LOG = registerBlock("stripped_blood_log",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(3f)));
	public static final Block STRIPPED_BLOOD_WOOD = registerBlock("stripped_blood_wood",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

	public static final Block BLOOD_PLANKS = registerBlock("blood_planks",
		new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f)));

	public static final Block BLOOD_BOOKSHELF = registerBlock("blood_bookshelf",
		new Block(QuiltBlockSettings.create()));

	public static final Block BLOOD_SLAB = registerBlock("blood_slab",
		new SlabBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f)));

	public static final Block BLOOD_DOOR = registerBlock("blood_door",
		new DoorBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f), BlockSetType.OAK));
	public static final Block BLOOD_TRAPDOOR = registerBlock("blood_trapdoor",
		new TrapdoorBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f), BlockSetType.OAK));

	public static final Block BLOOD_BUTTON = registerBlock("blood_button",
		new AbstractButtonBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f), BlockSetType.OAK, 15, true));

	public static final Block BLOOD_STAIRS = registerBlock("blood_stairs",
		new StairsBlock(ModBlocks.BLOOD_PLANKS.getDefaultState(), QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block BLOOD_PRESSURE_PLATE = registerBlock("blood_pressure_plate",
		new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(3f), BlockSetType.OAK));

	public static final Block BLOOD_FENCE = registerBlock("blood_fence",
		new FenceBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block BLOOD_FENCE_GATE = registerBlock("blood_fence_gate",
		new FenceGateBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS), SignType.OAK));

	public static final Block CASTLE_BRICK_WALL = registerBlock("castle_brick_wall",
		new WallBlock(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	private static void addBlocksToBuildingBlocksItemGroup(FabricItemGroupEntries group) {

	}

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(Castlemod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(Castlemod.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
	}

	public static void RegisterModBlocks() {
		Castlemod.LOGGER.info("Registering Mod Blocks for" + Castlemod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuildingBlocksItemGroup);
	}

}
