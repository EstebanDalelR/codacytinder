package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;

/* renamed from: com.google.android.m4b.maps.bo.r */
public final class C6526r implements bd {
    /* renamed from: a */
    private final C4701c f24211a;

    /* renamed from: com.google.android.m4b.maps.bo.r$a */
    public static class C4852a {
        /* renamed from: a */
        private C4701c f17818a;

        /* renamed from: a */
        public final C4852a m21760a(C4701c c4701c) {
            this.f17818a = c4701c;
            return this;
        }

        /* renamed from: a */
        public final C6526r m21761a() {
            return new C6526r(this.f17818a);
        }
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return true;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    protected C6526r(C4701c c4701c) {
        this.f24211a = c4701c;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.INDOOR;
    }

    /* renamed from: b */
    public final C7436c m28766b() {
        return this.f24211a.m20902a();
    }

    public final int hashCode() {
        return (this.f24211a == null ? 0 : this.f24211a.m20902a().hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f24211a == null;
        } else {
            if (obj instanceof C6526r) {
                return C5569h.m24284a(this.f24211a.m20902a(), ((C6526r) obj).f24211a.m20902a());
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        return (bgVar != bg.f17758n || this.f24211a == null) ? null : true;
    }

    /* renamed from: c */
    public final C4701c m28767c() {
        return this.f24211a;
    }

    /* renamed from: a */
    public static C6526r m28761a(C4701c c4701c) {
        return new C4852a().m21760a(c4701c).m21761a();
    }

    public final String toString() {
        return this.f24211a.m20902a().toString();
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        c4662a.m20828b(6, this.f24211a.m20902a().toString());
    }
}
