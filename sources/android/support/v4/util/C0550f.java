package android.support.v4.util;

/* renamed from: android.support.v4.util.f */
public class C0550f<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f1704a = new Object();
    /* renamed from: b */
    private boolean f1705b;
    /* renamed from: c */
    private long[] f1706c;
    /* renamed from: d */
    private Object[] f1707d;
    /* renamed from: e */
    private int f1708e;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m2024a();
    }

    public C0550f() {
        this(10);
    }

    public C0550f(int i) {
        this.f1705b = false;
        if (i == 0) {
            this.f1706c = C0547c.f1700b;
            this.f1707d = C0547c.f1701c;
        } else {
            i = C0547c.m2019b(i);
            this.f1706c = new long[i];
            this.f1707d = new Object[i];
        }
        this.f1708e = 0;
    }

    /* renamed from: a */
    public android.support.v4.util.C0550f<E> m2024a() {
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
        r1 = (android.support.v4.util.C0550f) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0 = r2.f1706c;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (long[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1706c = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r2.f1707d;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (java.lang.Object[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1707d = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        goto L_0x001d;
    L_0x001c:
        r1 = r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.f.a():android.support.v4.util.f<E>");
    }

    /* renamed from: a */
    public E m2025a(long j) {
        return m2026a(j, null);
    }

    /* renamed from: a */
    public E m2026a(long j, E e) {
        j = C0547c.m2017a(this.f1706c, this.f1708e, j);
        if (j >= null) {
            if (this.f1707d[j] != f1704a) {
                return this.f1707d[j];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void m2031b(long j) {
        j = C0547c.m2017a(this.f1706c, this.f1708e, j);
        if (j >= null && this.f1707d[j] != f1704a) {
            this.f1707d[j] = f1704a;
            this.f1705b = 1;
        }
    }

    /* renamed from: c */
    public void m2035c(long j) {
        m2031b(j);
    }

    /* renamed from: a */
    public void m2027a(int i) {
        if (this.f1707d[i] != f1704a) {
            this.f1707d[i] = f1704a;
            this.f1705b = true;
        }
    }

    /* renamed from: d */
    private void m2023d() {
        int i = this.f1708e;
        long[] jArr = this.f1706c;
        Object[] objArr = this.f1707d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1704a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1705b = false;
        this.f1708e = i2;
    }

    /* renamed from: b */
    public void m2032b(long j, E e) {
        int a = C0547c.m2017a(this.f1706c, this.f1708e, j);
        if (a >= 0) {
            this.f1707d[a] = e;
        } else {
            a ^= -1;
            if (a >= this.f1708e || this.f1707d[a] != f1704a) {
                if (this.f1705b && this.f1708e >= this.f1706c.length) {
                    m2023d();
                    a = C0547c.m2017a(this.f1706c, this.f1708e, j) ^ -1;
                }
                if (this.f1708e >= this.f1706c.length) {
                    int b = C0547c.m2019b(this.f1708e + 1);
                    Object obj = new long[b];
                    Object obj2 = new Object[b];
                    System.arraycopy(this.f1706c, 0, obj, 0, this.f1706c.length);
                    System.arraycopy(this.f1707d, 0, obj2, 0, this.f1707d.length);
                    this.f1706c = obj;
                    this.f1707d = obj2;
                }
                if (this.f1708e - a != 0) {
                    int i = a + 1;
                    System.arraycopy(this.f1706c, a, this.f1706c, i, this.f1708e - a);
                    System.arraycopy(this.f1707d, a, this.f1707d, i, this.f1708e - a);
                }
                this.f1706c[a] = j;
                this.f1707d[a] = e;
                this.f1708e++;
            } else {
                this.f1706c[a] = j;
                this.f1707d[a] = e;
            }
        }
    }

    /* renamed from: b */
    public int m2029b() {
        if (this.f1705b) {
            m2023d();
        }
        return this.f1708e;
    }

    /* renamed from: b */
    public long m2030b(int i) {
        if (this.f1705b) {
            m2023d();
        }
        return this.f1706c[i];
    }

    /* renamed from: c */
    public E m2033c(int i) {
        if (this.f1705b) {
            m2023d();
        }
        return this.f1707d[i];
    }

    /* renamed from: a */
    public void m2028a(int i, E e) {
        if (this.f1705b) {
            m2023d();
        }
        this.f1707d[i] = e;
    }

    /* renamed from: d */
    public int m2036d(long j) {
        if (this.f1705b) {
            m2023d();
        }
        return C0547c.m2017a(this.f1706c, this.f1708e, j);
    }

    /* renamed from: c */
    public void m2034c() {
        int i = this.f1708e;
        Object[] objArr = this.f1707d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1708e = 0;
        this.f1705b = false;
    }

    public String toString() {
        if (m2029b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1708e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1708e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m2030b(i));
            stringBuilder.append('=');
            C0550f c = m2033c(i);
            if (c != this) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
