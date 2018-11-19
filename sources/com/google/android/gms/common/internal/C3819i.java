package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C2515a;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.i */
final class C3819i extends C2499g implements Callback {
    /* renamed from: a */
    private final HashMap<C2500h, C2501j> f12067a = new HashMap();
    /* renamed from: b */
    private final Context f12068b;
    /* renamed from: c */
    private final Handler f12069c;
    /* renamed from: d */
    private final C2515a f12070d;
    /* renamed from: e */
    private final long f12071e;
    /* renamed from: f */
    private final long f12072f;

    C3819i(Context context) {
        this.f12068b = context.getApplicationContext();
        this.f12069c = new Handler(context.getMainLooper(), this);
        this.f12070d = C2515a.m9181a();
        this.f12071e = 5000;
        this.f12072f = 300000;
    }

    /* renamed from: a */
    protected final boolean mo2582a(C2500h c2500h, ServiceConnection serviceConnection, String str) {
        boolean a;
        ad.m9046a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f12067a) {
            C2501j c2501j = (C2501j) this.f12067a.get(c2500h);
            if (c2501j != null) {
                this.f12069c.removeMessages(0, c2500h);
                if (!c2501j.m9156a(serviceConnection)) {
                    c2501j.m9153a(serviceConnection, str);
                    switch (c2501j.m9157b()) {
                        case 1:
                            serviceConnection.onServiceConnected(c2501j.m9162e(), c2501j.m9161d());
                            break;
                        case 2:
                            c2501j.m9154a(str);
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(c2500h);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 81);
                stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            c2501j = new C2501j(this, c2500h);
            c2501j.m9153a(serviceConnection, str);
            c2501j.m9154a(str);
            this.f12067a.put(c2500h, c2501j);
            a = c2501j.m9155a();
        }
        return a;
    }

    /* renamed from: b */
    protected final void mo2583b(C2500h c2500h, ServiceConnection serviceConnection, String str) {
        ad.m9046a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f12067a) {
            C2501j c2501j = (C2501j) this.f12067a.get(c2500h);
            String valueOf;
            StringBuilder stringBuilder;
            if (c2501j == null) {
                valueOf = String.valueOf(c2500h);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (c2501j.m9156a(serviceConnection)) {
                c2501j.m9158b(serviceConnection, str);
                if (c2501j.m9160c()) {
                    this.f12069c.sendMessageDelayed(this.f12069c.obtainMessage(0, c2500h), this.f12071e);
                }
            } else {
                valueOf = String.valueOf(c2500h);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 76);
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        C2500h c2500h;
        C2501j c2501j;
        switch (message.what) {
            case 0:
                synchronized (this.f12067a) {
                    c2500h = (C2500h) message.obj;
                    c2501j = (C2501j) this.f12067a.get(c2500h);
                    if (c2501j != null && c2501j.m9160c()) {
                        if (c2501j.m9155a()) {
                            c2501j.m9159b("GmsClientSupervisor");
                        }
                        this.f12067a.remove(c2500h);
                    }
                }
                return true;
            case 1:
                synchronized (this.f12067a) {
                    c2500h = (C2500h) message.obj;
                    c2501j = (C2501j) this.f12067a.get(c2500h);
                    if (c2501j != null && c2501j.m9157b() == 3) {
                        String valueOf = String.valueOf(c2500h);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                        stringBuilder.append(valueOf);
                        Log.wtf("GmsClientSupervisor", stringBuilder.toString(), new Exception());
                        ComponentName e = c2501j.m9162e();
                        if (e == null) {
                            e = c2500h.m9150b();
                        }
                        if (e == null) {
                            e = new ComponentName(c2500h.m9149a(), "unknown");
                        }
                        c2501j.onServiceDisconnected(e);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
