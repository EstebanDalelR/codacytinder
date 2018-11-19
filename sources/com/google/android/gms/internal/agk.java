package com.google.android.gms.internal;

import com.tinder.api.ManagerWebServices;

public final class agk implements zzaa {
    /* renamed from: a */
    private int f22941a;
    /* renamed from: b */
    private int f22942b;
    /* renamed from: c */
    private final int f22943c;
    /* renamed from: d */
    private final float f22944d;

    public agk() {
        this(ManagerWebServices.FB_WEAR_TIMEOUT, 1, 1.0f);
    }

    private agk(int i, int i2, float f) {
        this.f22941a = ManagerWebServices.FB_WEAR_TIMEOUT;
        this.f22943c = 1;
        this.f22944d = 1.0f;
    }

    public final void zza(zzad zzad) throws zzad {
        int i = 1;
        this.f22942b++;
        this.f22941a = (int) (((float) this.f22941a) + (((float) this.f22941a) * this.f22944d));
        if (this.f22942b > this.f22943c) {
            i = 0;
        }
        if (i == 0) {
            throw zzad;
        }
    }

    public final int zzb() {
        return this.f22941a;
    }

    public final int zzc() {
        return this.f22942b;
    }
}
