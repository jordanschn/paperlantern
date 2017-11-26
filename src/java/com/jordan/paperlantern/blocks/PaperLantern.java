package com.jordan.paperlantern.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class PaperLantern extends BlockBase {
	public PaperLantern() {
		super(Material.ROCK, "paper_lantern");
		setLightLevel(0.9375f);
		Blocks.FIRE.setFireInfo(this, 5, 20);
		setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	@Override
	public PaperLantern setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}