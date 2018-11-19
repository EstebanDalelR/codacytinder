package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;
import java.io.DataInput;

/* renamed from: com.google.android.m4b.maps.bo.e */
public final class C6518e implements C4848k {
    /* renamed from: n */
    private static final byte[] f24167n = new byte[]{(byte) 1, (byte) 2, (byte) 4};
    /* renamed from: o */
    private static final int[] f24168o = new int[]{0, 1, 1, 2, 1, 2, 2, 3};
    /* renamed from: a */
    private final int f24169a;
    /* renamed from: b */
    private final C4699a f24170b;
    /* renamed from: c */
    private final bj f24171c;
    /* renamed from: d */
    private final bj f24172d;
    /* renamed from: e */
    private final byte[] f24173e;
    /* renamed from: f */
    private final as f24174f;
    /* renamed from: g */
    private final int f24175g;
    /* renamed from: h */
    private final String f24176h;
    /* renamed from: i */
    private final int f24177i;
    /* renamed from: j */
    private final int f24178j;
    /* renamed from: k */
    private final int f24179k;
    /* renamed from: l */
    private final int f24180l;
    /* renamed from: m */
    private final int[] f24181m;

    /* renamed from: h */
    public final int mo5109h() {
        return 4;
    }

    private C6518e(int i, C4699a c4699a, bj bjVar, bj bjVar2, byte[] bArr, int i2, int i3, as asVar, int i4, String str, int i5, int i6, int[] iArr) {
        this.f24169a = i;
        this.f24170b = c4699a;
        this.f24171c = bjVar;
        this.f24172d = bjVar2;
        this.f24173e = bArr;
        this.f24177i = i2;
        this.f24178j = i3;
        this.f24174f = asVar;
        this.f24175g = i4;
        this.f24176h = str;
        this.f24179k = i5;
        this.f24180l = i6;
        this.f24181m = iArr;
    }

    /* renamed from: a */
    public static C6518e m28700a(DataInput dataInput, bc bcVar, an anVar) {
        int a;
        C4699a a2;
        int a3;
        int[] iArr;
        int i;
        DataInput dataInput2 = dataInput;
        bj a4 = bj.m21689a(dataInput2, bcVar.m21632b());
        bj a5 = bj.m21690a(dataInput, bcVar);
        if ((a5.m21691a() != 0 ? 1 : null) != null) {
            a = a5.m21691a();
        } else {
            a = a4.m21691a();
        }
        byte[] bArr = new byte[a];
        dataInput2.readFully(bArr);
        int a6 = bl.m21698a(dataInput);
        int a7 = bl.m21698a(dataInput);
        av a8 = av.m21574a(dataInput, bcVar);
        byte readByte = dataInput.readByte();
        int readInt = dataInput.readInt();
        C4699a c4699a = null;
        if (ac.m21434a(1, readInt)) {
            a2 = C4699a.m20894a(dataInput);
        } else {
            if (ac.m21434a(2, readInt)) {
                a2 = C4699a.m20897b(dataInput);
            }
            a3 = bl.m21698a(dataInput);
            iArr = new int[a3];
            for (i = 0; i < a3; i++) {
                iArr[i] = bl.m21698a(dataInput);
            }
            return new C6518e(anVar.m21541a(), c4699a, a4, a5, bArr, a6, a7, a8.m21575a(), a8.m21577c(), a8.m21576b(), readByte, readInt, iArr);
        }
        c4699a = a2;
        a3 = bl.m21698a(dataInput);
        iArr = new int[a3];
        for (i = 0; i < a3; i++) {
            iArr[i] = bl.m21698a(dataInput);
        }
        return new C6518e(anVar.m21541a(), c4699a, a4, a5, bArr, a6, a7, a8.m21575a(), a8.m21577c(), a8.m21576b(), readByte, readInt, iArr);
    }

    /* renamed from: a */
    public final C4699a mo5107a() {
        return this.f24170b;
    }

    /* renamed from: b */
    public final bj m28703b() {
        return this.f24171c;
    }

    /* renamed from: a */
    public final boolean m28702a(int i, int i2) {
        return (this.f24173e[i] & f24167n[i2]) != 0;
    }

    /* renamed from: c */
    public final int m28704c() {
        int i = 0;
        for (byte b : this.f24173e) {
            i += f24168o[b & 7];
        }
        return i;
    }

    /* renamed from: d */
    public final boolean m28705d() {
        return ac.m21434a(this.f24180l, 4);
    }

    /* renamed from: f */
    public final int m28707f() {
        return this.f24177i;
    }

    /* renamed from: g */
    public final int m28708g() {
        return this.f24178j;
    }

    /* renamed from: e */
    public final as mo5108e() {
        return this.f24174f;
    }

    /* renamed from: i */
    public final int mo5110i() {
        return this.f24179k;
    }

    /* renamed from: l */
    public final int[] mo5111l() {
        return this.f24181m;
    }

    /* renamed from: m */
    public final int mo5112m() {
        int i;
        int b = (this.f24171c.m21695b() + 68) + this.f24173e.length;
        if (this.f24172d == null) {
            i = 0;
        } else {
            i = this.f24172d.m21695b();
        }
        return b + (((ac.m21428a(this.f24170b) + i) + ac.m21432a(this.f24176h)) + ac.m21430a(this.f24174f));
    }
}
