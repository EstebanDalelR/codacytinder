package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.ads.internal.zzbl;
import java.util.concurrent.Callable;

final class lc implements Callable<zzanh> {
    /* renamed from: a */
    private /* synthetic */ Context f16329a;
    /* renamed from: b */
    private /* synthetic */ mb f16330b;
    /* renamed from: c */
    private /* synthetic */ String f16331c;
    /* renamed from: d */
    private /* synthetic */ boolean f16332d;
    /* renamed from: e */
    private /* synthetic */ boolean f16333e;
    /* renamed from: f */
    private /* synthetic */ tb f16334f;
    /* renamed from: g */
    private /* synthetic */ zzakd f16335g;
    /* renamed from: h */
    private /* synthetic */ amb f16336h;
    /* renamed from: i */
    private /* synthetic */ zzbl f16337i;
    /* renamed from: j */
    private /* synthetic */ bn f16338j;
    /* renamed from: k */
    private /* synthetic */ ahw f16339k;

    lc(kz kzVar, Context context, mb mbVar, String str, boolean z, boolean z2, tb tbVar, zzakd zzakd, amb amb, zzbl zzbl, bn bnVar, ahw ahw) {
        this.f16329a = context;
        this.f16330b = mbVar;
        this.f16331c = str;
        this.f16332d = z;
        this.f16333e = z2;
        this.f16334f = tbVar;
        this.f16335g = zzakd;
        this.f16336h = amb;
        this.f16337i = zzbl;
        this.f16338j = bnVar;
        this.f16339k = ahw;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzanh ldVar = new ld(le.m34002a(this.f16329a, this.f16330b, this.f16331c, this.f16332d, this.f16333e, this.f16334f, this.f16335g, this.f16336h, this.f16337i, this.f16338j, this.f16339k));
        ldVar.setWebViewClient(ar.g().mo6863a(ldVar, this.f16333e));
        ldVar.setWebChromeClient(ar.g().mo6868c(ldVar));
        return ldVar;
    }
}
