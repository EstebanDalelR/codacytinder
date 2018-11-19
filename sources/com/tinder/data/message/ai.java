package com.tinder.data.message;

import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"DEFAULT_MESSAGE_COUNT", "", "type", "Lcom/tinder/data/message/MessageType;", "Lcom/tinder/domain/message/Message;", "getType", "(Lcom/tinder/domain/message/Message;)Lcom/tinder/data/message/MessageType;", "data_release"}, k = 2, mv = {1, 1, 10})
public final class ai {
    @NotNull
    /* renamed from: a */
    public static final MessageType m37117a(@NotNull Message message) {
        C2668g.b(message, "$receiver");
        if (message instanceof TextMessage) {
            return MessageType.TEXT;
        }
        if (message instanceof GifMessage) {
            return MessageType.GIF;
        }
        if (message instanceof ReactionMessage) {
            return MessageType.REACTION;
        }
        if (message instanceof ActivityMessage) {
            return MessageType.ACTIVITY;
        }
        if (message instanceof ImageMessage) {
            return MessageType.IMAGE;
        }
        if ((message instanceof SystemMessage) != null) {
            return MessageType.SYSTEM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
