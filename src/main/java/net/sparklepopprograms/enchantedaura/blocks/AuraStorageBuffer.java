package net.sparklepopprograms.enchantedaura.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.sparklepopprograms.core.api.energy.BaseEnergyStorageBlock;
import net.sparklepopprograms.enchantedaura.EnchantedAura;
import net.sparklepopprograms.enchantedaura.tileentitys.TileAuraBuffer;
import net.sparklepopprograms.enchantedaura.util.EnchantedAuraTab;

public class AuraStorageBuffer extends BlockContainer {

	public AuraStorageBuffer() {
		super(Material.iron);
		this.setBlockName("AuraBuffer");
		this.setBlockTextureName(EnchantedAura.modid + ":Block_PowerBuffer_Input");
		this.setCreativeTab(EnchantedAuraTab.tab);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileAuraBuffer();
	}

}
