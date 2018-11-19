package com.google.android.gms.internal;

import java.util.Map;

final class gx extends me {
    /* renamed from: a */
    private /* synthetic */ byte[] f26886a;
    /* renamed from: b */
    private /* synthetic */ Map f26887b;
    /* renamed from: c */
    private /* synthetic */ hq f26888c;

    gx(gr grVar, int i, String str, zzy zzy, zzx zzx, byte[] bArr, Map map, hq hqVar) {
        this.f26886a = bArr;
        this.f26887b = map;
        this.f26888c = hqVar;
        super(i, str, zzy, zzx);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo4624a(Object obj) {
        mo6870a((String) obj);
    }

    /* renamed from: a */
    protected final void mo6870a(String str) {
        this.f26888c.m19902a(str);
        super.mo6870a(str);
    }

    /* renamed from: a */
    public final byte[] mo6871a() throws zza {
        return this.f26886a == null ? super.mo6871a() : this.f26886a;
    }

    /* renamed from: b */
    public final Map<String, String> mo6872b() throws zza {
        return this.f26887b == null ? super.mo6872b() : this.f26887b;
    }
}
