package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;

public final class aq implements bd {
    /* renamed from: a */
    private final String f24117a;

    /* renamed from: com.google.android.m4b.maps.bo.aq$a */
    public static class C4837a {
        /* renamed from: a */
        private String f17668a;

        /* renamed from: a */
        public final C4837a m21542a(String str) {
            this.f17668a = str;
            return this;
        }

        /* renamed from: a */
        public final aq m21543a() {
            return new aq(this.f17668a);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    protected aq(String str) {
        this.f24117a = str;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.SPOTLIGHT;
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return equals(bdVar);
    }

    public final String toString() {
        return this.f24117a == null ? "" : this.f24117a;
    }

    public final int hashCode() {
        return (this.f24117a == null ? 0 : this.f24117a.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f24117a == null;
        } else {
            if (!(obj instanceof aq)) {
                return false;
            }
            return C5569h.m24284a(this.f24117a, ((aq) obj).f24117a);
        }
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        return (bgVar != bg.f17762r || this.f24117a == null) ? null : true;
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        c4662a.m20828b(10, this.f24117a);
    }
}
