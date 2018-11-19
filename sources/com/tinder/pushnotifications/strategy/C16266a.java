package com.tinder.pushnotifications.strategy;

import android.app.NotificationManager;
import android.content.Context;
import com.tinder.module.ForApplication;
import com.tinder.pushnotifications.model.TinderNotification;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/pushnotifications/strategy/BackgroundNotificationStrategy;", "Lcom/tinder/pushnotifications/strategy/NotificationStrategy;", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "sendNotification", "", "notification", "Lcom/tinder/pushnotifications/model/TinderNotification;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.strategy.a */
public final class C16266a implements NotificationStrategy {
    /* renamed from: a */
    private final Context f50667a;
    /* renamed from: b */
    private final NotificationManager f50668b;

    @Inject
    public C16266a(@NotNull @ForApplication Context context, @NotNull NotificationManager notificationManager) {
        C2668g.b(context, "context");
        C2668g.b(notificationManager, "notificationManager");
        this.f50667a = context;
        this.f50668b = notificationManager;
    }

    public void sendNotification(@NotNull TinderNotification tinderNotification) {
        C2668g.b(tinderNotification, "notification");
        this.f50668b.notify(tinderNotification.m55597l(), 1, tinderNotification.mo11932b(this.f50667a).a());
    }
}
