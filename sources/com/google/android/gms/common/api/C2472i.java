package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C2467b.C2466a;
import com.google.android.gms.common.api.internal.cf;
import com.google.android.gms.common.api.internal.zzcz;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.common.api.i */
public final class C2472i {
    /* renamed from: a */
    private zzcz f7450a;
    /* renamed from: b */
    private Looper f7451b;

    /* renamed from: a */
    public final C2466a m8913a() {
        if (this.f7450a == null) {
            this.f7450a = new cf();
        }
        if (this.f7451b == null) {
            this.f7451b = Looper.getMainLooper();
        }
        return new C2466a(this.f7450a, this.f7451b);
    }

    /* renamed from: a */
    public final C2472i m8914a(zzcz zzcz) {
        ad.m9046a((Object) zzcz, (Object) "StatusExceptionMapper must not be null.");
        this.f7450a = zzcz;
        return this;
    }
}
