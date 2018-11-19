package com.tinder.chat.view.action;

import com.tinder.chat.analytics.ab;
import com.tinder.chat.analytics.ab.C8415a;
import com.tinder.chat.analytics.ah;
import com.tinder.chat.analytics.ah.C8419a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J8\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/chat/view/action/OutboundTextMessageViewActionHandler;", "Lcom/tinder/chat/view/action/MessageLongClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLinkClickActionHandler;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "chatSendErrorOptionsEvent", "Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;", "chatTapLinkEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;", "(Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;)V", "onLinkClicked", "", "matchId", "", "message", "url", "messageSentDate", "Lorg/joda/time/DateTime;", "onMessageLongClicked", "messageId", "messageText", "isFailed", "", "messageIndex", "", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aj implements MessageLinkClickActionHandler, MessageLongClickingActionHandler {
    /* renamed from: a */
    private final ChatContextualMenuDisplayAction f34372a;
    /* renamed from: b */
    private final ab f34373b;
    /* renamed from: c */
    private final ah f34374c;

    @Inject
    public aj(@NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull ab abVar, @NotNull ah ahVar) {
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(abVar, "chatSendErrorOptionsEvent");
        C2668g.b(ahVar, "chatTapLinkEventDispatcher");
        this.f34372a = chatContextualMenuDisplayAction;
        this.f34373b = abVar;
        this.f34374c = ahVar;
    }

    public void onLinkClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "message");
        C2668g.b(str3, "url");
        C2668g.b(dateTime, "messageSentDate");
        this.f34374c.m42571a(new C8419a(str, str2, str3, dateTime));
    }

    public void onMessageLongClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, int i, boolean z2) {
        aj ajVar = this;
        String str4 = str;
        C2668g.b(str4, "matchId");
        String str5 = str2;
        C2668g.b(str5, "messageId");
        String str6 = str3;
        C2668g.b(str6, "messageText");
        if (z) {
            ajVar.f34373b.m42563a(new C8415a(str4, 0, str6, i, str5, null, null, 96, null));
        }
        ajVar.f34372a.showMenu(new C8455a(str5, str6, Type.OUTBOUND_TEXT_MESSAGE, z, i, null, z2, null, null, 416, null));
    }
}
