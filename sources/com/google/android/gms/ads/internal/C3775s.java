package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzanh;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.s */
final class C3775s implements zzt<zzanh> {
    /* renamed from: a */
    private /* synthetic */ CountDownLatch f11836a;

    C3775s(CountDownLatch countDownLatch) {
        this.f11836a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        this.f11836a.countDown();
        if (zzanh == null) {
            throw null;
        }
        ((View) zzanh).setVisibility(0);
    }
}
