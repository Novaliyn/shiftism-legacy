package com.novaliyn.shiftism;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Shiftism.MODID, version = Shiftism.VERSION, name = "Shiftism")
public class Shiftism {
    public static final String MODID = "shiftism";
    public static final String VERSION = "1.0";
    public static Item miku_ingot;


    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        miku_ingot = new ItemShiftism().setUnlocalizedName("miku_ingot").setTextureName("shiftism:miku_ingot").setCreativeTab(tabShiftism);
        GameRegistry.registerItem(miku_ingot, miku_ingot.getUnlocalizedName().substring(5));
    }


    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs tabShiftism = new CreativeTabs("tabShiftism") {
        @Override
        public Item getTabIconItem(){
            return miku_ingot;
        }
    };

}
