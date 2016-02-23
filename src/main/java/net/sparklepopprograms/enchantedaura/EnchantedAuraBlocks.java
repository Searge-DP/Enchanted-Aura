package net.sparklepopprograms.enchantedaura;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.sparklepopprograms.core.util.LogHelper;
import net.sparklepopprograms.enchantedaura.blocks.*;
import net.sparklepopprograms.enchantedaura.tileentitys.*;

public class EnchantedAuraBlocks {
	
	public static Block AuraStorageBuffer;
	public static Block MagmicAuraEngine;

	public static void RegisterBlocks() {
		
		AuraStorageBuffer = new AuraStorageBuffer();
		MagmicAuraEngine = new MagmicAuraEngine();
		
		GameRegistry.registerBlock(AuraStorageBuffer, "AuraBuffer");
		GameRegistry.registerBlock(MagmicAuraEngine, "MagmicAuraEngine");
		
		GameRegistry.registerTileEntity(TileAuraBuffer.class, "TileAuraBuffer");
		GameRegistry.registerTileEntity(TileMagmicAuraEngine.class, "TileMagmicAuraEngine");
		
		
		LogHelper.info("Registered Blocks", EnchantedAura.modid);
	}

}
