package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.C2289a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.ts.m */
final class C2112m {
    /* renamed from: a */
    public byte[] f6028a;
    /* renamed from: b */
    public int f6029b;
    /* renamed from: c */
    private final int f6030c;
    /* renamed from: d */
    private boolean f6031d;
    /* renamed from: e */
    private boolean f6032e;

    public C2112m(int i, int i2) {
        this.f6030c = i;
        this.f6028a = new byte[(i2 + 3)];
        this.f6028a[2] = (byte) 1;
    }

    /* renamed from: a */
    public void m7559a() {
        this.f6031d = false;
        this.f6032e = false;
    }

    /* renamed from: b */
    public boolean m7562b() {
        return this.f6032e;
    }

    /* renamed from: a */
    public void m7560a(int i) {
        boolean z = true;
        C2289a.m8313b(this.f6031d ^ true);
        if (i != this.f6030c) {
            z = false;
        }
        this.f6031d = z;
        if (this.f6031d != 0) {
            this.f6029b = 3;
            this.f6032e = false;
        }
    }

    /* renamed from: a */
    public void m7561a(byte[] bArr, int i, int i2) {
        if (this.f6031d) {
            i2 -= i;
            if (this.f6028a.length < this.f6029b + i2) {
                this.f6028a = Arrays.copyOf(this.f6028a, (this.f6029b + i2) * 2);
            }
            System.arraycopy(bArr, i, this.f6028a, this.f6029b, i2);
            this.f6029b += i2;
        }
    }

    /* renamed from: b */
    public boolean m7563b(int i) {
        if (!this.f6031d) {
            return false;
        }
        this.f6029b -= i;
        this.f6031d = false;
        this.f6032e = true;
        return true;
    }
}
