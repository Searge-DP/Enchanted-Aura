package net.sparklepopprograms.enchantedaura.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sparklepopprograms.enchantedaura.EnchantedAuraBlocks;

public class EnchantedAuraTab extends CreativeTabs {
	
	public static CreativeTabs tab = new EnchantedAuraTab(CreativeTabs.getNextID(), "enchantedauratab");

	public EnchantedAuraTab(int id, String name) {
		super(id, name);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(EnchantedAuraBlocks.AuraStorageBuffer);
	}

}
