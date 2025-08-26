package dev.bluesheep.mekanismreversebin.mixin;

import com.jerry.mekanism_extras.common.block.basic.ExtraBlockBin;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ExtraBlockBin.class)
public class ExtraBlockBinMixin {
    @ModifyExpressionValue(
            method = "attack",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;isShiftKeyDown()Z")
    )
    private boolean invertSneakAttack(boolean original) {
        return !original;
    }
}
