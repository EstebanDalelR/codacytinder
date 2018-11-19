package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;
import java.io.DataInput;

public final class bh implements C4848k {
    /* renamed from: a */
    private final int f24123a;
    /* renamed from: b */
    private final aj f24124b;
    /* renamed from: c */
    private final as f24125c;
    /* renamed from: d */
    private final int f24126d;
    /* renamed from: e */
    private final String f24127e;
    /* renamed from: f */
    private final int f24128f;
    /* renamed from: g */
    private final int f24129g;
    /* renamed from: h */
    private final int[] f24130h;

    /* renamed from: h */
    public final int mo5109h() {
        return 9;
    }

    /* renamed from: i */
    public final int mo5110i() {
        return 0;
    }

    private bh(int i, aj ajVar, as asVar, int i2, String str, int i3, int i4, int[] iArr) {
        this.f24123a = i;
        this.f24124b = ajVar;
        this.f24125c = asVar;
        this.f24126d = i2;
        this.f24127e = str;
        this.f24129g = i3;
        this.f24128f = i4;
        this.f24130h = iArr;
    }

    /* renamed from: a */
    public static C4848k m28631a(DataInput dataInput, bc bcVar, an anVar) {
        aj a = aj.m21519a(dataInput, bcVar.m21632b());
        bcVar = av.m21574a(dataInput, bcVar);
        int a2 = bl.m21698a(dataInput);
        int readInt = dataInput.readInt();
        int a3 = bl.m21698a(dataInput);
        int[] iArr = new int[a3];
        for (int i = 0; i < a3; i++) {
            iArr[i] = bl.m21698a(dataInput);
        }
        return new bh(anVar.m21541a(), a, bcVar.m21575a(), bcVar.m21577c(), bcVar.m21576b(), a2, readInt, iArr);
    }

    /* renamed from: b */
    public final aj m28633b() {
        return this.f24124b;
    }

    /* renamed from: c */
    public final boolean m28634c() {
        return ac.m21434a(this.f24128f, 1);
    }

    /* renamed from: d */
    public final int m28635d() {
        return this.f24129g;
    }

    /* renamed from: e */
    public final as mo5108e() {
        return this.f24125c;
    }

    /* renamed from: l */
    public final int[] mo5111l() {
        return this.f24130h;
    }

    /* renamed from: a */
    public final C4699a mo5107a() {
        return C4699a.f17284a;
    }

    /* renamed from: m */
    public final int mo5112m() {
        return ((this.f24124b.m21540i() + 44) + ac.m21432a(this.f24127e)) + ac.m21430a(this.f24125c);
    }
}
