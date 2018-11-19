package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageLike;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/message/MessageLike;", "invoke"}, k = 3, mv = {1, 1, 10})
final class InsertMessageLikes$lastLikedMessagesPerMatch$1 extends Lambda implements Function1<MessageLike, Boolean> {
    public static final InsertMessageLikes$lastLikedMessagesPerMatch$1 INSTANCE = new InsertMessageLikes$lastLikedMessagesPerMatch$1();

    InsertMessageLikes$lastLikedMessagesPerMatch$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((MessageLike) obj));
    }

    public final boolean invoke(@NotNull MessageLike messageLike) {
        C2668g.b(messageLike, "it");
        return messageLike.isLiked();
    }
}
