package com.eldonred;


import com.eldonred.item.ModItemGroup;
import com.eldonred.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FBplus implements ModInitializer {
	public static final String MOD_ID = "liminality";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}