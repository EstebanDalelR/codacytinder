package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.cg.bp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

/* renamed from: com.google.android.m4b.maps.bv.b */
public final class C4922b {
    /* renamed from: a */
    private final byte[] f18123a;
    /* renamed from: b */
    private final byte[] f18124b;
    /* renamed from: c */
    private byte[] f18125c;
    /* renamed from: d */
    private C4920a[] f18126d;
    /* renamed from: e */
    private byte[] f18127e;
    /* renamed from: f */
    private String[] f18128f;
    /* renamed from: g */
    private C4921b[] f18129g;
    /* renamed from: h */
    private int f18130h;
    /* renamed from: i */
    private int f18131i;
    /* renamed from: j */
    private boolean f18132j;

    /* renamed from: com.google.android.m4b.maps.bv.b$a */
    public static class C4920a {
        /* renamed from: a */
        public final float f18117a;
        /* renamed from: b */
        public final float f18118b;
        /* renamed from: c */
        public final float f18119c;
        /* renamed from: d */
        private float f18120d;

        public C4920a(float f, float f2, float f3, float f4) {
            this.f18117a = f;
            this.f18118b = f2;
            this.f18119c = f3;
            this.f18120d = f4;
        }

        /* renamed from: a */
        public final float m22051a(float f, float f2, float f3) {
            return this.f18120d / (((f * this.f18117a) + (f2 * this.f18118b)) + (f3 * this.f18119c));
        }

