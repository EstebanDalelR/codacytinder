package com.google.android.exoplayer2.source;

import com.facebook.ads.AdError;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.source.k */
final class C2213k {
    /* renamed from: a */
    private int f6394a = AdError.NETWORK_ERROR_CODE;
    /* renamed from: b */
    private int[] f6395b = new int[this.f6394a];
    /* renamed from: c */
    private long[] f6396c = new long[this.f6394a];
    /* renamed from: d */
    private int[] f6397d = new int[this.f6394a];
    /* renamed from: e */
    private int[] f6398e = new int[this.f6394a];
    /* renamed from: f */
    private long[] f6399f = new long[this.f6394a];
    /* renamed from: g */
    private C2055a[] f6400g = new C2055a[this.f6394a];
    /* renamed from: h */
    private Format[] f6401h = new Format[this.f6394a];
    /* renamed from: i */
    private int f6402i;
    /* renamed from: j */
    private int f6403j;
    /* renamed from: k */
    private int f6404k;
    /* renamed from: l */
    private int f6405l;
    /* renamed from: m */
    private long f6406m = Long.MIN_VALUE;
    /* renamed from: n */
    private long f6407n = Long.MIN_VALUE;
    /* renamed from: o */
    private boolean f6408o = true;
    /* renamed from: p */
    private boolean f6409p = true;
    /* renamed from: q */
    private Format f6410q;
    /* renamed from: r */
    private int f6411r;

    /* renamed from: com.google.android.exoplayer2.source.k$a */
    public static final class C2212a {
        /* renamed from: a */
        public int f6391a;
        /* renamed from: b */
        public long f6392b;
        /* renamed from: c */
        public C2055a f6393c;
    }

    /* renamed from: a */
    public void m7904a(boolean z) {
        this.f6402i = 0;
        this.f6403j = 0;
        this.f6404k = 0;
        this.f6405l = 0;
        this.f6408o = true;
        this.f6406m = Long.MIN_VALUE;
        this.f6407n = Long.MIN_VALUE;
        if (z) {
            this.f6410q = false;
            this.f6409p = true;
        }
    }

    /* renamed from: a */
    public int m7898a() {
        return this.f6403j + this.f6402i;
    }

    /* renamed from: a */
    public long m7901a(int i) {
        int a = m7898a() - i;
        boolean z = a >= 0 && a <= this.f6402i - this.f6405l;
        C2289a.m8311a(z);
        this.f6402i -= a;
        this.f6407n = Math.max(this.f6406m, m7896e(this.f6402i));
        if (this.f6402i == 0) {
            return 0;
        }
        i = m7897f(this.f6402i - 1);
        return this.f6396c[i] + ((long) this.f6397d[i]);
    }

    /* renamed from: b */
    public void m7908b(int i) {
        this.f6411r = i;
    }

    /* renamed from: b */
    public int m7906b() {
        return this.f6403j;
    }

    /* renamed from: c */
    public int m7910c() {
        return this.f6403j + this.f6405l;
    }

    /* renamed from: d */
    public synchronized boolean m7912d() {
        return this.f6405l != this.f6402i;
    }

    /* renamed from: e */
    public synchronized Format m7913e() {
        return this.f6409p ? null : this.f6410q;
    }

    /* renamed from: f */
    public synchronized long m7914f() {
        return this.f6407n;
    }

    /* renamed from: g */
    public synchronized long m7915g() {
        return this.f6402i == 0 ? Long.MIN_VALUE : this.f6399f[this.f6404k];
    }

