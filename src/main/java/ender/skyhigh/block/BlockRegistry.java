package ender.skyhigh.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block PRIME_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));
    public static final BasicForge BASIC_FORGE = new BasicForge();
    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","prime_block"), PRIME_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "prime_block"), new BlockItem(PRIME_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","basic_forge"), BASIC_FORGE);
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "basic_forge"), new BlockItem(BASIC_FORGE, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
