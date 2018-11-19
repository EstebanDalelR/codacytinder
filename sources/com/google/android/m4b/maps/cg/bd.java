package com.google.android.m4b.maps.cg;

import java.util.HashSet;
import java.util.Set;

public final class bd {
    /* renamed from: a */
    private final Set<C5147a> f19108a = new HashSet();

    /* renamed from: com.google.android.m4b.maps.cg.bd$a */
    public interface C5147a {
        /* renamed from: a */
        void mo7180a();
    }

    /* renamed from: a */
    public final void m22948a(C5147a c5147a) {
        this.f19108a.add(c5147a);
    }

    /* renamed from: a */
    public final void m22947a() {
        for (C5147a a : this.f19108a) {
            a.mo7180a();
        }
        this.f19108a.clear();
    }

    /* renamed from: b */
    public final void m22949b(C5147a c5147a) {
        this.f19108a.remove(c5147a);
    }
}
