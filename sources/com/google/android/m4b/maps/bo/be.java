package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import java.util.Map;
import java.util.Set;

public final class be implements Comparable<be> {
    /* renamed from: a */
    private final Map<C4839a, bd> f17725a;

    public final /* synthetic */ int compareTo(Object obj) {
        return m21641a((be) obj);
    }

    public be() {
        this.f17725a = ax.m20623b();
    }

    public be(be beVar) {
        this.f17725a = ax.m20618a(beVar.f17725a);
    }

    /* renamed from: a */
    public final bd m21642a(C4839a c4839a) {
        return (bd) this.f17725a.get(c4839a);
    }

    /* renamed from: a */
    public static bd m21640a(be beVar, C4839a c4839a) {
        return beVar == null ? null : beVar.m21642a(c4839a);
    }

    /* renamed from: a */
    public final Set<C4839a> m21644a() {
        return this.f17725a.keySet();
    }

    /* renamed from: a */
    public final void m21645a(bd bdVar) {
        this.f17725a.put(bdVar.mo5113a(), bdVar);
    }

    public final int hashCode() {
        int hashCode;
        if (this.f17725a != null) {
            if (!this.f17725a.isEmpty()) {
                hashCode = this.f17725a.hashCode();
                return hashCode + 31;
            }
        }
        hashCode = 0;
        return hashCode + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f17725a.isEmpty();
        }
        if (getClass() != obj.getClass()) {
            return null;
        }
        return this.f17725a.equals(((be) obj).f17725a);
    }

    public final String toString() {
        return this.f17725a.isEmpty() ? "" : this.f17725a.toString();
    }

    /* renamed from: a */
    public final int m21641a(be beVar) {
        for (C4839a c4839a : C4839a.values()) {
            bd a = m21642a(c4839a);
            bd a2 = beVar.m21642a(c4839a);
            if (a != null) {
                int compareTo = a.compareTo(a2);
                if (compareTo != 0) {
                    return compareTo;
                }
            } else if (a2 != null) {
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void m21646a(bg bgVar, C4662a c4662a) {
        for (bd bdVar : this.f17725a.values()) {
            if (bdVar.mo5116a(bgVar)) {
                bdVar.mo5114a(c4662a);
            }
        }
    }

    /* renamed from: b */
    public final boolean m21647b() {
        return this.f17725a.isEmpty();
    }

    /* renamed from: a */
    public final be m21643a(bg bgVar) {
        be beVar = new be();
        for (bd bdVar : this.f17725a.values()) {
            if (bdVar.mo5116a(bgVar)) {
                beVar.m21645a(bdVar);
            }
        }
        return beVar;
    }
}
