package com.google.android.m4b.maps.bo;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class bp extends br {
    /* renamed from: b */
    private final af[] f24138b;
    /* renamed from: c */
    private final af[] f24139c = new af[4];
    /* renamed from: d */
    private final C7462l f24140d;
    /* renamed from: e */
    private final bq f24141e;
    /* renamed from: f */
    private final al f24142f;
    /* renamed from: g */
    private af[][] f24143g;

    private bp(af[] afVarArr) {
        for (int i = 0; i < 4; i++) {
            this.f24139c[i] = new af();
            afVarArr[i].m21497i(this.f24139c[i]);
        }
        this.f24138b = afVarArr;
        this.f24140d = new C7462l(afVarArr);
        this.f24142f = this.f24140d.mo5089a();
        this.f24141e = bq.m28669a(this.f24142f);
        this.a = this.f24141e.a;
        if (this.a != null) {
            this.f24143g = (af[][]) Array.newInstance(af.class, new int[]{6, 2});
            int i2 = 0;
            int i3 = 0;
            for (afVarArr = null; afVarArr < 4; afVarArr++) {
                int equals = this.f24139c[afVarArr].equals(this.f24138b[afVarArr]) ^ 1;
                if (equals != i3) {
                    if (afVarArr > null && i2 < 5) {
                        m28656a(this.f24138b[afVarArr - 1], this.f24138b[afVarArr], i2);
                        i2++;
                    }
                    i3 = equals;
                }
                if (afVarArr > null) {
                    this.f24143g[i2 - 1][1] = this.f24139c[afVarArr];
                }
                this.f24143g[i2][0] = this.f24139c[afVarArr];
                i2++;
            }
            if (i2 < 6) {
                m28656a(this.f24138b[3], this.f24138b[0], i2);
            }
            this.f24143g[5][1] = this.f24139c[0];
        }
    }

    /* renamed from: a */
    private void m28656a(af afVar, af afVar2, int i) {
        int i2 = (int) (((((double) ((afVar2.f17658a > 0 ? 536870913 : -536870913) - afVar.f17658a)) / ((double) (afVar2.f17658a - afVar.f17658a))) * ((double) (afVar2.f17659b - afVar.f17659b))) + ((double) afVar.f17659b));
        if (afVar.f17658a > afVar2.f17658a) {
            this.f24143g[i - 1][1] = new af(-536870913, i2);
            this.f24143g[i][0] = new af(536870913, i2);
            return;
        }
        this.f24143g[i - 1][1] = new af(536870913, i2);
        this.f24143g[i][0] = new af(-536870913, i2);
    }

    /* renamed from: a */
    public static bp m28654a(af afVar, af afVar2, af afVar3, af afVar4) {
        return new bp(new af[]{afVar, afVar2, afVar4, afVar3});
    }

    /* renamed from: a */
    public final bq mo5129a() {
        return this.f24141e;
    }

    /* renamed from: b */
    public final al m28662b() {
        return this.f24142f;
    }

    /* renamed from: c */
    public final am mo5133c() {
        return this.f24140d;
    }

    /* renamed from: d */
    public final af m28664d() {
        return this.f24139c[0];
    }

    /* renamed from: e */
    public final af m28665e() {
        return this.f24139c[1];
    }

    /* renamed from: f */
    public final af m28666f() {
        return this.f24139c[2];
    }

    /* renamed from: g */
    public final af m28667g() {
        return this.f24139c[3];
    }

    /* renamed from: a */
    public final af mo5128a(int i) {
        return this.f24139c[i];
    }

    /* renamed from: h */
    public final int mo5134h() {
        return this.a ? 6 : 4;
    }

    /* renamed from: a */
    public final void mo5130a(int i, af[] afVarArr) {
        if (this.a) {
            afVarArr[0] = this.f24143g[i][0];
            afVarArr[1] = this.f24143g[i][1];
            return;
        }
        afVarArr[0] = this.f24139c[i];
        afVarArr[1] = this.f24139c[(i + 1) % 4];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24138b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return null;
        }
        return Arrays.equals(this.f24138b, ((bp) obj).f24138b);
    }

    /* renamed from: a */
    public final boolean mo5131a(af afVar) {
        if (!this.a) {
            return this.f24140d.mo5090a(afVar);
        }
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (ah.m21506b(this.f24143g[i2][0], this.f24143g[i2][1], afVar)) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24138b[0]);
        String valueOf2 = String.valueOf(this.f24138b[1]);
        String valueOf3 = String.valueOf(this.f24138b[2]);
        String valueOf4 = String.valueOf(this.f24138b[3]);
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

    /* renamed from: a */
    public static bp m28655a(bp bpVar, af afVar, float f) {
        return m28654a(af.m21459a(bpVar.f24139c[0], afVar, 0.2f), af.m21459a(bpVar.f24139c[1], afVar, 0.2f), af.m21459a(bpVar.f24139c[3], afVar, 0.2f), af.m21459a(bpVar.f24139c[2], afVar, 0.2f));
    }

    /* renamed from: a */
    public final boolean mo5132a(am amVar) {
        if (!this.f24141e.mo5135b(amVar.mo5089a())) {
            return false;
        }
        for (int i = 0; i < amVar.mo7068b(); i++) {
            if (!mo5131a(amVar.mo7067a(i))) {
                return false;
            }
        }
        return true;
    }
}
