package com.tinder.data.message;

import com.tinder.api.model.updates.Updates.LikedMessage;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.message.MessageLike;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/message/LikedMessageDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/message/MessageLike;", "Lcom/tinder/api/model/updates/Updates$LikedMessage;", "()V", "fromApi", "apiLikedMessage", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.k */
public final class C10838k extends C2646o<MessageLike, LikedMessage> {
    @NotNull
    /* renamed from: a */
    public MessageLike m43290a(@NotNull LikedMessage likedMessage) {
        C2668g.b(likedMessage, "apiLikedMessage");
        String messageId = likedMessage.messageId();
        if (messageId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = likedMessage.matchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Boolean isLiked = likedMessage.isLiked();
        if (isLiked == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        boolean booleanValue = isLiked.booleanValue();
        String updatedAt = likedMessage.updatedAt();
        if (updatedAt == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String likerId = likedMessage.likerId();
        if (likerId != null) {
            return new MessageLike(messageId, matchId, booleanValue, updatedAt, likerId);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
