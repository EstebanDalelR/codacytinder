package com.google.android.m4b.maps.bo;

import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bo.l */
public final class C7462l extends am {
    /* renamed from: a */
    private af[] f27377a;
    /* renamed from: b */
    private al f27378b;

    /* renamed from: b */
    public final int mo7068b() {
        return 4;
    }

    protected C7462l(af[] afVarArr) {
        this.f27377a = afVarArr;
        this.f27378b = al.m32204a(afVarArr);
    }

    /* renamed from: a */
    public static C7462l m32256a(af afVar, af afVar2, af afVar3, af afVar4) {
        return new C7462l(new af[]{afVar, afVar2, afVar4, afVar3});
    }

    /* renamed from: a */
    public final af mo7067a(int i) {
        return this.f27377a[i];
    }

    /* renamed from: h */
    public final af mo7070h() {
        return this.f27377a[3];
    }

    /* renamed from: a */
    public final al mo5089a() {
        return this.f27378b;
    }

    /* renamed from: c */
    public final af m32262c() {
        return this.f27377a[2];
    }

    /* renamed from: d */
    public final af m32263d() {
        return this.f27377a[3];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27377a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7462l)) {
            return null;
        }
        return Arrays.equals(this.f27377a, ((C7462l) obj).f27377a);
    }

    /* renamed from: a */
    public final boolean mo5090a(af afVar) {
        int i = ah.m21506b(this.f27377a[0], this.f27377a[1], afVar) ? 1 : 0;
        if (ah.m21506b(this.f27377a[1], this.f27377a[2], afVar)) {
            i++;
        }
        if (ah.m21506b(this.f27377a[2], this.f27377a[3], afVar)) {
            i++;
        }
        if (ah.m21506b(this.f27377a[3], this.f27377a[0], afVar) != null) {
            i++;
        }
        return i == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27377a[0]);
        String valueOf2 = String.valueOf(this.f27377a[1]);
        String valueOf3 = String.valueOf(this.f27377a[2]);
        String valueOf4 = String.valueOf(this.f27377a[3]);
        StringBuilder stringBuilder = new StringBuilder((((String.valueOf(valueOf).length() + 5) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
        stringBuilder.append("[");
        stringBuilder.append(valueOf);
        stringBuilder.append(",");
        stringBuilder.append(valueOf2);
        stringBuilder.append(",");
        stringBuilder.append(valueOf3);
        stringBuilder.append(",");
        stringBuilder.append(valueOf4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final boolean mo7069b(am amVar) {
        if (!this.f27378b.mo5091a(amVar.mo5089a())) {
            return false;
        }
        for (int i = 0; i < amVar.mo7068b(); i++) {
            if (!mo5090a(amVar.mo7067a(i))) {
                return false;
            }
        }
        return true;
    }
}
