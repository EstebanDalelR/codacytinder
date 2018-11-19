package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.ai.C4627c;
import com.google.android.m4b.maps.ai.C6392b;
import com.google.android.m4b.maps.bk.C4791a.C4789a;

/* renamed from: com.google.android.m4b.maps.bk.j */
class C6467j extends C4807m implements C4627c {
    C6467j(C6466g c6466g) {
        super((C4791a) c6466g);
        m28361a((C4791a) c6466g);
    }

    protected C6467j(double[] dArr) {
        super(dArr);
        m28361a(this.a);
    }

    private C6467j(double[] dArr, int[] iArr) {
        super(C6466g.m28340a(dArr), iArr);
    }

    /* renamed from: a */
    private void m28361a(C4791a c4791a) {
        this.c = c4791a.f17489a;
        this.b = new int[this.c];
        for (int i = 0; i < this.c; i++) {
            this.b[i] = i;
        }
        C6392b.m27903a().mo4859a(this, null, this.c - 1);
    }

    /* renamed from: d */
    public final C6467j m28369d(int i, int i2) {
        if (this.a.mo5024a() != 0) {
            throw new NullPointerException("Cannot create a sorted sublist when there are holes.");
        } else if (i > i2) {
            r1 = i2 + 1;
            r2 = new double[(((m21298e() + r1) - i) * 2)];
            this.a.mo5025a(0, r2, 0, r1);
            this.a.mo5025a(i, r2, r1, m21298e() - i);
            return new C6467j(r2, mo7055c(i, i2));
        } else {
            r1 = (i2 - i) + 1;
            r2 = new double[(r1 * 2)];
            this.a.mo5025a(i, r2, 0, r1);
            return new C6467j(r2, mo7055c(i, i2));
        }
    }

    /* renamed from: c */
    private int[] mo7055c(int i, int i2) {
        int i3 = 0;
        int[] iArr;
        int length;
        int i4;
        if (i > i2) {
            int i5 = (i - i2) - 1;
            iArr = new int[(this.c - i5)];
            int[] iArr2 = this.b;
            length = iArr2.length;
            i4 = 0;
            while (i3 < length) {
                int i6 = iArr2[i3];
                if (i6 <= i2) {
                    iArr[i4] = i6;
                    i4++;
                }
                if (i6 >= i) {
                    iArr[i4] = i6 - i5;
                    i4++;
                }
                i3++;
            }
            return iArr;
        }
        int[] iArr3 = new int[((i2 - i) + 1)];
        iArr = this.b;
        int length2 = iArr.length;
        length = 0;
        while (i3 < length2) {
            i4 = iArr[i3];
            if (i4 >= i && i4 <= i2) {
                iArr3[length] = i4 - i;
                length++;
            }
            i3++;
        }
        return iArr3;
    }

    /* renamed from: a */
    public final boolean mo5032a(int i, int i2) {
        int a = this.a.m21205a(this.b[i], this.b[i2]);
        if (a != 0) {
            return a < 0;
        } else {
            i = this.b[i];
            i2 = this.b[i2];
            int[] iArr = new int[]{i, this.a.mo5028d(i)};
            int[] iArr2 = new int[]{i2, this.a.mo5028d(i2)};
            int[] iArr3 = new int[]{i, this.a.mo5027c(i)};
            int[] iArr4 = new int[]{i2, this.a.mo5027c(i2)};
            i2 = new C4789a(this.a, i);
            i = i2.m21200a(iArr, iArr2) < 0 ? 1 : 0;
            if (i2.m21200a(iArr3, iArr4) >= 0) {
                return i2.m21200a(iArr, iArr4) < 0 && i != 0;
            } else {
                if (i2.m21200a(iArr3, iArr2) >= 0) {
                    if (i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: b */
    public final void mo5034b(int i, int i2) {
        int i3 = this.b[i];
        this.b[i] = this.b[i2];
        this.b[i2] = i3;
    }

    /* renamed from: a */
    public final void mo5030a() {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    /* renamed from: b */
    public final void mo5035b(int... iArr) {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    /* renamed from: e */
    public final void mo5036e(int i, int i2) {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    /* renamed from: f */
    public final void mo5037f(int i, int i2) {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    /* renamed from: b */
    public final void mo5033b() {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }

    /* renamed from: a */
    public final void mo5031a(int i) {
        throw new UnsupportedOperationException("SortedVertexMapping is immutable.");
    }
}
