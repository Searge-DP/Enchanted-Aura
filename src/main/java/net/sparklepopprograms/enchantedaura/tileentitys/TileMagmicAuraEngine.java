package net.sparklepopprograms.enchantedaura.tileentitys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.sparklepopprograms.core.api.energy.BaseEnergyStorageBlock;
import net.sparklepopprograms.core.api.energy.IAuraUser;
import net.sparklepopprograms.core.util.PositionInWorld;
import net.sparklepopprograms.core.util.WorldHelper;

public class TileMagmicAuraEngine extends BaseEnergyStorageBlock {
	
	public TileMagmicAuraEngine() {
		super();
		this.setCapacity(3000);
	}

	@Override
	public void updateEntity() {
		
		if (worldObj.getBlock(this.xCoord, this.yCoord - 1, this.zCoord) == Blocks.fire) {
			this.modifyEnergyStored(5);
		}
		
		for (PositionInWorld pos : WorldHelper.getListOfPositionsAroundBlock(xCoord, yCoord, zCoord)) {
			TileEntity tile = worldObj.getTileEntity(pos.getX(), pos.getY(), pos.getZ());
			
			if (tile instanceof IAuraUser) {
				this.extractAura(((BaseEnergyStorageBlock)tile).receiveAura(this.getStoredAura(), false), false);
			}
		}
	}

	@Override
	public long receiveAura(long maxReceive, boolean simulate) {
		return 0;
	}

}
