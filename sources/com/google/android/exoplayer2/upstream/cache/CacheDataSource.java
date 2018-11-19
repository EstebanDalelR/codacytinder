package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.exoplayer2.upstream.C3725j;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CacheDataSource implements DataSource {
    /* renamed from: a */
    private final Cache f11694a;
    /* renamed from: b */
    private final DataSource f11695b;
    /* renamed from: c */
    private final DataSource f11696c;
    /* renamed from: d */
    private final DataSource f11697d;
    @Nullable
    /* renamed from: e */
    private final EventListener f11698e;
    /* renamed from: f */
    private final boolean f11699f;
    /* renamed from: g */
    private final boolean f11700g;
    /* renamed from: h */
    private final boolean f11701h;
    /* renamed from: i */
    private DataSource f11702i;
    /* renamed from: j */
    private boolean f11703j;
    /* renamed from: k */
    private Uri f11704k;
    /* renamed from: l */
    private Uri f11705l;
    /* renamed from: m */
    private int f11706m;
    /* renamed from: n */
    private String f11707n;
    /* renamed from: o */
    private long f11708o;
    /* renamed from: p */
    private long f11709p;
    /* renamed from: q */
    private C2280a f11710q;
    /* renamed from: r */
    private boolean f11711r;
    /* renamed from: s */
    private boolean f11712s;
    /* renamed from: t */
    private long f11713t;
    /* renamed from: u */
    private long f11714u;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i, @Nullable EventListener eventListener) {
        this.f11694a = cache;
        this.f11695b = dataSource2;
        dataSource2 = null;
        this.f11699f = (i & 1) != null ? true : null;
        this.f11700g = (i & 2) != null ? true : null;
        if ((i & 4) != null) {
            dataSource2 = true;
        }
        this.f11701h = dataSource2;
        this.f11697d = dataSource;
        if (dataSink != null) {
            this.f11696c = new C3725j(dataSource, dataSink);
        } else {
            this.f11696c = null;
        }
        this.f11698e = eventListener;
    }

    public long open(DataSpec dataSpec) throws IOException {
        try {
            this.f11707n = C2281b.m8254a(dataSpec);
            this.f11704k = dataSpec.f6822a;
            this.f11705l = m14095a(this.f11694a, this.f11707n, this.f11704k);
            this.f11706m = dataSpec.f6828g;
            this.f11708o = dataSpec.f6825d;
            int a = m14094a(dataSpec);
            this.f11712s = a != -1;
            if (this.f11712s) {
                m14097a(a);
            }
            if (dataSpec.f6826e == -1) {
                if (!this.f11712s) {
                    this.f11709p = this.f11694a.getContentLength(this.f11707n);
                    if (this.f11709p != -1) {
                        this.f11709p -= dataSpec.f6825d;
                        if (this.f11709p <= 0) {
                            throw new DataSourceException(0);
                        }
                    }
                    m14099a(false);
                    return this.f11709p;
                }
            }
            this.f11709p = dataSpec.f6826e;
            m14099a(false);
            return this.f11709p;
        } catch (DataSpec dataSpec2) {
            m14102b(dataSpec2);
            throw dataSpec2;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f11709p == 0) {
            return -1;
        }
        try {
            if (this.f11708o >= this.f11714u) {
                m14099a(true);
            }
            int read = this.f11702i.read(bArr, i, i2);
            if (read != -1) {
                if (m14105e() != null) {
                    this.f11713t += (long) read;
                }
                long j = (long) read;
                this.f11708o += j;
                if (this.f11709p != -1) {
                    this.f11709p -= j;
                }
            } else if (this.f11703j) {
                m14098a(0);
            } else {
                if (this.f11709p <= 0) {
                    if (this.f11709p == -1) {
                    }
                }
                m14107g();
                m14099a(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.f11703j == 0 || m14100a(e) == 0) {
                m14102b(e);
                throw e;
            }
            m14098a(0);
            return -1;
        }
    }

    public Uri getUri() {
        return this.f11705l;
    }

    public void close() throws IOException {
        this.f11704k = null;
        this.f11705l = null;
        m14108h();
        try {
            m14107g();
        } catch (IOException e) {
            m14102b(e);
            throw e;
        }
    }

    /* renamed from: a */
    private void m14099a(boolean r20) throws java.io.IOException {
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
        r19 = this;
        r1 = r19;
        r2 = r1.f11712s;
        r3 = 0;
        if (r2 == 0) goto L_0x0009;
    L_0x0007:
        r2 = r3;
        goto L_0x002f;
    L_0x0009:
        r2 = r1.f11699f;
        if (r2 == 0) goto L_0x0025;
    L_0x000d:
        r2 = r1.f11694a;	 Catch:{ InterruptedException -> 0x0018 }
        r4 = r1.f11707n;	 Catch:{ InterruptedException -> 0x0018 }
        r5 = r1.f11708o;	 Catch:{ InterruptedException -> 0x0018 }
        r2 = r2.startReadWrite(r4, r5);	 Catch:{ InterruptedException -> 0x0018 }
        goto L_0x002f;
    L_0x0018:
        r2 = java.lang.Thread.currentThread();
        r2.interrupt();
        r2 = new java.io.InterruptedIOException;
        r2.<init>();
        throw r2;
    L_0x0025:
        r2 = r1.f11694a;
        r4 = r1.f11707n;
        r5 = r1.f11708o;
        r2 = r2.startReadWriteNonBlocking(r4, r5);
    L_0x002f:
        r4 = -1;
        if (r2 != 0) goto L_0x0047;
    L_0x0033:
        r3 = r1.f11697d;
        r14 = new com.google.android.exoplayer2.upstream.DataSpec;
        r7 = r1.f11704k;
        r8 = r1.f11708o;
        r10 = r1.f11709p;
        r12 = r1.f11707n;
        r13 = r1.f11706m;
        r6 = r14;
        r6.<init>(r7, r8, r10, r12, r13);
        goto L_0x00bf;
    L_0x0047:
        r6 = r2.f6854d;
        if (r6 == 0) goto L_0x0088;
    L_0x004b:
        r3 = r2.f6855e;
        r7 = android.net.Uri.fromFile(r3);
        r8 = r1.f11708o;
        r10 = r2.f6852b;
        r12 = r8 - r10;
        r8 = r2.f6853c;
        r10 = r8 - r12;
        r8 = r1.f11709p;
        r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r3 == 0) goto L_0x0069;
    L_0x0061:
        r8 = r1.f11709p;
        r8 = java.lang.Math.min(r10, r8);
        r14 = r8;
        goto L_0x006a;
    L_0x0069:
        r14 = r10;
    L_0x006a:
        r3 = new com.google.android.exoplayer2.upstream.DataSpec;
        r8 = r1.f11708o;
        r10 = r1.f11707n;
        r11 = r1.f11706m;
        r6 = r3;
        r16 = r10;
        r17 = r11;
        r10 = r12;
        r12 = r14;
        r14 = r16;
        r15 = r17;
        r6.<init>(r7, r8, r10, r12, r14, r15);
        r6 = r1.f11695b;
        r18 = r6;
        r6 = r3;
        r3 = r18;
        goto L_0x00bf;
    L_0x0088:
        r6 = r2.m8251a();
        if (r6 == 0) goto L_0x0092;
    L_0x008e:
        r6 = r1.f11709p;
    L_0x0090:
        r12 = r6;
        goto L_0x00a1;
    L_0x0092:
        r6 = r2.f6853c;
        r8 = r1.f11709p;
        r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r10 == 0) goto L_0x0090;
    L_0x009a:
        r8 = r1.f11709p;
        r6 = java.lang.Math.min(r6, r8);
        goto L_0x0090;
    L_0x00a1:
        r6 = new com.google.android.exoplayer2.upstream.DataSpec;
        r9 = r1.f11704k;
        r10 = r1.f11708o;
        r14 = r1.f11707n;
        r15 = r1.f11706m;
        r8 = r6;
        r8.<init>(r9, r10, r12, r14, r15);
        r7 = r1.f11696c;
        if (r7 == 0) goto L_0x00b6;
    L_0x00b3:
        r3 = r1.f11696c;
        goto L_0x00bf;
    L_0x00b6:
        r7 = r1.f11697d;
        r8 = r1.f11694a;
        r8.releaseHoleSpan(r2);
        r2 = r3;
        r3 = r7;
    L_0x00bf:
        r7 = r1.f11712s;
        if (r7 != 0) goto L_0x00cf;
    L_0x00c3:
        r7 = r1.f11697d;
        if (r3 != r7) goto L_0x00cf;
    L_0x00c7:
        r7 = r1.f11708o;
        r9 = 102400; // 0x19000 float:1.43493E-40 double:5.05923E-319;
        r11 = r7 + r9;
        goto L_0x00d4;
    L_0x00cf:
        r11 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x00d4:
        r1.f11714u = r11;
        if (r20 == 0) goto L_0x00f5;
    L_0x00d8:
        r7 = r19.m14104d();
        com.google.android.exoplayer2.util.C2289a.m8313b(r7);
        r7 = r1.f11697d;
        if (r3 != r7) goto L_0x00e4;
    L_0x00e3:
        return;
    L_0x00e4:
        r19.m14107g();	 Catch:{ Throwable -> 0x00e8 }
        goto L_0x00f5;
    L_0x00e8:
        r0 = move-exception;
        r3 = r2.m8252b();
        if (r3 == 0) goto L_0x00f4;
    L_0x00ef:
        r3 = r1.f11694a;
        r3.releaseHoleSpan(r2);
    L_0x00f4:
        throw r0;
    L_0x00f5:
        if (r2 == 0) goto L_0x00ff;
    L_0x00f7:
        r7 = r2.m8252b();
        if (r7 == 0) goto L_0x00ff;
    L_0x00fd:
        r1.f11710q = r2;
    L_0x00ff:
        r1.f11702i = r3;
        r7 = r6.f6826e;
        r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0109;
    L_0x0107:
        r2 = 1;
        goto L_0x010a;
    L_0x0109:
        r2 = 0;
    L_0x010a:
        r1.f11703j = r2;
        r2 = r3.open(r6);
        r6 = r1.f11703j;
        if (r6 == 0) goto L_0x011b;
    L_0x0114:
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x011b;
    L_0x0118:
        r1.m14098a(r2);
    L_0x011b:
        r19.m14096a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheDataSource.a(boolean):void");
    }

    /* renamed from: a */
    private void m14096a() {
        if (m14103c()) {
            this.f11705l = this.f11702i.getUri();
            m14101b();
        }
    }

    /* renamed from: b */
    private void m14101b() {
        if (m14106f()) {
            C2285f c2285f = new C2285f();
            if ((this.f11704k.equals(this.f11705l) ^ 1) != 0) {
                C2284e.m8290a(c2285f, this.f11705l);
            } else {
                C2284e.m8288a(c2285f);
            }
            try {
                this.f11694a.applyContentMetadataMutations(this.f11707n, c2285f);
            } catch (Throwable e) {
                Log.w("CacheDataSource", "Couldn't update redirected URI. This might cause relative URIs get resolved incorrectly.", e);
            }
        }
    }

    /* renamed from: a */
    private static Uri m14095a(Cache cache, String str, Uri uri) {
        cache = C2284e.m8291b(cache.getContentMetadata(str));
        return cache == null ? uri : cache;
    }

    /* renamed from: a */
    private static boolean m14100a(IOException iOException) {
        while (iOException != null) {
            if ((iOException instanceof DataSourceException) && ((DataSourceException) iOException).f6821a == 0) {
                return true;
            }
            iOException = iOException.getCause();
        }
        return null;
    }

    /* renamed from: a */
    private void m14098a(long j) throws IOException {
        this.f11709p = j;
        if (m14106f()) {
            this.f11694a.setContentLength(this.f11707n, this.f11708o + j);
        }
    }

    /* renamed from: c */
    private boolean m14103c() {
        return m14105e() ^ 1;
    }

    /* renamed from: d */
    private boolean m14104d() {
        return this.f11702i == this.f11697d;
    }

    /* renamed from: e */
    private boolean m14105e() {
        return this.f11702i == this.f11695b;
    }

    /* renamed from: f */
    private boolean m14106f() {
        return this.f11702i == this.f11696c;
    }

    /* renamed from: g */
    private void m14107g() throws IOException {
        if (this.f11702i != null) {
            try {
                this.f11702i.close();
            } finally {
                this.f11702i = null;
                this.f11703j = false;
                if (this.f11710q != null) {
                    this.f11694a.releaseHoleSpan(this.f11710q);
                    this.f11710q = null;
                }
            }
        }
    }

    /* renamed from: b */
    private void m14102b(IOException iOException) {
        if (m14105e() || (iOException instanceof CacheException) != null) {
            this.f11711r = true;
        }
    }

    /* renamed from: a */
    private int m14094a(DataSpec dataSpec) {
        if (this.f11700g && this.f11711r) {
            return null;
        }
        return (this.f11701h && dataSpec.f6826e == -1) ? 1 : -1;
    }

    /* renamed from: a */
    private void m14097a(int i) {
        if (this.f11698e != null) {
            this.f11698e.onCacheIgnored(i);
        }
    }

    /* renamed from: h */
    private void m14108h() {
        if (this.f11698e != null && this.f11713t > 0) {
            this.f11698e.onCachedBytesRead(this.f11694a.getCacheSpace(), this.f11713t);
            this.f11713t = 0;
        }
    }
}
