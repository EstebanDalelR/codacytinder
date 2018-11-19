package com.tinder.chat.view.action;

import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider.C8505a;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider.From;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016JL\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J0\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/chat/view/action/InboundReactionMessageViewActionHandler;", "Lcom/tinder/chat/view/action/ReactionClickingActionHandler;", "Lcom/tinder/chat/view/action/MessageLikingActionHandler;", "Lcom/tinder/chat/view/action/MessageAvatarClickingActionHandler;", "reactionChatItemClickProvider", "Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;", "likingAction", "Lcom/tinder/chat/view/action/MessageLikingAction;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "matchProfileDisplayAction", "Lcom/tinder/chat/view/action/MatchProfileDisplayAction;", "(Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;Lcom/tinder/chat/view/action/MessageLikingAction;Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/view/action/MatchProfileDisplayAction;)V", "onAvatarClicked", "", "senderId", "", "matchId", "onLiked", "messageId", "messageType", "", "messageText", "contentId", "messageIndex", "contentSource", "contentUrl", "onReactionClicked", "reactionId", "onReactionLongClicked", "isFailed", "", "isLiked", "onUnliked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.action.r */
public final class C10591r implements MessageAvatarClickingActionHandler, MessageLikingActionHandler, ReactionClickingActionHandler {
    /* renamed from: a */
    private final ReactionChatItemClickedProvider f34409a;
    /* renamed from: b */
    private final C8465w f34410b;
    /* renamed from: c */
    private final ChatContextualMenuDisplayAction f34411c;
    /* renamed from: d */
    private final MatchProfileDisplayAction f34412d;

    @Inject
    public C10591r(@NotNull ReactionChatItemClickedProvider reactionChatItemClickedProvider, @NotNull C8465w c8465w, @NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull MatchProfileDisplayAction matchProfileDisplayAction) {
        C2668g.b(reactionChatItemClickedProvider, "reactionChatItemClickProvider");
        C2668g.b(c8465w, "likingAction");
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(matchProfileDisplayAction, "matchProfileDisplayAction");
        this.f34409a = reactionChatItemClickedProvider;
        this.f34410b = c8465w;
        this.f34411c = chatContextualMenuDisplayAction;
        this.f34412d = matchProfileDisplayAction;
    }

    public void onReactionClicked(@NotNull String str) {
        C2668g.b(str, "reactionId");
        this.f34409a.m36440a(new C8505a(str, From.RECEIVER));
    }

    public void onReactionLongClicked(@NotNull String str, boolean z, int i, @NotNull String str2, boolean z2) {
        String str3 = str;
        C2668g.b(str3, "messageId");
        String str4 = str2;
        C2668g.b(str4, "contentId");
        this.f34411c.showMenu(new C8455a(str3, "", Type.INBOUND_REACTION_MESSAGE, z, i, str4, z2, null, null, 384, null));
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
        C8465w.m36209a(this.f34410b, str7, str8, i, str9, str10, i2, null, null, 192, null);
    }

    public void onUnliked(@NotNull String str) {
        C2668g.b(str, "messageId");
        this.f34410b.m36211a(str);
    }

    public void onAvatarClicked(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "senderId");
        C2668g.b(str2, "matchId");
        this.f34412d.show(str, str2);
    }
}
