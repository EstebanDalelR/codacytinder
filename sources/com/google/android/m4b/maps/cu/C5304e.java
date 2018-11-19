package com.google.android.m4b.maps.cu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.cu.e */
final class C5304e implements Cloneable {
    /* renamed from: a */
    private C5302c<?, ?> f19692a;
    /* renamed from: b */
    private Object f19693b;
    /* renamed from: c */
    private List<C5308i> f19694c = new ArrayList();

    public final /* synthetic */ Object clone() {
        return m23529b();
    }

    C5304e() {
    }

    /* renamed from: a */
    final int m23527a() {
        if (this.f19693b != null) {
            return this.f19692a.m23520a(this.f19693b);
        }
        int i = 0;
        for (C5308i c5308i : this.f19694c) {
            i += (C5301a.m23499c(c5308i.f19697a) + 0) + c5308i.f19698b.length;
        }
        return i;
    }

    /* renamed from: a */
    final void m23528a(C5301a c5301a) {
        if (this.f19693b != null) {
            this.f19692a.m23521a(this.f19693b, c5301a);
            return;
        }
        for (C5308i c5308i : this.f19694c) {
            c5301a.m23514b(c5308i.f19697a);
            c5301a.m23516b(c5308i.f19698b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5304e)) {
            return false;
        }
        C5304e c5304e = (C5304e) obj;
        if (this.f19693b == null || c5304e.f19693b == null) {
            if (this.f19694c != null && c5304e.f19694c != null) {
                return this.f19694c.equals(c5304e.f19694c);
            }
            try {
                return Arrays.equals(m23526c(), c5304e.m23526c());
            } catch (Object obj2) {
                throw new IllegalStateException(obj2);
            }
        } else if (this.f19692a != c5304e.f19692a) {
            return false;
        } else {
            if (!this.f19692a.f19683a.isArray()) {
                return this.f19693b.equals(c5304e.f19693b);
            }
            if (this.f19693b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f19693b, (byte[]) c5304e.f19693b);
            }
            if (this.f19693b instanceof int[]) {
                return Arrays.equals((int[]) this.f19693b, (int[]) c5304e.f19693b);
            }
            if (this.f19693b instanceof long[]) {
                return Arrays.equals((long[]) this.f19693b, (long[]) c5304e.f19693b);
            }
            if (this.f19693b instanceof float[]) {
                return Arrays.equals((float[]) this.f19693b, (float[]) c5304e.f19693b);
            }
            if (this.f19693b instanceof double[]) {
                return Arrays.equals((double[]) this.f19693b, (double[]) c5304e.f19693b);
            }
            if (this.f19693b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f19693b, (boolean[]) c5304e.f19693b);
            }
            return Arrays.deepEquals((Object[]) this.f19693b, (Object[]) c5304e.f19693b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m23526c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private byte[] m23526c() {
        byte[] bArr = new byte[m23527a()];
        m23528a(C5301a.m23489a(bArr));
        return bArr;
    }

    /* renamed from: b */
    public final C5304e m23529b() {
        C5304e c5304e = new C5304e();
        try {
            c5304e.f19692a = this.f19692a;
            if (this.f19694c == null) {
                c5304e.f19694c = null;
            } else {
                c5304e.f19694c.addAll(this.f19694c);
            }
            if (this.f19693b != null) {
                if (this.f19693b instanceof C5306g) {
                    c5304e.f19693b = ((C5306g) this.f19693b).mo5395d();
                } else if (this.f19693b instanceof byte[]) {
                    c5304e.f19693b = ((byte[]) this.f19693b).clone();
                } else {
                    int i = 0;
                    Object obj;
                    if (this.f19693b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f19693b;
                        obj = new byte[bArr.length][];
                        c5304e.f19693b = obj;
                        while (i < bArr.length) {
                            obj[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f19693b instanceof boolean[]) {
                        c5304e.f19693b = ((boolean[]) this.f19693b).clone();
                    } else if (this.f19693b instanceof int[]) {
                        c5304e.f19693b = ((int[]) this.f19693b).clone();
                    } else if (this.f19693b instanceof long[]) {
                        c5304e.f19693b = ((long[]) this.f19693b).clone();
                    } else if (this.f19693b instanceof float[]) {
                        c5304e.f19693b = ((float[]) this.f19693b).clone();
                    } else if (this.f19693b instanceof double[]) {
                        c5304e.f19693b = ((double[]) this.f19693b).clone();
                    } else if (this.f19693b instanceof C5306g[]) {
                        C5306g[] c5306gArr = (C5306g[]) this.f19693b;
                        obj = new C5306g[c5306gArr.length];
                        c5304e.f19693b = obj;
                        while (i < c5306gArr.length) {
                            obj[i] = c5306gArr[i].mo5395d();
                            i++;
                        }
                    }
                }
            }
            return c5304e;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
