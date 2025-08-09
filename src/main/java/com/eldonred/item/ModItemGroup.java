package com.eldonred.item;

import com.eldonred.Liminality;
import com.eldonred.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALMOND_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Liminality.MOD_ID, "almond"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.almond"))
                    .icon(() -> new ItemStack(ModItems.ALMOND_WATER)).entries((displayContext, entries) -> {
                       entries.add(ModItems.ALMOND_WATER);
                        entries.add(ModBlocks.BUZZING_LIGHT);
                        entries.add(ModBlocks.DAMP_CARPET);
                        entries.add(ModBlocks.VOID);
                        entries.add(ModBlocks.YELLOW_WALLPAPER);
                        entries.add(ModBlocks.TILED_ROOF);


                    }).build());


    public static void registerItemGroups() {}
}
