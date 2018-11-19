package com.leanplum;

import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat.C0382c;
import com.leanplum.callbacks.VariablesChangedCallback;

final class LeanplumPushService$2 extends VariablesChangedCallback {
    /* renamed from: a */
    private /* synthetic */ Builder f25506a;
    /* renamed from: b */
    private /* synthetic */ NotificationManager f25507b;
    /* renamed from: c */
    private /* synthetic */ int f25508c;
    /* renamed from: d */
    private /* synthetic */ C0382c f25509d;

    LeanplumPushService$2(Builder builder, NotificationManager notificationManager, int i, C0382c c0382c) {
        this.f25506a = builder;
        this.f25507b = notificationManager;
        this.f25508c = i;
        this.f25509d = c0382c;
    }

    public final void variablesChanged() {
        if (this.f25506a != null) {
            this.f25507b.notify(this.f25508c, this.f25506a.build());
        } else {
            this.f25507b.notify(this.f25508c, this.f25509d.a());
        }
    }
}
