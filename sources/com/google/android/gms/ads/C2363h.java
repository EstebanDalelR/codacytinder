package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.aki;
import com.google.android.gms.internal.zzje;

/* renamed from: com.google.android.gms.ads.h */
public final class C2363h {
    /* renamed from: a */
    private final aki f7068a;

    public C2363h(Context context) {
        this.f7068a = new aki(context);
        ad.m9046a((Object) context, (Object) "Context cannot be null");
    }

    /* renamed from: a */
    public final void m8609a() {
        this.f7068a.a();
    }

    /* renamed from: a */
    public final void m8610a(C2338a c2338a) {
        this.f7068a.a(c2338a);
        if (c2338a == null || !(c2338a instanceof zzje)) {
            if (c2338a == null) {
                this.f7068a.a(null);
            }
            return;
        }
        this.f7068a.a((zzje) c2338a);
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public final void m8611a(C2342c c2342c) {
        this.f7068a.a(c2342c.m8561a());
    }

    /* renamed from: a */
    public final void m8612a(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f7068a.a(rewardedVideoAdListener);
    }

    /* renamed from: a */
    public final void m8613a(String str) {
        this.f7068a.a(str);
    }

    /* renamed from: a */
    public final void m8614a(boolean z) {
        this.f7068a.a(true);
    }

    /* renamed from: b */
    public final void m8615b(boolean z) {
        this.f7068a.b(z);
    }
}
