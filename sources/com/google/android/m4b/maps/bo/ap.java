package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;

public final class ap implements bd {
    /* renamed from: a */
    private final C4662a f24116a;

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    public ap(C4662a c4662a) {
        this.f24116a = c4662a;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.SPOTLIGHT_DIFFTILE;
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return equals(bdVar);
    }

    public final String toString() {
        if (this.f24116a == null) {
            return "";
        }
        return this.f24116a.toString().substring(0, 20);
    }

    public final int hashCode() {
        return (this.f24116a == null ? "" : this.f24116a.toString()).hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f24116a == null;
        } else {
            if (!(obj instanceof ap)) {
                return false;
            }
            return C5569h.m24284a(this.f24116a.toString(), ((ap) obj).f24116a.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        return (bgVar != bg.f17766v || this.f24116a == null) ? null : true;
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        c4662a.m20827b(27, this.f24116a);
    }
}
