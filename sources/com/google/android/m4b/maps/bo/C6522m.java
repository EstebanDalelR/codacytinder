package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bo.m */
public final class C6522m implements bd {
    /* renamed from: a */
    private final String f24187a;

    /* renamed from: com.google.android.m4b.maps.bo.m$a */
    public static class C4849a {
        /* renamed from: a */
        private String f17814a;

        /* renamed from: a */
        public final C4849a m21756a(String str) {
            this.f17814a = str;
            return this;
        }

        /* renamed from: a */
        public final C6522m m21757a() {
            return new C6522m(this.f17814a);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    protected C6522m(String str) {
        this.f24187a = str;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.HIGHLIGHT;
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return equals(bdVar);
    }

    public final String toString() {
        return this.f24187a == null ? "" : this.f24187a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24187a});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f24187a == null;
        } else {
            if (obj instanceof C6522m) {
                return C5569h.m24284a(this.f24187a, ((C6522m) obj).f24187a);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        return (bgVar == bg.f17763s && this.f24187a != null && "0x0:0x0".equals(this.f24187a) == null) ? true : null;
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        c4662a.m20828b(9, this.f24187a);
    }
}
