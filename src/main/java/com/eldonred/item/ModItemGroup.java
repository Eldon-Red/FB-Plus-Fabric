package com.eldonred.item;

import com.eldonred.FBplus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALMOND_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FBplus.MOD_ID, "almond"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.almond"))
                    .icon(() -> new ItemStack(ModItems.FIRESALT)).entries((displayContext, entries) -> {



                    }).build());


    public static void registerItemGroups() {}
}
