package org.apache.commons.lang3.builder;

import java.util.Set;

/* renamed from: org.apache.commons.lang3.builder.d */
public class C17716d implements Builder<Integer> {
    /* renamed from: a */
    private static final ThreadLocal<Set<Object>> f55128a = new ThreadLocal();
    /* renamed from: b */
    private final int f55129b;
    /* renamed from: c */
    private int f55130c;

    public /* synthetic */ Object build() {
        return m64549b();
    }

    public C17716d() {
        this.f55130c = 0;
        this.f55129b = 37;
        this.f55130c = 17;
    }

    /* renamed from: a */
    public C17716d m64539a(boolean z) {
        this.f55130c = (this.f55130c * this.f55129b) + (z ^ 1);
        return this;
    }

    /* renamed from: a */
    public C17716d m64548a(boolean[] zArr) {
        if (zArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (boolean a : zArr) {
                m64539a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64531a(byte b) {
        this.f55130c = (this.f55130c * this.f55129b) + b;
        return this;
    }

    /* renamed from: a */
    public C17716d m64540a(byte[] bArr) {
        if (bArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (byte a : bArr) {
                m64531a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64532a(char c) {
        this.f55130c = (this.f55130c * this.f55129b) + c;
        return this;
    }

    /* renamed from: a */
    public C17716d m64541a(char[] cArr) {
        if (cArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (char a : cArr) {
                m64532a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64533a(double d) {
        return m64536a(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public C17716d m64542a(double[] dArr) {
        if (dArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (double a : dArr) {
                m64533a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64534a(float f) {
        this.f55130c = (this.f55130c * this.f55129b) + Float.floatToIntBits(f);
        return this;
    }

    /* renamed from: a */
    public C17716d m64543a(float[] fArr) {
        if (fArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (float a : fArr) {
                m64534a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64535a(int i) {
        this.f55130c = (this.f55130c * this.f55129b) + i;
        return this;
    }

    /* renamed from: a */
    public C17716d m64544a(int[] iArr) {
        if (iArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (int a : iArr) {
                m64535a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64536a(long j) {
        this.f55130c = (this.f55130c * this.f55129b) + ((int) (j ^ (j >> 32)));
        return this;
    }

    /* renamed from: a */
    public C17716d m64545a(long[] jArr) {
        if (jArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (long a : jArr) {
                m64536a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64537a(Object obj) {
        if (obj == null) {
            this.f55130c *= this.f55129b;
        } else if (obj.getClass().isArray()) {
            m64529b(obj);
        } else {
            this.f55130c = (this.f55130c * this.f55129b) + obj.hashCode();
        }
        return this;
    }

    /* renamed from: b */
    private void m64529b(Object obj) {
        if (obj instanceof long[]) {
            m64545a((long[]) obj);
        } else if (obj instanceof int[]) {
            m64544a((int[]) obj);
        } else if (obj instanceof short[]) {
            m64547a((short[]) obj);
        } else if (obj instanceof char[]) {
            m64541a((char[]) obj);
        } else if (obj instanceof byte[]) {
            m64540a((byte[]) obj);
        } else if (obj instanceof double[]) {
            m64542a((double[]) obj);
        } else if (obj instanceof float[]) {
            m64543a((float[]) obj);
        } else if (obj instanceof boolean[]) {
            m64548a((boolean[]) obj);
        } else {
            m64546a((Object[]) obj);
        }
    }

    /* renamed from: a */
    public C17716d m64546a(Object[] objArr) {
        if (objArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (Object a : objArr) {
                m64537a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C17716d m64538a(short s) {
        this.f55130c = (this.f55130c * this.f55129b) + s;
        return this;
    }

    /* renamed from: a */
    public C17716d m64547a(short[] sArr) {
        if (sArr == null) {
            this.f55130c *= this.f55129b;
        } else {
            for (short a : sArr) {
                m64538a(a);
            }
        }
        return this;
    }

    /* renamed from: a */
    public int m64530a() {
        return this.f55130c;
    }

    /* renamed from: b */
    public Integer m64549b() {
        return Integer.valueOf(m64530a());
    }

    public int hashCode() {
        return m64530a();
    }
}
