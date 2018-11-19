package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class akj {
    /* renamed from: a */
    private static akj f15395a;
    /* renamed from: b */
    private static final Object f15396b = new Object();
    /* renamed from: c */
    private zzlg f15397c;
    /* renamed from: d */
    private RewardedVideoAd f15398d;

    private akj() {
    }

    /* renamed from: a */
    public static akj m19303a() {
        akj akj;
        synchronized (f15396b) {
            if (f15395a == null) {
                f15395a = new akj();
            }
            akj = f15395a;
        }
        return akj;
    }

    /* renamed from: a */
    public final RewardedVideoAd m19304a(Context context) {
        synchronized (f15396b) {
            if (this.f15398d != null) {
                RewardedVideoAd rewardedVideoAd = this.f15398d;
                return rewardedVideoAd;
            }
            this.f15398d = new cd(context, (zzadk) aiq.m19203a(context, false, new aix(aja.m19217b(), context, new arv())));
            rewardedVideoAd = this.f15398d;
            return rewardedVideoAd;
        }
    }

    /* renamed from: a */
    public final void m19305a(Context context, String str, akl akl) {
        synchronized (f15396b) {
            if (this.f15397c != null) {
                return;
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            } else {
                try {
                    this.f15397c = (zzlg) aiq.m19203a(context, false, new aiv(aja.m19217b(), context));
                    this.f15397c.initialize();
                    if (str != null) {
                        this.f15397c.zza(str, C4296b.a(new akk(this, context)));
                    }
                } catch (Throwable e) {
                    hx.m19914c("MobileAdsSettingManager initialization failed", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final float m19306b() {
        if (this.f15397c == null) {
            return 1.0f;
        }
        try {
            return this.f15397c.zzdn();
        } catch (Throwable e) {
            hx.m19912b("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    /* renamed from: c */
    public final boolean m19307c() {
        if (this.f15397c == null) {
            return false;
        }
        try {
            return this.f15397c.zzdo();
        } catch (Throwable e) {
            hx.m19912b("Unable to get app mute state.", e);
            return false;
        }
    }
}
