package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.d */
public final class C3721d implements Allocator {
    /* renamed from: a */
    private final boolean f11729a;
    /* renamed from: b */
    private final int f11730b;
    /* renamed from: c */
    private final byte[] f11731c;
    /* renamed from: d */
    private final C2278a[] f11732d;
    /* renamed from: e */
    private int f11733e;
    /* renamed from: f */
    private int f11734f;
    /* renamed from: g */
    private int f11735g;
    /* renamed from: h */
    private C2278a[] f11736h;

    public C3721d(boolean z, int i) {
        this(z, i, 0);
    }

    public C3721d(boolean z, int i, int i2) {
        C2289a.m8311a(i > 0);
        C2289a.m8311a(i2 >= 0);
        this.f11729a = z;
        this.f11730b = i;
        this.f11735g = i2;
        this.f11736h = new C2278a[(i2 + 100)];
        if (i2 > 0) {
            this.f11731c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f11736h[i3] = new C2278a(this.f11731c, i3 * i);
            }
        } else {
            this.f11731c = false;
        }
        this.f11732d = new C2278a[1];
    }

    /* renamed from: a */
    public synchronized void m14138a() {
        if (this.f11729a) {
            m14139a(0);
        }
    }

    /* renamed from: a */
    public synchronized void m14139a(int i) {
        Object obj = i < this.f11733e ? 1 : null;
        this.f11733e = i;
        if (obj != null) {
            trim();
        }
    }

    public synchronized C2278a allocate() {
        C2278a c2278a;
        this.f11734f++;
        if (this.f11735g > 0) {
            C2278a[] c2278aArr = this.f11736h;
            int i = this.f11735g - 1;
            this.f11735g = i;
            c2278a = c2278aArr[i];
            this.f11736h[this.f11735g] = null;
        } else {
            c2278a = new C2278a(new byte[this.f11730b], 0);
        }
        return c2278a;
    }

    public synchronized void release(C2278a c2278a) {
        this.f11732d[0] = c2278a;
        release(this.f11732d);
    }

    public synchronized void release(C2278a[] c2278aArr) {
        if (this.f11735g + c2278aArr.length >= this.f11736h.length) {
            this.f11736h = (C2278a[]) Arrays.copyOf(this.f11736h, Math.max(this.f11736h.length * 2, this.f11735g + c2278aArr.length));
        }
        for (C2278a c2278a : c2278aArr) {
            boolean z;
            C2278a[] c2278aArr2;
            int i;
            if (c2278a.f6843a != this.f11731c) {
                if (c2278a.f6843a.length != this.f11730b) {
                    z = false;
                    C2289a.m8311a(z);
                    c2278aArr2 = this.f11736h;
                    i = this.f11735g;
                    this.f11735g = i + 1;
                    c2278aArr2[i] = c2278a;
                }
            }
            z = true;
            C2289a.m8311a(z);
            c2278aArr2 = this.f11736h;
            i = this.f11735g;
            this.f11735g = i + 1;
            c2278aArr2[i] = c2278a;
        }
        this.f11734f -= c2278aArr.length;
        notifyAll();
    }

    public synchronized void trim() {
        int i = 0;
        int max = Math.max(0, C2314v.m8455a(this.f11733e, this.f11730b) - this.f11734f);
        if (max < this.f11735g) {
            if (this.f11731c != null) {
                int i2 = this.f11735g - 1;
                while (i <= i2) {
                    C2278a c2278a = this.f11736h[i];
                    if (c2278a.f6843a == this.f11731c) {
                        i++;
                    } else {
                        C2278a c2278a2 = this.f11736h[i2];
                        if (c2278a2.f6843a != this.f11731c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.f11736h[i] = c2278a2;
                            int i4 = i2 - 1;
                            this.f11736h[i2] = c2278a;
                            i2 = i4;
                            i = i3;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f11735g) {
                    return;
                }
            }
            Arrays.fill(this.f11736h, max, this.f11735g, null);
            this.f11735g = max;
        }
    }

    public synchronized int getTotalBytesAllocated() {
        return this.f11734f * this.f11730b;
    }

    public int getIndividualAllocationLength() {
        return this.f11730b;
    }
}
