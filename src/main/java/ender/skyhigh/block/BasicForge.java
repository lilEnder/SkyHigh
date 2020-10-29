package ender.skyhigh.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BasicForge extends Block implements BlockEntityProvider {
    public BasicForge() {
        super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.STONE));
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockView world) {
        return new BasicForgeEntity();
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) return ActionResult.SUCCESS;
        Inventory blockEntity = (Inventory) world.getBlockEntity(pos);


        if (!player.getStackInHand(hand).isEmpty()) {
            // Check what is the first open slot and put an item from the player's hand there
            if (blockEntity.getStack(0).isEmpty()) {
                // Put the stack the player is holding into the inventory
                blockEntity.setStack(0, player.getStackInHand(hand).copy());
                // Remove the stack from the player's hand
                player.getStackInHand(hand).setCount(0);
            } else if (blockEntity.getStack(1).isEmpty()) {
                blockEntity.setStack(1, player.getStackInHand(hand).copy());
                player.getStackInHand(hand).setCount(0);
            } else {
                // If the player is not holding anything we'll get give him the items in the block entity one by one

                // Find the first slot that has an item and give it to the player
                if (!blockEntity.getStack(1).isEmpty()) {
                    // Give the player the stack in the inventory
                    player.inventory.offerOrDrop(world, blockEntity.getStack(1));
                    // Remove the stack from the inventory
                    blockEntity.removeStack(1);
                } else if (!blockEntity.getStack(0).isEmpty()) {
                    player.inventory.offerOrDrop(world, blockEntity.getStack(0));
                    blockEntity.removeStack(0);
                }
            }
        }

        return ActionResult.SUCCESS;
    }
}

