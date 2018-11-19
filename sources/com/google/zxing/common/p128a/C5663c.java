package com.google.zxing.common.p128a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.a.c */
public final class C5663c {
    /* renamed from: a */
    private final C5661a f20985a;
    /* renamed from: b */
    private final List<C5662b> f20986b = new ArrayList();

    public C5663c(C5661a c5661a) {
        this.f20985a = c5661a;
        this.f20986b.add(new C5662b(c5661a, new int[]{1}));
    }

    /* renamed from: a */
    private C5662b m24747a(int i) {
        if (i >= this.f20986b.size()) {
            C5662b c5662b = (C5662b) this.f20986b.get(this.f20986b.size() - 1);
            for (int size = this.f20986b.size(); size <= i; size++) {
                c5662b = c5662b.m24744b(new C5662b(this.f20985a, new int[]{1, this.f20985a.m24732a((size - 1) + this.f20985a.m24735b())}));
                this.f20986b.add(c5662b);
            }
        }
        return (C5662b) this.f20986b.get(i);
    }

    /* renamed from: a */
    public void m24748a(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        C5662b a = m24747a(i);
        Object obj = new int[length];
        System.arraycopy(iArr, 0, obj, 0, length);
        Object a2 = new C5662b(this.f20985a, obj).m24740a(i, 1).m24746c(a)[1].m24742a();
        i -= a2.length;
        for (int i2 = 0; i2 < i; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(a2, 0, iArr, length + i, a2.length);
    }
}
