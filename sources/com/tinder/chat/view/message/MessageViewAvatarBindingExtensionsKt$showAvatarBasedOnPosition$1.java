package com.tinder.chat.view.message;

import com.tinder.chat.view.model.MessageViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageViewAvatarBindingExtensionsKt$showAvatarBasedOnPosition$1 extends Lambda implements Function1<MessageViewModel<?>, Boolean> {
    /* renamed from: a */
    public static final MessageViewAvatarBindingExtensionsKt$showAvatarBasedOnPosition$1 f43680a = new MessageViewAvatarBindingExtensionsKt$showAvatarBasedOnPosition$1();

    MessageViewAvatarBindingExtensionsKt$showAvatarBasedOnPosition$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53288a((MessageViewModel) obj));
    }

    /* renamed from: a */
    public final boolean m53288a(@NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(messageViewModel, "$receiver");
        return ((messageViewModel.m42907n().m36431c() || messageViewModel.m42907n().m36432d()) && messageViewModel.m42907n().m36436h() == null) ? true : null;
    }
}