    /* renamed from: h */
    public synchronized void m7916h() {
        this.f6405l = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized int m7900a(com.google.android.exoplayer2.C2122i r5, com.google.android.exoplayer2.decoder.DecoderInputBuffer r6, boolean r7, boolean r8, com.google.android.exoplayer2.Format r9, com.google.android.exoplayer2.source.C2213k.C2212a r10) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.m7912d();	 Catch:{ all -> 0x006a }
        r1 = -3;
        r2 = -5;
        r3 = -4;
        if (r0 != 0) goto L_0x0024;
    L_0x000a:
        if (r8 == 0) goto L_0x0012;
    L_0x000c:
        r5 = 4;
        r6.m7340a(r5);	 Catch:{ all -> 0x006a }
        monitor-exit(r4);
        return r3;
    L_0x0012:
        r6 = r4.f6410q;	 Catch:{ all -> 0x006a }
        if (r6 == 0) goto L_0x0022;
    L_0x0016:
        if (r7 != 0) goto L_0x001c;
    L_0x0018:
        r6 = r4.f6410q;	 Catch:{ all -> 0x006a }
        if (r6 == r9) goto L_0x0022;
    L_0x001c:
        r6 = r4.f6410q;	 Catch:{ all -> 0x006a }
        r5.f6062a = r6;	 Catch:{ all -> 0x006a }
        monitor-exit(r4);
        return r2;
    L_0x0022:
        monitor-exit(r4);
        return r1;
    L_0x0024:
        r8 = r4.f6405l;	 Catch:{ all -> 0x006a }
        r8 = r4.m7897f(r8);	 Catch:{ all -> 0x006a }
        if (r7 != 0) goto L_0x0062;
    L_0x002c:
        r7 = r4.f6401h;	 Catch:{ all -> 0x006a }
        r7 = r7[r8];	 Catch:{ all -> 0x006a }
        if (r7 == r9) goto L_0x0033;
    L_0x0032:
        goto L_0x0062;
    L_0x0033:
        r5 = r6.m13519f();	 Catch:{ all -> 0x006a }
        if (r5 == 0) goto L_0x003b;
    L_0x0039:
        monitor-exit(r4);
        return r1;
    L_0x003b:
        r5 = r4.f6399f;	 Catch:{ all -> 0x006a }
        r0 = r5[r8];	 Catch:{ all -> 0x006a }
        r6.f10831c = r0;	 Catch:{ all -> 0x006a }
        r5 = r4.f6398e;	 Catch:{ all -> 0x006a }
        r5 = r5[r8];	 Catch:{ all -> 0x006a }
        r6.m7340a(r5);	 Catch:{ all -> 0x006a }
        r5 = r4.f6397d;	 Catch:{ all -> 0x006a }
        r5 = r5[r8];	 Catch:{ all -> 0x006a }
        r10.f6391a = r5;	 Catch:{ all -> 0x006a }
        r5 = r4.f6396c;	 Catch:{ all -> 0x006a }
        r6 = r5[r8];	 Catch:{ all -> 0x006a }
        r10.f6392b = r6;	 Catch:{ all -> 0x006a }
        r5 = r4.f6400g;	 Catch:{ all -> 0x006a }
        r5 = r5[r8];	 Catch:{ all -> 0x006a }
        r10.f6393c = r5;	 Catch:{ all -> 0x006a }
        r5 = r4.f6405l;	 Catch:{ all -> 0x006a }
        r5 = r5 + 1;
        r4.f6405l = r5;	 Catch:{ all -> 0x006a }
        monitor-exit(r4);
        return r3;
    L_0x0062:
        r6 = r4.f6401h;	 Catch:{ all -> 0x006a }
        r6 = r6[r8];	 Catch:{ all -> 0x006a }
        r5.f6062a = r6;	 Catch:{ all -> 0x006a }
        monitor-exit(r4);
        return r2;
    L_0x006a:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.k.a(com.google.android.exoplayer2.i, com.google.android.exoplayer2.decoder.DecoderInputBuffer, boolean, boolean, com.google.android.exoplayer2.Format, com.google.android.exoplayer2.source.k$a):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized int m7899a(long r9, boolean r11, boolean r12) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f6405l;	 Catch:{ all -> 0x0039 }
        r2 = r8.m7897f(r0);	 Catch:{ all -> 0x0039 }
        r0 = r8.m7912d();	 Catch:{ all -> 0x0039 }
        r7 = -1;
        if (r0 == 0) goto L_0x0037;
    L_0x000e:
        r0 = r8.f6399f;	 Catch:{ all -> 0x0039 }
        r3 = r0[r2];	 Catch:{ all -> 0x0039 }
        r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r0 < 0) goto L_0x0037;
    L_0x0016:
        r0 = r8.f6407n;	 Catch:{ all -> 0x0039 }
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x001f;
    L_0x001c:
        if (r12 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0037;
    L_0x001f:
        r12 = r8.f6402i;	 Catch:{ all -> 0x0039 }
        r0 = r8.f6405l;	 Catch:{ all -> 0x0039 }
        r3 = r12 - r0;
        r1 = r8;
        r4 = r9;
        r6 = r11;
        r9 = r1.m7894a(r2, r3, r4, r6);	 Catch:{ all -> 0x0039 }
        if (r9 != r7) goto L_0x0030;
    L_0x002e:
        monitor-exit(r8);
        return r7;
    L_0x0030:
        r10 = r8.f6405l;	 Catch:{ all -> 0x0039 }
        r10 = r10 + r9;
        r8.f6405l = r10;	 Catch:{ all -> 0x0039 }
        monitor-exit(r8);
        return r9;
    L_0x0037:
        monitor-exit(r8);
        return r7;
    L_0x0039:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.k.a(long, boolean, boolean):int");
    }

