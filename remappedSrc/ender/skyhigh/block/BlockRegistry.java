package ender.skyhigh.block;

import ender.skyhigh.block.basic.forge.BasicForge;
import ender.skyhigh.block.basic.forge.BasicForgeEntity;
import ender.skyhigh.utill.CreativeTabs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    public static final Block PRIME_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));
    public static final BasicForge BASIC_FORGE = new BasicForge();

    public static final Block VOIDSTONE = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block PIRM_STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block DRAKEN_STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block OBLIVION_STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));

    public static BlockEntityType<BasicForgeEntity> BASIC_FORGE_ENTITY;

    public static void init() {

        Registry.register(Registry.BLOCK, new Identifier("skyhigh","prime_block"), PRIME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","basic_forge"), BASIC_FORGE);
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","voidstone"), VOIDSTONE);
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","pirm_steel_block"), PIRM_STEEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","draken_steel_block"), DRAKEN_STEEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("skyhigh","oblivion_steel_block"), OBLIVION_STEEL_BLOCK);

        Registry.register(Registry.ITEM, new Identifier("skyhigh", "basic_forge"), new BlockItem(BASIC_FORGE, new FabricItemSettings().group(CreativeTabs.SKYHIGH_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "prime_block"), new BlockItem(PRIME_BLOCK, new FabricItemSettings().group(CreativeTabs.SKYHIGH_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "voidstone"), new BlockItem(VOIDSTONE, new FabricItemSettings().group(CreativeTabs.SKYHIGH_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "pirm_steel_block"), new BlockItem(PIRM_STEEL_BLOCK, new FabricItemSettings().group(CreativeTabs.SKYHIGH_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "draken_steel_block"), new BlockItem(DRAKEN_STEEL_BLOCK, new FabricItemSettings().group(CreativeTabs.SKYHIGH_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("skyhigh", "oblivion_steel_block"), new BlockItem(OBLIVION_STEEL_BLOCK, new FabricItemSettings().group(CreativeTabs.SKYHIGH_BLOCKS)));

        Registry.register(Registry.BLOCK_ENTITY_TYPE, "skyhigh:basic_forge", BlockEntityType.Builder.create(BasicForgeEntity::new, BASIC_FORGE).build(null));

    }
}
