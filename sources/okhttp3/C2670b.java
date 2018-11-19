package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import okhttp3.internal.cache.C15910b;
import okhttp3.internal.cache.C15915c;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.io.FileSystem;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: okhttp3.b */
public final class C2670b implements Closeable, Flushable {
    /* renamed from: a */
    final InternalCache f8454a;
    /* renamed from: b */
    final C15915c f8455b;
    /* renamed from: c */
    int f8456c;
    /* renamed from: d */
    int f8457d;
    /* renamed from: e */
    private int f8458e;
    /* renamed from: f */
    private int f8459f;
    /* renamed from: g */
    private int f8460g;

    public C2670b(File file, long j) {
        this(file, j, FileSystem.f49457a);
    }

    C2670b(File file, long j, FileSystem fileSystem) {
        this.f8454a = new b$1(this);
        this.f8455b = C15915c.a(fileSystem, file, 201105, 2, j);
    }

    /* renamed from: a */
    public static String m10314a(HttpUrl httpUrl) {
        return ByteString.a(httpUrl.toString()).c().f();
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    okhttp3.C15966s m10317a(okhttp3.C15963q r5) {
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
        r0 = r5.a();
        r0 = okhttp3.C2670b.m10314a(r0);
        r1 = 0;
        r2 = r4.f8455b;	 Catch:{ IOException -> 0x0033 }
        r0 = r2.a(r0);	 Catch:{ IOException -> 0x0033 }
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r2 = new okhttp3.b$c;	 Catch:{ IOException -> 0x002f }
        r3 = 0;	 Catch:{ IOException -> 0x002f }
        r3 = r0.a(r3);	 Catch:{ IOException -> 0x002f }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002f }
        r0 = r2.a(r0);
        r5 = r2.a(r5, r0);
        if (r5 != 0) goto L_0x002e;
    L_0x0026:
        r5 = r0.h();
        okhttp3.internal.C15908c.a(r5);
        return r1;
    L_0x002e:
        return r0;
    L_0x002f:
        okhttp3.internal.C15908c.a(r0);
        return r1;
    L_0x0033:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.b.a(okhttp3.q):okhttp3.s");
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    okhttp3.internal.cache.CacheRequest m10316a(okhttp3.C15966s r4) {
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
        r3 = this;
        r0 = r4.a();
        r0 = r0.b();
        r1 = r4.a();
        r1 = r1.b();
        r1 = okhttp3.internal.http.C15926e.a(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0017:
        r4 = r4.a();	 Catch:{ IOException -> 0x001e }
        r3.m10322b(r4);	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        return r2;
    L_0x001f:
        r1 = "GET";
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0028;
    L_0x0027:
        return r2;
    L_0x0028:
        r0 = okhttp3.internal.http.C15925d.b(r4);
        if (r0 == 0) goto L_0x002f;
    L_0x002e:
        return r2;
    L_0x002f:
        r0 = new okhttp3.b$c;
        r0.<init>(r4);
        r1 = r3.f8455b;	 Catch:{ IOException -> 0x0052 }
        r4 = r4.a();	 Catch:{ IOException -> 0x0052 }
        r4 = r4.a();	 Catch:{ IOException -> 0x0052 }
        r4 = okhttp3.C2670b.m10314a(r4);	 Catch:{ IOException -> 0x0052 }
        r4 = r1.b(r4);	 Catch:{ IOException -> 0x0052 }
        if (r4 != 0) goto L_0x0049;
    L_0x0048:
        return r2;
    L_0x0049:
        r0.a(r4);	 Catch:{ IOException -> 0x0053 }
        r0 = new okhttp3.b$a;	 Catch:{ IOException -> 0x0053 }
        r0.<init>(r3, r4);	 Catch:{ IOException -> 0x0053 }
        return r0;
    L_0x0052:
        r4 = r2;
    L_0x0053:
        r3.m10315a(r4);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.b.a(okhttp3.s):okhttp3.internal.cache.CacheRequest");
    }

    /* renamed from: b */
    void m10322b(C15963q c15963q) throws IOException {
        this.f8455b.c(C2670b.m10314a(c15963q.a()));
    }

    /* renamed from: a */
    void m10320a(okhttp3.C15966s r2, okhttp3.C15966s r3) {
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
        r1 = this;
        r0 = new okhttp3.b$c;
        r0.<init>(r3);
        r2 = r2.h();
        r2 = (okhttp3.b$b) r2;
        r2 = r2.f54839a;
        r2 = r2.a();	 Catch:{ IOException -> 0x001a }
        if (r2 == 0) goto L_0x001e;
    L_0x0013:
        r0.a(r2);	 Catch:{ IOException -> 0x001b }
        r2.b();	 Catch:{ IOException -> 0x001b }
        goto L_0x001e;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r1.m10315a(r2);
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.b.a(okhttp3.s, okhttp3.s):void");
    }

    /* renamed from: a */
    private void m10315a(@javax.annotation.Nullable okhttp3.internal.cache.C15915c.C15912a r1) {
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
        r0 = this;
        if (r1 == 0) goto L_0x0005;
    L_0x0002:
        r1.c();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.b.a(okhttp3.internal.cache.c$a):void");
    }

    /* renamed from: a */
    public void m10318a() throws IOException {
        this.f8455b.g();
    }

    public void flush() throws IOException {
        this.f8455b.flush();
    }

    public void close() throws IOException {
        this.f8455b.close();
    }

    /* renamed from: a */
    synchronized void m10319a(C15910b c15910b) {
        this.f8460g++;
        if (c15910b.f49275a != null) {
            this.f8458e++;
        } else if (c15910b.f49276b != null) {
            this.f8459f++;
        }
    }

    /* renamed from: b */
    synchronized void m10321b() {
        this.f8459f++;
    }

    /* renamed from: a */
    static int m10313a(BufferedSource bufferedSource) throws IOException {
        try {
            long readDecimalLong = bufferedSource.readDecimalLong();
            bufferedSource = bufferedSource.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L) {
                if (bufferedSource.isEmpty()) {
                    return (int) readDecimalLong;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected an int but was \"");
            stringBuilder.append(readDecimalLong);
            stringBuilder.append(bufferedSource);
            stringBuilder.append("\"");
            throw new IOException(stringBuilder.toString());
        } catch (BufferedSource bufferedSource2) {
            throw new IOException(bufferedSource2.getMessage());
        }
    }
}