    /* renamed from: i */
    public synchronized int m7917i() {
        int i;
        i = this.f6402i - this.f6405l;
        this.f6405l = this.f6402i;
        return i;
    }

    /* renamed from: c */
    public synchronized boolean m7911c(int i) {
        if (this.f6403j > i || i > this.f6403j + this.f6402i) {
            return false;
        }
        this.f6405l = i - this.f6403j;
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public synchronized long m7907b(long r10, boolean r12, boolean r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.f6402i;	 Catch:{ all -> 0x0038 }
        r1 = -1;
        if (r0 == 0) goto L_0x0036;
    L_0x0007:
        r0 = r9.f6399f;	 Catch:{ all -> 0x0038 }
        r3 = r9.f6404k;	 Catch:{ all -> 0x0038 }
        r3 = r0[r3];	 Catch:{ all -> 0x0038 }
        r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0036;
    L_0x0012:
        if (r13 == 0) goto L_0x001f;
    L_0x0014:
        r13 = r9.f6405l;	 Catch:{ all -> 0x0038 }
        r0 = r9.f6402i;	 Catch:{ all -> 0x0038 }
        if (r13 == r0) goto L_0x001f;
    L_0x001a:
        r13 = r9.f6405l;	 Catch:{ all -> 0x0038 }
        r13 = r13 + 1;
        goto L_0x0021;
    L_0x001f:
        r13 = r9.f6402i;	 Catch:{ all -> 0x0038 }
    L_0x0021:
        r5 = r13;
        r4 = r9.f6404k;	 Catch:{ all -> 0x0038 }
        r3 = r9;
        r6 = r10;
        r8 = r12;
        r10 = r3.m7894a(r4, r5, r6, r8);	 Catch:{ all -> 0x0038 }
        r11 = -1;
        if (r10 != r11) goto L_0x0030;
    L_0x002e:
        monitor-exit(r9);
        return r1;
    L_0x0030:
        r10 = r9.m7895d(r10);	 Catch:{ all -> 0x0038 }
        monitor-exit(r9);
        return r10;
    L_0x0036:
        monitor-exit(r9);
        return r1;
    L_0x0038:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.k.b(long, boolean, boolean):long");
    }

    /* renamed from: j */
    public synchronized long m7918j() {
        if (this.f6405l == 0) {
            return -1;
        }
        return m7895d(this.f6405l);
    }

    /* renamed from: k */
    public synchronized long m7919k() {
        if (this.f6402i == 0) {
            return -1;
        }
        return m7895d(this.f6402i);
    }

    /* renamed from: a */
    public synchronized boolean m7905a(Format format) {
        if (format == null) {
            this.f6409p = true;
            return false;
        }
        this.f6409p = false;
        if (C2314v.m8480a((Object) format, this.f6410q)) {
            return false;
        }
        this.f6410q = format;
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized void m7903a(long r6, int r8, long r9, int r11, com.google.android.exoplayer2.extractor.TrackOutput.C2055a r12) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.f6408o;	 Catch:{ all -> 0x00cf }
        r1 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = r8 & 1;
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r5);
        return;
    L_0x000c:
        r5.f6408o = r1;	 Catch:{ all -> 0x00cf }
    L_0x000e:
        r0 = r5.f6409p;	 Catch:{ all -> 0x00cf }
        r0 = r0 ^ 1;
        com.google.android.exoplayer2.util.C2289a.m8313b(r0);	 Catch:{ all -> 0x00cf }
        r5.m7902a(r6);	 Catch:{ all -> 0x00cf }
        r0 = r5.f6402i;	 Catch:{ all -> 0x00cf }
        r0 = r5.m7897f(r0);	 Catch:{ all -> 0x00cf }
        r2 = r5.f6399f;	 Catch:{ all -> 0x00cf }
        r2[r0] = r6;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6396c;	 Catch:{ all -> 0x00cf }
        r6[r0] = r9;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6397d;	 Catch:{ all -> 0x00cf }
        r6[r0] = r11;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6398e;	 Catch:{ all -> 0x00cf }
        r6[r0] = r8;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6400g;	 Catch:{ all -> 0x00cf }
        r6[r0] = r12;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6401h;	 Catch:{ all -> 0x00cf }
        r7 = r5.f6410q;	 Catch:{ all -> 0x00cf }
        r6[r0] = r7;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6395b;	 Catch:{ all -> 0x00cf }
        r7 = r5.f6411r;	 Catch:{ all -> 0x00cf }
        r6[r0] = r7;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6402i;	 Catch:{ all -> 0x00cf }
        r6 = r6 + 1;
        r5.f6402i = r6;	 Catch:{ all -> 0x00cf }
        r6 = r5.f6402i;	 Catch:{ all -> 0x00cf }
        r7 = r5.f6394a;	 Catch:{ all -> 0x00cf }
        if (r6 != r7) goto L_0x00cd;
    L_0x004a:
        r6 = r5.f6394a;	 Catch:{ all -> 0x00cf }
        r6 = r6 + 1000;
        r7 = new int[r6];	 Catch:{ all -> 0x00cf }
        r8 = new long[r6];	 Catch:{ all -> 0x00cf }
        r9 = new long[r6];	 Catch:{ all -> 0x00cf }
        r10 = new int[r6];	 Catch:{ all -> 0x00cf }
        r11 = new int[r6];	 Catch:{ all -> 0x00cf }
        r12 = new com.google.android.exoplayer2.extractor.TrackOutput.C2055a[r6];	 Catch:{ all -> 0x00cf }
        r0 = new com.google.android.exoplayer2.Format[r6];	 Catch:{ all -> 0x00cf }
        r2 = r5.f6394a;	 Catch:{ all -> 0x00cf }
        r3 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        r2 = r2 - r3;
        r3 = r5.f6396c;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r8, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6399f;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r9, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6398e;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r10, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6397d;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r11, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6400g;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r12, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6401h;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r0, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6395b;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r3, r4, r7, r1, r2);	 Catch:{ all -> 0x00cf }
        r3 = r5.f6404k;	 Catch:{ all -> 0x00cf }
        r4 = r5.f6396c;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r8, r2, r3);	 Catch:{ all -> 0x00cf }
        r4 = r5.f6399f;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r9, r2, r3);	 Catch:{ all -> 0x00cf }
        r4 = r5.f6398e;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r10, r2, r3);	 Catch:{ all -> 0x00cf }
        r4 = r5.f6397d;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r11, r2, r3);	 Catch:{ all -> 0x00cf }
        r4 = r5.f6400g;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r12, r2, r3);	 Catch:{ all -> 0x00cf }
        r4 = r5.f6401h;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ all -> 0x00cf }
        r4 = r5.f6395b;	 Catch:{ all -> 0x00cf }
        java.lang.System.arraycopy(r4, r1, r7, r2, r3);	 Catch:{ all -> 0x00cf }
        r5.f6396c = r8;	 Catch:{ all -> 0x00cf }
        r5.f6399f = r9;	 Catch:{ all -> 0x00cf }
        r5.f6398e = r10;	 Catch:{ all -> 0x00cf }
        r5.f6397d = r11;	 Catch:{ all -> 0x00cf }
        r5.f6400g = r12;	 Catch:{ all -> 0x00cf }
        r5.f6401h = r0;	 Catch:{ all -> 0x00cf }
        r5.f6395b = r7;	 Catch:{ all -> 0x00cf }
        r5.f6404k = r1;	 Catch:{ all -> 0x00cf }
        r7 = r5.f6394a;	 Catch:{ all -> 0x00cf }
        r5.f6402i = r7;	 Catch:{ all -> 0x00cf }
        r5.f6394a = r6;	 Catch:{ all -> 0x00cf }
    L_0x00cd:
        monitor-exit(r5);
        return;
    L_0x00cf:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.k.a(long, int, long, int, com.google.android.exoplayer2.extractor.TrackOutput$a):void");
    }

    /* renamed from: a */
    public synchronized void m7902a(long j) {
        this.f6407n = Math.max(this.f6407n, j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public synchronized boolean m7909b(long r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f6402i;	 Catch:{ all -> 0x004a }
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0010;
    L_0x0007:
        r3 = r7.f6406m;	 Catch:{ all -> 0x004a }
        r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x000e;
    L_0x000d:
        r1 = 1;
    L_0x000e:
        monitor-exit(r7);
        return r1;
    L_0x0010:
        r3 = r7.f6406m;	 Catch:{ all -> 0x004a }
        r0 = r7.f6405l;	 Catch:{ all -> 0x004a }
        r5 = r7.m7896e(r0);	 Catch:{ all -> 0x004a }
        r3 = java.lang.Math.max(r3, r5);	 Catch:{ all -> 0x004a }
        r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r7);
        return r1;
    L_0x0022:
        r0 = r7.f6402i;	 Catch:{ all -> 0x004a }
        r1 = r7.f6402i;	 Catch:{ all -> 0x004a }
        r1 = r1 - r2;
        r1 = r7.m7897f(r1);	 Catch:{ all -> 0x004a }
    L_0x002b:
        r3 = r7.f6405l;	 Catch:{ all -> 0x004a }
        if (r0 <= r3) goto L_0x0042;
    L_0x002f:
        r3 = r7.f6399f;	 Catch:{ all -> 0x004a }
        r4 = r3[r1];	 Catch:{ all -> 0x004a }
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x0042;
    L_0x0037:
        r0 = r0 + -1;
        r1 = r1 + -1;
        r3 = -1;
        if (r1 != r3) goto L_0x002b;
    L_0x003e:
        r1 = r7.f6394a;	 Catch:{ all -> 0x004a }
        r1 = r1 - r2;
        goto L_0x002b;
    L_0x0042:
        r8 = r7.f6403j;	 Catch:{ all -> 0x004a }
        r8 = r8 + r0;
        r7.m7901a(r8);	 Catch:{ all -> 0x004a }
        monitor-exit(r7);
        return r2;
    L_0x004a:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.k.b(long):boolean");
    }

    /* renamed from: a */
    private int m7894a(int i, int i2, long j, boolean z) {
        int i3 = i;
        int i4 = -1;
        for (i = 0; i < i2 && this.f6399f[i3] <= j; i++) {
            if (!(z && (this.f6398e[i3] & 1) == 0)) {
                i4 = i;
            }
            i3++;
            if (i3 == this.f6394a) {
                i3 = 0;
            }
        }
        return i4;
    }

    /* renamed from: d */
    private long m7895d(int i) {
        this.f6406m = Math.max(this.f6406m, m7896e(i));
        this.f6402i -= i;
        this.f6403j += i;
        this.f6404k += i;
        if (this.f6404k >= this.f6394a) {
            this.f6404k -= this.f6394a;
        }
        this.f6405l -= i;
        if (this.f6405l < 0) {
            this.f6405l = 0;
        }
        if (this.f6402i != 0) {
            return this.f6396c[this.f6404k];
        }
        i = (this.f6404k == 0 ? this.f6394a : this.f6404k) - 1;
        return this.f6396c[i] + ((long) this.f6397d[i]);
    }

    /* renamed from: e */
    private long m7896e(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int f = m7897f(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f6399f[f]);
            if ((this.f6398e[f] & 1) != 0) {
                break;
            }
            f--;
            if (f == -1) {
                f = this.f6394a - 1;
            }
        }
        return j;
    }

    /* renamed from: f */
    private int m7897f(int i) {
        int i2 = this.f6404k + i;
        return i2 < this.f6394a ? i2 : i2 - this.f6394a;
    }
}
