package net.sparklepopprograms.enchantedaura;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import scala.Int;
import scala.tools.nsc.settings.Final;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.sparklepopprograms.core.util.LogHelper;
import cpw.mods.fml.common.Mod.EventHandler;


@Mod(modid = EnchantedAura.modid, name = "Enchanted Aura", version = EnchantedAura.version , dependencies = EnchantedAura.dependencies)

public class EnchantedAura {
	
	public static final String modid = "EnchantedAura";
	public static final String version = "0.0.0-alpha";
	public static final String dependencies = "required-after:DimensionalCore@[1.0.4,);required-after:ThermalExpansion@[1.7.10R4.1.1B237,)";
	
	@EventHandler
	public void load(FMLPreInitializationEvent event) {
		
		
		
		LogHelper.info("Finished Pre Initialization", modid);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		EnchantedAuraItems.RegisterItems();
		EnchantedAuraBlocks.RegisterBlocks();
		EnchantedAuraRecipes.RegisterRecipes();
		
		if (event.getSide() == Side.CLIENT) {
			this.loadRender();
		}
		
		LogHelper.info("Finished Initialization", modid);
	}
	
	@EventHandler
	public void load(FMLPostInitializationEvent event) {
		
		
		LogHelper.info("Finished Post Initialization", modid);
	}
	
	@SideOnly(Side.CLIENT)
	public void loadRender() {
		
	}
}