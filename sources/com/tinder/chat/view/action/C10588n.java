package com.tinder.chat.view.action;

import com.tinder.chat.analytics.C10538s;
import com.tinder.chat.analytics.C10538s.C8435a;
import com.tinder.chat.analytics.MediaType;
import com.tinder.chat.analytics.MessageAction;
import com.tinder.chat.analytics.ah;
import com.tinder.chat.analytics.ah.C8419a;
import com.tinder.chat.analytics.aj;
import com.tinder.chat.analytics.aj.C8420a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B/\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J@\u0010!\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J8\u0010%\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020)H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "Lcom/tinder/chat/view/action/MessageAvatarClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLongClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLinkClickActionHandler;", "Lcom/tinder/chat/view/action/ActivityMessageClickingActionHandler;", "Lcom/tinder/chat/view/action/ActivityMessageMediaUnavailableHandler;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "matchProfileDisplayAction", "Lcom/tinder/chat/view/action/MatchProfileDisplayAction;", "chatTapMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;", "chatTapLinkEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;", "chatMediaUnavailableDispatcher", "Lcom/tinder/chat/analytics/ChatMediaUnavailableDispatcher;", "(Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/view/action/MatchProfileDisplayAction;Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;Lcom/tinder/chat/analytics/ChatTapLinkEventDispatcher;Lcom/tinder/chat/analytics/ChatMediaUnavailableDispatcher;)V", "onAvatarClicked", "", "senderId", "", "matchId", "onLinkClicked", "message", "url", "messageSentDate", "Lorg/joda/time/DateTime;", "onMediaClicked", "contentId", "messageIndex", "", "messageAction", "Lcom/tinder/chat/analytics/MessageAction;", "onMediaUnavailable", "mediaId", "mediaType", "Lcom/tinder/chat/analytics/MediaType;", "onMessageLongClicked", "messageId", "messageText", "isFailed", "", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.n */
public final class C10588n implements ActivityMessageClickingActionHandler, ActivityMessageMediaUnavailableHandler, MessageAvatarClickingActionHandler, MessageLinkClickActionHandler, MessageLongClickingActionHandler {
    /* renamed from: a */
    private final ChatContextualMenuDisplayAction f34395a;
    /* renamed from: b */
    private final MatchProfileDisplayAction f34396b;
    /* renamed from: c */
    private final aj f34397c;
    /* renamed from: d */
    private final ah f34398d;
    /* renamed from: e */
    private final C10538s f34399e;

    @Inject
    public C10588n(@NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull MatchProfileDisplayAction matchProfileDisplayAction, @NotNull aj ajVar, @NotNull ah ahVar, @NotNull C10538s c10538s) {
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(matchProfileDisplayAction, "matchProfileDisplayAction");
        C2668g.b(ajVar, "chatTapMessageEventDispatcher");
        C2668g.b(ahVar, "chatTapLinkEventDispatcher");
        C2668g.b(c10538s, "chatMediaUnavailableDispatcher");
        this.f34395a = chatContextualMenuDisplayAction;
        this.f34396b = matchProfileDisplayAction;
        this.f34397c = ajVar;
        this.f34398d = ahVar;
        this.f34399e = c10538s;
    }

    public void onMediaClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull MessageAction messageAction) {
        String str4 = str;
        C2668g.b(str4, "matchId");
        String str5 = str2;
        C2668g.b(str5, "message");
        String str6 = str3;
        C2668g.b(str6, "contentId");
        MessageAction messageAction2 = messageAction;
        C2668g.b(messageAction2, "messageAction");
        this.f34397c.m42573a(new C8420a(str4, 3, str5, str6, i, messageAction2, null, null, 192, null));
    }

    public void onMessageLongClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, int i, boolean z2) {
        C2668g.b(str, "matchId");
        String str4 = str2;
        C2668g.b(str4, "messageId");
        String str5 = str3;
        C2668g.b(str5, "messageText");
        this.f34395a.showMenu(new C8455a(str4, str5, Type.INBOUND_ACTIVITY_MESSAGE, z, i, null, z2, null, null, 416, null));
    }

    public void onLinkClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "message");
        C2668g.b(str3, "url");
        C2668g.b(dateTime, "messageSentDate");
        this.f34398d.m42571a(new C8419a(str, str2, str3, dateTime));
    }

    public void onAvatarClicked(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "senderId");
        C2668g.b(str2, "matchId");
        this.f34396b.show(str, str2);
    }

    public void onMediaUnavailable(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull MediaType mediaType, @NotNull String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        String str9 = str4;
        C2668g.b(str9, "mediaId");
        MediaType mediaType2 = mediaType;
        C2668g.b(mediaType2, "mediaType");
        String str10 = str5;
        C2668g.b(str10, "url");
        this.f34399e.m42628a(new C8435a(str6, str7, i, str8, str9, mediaType2, str10));
    }
}
