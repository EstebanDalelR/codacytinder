package com.tinder.chat.view.action;

import com.tinder.chat.analytics.ab;
import com.tinder.chat.analytics.ab.C8415a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.C8455a;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction.Type;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider.C8505a;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider.From;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J0\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/chat/view/action/OutboundReactionMessageViewActionHandler;", "Lcom/tinder/chat/view/action/ReactionClickingActionHandler;", "reactionChatItemClickProvider", "Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;", "menuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "chatSendErrorOptionsEvent", "Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;", "matchId", "", "(Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;Lcom/tinder/chat/analytics/ChatSendErrorOptionsEventDispatcher;Ljava/lang/String;)V", "onReactionClicked", "", "reactionId", "onReactionLongClicked", "messageId", "isFailed", "", "messageIndex", "", "contentId", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ai implements ReactionClickingActionHandler {
    /* renamed from: a */
    private final ReactionChatItemClickedProvider f34368a;
    /* renamed from: b */
    private final ChatContextualMenuDisplayAction f34369b;
    /* renamed from: c */
    private final ab f34370c;
    /* renamed from: d */
    private final String f34371d;

    @Inject
    public ai(@NotNull ReactionChatItemClickedProvider reactionChatItemClickedProvider, @NotNull ChatContextualMenuDisplayAction chatContextualMenuDisplayAction, @NotNull ab abVar, @NotNull String str) {
        C2668g.b(reactionChatItemClickedProvider, "reactionChatItemClickProvider");
        C2668g.b(chatContextualMenuDisplayAction, "menuDisplayAction");
        C2668g.b(abVar, "chatSendErrorOptionsEvent");
        C2668g.b(str, "matchId");
        this.f34368a = reactionChatItemClickedProvider;
        this.f34369b = chatContextualMenuDisplayAction;
        this.f34370c = abVar;
        this.f34371d = str;
    }

    public void onReactionClicked(@NotNull String str) {
        C2668g.b(str, "reactionId");
        this.f34368a.m36440a(new C8505a(str, From.SENDER));
    }

    public void onReactionLongClicked(@NotNull String str, boolean z, int i, @NotNull String str2, boolean z2) {
        ai aiVar = this;
        String str3 = str;
        C2668g.b(str3, "messageId");
        String str4 = str2;
        C2668g.b(str4, "contentId");
        if (z) {
            aiVar.f34370c.m42563a(new C8415a(aiVar.f34371d, 2, "", i, str4, null, null, 96, null));
        }
        ChatContextualMenuDisplayAction chatContextualMenuDisplayAction = aiVar.f34369b;
        C8455a c8455a = r2;
        C8455a c8455a2 = new C8455a(str3, "", Type.OUTBOUND_REACTION_MESSAGE, z, i, str4, z2, null, null, 384, null);
        chatContextualMenuDisplayAction.showMenu(c8455a);
    }
}
