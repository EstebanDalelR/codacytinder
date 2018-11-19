package com.google.android.gms.internal;

import android.support.annotation.Nullable;

@zzzv
public final class ark extends asb {
    /* renamed from: a */
    private final Object f26788a = new Object();
    /* renamed from: b */
    private zzup f26789b;
    /* renamed from: c */
    private zzuj f26790c;

    /* renamed from: a */
    public final void m31503a(@Nullable zzuj zzuj) {
        synchronized (this.f26788a) {
            this.f26790c = zzuj;
        }
    }

    /* renamed from: a */
    public final void m31504a(zzup zzup) {
        synchronized (this.f26788a) {
            this.f26789b = zzup;
        }
    }

    public final void onAdClicked() {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzcj();
            }
        }
    }

    public final void onAdClosed() {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzck();
            }
        }
    }

    public final void onAdFailedToLoad(int i) {
        synchronized (this.f26788a) {
            if (this.f26789b != null) {
                this.f26789b.zzv(i == 3 ? 1 : 2);
                this.f26789b = null;
            }
        }
    }

    public final void onAdImpression() {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzco();
            }
        }
    }

    public final void onAdLeftApplication() {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzcl();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAdLoaded() {
        /*
        r3 = this;
        r0 = r3.f26788a;
        monitor-enter(r0);
        r1 = r3.f26789b;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.f26789b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.zzv(r2);	 Catch:{ all -> 0x001d }
        r1 = 0;
        r3.f26789b = r1;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r1 = r3.f26790c;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r1 = r3.f26790c;	 Catch:{ all -> 0x001d }
        r1.zzcn();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ark.onAdLoaded():void");
    }

    public final void onAdOpened() {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzcm();
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzc(str, str2);
            }
        }
    }

    public final void onVideoEnd() {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zzci();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.zzvg r4) {
        /*
        r3 = this;
        r0 = r3.f26788a;
        monitor-enter(r0);
        r1 = r3.f26789b;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.f26789b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.zza(r2, r4);	 Catch:{ all -> 0x001d }
        r4 = 0;
        r3.f26789b = r4;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r4 = r3.f26790c;	 Catch:{ all -> 0x001d }
        if (r4 == 0) goto L_0x001b;
    L_0x0016:
        r4 = r3.f26790c;	 Catch:{ all -> 0x001d }
        r4.zzcn();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ark.zza(com.google.android.gms.internal.zzvg):void");
    }

    public final void zzb(zzqm zzqm, String str) {
        synchronized (this.f26788a) {
            if (this.f26790c != null) {
                this.f26790c.zza(zzqm, str);
            }
        }
    }
}
