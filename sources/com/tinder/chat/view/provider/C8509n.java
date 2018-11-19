package com.tinder.chat.view.provider;

import com.tinder.chat.view.model.C8503z;
import com.tinder.domain.message.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J>\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¨\u0006\u0014"}, d2 = {"Lcom/tinder/chat/view/provider/ChatItemPositionInfoResolver;", "", "()V", "isNewestInCurrentDirection", "", "currentMessage", "Lcom/tinder/domain/message/Message;", "newerMessage", "isNewestInTimeBatch", "isOldestInCurrentDirection", "olderMessage", "isOldestInTimeBatch", "resolvePositionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "messageIndex", "", "isNewestInEntireDirection", "precedesTypingIndicator", "hasConsiderableTimeDifferenceTo", "message", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.view.provider.n */
public final class C8509n {
    @NotNull
    /* renamed from: a */
    public final C8503z m36456a(int i, @Nullable Message message, @NotNull Message message2, @Nullable Message message3, boolean z, boolean z2) {
        C8509n c8509n = this;
        Message message4 = message;
        Message message5 = message2;
        Message message6 = message3;
        C2668g.b(message5, "currentMessage");
        return new C8503z(i, message6 == null, m36451a(message5, message6), m36454d(message5, message6), z, message4 == null, m36452b(message5, message4), m36453c(message5, message4), z2);
    }

    /* renamed from: a */
    private final boolean m36451a(Message message, Message message2) {
        if (message2 != null) {
            if (m36455e(message, message2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m36452b(Message message, Message message2) {
        if (message2 != null) {
            if (m36455e(message, message2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m36453c(Message message, Message message2) {
        if (message2 != null) {
            return (C2668g.a(message2.getFromId(), message.getFromId()) ^ 1) != null;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m36454d(Message message, Message message2) {
        if (message2 != null) {
            return (C2668g.a(message2.getFromId(), message.getFromId()) ^ 1) != null;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private final boolean m36455e(@NotNull Message message, Message message2) {
        return Math.abs(message.getSentDate().getMillis() - message2.getSentDate().getMillis()) >= C8510o.f30244a ? true : null;
    }
}
