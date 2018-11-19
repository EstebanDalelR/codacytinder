package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.zzj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.p */
final class C3804p implements zzj {
    /* renamed from: a */
    private final WeakReference<C3803n> f12027a;
    /* renamed from: b */
    private final Api<?> f12028b;
    /* renamed from: c */
    private final boolean f12029c;

    public C3804p(C3803n c3803n, Api<?> api, boolean z) {
        this.f12027a = new WeakReference(c3803n);
        this.f12028b = api;
        this.f12029c = z;
    }

    public final void zzf(@NonNull ConnectionResult connectionResult) {
        C3803n c3803n = (C3803n) this.f12027a.get();
        if (c3803n != null) {
            ad.m9051a(Looper.myLooper() == c3803n.f12006a.f13947d.mo2502c(), (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            c3803n.f12007b.lock();
            try {
                if (c3803n.m14391a(0)) {
                    if (!connectionResult.isSuccess()) {
                        c3803n.m14384a(connectionResult, this.f12028b, this.f12029c);
                    }
                    if (c3803n.m14390a()) {
                        c3803n.m14396b();
                    }
                }
                c3803n.f12007b.unlock();
            } catch (Throwable th) {
                c3803n.f12007b.unlock();
            }
        }
    }
}
