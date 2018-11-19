package com.tinder.chat.view.message;

import com.tinder.chat.view.action.MessageLikingActionHandler;
import com.tinder.chat.view.model.MessageViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a \u0010\b\u001a\u00020\u0001*\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\b\u001a\u00020\u0001*\u00020\n2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¨\u0006\u000b"}, d2 = {"bind", "", "heartView", "Lcom/tinder/chat/view/message/HeartView;", "viewModel", "Lcom/tinder/chat/view/model/MessageViewModel;", "actionHandler", "Lcom/tinder/chat/view/action/MessageLikingActionHandler;", "bindHeartView", "Lcom/tinder/chat/view/message/InboundReactionMessageView;", "Lcom/tinder/chat/view/message/OutboundReactionMessageView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class ab {
    /* renamed from: a */
    public static final void m36247a(@NotNull C10633w c10633w, @NotNull MessageViewModel<?> messageViewModel, @NotNull MessageLikingActionHandler messageLikingActionHandler) {
        C2668g.b(c10633w, "$receiver");
        C2668g.b(messageViewModel, "viewModel");
        C2668g.b(messageLikingActionHandler, "actionHandler");
        m36245a(c10633w.getHeartView(), (MessageViewModel) messageViewModel, messageLikingActionHandler);
    }

    /* renamed from: a */
    public static final void m36246a(@NotNull be beVar, @NotNull MessageViewModel<?> messageViewModel) {
        C2668g.b(beVar, "$receiver");
        C2668g.b(messageViewModel, "viewModel");
        m36244a(beVar.getHeartView(), (MessageViewModel) messageViewModel);
    }

    /* renamed from: a */
    private static final void m36244a(HeartView heartView, MessageViewModel<?> messageViewModel) {
        HeartView.m36227a(heartView, messageViewModel, null, 2, null);
    }

    /* renamed from: a */
    private static final void m36245a(HeartView heartView, MessageViewModel<?> messageViewModel, MessageLikingActionHandler messageLikingActionHandler) {
        heartView.m36228a(messageViewModel, messageLikingActionHandler);
    }
}
