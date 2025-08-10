package com.eldonred.item;

import com.eldonred.FBplus;
import com.eldonred.item.custom.FiresaltItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item FIRESALT = registerItem("firesalt",
            new FiresaltItem(new Item.Settings()));
    public static final Item LIQUID_PAIN = registerItem("liquid_pain",
            new HoneyBottleItem(new Item.Settings().food(ModFood.LIQUID_PAIN)));








    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FBplus.MOD_ID, name), item);
    }


    public static void registerModItems() {
    }
}