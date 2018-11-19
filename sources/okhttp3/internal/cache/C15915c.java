package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.p461b.C15904f;
import okio.BufferedSink;
import okio.C15976k;
import okio.Source;

/* renamed from: okhttp3.internal.cache.c */
public final class C15915c implements Closeable, Flushable {
    /* renamed from: a */
    static final Pattern f49295a = Pattern.compile("[a-z0-9_-]{1,120}");
    /* renamed from: m */
    static final /* synthetic */ boolean f49296m = true;
    /* renamed from: b */
    final FileSystem f49297b;
    /* renamed from: c */
    final File f49298c;
    /* renamed from: d */
    final int f49299d;
    /* renamed from: e */
    BufferedSink f49300e;
    /* renamed from: f */
    final LinkedHashMap<String, C15913b> f49301f = new LinkedHashMap(0, 0.75f, f49296m);
    /* renamed from: g */
    int f49302g;
    /* renamed from: h */
    boolean f49303h;
    /* renamed from: i */
    boolean f49304i;
    /* renamed from: j */
    boolean f49305j;
    /* renamed from: k */
    boolean f49306k;
    /* renamed from: l */
    boolean f49307l;
    /* renamed from: n */
    private final File f49308n;
    /* renamed from: o */
    private final File f49309o;
    /* renamed from: p */
    private final File f49310p;
    /* renamed from: q */
    private final int f49311q;
    /* renamed from: r */
    private long f49312r;
    /* renamed from: s */
    private long f49313s = 0;
    /* renamed from: t */
    private long f49314t = 0;
    /* renamed from: u */
    private final Executor f49315u;
    /* renamed from: v */
    private final Runnable f49316v = new C159111(this);

    /* renamed from: okhttp3.internal.cache.c$1 */
    class C159111 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C15915c f49277a;

