package com.tinder.data.message;

import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.UnknownActivityEvent;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.TextMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"API_MESSAGE_TYPE_DEFAULT", "", "hasUnknownActivityEvent", "", "Lcom/tinder/domain/feed/ActivityFeedItem;", "getHasUnknownActivityEvent", "(Lcom/tinder/domain/feed/ActivityFeedItem;)Z", "toTextMessage", "Lcom/tinder/domain/message/TextMessage;", "Lcom/tinder/domain/message/ActivityMessage;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.o */
public final class C8696o {
    @NotNull
    /* renamed from: a */
    public static final TextMessage m37146a(@NotNull ActivityMessage activityMessage) {
        C2668g.b(activityMessage, "$receiver");
        return new TextMessage(activityMessage.getClientSequentialId(), activityMessage.getId(), activityMessage.getMatchId(), activityMessage.getToId(), activityMessage.getFromId(), activityMessage.getText(), activityMessage.getSentDate(), activityMessage.isLiked(), activityMessage.isSeen(), activityMessage.getDeliveryStatus());
    }

    /* renamed from: b */
    private static final boolean m37148b(@NotNull ActivityFeedItem activityFeedItem) {
        return C2668g.a(activityFeedItem.getActivityEvent(), UnknownActivityEvent.INSTANCE);
    }
}
