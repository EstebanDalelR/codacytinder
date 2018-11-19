package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bo.z */
public final class C6529z implements bd {
    /* renamed from: a */
    private final C4662a f24233a;

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    public C6529z(C4662a c4662a) {
        this.f24233a = c4662a;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.MAPS_ENGINE;
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return equals(bdVar);
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        if (bgVar != bg.f17768x) {
            if (bgVar != bg.f17767w) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        c4662a.m20827b(29, this.f24233a);
    }

    /* renamed from: b */
    public final C4662a m28792b() {
        return this.f24233a;
    }

    public final String toString() {
        return this.f24233a.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24233a.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6529z)) {
            return null;
        }
        return C5569h.m24284a(this.f24233a.toString(), ((C6529z) obj).f24233a.toString());
    }
}
