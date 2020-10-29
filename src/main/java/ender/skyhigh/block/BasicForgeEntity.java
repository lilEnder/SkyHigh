package ender.skyhigh.block;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;

public class BasicForgeEntity extends BlockEntity {

    private int number = 7;

    public BasicForgeEntity() {
        super(BlockRegistry.BASIC_FORGE_ENTITY);
    }

    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);

        tag.putInt("number", number);

        return tag;
    }

    public void fromTag(CompoundTag tag) {
        super.fromTag(tag);
        number = tag.getInt("number");
    }
}
