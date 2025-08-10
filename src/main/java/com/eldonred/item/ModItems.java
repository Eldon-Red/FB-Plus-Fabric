package com.eldonred.item;

import com.eldonred.FBplus;
import com.eldonred.item.custom.FiresaltItem;
import com.eldonred.item.custom.FiresaltCocktail;
import com.eldonred.item.custom.MemoryScramblerCocktail;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item FIRESALT = registerItem("firesalt",
            new FiresaltItem(new Item.Settings()));
    public static final Item LIQUID_PAIN = registerItem("liquid_pain",
            new HoneyBottleItem(new Item.Settings().food(ModFood.LIQUID_PAIN).maxCount(8)));
    public static final Item SMILER_STEAK = registerItem("smiler_steak",
            new Item(new Item.Settings().food(ModFood.SMILER_STEAK).maxCount(64)));
    public static final Item SMILER_STEAK_FRITES = registerItem("smiler_steak_frites",
            new Item(new Item.Settings().food(ModFood.SMILER_STEAK_FRITES).maxCount(1)));
    public static final Item SMILER_SANDWICH = registerItem("smiler_sandwich",
            new Item(new Item.Settings().food(ModFood.SMILER_SANDWICH).maxCount(1)));
    public static final Item MOTH_JELLY = registerItem("moth_jelly",
            new HoneyBottleItem(new Item.Settings().food(ModFood.MOTH_JELLY).maxCount(8)));
    public static final Item FIRESALT_COCKTAIL = registerItem("firesalt_cocktail",
            new FiresaltCocktail(new Item.Settings().food(ModFood.FIRESALT_COCKTAIL).maxCount(1)));
    public static final Item MEMORY_SCRAMBLER = registerItem("memory_scrambler",
            new MemoryScramblerCocktail(new Item.Settings().food(ModFood.FIRESALT_COCKTAIL).maxCount(1)));








    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FBplus.MOD_ID, name), item);
    }


    public static void registerModItems() {
    }
}