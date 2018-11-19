package com.tinder.chat.view.action;

import com.tinder.chat.analytics.ab;
import com.tinder.chat.analytics.ab.C8415a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J8\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/chat/view/action/OutboundGifMessageViewActionHandler;", "Lcom/tinder/chat/view/action/GifClickingActionHandler;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "fullscreenGifDisplayingAction", "Lcom/tinder/chat/view/action/FullscreenGifDisplayAction;", "chatSendErrorOptionsEvent", "Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;", "matchId", "", "(Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/view/action/FullscreenGifDisplayAction;Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;Ljava/lang/String;)V", "onGifClicked", "", "gifUrl", "messageType", "", "contentId", "messageIndex", "onGifLongClicked", "messageId", "isFailed", "", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ag implements GifClickingActionHandler {
    /* renamed from: a */
    private final ChatContextualMenuDisplayAction f34360a;
    /* renamed from: b */
    private final FullscreenGifDisplayAction f34361b;
    /* renamed from: c */
    private final ab f34362c;
    /* renamed from: d */
    private final String f34363d;

    @Inject
    public ag(@NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull FullscreenGifDisplayAction fullscreenGifDisplayAction, @NotNull ab abVar, @NotNull String str) {
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(fullscreenGifDisplayAction, "fullscreenGifDisplayingAction");
        C2668g.b(abVar, "chatSendErrorOptionsEvent");
        C2668g.b(str, "matchId");
        this.f34360a = chatContextualMenuDisplayAction;
        this.f34361b = fullscreenGifDisplayAction;
        this.f34362c = abVar;
        this.f34363d = str;
    }

    public void onGifClicked(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        C2668g.b(str, "gifUrl");
        C2668g.b(str2, "matchId");
        C2668g.b(str3, "contentId");
        this.f34361b.showGif(str, str2, i, str3, i2);
    }

    public void onGifLongClicked(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, boolean z2) {
        ag agVar = this;
        String str4 = str;
        C2668g.b(str4, "messageId");
        String str5 = str2;
        C2668g.b(str5, "gifUrl");
        C2668g.b(str3, "contentId");
        if (z) {
            ab abVar = agVar.f34362c;
            C8415a c8415a = r2;
            C8415a c8415a2 = new C8415a(agVar.f34363d, 1, "", i, str4, null, null, 96, null);
            abVar.m42563a(c8415a);
        }
        agVar.f34360a.showMenu(new C8455a(str4, str5, Type.OUTBOUND_GIF_MESSAGE, z, i, str3, z2, null, null, 384, null));
    }
}
