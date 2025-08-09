package com.eldonred.item;

import com.eldonred.Liminality;
import com.eldonred.item.custom.FiresaltItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {

    public static final Item ALMOND_WATER = registerItem("almond_water",
            new HoneyBottleItem(new Item.Settings().food(ModFood.ALMOND_WATER)));
    public static final Item FIRESALT = registerItem("firesalt",
            new FiresaltItem(new Item.Settings()));








    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Liminality.MOD_ID, name), item);
    }


    public static void registerModItems() {
    }
}