        /* renamed from: a */
        public final boolean m22052a() {
            return Math.abs(this.f18119c) >= 0.9f;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.b$b */
    public static class C4921b {
        /* renamed from: a */
        public final float f18121a;
        /* renamed from: b */
        public final float f18122b;

        public C4921b(float f, float f2) {
            this.f18121a = f;
            this.f18122b = f2;
        }
    }

    /* renamed from: a */
    private static int m22054a(float f, int i) {
        int i2 = (int) f;
        return i2 >= i ? i2 - i : i2 < 0 ? i2 + i : i2;
    }

    public C4922b(byte[] bArr, byte[] bArr2) {
        this.f18123a = bArr;
        if (m22058f() == null) {
            throw new IOException();
        }
        this.f18124b = bArr2;
        if (m22059g() == null) {
            throw new IOException();
        }
        this.f18132j = 1;
    }

    protected C4922b() {
        this.f18123a = null;
        this.f18124b = null;
    }

    /* renamed from: a */
    public final boolean m22063a() {
        if (this.f18132j) {
            return false;
        }
        m22058f();
        m22059g();
        this.f18132j = true;
        return true;
    }

    /* renamed from: b */
    public final boolean m22066b() {
        if (!this.f18132j) {
            return false;
        }
        this.f18125c = null;
        this.f18126d = null;
        this.f18127e = null;
        this.f18128f = null;
        this.f18129g = null;
        this.f18132j = false;
        return true;
    }

    /* renamed from: e */
    private void m22057e() {
        if (!this.f18132j) {
            throw new IllegalArgumentException("Depth map must be decompressed");
        }
    }

    /* renamed from: a */
    public final C4920a m22061a(float f, float f2) {
        m22057e();
        m22057e();
        f = this.f18125c[(m22056b(f2) * this.f18130h) + m22053a(f)] & 255;
        return f != null ? this.f18126d[f] : 0.0f;
    }

    /* renamed from: a */
    public final float m22060a(float f, float f2, float[] fArr) {
        m22057e();
        C4920a a = m22061a(f, f2);
        if (a == null) {
            return 0.0f;
        }
        if (fArr != null && fArr.length >= 3) {
            fArr[0] = a.f18117a;
            fArr[1] = -a.f18119c;
            fArr[2] = a.f18118b;
        }
        fArr = new float[3];
        bp.m22990a(f, f2, fArr, 0);
        return a.m22051a(fArr[0], -fArr[2], fArr[1]);
    }

    /* renamed from: b */
    public final String m22065b(float f, float f2, float[] fArr) {
        m22057e();
        int i = this.f18127e[(m22056b(f2) * this.f18130h) + m22053a(f)] & 255;
        if (i > 0) {
            C4920a a = m22061a(f, f2);
            if (a != null) {
                float[] fArr2 = new float[3];
                bp.m22990a(f, f2, fArr2, 0);
                f = a.m22051a(fArr2[0], -fArr2[2], fArr2[1]);
                for (int i2 = 0; i2 < 3; i2++) {
                    fArr2[i2] = fArr2[i2] * f;
                }
                bp.m22989a(fArr2[0] - this.f18129g[i].f18121a, fArr2[1], fArr2[2] + this.f18129g[i].f18122b, fArr);
            }
        }
        return this.f18128f[i];
    }

    /* renamed from: b */
    public final C4921b m22064b(float f, float f2) {
        m22057e();
        f = this.f18127e[(m22056b(f2) * this.f18130h) + m22053a(f)] & 255;
        m22057e();
        return this.f18129g[f];
    }

    /* renamed from: c */
    public final boolean m22067c(float f, float f2) {
        m22057e();
        f = m22061a(f, f2);
        if (f == null) {
            return false;
        }
        return f.m22052a();
    }

    /* renamed from: a */
    private int m22053a(float f) {
        return C4922b.m22054a(f * ((float) this.f18130h), this.f18130h);
    }

    /* renamed from: b */
    private int m22056b(float f) {
        return C4922b.m22054a((1.0f - (f * 2.0f)) * ((float) this.f18131i), this.f18131i);
    }

    /* renamed from: f */
    private boolean m22058f() {
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
        r10 = this;
        r0 = r10.f18123a;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r10.f18123a;
        r0 = com.google.android.m4b.maps.bv.C4922b.m22055a(r0);
        r2 = r0.readUnsignedByte();	 Catch:{ IOException -> 0x0075 }
        r3 = 8;	 Catch:{ IOException -> 0x0075 }
        if (r2 == r3) goto L_0x001d;	 Catch:{ IOException -> 0x0075 }
    L_0x0014:
        r2 = "Depth map has unexpected header size";	 Catch:{ IOException -> 0x0075 }
        com.google.android.m4b.maps.bv.ac.m22038b(r2);	 Catch:{ IOException -> 0x0075 }
        r0.close();	 Catch:{ IOException -> 0x001c }
    L_0x001c:
        return r1;
    L_0x001d:
        r2 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x0075 }
        r4 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x0075 }
        r10.f18130h = r4;	 Catch:{ IOException -> 0x0075 }
        r4 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x0075 }
        r10.f18131i = r4;	 Catch:{ IOException -> 0x0075 }
        r4 = r0.readUnsignedByte();	 Catch:{ IOException -> 0x0075 }
        if (r4 == r3) goto L_0x003c;	 Catch:{ IOException -> 0x0075 }
    L_0x0033:
        r2 = "Unexpected plane indices offset";	 Catch:{ IOException -> 0x0075 }
        com.google.android.m4b.maps.bv.ac.m22038b(r2);	 Catch:{ IOException -> 0x0075 }
        r0.close();	 Catch:{ IOException -> 0x003b }
    L_0x003b:
        return r1;
    L_0x003c:
        r3 = r10.f18130h;	 Catch:{ IOException -> 0x0075 }
        r4 = r10.f18131i;	 Catch:{ IOException -> 0x0075 }
        r3 = r3 * r4;	 Catch:{ IOException -> 0x0075 }
        r3 = new byte[r3];	 Catch:{ IOException -> 0x0075 }
        r10.f18125c = r3;	 Catch:{ IOException -> 0x0075 }
        r3 = r10.f18125c;	 Catch:{ IOException -> 0x0075 }
        r0.readFully(r3);	 Catch:{ IOException -> 0x0075 }
        r3 = new com.google.android.m4b.maps.bv.C4922b.C4920a[r2];	 Catch:{ IOException -> 0x0075 }
        r10.f18126d = r3;	 Catch:{ IOException -> 0x0075 }
        r3 = 0;	 Catch:{ IOException -> 0x0075 }
    L_0x0050:
        if (r3 >= r2) goto L_0x006e;	 Catch:{ IOException -> 0x0075 }
    L_0x0052:
        r4 = r0.readFloat();	 Catch:{ IOException -> 0x0075 }
        r5 = r0.readFloat();	 Catch:{ IOException -> 0x0075 }
        r6 = r0.readFloat();	 Catch:{ IOException -> 0x0075 }
        r7 = r0.readFloat();	 Catch:{ IOException -> 0x0075 }
        r8 = r10.f18126d;	 Catch:{ IOException -> 0x0075 }
        r9 = new com.google.android.m4b.maps.bv.b$a;	 Catch:{ IOException -> 0x0075 }
        r9.<init>(r4, r5, r6, r7);	 Catch:{ IOException -> 0x0075 }
        r8[r3] = r9;	 Catch:{ IOException -> 0x0075 }
        r3 = r3 + 1;
        goto L_0x0050;
    L_0x006e:
        r0.close();	 Catch:{ IOException -> 0x0071 }
    L_0x0071:
        r0 = 1;
        return r0;
    L_0x0073:
        r1 = move-exception;
        goto L_0x007f;
    L_0x0075:
        r2 = move-exception;
        r3 = "Unable to decompress depth map";	 Catch:{ all -> 0x0073 }
        com.google.android.m4b.maps.bv.ac.m22037a(r3, r2);	 Catch:{ all -> 0x0073 }
        r0.close();	 Catch:{ IOException -> 0x007e }
    L_0x007e:
        return r1;
    L_0x007f:
        r0.close();	 Catch:{ IOException -> 0x0082 }
    L_0x0082:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.b.f():boolean");
    }

    /* renamed from: g */
    private boolean m22059g() {
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
        r9 = this;
        r0 = r9.f18124b;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r9.f18124b;
        r0 = com.google.android.m4b.maps.bv.C4922b.m22055a(r0);
        r2 = r0.readUnsignedByte();	 Catch:{ IOException -> 0x009e }
        r3 = 8;	 Catch:{ IOException -> 0x009e }
        if (r2 == r3) goto L_0x001d;	 Catch:{ IOException -> 0x009e }
    L_0x0014:
        r2 = "SV map has unexpected header size";	 Catch:{ IOException -> 0x009e }
        com.google.android.m4b.maps.bv.ac.m22038b(r2);	 Catch:{ IOException -> 0x009e }
        r0.close();	 Catch:{ IOException -> 0x001c }
    L_0x001c:
        return r1;
    L_0x001d:
        r2 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x009e }
        r4 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x009e }
        r5 = r0.readUnsignedShort();	 Catch:{ IOException -> 0x009e }
        r6 = r9.f18130h;	 Catch:{ IOException -> 0x009e }
        if (r6 != r4) goto L_0x0093;	 Catch:{ IOException -> 0x009e }
    L_0x002d:
        r4 = r9.f18131i;	 Catch:{ IOException -> 0x009e }
        if (r4 == r5) goto L_0x0032;	 Catch:{ IOException -> 0x009e }
    L_0x0031:
        goto L_0x0093;	 Catch:{ IOException -> 0x009e }
    L_0x0032:
        r4 = r0.readUnsignedByte();	 Catch:{ IOException -> 0x009e }
        if (r4 == r3) goto L_0x0041;	 Catch:{ IOException -> 0x009e }
    L_0x0038:
        r2 = "Unexpected SV indices offset";	 Catch:{ IOException -> 0x009e }
        com.google.android.m4b.maps.bv.ac.m22038b(r2);	 Catch:{ IOException -> 0x009e }
        r0.close();	 Catch:{ IOException -> 0x0040 }
    L_0x0040:
        return r1;
    L_0x0041:
        r3 = r9.f18130h;	 Catch:{ IOException -> 0x009e }
        r4 = r9.f18131i;	 Catch:{ IOException -> 0x009e }
        r3 = r3 * r4;	 Catch:{ IOException -> 0x009e }
        r3 = new byte[r3];	 Catch:{ IOException -> 0x009e }
        r9.f18127e = r3;	 Catch:{ IOException -> 0x009e }
        r3 = r9.f18127e;	 Catch:{ IOException -> 0x009e }
        r0.readFully(r3);	 Catch:{ IOException -> 0x009e }
        r3 = new java.lang.String[r2];	 Catch:{ IOException -> 0x009e }
        r9.f18128f = r3;	 Catch:{ IOException -> 0x009e }
        r3 = r9.f18128f;	 Catch:{ IOException -> 0x009e }
        r4 = 0;	 Catch:{ IOException -> 0x009e }
        r3[r1] = r4;	 Catch:{ IOException -> 0x009e }
        r3 = 22;	 Catch:{ IOException -> 0x009e }
        r3 = new byte[r3];	 Catch:{ IOException -> 0x009e }
        r5 = 1;	 Catch:{ IOException -> 0x009e }
        r6 = 1;	 Catch:{ IOException -> 0x009e }
    L_0x005f:
        if (r6 >= r2) goto L_0x0070;	 Catch:{ IOException -> 0x009e }
    L_0x0061:
        r0.readFully(r3);	 Catch:{ IOException -> 0x009e }
        r7 = r9.f18128f;	 Catch:{ IOException -> 0x009e }
        r8 = new java.lang.String;	 Catch:{ IOException -> 0x009e }
        r8.<init>(r3);	 Catch:{ IOException -> 0x009e }
        r7[r6] = r8;	 Catch:{ IOException -> 0x009e }
        r6 = r6 + 1;	 Catch:{ IOException -> 0x009e }
        goto L_0x005f;	 Catch:{ IOException -> 0x009e }
    L_0x0070:
        r3 = new com.google.android.m4b.maps.bv.C4922b.C4921b[r2];	 Catch:{ IOException -> 0x009e }
        r9.f18129g = r3;	 Catch:{ IOException -> 0x009e }
        r3 = r9.f18129g;	 Catch:{ IOException -> 0x009e }
        r3[r1] = r4;	 Catch:{ IOException -> 0x009e }
        r3 = 1;	 Catch:{ IOException -> 0x009e }
    L_0x0079:
        if (r3 >= r2) goto L_0x008f;	 Catch:{ IOException -> 0x009e }
    L_0x007b:
        r4 = r0.readFloat();	 Catch:{ IOException -> 0x009e }
        r6 = r0.readFloat();	 Catch:{ IOException -> 0x009e }
        r7 = r9.f18129g;	 Catch:{ IOException -> 0x009e }
        r8 = new com.google.android.m4b.maps.bv.b$b;	 Catch:{ IOException -> 0x009e }
        r8.<init>(r4, r6);	 Catch:{ IOException -> 0x009e }
        r7[r3] = r8;	 Catch:{ IOException -> 0x009e }
        r3 = r3 + 1;
        goto L_0x0079;
    L_0x008f:
        r0.close();	 Catch:{ IOException -> 0x0092 }
    L_0x0092:
        return r5;
    L_0x0093:
        r2 = "SV matrix dimensions don't match plane matrix.";	 Catch:{ IOException -> 0x009e }
        com.google.android.m4b.maps.bv.ac.m22038b(r2);	 Catch:{ IOException -> 0x009e }
        r0.close();	 Catch:{ IOException -> 0x009b }
    L_0x009b:
        return r1;
    L_0x009c:
        r1 = move-exception;
        goto L_0x00a8;
    L_0x009e:
        r2 = move-exception;
        r3 = "Unable to decompress SV map";	 Catch:{ all -> 0x009c }
        com.google.android.m4b.maps.bv.ac.m22037a(r3, r2);	 Catch:{ all -> 0x009c }
        r0.close();	 Catch:{ IOException -> 0x00a7 }
    L_0x00a7:
        return r1;
    L_0x00a8:
        r0.close();	 Catch:{ IOException -> 0x00ab }
    L_0x00ab:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.b.g():boolean");
    }

    /* renamed from: a */
    private static C4931i m22055a(byte[] bArr) {
        return new C4931i(new InflaterInputStream(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: c */
    public final byte[] m22068c() {
        return this.f18123a;
    }

    /* renamed from: d */
    public final byte[] m22069d() {
        return this.f18124b;
    }

    /* renamed from: a */
    public final C4921b m22062a(String str) {
        m22057e();
        for (int i = 1; i < this.f18128f.length; i++) {
            if (str.equals(this.f18128f[i])) {
                return this.f18129g[i];
            }
        }
        return null;
    }
}
