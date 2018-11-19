package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;

public class bf {
    /* renamed from: a */
    private final be f17726a = new be();

    /* renamed from: a */
    public boolean m21650a(be beVar) {
        if (beVar == null) {
            beVar = new be();
        }
        for (C4839a a : beVar.m21644a()) {
            if (!m21651a(beVar, a)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public be m21648a() {
        be beVar;
        synchronized (this.f17726a) {
            beVar = new be(this.f17726a);
        }
        return beVar;
    }

    /* renamed from: a */
    public boolean m21651a(be beVar, C4839a c4839a) {
        bd a = be.m21640a(beVar, c4839a);
        bd a2 = be.m21640a(this.f17726a, c4839a);
        if (a2 != null) {
            return a2.mo5115a(a);
        }
        if (a != null) {
            if (a.mo5115a(a2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m21649a(bd bdVar) {
        if (bdVar == null) {
            return false;
        }
        synchronized (this.f17726a) {
            if (C5569h.m24284a(this.f17726a.m21642a(bdVar.mo5113a()), bdVar)) {
                return false;
            }
            this.f17726a.m21645a(bdVar);
            return true;
        }
    }

    /* renamed from: b */
    public long m21652b() {
        long hashCode;
        synchronized (this.f17726a) {
            hashCode = (long) this.f17726a.hashCode();
        }
        return hashCode;
    }
}
