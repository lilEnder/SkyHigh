package ender.skyhigh;

import ender.skyhigh.enchantment.EnchantmentRegistry;
import ender.skyhigh.item.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import ender.skyhigh.block.BlockRegistry;

public class Skyhigh implements ModInitializer {

    @Override
    public void onInitialize() {
        ItemRegistry.init();
        BlockRegistry.init();
        EnchantmentRegistry.init();
    }
}
