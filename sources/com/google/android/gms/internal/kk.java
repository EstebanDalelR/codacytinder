package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;

@zzzv
public final class kk extends dy {
    /* renamed from: a */
    final zzamp f26908a;
    /* renamed from: b */
    final ko f26909b;
    /* renamed from: c */
    private final String f26910c;

    kk(zzamp zzamp, ko koVar, String str) {
        this.f26908a = zzamp;
        this.f26909b = koVar;
        this.f26910c = str;
        ar.x().m19982a(this);
    }

    /* renamed from: a */
    public final void mo6837a() {
        try {
            this.f26909b.mo6888a(this.f26910c);
        } finally {
            fk.f16060a.post(new kl(this));
        }
    }

    /* renamed from: b */
    public final void mo6838b() {
        this.f26909b.mo6887a();
    }
}
