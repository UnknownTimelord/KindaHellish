package net.tenth.kindahellish.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tenth.kindahellish.KindaHellish;

import static net.tenth.kindahellish.item.ModItemGroups.KINDA_HELLISH_MATERIALS;
import static net.tenth.kindahellish.item.ModItemGroups.KINDA_HELLISH_TOOLS;

public class ModItems {
    public static final Item SOUL_IRON_INGOT = registerItem("soul_iron_ingot",
            new Item(new FabricItemSettings()
                    .fireproof().group(KINDA_HELLISH_MATERIALS)));
    public static final Item WARDENS_KEY = registerItem("wardens_key",
            new Item(new FabricItemSettings()
                    .fireproof().group(KINDA_HELLISH_TOOLS)));
    public static final Item SPECTRAL_SHIELD = registerItem("spectral_shield",
            new ShieldItem(new FabricItemSettings()
                    .fireproof().group(KINDA_HELLISH_TOOLS)));
    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(KindaHellish.MOD_ID, name), item);
    }
    public static void registerModItems()
    {
        KindaHellish.LOGGER.info("Registering " + KindaHellish.MOD_ID + " Mod Items for " + KindaHellish.MOD_ID);
    }
}
