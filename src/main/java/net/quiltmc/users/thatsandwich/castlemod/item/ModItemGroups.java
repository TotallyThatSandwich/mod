package net.quiltmc.users.thatsandwich.castlemod.item;

import com.ibm.icu.text.DisplayContext;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.quiltmc.users.thatsandwich.castlemod.Castlemod;
import net.quiltmc.users.thatsandwich.castlemod.block.ModBlocks;

public class ModItemGroups {

	public static final ItemGroup CASTLE_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier(Castlemod.MOD_ID, "castle"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.castle"))
			.icon(() -> new ItemStack(ModBlocks.CASTLE_BRICK.asItem())).entries((DisplayContext, entries) -> {
				entries.addItem(ModBlocks.CASTLE_BRICK.asItem());
				entries.addItem(ModBlocks.CRACKED_CASTLE_BRICK.asItem());
				entries.addItem(ModBlocks.CHISELED_CASTLE_BRICK.asItem());
				entries.addItem(ModBlocks.BLOOD_LOG.asItem());
				entries.addItem(ModBlocks.BLOOD_WOOD.asItem());
				entries.addItem(ModBlocks.STRIPPED_BLOOD_LOG.asItem());
				entries.addItem(ModBlocks.STRIPPED_BLOOD_WOOD.asItem());
				entries.addItem(ModBlocks.BLOOD_PLANKS.asItem());
				entries.addItem(ModBlocks.BLOOD_SLAB.asItem());
				entries.addItem(ModBlocks.BLOOD_DOOR.asItem());
				entries.addItem(ModBlocks.BLOOD_TRAPDOOR.asItem());
				entries.addItem(ModBlocks.BLOOD_BUTTON.asItem());
				entries.addItem(ModBlocks.BLOOD_STAIRS.asItem());
				entries.addItem(ModBlocks.BLOOD_PRESSURE_PLATE.asItem());
				entries.addItem(ModBlocks.BLOOD_FENCE.asItem());
				entries.addItem(ModBlocks.BLOOD_FENCE_GATE.asItem());
				entries.addItem(ModBlocks.CASTLE_BRICK_WALL.asItem());
			}).build());

	public static void registerItemGroups() {
		Castlemod.LOGGER.info("Registering Mod Item Groups for mod "+ Castlemod.MOD_ID);
	}
}
