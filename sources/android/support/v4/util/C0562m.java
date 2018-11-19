package android.support.v4.util;

import java.util.ConcurrentModificationException;

/* renamed from: android.support.v4.util.m */
public class C0562m<K, V> {
    /* renamed from: b */
    static Object[] f1736b;
    /* renamed from: c */
    static int f1737c;
    /* renamed from: d */
    static Object[] f1738d;
    /* renamed from: e */
    static int f1739e;
    /* renamed from: f */
    int[] f1740f;
    /* renamed from: g */
    Object[] f1741g;
    /* renamed from: h */
    int f1742h;

    /* renamed from: a */
    private static int m2065a(int[] r0, int r1, int r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = android.support.v4.util.C0547c.m2016a(r0, r1, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.util.ConcurrentModificationException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.m.a(int[], int, int):int");
    }

    /* renamed from: a */
    int m2070a(Object obj, int i) {
        int i2 = this.f1742h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0562m.m2065a(this.f1740f, i2, i);
        if (a < 0 || obj.equals(this.f1741g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1740f[i3] == i) {
            if (obj.equals(this.f1741g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1740f[a] == i) {
            if (obj.equals(this.f1741g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    int m2068a() {
        int i = this.f1742h;
        if (i == 0) {
            return -1;
        }
        int a = C0562m.m2065a(this.f1740f, i, 0);
        if (a < 0 || this.f1741g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1740f[i2] == 0) {
            if (this.f1741g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1740f[a] == 0) {
            if (this.f1741g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: e */
    private void m2067e(int i) {
        if (i == 8) {
            synchronized (C2880a.class) {
                if (f1738d != null) {
                    i = f1738d;
                    this.f1741g = i;
                    f1738d = (Object[]) i[0];
                    this.f1740f = (int[]) i[1];
                    i[1] = null;
                    i[0] = null;
                    f1739e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C2880a.class) {
                if (f1736b != null) {
                    i = f1736b;
                    this.f1741g = i;
                    f1736b = (Object[]) i[0];
                    this.f1740f = (int[]) i[1];
                    i[1] = null;
                    i[0] = null;
                    f1737c--;
                    return;
                }
            }
        }
        this.f1740f = new int[i];
        this.f1741g = new Object[(i << 1)];
    }

    /* renamed from: a */
    private static void m2066a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2880a.class) {
                if (f1739e < 10) {
                    objArr[0] = f1738d;
                    objArr[1] = iArr;
                    for (iArr = (i << 1) - 1; iArr >= 2; iArr--) {
                        objArr[iArr] = null;
                    }
                    f1738d = objArr;
                    f1739e += 1;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C2880a.class) {
                if (f1737c < 10) {
                    objArr[0] = f1736b;
                    objArr[1] = iArr;
                    for (iArr = (i << 1) - 1; iArr >= 2; iArr--) {
                        objArr[iArr] = null;
                    }
                    f1736b = objArr;
                    f1737c += 1;
                }
            }
        }
    }

    public C0562m() {
        this.f1740f = C0547c.f1699a;
        this.f1741g = C0547c.f1701c;
        this.f1742h = 0;
    }

    public C0562m(int i) {
        if (i == 0) {
            this.f1740f = C0547c.f1699a;
            this.f1741g = C0547c.f1701c;
        } else {
            m2067e(i);
        }
        this.f1742h = 0;
    }

    public C0562m(C0562m<K, V> c0562m) {
        this();
        if (c0562m != null) {
            m2073a((C0562m) c0562m);
        }
    }

    public void clear() {
        if (this.f1742h > 0) {
            int[] iArr = this.f1740f;
            Object[] objArr = this.f1741g;
            int i = this.f1742h;
            this.f1740f = C0547c.f1699a;
            this.f1741g = C0547c.f1701c;
            this.f1742h = 0;
            C0562m.m2066a(iArr, objArr, i);
        }
        if (this.f1742h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void m2072a(int i) {
        int i2 = this.f1742h;
        if (this.f1740f.length < i) {
            int[] iArr = this.f1740f;
            Object[] objArr = this.f1741g;
            m2067e(i);
            if (this.f1742h > 0) {
                System.arraycopy(iArr, 0, this.f1740f, 0, i2);
                System.arraycopy(objArr, 0, this.f1741g, 0, i2 << 1);
            }
            C0562m.m2066a(iArr, objArr, i2);
        }
        if (this.f1742h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m2069a(obj) >= null ? true : null;
    }

    /* renamed from: a */
    public int m2069a(Object obj) {
        return obj == null ? m2068a() : m2070a(obj, obj.hashCode());
    }

    /* renamed from: b */
    int m2074b(Object obj) {
        int i = this.f1742h * 2;
        Object[] objArr = this.f1741g;
        if (obj == null) {
            for (obj = true; obj < i; obj += 2) {
                if (objArr[obj] == null) {
                    return obj >> 1;
                }
            }
        } else {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (obj.equals(objArr[i2])) {
                    return i2 >> 1;
                }
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m2074b(obj) >= null ? true : null;
    }

    public V get(Object obj) {
        obj = m2069a(obj);
        return obj >= null ? this.f1741g[(obj << 1) + 1] : null;
    }

    /* renamed from: b */
    public K m2075b(int i) {
        return this.f1741g[i << 1];
    }

    /* renamed from: c */
    public V m2076c(int i) {
        return this.f1741g[(i << 1) + 1];
    }

    /* renamed from: a */
    public V m2071a(int i, V v) {
        i = (i << 1) + 1;
        V v2 = this.f1741g[i];
        this.f1741g[i] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f1742h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = this.f1742h;
        if (k == null) {
            a = m2068a();
            i = 0;
        } else {
            a = k.hashCode();
            i = a;
            a = m2070a((Object) k, a);
        }
        if (a >= 0) {
            k = (a << 1) + 1;
            V v2 = this.f1741g[k];
            this.f1741g[k] = v;
            return v2;
        }
        a ^= -1;
        if (i2 >= this.f1740f.length) {
            int i3 = 4;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i3 = 8;
            }
            int[] iArr = this.f1740f;
            Object[] objArr = this.f1741g;
            m2067e(i3);
            if (i2 != this.f1742h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1740f.length > 0) {
                System.arraycopy(iArr, 0, this.f1740f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1741g, 0, objArr.length);
            }
            C0562m.m2066a(iArr, objArr, i2);
        }
        if (a < i2) {
            int i4 = a + 1;
            System.arraycopy(this.f1740f, a, this.f1740f, i4, i2 - a);
            System.arraycopy(this.f1741g, a << 1, this.f1741g, i4 << 1, (this.f1742h - a) << 1);
        }
        if (i2 == this.f1742h) {
            if (a < this.f1740f.length) {
                this.f1740f[a] = i;
                int i5 = a << 1;
                this.f1741g[i5] = k;
                this.f1741g[i5 + 1] = v;
                this.f1742h++;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    public void m2073a(C0562m<? extends K, ? extends V> c0562m) {
        int i = c0562m.f1742h;
        m2072a(this.f1742h + i);
        int i2 = 0;
        if (this.f1742h != 0) {
            while (i2 < i) {
                put(c0562m.m2075b(i2), c0562m.m2076c(i2));
                i2++;
            }
        } else if (i > 0) {
            System.arraycopy(c0562m.f1740f, 0, this.f1740f, 0, i);
            System.arraycopy(c0562m.f1741g, 0, this.f1741g, 0, i << 1);
            this.f1742h = i;
        }
    }

    public V remove(Object obj) {
        obj = m2069a(obj);
        return obj >= null ? m2077d(obj) : null;
    }

    /* renamed from: d */
    public V m2077d(int i) {
        int i2 = i << 1;
        V v = this.f1741g[i2 + 1];
        int i3 = this.f1742h;
        int i4 = 0;
        if (i3 <= 1) {
            C0562m.m2066a(this.f1740f, this.f1741g, i3);
            this.f1740f = C0547c.f1699a;
            this.f1741g = C0547c.f1701c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f1740f.length <= 8 || this.f1742h >= this.f1740f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f1740f, i7, this.f1740f, i, i8);
                    System.arraycopy(this.f1741g, i7 << 1, this.f1741g, i2, i8 << 1);
                }
                i2 = i5 << 1;
                this.f1741g[i2] = null;
                this.f1741g[i2 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                Object obj = this.f1740f;
                Object obj2 = this.f1741g;
                m2067e(i6);
                if (i3 != this.f1742h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(obj, 0, this.f1740f, 0, i);
                    System.arraycopy(obj2, 0, this.f1741g, 0, i2);
                }
                if (i < i5) {
                    i4 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(obj, i4, this.f1740f, i, i9);
                    System.arraycopy(obj2, i4 << 1, this.f1741g, i2, i9 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f1742h) {
            throw new ConcurrentModificationException();
        }
        this.f1742h = i4;
        return v;
    }

    public int size() {
        return this.f1742h;
    }

    public boolean equals(java.lang.Object r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = 1;
        if (r6 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r7 instanceof android.support.v4.util.C0562m;
        r2 = 0;
        if (r1 == 0) goto L_0x003f;
    L_0x0009:
        r7 = (android.support.v4.util.C0562m) r7;
        r1 = r6.size();
        r3 = r7.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        r3 = r6.f1742h;	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
        if (r1 >= r3) goto L_0x003c;	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
    L_0x001b:
        r3 = r6.m2075b(r1);	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
        r4 = r6.m2076c(r1);	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
        r5 = r7.get(r3);	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
        if (r4 != 0) goto L_0x0032;	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
    L_0x0029:
        if (r5 != 0) goto L_0x0031;	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
    L_0x002b:
        r3 = r7.containsKey(r3);	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
        if (r3 != 0) goto L_0x0039;	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
    L_0x0031:
        return r2;	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
    L_0x0032:
        r3 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x003e, ClassCastException -> 0x003d }
        if (r3 != 0) goto L_0x0039;
    L_0x0038:
        return r2;
    L_0x0039:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x003c:
        return r0;
    L_0x003d:
        return r2;
    L_0x003e:
        return r2;
    L_0x003f:
        r1 = r7 instanceof java.util.Map;
        if (r1 == 0) goto L_0x0079;
    L_0x0043:
        r7 = (java.util.Map) r7;
        r1 = r6.size();
        r3 = r7.size();
        if (r1 == r3) goto L_0x0050;
    L_0x004f:
        return r2;
    L_0x0050:
        r1 = 0;
    L_0x0051:
        r3 = r6.f1742h;	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
        if (r1 >= r3) goto L_0x0076;	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
    L_0x0055:
        r3 = r6.m2075b(r1);	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
        r4 = r6.m2076c(r1);	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
        r5 = r7.get(r3);	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
        if (r4 != 0) goto L_0x006c;	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
    L_0x0063:
        if (r5 != 0) goto L_0x006b;	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
    L_0x0065:
        r3 = r7.containsKey(r3);	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
        if (r3 != 0) goto L_0x0073;	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
    L_0x006b:
        return r2;	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
    L_0x006c:
        r3 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x0078, ClassCastException -> 0x0077 }
        if (r3 != 0) goto L_0x0073;
    L_0x0072:
        return r2;
    L_0x0073:
        r1 = r1 + 1;
        goto L_0x0051;
    L_0x0076:
        return r0;
    L_0x0077:
        return r2;
    L_0x0078:
        return r2;
    L_0x0079:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.f1740f;
        Object[] objArr = this.f1741g;
        int i = this.f1742h;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < i) {
            Object obj = objArr[i3];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i3 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1742h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1742h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0562m b = m2075b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m2076c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
