package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.ad;

@zzzv
public final class ju {
    /* renamed from: a */
    private final Context f16225a;
    /* renamed from: b */
    private final zzamp f16226b;
    /* renamed from: c */
    private final ViewGroup f16227c;
    /* renamed from: d */
    private jr f16228d;

    private ju(Context context, ViewGroup viewGroup, zzamp zzamp, jr jrVar) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f16225a = context;
        this.f16227c = viewGroup;
        this.f16226b = zzamp;
        this.f16228d = null;
    }

    public ju(Context context, ViewGroup viewGroup, zzanh zzanh) {
        this(context, viewGroup, zzanh, null);
    }

    /* renamed from: a */
    public final jr m19946a() {
        ad.b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f16228d;
    }

    /* renamed from: a */
    public final void m19947a(int i, int i2, int i3, int i4) {
        ad.b("The underlay may only be modified from the UI thread.");
        if (this.f16228d != null) {
            this.f16228d.m27391a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void m19948a(int i, int i2, int i3, int i4, int i5, boolean z, kc kcVar) {
        if (this.f16228d == null) {
            alu.m19353a(r0.f16226b.zzsj().m19358a(), r0.f16226b.zzsh(), "vpr2");
            r0.f16228d = new jr(r0.f16225a, r0.f16226b, i5, z, r0.f16226b.zzsj().m19358a(), kcVar);
            r0.f16227c.addView(r0.f16228d, 0, new LayoutParams(-1, -1));
            r0.f16228d.m27391a(i, i2, i3, i4);
            r0.f16226b.zzac(false);
        }
    }

    /* renamed from: b */
    public final void m19949b() {
        ad.b("onPause must be called from the UI thread.");
        if (this.f16228d != null) {
            this.f16228d.m27394b();
        }
    }

    /* renamed from: c */
    public final void m19950c() {
        ad.b("onDestroy must be called from the UI thread.");
        if (this.f16228d != null) {
            this.f16228d.m27399g();
            this.f16227c.removeView(this.f16228d);
            this.f16228d = null;
        }
    }
}
