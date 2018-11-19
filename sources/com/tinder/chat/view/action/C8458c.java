package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MessageAction;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.action.FullscreenImageDisplayAction.C8456a;
import com.tinder.chat.view.model.C12747i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/action/ActivityMessageImageClickHandler;", "", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "fullscreenImageDisplayAction", "Lcom/tinder/chat/view/action/FullscreenImageDisplayAction;", "(Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;Lcom/tinder/chat/view/action/FullscreenImageDisplayAction;)V", "onImageClicked", "", "viewModel", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "fullscreenImageDisplayActionPayload", "Lcom/tinder/chat/view/action/FullscreenImageDisplayAction$Payload;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.chat.view.action.c */
public final class C8458c {
    /* renamed from: a */
    private final C10588n f30117a;
    /* renamed from: b */
    private final FullscreenImageDisplayAction f30118b;

    @Inject
    public C8458c(@NotNull C10588n c10588n, @NotNull FullscreenImageDisplayAction fullscreenImageDisplayAction) {
        C2668g.b(c10588n, "messageActionHandler");
        C2668g.b(fullscreenImageDisplayAction, "fullscreenImageDisplayAction");
        this.f30117a = c10588n;
        this.f30118b = fullscreenImageDisplayAction;
    }

    /* renamed from: a */
    public final void m36198a(@NotNull C12747i c12747i, @NotNull C8456a c8456a) {
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8456a, "fullscreenImageDisplayActionPayload");
        C8459e.m36204b(c12747i, this.f30117a, MessageAction.VIEW_IMAGE);
        this.f30118b.showImage(c8456a);
    }
}
