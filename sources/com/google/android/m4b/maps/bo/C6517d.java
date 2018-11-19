package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ax.C4699a;

/* renamed from: com.google.android.m4b.maps.bo.d */
public final class C6517d implements C4848k {
    /* renamed from: a */
    private final int f24157a;
    /* renamed from: b */
    private final C4699a f24158b;
    /* renamed from: c */
    private final bj f24159c;
    /* renamed from: d */
    private final byte[] f24160d;
    /* renamed from: e */
    private final as f24161e;
    /* renamed from: f */
    private final int f24162f;
    /* renamed from: g */
    private final String f24163g;
    /* renamed from: h */
    private final int f24164h;
    /* renamed from: i */
    private final int f24165i;
    /* renamed from: j */
    private final int[] f24166j;

    /* renamed from: h */
    public final int mo5109h() {
        return 3;
    }

    public C6517d(int i, C4699a c4699a, bj bjVar, byte[] bArr, as asVar, int i2, String str, int i3, int i4, int[] iArr) {
        this.f24157a = i;
        this.f24158b = c4699a;
        this.f24159c = bjVar;
        this.f24160d = bArr;
        this.f24161e = asVar;
        this.f24162f = i2;
        this.f24163g = str;
        this.f24164h = i3;
        this.f24165i = i4;
        this.f24166j = iArr;
    }

    /* renamed from: a */
    public final C4699a mo5107a() {
        return this.f24158b;
    }

    /* renamed from: b */
    public final bj m28688b() {
        return this.f24159c;
    }

    /* renamed from: c */
    public final boolean m28689c() {
        return this.f24160d != null;
    }

    /* renamed from: d */
    public final byte[] m28690d() {
        return this.f24160d;
    }

    /* renamed from: e */
    public final as mo5108e() {
        return this.f24161e;
    }

    /* renamed from: f */
    public final int m28692f() {
        return this.f24162f;
    }

    /* renamed from: g */
    public final String m28693g() {
        return this.f24163g;
    }

    /* renamed from: i */
    public final int mo5110i() {
        return this.f24164h;
    }

    /* renamed from: j */
    public final boolean m28696j() {
        return ac.m21434a(this.f24165i, 4);
    }

    /* renamed from: k */
    public final boolean m28697k() {
        return ac.m21434a(this.f24165i, 8);
    }

    /* renamed from: l */
    public final int[] mo5111l() {
        return this.f24166j;
    }

    /* renamed from: m */
    public final int mo5112m() {
        return ((this.f24159c.m21695b() + 60) + this.f24160d.length) + ((ac.m21428a(this.f24158b) + ac.m21432a(this.f24163g)) + ac.m21430a(this.f24161e));
    }
}
