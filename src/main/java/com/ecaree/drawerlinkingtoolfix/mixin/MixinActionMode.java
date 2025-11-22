package com.ecaree.drawerlinkingtoolfix.mixin;

import com.buuz135.functionalstorage.item.LinkingToolItem;
import net.minecraft.network.chat.TextColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LinkingToolItem.ActionMode.class)
public class MixinActionMode {
    @Redirect(
            method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/network/chat/TextColor;fromRgb(I)Lnet/minecraft/network/chat/TextColor;"
            )
    )
    private static TextColor fixColorFormat(int rgb) {
        int fixedRgb = rgb & 0xFFFFFF;
        return TextColor.fromRgb(fixedRgb);
    }
}