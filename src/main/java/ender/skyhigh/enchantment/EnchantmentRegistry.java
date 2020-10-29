package ender.skyhigh.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentRegistry {

    public static final BlizEnchantment BLIZ = new BlizEnchantment();
    public static void init() {
        Registry.register(Registry.ENCHANTMENT, new Identifier("skyhigh", "bliz"), BLIZ);
    }

}
