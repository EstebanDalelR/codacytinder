package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzg;

final class apj implements zzg {
    /* renamed from: a */
    private /* synthetic */ iw f23041a;
    /* renamed from: b */
    private /* synthetic */ apd f23042b;

    apj(apd apd, iw iwVar) {
        this.f23042b = apd;
        this.f23041a = iwVar;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f23042b.f23037d) {
            this.f23041a.m27363a(new RuntimeException("Connection failed."));
        }
    }
}
