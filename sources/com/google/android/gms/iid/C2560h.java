package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.VisibleForTesting;
import android.util.Log;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.android.gms.iid.h */
public final class C2560h implements ServiceConnection {
    /* renamed from: a */
    private final Context f7776a;
    /* renamed from: b */
    private final Intent f7777b;
    /* renamed from: c */
    private final ScheduledExecutorService f7778c;
    /* renamed from: d */
    private final Queue<C2556d> f7779d;
    /* renamed from: e */
    private C2558f f7780e;
    /* renamed from: f */
    private boolean f7781f;

    public C2560h(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    @VisibleForTesting
    private C2560h(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f7779d = new LinkedList();
        this.f7781f = false;
        this.f7776a = context.getApplicationContext();
        this.f7777b = new Intent(str).setPackage(this.f7776a.getPackageName());
        this.f7778c = scheduledExecutorService;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final synchronized void m9309a() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = "EnhancedIntentService";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00b5 }
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = "EnhancedIntentService";
        r2 = "flush queue called";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00b5 }
    L_0x0011:
        r0 = r5.f7779d;	 Catch:{ all -> 0x00b5 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00b5 }
        if (r0 != 0) goto L_0x00b3;
    L_0x0019:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00b5 }
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        r0 = "EnhancedIntentService";
        r2 = "found intent to be delivered";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00b5 }
    L_0x0028:
        r0 = r5.f7780e;	 Catch:{ all -> 0x00b5 }
        if (r0 == 0) goto L_0x0051;
    L_0x002c:
        r0 = r5.f7780e;	 Catch:{ all -> 0x00b5 }
        r0 = r0.isBinderAlive();	 Catch:{ all -> 0x00b5 }
        if (r0 == 0) goto L_0x0051;
    L_0x0034:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00b5 }
        if (r0 == 0) goto L_0x0043;
    L_0x003c:
        r0 = "EnhancedIntentService";
        r2 = "binder is alive, sending the intent.";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00b5 }
    L_0x0043:
        r0 = r5.f7779d;	 Catch:{ all -> 0x00b5 }
        r0 = r0.poll();	 Catch:{ all -> 0x00b5 }
        r0 = (com.google.android.gms.iid.C2556d) r0;	 Catch:{ all -> 0x00b5 }
        r2 = r5.f7780e;	 Catch:{ all -> 0x00b5 }
        r2.m9308a(r0);	 Catch:{ all -> 0x00b5 }
        goto L_0x0011;
    L_0x0051:
        r0 = "EnhancedIntentService";
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00b5 }
        r1 = 1;
        if (r0 == 0) goto L_0x0075;
    L_0x005a:
        r0 = "EnhancedIntentService";
        r2 = r5.f7781f;	 Catch:{ all -> 0x00b5 }
        r2 = r2 ^ r1;
        r3 = 39;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b5 }
        r4.<init>(r3);	 Catch:{ all -> 0x00b5 }
        r3 = "binder is dead. start connection? ";
        r4.append(r3);	 Catch:{ all -> 0x00b5 }
        r4.append(r2);	 Catch:{ all -> 0x00b5 }
        r2 = r4.toString();	 Catch:{ all -> 0x00b5 }
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x00b5 }
    L_0x0075:
        r0 = r5.f7781f;	 Catch:{ all -> 0x00b5 }
        if (r0 != 0) goto L_0x00b1;
    L_0x0079:
        r5.f7781f = r1;	 Catch:{ all -> 0x00b5 }
        r0 = com.google.android.gms.common.stats.C2515a.m9181a();	 Catch:{ SecurityException -> 0x0095 }
        r1 = r5.f7776a;	 Catch:{ SecurityException -> 0x0095 }
        r2 = r5.f7777b;	 Catch:{ SecurityException -> 0x0095 }
        r3 = 65;
        r0 = r0.m9182a(r1, r2, r5, r3);	 Catch:{ SecurityException -> 0x0095 }
        if (r0 == 0) goto L_0x008d;
    L_0x008b:
        monitor-exit(r5);
        return;
    L_0x008d:
        r0 = "EnhancedIntentService";
        r1 = "binding to the service failed";
        android.util.Log.e(r0, r1);	 Catch:{ SecurityException -> 0x0095 }
        goto L_0x009d;
    L_0x0095:
        r0 = move-exception;
        r1 = "EnhancedIntentService";
        r2 = "Exception while binding the service";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x00b5 }
    L_0x009d:
        r0 = r5.f7779d;	 Catch:{ all -> 0x00b5 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00b5 }
        if (r0 != 0) goto L_0x00b1;
    L_0x00a5:
        r0 = r5.f7779d;	 Catch:{ all -> 0x00b5 }
        r0 = r0.poll();	 Catch:{ all -> 0x00b5 }
        r0 = (com.google.android.gms.iid.C2556d) r0;	 Catch:{ all -> 0x00b5 }
        r0.m9306a();	 Catch:{ all -> 0x00b5 }
        goto L_0x009d;
    L_0x00b1:
        monitor-exit(r5);
        return;
    L_0x00b3:
        monitor-exit(r5);
        return;
    L_0x00b5:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.h.a():void");
    }

    /* renamed from: a */
    public final synchronized void m9310a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f7779d.add(new C2556d(intent, pendingResult, this.f7778c));
        m9309a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f7781f = false;
            this.f7780e = (C2558f) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("onServiceConnected: ");
                stringBuilder.append(valueOf);
                Log.d("EnhancedIntentService", stringBuilder.toString());
            }
            m9309a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("onServiceDisconnected: ");
            stringBuilder.append(valueOf);
            Log.d("EnhancedIntentService", stringBuilder.toString());
        }
        m9309a();
    }
}
