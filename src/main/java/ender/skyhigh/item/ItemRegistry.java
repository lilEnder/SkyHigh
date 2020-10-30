package ender.skyhigh.item;

import ender.skyhigh.utill.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static final Item PRIME_SHARD = new Item(new FabricItemSettings().group(CreativeTabs.SKYHIGH_ITEMS));
    public static final Item PRIME_INGOT = new Item(new FabricItemSettings().group(CreativeTabs.SKYHIGH_ITEMS));
    public static final Item PIRM_STEEL_INGOT = new Item(new FabricItemSettings().group(CreativeTabs.SKYHIGH_ITEMS));
    public static final Item DRAKEN_STEEL_INGOT = new Item(new FabricItemSettings().group(CreativeTabs.SKYHIGH_ITEMS));
    public static final Item OBLIVION_STEEL_INGOT = new Item(new FabricItemSettings().group(CreativeTabs.SKYHIGH_ITEMS));
    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "prime_ingot"), PRIME_INGOT);
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "prime_shard"), PRIME_SHARD);
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "pirm_steel_ingot"), PIRM_STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "draken_steel_ingot"), DRAKEN_STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "oblivion_steel_ingot"), OBLIVION_STEEL_INGOT);
    }
}
