package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MessageAction;
import com.tinder.chat.analytics.ab;
import com.tinder.chat.analytics.ab.C8415a;
import com.tinder.chat.analytics.aj;
import com.tinder.chat.analytics.aj.C8420a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJH\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/chat/view/action/OutboundImageMessageActionHandler;", "Lcom/tinder/chat/view/action/ImageMessageClickingActionHandler;", "chatSendErrorOptionsEvent", "Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "chatTapMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;", "matchId", "", "(Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;Ljava/lang/String;)V", "onImageLongClicked", "", "messageId", "imageUrl", "isFailed", "", "messageIndex", "", "contentId", "isLiked", "contentSource", "contentUrl", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ah implements ImageMessageClickingActionHandler {
    /* renamed from: a */
    private final ab f34364a;
    /* renamed from: b */
    private final ChatContextualMenuDisplayAction f34365b;
    /* renamed from: c */
    private final aj f34366c;
    /* renamed from: d */
    private final String f34367d;

    @Inject
    public ah(@NotNull ab abVar, @NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull aj ajVar, @NotNull String str) {
        C2668g.b(abVar, "chatSendErrorOptionsEvent");
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(ajVar, "chatTapMessageEventDispatcher");
        C2668g.b(str, "matchId");
        this.f34364a = abVar;
        this.f34365b = chatContextualMenuDisplayAction;
        this.f34366c = ajVar;
        this.f34367d = str;
    }

    public void onImageLongClicked(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, boolean z2, @NotNull String str4, @NotNull String str5) {
        ah ahVar = this;
        String str6 = str;
        C2668g.b(str6, "messageId");
        String str7 = str2;
        C2668g.b(str7, "imageUrl");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        String str9 = str4;
        C2668g.b(str9, "contentSource");
        String str10 = str5;
        C2668g.b(str10, "contentUrl");
        if (z) {
            ab abVar = ahVar.f34364a;
            String str11 = str9;
            C8415a c8415a = r2;
            C8415a c8415a2 = new C8415a(ahVar.f34367d, 4, "", i, str6, str11, str10);
            abVar.m42563a(c8415a);
        }
        ChatContextualMenuDisplayAction chatContextualMenuDisplayAction = ahVar.f34365b;
        int i2 = i;
        C8455a c8455a = r2;
        C8455a c8455a2 = new C8455a(str6, str7, Type.OUTBOUND_IMAGE_MESSAGE, z, i2, str8, z2, str4, str10);
        chatContextualMenuDisplayAction.showMenu(c8455a);
        ahVar.f34366c.m42573a(new C8420a(ahVar.f34367d, 4, str7, str8, i2, MessageAction.NONE, str4, str10));
    }
}
