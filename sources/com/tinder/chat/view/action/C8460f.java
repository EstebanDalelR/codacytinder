package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MessageAction;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.model.C12747i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/chat/view/action/ActivityMessageVideoClickHandler;", "", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "(Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;)V", "onVideoClicked", "", "viewModel", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.action.f */
public final class C8460f {
    /* renamed from: a */
    private final C10588n f30119a;

    @Inject
    public C8460f(@NotNull C10588n c10588n) {
        C2668g.b(c10588n, "messageActionHandler");
        this.f30119a = c10588n;
    }

    /* renamed from: a */
    public final void m36205a(@NotNull C12747i c12747i) {
        C2668g.b(c12747i, "viewModel");
        C8459e.m36204b(c12747i, this.f30119a, MessageAction.PLAY_VIDEO);
    }
}
