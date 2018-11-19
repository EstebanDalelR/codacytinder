package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzzv
public final class bo extends bu {
    /* renamed from: a */
    private final Context f26853a;
    /* renamed from: b */
    private final Object f26854b;
    /* renamed from: c */
    private final zzakd f26855c;
    /* renamed from: d */
    private final bp f26856d;

    public bo(Context context, bn bnVar, zzux zzux, zzakd zzakd) {
        this(context, zzakd, new bp(context, bnVar, zzjn.zzhs(), zzux, zzakd));
    }

    private bo(Context context, zzakd zzakd, bp bpVar) {
        this.f26854b = new Object();
        this.f26853a = context;
        this.f26855c = zzakd;
        this.f26856d = bpVar;
    }

    public final void destroy() {
        zzd(null);
    }

    public final String getMediationAdapterClassName() {
        String mediationAdapterClassName;
        synchronized (this.f26854b) {
            mediationAdapterClassName = this.f26856d.getMediationAdapterClassName();
        }
        return mediationAdapterClassName;
    }

    public final boolean isLoaded() {
        boolean i;
        synchronized (this.f26854b) {
            i = this.f26856d.m34579i();
        }
        return i;
    }

    public final void pause() {
        zzb(null);
    }

    public final void resume() {
        zzc(null);
    }

    public final void setImmersiveMode(boolean z) {
        synchronized (this.f26854b) {
            this.f26856d.setImmersiveMode(z);
        }
    }

    public final void setUserId(String str) {
        synchronized (this.f26854b) {
            this.f26856d.setUserId(str);
        }
    }

    public final void show() {
        synchronized (this.f26854b) {
            this.f26856d.m34578h();
        }
    }

    public final void zza(zzadp zzadp) {
        synchronized (this.f26854b) {
            this.f26856d.zza(zzadp);
        }
    }

    public final void zza(zzadv zzadv) {
        synchronized (this.f26854b) {
            this.f26856d.m34574a(zzadv);
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        synchronized (this.f26854b) {
            this.f26856d.pause();
        }
    }

    public final void zzc(IObjectWrapper iObjectWrapper) {
        synchronized (this.f26854b) {
            Context context;
            if (iObjectWrapper == null) {
                context = null;
            } else {
                try {
                    context = (Context) C4296b.a(iObjectWrapper);
                } catch (Throwable e) {
                    hx.m19914c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f26856d.m34572a(context);
            }
            this.f26856d.resume();
        }
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        synchronized (this.f26854b) {
            this.f26856d.destroy();
        }
    }
}
