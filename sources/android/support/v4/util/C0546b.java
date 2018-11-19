package android.support.v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.util.b */
public final class C0546b<E> implements Collection<E>, Set<E> {
    /* renamed from: a */
    private static final int[] f1689a = new int[0];
    /* renamed from: b */
    private static final Object[] f1690b = new Object[0];
    /* renamed from: c */
    private static Object[] f1691c;
    /* renamed from: d */
    private static int f1692d;
    /* renamed from: e */
    private static Object[] f1693e;
    /* renamed from: f */
    private static int f1694f;
    /* renamed from: g */
    private int[] f1695g;
    /* renamed from: h */
    private Object[] f1696h;
    /* renamed from: i */
    private int f1697i;
    /* renamed from: j */
    private C0557h<E, E> f1698j;

    /* renamed from: android.support.v4.util.b$1 */
    class C28811 extends C0557h<E, E> {
        /* renamed from: a */
        final /* synthetic */ C0546b f9104a;

        C28811(C0546b c0546b) {
            this.f9104a = c0546b;
        }

        /* renamed from: a */
        protected int mo573a() {
            return this.f9104a.f1697i;
        }

        /* renamed from: a */
        protected Object mo575a(int i, int i2) {
            return this.f9104a.f1696h[i];
        }

        /* renamed from: a */
        protected int mo574a(Object obj) {
            return this.f9104a.m2011a(obj);
        }

        /* renamed from: b */
        protected int mo579b(Object obj) {
            return this.f9104a.m2011a(obj);
        }

        /* renamed from: b */
        protected Map<E, E> mo580b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo578a(E e, E e2) {
            this.f9104a.add(e);
        }

        /* renamed from: a */
        protected E mo576a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo577a(int i) {
            this.f9104a.m2014c(i);
        }

        /* renamed from: c */
        protected void mo581c() {
            this.f9104a.clear();
        }
    }

