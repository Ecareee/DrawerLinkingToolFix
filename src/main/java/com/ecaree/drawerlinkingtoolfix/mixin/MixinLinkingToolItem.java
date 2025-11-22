//package com.ecaree.drawerlinkingtoolfix.mixin;
//
//import com.buuz135.functionalstorage.item.LinkingToolItem;
//import net.minecraft.network.chat.TextColor;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Redirect;
//
//@Mixin(value = {LinkingToolItem.LinkingMode.class, LinkingToolItem.ActionMode.class})
//public class MixinLinkingToolItem {
//    @Redirect(
//            method = "<clinit>",
//            at = @At(
//                    value = "INVOKE",
//                    target = "Lnet/minecraft/network/chat/TextColor;fromRgb(I)Lnet/minecraft/network/chat/TextColor;"
//            ),
//            remap = false
//    )
//    private static TextColor fixColorFormat(int rgb) {
//        int fixedRgb = rgb & 0xFFFFFF;
//        return TextColor.fromRgb(fixedRgb);
//    }
//}
// 有 bug