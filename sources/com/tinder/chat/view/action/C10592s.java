package com.tinder.chat.view.action;

import com.tinder.chat.analytics.ah;
import com.tinder.chat.analytics.ah.C8419a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016JL\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0016J(\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J8\u0010!\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/chat/view/action/InboundTextMessageViewActionHandler;", "Lcom/tinder/chat/view/action/MessageLongClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLikingActionHandler;", "Lcom/tinder/chat/view/action/MessageAvatarClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLinkClickActionHandler;", "likingAction", "Lcom/tinder/chat/view/action/MessageLikingAction;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "fullscreenMatchProfileDisplayAction", "Lcom/tinder/chat/view/action/MatchProfileDisplayAction;", "chatTapLinkEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;", "(Lcom/tinder/chat/view/action/MessageLikingAction;Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/view/action/MatchProfileDisplayAction;Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;)V", "onAvatarClicked", "", "senderId", "", "matchId", "onLiked", "messageId", "messageType", "", "messageText", "contentId", "messageIndex", "contentSource", "contentUrl", "onLinkClicked", "message", "url", "messageSentDate", "Lorg/joda/time/DateTime;", "onMessageLongClicked", "isFailed", "", "isLiked", "onUnliked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.s */
public final class C10592s implements MessageAvatarClickingActionHandler, MessageLikingActionHandler, MessageLinkClickActionHandler, MessageLongClickingActionHandler {
    /* renamed from: a */
    private final C8465w f34413a;
    /* renamed from: b */
    private final ChatContextualMenuDisplayAction f34414b;
    /* renamed from: c */
    private final MatchProfileDisplayAction f34415c;
    /* renamed from: d */
    private final ah f34416d;

    @Inject
    public C10592s(@NotNull C8465w c8465w, @NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull MatchProfileDisplayAction matchProfileDisplayAction, @NotNull ah ahVar) {
        C2668g.b(c8465w, "likingAction");
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(matchProfileDisplayAction, "fullscreenMatchProfileDisplayAction");
        C2668g.b(ahVar, "chatTapLinkEventDispatcher");
        this.f34413a = c8465w;
        this.f34414b = chatContextualMenuDisplayAction;
        this.f34415c = matchProfileDisplayAction;
        this.f34416d = ahVar;
    }

    public void onLinkClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "message");
        C2668g.b(str3, "url");
        C2668g.b(dateTime, "messageSentDate");
        this.f34416d.m42571a(new C8419a(str, str2, str3, dateTime));
    }

    public void onMessageLongClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, int i, boolean z2) {
        C2668g.b(str, "matchId");
        String str4 = str2;
        C2668g.b(str4, "messageId");
        String str5 = str3;
        C2668g.b(str5, "messageText");
        this.f34414b.showMenu(new C8455a(str4, str5, Type.INBOUND_TEXT_MESSAGE, z, i, null, z2, null, null, 416, null));
    }

    public void onLiked(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, @Nullable String str5, @Nullable String str6) {
        String str7 = str;
        C2668g.b(str7, "messageId");
        String str8 = str2;
        C2668g.b(str8, "matchId");
        String str9 = str3;
        C2668g.b(str9, "messageText");
        String str10 = str4;
        C2668g.b(str10, "contentId");
        C8465w.m36209a(this.f34413a, str7, str8, i, str9, str10, i2, null, null, 192, null);
    }

    public void onUnliked(@NotNull String str) {
        C2668g.b(str, "messageId");
        this.f34413a.m36211a(str);
    }

    public void onAvatarClicked(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "senderId");
        C2668g.b(str2, "matchId");
        this.f34415c.show(str, str2);
    }
}
