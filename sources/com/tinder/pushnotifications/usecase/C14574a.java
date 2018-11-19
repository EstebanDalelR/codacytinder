package com.tinder.pushnotifications.usecase;

import android.app.NotificationManager;
import com.tinder.pushnotifications.model.C16261l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/pushnotifications/usecase/CancelNotification;", "", "notificationManager", "Landroid/app/NotificationManager;", "(Landroid/app/NotificationManager;)V", "execute", "", "notification", "Lcom/tinder/pushnotifications/model/RemoveNotification;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.usecase.a */
public final class C14574a {
    /* renamed from: a */
    private final NotificationManager f46007a;

    @Inject
    public C14574a(@NotNull NotificationManager notificationManager) {
        C2668g.b(notificationManager, "notificationManager");
        this.f46007a = notificationManager;
    }

    /* renamed from: a */
    public final void m55609a(@NotNull C16261l c16261l) {
        C2668g.b(c16261l, "notification");
        for (String cancel : c16261l.m61437i()) {
            this.f46007a.cancel(cancel, 1);
        }
    }
}
