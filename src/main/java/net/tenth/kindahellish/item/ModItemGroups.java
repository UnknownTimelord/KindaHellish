package net.tenth.kindahellish.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tenth.kindahellish.KindaHellish;

public class ModItemGroups {
    public static final ItemGroup KINDA_HELLISH_MATERIALS = FabricItemGroupBuilder.build(new Identifier(KindaHellish.MOD_ID, "hellish_materials"),
            ()-> new ItemStack(ModItems.SOUL_IRON_INGOT));
    public static final ItemGroup KINDA_HELLISH_TOOLS = FabricItemGroupBuilder.build(new Identifier(KindaHellish.MOD_ID, "hellish_tools"),
            ()-> new ItemStack(ModItems.SOUL_IRON_INGOT));
}
