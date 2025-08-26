package dev.bluesheep.mekanismreversebin.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import mekanism.common.block.basic.BlockBin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(BlockBin.class)
public class BlockBinMixin {
    @ModifyExpressionValue(
            method = "attack",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;isShiftKeyDown()Z")
    )
    private boolean invertSneakAttack(boolean original) {
        return !original;
    }
}
