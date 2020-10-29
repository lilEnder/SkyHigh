package ender.skyhigh;

import ender.skyhigh.block.BoxBlock;
import ender.skyhigh.block.BoxBlockEntity;
import ender.skyhigh.block.BoxScreenHandler;
import ender.skyhigh.enchantment.EnchantmentRegistry;
import ender.skyhigh.item.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import ender.skyhigh.block.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Skyhigh implements ModInitializer {

    public static final Block BOX_BLOCK;
    public static final BlockItem BOX_BLOCK_ITEM;
    public static final BlockEntityType<BoxBlockEntity> BOX_BLOCK_ENTITY;

    public static final Identifier BOX = new Identifier("skyhigh", "box_block");
    public static final ScreenHandlerType<BoxScreenHandler> BOX_SCREEN_HANDLER;

    static {
        //We use registerSimple here because our Entity is not an ExtendedScreenHandlerFactory
        //but a NamedScreenHandlerFactory.
        //In a later Tutorial you will see what ExtendedScreenHandlerFactory can do!
        BOX_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(BOX, BoxScreenHandler::new);

        BOX_BLOCK = Registry.register(Registry.BLOCK, BOX, new BoxBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
        BOX_BLOCK_ITEM = Registry.register(Registry.ITEM, BOX, new BlockItem(BOX_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

        //The parameter of build at the very end is always null, do not worry about it
        BOX_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, BOX, BlockEntityType.Builder.create(BoxBlockEntity::new, BOX_BLOCK).build(null));
    }

    @Override
    public void onInitialize() {
        ItemRegistry.init();
        BlockRegistry.init();
        EnchantmentRegistry.init();
    }
}
