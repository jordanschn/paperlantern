package com.jordan.paperlantern.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static PaperLantern paperLantern = new PaperLantern();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				paperLantern
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				paperLantern.createItemBlock()
		);
	}

	public static void registerModels() {
		paperLantern.registerItemModel(Item.getItemFromBlock(paperLantern));
	}
}
