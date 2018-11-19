package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class bi implements bd {
    /* renamed from: a */
    private final C4699a f24131a;
    /* renamed from: b */
    private final Integer[] f24132b;

    /* renamed from: com.google.android.m4b.maps.bo.bi$a */
    public static class C4841a {
        /* renamed from: a */
        private static final Integer[] f17781a = new Integer[0];
        /* renamed from: b */
        private C4699a f17782b;
        /* renamed from: c */
        private Set<Integer> f17783c = new HashSet();

        /* renamed from: a */
        public final C4841a m21687a(C4699a c4699a) {
            this.f17782b = c4699a;
            return this;
        }

        /* renamed from: a */
        public final C4841a m21686a(int i) {
            this.f17783c.add(Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final bi m21688a() {
            if (this.f17783c.contains(Integer.valueOf(-1))) {
                this.f17783c.clear();
            }
            return new bi(this.f17782b, (Integer[]) this.f17783c.toArray(f17781a));
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        bd bdVar = (bd) obj;
        return bdVar == null ? 1 : toString().compareTo(bdVar.toString());
    }

    protected bi(C4699a c4699a, Integer[] numArr) {
        C5571j.m24292a((Object) numArr);
        this.f24131a = c4699a;
        Arrays.sort(numArr);
        this.f24132b = numArr;
    }

    /* renamed from: a */
    public final C4839a mo5113a() {
        return C4839a.TRANSIT;
    }

    /* renamed from: a */
    public final boolean mo5115a(bd bdVar) {
        return equals(bdVar);
    }

    /* renamed from: a */
    public final boolean mo5116a(bg bgVar) {
        return (bgVar != bg.f17757m || (this.f24131a == null && this.f24132b.length == null)) ? null : true;
    }

    /* renamed from: a */
    public final void mo5114a(C4662a c4662a) {
        if (this.f24131a != null) {
            c4662a.m20828b(9, this.f24131a.mo4870a());
        }
        for (Integer intValue : this.f24132b) {
            c4662a.m20820a(12, intValue.intValue());
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f24131a == null ? "" : this.f24131a.toString());
        stringBuilder.append("|");
        for (Integer intValue : this.f24132b) {
            stringBuilder.append(intValue.intValue());
            stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int hashCode = (this.f24131a == null ? 0 : this.f24131a.hashCode()) + 31;
        return this.f24132b.length > 0 ? (hashCode * 31) + Arrays.hashCode(this.f24132b) : hashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return this.f24131a == null && this.f24132b.length == null;
        } else {
            if (!(obj instanceof bi)) {
                return false;
            }
            bi biVar = (bi) obj;
            return C5569h.m24284a(this.f24131a, biVar.f24131a) && Arrays.equals(this.f24132b, biVar.f24132b) != null;
        }
    }
}
