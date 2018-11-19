package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.zzf;

final class apf implements zzf {
    /* renamed from: a */
    final /* synthetic */ apd f23038a;
    /* renamed from: b */
    private /* synthetic */ iw f23039b;
    /* renamed from: c */
    private /* synthetic */ zzrr f23040c;

    apf(apd apd, iw iwVar, zzrr zzrr) {
        this.f23038a = apd;
        this.f23039b = iwVar;
        this.f23040c = zzrr;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f23038a.f23037d) {
            if (this.f23038a.f23035b) {
                return;
            }
            this.f23038a.f23035b = true;
            aoz d = this.f23038a.f23034a;
            if (d == null) {
                return;
            }
            this.f23039b.zza(new api(this.f23039b, fe.m19676a(new aph(this, d, this.f23039b, this.f23040c))), ir.f16196b);
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
