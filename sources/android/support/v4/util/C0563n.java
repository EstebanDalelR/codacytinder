package android.support.v4.util;

/* renamed from: android.support.v4.util.n */
public class C0563n<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f1743a = new Object();
    /* renamed from: b */
    private boolean f1744b;
    /* renamed from: c */
    private int[] f1745c;
    /* renamed from: d */
    private Object[] f1746d;
    /* renamed from: e */
    private int f1747e;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m2079a();
    }

    public C0563n() {
        this(10);
    }

    public C0563n(int i) {
        this.f1744b = false;
        if (i == 0) {
            this.f1745c = C0547c.f1699a;
            this.f1746d = C0547c.f1701c;
        } else {
            i = C0547c.m2015a(i);
            this.f1745c = new int[i];
            this.f1746d = new Object[i];
        }
        this.f1747e = 0;
    }

    /* renamed from: a */
    public android.support.v4.util.C0563n<E> m2079a() {
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
        r2 = this;
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (android.support.v4.util.C0563n) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0 = r2.f1745c;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (int[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1745c = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r2.f1746d;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (java.lang.Object[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1746d = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        goto L_0x001d;
    L_0x001c:
        r1 = r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.n.a():android.support.v4.util.n<E>");
    }

    /* renamed from: a */
    public E m2080a(int i) {
        return m2081a(i, null);
    }

    /* renamed from: a */
    public E m2081a(int i, E e) {
        i = C0547c.m2016a(this.f1745c, this.f1747e, i);
        if (i >= 0) {
            if (this.f1746d[i] != f1743a) {
                return this.f1746d[i];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void m2083b(int i) {
        i = C0547c.m2016a(this.f1745c, this.f1747e, i);
        if (i >= 0 && this.f1746d[i] != f1743a) {
            this.f1746d[i] = f1743a;
            this.f1744b = true;
        }
    }

    /* renamed from: c */
    public void m2086c(int i) {
        m2083b(i);
    }

    /* renamed from: d */
    private void m2078d() {
        int i = this.f1747e;
        int[] iArr = this.f1745c;
        Object[] objArr = this.f1746d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1743a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1744b = false;
        this.f1747e = i2;
    }

    /* renamed from: b */
    public void m2084b(int i, E e) {
        int a = C0547c.m2016a(this.f1745c, this.f1747e, i);
        if (a >= 0) {
            this.f1746d[a] = e;
        } else {
            a ^= -1;
            if (a >= this.f1747e || this.f1746d[a] != f1743a) {
                if (this.f1744b && this.f1747e >= this.f1745c.length) {
                    m2078d();
                    a = C0547c.m2016a(this.f1745c, this.f1747e, i) ^ -1;
                }
                if (this.f1747e >= this.f1745c.length) {
                    int a2 = C0547c.m2015a(this.f1747e + 1);
                    Object obj = new int[a2];
                    Object obj2 = new Object[a2];
                    System.arraycopy(this.f1745c, 0, obj, 0, this.f1745c.length);
                    System.arraycopy(this.f1746d, 0, obj2, 0, this.f1746d.length);
                    this.f1745c = obj;
                    this.f1746d = obj2;
                }
                if (this.f1747e - a != 0) {
                    int i2 = a + 1;
                    System.arraycopy(this.f1745c, a, this.f1745c, i2, this.f1747e - a);
                    System.arraycopy(this.f1746d, a, this.f1746d, i2, this.f1747e - a);
                }
                this.f1745c[a] = i;
                this.f1746d[a] = e;
                this.f1747e++;
            } else {
                this.f1745c[a] = i;
                this.f1746d[a] = e;
            }
        }
    }

    /* renamed from: b */
    public int m2082b() {
        if (this.f1744b) {
            m2078d();
        }
        return this.f1747e;
    }

    /* renamed from: d */
    public int m2088d(int i) {
        if (this.f1744b) {
            m2078d();
        }
        return this.f1745c[i];
    }

    /* renamed from: e */
    public E m2089e(int i) {
        if (this.f1744b) {
            m2078d();
        }
        return this.f1746d[i];
    }

    /* renamed from: f */
    public int m2090f(int i) {
        if (this.f1744b) {
            m2078d();
        }
        return C0547c.m2016a(this.f1745c, this.f1747e, i);
    }

    /* renamed from: c */
    public void m2085c() {
        int i = this.f1747e;
        Object[] objArr = this.f1746d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1747e = 0;
        this.f1744b = false;
    }

    /* renamed from: c */
    public void m2087c(int i, E e) {
        if (this.f1747e == 0 || i > this.f1745c[this.f1747e - 1]) {
            if (this.f1744b && this.f1747e >= this.f1745c.length) {
                m2078d();
            }
            int i2 = this.f1747e;
            if (i2 >= this.f1745c.length) {
                int a = C0547c.m2015a(i2 + 1);
                Object obj = new int[a];
                Object obj2 = new Object[a];
                System.arraycopy(this.f1745c, 0, obj, 0, this.f1745c.length);
                System.arraycopy(this.f1746d, 0, obj2, 0, this.f1746d.length);
                this.f1745c = obj;
                this.f1746d = obj2;
            }
            this.f1745c[i2] = i;
            this.f1746d[i2] = e;
            this.f1747e = i2 + 1;
            return;
        }
        m2084b(i, e);
    }

    public String toString() {
        if (m2082b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1747e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1747e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m2088d(i));
            stringBuilder.append('=');
            C0563n e = m2089e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
