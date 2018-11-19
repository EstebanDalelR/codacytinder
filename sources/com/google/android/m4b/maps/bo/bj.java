package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

public final class bj {
    /* renamed from: a */
    private final int[] f17784a;
    /* renamed from: b */
    private final int[] f17785b;

    private bj(int[] iArr, int[] iArr2) {
        this.f17784a = iArr;
        this.f17785b = iArr2;
    }

    /* renamed from: a */
    public static bj m21689a(DataInput dataInput, ba baVar) {
        int a = bl.m21698a(dataInput);
        if (a % 3 != 0) {
            baVar = new StringBuilder(44);
            baVar.append("Malformed TriangleList, ");
            baVar.append(a);
            baVar.append(" vertices");
            throw new IOException(baVar.toString());
        }
        int[] iArr = new int[(a * 3)];
        for (int i = 0; i < a; i++) {
            af.m21464a(dataInput, baVar, iArr, i);
        }
        return new bj(iArr, null);
    }

    /* renamed from: a */
    public static bj m21690a(DataInput dataInput, bc bcVar) {
        int a = bl.m21698a(dataInput);
        if (a % 3 != 0) {
            bcVar = new StringBuilder(44);
            bcVar.append("Malformed TriangleList, ");
            bcVar.append(a);
            bcVar.append(" vertices");
            throw new IOException(bcVar.toString());
        }
        int[] iArr = new int[(a * 3)];
        bcVar = bcVar.m21632b();
        for (int i = 0; i < a; i++) {
            af.m21469b(dataInput, bcVar, iArr, i);
        }
        bcVar = bl.m21698a(dataInput);
        int[] iArr2 = new int[bcVar];
        for (int i2 = 0; i2 < bcVar; i2++) {
            iArr2[i2] = bl.m21698a(dataInput);
        }
        return new bj(iArr, iArr2);
    }

    /* renamed from: a */
    public final int m21691a() {
        return this.f17784a.length / 9;
    }

    /* renamed from: a */
    public final void m21692a(int i, af afVar, af afVar2, af afVar3) {
        i *= 9;
        int i2 = i + 1;
        afVar.f17658a = this.f17784a[i];
        int i3 = i2 + 1;
        afVar.f17659b = this.f17784a[i2];
        i2 = i3 + 1;
        afVar.f17660c = this.f17784a[i3];
        afVar = i2 + 1;
        afVar2.f17658a = this.f17784a[i2];
        i3 = afVar + 1;
        afVar2.f17659b = this.f17784a[afVar];
        afVar = i3 + 1;
        afVar2.f17660c = this.f17784a[i3];
        afVar2 = afVar + 1;
        afVar3.f17658a = this.f17784a[afVar];
        afVar = afVar2 + 1;
        afVar3.f17659b = this.f17784a[afVar2];
        afVar3.f17660c = this.f17784a[afVar];
    }

    /* renamed from: a */
    public final void m21693a(int i, af afVar, af afVar2, af afVar3, af afVar4) {
        i *= 9;
        int i2 = i + 1;
        afVar2.f17658a = this.f17784a[i] - afVar.f17658a;
        int i3 = i2 + 1;
        afVar2.f17659b = this.f17784a[i2] - afVar.f17659b;
        i2 = i3 + 1;
        afVar2.f17660c = this.f17784a[i3] - afVar.f17660c;
        afVar2 = i2 + 1;
        afVar3.f17658a = this.f17784a[i2] - afVar.f17658a;
        i3 = afVar2 + 1;
        afVar3.f17659b = this.f17784a[afVar2] - afVar.f17659b;
        afVar2 = i3 + 1;
        afVar3.f17660c = this.f17784a[i3] - afVar.f17660c;
        afVar3 = afVar2 + 1;
        afVar4.f17658a = this.f17784a[afVar2] - afVar.f17658a;
        afVar2 = afVar3 + 1;
        afVar4.f17659b = this.f17784a[afVar3] - afVar.f17659b;
        afVar4.f17660c = this.f17784a[afVar2] - afVar.f17660c;
    }

    /* renamed from: a */
    public final void m21694a(C6519h c6519h) {
        for (int i = 0; i < m21691a(); i++) {
            af[] afVarArr = new af[]{new af(), new af(), new af()};
            m21692a(i, afVarArr[0], afVarArr[1], afVarArr[2]);
            c6519h.m28714a(new ai(afVarArr));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        if (!Arrays.equals(this.f17784a, bjVar.f17784a) || Arrays.equals(this.f17785b, bjVar.f17785b) == null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17784a) + Arrays.hashCode(this.f17785b);
    }

    /* renamed from: b */
    public final int m21695b() {
        int i;
        int length = this.f17784a.length;
        if (this.f17785b == null) {
            i = 0;
        } else {
            i = this.f17785b.length;
        }
        return ((length + i) * 4) + 28;
    }
}
