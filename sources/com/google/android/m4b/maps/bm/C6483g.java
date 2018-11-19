package com.google.android.m4b.maps.bm;

import com.google.android.m4b.maps.bo.C4847g;
import com.google.android.m4b.maps.bo.C6517d;
import com.google.android.m4b.maps.bo.C6519h;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.bj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bm.g */
public final class C6483g implements C4847g {
    /* renamed from: a */
    private final C4847g f24028a;

    /* renamed from: com.google.android.m4b.maps.bm.g$a */
    public static class C4826a {
        /* renamed from: a */
        private final List<bj> f17616a = new ArrayList();

        /* renamed from: a */
        public final void m21403a(C6517d c6517d) {
            this.f17616a.add(c6517d.m28688b());
        }

        /* renamed from: a */
        public final C6483g m21402a() {
            return new C6483g(this.f17616a);
        }
    }

    public C6483g(List<bj> list) {
        int i = 0;
        for (bj a : list) {
            i += a.m21691a();
        }
        C4847g c6519h = new C6519h(i);
        for (bj a2 : list) {
            a2.m21694a(c6519h);
        }
        this.f24028a = c6519h;
    }

    /* renamed from: a */
    public final al mo5089a() {
        return this.f24028a.mo5089a();
    }

    /* renamed from: a */
    public final boolean mo5090a(af afVar) {
        return this.f24028a.mo5090a(afVar);
    }

    /* renamed from: a */
    public final boolean mo5091a(am amVar) {
        return this.f24028a.mo5091a(amVar);
    }
}
