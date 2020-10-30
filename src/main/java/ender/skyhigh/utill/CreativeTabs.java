package ender.skyhigh.utill;

import ender.skyhigh.block.BlockRegistry;
import ender.skyhigh.item.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabs {

    public static final ItemGroup SKYHIGH_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier("skyhigh", "blocks"),
            () -> new ItemStack(BlockRegistry.BASIC_FORGE));

    public static final ItemGroup SKYHIGH_ITEMS = FabricItemGroupBuilder.create(
            new Identifier("skyhigh", "items"))
            .icon(() -> new ItemStack(ItemRegistry.PRIME_INGOT))
            .build();
}
