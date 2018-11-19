package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bo.c */
public final class C6516c implements bd {
    /* renamed from: a */
    private final String f24156a;

    /* renamed from: com.google.android.m4b.maps.bo.c$a */
    public static class C4844a {
        /* renamed from: a */
        private String f17804a;

        /* renamed from: a */
        public final C4844a m21738a(String str) {
            this.f17804a = str;
            return this;
        }

        /* renamed from: a */
        public final C6516c m21739a() {
            return new C6516c(this.f17804a);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    protected C6516c(String str) {
        this.f24156a = str;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.ALTERNATE_PAINTFE;
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return equals(bdVar);
    }

    public final String toString() {
        return this.f24156a == null ? "" : this.f24156a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24156a});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f24156a == null;
        } else {
            if (obj instanceof C6516c) {
                return C5569h.m24284a(this.f24156a, ((C6516c) obj).f24156a);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        return this.f24156a != null ? true : null;
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        c4662a.m20828b(13, this.f24156a);
    }
}
