package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bn;

final /* synthetic */ class la implements zzakg {
    /* renamed from: a */
    private final Context f23402a;
    /* renamed from: b */
    private final tb f23403b;
    /* renamed from: c */
    private final zzakd f23404c;
    /* renamed from: d */
    private final bn f23405d;
    /* renamed from: e */
    private final String f23406e;

    la(Context context, tb tbVar, zzakd zzakd, bn bnVar, String str) {
        this.f23402a = context;
        this.f23403b = tbVar;
        this.f23404c = zzakd;
        this.f23405d = bnVar;
        this.f23406e = str;
    }

    public final zzakv zzc(Object obj) {
        Context context = this.f23402a;
        tb tbVar = this.f23403b;
        zzakd zzakd = this.f23404c;
        bn bnVar = this.f23405d;
        String str = this.f23406e;
        zzanh a = ar.f().m20026a(context, mb.m20043a(), "", false, false, tbVar, zzakd, null, null, bnVar, ahw.m19185a());
        zzakv a2 = iv.m31576a(a);
        a.zzsz().m20000a(new lb(a2));
        a.loadUrl(str);
        return a2;
    }
}
