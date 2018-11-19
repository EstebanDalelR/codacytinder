package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzanh;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.t */
final class C3776t implements zzt<zzanh> {
    /* renamed from: a */
    private /* synthetic */ CountDownLatch f11837a;

    C3776t(CountDownLatch countDownLatch) {
        this.f11837a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzanh zzanh = (zzanh) obj;
        ec.e("Adapter returned an ad, but assets substitution failed");
        this.f11837a.countDown();
        zzanh.destroy();
    }
}
