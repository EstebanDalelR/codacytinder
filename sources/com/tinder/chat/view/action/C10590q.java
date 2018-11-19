package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MessageAction;
import com.tinder.chat.analytics.aj;
import com.tinder.chat.analytics.aj.C8420a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016JH\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0016JL\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/chat/view/action/InboundImageMessageActionHandler;", "Lcom/tinder/chat/view/action/ImageMessageClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLikingActionHandler;", "Lcom/tinder/chat/view/action/MessageAvatarClickingActionHandler;", "likingAction", "Lcom/tinder/chat/view/action/MessageLikingAction;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "matchProfileDisplayAction", "Lcom/tinder/chat/view/action/MatchProfileDisplayAction;", "chatTapMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;", "matchId", "", "(Lcom/tinder/chat/view/action/MessageLikingAction;Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/view/action/MatchProfileDisplayAction;Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;Ljava/lang/String;)V", "onAvatarClicked", "", "senderId", "onImageLongClicked", "messageId", "imageUrl", "isFailed", "", "messageIndex", "", "contentId", "isLiked", "contentSource", "contentUrl", "onLiked", "messageType", "messageText", "onUnliked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.q */
public final class C10590q implements ImageMessageClickingActionHandler, MessageAvatarClickingActionHandler, MessageLikingActionHandler {
    /* renamed from: a */
    private final C8465w f34404a;
    /* renamed from: b */
    private final ChatContextualMenuDisplayAction f34405b;
    /* renamed from: c */
    private final MatchProfileDisplayAction f34406c;
    /* renamed from: d */
    private final aj f34407d;
    /* renamed from: e */
    private final String f34408e;

    @Inject
    public C10590q(@NotNull C8465w c8465w, @NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull MatchProfileDisplayAction matchProfileDisplayAction, @NotNull aj ajVar, @NotNull String str) {
        C2668g.b(c8465w, "likingAction");
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(matchProfileDisplayAction, "matchProfileDisplayAction");
        C2668g.b(ajVar, "chatTapMessageEventDispatcher");
        C2668g.b(str, "matchId");
        this.f34404a = c8465w;
        this.f34405b = chatContextualMenuDisplayAction;
        this.f34406c = matchProfileDisplayAction;
        this.f34407d = ajVar;
        this.f34408e = str;
    }

    public void onImageLongClicked(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, boolean z2, @NotNull String str4, @NotNull String str5) {
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
        ChatContextualMenuDisplayAction chatContextualMenuDisplayAction = this.f34405b;
        int i2 = i;
        String str11 = str9;
        C8455a c8455a = r2;
        C8455a c8455a2 = new C8455a(str6, str7, Type.INBOUND_IMAGE_MESSAGE, z, i2, str8, z2, str11, str10);
        chatContextualMenuDisplayAction.showMenu(c8455a);
        this.f34407d.m42573a(new C8420a(this.f34408e, 4, str7, str8, i2, MessageAction.NONE, str4, str10));
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
        this.f34404a.m36212a(str7, str8, i, str9, str10, i2, str5, str6);
    }

    public void onUnliked(@NotNull String str) {
        C2668g.b(str, "messageId");
        this.f34404a.m36211a(str);
    }

    public void onAvatarClicked(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "senderId");
        C2668g.b(str2, "matchId");
        this.f34406c.show(str, str2);
    }
}
