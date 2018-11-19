package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;

@zzzv
/* renamed from: com.google.android.gms.internal.p */
public final class C7359p extends C6268l implements zzf, zzg {
    /* renamed from: a */
    private Context f27045a;
    /* renamed from: b */
    private zzakd f27046b;
    /* renamed from: c */
    private zzalh<zzaat> f27047c;
    /* renamed from: d */
    private final zzaal f27048d;
    /* renamed from: e */
    private final Object f27049e = new Object();
    /* renamed from: f */
    private C6271q f27050f;

    public C7359p(Context context, zzakd zzakd, zzalh<zzaat> zzalh, zzaal zzaal) {
        super(zzalh, zzaal);
        this.f27045a = context;
        this.f27046b = zzakd;
        this.f27047c = zzalh;
        this.f27048d = zzaal;
        this.f27050f = new C6271q(context, ((Boolean) aja.m19221f().m19334a(alo.f15425C)).booleanValue() ? ar.s().m19836a() : context.getMainLooper(), this, this, this.f27046b.zzdek);
        this.f27050f.i();
    }

    /* renamed from: a */
    public final void mo6897a() {
        synchronized (this.f27049e) {
            if (this.f27050f.isConnected() || this.f27050f.isConnecting()) {
                this.f27050f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: b */
    public final com.google.android.gms.internal.zzabb mo6898b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f27049e;
        monitor-enter(r0);
        r1 = r2.f27050f;	 Catch:{ IllegalStateException -> 0x000d, IllegalStateException -> 0x000d }
        r1 = r1.m27441c();	 Catch:{ IllegalStateException -> 0x000d, IllegalStateException -> 0x000d }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r1 = move-exception;	 Catch:{ all -> 0x000b }
        goto L_0x0010;	 Catch:{ all -> 0x000b }
    L_0x000d:
        r1 = 0;	 Catch:{ all -> 0x000b }
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        return r1;	 Catch:{ all -> 0x000b }
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000b }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p.b():com.google.android.gms.internal.zzabb");
    }

    public final void onConnected(Bundle bundle) {
        zznd();
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        hx.m19911b("Cannot connect to remote service, fallback to local instance.");
        new C7358o(this.f27045a, this.f27047c, this.f27048d).zznd();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        ar.e().m19754b(this.f27045a, this.f27046b.zzcv, "gmob-apps", bundle, true);
    }

    public final void onConnectionSuspended(int i) {
        hx.m19911b("Disconnected from remote ad request service.");
    }
}
