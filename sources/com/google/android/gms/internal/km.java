package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzzv
public final class km implements Iterable<kk> {
    /* renamed from: a */
    private final List<kk> f16274a = new LinkedList();

    /* renamed from: a */
    public static boolean m19979a(zzamp zzamp) {
        kk b = m19980b(zzamp);
        if (b == null) {
            return false;
        }
        b.f26909b.mo6887a();
        return true;
    }

    /* renamed from: b */
    static kk m19980b(zzamp zzamp) {
        Iterator it = ar.x().iterator();
        while (it.hasNext()) {
            kk kkVar = (kk) it.next();
            if (kkVar.f26908a == zzamp) {
                return kkVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int m19981a() {
        return this.f16274a.size();
    }

    /* renamed from: a */
    public final void m19982a(kk kkVar) {
        this.f16274a.add(kkVar);
    }

    /* renamed from: b */
    public final void m19983b(kk kkVar) {
        this.f16274a.remove(kkVar);
    }

    public final Iterator<kk> iterator() {
        return this.f16274a.iterator();
    }
}
