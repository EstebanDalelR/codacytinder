package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class aec implements Cloneable {
    /* renamed from: a */
    private aea<?, ?> f15098a;
    /* renamed from: b */
    private Object f15099b;
    /* renamed from: c */
    private List<aeg> f15100c = new ArrayList();

    aec() {
    }

    /* renamed from: b */
    private final byte[] m19042b() throws IOException {
        byte[] bArr = new byte[m19044a()];
        m19045a(ady.m19004a(bArr));
        return bArr;
    }

    /* renamed from: c */
    private aec m19043c() {
        aec aec = new aec();
        try {
            aec.f15098a = this.f15098a;
            if (this.f15100c == null) {
                aec.f15100c = null;
            } else {
                aec.f15100c.addAll(this.f15100c);
            }
            if (this.f15099b != null) {
                Object obj;
                if (this.f15099b instanceof aee) {
                    obj = (aee) ((aee) this.f15099b).clone();
                } else if (this.f15099b instanceof byte[]) {
                    obj = ((byte[]) this.f15099b).clone();
                } else {
                    int i = 0;
                    Object obj2;
                    if (this.f15099b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f15099b;
                        obj2 = new byte[bArr.length][];
                        aec.f15099b = obj2;
                        while (i < bArr.length) {
                            obj2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f15099b instanceof boolean[]) {
                        obj = ((boolean[]) this.f15099b).clone();
                    } else if (this.f15099b instanceof int[]) {
                        obj = ((int[]) this.f15099b).clone();
                    } else if (this.f15099b instanceof long[]) {
                        obj = ((long[]) this.f15099b).clone();
                    } else if (this.f15099b instanceof float[]) {
                        obj = ((float[]) this.f15099b).clone();
                    } else if (this.f15099b instanceof double[]) {
                        obj = ((double[]) this.f15099b).clone();
                    } else if (this.f15099b instanceof aee[]) {
                        aee[] aeeArr = (aee[]) this.f15099b;
                        obj2 = new aee[aeeArr.length];
                        aec.f15099b = obj2;
                        while (i < aeeArr.length) {
                            obj2[i] = (aee) aeeArr[i].clone();
                            i++;
                        }
                    }
                }
                aec.f15099b = obj;
                return aec;
            }
            return aec;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    final int m19044a() {
        int i;
        int i2 = 0;
        if (this.f15099b != null) {
            aea aea = this.f15098a;
            Object obj = this.f15099b;
            if (!aea.f15091c) {
                return aea.m19033a(obj);
            }
            int length = Array.getLength(obj);
            i = 0;
            while (i2 < length) {
                if (Array.get(obj, i2) != null) {
                    i += aea.m19033a(Array.get(obj, i2));
                }
                i2++;
            }
        } else {
            i = 0;
            for (aeg aeg : this.f15100c) {
                i += (ady.m19016d(aeg.f15105a) + 0) + aeg.f15106b.length;
            }
        }
        return i;
    }

    /* renamed from: a */
    final void m19045a(ady ady) throws IOException {
        if (this.f15099b != null) {
            aea aea = this.f15098a;
            Object obj = this.f15099b;
            if (aea.f15091c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        aea.m19034a(obj2, ady);
                    }
                }
                return;
            }
            aea.m19034a(obj, ady);
            return;
        }
        for (aeg aeg : this.f15100c) {
            ady.m19029c(aeg.f15105a);
            ady.m19032c(aeg.f15106b);
        }
    }

    /* renamed from: a */
    final void m19046a(aeg aeg) {
        this.f15100c.add(aeg);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m19043c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aec = (aec) obj;
        if (this.f15099b != null && aec.f15099b != null) {
            return this.f15098a != aec.f15098a ? false : !this.f15098a.f15089a.isArray() ? this.f15099b.equals(aec.f15099b) : this.f15099b instanceof byte[] ? Arrays.equals((byte[]) this.f15099b, (byte[]) aec.f15099b) : this.f15099b instanceof int[] ? Arrays.equals((int[]) this.f15099b, (int[]) aec.f15099b) : this.f15099b instanceof long[] ? Arrays.equals((long[]) this.f15099b, (long[]) aec.f15099b) : this.f15099b instanceof float[] ? Arrays.equals((float[]) this.f15099b, (float[]) aec.f15099b) : this.f15099b instanceof double[] ? Arrays.equals((double[]) this.f15099b, (double[]) aec.f15099b) : this.f15099b instanceof boolean[] ? Arrays.equals((boolean[]) this.f15099b, (boolean[]) aec.f15099b) : Arrays.deepEquals((Object[]) this.f15099b, (Object[]) aec.f15099b);
        } else {
            if (this.f15100c != null && aec.f15100c != null) {
                return this.f15100c.equals(aec.f15100c);
            }
            try {
                return Arrays.equals(m19042b(), aec.m19042b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m19042b()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
