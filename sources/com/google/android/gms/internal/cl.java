package com.google.android.gms.internal;

import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzzv
public final class cl extends cq {
    /* renamed from: a */
    private volatile zzaee f26870a;
    /* renamed from: b */
    private volatile zzaeh f26871b;
    /* renamed from: c */
    private volatile zzaef f26872c;

    public cl(zzaef zzaef) {
        this.f26872c = zzaef;
    }

    /* renamed from: a */
    public final void m31550a(zzaee zzaee) {
        this.f26870a = zzaee;
    }

    /* renamed from: a */
    public final void m31551a(zzaeh zzaeh) {
        this.f26871b = zzaeh;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaeq zzaeq) {
        if (this.f26872c != null) {
            this.f26872c.zzc(zzaeq);
        }
    }

    public final void zzc(IObjectWrapper iObjectWrapper, int i) {
        if (this.f26870a != null) {
            this.f26870a.zzaa(i);
        }
    }

    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
        if (this.f26871b != null) {
            this.f26871b.zza(C4296b.a(iObjectWrapper).getClass().getName(), i);
        }
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
        if (this.f26870a != null) {
            this.f26870a.zzof();
        }
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        if (this.f26871b != null) {
            this.f26871b.zzbr(C4296b.a(iObjectWrapper).getClass().getName());
        }
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (this.f26872c != null) {
            this.f26872c.onRewardedVideoAdOpened();
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        if (this.f26872c != null) {
            this.f26872c.onRewardedVideoStarted();
        }
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        if (this.f26872c != null) {
            this.f26872c.onRewardedVideoAdClosed();
        }
    }

    public final void zzr(IObjectWrapper iObjectWrapper) {
        if (this.f26872c != null) {
            this.f26872c.zzoc();
        }
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        if (this.f26872c != null) {
            this.f26872c.onRewardedVideoAdLeftApplication();
        }
    }
}
