package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class acs<T> implements acx<T> {
    /* renamed from: a */
    private final zzfhe f22891a;
    /* renamed from: b */
    private final adm<?, ?> f22892b;
    /* renamed from: c */
    private final boolean f22893c;
    /* renamed from: d */
    private final abr<?> f22894d;

    private acs(Class<T> cls, adm<?, ?> adm, abr<?> abr, zzfhe zzfhe) {
        this.f22892b = adm;
        this.f22893c = abr.mo4195a((Class) cls);
        this.f22894d = abr;
        this.f22891a = zzfhe;
    }

    /* renamed from: a */
    static <T> acs<T> m27032a(Class<T> cls, adm<?, ?> adm, abr<?> abr, zzfhe zzfhe) {
        return new acs(cls, adm, abr, zzfhe);
    }

    /* renamed from: a */
    public final int mo4201a(T t) {
        adm adm = this.f22892b;
        int b = adm.mo4212b(adm.mo4210a(t)) + 0;
        return this.f22893c ? b + this.f22894d.mo4194a((Object) t).m18854c() : b;
    }

    /* renamed from: a */
    public final void mo4202a(T t, adw adw) {
        Iterator b = this.f22894d.mo4194a((Object) t).m18853b();
        while (b.hasNext()) {
            Entry entry = (Entry) b.next();
            zzffs zzffs = (zzffs) entry.getKey();
            if (zzffs.zzcxi() == zzfjd.MESSAGE && !zzffs.zzcxj()) {
                if (!zzffs.zzcxk()) {
                    int zzhq;
                    Object c;
                    if (entry instanceof aca) {
                        zzhq = zzffs.zzhq();
                        c = ((aca) entry).m18862a().m18866c();
                    } else {
                        zzhq = zzffs.zzhq();
                        c = entry.getValue();
                    }
                    adw.mo4193a(zzhq, c);
                }
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        adm adm = this.f22892b;
        adm.mo4211a(adm.mo4210a(t), adw);
    }
}
