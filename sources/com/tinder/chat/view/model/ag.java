package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.Reaction;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.reactions.model.GrandGestureType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "Lcom/tinder/chat/view/model/MessageViewModel;", "Lcom/tinder/domain/message/ReactionMessage;", "message", "collapsedMessages", "", "Lcom/tinder/domain/message/Message;", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "matchId", "senderName", "(Lcom/tinder/domain/message/ReactionMessage;Ljava/util/List;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "reaction", "Lcom/tinder/domain/message/Reaction;", "getReaction", "()Lcom/tinder/domain/message/Reaction;", "getSenderName", "()Ljava/lang/String;", "sentCounter", "", "getSentCounter", "()I", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "grandGestureType$Tinder_release", "hasCollapsedId", "", "id", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ag extends MessageViewModel<ReactionMessage> {
    @NotNull
    /* renamed from: a */
    private final Reaction f41114a;
    /* renamed from: b */
    private final int f41115b;
    @NotNull
    /* renamed from: c */
    private final String f41116c;

    @NotNull
    /* renamed from: q */
    public final String m50167q() {
        return this.f41116c;
    }

    public ag(@NotNull ReactionMessage reactionMessage, @NotNull List<? extends Message> list, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C2668g.b(reactionMessage, "message");
        C2668g.b(list, "collapsedMessages");
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c8503z, "positionInfo");
        C2668g.b(str2, "avatarUrl");
        C2668g.b(str3, "matchId");
        C2668g.b(str4, "senderName");
        super(reactionMessage, str, c8503z, str2, str3, list);
        this.f41116c = str4;
        this.f41114a = new Reaction(reactionMessage.getReaction().getId());
        this.f41115b = list.size() + 1;
    }

    @NotNull
    /* renamed from: a */
    public final Reaction m50164a() {
        return this.f41114a;
    }

    /* renamed from: b */
    public final int m50165b() {
        return this.f41115b;
    }

    public boolean hasCollapsedId(long j) {
        return m42897d().contains(Long.valueOf(j));
    }

    @NotNull
    /* renamed from: c */
    public final GrandGestureType m50166c() {
        return this.f41114a.grandGestureType();
    }
}
