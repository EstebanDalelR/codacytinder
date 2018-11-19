package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;

@zzzv
public final class ap {
    /* renamed from: a */
    public final zzacm f15550a = null;
    /* renamed from: b */
    public final zzin f15551b;
    /* renamed from: c */
    public final zzafj f15552c;
    /* renamed from: d */
    public final zzmw f15553d;
    /* renamed from: e */
    public final bi f15554e;
    /* renamed from: f */
    public final zzue f15555f;
    /* renamed from: g */
    public final zzacx f15556g;
    /* renamed from: h */
    public final zzxk f15557h;
    /* renamed from: i */
    public final zzafn f15558i;
    /* renamed from: j */
    public final boolean f15559j;
    /* renamed from: k */
    public final zzacf f15560k;
    /* renamed from: l */
    private zzacw f15561l;

    private ap(zzacm zzacm, zzin zzin, zzafj zzafj, zzmw zzmw, bi biVar, zzue zzue, zzacw zzacw, zzacx zzacx, zzxk zzxk, zzafn zzafn, boolean z, zzacf zzacf) {
        this.f15551b = zzin;
        this.f15552c = zzafj;
        this.f15553d = zzmw;
        this.f15554e = biVar;
        this.f15555f = zzue;
        this.f15561l = zzacw;
        this.f15556g = zzacx;
        this.f15557h = zzxk;
        this.f15558i = zzafn;
        this.f15559j = true;
        this.f15560k = zzacf;
    }

    /* renamed from: a */
    public static ap m19400a(Context context) {
        ar.A().a(context);
        zzacf bmVar = new bm(context);
        return new ap(null, new ahu(), new di(), new alc(), new bg(context, bmVar.zznr()), new arh(), new bk(), new bl(), new aua(), new dj(), true, bmVar);
    }
}
