package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.f */
public final class C2498f implements Callback {
    /* renamed from: a */
    private final zzaf f7629a;
    /* renamed from: b */
    private final ArrayList<ConnectionCallbacks> f7630b = new ArrayList();
    /* renamed from: c */
    private ArrayList<ConnectionCallbacks> f7631c = new ArrayList();
    /* renamed from: d */
    private final ArrayList<OnConnectionFailedListener> f7632d = new ArrayList();
    /* renamed from: e */
    private volatile boolean f7633e = false;
    /* renamed from: f */
    private final AtomicInteger f7634f = new AtomicInteger(0);
    /* renamed from: g */
    private boolean f7635g = false;
    /* renamed from: h */
    private final Handler f7636h;
    /* renamed from: i */
    private final Object f7637i = new Object();

    public C2498f(Looper looper, zzaf zzaf) {
        this.f7629a = zzaf;
        this.f7636h = new Handler(looper, this);
    }

    /* renamed from: a */
    public final void m9137a() {
        this.f7633e = false;
        this.f7634f.incrementAndGet();
    }

    /* renamed from: a */
    public final void m9138a(int i) {
        ad.m9051a(Looper.myLooper() == this.f7636h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f7636h.removeMessages(1);
        synchronized (this.f7637i) {
            this.f7635g = true;
            ArrayList arrayList = new ArrayList(this.f7630b);
            int i2 = this.f7634f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) obj;
                if (!this.f7633e || this.f7634f.get() != i2) {
                    break;
                } else if (this.f7630b.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.f7631c.clear();
            this.f7635g = false;
        }
    }

    /* renamed from: a */
    public final void m9139a(Bundle bundle) {
        boolean z = true;
        ad.m9051a(Looper.myLooper() == this.f7636h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f7637i) {
            ad.m9050a(this.f7635g ^ true);
            this.f7636h.removeMessages(1);
            this.f7635g = true;
            if (this.f7631c.size() != 0) {
                z = false;
            }
            ad.m9050a(z);
            ArrayList arrayList = new ArrayList(this.f7630b);
            int i = this.f7634f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) obj;
                if (!this.f7633e || !this.f7629a.isConnected() || this.f7634f.get() != i) {
                    break;
                } else if (!this.f7631c.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.f7631c.clear();
            this.f7635g = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m9140a(com.google.android.gms.common.ConnectionResult r8) {
        /*
        r7 = this;
        r0 = android.os.Looper.myLooper();
        r1 = r7.f7636h;
        r1 = r1.getLooper();
        r2 = 0;
        r3 = 1;
        if (r0 != r1) goto L_0x0010;
    L_0x000e:
        r0 = 1;
        goto L_0x0011;
    L_0x0010:
        r0 = 0;
    L_0x0011:
        r1 = "onConnectionFailure must only be called on the Handler thread";
        com.google.android.gms.common.internal.ad.m9051a(r0, r1);
        r0 = r7.f7636h;
        r0.removeMessages(r3);
        r0 = r7.f7637i;
        monitor-enter(r0);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0058 }
        r3 = r7.f7632d;	 Catch:{ all -> 0x0058 }
        r1.<init>(r3);	 Catch:{ all -> 0x0058 }
        r3 = r7.f7634f;	 Catch:{ all -> 0x0058 }
        r3 = r3.get();	 Catch:{ all -> 0x0058 }
        r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x0058 }
        r4 = r1.size();	 Catch:{ all -> 0x0058 }
    L_0x0031:
        if (r2 >= r4) goto L_0x0056;
    L_0x0033:
        r5 = r1.get(r2);	 Catch:{ all -> 0x0058 }
        r2 = r2 + 1;
        r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5;	 Catch:{ all -> 0x0058 }
        r6 = r7.f7633e;	 Catch:{ all -> 0x0058 }
        if (r6 == 0) goto L_0x0054;
    L_0x003f:
        r6 = r7.f7634f;	 Catch:{ all -> 0x0058 }
        r6 = r6.get();	 Catch:{ all -> 0x0058 }
        if (r6 == r3) goto L_0x0048;
    L_0x0047:
        goto L_0x0054;
    L_0x0048:
        r6 = r7.f7632d;	 Catch:{ all -> 0x0058 }
        r6 = r6.contains(r5);	 Catch:{ all -> 0x0058 }
        if (r6 == 0) goto L_0x0031;
    L_0x0050:
        r5.onConnectionFailed(r8);	 Catch:{ all -> 0x0058 }
        goto L_0x0031;
    L_0x0054:
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return;
    L_0x0056:
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return;
    L_0x0058:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.f.a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final void m9141a(ConnectionCallbacks connectionCallbacks) {
        ad.m9045a((Object) connectionCallbacks);
        synchronized (this.f7637i) {
            if (this.f7630b.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder.append("registerConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f7630b.add(connectionCallbacks);
            }
        }
        if (this.f7629a.isConnected()) {
            this.f7636h.sendMessage(this.f7636h.obtainMessage(1, connectionCallbacks));
        }
    }

    /* renamed from: a */
    public final void m9142a(OnConnectionFailedListener onConnectionFailedListener) {
        ad.m9045a((Object) onConnectionFailedListener);
        synchronized (this.f7637i) {
            if (this.f7632d.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f7632d.add(onConnectionFailedListener);
            }
        }
    }

    /* renamed from: b */
    public final void m9143b() {
        this.f7633e = true;
    }

    /* renamed from: b */
    public final void m9144b(OnConnectionFailedListener onConnectionFailedListener) {
        ad.m9045a((Object) onConnectionFailedListener);
        synchronized (this.f7637i) {
            if (!this.f7632d.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) message.obj;
            synchronized (this.f7637i) {
                if (this.f7633e && this.f7629a.isConnected() && this.f7630b.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(this.f7629a.zzafi());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("GmsClientEvents", stringBuilder.toString(), new Exception());
        return false;
    }
}
