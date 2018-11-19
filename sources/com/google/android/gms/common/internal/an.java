package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class an extends Handler {
    /* renamed from: a */
    private /* synthetic */ al f7605a;

    public an(al alVar, Looper looper) {
        this.f7605a = alVar;
        super(looper);
    }

    /* renamed from: a */
    private static void m9100a(Message message) {
        ((ao) message.obj).m9104c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static boolean m9101b(android.os.Message r3) {
        /*
        r0 = r3.what;
        r1 = 1;
        r2 = 2;
        if (r0 == r2) goto L_0x0012;
    L_0x0006:
        r0 = r3.what;
        if (r0 == r1) goto L_0x0012;
    L_0x000a:
        r3 = r3.what;
        r0 = 7;
        if (r3 != r0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r3 = 0;
        return r3;
    L_0x0012:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.an.b(android.os.Message):boolean");
    }

    public final void handleMessage(Message message) {
        if (this.f7605a.f7581c.get() != message.arg1) {
            if (m9101b(message)) {
                m9100a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f7605a.isConnecting()) {
            m9100a(message);
        } else {
            PendingIntent pendingIntent = null;
            ConnectionResult d;
            if (message.what == 4) {
                this.f7605a.f7603y = new ConnectionResult(message.arg2);
                if (!this.f7605a.m9079o() || this.f7605a.f7604z) {
                    d = this.f7605a.f7603y != null ? this.f7605a.f7603y : new ConnectionResult(8);
                    this.f7605a.f7580b.zzf(d);
                    this.f7605a.m9086a(d);
                    return;
                }
                this.f7605a.m9065a(3, null);
            } else if (message.what == 5) {
                d = this.f7605a.f7603y != null ? this.f7605a.f7603y : new ConnectionResult(8);
                this.f7605a.f7580b.zzf(d);
                this.f7605a.m9086a(d);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.f7605a.f7580b.zzf(connectionResult);
                this.f7605a.m9086a(connectionResult);
            } else if (message.what == 6) {
                this.f7605a.m9065a(5, null);
                if (this.f7605a.f7599u != null) {
                    this.f7605a.f7599u.onConnectionSuspended(message.arg2);
                }
                this.f7605a.m9082a(message.arg2);
                this.f7605a.m9068a(5, 1, null);
            } else if (message.what == 2 && !this.f7605a.isConnected()) {
                m9100a(message);
            } else if (m9101b(message)) {
                ((ao) message.obj).m9103b();
            } else {
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Don't know how to handle message: ");
                stringBuilder.append(i);
                Log.wtf("GmsClient", stringBuilder.toString(), new Exception());
            }
        }
    }
}
