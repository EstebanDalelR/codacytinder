package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.aa.au;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bo.h */
public final class C6519h implements C4847g {
    /* renamed from: c */
    private static al f24182c;
    /* renamed from: a */
    private List<C4847g> f24183a;
    /* renamed from: b */
    private al f24184b;

    public C6519h() {
        this.f24183a = new ArrayList();
        this.f24184b = f24182c;
    }

    public C6519h(int i) {
        this.f24183a = au.m20529b(i);
        this.f24184b = f24182c;
    }

    public C6519h(C4847g... c4847gArr) {
        this(Arrays.asList(c4847gArr));
    }

    private C6519h(Collection<? extends C4847g> collection) {
        this(collection.size());
        for (C4847g a : collection) {
            m28714a(a);
        }
    }

    /* renamed from: a */
    public final void m28714a(C4847g c4847g) {
        al a = c4847g.mo5089a();
        if (a != f24182c) {
            if (this.f24184b == f24182c) {
                this.f24184b = new al(af.m21458a(a.f27357a), af.m21458a(a.f27358b));
            } else {
                this.f24184b.m32207a(a);
            }
            this.f24183a.add(c4847g);
        }
    }

    /* renamed from: a */
    public final al mo5089a() {
        return this.f24184b;
    }

    /* renamed from: a */
    public final boolean mo5090a(af afVar) {
        if (!this.f24184b.mo5090a(afVar)) {
            return false;
        }
        for (int i = 0; i < this.f24183a.size(); i++) {
            if (((C4847g) this.f24183a.get(i)).mo5090a(afVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo5091a(am amVar) {
        if (!this.f24184b.mo5091a(amVar.mo5089a())) {
            return false;
        }
        for (int i = 0; i < this.f24183a.size(); i++) {
            if (((C4847g) this.f24183a.get(i)).mo5091a(amVar)) {
                return true;
            }
        }
        return false;
    }

    static {
        af afVar = new af(Integer.MIN_VALUE, Integer.MIN_VALUE);
        f24182c = new al(afVar, afVar);
    }
}
