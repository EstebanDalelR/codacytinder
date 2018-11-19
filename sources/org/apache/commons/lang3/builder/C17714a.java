package org.apache.commons.lang3.builder;

import java.util.Comparator;

/* renamed from: org.apache.commons.lang3.builder.a */
public class C17714a implements Builder<Integer> {
    /* renamed from: a */
    private int f55125a = 0;

    public /* synthetic */ Object build() {
        return m64506b();
    }

    /* renamed from: a */
    public C17714a m64493a(Object obj, Object obj2) {
        return m64494a(obj, obj2, null);
    }

    /* renamed from: a */
    public C17714a m64494a(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f55125a != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f55125a = -1;
            return this;
        } else if (obj2 == null) {
            this.f55125a = 1;
            return this;
        } else {
            if (obj.getClass().isArray()) {
                m64485b(obj, obj2, comparator);
            } else if (comparator == null) {
                this.f55125a = ((Comparable) obj).compareTo(obj2);
            } else {
                this.f55125a = comparator.compare(obj, obj2);
            }
            return this;
        }
    }

    /* renamed from: b */
    private void m64485b(Object obj, Object obj2, Comparator<?> comparator) {
        if (obj instanceof long[]) {
            m64502a((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            m64501a((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            m64504a((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            m64498a((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            m64497a((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            m64499a((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            m64500a((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            m64505a((boolean[]) obj, (boolean[]) obj2);
        } else {
            m64503a((Object[]) obj, (Object[]) obj2, (Comparator) comparator);
        }
    }

    /* renamed from: a */
    public C17714a m64492a(long j, long j2) {
        if (this.f55125a != 0) {
            return this;
        }
        j = j < j2 ? -1 : j > j2 ? 1 : null;
        this.f55125a = j;
        return this;
    }

    /* renamed from: a */
    public C17714a m64491a(int i, int i2) {
        if (this.f55125a != 0) {
            return this;
        }
        i = i < i2 ? -1 : i > i2 ? 1 : 0;
        this.f55125a = i;
        return this;
    }

    /* renamed from: a */
    public C17714a m64495a(short s, short s2) {
        if (this.f55125a != 0) {
            return this;
        }
        s = s < s2 ? (short) -1 : s > s2 ? (short) 1 : (short) 0;
        this.f55125a = s;
        return this;
    }

    /* renamed from: a */
    public C17714a m64488a(char c, char c2) {
        if (this.f55125a != 0) {
            return this;
        }
        c = c < c2 ? '￿' : c > c2 ? '\u0001' : '\u0000';
        this.f55125a = c;
        return this;
    }

    /* renamed from: a */
    public C17714a m64487a(byte b, byte b2) {
        if (this.f55125a != 0) {
            return this;
        }
        b = b < b2 ? (byte) -1 : b > b2 ? (byte) 1 : (byte) 0;
        this.f55125a = b;
        return this;
    }

    /* renamed from: a */
    public C17714a m64489a(double d, double d2) {
        if (this.f55125a != 0) {
            return this;
        }
        this.f55125a = Double.compare(d, d2);
        return this;
    }

    /* renamed from: a */
    public C17714a m64490a(float f, float f2) {
        if (this.f55125a != 0) {
            return this;
        }
        this.f55125a = Float.compare(f, f2);
        return this;
    }

    /* renamed from: a */
    public C17714a m64496a(boolean z, boolean z2) {
        if (this.f55125a != 0 || z == z2) {
            return this;
        }
        if (z) {
            this.f55125a = true;
        } else {
            this.f55125a = true;
        }
        return this;
    }

    /* renamed from: a */
    public C17714a m64503a(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f55125a != 0 || objArr == objArr2) {
            return this;
        }
        int i = -1;
        if (objArr == null) {
            this.f55125a = -1;
            return this;
        } else if (objArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (objArr.length != objArr2.length) {
            if (objArr.length >= objArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < objArr.length && this.f55125a == 0; i++) {
                m64494a(objArr[i], objArr2[i], (Comparator) comparator);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64502a(long[] jArr, long[] jArr2) {
        if (this.f55125a != 0 || jArr == jArr2) {
            return this;
        }
        int i = -1;
        if (jArr == null) {
            this.f55125a = -1;
            return this;
        } else if (jArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (jArr.length != jArr2.length) {
            if (jArr.length >= jArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < jArr.length && this.f55125a == 0; i++) {
                m64492a(jArr[i], jArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64501a(int[] iArr, int[] iArr2) {
        if (this.f55125a != 0 || iArr == iArr2) {
            return this;
        }
        int i = -1;
        if (iArr == null) {
            this.f55125a = -1;
            return this;
        } else if (iArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (iArr.length != iArr2.length) {
            if (iArr.length >= iArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < iArr.length && this.f55125a == 0; i++) {
                m64491a(iArr[i], iArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64504a(short[] sArr, short[] sArr2) {
        if (this.f55125a != 0 || sArr == sArr2) {
            return this;
        }
        int i = -1;
        if (sArr == null) {
            this.f55125a = -1;
            return this;
        } else if (sArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (sArr.length != sArr2.length) {
            if (sArr.length >= sArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < sArr.length && this.f55125a == 0; i++) {
                m64495a(sArr[i], sArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64498a(char[] cArr, char[] cArr2) {
        if (this.f55125a != 0 || cArr == cArr2) {
            return this;
        }
        int i = -1;
        if (cArr == null) {
            this.f55125a = -1;
            return this;
        } else if (cArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (cArr.length != cArr2.length) {
            if (cArr.length >= cArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < cArr.length && this.f55125a == 0; i++) {
                m64488a(cArr[i], cArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64497a(byte[] bArr, byte[] bArr2) {
        if (this.f55125a != 0 || bArr == bArr2) {
            return this;
        }
        int i = -1;
        if (bArr == null) {
            this.f55125a = -1;
            return this;
        } else if (bArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (bArr.length != bArr2.length) {
            if (bArr.length >= bArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < bArr.length && this.f55125a == 0; i++) {
                m64487a(bArr[i], bArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64499a(double[] dArr, double[] dArr2) {
        if (this.f55125a != 0 || dArr == dArr2) {
            return this;
        }
        int i = -1;
        if (dArr == null) {
            this.f55125a = -1;
            return this;
        } else if (dArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (dArr.length != dArr2.length) {
            if (dArr.length >= dArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < dArr.length && this.f55125a == 0; i++) {
                m64489a(dArr[i], dArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64500a(float[] fArr, float[] fArr2) {
        if (this.f55125a != 0 || fArr == fArr2) {
            return this;
        }
        int i = -1;
        if (fArr == null) {
            this.f55125a = -1;
            return this;
        } else if (fArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (fArr.length != fArr2.length) {
            if (fArr.length >= fArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < fArr.length && this.f55125a == 0; i++) {
                m64490a(fArr[i], fArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public C17714a m64505a(boolean[] zArr, boolean[] zArr2) {
        if (this.f55125a != 0 || zArr == zArr2) {
            return this;
        }
        int i = -1;
        if (zArr == null) {
            this.f55125a = -1;
            return this;
        } else if (zArr2 == null) {
            this.f55125a = 1;
            return this;
        } else if (zArr.length != zArr2.length) {
            if (zArr.length >= zArr2.length) {
                i = 1;
            }
            this.f55125a = i;
            return this;
        } else {
            for (i = 0; i < zArr.length && this.f55125a == 0; i++) {
                m64496a(zArr[i], zArr2[i]);
            }
            return this;
        }
    }

    /* renamed from: a */
    public int m64486a() {
        return this.f55125a;
    }

    /* renamed from: b */
    public Integer m64506b() {
        return Integer.valueOf(m64486a());
    }
}
