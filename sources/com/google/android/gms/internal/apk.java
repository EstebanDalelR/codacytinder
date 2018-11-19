package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C4458k;
import com.google.android.gms.ads.internal.bn;

@zzzv
public final class apk {
    /* renamed from: a */
    private final Context f15571a;
    /* renamed from: b */
    private final zzux f15572b;
    /* renamed from: c */
    private final zzakd f15573c;
    /* renamed from: d */
    private final bn f15574d;

    apk(Context context, zzux zzux, zzakd zzakd, bn bnVar) {
        this.f15571a = context;
        this.f15572b = zzux;
        this.f15573c = zzakd;
        this.f15574d = bnVar;
    }

    /* renamed from: a */
    public final Context m19401a() {
        return this.f15571a.getApplicationContext();
    }

    /* renamed from: a */
    public final C4458k m19402a(String str) {
        return new C4458k(this.f15571a, new zzjn(), str, this.f15572b, this.f15573c, this.f15574d);
    }

    /* renamed from: b */
    public final C4458k m19403b(String str) {
        return new C4458k(this.f15571a.getApplicationContext(), new zzjn(), str, this.f15572b, this.f15573c, this.f15574d);
    }

    /* renamed from: b */
    public final apk m19404b() {
        return new apk(this.f15571a.getApplicationContext(), this.f15572b, this.f15573c, this.f15574d);
    }
}
