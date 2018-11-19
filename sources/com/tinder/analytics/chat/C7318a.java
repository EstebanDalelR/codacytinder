package com.tinder.analytics.chat;

import com.tinder.common.function.Mapper;
import com.tinder.pushnotifications.model.TinderNotification.NotificationOrigin;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/analytics/chat/ChatAnalyticsOriginResolver;", "Lcom/tinder/common/function/Mapper;", "Lcom/tinder/pushnotifications/model/TinderNotification$NotificationOrigin;", "Lcom/tinder/analytics/chat/Origin;", "()V", "map", "notificationOrigin", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.chat.a */
public final class C7318a implements Mapper<NotificationOrigin, Origin> {
    public /* synthetic */ Object map(Object obj) {
        return m31218a((NotificationOrigin) obj);
    }

    @NotNull
    /* renamed from: a */
    public Origin m31218a(@NotNull NotificationOrigin notificationOrigin) {
        C2668g.b(notificationOrigin, "notificationOrigin");
        switch (C6216b.f22779a[notificationOrigin.ordinal()]) {
            case 1:
                return Origin.IN_APP_NOTIFICATION;
            case 2:
                return Origin.PUSH_NOTIFICATION;
            case 3:
                return Origin.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
