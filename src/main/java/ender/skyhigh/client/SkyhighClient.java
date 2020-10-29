package ender.skyhigh.client;

import ender.skyhigh.Skyhigh;
import ender.skyhigh.block.BoxScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class SkyhighClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(Skyhigh.BOX_SCREEN_HANDLER, BoxScreen::new);
    }
}
