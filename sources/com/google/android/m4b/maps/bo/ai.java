package com.google.android.m4b.maps.bo;

import java.util.Arrays;

public final class ai extends am {
    /* renamed from: a */
    private af[] f27355a;
    /* renamed from: b */
    private volatile al f27356b;

    public ai(af[] afVarArr) {
        this.f27355a = afVarArr;
    }

    /* renamed from: b */
    public final int mo7068b() {
        return this.f27355a.length;
    }

    /* renamed from: a */
    public final af mo7067a(int i) {
        return this.f27355a[i];
    }

    /* renamed from: a */
    public final al mo5089a() {
        if (this.f27356b == null) {
            this.f27356b = al.m32204a(this.f27355a);
        }
        return this.f27356b;
    }

    /* renamed from: a */
    public final boolean mo5090a(af afVar) {
        if (!mo5089a().mo5090a(afVar)) {
            return false;
        }
        int length = this.f27355a.length;
        af afVar2 = this.f27355a[length - 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            af afVar3 = this.f27355a[i];
            if (ah.m21506b(afVar2, afVar3, afVar)) {
                i2++;
            }
            i++;
            afVar2 = afVar3;
        }
        if ((i2 & 1) == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27355a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return null;
        }
        return Arrays.equals(this.f27355a, ((ai) obj).f27355a);
    }
}
