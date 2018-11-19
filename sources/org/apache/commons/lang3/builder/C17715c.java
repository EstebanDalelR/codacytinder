package org.apache.commons.lang3.builder;

import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

/* renamed from: org.apache.commons.lang3.builder.c */
public class C17715c implements Builder<Boolean> {
    /* renamed from: a */
    private static final ThreadLocal<Set<Pair<Object, Object>>> f55126a = new ThreadLocal();
    /* renamed from: b */
    private boolean f55127b = true;

    public /* synthetic */ Object build() {
        return m64528b();
    }

    /* renamed from: a */
    public C17715c m64514a(Object obj, Object obj2) {
        if (!this.f55127b || obj == obj2) {
            return this;
        }
        if (obj != null) {
            if (obj2 != null) {
                if (obj.getClass().isArray()) {
                    m64507b(obj, obj2);
                } else {
                    this.f55127b = obj.equals(obj2);
                }
                return this;
            }
        }
        m64526a(null);
        return this;
    }

    /* renamed from: b */
    private void m64507b(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            m64526a(null);
        } else if (obj instanceof long[]) {
            m64522a((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            m64521a((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            m64524a((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            m64518a((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            m64517a((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            m64519a((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            m64520a((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            m64525a((boolean[]) obj, (boolean[]) obj2);
        } else {
            m64523a((Object[]) obj, (Object[]) obj2);
        }
    }

    /* renamed from: a */
    public C17715c m64513a(long j, long j2) {
        if (!this.f55127b) {
            return this;
        }
        this.f55127b = j == j2 ? 1 : null;
        return this;
    }

    /* renamed from: a */
    public C17715c m64512a(int i, int i2) {
        if (!this.f55127b) {
            return this;
        }
        this.f55127b = i == i2 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C17715c m64515a(short s, short s2) {
        if (!this.f55127b) {
            return this;
        }
        this.f55127b = s == s2 ? (short) 1 : (short) 0;
        return this;
    }

    /* renamed from: a */
    public C17715c m64509a(char c, char c2) {
        if (!this.f55127b) {
            return this;
        }
        this.f55127b = c == c2 ? '\u0001' : '\u0000';
        return this;
    }

    /* renamed from: a */
    public C17715c m64508a(byte b, byte b2) {
        if (!this.f55127b) {
            return this;
        }
        this.f55127b = b == b2 ? (byte) 1 : (byte) 0;
        return this;
    }

    /* renamed from: a */
    public C17715c m64510a(double d, double d2) {
        if (this.f55127b) {
            return m64513a(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
        }
        return this;
    }

    /* renamed from: a */
    public C17715c m64511a(float f, float f2) {
        if (this.f55127b) {
            return m64512a(Float.floatToIntBits(f), Float.floatToIntBits(f2));
        }
        return this;
    }

    /* renamed from: a */
    public C17715c m64516a(boolean z, boolean z2) {
        if (!this.f55127b) {
            return this;
        }
        this.f55127b = z == z2;
        return this;
    }

    /* renamed from: a */
    public C17715c m64523a(Object[] objArr, Object[] objArr2) {
        if (!this.f55127b || objArr == objArr2) {
            return this;
        }
        int i = 0;
        if (objArr != null) {
            if (objArr2 != null) {
                if (objArr.length != objArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < objArr.length && this.f55127b) {
                    m64514a(objArr[i], objArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64522a(long[] jArr, long[] jArr2) {
        if (!this.f55127b || jArr == jArr2) {
            return this;
        }
        int i = 0;
        if (jArr != null) {
            if (jArr2 != null) {
                if (jArr.length != jArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < jArr.length && this.f55127b) {
                    m64513a(jArr[i], jArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64521a(int[] iArr, int[] iArr2) {
        if (!this.f55127b || iArr == iArr2) {
            return this;
        }
        int i = 0;
        if (iArr != null) {
            if (iArr2 != null) {
                if (iArr.length != iArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < iArr.length && this.f55127b) {
                    m64512a(iArr[i], iArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64524a(short[] sArr, short[] sArr2) {
        if (!this.f55127b || sArr == sArr2) {
            return this;
        }
        int i = 0;
        if (sArr != null) {
            if (sArr2 != null) {
                if (sArr.length != sArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < sArr.length && this.f55127b) {
                    m64515a(sArr[i], sArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64518a(char[] cArr, char[] cArr2) {
        if (!this.f55127b || cArr == cArr2) {
            return this;
        }
        int i = 0;
        if (cArr != null) {
            if (cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < cArr.length && this.f55127b) {
                    m64509a(cArr[i], cArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64517a(byte[] bArr, byte[] bArr2) {
        if (!this.f55127b || bArr == bArr2) {
            return this;
        }
        int i = 0;
        if (bArr != null) {
            if (bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < bArr.length && this.f55127b) {
                    m64508a(bArr[i], bArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64519a(double[] dArr, double[] dArr2) {
        if (!this.f55127b || dArr == dArr2) {
            return this;
        }
        int i = 0;
        if (dArr != null) {
            if (dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < dArr.length && this.f55127b) {
                    m64510a(dArr[i], dArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64520a(float[] fArr, float[] fArr2) {
        if (!this.f55127b || fArr == fArr2) {
            return this;
        }
        int i = 0;
        if (fArr != null) {
            if (fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < fArr.length && this.f55127b) {
                    m64511a(fArr[i], fArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public C17715c m64525a(boolean[] zArr, boolean[] zArr2) {
        if (!this.f55127b || zArr == zArr2) {
            return this;
        }
        int i = 0;
        if (zArr != null) {
            if (zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    m64526a(false);
                    return this;
                }
                while (i < zArr.length && this.f55127b) {
                    m64516a(zArr[i], zArr2[i]);
                    i++;
                }
                return this;
            }
        }
        m64526a(false);
        return this;
    }

    /* renamed from: a */
    public boolean m64527a() {
        return this.f55127b;
    }

    /* renamed from: b */
    public Boolean m64528b() {
        return Boolean.valueOf(m64527a());
    }

    /* renamed from: a */
    protected void m64526a(boolean z) {
        this.f55127b = z;
    }
}
