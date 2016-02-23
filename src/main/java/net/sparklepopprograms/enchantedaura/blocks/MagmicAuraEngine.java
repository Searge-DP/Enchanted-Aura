package net.sparklepopprograms.enchantedaura.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.sparklepopprograms.core.api.energy.BaseEnergyStorageBlock;
import net.sparklepopprograms.enchantedaura.tileentitys.TileAuraBuffer;
import net.sparklepopprograms.enchantedaura.tileentitys.TileMagmicAuraEngine;
import net.sparklepopprograms.enchantedaura.util.EnchantedAuraTab;

public class MagmicAuraEngine extends BlockContainer {

	public MagmicAuraEngine() {
		super(Material.iron);
		this.setBlockName("MagmicAuraEngine");
		this.setCreativeTab(EnchantedAuraTab.tab);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileMagmicAuraEngine();
	}

}
