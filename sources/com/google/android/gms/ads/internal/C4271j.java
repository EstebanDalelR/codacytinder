package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.util.C0562m;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ajj;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.j */
public final class C4271j extends ajj {
    /* renamed from: a */
    private zzkh f13875a;
    /* renamed from: b */
    private zzqq f13876b;
    /* renamed from: c */
    private zzrc f13877c;
    /* renamed from: d */
    private zzqt f13878d;
    /* renamed from: e */
    private C0562m<String, zzqw> f13879e = new C0562m();
    /* renamed from: f */
    private C0562m<String, zzqz> f13880f = new C0562m();
    /* renamed from: g */
    private zzrf f13881g;
    /* renamed from: h */
    private zzjn f13882h;
    /* renamed from: i */
    private PublisherAdViewOptions f13883i;
    /* renamed from: j */
    private zzpe f13884j;
    /* renamed from: k */
    private zzld f13885k;
    /* renamed from: l */
    private final Context f13886l;
    /* renamed from: m */
    private final zzux f13887m;
    /* renamed from: n */
    private final String f13888n;
    /* renamed from: o */
    private final zzakd f13889o;
    /* renamed from: p */
    private final bn f13890p;

    public C4271j(Context context, String str, zzux zzux, zzakd zzakd, bn bnVar) {
        this.f13886l = context;
        this.f13888n = str;
        this.f13887m = zzux;
        this.f13889o = zzakd;
        this.f13890p = bnVar;
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.f13883i = publisherAdViewOptions;
    }

    public final void zza(zzpe zzpe) {
        this.f13884j = zzpe;
    }

    public final void zza(zzqq zzqq) {
        this.f13876b = zzqq;
    }

    public final void zza(zzqt zzqt) {
        this.f13878d = zzqt;
    }

    public final void zza(zzrc zzrc) {
        this.f13877c = zzrc;
    }

    public final void zza(zzrf zzrf, zzjn zzjn) {
        this.f13881g = zzrf;
        this.f13882h = zzjn;
    }

    public final void zza(String str, zzqz zzqz, zzqw zzqw) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f13880f.put(str, zzqz);
        this.f13879e.put(str, zzqw);
    }

    public final void zzb(zzkh zzkh) {
        this.f13875a = zzkh;
    }

    public final void zzb(zzld zzld) {
        this.f13885k = zzld;
    }

    public final zzkk zzdi() {
        Context context = this.f13886l;
        String str = this.f13888n;
        zzux zzux = this.f13887m;
        zzakd zzakd = this.f13889o;
        zzkh zzkh = this.f13875a;
        zzqq zzqq = this.f13876b;
        zzrc zzrc = this.f13877c;
        zzqt zzqt = this.f13878d;
        C0562m c0562m = this.f13880f;
        C0562m c0562m2 = this.f13879e;
        zzpe zzpe = this.f13884j;
        zzld zzld = this.f13885k;
        bn bnVar = this.f13890p;
        zzrf zzrf = this.f13881g;
        zzrf zzrf2 = zzrf;
        return new C4270g(context, str, zzux, zzakd, zzkh, zzqq, zzrc, zzqt, c0562m, c0562m2, zzpe, zzld, bnVar, zzrf2, this.f13882h, this.f13883i);
    }
}