    /* renamed from: a */
    private int m2006a(Object obj, int i) {
        int i2 = this.f1697i;
        if (i2 == 0) {
            return -1;
        }
        int a = C0547c.m2016a(this.f1695g, i2, i);
        if (a < 0 || obj.equals(this.f1696h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1695g[i3] == i) {
            if (obj.equals(this.f1696h[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1695g[a] == i) {
            if (obj.equals(this.f1696h[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private int m2004a() {
        int i = this.f1697i;
        if (i == 0) {
            return -1;
        }
        int a = C0547c.m2016a(this.f1695g, i, 0);
        if (a < 0 || this.f1696h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1695g[i2] == 0) {
            if (this.f1696h[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1695g[a] == 0) {
            if (this.f1696h[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private void m2010d(int i) {
        if (i == 8) {
            synchronized (C0546b.class) {
                if (f1693e != null) {
                    i = f1693e;
                    this.f1696h = i;
                    f1693e = (Object[]) i[0];
                    this.f1695g = (int[]) i[1];
                    i[1] = null;
                    i[0] = null;
                    f1694f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0546b.class) {
                if (f1691c != null) {
                    i = f1691c;
                    this.f1696h = i;
                    f1691c = (Object[]) i[0];
                    this.f1695g = (int[]) i[1];
                    i[1] = null;
                    i[0] = null;
                    f1692d--;
                    return;
                }
            }
        }
        this.f1695g = new int[i];
        this.f1696h = new Object[i];
    }

    /* renamed from: a */
    private static void m2007a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0546b.class) {
                if (f1694f < 10) {
                    objArr[0] = f1693e;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f1693e = objArr;
                    f1694f += 1;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0546b.class) {
                if (f1692d < 10) {
                    objArr[0] = f1691c;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f1691c = objArr;
                    f1692d += 1;
                }
            }
        }
    }

    public C0546b() {
        this(0);
    }

    public C0546b(int i) {
        if (i == 0) {
            this.f1695g = f1689a;
            this.f1696h = f1690b;
        } else {
            m2010d(i);
        }
        this.f1697i = 0;
    }

    public void clear() {
        if (this.f1697i != 0) {
            C0546b.m2007a(this.f1695g, this.f1696h, this.f1697i);
            this.f1695g = f1689a;
            this.f1696h = f1690b;
            this.f1697i = 0;
        }
    }

    /* renamed from: a */
    public void m2012a(int i) {
        if (this.f1695g.length < i) {
            Object obj = this.f1695g;
            Object obj2 = this.f1696h;
            m2010d(i);
            if (this.f1697i > 0) {
                System.arraycopy(obj, 0, this.f1695g, 0, this.f1697i);
                System.arraycopy(obj2, 0, this.f1696h, 0, this.f1697i);
            }
            C0546b.m2007a(obj, obj2, this.f1697i);
        }
    }

    public boolean contains(Object obj) {
        return m2011a(obj) >= null ? true : null;
    }

    /* renamed from: a */
    public int m2011a(Object obj) {
        return obj == null ? m2004a() : m2006a(obj, obj.hashCode());
    }

    @Nullable
    /* renamed from: b */
    public E m2013b(int i) {
        return this.f1696h[i];
    }

    public boolean isEmpty() {
        return this.f1697i <= 0;
    }

    public boolean add(@Nullable E e) {
        int a;
        int i;
        if (e == null) {
            a = m2004a();
            i = 0;
        } else {
            a = e.hashCode();
            i = a;
            a = m2006a(e, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2;
        a ^= -1;
        if (this.f1697i >= this.f1695g.length) {
            i2 = 4;
            if (this.f1697i >= 8) {
                i2 = (this.f1697i >> 1) + this.f1697i;
            } else if (this.f1697i >= 4) {
                i2 = 8;
            }
            Object obj = this.f1695g;
            Object obj2 = this.f1696h;
            m2010d(i2);
            if (this.f1695g.length > 0) {
                System.arraycopy(obj, 0, this.f1695g, 0, obj.length);
                System.arraycopy(obj2, 0, this.f1696h, 0, obj2.length);
            }
            C0546b.m2007a(obj, obj2, this.f1697i);
        }
        if (a < this.f1697i) {
            i2 = a + 1;
            System.arraycopy(this.f1695g, a, this.f1695g, i2, this.f1697i - a);
            System.arraycopy(this.f1696h, a, this.f1696h, i2, this.f1697i - a);
        }
        this.f1695g[a] = i;
        this.f1696h[a] = e;
        this.f1697i += 1;
        return true;
    }

    public boolean remove(Object obj) {
        obj = m2011a(obj);
        if (obj < null) {
            return null;
        }
        m2014c(obj);
        return true;
    }

    /* renamed from: c */
    public E m2014c(int i) {
        E e = this.f1696h[i];
        if (this.f1697i <= 1) {
            C0546b.m2007a(this.f1695g, this.f1696h, this.f1697i);
            this.f1695g = f1689a;
            this.f1696h = f1690b;
            this.f1697i = 0;
        } else {
            int i2 = 8;
            int i3;
            if (this.f1695g.length <= 8 || this.f1697i >= this.f1695g.length / 3) {
                this.f1697i--;
                if (i < this.f1697i) {
                    i3 = i + 1;
                    System.arraycopy(this.f1695g, i3, this.f1695g, i, this.f1697i - i);
                    System.arraycopy(this.f1696h, i3, this.f1696h, i, this.f1697i - i);
                }
                this.f1696h[this.f1697i] = null;
            } else {
                if (this.f1697i > 8) {
                    i2 = (this.f1697i >> 1) + this.f1697i;
                }
                Object obj = this.f1695g;
                Object obj2 = this.f1696h;
                m2010d(i2);
                this.f1697i--;
                if (i > 0) {
                    System.arraycopy(obj, 0, this.f1695g, 0, i);
                    System.arraycopy(obj2, 0, this.f1696h, 0, i);
                }
                if (i < this.f1697i) {
                    i3 = i + 1;
                    System.arraycopy(obj, i3, this.f1695g, i, this.f1697i - i);
                    System.arraycopy(obj2, i3, this.f1696h, i, this.f1697i - i);
                }
            }
        }
        return e;
    }

    public int size() {
        return this.f1697i;
    }

    @NonNull
    public Object[] toArray() {
        Object obj = new Object[this.f1697i];
        System.arraycopy(this.f1696h, 0, obj, 0, this.f1697i);
        return obj;
    }

    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f1697i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1697i);
        }
        System.arraycopy(this.f1696h, 0, tArr, 0, this.f1697i);
        if (tArr.length > this.f1697i) {
            tArr[this.f1697i] = null;
        }
        return tArr;
    }

    public boolean equals(java.lang.Object r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();
        r3 = r5.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = 0;
    L_0x0017:
        r3 = r4.f1697i;	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
        if (r1 >= r3) goto L_0x0029;	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
    L_0x001b:
        r3 = r4.m2013b(r1);	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
        r3 = r5.contains(r3);	 Catch:{ NullPointerException -> 0x002b, ClassCastException -> 0x002a }
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x0029:
        return r0;
    L_0x002a:
        return r2;
    L_0x002b:
        return r2;
    L_0x002c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.f1695g;
        int i = 0;
        for (int i2 = 0; i2 < this.f1697i; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1697i * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1697i; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0546b b = m2013b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private C0557h<E, E> m2008b() {
        if (this.f1698j == null) {
            this.f1698j = new C28811(this);
        }
        return this.f1698j;
    }

    public Iterator<E> iterator() {
        return m2008b().m2055e().iterator();
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return null;
            }
        }
        return true;
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        m2012a(this.f1697i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1697i - 1; i >= 0; i--) {
            if (!collection.contains(this.f1696h[i])) {
                m2014c(i);
                z = true;
            }
        }
        return z;
    }
}
