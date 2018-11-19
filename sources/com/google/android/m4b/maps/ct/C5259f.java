package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C5294y.C5293a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.m4b.maps.ct.f */
public final class C5259f {
    /* renamed from: a */
    private static final Logger f19556a = Logger.getLogger(C5259f.class.getName());
    /* renamed from: b */
    private final byte[] f19557b;
    /* renamed from: c */
    private final int f19558c;
    /* renamed from: d */
    private int f19559d;
    /* renamed from: e */
    private int f19560e = 0;
    /* renamed from: f */
    private final OutputStream f19561f = null;

    /* renamed from: com.google.android.m4b.maps.ct.f$a */
    public static class C5258a extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        C5258a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C5258a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: a */
    public static int m23316a() {
        return 8;
    }

    /* renamed from: b */
    public static int m23322b() {
        return 4;
    }

    /* renamed from: c */
    public static int m23331c() {
        return 8;
    }

    /* renamed from: d */
    public static int m23336d() {
        return 4;
    }

    /* renamed from: e */
    public static int m23338e() {
        return 1;
    }

    /* renamed from: f */
    public static int m23341f() {
        return 4;
    }

    /* renamed from: g */
    public static int m23343g() {
        return 8;
    }

    /* renamed from: h */
    public static long m23346h(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: i */
    private static int m23347i(long j) {
        return (j & -128) == 0 ? 1 : (j & -16384) == 0 ? 2 : (j & -2097152) == 0 ? 3 : (j & -268435456) == 0 ? 4 : (j & -34359738368L) == 0 ? 5 : (j & -4398046511104L) == 0 ? 6 : (j & -562949953421312L) == 0 ? 7 : (j & -72057594037927936L) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: l */
    public static int m23349l(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: n */
    public static int m23350n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private C5259f(byte[] bArr, int i, int i2) {
        this.f19557b = bArr;
        this.f19559d = i;
        this.f19558c = i + i2;
    }

    /* renamed from: a */
    public static C5259f m23321a(byte[] bArr) {
        return new C5259f(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void m23352a(int i, long j) {
        m23360b(i, 1);
        m23366g(j);
    }

    /* renamed from: a */
    public final void m23354a(int i, String str) {
        m23360b(2, 2);
        m23358a(str);
    }

    /* renamed from: a */
    public final void m23353a(int i, C5255d c5255d) {
        m23360b(i, 2);
        m23356a(c5255d);
    }

    /* renamed from: a */
    public final void m23355a(long j) {
        m23365f(j);
    }

    /* renamed from: a */
    public final void m23351a(int i) {
        if (i >= 0) {
            m23369k(i);
        } else {
            m23365f((long) i);
        }
    }

    /* renamed from: b */
    public final void m23361b(long j) {
        m23366g(j);
    }

    /* renamed from: b */
    public final void m23359b(int i) {
        m23370m(i);
    }

    /* renamed from: a */
    public final void m23357a(C6656q c6656q) {
        m23369k(c6656q.mo7634a());
        c6656q.mo7636a(this);
    }

    /* renamed from: a */
    public final void m23356a(C5255d c5255d) {
        m23369k(c5255d.mo5381b());
        int b = c5255d.mo5381b();
        if (this.f19558c - this.f19559d >= b) {
            c5255d.m23271a(this.f19557b, 0, this.f19559d, b);
            this.f19559d += b;
            this.f19560e += b;
            return;
        }
        b = this.f19558c - this.f19559d;
        c5255d.m23271a(this.f19557b, 0, this.f19559d, b);
        this.f19559d = this.f19558c;
        this.f19560e += b;
        throw new C5258a();
    }

    /* renamed from: c */
    public final void m23362c(int i) {
        m23369k(i);
    }

    /* renamed from: d */
    public final void m23364d(int i) {
        m23351a(i);
    }

    /* renamed from: b */
    public static int m23323b(int i, long j) {
        return C5259f.m23348j(i) + C5259f.m23347i(j);
    }

    /* renamed from: c */
    public static int m23333c(int i, long j) {
        return C5259f.m23348j(i) + 8;
    }

    /* renamed from: a */
    public static int m23317a(int i, int i2) {
        return C5259f.m23348j(i) + 4;
    }

    /* renamed from: b */
    public static int m23326b(int i, String str) {
        return C5259f.m23348j(2) + C5259f.m23329b(str);
    }

    /* renamed from: b */
    public static int m23324b(int i, C5255d c5255d) {
        return C5259f.m23348j(i) + C5259f.m23327b(c5255d);
    }

    /* renamed from: a */
    public static int m23318a(int i, C5277o c5277o) {
        return C5259f.m23348j(i) + C5259f.m23320a(c5277o);
    }

    /* renamed from: c */
    private static int m23332c(int i, int i2) {
        return C5259f.m23348j(2) + C5259f.m23349l(i2);
    }

    /* renamed from: a */
    public static int m23319a(int i, C6656q c6656q) {
        return ((C5259f.m23348j(1) * 2) + C5259f.m23332c(2, i)) + (C5259f.m23348j(3) + C5259f.m23335c(c6656q));
    }

    /* renamed from: b */
    public static int m23325b(int i, C5277o c5277o) {
        return ((C5259f.m23348j(1) * 2) + C5259f.m23332c(2, i)) + C5259f.m23318a(3, c5277o);
    }

    /* renamed from: c */
    public static int m23334c(long j) {
        return C5259f.m23347i(j);
    }

    /* renamed from: d */
    public static int m23337d(long j) {
        return C5259f.m23347i(j);
    }

    /* renamed from: e */
    public static int m23339e(int i) {
        return i >= 0 ? C5259f.m23349l(i) : 10;
    }

    /* renamed from: b */
    public static int m23329b(java.lang.String r1) {
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
        r0 = com.google.android.m4b.maps.ct.C5294y.m23474a(r1);	 Catch:{ a -> 0x0005 }
        goto L_0x000c;
    L_0x0005:
        r0 = com.google.android.m4b.maps.ct.C5273l.f19591a;
        r1 = r1.getBytes(r0);
        r0 = r1.length;
    L_0x000c:
        r1 = com.google.android.m4b.maps.ct.C5259f.m23349l(r0);
        r1 = r1 + r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ct.f.b(java.lang.String):int");
    }

    /* renamed from: b */
    public static int m23328b(C6656q c6656q) {
        return c6656q.mo7634a();
    }

    /* renamed from: c */
    public static int m23335c(C6656q c6656q) {
        c6656q = c6656q.mo7634a();
        return C5259f.m23349l(c6656q) + c6656q;
    }

    /* renamed from: a */
    public static int m23320a(C5277o c5277o) {
        c5277o = c5277o.m23427d();
        return C5259f.m23349l(c5277o) + c5277o;
    }

    /* renamed from: b */
    public static int m23327b(C5255d c5255d) {
        return C5259f.m23349l(c5255d.mo5381b()) + c5255d.mo5381b();
    }

    /* renamed from: b */
    public static int m23330b(byte[] bArr) {
        return C5259f.m23349l(bArr.length) + bArr.length;
    }

    /* renamed from: f */
    public static int m23342f(int i) {
        return C5259f.m23349l(i);
    }

    /* renamed from: g */
    public static int m23344g(int i) {
        return C5259f.m23339e(i);
    }

    /* renamed from: h */
    public static int m23345h(int i) {
        return C5259f.m23349l(C5259f.m23350n(i));
    }

    /* renamed from: e */
    public static int m23340e(long j) {
        return C5259f.m23347i(C5259f.m23346h(j));
    }

    /* renamed from: c */
    public final void m23363c(byte[] bArr) {
        int length = bArr.length;
        if (this.f19558c - this.f19559d >= length) {
            System.arraycopy(bArr, 0, this.f19557b, this.f19559d, length);
            this.f19559d += length;
            this.f19560e += length;
            return;
        }
        length = this.f19558c - this.f19559d;
        System.arraycopy(bArr, 0, this.f19557b, this.f19559d, length);
        this.f19559d = this.f19558c;
        this.f19560e += length;
        throw new C5258a();
    }

    /* renamed from: b */
    public final void m23360b(int i, int i2) {
        m23369k(C5299z.m23483a(i, i2));
    }

    /* renamed from: j */
    public static int m23348j(int i) {
        return C5259f.m23349l(C5299z.m23483a(i, 0));
    }

    /* renamed from: k */
    public final void m23369k(int i) {
        while ((i & -128) != 0) {
            m23368i((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i >>>= 7;
        }
        m23368i(i);
    }

    /* renamed from: f */
    public final void m23365f(long j) {
        while ((j & -128) != 0) {
            m23368i((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            j >>>= 7;
        }
        m23368i((int) j);
    }

    /* renamed from: m */
    public final void m23370m(int i) {
        m23368i(i & 255);
        m23368i((i >> 8) & 255);
        m23368i((i >> 16) & 255);
        m23368i((i >> 24) & 255);
    }

    /* renamed from: g */
    public final void m23366g(long j) {
        m23368i(((int) j) & 255);
        m23368i(((int) (j >> 8)) & 255);
        m23368i(((int) (j >> 16)) & 255);
        m23368i(((int) (j >> 24)) & 255);
        m23368i(((int) (j >> 32)) & 255);
        m23368i(((int) (j >> 40)) & 255);
        m23368i(((int) (j >> 48)) & 255);
        m23368i(((int) (j >> 56)) & 255);
    }

    /* renamed from: a */
    public final void m23358a(String str) {
        int i;
        try {
            int i2;
            int l = C5259f.m23349l(str.length() * 3);
            int l2 = C5259f.m23349l(str.length());
            i = this.f19559d;
            if (l2 == l) {
                this.f19559d = i + l2;
                l = C5294y.m23475a(str, this.f19557b, this.f19559d, this.f19558c - this.f19559d);
                this.f19559d = i;
                i2 = (l - i) - l2;
                m23369k(i2);
                this.f19559d = l;
            } else {
                i2 = C5294y.m23474a(str);
                m23369k(i2);
                this.f19559d = C5294y.m23475a(str, this.f19557b, this.f19559d, this.f19558c - this.f19559d);
            }
            this.f19560e += i2;
        } catch (C5293a e) {
            this.f19559d = i;
            throw e;
        } catch (Throwable e2) {
            throw new C5258a(e2);
        } catch (Throwable e22) {
            f19556a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e22);
            byte[] bytes = str.getBytes(C5273l.f19591a);
            m23369k(bytes.length);
            m23363c(bytes);
        }
    }

    /* renamed from: h */
    public final void m23367h() {
        if (this.f19558c - this.f19559d != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: i */
    public final void m23368i(int i) {
        i = (byte) i;
        if (this.f19559d == this.f19558c) {
            throw new C5258a();
        }
        byte[] bArr = this.f19557b;
        int i2 = this.f19559d;
        this.f19559d = i2 + 1;
        bArr[i2] = i;
        this.f19560e++;
    }
}
