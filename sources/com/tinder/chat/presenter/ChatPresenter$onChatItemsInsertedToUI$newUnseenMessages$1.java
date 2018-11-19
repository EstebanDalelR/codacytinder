package com.tinder.chat.presenter;

import com.tinder.chat.view.model.MessageViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/chat/view/model/MessageViewModel;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatPresenter$onChatItemsInsertedToUI$newUnseenMessages$1 extends Lambda implements Function1<MessageViewModel<?>, Boolean> {
    /* renamed from: a */
    public static final ChatPresenter$onChatItemsInsertedToUI$newUnseenMessages$1 f43571a = new ChatPresenter$onChatItemsInsertedToUI$newUnseenMessages$1();

    ChatPresenter$onChatItemsInsertedToUI$newUnseenMessages$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m53248a((MessageViewModel) obj));
    }

    /* renamed from: a */
    public final boolean m53248a(@NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(messageViewModel, "it");
        return messageViewModel.m42904k() ^ 1;
    }
}