        C159111(C15915c c15915c) {
            this.f49277a = c15915c;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r4.f49277a;
            monitor-enter(r0);
            r1 = r4.f49277a;	 Catch:{ all -> 0x0041 }
            r1 = r1.f49304i;	 Catch:{ all -> 0x0041 }
            r2 = 1;	 Catch:{ all -> 0x0041 }
            r1 = r1 ^ r2;	 Catch:{ all -> 0x0041 }
            r3 = r4.f49277a;	 Catch:{ all -> 0x0041 }
            r3 = r3.f49305j;	 Catch:{ all -> 0x0041 }
            r1 = r1 | r3;	 Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0012;	 Catch:{ all -> 0x0041 }
        L_0x0010:
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            return;
        L_0x0012:
            r1 = r4.f49277a;	 Catch:{ IOException -> 0x0018 }
            r1.m60215e();	 Catch:{ IOException -> 0x0018 }
            goto L_0x001c;
        L_0x0018:
            r1 = r4.f49277a;	 Catch:{ all -> 0x0041 }
            r1.f49306k = r2;	 Catch:{ all -> 0x0041 }
        L_0x001c:
            r1 = r4.f49277a;	 Catch:{ IOException -> 0x002f }
            r1 = r1.m60212c();	 Catch:{ IOException -> 0x002f }
            if (r1 == 0) goto L_0x003f;	 Catch:{ IOException -> 0x002f }
        L_0x0024:
            r1 = r4.f49277a;	 Catch:{ IOException -> 0x002f }
            r1.m60211b();	 Catch:{ IOException -> 0x002f }
            r1 = r4.f49277a;	 Catch:{ IOException -> 0x002f }
            r3 = 0;	 Catch:{ IOException -> 0x002f }
            r1.f49302g = r3;	 Catch:{ IOException -> 0x002f }
            goto L_0x003f;
        L_0x002f:
            r1 = r4.f49277a;	 Catch:{ all -> 0x0041 }
            r1.f49307l = r2;	 Catch:{ all -> 0x0041 }
            r1 = r4.f49277a;	 Catch:{ all -> 0x0041 }
            r2 = okio.C15976k.m60610a();	 Catch:{ all -> 0x0041 }
            r2 = okio.C15976k.m60608a(r2);	 Catch:{ all -> 0x0041 }
            r1.f49300e = r2;	 Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            return;	 Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception;	 Catch:{ all -> 0x0041 }
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.1.run():void");
        }
    }

    /* renamed from: okhttp3.internal.cache.c$a */
    public final class C15912a {
        /* renamed from: a */
        final C15913b f49278a;
        /* renamed from: b */
        final boolean[] f49279b;
        /* renamed from: c */
        final /* synthetic */ C15915c f49280c;
        /* renamed from: d */
        private boolean f49281d;

        C15912a(C15915c c15915c, C15913b c15913b) {
            this.f49280c = c15915c;
            this.f49278a = c15913b;
            this.f49279b = c15913b.f49286e != null ? null : new boolean[c15915c.f49299d];
        }

        /* renamed from: a */
        void m60189a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.f49278a;
            r0 = r0.f49287f;
            if (r0 != r3) goto L_0x0022;
        L_0x0006:
            r0 = 0;
        L_0x0007:
            r1 = r3.f49280c;
            r1 = r1.f49299d;
            if (r0 >= r1) goto L_0x001d;
        L_0x000d:
            r1 = r3.f49280c;	 Catch:{ IOException -> 0x001a }
            r1 = r1.f49297b;	 Catch:{ IOException -> 0x001a }
            r2 = r3.f49278a;	 Catch:{ IOException -> 0x001a }
            r2 = r2.f49285d;	 Catch:{ IOException -> 0x001a }
            r2 = r2[r0];	 Catch:{ IOException -> 0x001a }
            r1.delete(r2);	 Catch:{ IOException -> 0x001a }
        L_0x001a:
            r0 = r0 + 1;
            goto L_0x0007;
        L_0x001d:
            r0 = r3.f49278a;
            r1 = 0;
            r0.f49287f = r1;
        L_0x0022:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.a.a():void");
        }

        /* renamed from: a */
        public okio.Sink m60188a(int r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.f49280c;
            monitor-enter(r0);
            r1 = r3.f49281d;	 Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x000d;	 Catch:{ all -> 0x003f }
        L_0x0007:
            r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003f }
            r4.<init>();	 Catch:{ all -> 0x003f }
            throw r4;	 Catch:{ all -> 0x003f }
        L_0x000d:
            r1 = r3.f49278a;	 Catch:{ all -> 0x003f }
            r1 = r1.f49287f;	 Catch:{ all -> 0x003f }
            if (r1 == r3) goto L_0x0019;	 Catch:{ all -> 0x003f }
        L_0x0013:
            r4 = okio.C15976k.m60610a();	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return r4;	 Catch:{ all -> 0x003f }
        L_0x0019:
            r1 = r3.f49278a;	 Catch:{ all -> 0x003f }
            r1 = r1.f49286e;	 Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x0024;	 Catch:{ all -> 0x003f }
        L_0x001f:
            r1 = r3.f49279b;	 Catch:{ all -> 0x003f }
            r2 = 1;	 Catch:{ all -> 0x003f }
            r1[r4] = r2;	 Catch:{ all -> 0x003f }
        L_0x0024:
            r1 = r3.f49278a;	 Catch:{ all -> 0x003f }
            r1 = r1.f49285d;	 Catch:{ all -> 0x003f }
            r4 = r1[r4];	 Catch:{ all -> 0x003f }
            r1 = r3.f49280c;	 Catch:{ FileNotFoundException -> 0x0039 }
            r1 = r1.f49297b;	 Catch:{ FileNotFoundException -> 0x0039 }
            r4 = r1.sink(r4);	 Catch:{ FileNotFoundException -> 0x0039 }
            r1 = new okhttp3.internal.cache.c$a$1;	 Catch:{ all -> 0x003f }
            r1.<init>(r3, r4);	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return r1;	 Catch:{ all -> 0x003f }
        L_0x0039:
            r4 = okio.C15976k.m60610a();	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return r4;	 Catch:{ all -> 0x003f }
        L_0x003f:
            r4 = move-exception;	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.a.a(int):okio.Sink");
        }

        /* renamed from: b */
        public void m60190b() throws IOException {
            synchronized (this.f49280c) {
                if (this.f49281d) {
                    throw new IllegalStateException();
                }
                if (this.f49278a.f49287f == this) {
                    this.f49280c.m60208a(this, (boolean) C15915c.f49296m);
                }
                this.f49281d = C15915c.f49296m;
            }
        }

        /* renamed from: c */
        public void m60191c() throws IOException {
            synchronized (this.f49280c) {
                if (this.f49281d) {
                    throw new IllegalStateException();
                }
                if (this.f49278a.f49287f == this) {
                    this.f49280c.m60208a(this, false);
                }
                this.f49281d = C15915c.f49296m;
            }
        }
    }

    /* renamed from: okhttp3.internal.cache.c$b */
    private final class C15913b {
        /* renamed from: a */
        final String f49282a;
        /* renamed from: b */
        final long[] f49283b;
        /* renamed from: c */
        final File[] f49284c;
        /* renamed from: d */
        final File[] f49285d;
        /* renamed from: e */
        boolean f49286e;
        /* renamed from: f */
        C15912a f49287f;
        /* renamed from: g */
        long f49288g;
        /* renamed from: h */
        final /* synthetic */ C15915c f49289h;

        C15913b(C15915c c15915c, String str) {
            this.f49289h = c15915c;
            this.f49282a = str;
            this.f49283b = new long[c15915c.f49299d];
            this.f49284c = new File[c15915c.f49299d];
            this.f49285d = new File[c15915c.f49299d];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            str = stringBuilder.length();
            for (int i = 0; i < c15915c.f49299d; i++) {
                stringBuilder.append(i);
                this.f49284c[i] = new File(c15915c.f49298c, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.f49285d[i] = new File(c15915c.f49298c, stringBuilder.toString());
                stringBuilder.setLength(str);
            }
        }

        /* renamed from: a */
        void m60195a(java.lang.String[] r5) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r5.length;
            r1 = r4.f49289h;
            r1 = r1.f49299d;
            if (r0 == r1) goto L_0x000c;
        L_0x0007:
            r5 = r4.m60192b(r5);
            throw r5;
        L_0x000c:
            r0 = 0;
        L_0x000d:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x001e }
            if (r0 >= r1) goto L_0x001d;	 Catch:{ NumberFormatException -> 0x001e }
        L_0x0010:
            r1 = r4.f49283b;	 Catch:{ NumberFormatException -> 0x001e }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x001e }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x001e }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x001e }
            r0 = r0 + 1;
            goto L_0x000d;
        L_0x001d:
            return;
        L_0x001e:
            r5 = r4.m60192b(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.b.a(java.lang.String[]):void");
        }

        /* renamed from: a */
        void m60194a(BufferedSink bufferedSink) throws IOException {
            for (long writeDecimalLong : this.f49283b) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }

        /* renamed from: b */
        private IOException m60192b(String[] strArr) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: a */
        okhttp3.internal.cache.C15915c.C15914c m60193a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r10 = this;
            r0 = r10.f49289h;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 != 0) goto L_0x000e;
        L_0x0008:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x000e:
            r0 = r10.f49289h;
            r0 = r0.f49299d;
            r0 = new okio.Source[r0];
            r1 = r10.f49283b;
            r1 = r1.clone();
            r7 = r1;
            r7 = (long[]) r7;
            r8 = 0;
            r1 = 0;
        L_0x001f:
            r2 = r10.f49289h;	 Catch:{ FileNotFoundException -> 0x0044 }
            r2 = r2.f49299d;	 Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 >= r2) goto L_0x0036;	 Catch:{ FileNotFoundException -> 0x0044 }
        L_0x0025:
            r2 = r10.f49289h;	 Catch:{ FileNotFoundException -> 0x0044 }
            r2 = r2.f49297b;	 Catch:{ FileNotFoundException -> 0x0044 }
            r3 = r10.f49284c;	 Catch:{ FileNotFoundException -> 0x0044 }
            r3 = r3[r1];	 Catch:{ FileNotFoundException -> 0x0044 }
            r2 = r2.source(r3);	 Catch:{ FileNotFoundException -> 0x0044 }
            r0[r1] = r2;	 Catch:{ FileNotFoundException -> 0x0044 }
            r1 = r1 + 1;	 Catch:{ FileNotFoundException -> 0x0044 }
            goto L_0x001f;	 Catch:{ FileNotFoundException -> 0x0044 }
        L_0x0036:
            r9 = new okhttp3.internal.cache.c$c;	 Catch:{ FileNotFoundException -> 0x0044 }
            r2 = r10.f49289h;	 Catch:{ FileNotFoundException -> 0x0044 }
            r3 = r10.f49282a;	 Catch:{ FileNotFoundException -> 0x0044 }
            r4 = r10.f49288g;	 Catch:{ FileNotFoundException -> 0x0044 }
            r1 = r9;	 Catch:{ FileNotFoundException -> 0x0044 }
            r6 = r0;	 Catch:{ FileNotFoundException -> 0x0044 }
            r1.<init>(r2, r3, r4, r6, r7);	 Catch:{ FileNotFoundException -> 0x0044 }
            return r9;
        L_0x0044:
            r1 = r10.f49289h;
            r1 = r1.f49299d;
            if (r8 >= r1) goto L_0x0056;
        L_0x004a:
            r1 = r0[r8];
            if (r1 == 0) goto L_0x0056;
        L_0x004e:
            r1 = r0[r8];
            okhttp3.internal.C15908c.m60165a(r1);
            r8 = r8 + 1;
            goto L_0x0044;
        L_0x0056:
            r0 = r10.f49289h;	 Catch:{ IOException -> 0x005b }
            r0.m60209a(r10);	 Catch:{ IOException -> 0x005b }
        L_0x005b:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.b.a():okhttp3.internal.cache.c$c");
        }
    }

    /* renamed from: okhttp3.internal.cache.c$c */
    public final class C15914c implements Closeable {
        /* renamed from: a */
        final /* synthetic */ C15915c f49290a;
        /* renamed from: b */
        private final String f49291b;
        /* renamed from: c */
        private final long f49292c;
        /* renamed from: d */
        private final Source[] f49293d;
        /* renamed from: e */
        private final long[] f49294e;

        C15914c(C15915c c15915c, String str, long j, Source[] sourceArr, long[] jArr) {
            this.f49290a = c15915c;
            this.f49291b = str;
            this.f49292c = j;
            this.f49293d = sourceArr;
            this.f49294e = jArr;
        }

        @Nullable
        /* renamed from: a */
        public C15912a m60196a() throws IOException {
            return this.f49290a.m60205a(this.f49291b, this.f49292c);
        }

        /* renamed from: a */
        public Source m60197a(int i) {
            return this.f49293d[i];
        }

        public void close() {
            for (Closeable a : this.f49293d) {
                C15908c.m60165a(a);
            }
        }
    }

    C15915c(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.f49297b = fileSystem;
        this.f49298c = file;
        this.f49311q = i;
        this.f49308n = new File(file, "journal");
        this.f49309o = new File(file, "journal.tmp");
        this.f49310p = new File(file, "journal.bkp");
        this.f49299d = i2;
        this.f49312r = j;
        this.f49315u = executor;
    }

    /* renamed from: a */
    public synchronized void m60207a() throws IOException {
        if (!f49296m && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.f49304i) {
            if (this.f49297b.exists(this.f49310p)) {
                if (this.f49297b.exists(this.f49308n)) {
                    this.f49297b.delete(this.f49310p);
                } else {
                    this.f49297b.rename(this.f49310p, this.f49308n);
                }
            }
            if (this.f49297b.exists(this.f49308n)) {
                try {
                    m60201h();
                    m60203j();
                    this.f49304i = f49296m;
                    return;
                } catch (Throwable e) {
                    C15904f c = C15904f.m60134c();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(this.f49298c);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    c.mo13338a(5, stringBuilder.toString(), e);
                    m60216f();
                } finally {
                    this.f49305j = false;
                }
            }
            m60211b();
            this.f49304i = f49296m;
        }
    }

    /* renamed from: a */
    public static C15915c m60198a(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        } else {
            return new C15915c(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C15908c.m60163a("OkHttp DiskLruCache", (boolean) f49296m)));
        }
    }

    /* renamed from: h */
    private void m60201h() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8.f49297b;
        r1 = r8.f49308n;
        r0 = r0.source(r1);
        r0 = okio.C15976k.m60609a(r0);
        r1 = r0.readUtf8LineStrict();	 Catch:{ all -> 0x00ad }
        r2 = r0.readUtf8LineStrict();	 Catch:{ all -> 0x00ad }
        r3 = r0.readUtf8LineStrict();	 Catch:{ all -> 0x00ad }
        r4 = r0.readUtf8LineStrict();	 Catch:{ all -> 0x00ad }
        r5 = r0.readUtf8LineStrict();	 Catch:{ all -> 0x00ad }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x00ad }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x00ad }
        if (r6 == 0) goto L_0x0079;	 Catch:{ all -> 0x00ad }
    L_0x0028:
        r6 = "1";	 Catch:{ all -> 0x00ad }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x00ad }
        if (r6 == 0) goto L_0x0079;	 Catch:{ all -> 0x00ad }
    L_0x0030:
        r6 = r8.f49311q;	 Catch:{ all -> 0x00ad }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00ad }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x00ad }
        if (r3 == 0) goto L_0x0079;	 Catch:{ all -> 0x00ad }
    L_0x003c:
        r3 = r8.f49299d;	 Catch:{ all -> 0x00ad }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x00ad }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x00ad }
        if (r3 == 0) goto L_0x0079;	 Catch:{ all -> 0x00ad }
    L_0x0048:
        r3 = "";	 Catch:{ all -> 0x00ad }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x00ad }
        if (r3 != 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0079;
    L_0x0051:
        r1 = 0;
    L_0x0052:
        r2 = r0.readUtf8LineStrict();	 Catch:{ EOFException -> 0x005c }
        r8.m60199d(r2);	 Catch:{ EOFException -> 0x005c }
        r1 = r1 + 1;
        goto L_0x0052;
    L_0x005c:
        r2 = r8.f49301f;	 Catch:{ all -> 0x00ad }
        r2 = r2.size();	 Catch:{ all -> 0x00ad }
        r1 = r1 - r2;	 Catch:{ all -> 0x00ad }
        r8.f49302g = r1;	 Catch:{ all -> 0x00ad }
        r1 = r0.exhausted();	 Catch:{ all -> 0x00ad }
        if (r1 != 0) goto L_0x006f;	 Catch:{ all -> 0x00ad }
    L_0x006b:
        r8.m60211b();	 Catch:{ all -> 0x00ad }
        goto L_0x0075;	 Catch:{ all -> 0x00ad }
    L_0x006f:
        r1 = r8.m60202i();	 Catch:{ all -> 0x00ad }
        r8.f49300e = r1;	 Catch:{ all -> 0x00ad }
    L_0x0075:
        okhttp3.internal.C15908c.m60165a(r0);
        return;
    L_0x0079:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x00ad }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ad }
        r6.<init>();	 Catch:{ all -> 0x00ad }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x00ad }
        r6.append(r7);	 Catch:{ all -> 0x00ad }
        r6.append(r1);	 Catch:{ all -> 0x00ad }
        r1 = ", ";	 Catch:{ all -> 0x00ad }
        r6.append(r1);	 Catch:{ all -> 0x00ad }
        r6.append(r2);	 Catch:{ all -> 0x00ad }
        r1 = ", ";	 Catch:{ all -> 0x00ad }
        r6.append(r1);	 Catch:{ all -> 0x00ad }
        r6.append(r4);	 Catch:{ all -> 0x00ad }
        r1 = ", ";	 Catch:{ all -> 0x00ad }
        r6.append(r1);	 Catch:{ all -> 0x00ad }
        r6.append(r5);	 Catch:{ all -> 0x00ad }
        r1 = "]";	 Catch:{ all -> 0x00ad }
        r6.append(r1);	 Catch:{ all -> 0x00ad }
        r1 = r6.toString();	 Catch:{ all -> 0x00ad }
        r3.<init>(r1);	 Catch:{ all -> 0x00ad }
        throw r3;	 Catch:{ all -> 0x00ad }
    L_0x00ad:
        r1 = move-exception;
        okhttp3.internal.C15908c.m60165a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.h():void");
    }

    /* renamed from: i */
    private BufferedSink m60202i() throws FileNotFoundException {
        return C15976k.m60608a(new C18545d(this, this.f49297b.appendingSink(this.f49308n)) {
            /* renamed from: a */
            static final /* synthetic */ boolean f59360a = true;
            /* renamed from: b */
            final /* synthetic */ C15915c f59361b;

            static {
                Class cls = C15915c.class;
            }

            /* renamed from: a */
            protected void mo14136a(IOException iOException) {
                if (f59360a == null && Thread.holdsLock(this.f59361b) == null) {
                    throw new AssertionError();
                }
                this.f59361b.f49303h = f59360a;
            }
        });
    }

    /* renamed from: d */
    private void m60199d(String str) throws IOException {
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
        String substring;
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == "REMOVE".length() && str.startsWith("REMOVE")) {
                this.f49301f.remove(substring);
                return;
            }
        }
        substring = str.substring(i, indexOf2);
        C15913b c15913b = (C15913b) this.f49301f.get(substring);
        if (c15913b == null) {
            c15913b = new C15913b(this, substring);
            this.f49301f.put(substring, c15913b);
        }
        if (indexOf2 != -1 && indexOf == "CLEAN".length() && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            c15913b.f49286e = f49296m;
            c15913b.f49287f = null;
            c15913b.m60195a(split);
        } else if (indexOf2 == -1 && indexOf == "DIRTY".length() && str.startsWith("DIRTY")) {
            c15913b.f49287f = new C15912a(this, c15913b);
        } else if (!(indexOf2 == -1 && indexOf == "READ".length() && str.startsWith("READ"))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: j */
    private void m60203j() throws IOException {
        this.f49297b.delete(this.f49309o);
        Iterator it = this.f49301f.values().iterator();
        while (it.hasNext()) {
            C15913b c15913b = (C15913b) it.next();
            int i = 0;
            if (c15913b.f49287f == null) {
                while (i < this.f49299d) {
                    this.f49313s += c15913b.f49283b[i];
                    i++;
                }
            } else {
                c15913b.f49287f = null;
                while (i < this.f49299d) {
                    this.f49297b.delete(c15913b.f49284c[i]);
                    this.f49297b.delete(c15913b.f49285d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: b */
    synchronized void m60211b() throws IOException {
        if (this.f49300e != null) {
            this.f49300e.close();
        }
        BufferedSink a = C15976k.m60608a(this.f49297b.sink(this.f49309o));
        try {
            a.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
            a.writeUtf8("1").writeByte(10);
            a.writeDecimalLong((long) this.f49311q).writeByte(10);
            a.writeDecimalLong((long) this.f49299d).writeByte(10);
            a.writeByte(10);
            for (C15913b c15913b : this.f49301f.values()) {
                if (c15913b.f49287f != null) {
                    a.writeUtf8("DIRTY").writeByte(32);
                    a.writeUtf8(c15913b.f49282a);
                    a.writeByte(10);
                } else {
                    a.writeUtf8("CLEAN").writeByte(32);
                    a.writeUtf8(c15913b.f49282a);
                    c15913b.m60194a(a);
                    a.writeByte(10);
                }
            }
            if (this.f49297b.exists(this.f49308n)) {
                this.f49297b.rename(this.f49308n, this.f49310p);
            }
            this.f49297b.rename(this.f49309o, this.f49308n);
            this.f49297b.delete(this.f49310p);
            this.f49300e = m60202i();
            this.f49303h = false;
            this.f49307l = false;
        } finally {
            a.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized okhttp3.internal.cache.C15915c.C15914c m60206a(java.lang.String r4) throws java.io.IOException {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.m60207a();	 Catch:{ all -> 0x0050 }
        r3.m60204k();	 Catch:{ all -> 0x0050 }
        r3.m60200e(r4);	 Catch:{ all -> 0x0050 }
        r0 = r3.f49301f;	 Catch:{ all -> 0x0050 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0050 }
        r0 = (okhttp3.internal.cache.C15915c.C15913b) r0;	 Catch:{ all -> 0x0050 }
        r1 = 0;
        if (r0 == 0) goto L_0x004e;
    L_0x0015:
        r2 = r0.f49286e;	 Catch:{ all -> 0x0050 }
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x004e;
    L_0x001a:
        r0 = r0.m60193a();	 Catch:{ all -> 0x0050 }
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r3);
        return r1;
    L_0x0022:
        r1 = r3.f49302g;	 Catch:{ all -> 0x0050 }
        r1 = r1 + 1;
        r3.f49302g = r1;	 Catch:{ all -> 0x0050 }
        r1 = r3.f49300e;	 Catch:{ all -> 0x0050 }
        r2 = "READ";
        r1 = r1.writeUtf8(r2);	 Catch:{ all -> 0x0050 }
        r2 = 32;
        r1 = r1.writeByte(r2);	 Catch:{ all -> 0x0050 }
        r4 = r1.writeUtf8(r4);	 Catch:{ all -> 0x0050 }
        r1 = 10;
        r4.writeByte(r1);	 Catch:{ all -> 0x0050 }
        r4 = r3.m60212c();	 Catch:{ all -> 0x0050 }
        if (r4 == 0) goto L_0x004c;
    L_0x0045:
        r4 = r3.f49315u;	 Catch:{ all -> 0x0050 }
        r1 = r3.f49316v;	 Catch:{ all -> 0x0050 }
        r4.execute(r1);	 Catch:{ all -> 0x0050 }
    L_0x004c:
        monitor-exit(r3);
        return r0;
    L_0x004e:
        monitor-exit(r3);
        return r1;
    L_0x0050:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.a(java.lang.String):okhttp3.internal.cache.c$c");
    }

    @Nullable
    /* renamed from: b */
    public C15912a m60210b(String str) throws IOException {
        return m60205a(str, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    synchronized okhttp3.internal.cache.C15915c.C15912a m60205a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.m60207a();	 Catch:{ all -> 0x0074 }
        r5.m60204k();	 Catch:{ all -> 0x0074 }
        r5.m60200e(r6);	 Catch:{ all -> 0x0074 }
        r0 = r5.f49301f;	 Catch:{ all -> 0x0074 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0074 }
        r0 = (okhttp3.internal.cache.C15915c.C15913b) r0;	 Catch:{ all -> 0x0074 }
        r1 = -1;
        r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        r1 = 0;
        if (r3 == 0) goto L_0x0023;
    L_0x0019:
        if (r0 == 0) goto L_0x0021;
    L_0x001b:
        r2 = r0.f49288g;	 Catch:{ all -> 0x0074 }
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0023;
    L_0x0021:
        monitor-exit(r5);
        return r1;
    L_0x0023:
        if (r0 == 0) goto L_0x002b;
    L_0x0025:
        r7 = r0.f49287f;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r5);
        return r1;
    L_0x002b:
        r7 = r5.f49306k;	 Catch:{ all -> 0x0074 }
        if (r7 != 0) goto L_0x006b;
    L_0x002f:
        r7 = r5.f49307l;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x006b;
    L_0x0034:
        r7 = r5.f49300e;	 Catch:{ all -> 0x0074 }
        r8 = "DIRTY";
        r7 = r7.writeUtf8(r8);	 Catch:{ all -> 0x0074 }
        r8 = 32;
        r7 = r7.writeByte(r8);	 Catch:{ all -> 0x0074 }
        r7 = r7.writeUtf8(r6);	 Catch:{ all -> 0x0074 }
        r8 = 10;
        r7.writeByte(r8);	 Catch:{ all -> 0x0074 }
        r7 = r5.f49300e;	 Catch:{ all -> 0x0074 }
        r7.flush();	 Catch:{ all -> 0x0074 }
        r7 = r5.f49303h;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x0056;
    L_0x0054:
        monitor-exit(r5);
        return r1;
    L_0x0056:
        if (r0 != 0) goto L_0x0062;
    L_0x0058:
        r0 = new okhttp3.internal.cache.c$b;	 Catch:{ all -> 0x0074 }
        r0.<init>(r5, r6);	 Catch:{ all -> 0x0074 }
        r7 = r5.f49301f;	 Catch:{ all -> 0x0074 }
        r7.put(r6, r0);	 Catch:{ all -> 0x0074 }
    L_0x0062:
        r6 = new okhttp3.internal.cache.c$a;	 Catch:{ all -> 0x0074 }
        r6.<init>(r5, r0);	 Catch:{ all -> 0x0074 }
        r0.f49287f = r6;	 Catch:{ all -> 0x0074 }
        monitor-exit(r5);
        return r6;
    L_0x006b:
        r6 = r5.f49315u;	 Catch:{ all -> 0x0074 }
        r7 = r5.f49316v;	 Catch:{ all -> 0x0074 }
        r6.execute(r7);	 Catch:{ all -> 0x0074 }
        monitor-exit(r5);
        return r1;
    L_0x0074:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.a(java.lang.String, long):okhttp3.internal.cache.c$a");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    synchronized void m60208a(okhttp3.internal.cache.C15915c.C15912a r12, boolean r13) throws java.io.IOException {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r12.f49278a;	 Catch:{ all -> 0x00ff }
        r1 = r0.f49287f;	 Catch:{ all -> 0x00ff }
        if (r1 == r12) goto L_0x000d;
    L_0x0007:
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00ff }
        r12.<init>();	 Catch:{ all -> 0x00ff }
        throw r12;	 Catch:{ all -> 0x00ff }
    L_0x000d:
        r1 = 0;
        if (r13 == 0) goto L_0x004d;
    L_0x0010:
        r2 = r0.f49286e;	 Catch:{ all -> 0x00ff }
        if (r2 != 0) goto L_0x004d;
    L_0x0014:
        r2 = 0;
    L_0x0015:
        r3 = r11.f49299d;	 Catch:{ all -> 0x00ff }
        if (r2 >= r3) goto L_0x004d;
    L_0x0019:
        r3 = r12.f49279b;	 Catch:{ all -> 0x00ff }
        r3 = r3[r2];	 Catch:{ all -> 0x00ff }
        if (r3 != 0) goto L_0x0039;
    L_0x001f:
        r12.m60191c();	 Catch:{ all -> 0x00ff }
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00ff }
        r13 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ff }
        r13.<init>();	 Catch:{ all -> 0x00ff }
        r0 = "Newly created entry didn't create value for index ";
        r13.append(r0);	 Catch:{ all -> 0x00ff }
        r13.append(r2);	 Catch:{ all -> 0x00ff }
        r13 = r13.toString();	 Catch:{ all -> 0x00ff }
        r12.<init>(r13);	 Catch:{ all -> 0x00ff }
        throw r12;	 Catch:{ all -> 0x00ff }
    L_0x0039:
        r3 = r11.f49297b;	 Catch:{ all -> 0x00ff }
        r4 = r0.f49285d;	 Catch:{ all -> 0x00ff }
        r4 = r4[r2];	 Catch:{ all -> 0x00ff }
        r3 = r3.exists(r4);	 Catch:{ all -> 0x00ff }
        if (r3 != 0) goto L_0x004a;
    L_0x0045:
        r12.m60191c();	 Catch:{ all -> 0x00ff }
        monitor-exit(r11);
        return;
    L_0x004a:
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x004d:
        r12 = r11.f49299d;	 Catch:{ all -> 0x00ff }
        if (r1 >= r12) goto L_0x0088;
    L_0x0051:
        r12 = r0.f49285d;	 Catch:{ all -> 0x00ff }
        r12 = r12[r1];	 Catch:{ all -> 0x00ff }
        if (r13 == 0) goto L_0x0080;
    L_0x0057:
        r2 = r11.f49297b;	 Catch:{ all -> 0x00ff }
        r2 = r2.exists(r12);	 Catch:{ all -> 0x00ff }
        if (r2 == 0) goto L_0x0085;
    L_0x005f:
        r2 = r0.f49284c;	 Catch:{ all -> 0x00ff }
        r2 = r2[r1];	 Catch:{ all -> 0x00ff }
        r3 = r11.f49297b;	 Catch:{ all -> 0x00ff }
        r3.rename(r12, r2);	 Catch:{ all -> 0x00ff }
        r12 = r0.f49283b;	 Catch:{ all -> 0x00ff }
        r3 = r12[r1];	 Catch:{ all -> 0x00ff }
        r12 = r11.f49297b;	 Catch:{ all -> 0x00ff }
        r5 = r12.size(r2);	 Catch:{ all -> 0x00ff }
        r12 = r0.f49283b;	 Catch:{ all -> 0x00ff }
        r12[r1] = r5;	 Catch:{ all -> 0x00ff }
        r7 = r11.f49313s;	 Catch:{ all -> 0x00ff }
        r12 = 0;
        r9 = r7 - r3;
        r2 = r9 + r5;
        r11.f49313s = r2;	 Catch:{ all -> 0x00ff }
        goto L_0x0085;
    L_0x0080:
        r2 = r11.f49297b;	 Catch:{ all -> 0x00ff }
        r2.delete(r12);	 Catch:{ all -> 0x00ff }
    L_0x0085:
        r1 = r1 + 1;
        goto L_0x004d;
    L_0x0088:
        r12 = r11.f49302g;	 Catch:{ all -> 0x00ff }
        r1 = 1;
        r12 = r12 + r1;
        r11.f49302g = r12;	 Catch:{ all -> 0x00ff }
        r12 = 0;
        r0.f49287f = r12;	 Catch:{ all -> 0x00ff }
        r12 = r0.f49286e;	 Catch:{ all -> 0x00ff }
        r12 = r12 | r13;
        r2 = 10;
        r3 = 32;
        if (r12 == 0) goto L_0x00c5;
    L_0x009a:
        r0.f49286e = r1;	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r1 = "CLEAN";
        r12 = r12.writeUtf8(r1);	 Catch:{ all -> 0x00ff }
        r12.writeByte(r3);	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r1 = r0.f49282a;	 Catch:{ all -> 0x00ff }
        r12.writeUtf8(r1);	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r0.m60194a(r12);	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r12.writeByte(r2);	 Catch:{ all -> 0x00ff }
        if (r13 == 0) goto L_0x00e3;
    L_0x00ba:
        r12 = r11.f49314t;	 Catch:{ all -> 0x00ff }
        r1 = 1;
        r3 = r12 + r1;
        r11.f49314t = r3;	 Catch:{ all -> 0x00ff }
        r0.f49288g = r12;	 Catch:{ all -> 0x00ff }
        goto L_0x00e3;
    L_0x00c5:
        r12 = r11.f49301f;	 Catch:{ all -> 0x00ff }
        r13 = r0.f49282a;	 Catch:{ all -> 0x00ff }
        r12.remove(r13);	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r13 = "REMOVE";
        r12 = r12.writeUtf8(r13);	 Catch:{ all -> 0x00ff }
        r12.writeByte(r3);	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r13 = r0.f49282a;	 Catch:{ all -> 0x00ff }
        r12.writeUtf8(r13);	 Catch:{ all -> 0x00ff }
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r12.writeByte(r2);	 Catch:{ all -> 0x00ff }
    L_0x00e3:
        r12 = r11.f49300e;	 Catch:{ all -> 0x00ff }
        r12.flush();	 Catch:{ all -> 0x00ff }
        r12 = r11.f49313s;	 Catch:{ all -> 0x00ff }
        r0 = r11.f49312r;	 Catch:{ all -> 0x00ff }
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00f6;
    L_0x00f0:
        r12 = r11.m60212c();	 Catch:{ all -> 0x00ff }
        if (r12 == 0) goto L_0x00fd;
    L_0x00f6:
        r12 = r11.f49315u;	 Catch:{ all -> 0x00ff }
        r13 = r11.f49316v;	 Catch:{ all -> 0x00ff }
        r12.execute(r13);	 Catch:{ all -> 0x00ff }
    L_0x00fd:
        monitor-exit(r11);
        return;
    L_0x00ff:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.a(okhttp3.internal.cache.c$a, boolean):void");
    }

    /* renamed from: c */
    boolean m60212c() {
        return (this.f49302g < 2000 || this.f49302g < this.f49301f.size()) ? false : f49296m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public synchronized boolean m60213c(java.lang.String r7) throws java.io.IOException {
        /*
        r6 = this;
        monitor-enter(r6);
        r6.m60207a();	 Catch:{ all -> 0x0029 }
        r6.m60204k();	 Catch:{ all -> 0x0029 }
        r6.m60200e(r7);	 Catch:{ all -> 0x0029 }
        r0 = r6.f49301f;	 Catch:{ all -> 0x0029 }
        r7 = r0.get(r7);	 Catch:{ all -> 0x0029 }
        r7 = (okhttp3.internal.cache.C15915c.C15913b) r7;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        if (r7 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r6);
        return r0;
    L_0x0017:
        r7 = r6.m60209a(r7);	 Catch:{ all -> 0x0029 }
        if (r7 == 0) goto L_0x0027;
    L_0x001d:
        r1 = r6.f49313s;	 Catch:{ all -> 0x0029 }
        r3 = r6.f49312r;	 Catch:{ all -> 0x0029 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0027;
    L_0x0025:
        r6.f49306k = r0;	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r6);
        return r7;
    L_0x0029:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.c.c(java.lang.String):boolean");
    }

    /* renamed from: a */
    boolean m60209a(C15913b c15913b) throws IOException {
        if (c15913b.f49287f != null) {
            c15913b.f49287f.m60189a();
        }
        for (int i = 0; i < this.f49299d; i++) {
            this.f49297b.delete(c15913b.f49284c[i]);
            this.f49313s -= c15913b.f49283b[i];
            c15913b.f49283b[i] = 0;
        }
        this.f49302g++;
        this.f49300e.writeUtf8("REMOVE").writeByte(32).writeUtf8(c15913b.f49282a).writeByte(10);
        this.f49301f.remove(c15913b.f49282a);
        if (m60212c() != null) {
            this.f49315u.execute(this.f49316v);
        }
        return f49296m;
    }

    /* renamed from: d */
    public synchronized boolean m60214d() {
        return this.f49305j;
    }

    /* renamed from: k */
    private synchronized void m60204k() {
        if (m60214d()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f49304i) {
            m60204k();
            m60215e();
            this.f49300e.flush();
        }
    }

    public synchronized void close() throws IOException {
        if (this.f49304i) {
            if (!this.f49305j) {
                for (C15913b c15913b : (C15913b[]) this.f49301f.values().toArray(new C15913b[this.f49301f.size()])) {
                    if (c15913b.f49287f != null) {
                        c15913b.f49287f.m60191c();
                    }
                }
                m60215e();
                this.f49300e.close();
                this.f49300e = null;
                this.f49305j = f49296m;
                return;
            }
        }
        this.f49305j = f49296m;
    }

    /* renamed from: e */
    void m60215e() throws IOException {
        while (this.f49313s > this.f49312r) {
            m60209a((C15913b) this.f49301f.values().iterator().next());
        }
        this.f49306k = false;
    }

    /* renamed from: f */
    public void m60216f() throws IOException {
        close();
        this.f49297b.deleteContents(this.f49298c);
    }

    /* renamed from: g */
    public synchronized void m60217g() throws IOException {
        m60207a();
        for (C15913b a : (C15913b[]) this.f49301f.values().toArray(new C15913b[this.f49301f.size()])) {
            m60209a(a);
        }
        this.f49306k = false;
    }

    /* renamed from: e */
    private void m60200e(String str) {
        if (!f49295a.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
