package com.squareup.okhttp.internal;

import com.squareup.okhttp.internal.io.FileSystem;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okio.BufferedSink;
import okio.C15976k;
import okio.C15982q;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.b */
public final class C6020b implements Closeable {
    /* renamed from: a */
    static final Pattern f22019a = Pattern.compile("[a-z0-9_-]{1,120}");
    /* renamed from: b */
    static final /* synthetic */ boolean f22020b = true;
    /* renamed from: u */
    private static final Sink f22021u = new C72113();
    /* renamed from: c */
    private final FileSystem f22022c;
    /* renamed from: d */
    private final File f22023d;
    /* renamed from: e */
    private final File f22024e;
    /* renamed from: f */
    private final File f22025f;
    /* renamed from: g */
    private final File f22026g;
    /* renamed from: h */
    private final int f22027h;
    /* renamed from: i */
    private long f22028i;
    /* renamed from: j */
    private final int f22029j;
    /* renamed from: k */
    private long f22030k = 0;
    /* renamed from: l */
    private BufferedSink f22031l;
    /* renamed from: m */
    private final LinkedHashMap<String, C6018b> f22032m = new LinkedHashMap(0, 0.75f, f22020b);
    /* renamed from: n */
    private int f22033n;
    /* renamed from: o */
    private boolean f22034o;
    /* renamed from: p */
    private boolean f22035p;
    /* renamed from: q */
    private boolean f22036q;
    /* renamed from: r */
    private long f22037r = 0;
    /* renamed from: s */
    private final Executor f22038s;
    /* renamed from: t */
    private final Runnable f22039t = new C60161(this);

    /* renamed from: com.squareup.okhttp.internal.b$1 */
    class C60161 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C6020b f22000a;

        C60161(C6020b c6020b) {
            this.f22000a = c6020b;
        }

        public void run() {
            synchronized (this.f22000a) {
                if (((this.f22000a.f22035p ^ 1) | this.f22000a.f22036q) != 0) {
                    return;
                }
                try {
                    this.f22000a.m25941l();
                    if (this.f22000a.m25939j()) {
                        this.f22000a.m25938i();
                        this.f22000a.f22033n = 0;
                    }
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.b$a */
    public final class C6017a {
        /* renamed from: a */
        final /* synthetic */ C6020b f22001a;
        /* renamed from: b */
        private final C6018b f22002b;
        /* renamed from: c */
        private final boolean[] f22003c;
        /* renamed from: d */
        private boolean f22004d;
        /* renamed from: e */
        private boolean f22005e;

        private C6017a(C6020b c6020b, C6018b c6018b) {
            this.f22001a = c6020b;
            this.f22002b = c6018b;
            this.f22003c = c6018b.f22011f != null ? null : new boolean[c6020b.f22029j];
        }

        /* renamed from: a */
        public okio.Sink m25895a(int r4) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.f22001a;
            monitor-enter(r0);
            r1 = r3.f22002b;	 Catch:{ all -> 0x003d }
            r1 = r1.f22012g;	 Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x0011;	 Catch:{ all -> 0x003d }
        L_0x000b:
            r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003d }
            r4.<init>();	 Catch:{ all -> 0x003d }
            throw r4;	 Catch:{ all -> 0x003d }
        L_0x0011:
            r1 = r3.f22002b;	 Catch:{ all -> 0x003d }
            r1 = r1.f22011f;	 Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x001e;	 Catch:{ all -> 0x003d }
        L_0x0019:
            r1 = r3.f22003c;	 Catch:{ all -> 0x003d }
            r2 = 1;	 Catch:{ all -> 0x003d }
            r1[r4] = r2;	 Catch:{ all -> 0x003d }
        L_0x001e:
            r1 = r3.f22002b;	 Catch:{ all -> 0x003d }
            r1 = r1.f22010e;	 Catch:{ all -> 0x003d }
            r4 = r1[r4];	 Catch:{ all -> 0x003d }
            r1 = r3.f22001a;	 Catch:{ FileNotFoundException -> 0x0037 }
            r1 = r1.f22022c;	 Catch:{ FileNotFoundException -> 0x0037 }
            r4 = r1.sink(r4);	 Catch:{ FileNotFoundException -> 0x0037 }
            r1 = new com.squareup.okhttp.internal.b$a$1;	 Catch:{ all -> 0x003d }
            r1.<init>(r3, r4);	 Catch:{ all -> 0x003d }
            monitor-exit(r0);	 Catch:{ all -> 0x003d }
            return r1;	 Catch:{ all -> 0x003d }
        L_0x0037:
            r4 = com.squareup.okhttp.internal.C6020b.f22021u;	 Catch:{ all -> 0x003d }
            monitor-exit(r0);	 Catch:{ all -> 0x003d }
            return r4;	 Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception;	 Catch:{ all -> 0x003d }
            monitor-exit(r0);	 Catch:{ all -> 0x003d }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.a.a(int):okio.Sink");
        }

        /* renamed from: a */
        public void m25896a() throws IOException {
            synchronized (this.f22001a) {
                if (this.f22004d) {
                    this.f22001a.m25919a(this, false);
                    this.f22001a.m25921a(this.f22002b);
                } else {
                    this.f22001a.m25919a(this, (boolean) C6020b.f22020b);
                }
                this.f22005e = C6020b.f22020b;
            }
        }

        /* renamed from: b */
        public void m25897b() throws IOException {
            synchronized (this.f22001a) {
                this.f22001a.m25919a(this, false);
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.b$b */
    private final class C6018b {
        /* renamed from: a */
        final /* synthetic */ C6020b f22006a;
        /* renamed from: b */
        private final String f22007b;
        /* renamed from: c */
        private final long[] f22008c;
        /* renamed from: d */
        private final File[] f22009d;
        /* renamed from: e */
        private final File[] f22010e;
        /* renamed from: f */
        private boolean f22011f;
        /* renamed from: g */
        private C6017a f22012g;
        /* renamed from: h */
        private long f22013h;

        private C6018b(C6020b c6020b, String str) {
            this.f22006a = c6020b;
            this.f22007b = str;
            this.f22008c = new long[c6020b.f22029j];
            this.f22009d = new File[c6020b.f22029j];
            this.f22010e = new File[c6020b.f22029j];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            str = stringBuilder.length();
            for (int i = 0; i < c6020b.f22029j; i++) {
                stringBuilder.append(i);
                this.f22009d[i] = new File(c6020b.f22023d, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.f22010e[i] = new File(c6020b.f22023d, stringBuilder.toString());
                stringBuilder.setLength(str);
            }
        }

        /* renamed from: a */
        private void m25902a(java.lang.String[] r5) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r5.length;
            r1 = r4.f22006a;
            r1 = r1.f22029j;
            if (r0 == r1) goto L_0x000e;
        L_0x0009:
            r5 = r4.m25904b(r5);
            throw r5;
        L_0x000e:
            r0 = 0;
        L_0x000f:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x0020 }
            if (r0 >= r1) goto L_0x001f;	 Catch:{ NumberFormatException -> 0x0020 }
        L_0x0012:
            r1 = r4.f22008c;	 Catch:{ NumberFormatException -> 0x0020 }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x0020 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0020 }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x0020 }
            r0 = r0 + 1;
            goto L_0x000f;
        L_0x001f:
            return;
        L_0x0020:
            r5 = r4.m25904b(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.b.a(java.lang.String[]):void");
        }

        /* renamed from: a */
        void m25912a(BufferedSink bufferedSink) throws IOException {
            for (long writeDecimalLong : this.f22008c) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }

        /* renamed from: b */
        private IOException m25904b(String[] strArr) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: a */
        com.squareup.okhttp.internal.C6020b.C6019c m25911a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r11 = this;
            r0 = r11.f22006a;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 != 0) goto L_0x000e;
        L_0x0008:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x000e:
            r0 = r11.f22006a;
            r0 = r0.f22029j;
            r0 = new okio.Source[r0];
            r1 = r11.f22008c;
            r1 = r1.clone();
            r7 = r1;
            r7 = (long[]) r7;
            r9 = 0;
            r1 = 0;
        L_0x0021:
            r2 = r11.f22006a;	 Catch:{ FileNotFoundException -> 0x004b }
            r2 = r2.f22029j;	 Catch:{ FileNotFoundException -> 0x004b }
            if (r1 >= r2) goto L_0x003c;	 Catch:{ FileNotFoundException -> 0x004b }
        L_0x0029:
            r2 = r11.f22006a;	 Catch:{ FileNotFoundException -> 0x004b }
            r2 = r2.f22022c;	 Catch:{ FileNotFoundException -> 0x004b }
            r3 = r11.f22009d;	 Catch:{ FileNotFoundException -> 0x004b }
            r3 = r3[r1];	 Catch:{ FileNotFoundException -> 0x004b }
            r2 = r2.source(r3);	 Catch:{ FileNotFoundException -> 0x004b }
            r0[r1] = r2;	 Catch:{ FileNotFoundException -> 0x004b }
            r1 = r1 + 1;	 Catch:{ FileNotFoundException -> 0x004b }
            goto L_0x0021;	 Catch:{ FileNotFoundException -> 0x004b }
        L_0x003c:
            r10 = new com.squareup.okhttp.internal.b$c;	 Catch:{ FileNotFoundException -> 0x004b }
            r2 = r11.f22006a;	 Catch:{ FileNotFoundException -> 0x004b }
            r3 = r11.f22007b;	 Catch:{ FileNotFoundException -> 0x004b }
            r4 = r11.f22013h;	 Catch:{ FileNotFoundException -> 0x004b }
            r8 = 0;	 Catch:{ FileNotFoundException -> 0x004b }
            r1 = r10;	 Catch:{ FileNotFoundException -> 0x004b }
            r6 = r0;	 Catch:{ FileNotFoundException -> 0x004b }
            r1.<init>(r3, r4, r6, r7);	 Catch:{ FileNotFoundException -> 0x004b }
            return r10;
        L_0x004b:
            r1 = r11.f22006a;
            r1 = r1.f22029j;
            if (r9 >= r1) goto L_0x005f;
        L_0x0053:
            r1 = r0[r9];
            if (r1 == 0) goto L_0x005f;
        L_0x0057:
            r1 = r0[r9];
            com.squareup.okhttp.internal.C6058i.m26247a(r1);
            r9 = r9 + 1;
            goto L_0x004b;
        L_0x005f:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.b.a():com.squareup.okhttp.internal.b$c");
        }
    }

    /* renamed from: com.squareup.okhttp.internal.b$c */
    public final class C6019c implements Closeable {
        /* renamed from: a */
        final /* synthetic */ C6020b f22014a;
        /* renamed from: b */
        private final String f22015b;
        /* renamed from: c */
        private final long f22016c;
        /* renamed from: d */
        private final Source[] f22017d;
        /* renamed from: e */
        private final long[] f22018e;

        private C6019c(C6020b c6020b, String str, long j, Source[] sourceArr, long[] jArr) {
            this.f22014a = c6020b;
            this.f22015b = str;
            this.f22016c = j;
            this.f22017d = sourceArr;
            this.f22018e = jArr;
        }

        /* renamed from: a */
        public C6017a m25913a() throws IOException {
            return this.f22014a.m25917a(this.f22015b, this.f22016c);
        }

        /* renamed from: a */
        public Source m25914a(int i) {
            return this.f22017d[i];
        }

        public void close() {
            for (Closeable a : this.f22017d) {
                C6058i.m26247a(a);
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.b$3 */
    static class C72113 implements Sink {
        public void close() throws IOException {
        }

        public void flush() throws IOException {
        }

        C72113() {
        }

        public void write(C18549c c18549c, long j) throws IOException {
            c18549c.skip(j);
        }

        public C15982q timeout() {
            return C15982q.f49620c;
        }
    }

    C6020b(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.f22022c = fileSystem;
        this.f22023d = file;
        this.f22027h = i;
        this.f22024e = new File(file, "journal");
        this.f22025f = new File(file, "journal.tmp");
        this.f22026g = new File(file, "journal.bkp");
        this.f22029j = i2;
        this.f22028i = j;
        this.f22038s = executor;
    }

    /* renamed from: a */
    public synchronized void m25943a() throws IOException {
        if (!f22020b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.f22035p) {
            if (this.f22022c.exists(this.f22026g)) {
                if (this.f22022c.exists(this.f22024e)) {
                    this.f22022c.delete(this.f22026g);
                } else {
                    this.f22022c.rename(this.f22026g, this.f22024e);
                }
            }
            if (this.f22022c.exists(this.f22024e)) {
                try {
                    m25933f();
                    m25937h();
                    this.f22035p = f22020b;
                    return;
                } catch (IOException e) {
                    C6040g a = C6040g.m26108a();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(this.f22023d);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    a.m26111a(stringBuilder.toString());
                    m25946c();
                    this.f22036q = false;
                }
            }
            m25938i();
            this.f22035p = f22020b;
        }
    }

    /* renamed from: a */
    public static C6020b m25918a(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        } else {
            return new C6020b(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C6058i.m26244a("OkHttp DiskLruCache", (boolean) f22020b)));
        }
    }

    /* renamed from: f */
    private void m25933f() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8.f22022c;
        r1 = r8.f22024e;
        r0 = r0.source(r1);
        r0 = okio.C15976k.a(r0);
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
        r6 = r8.f22027h;	 Catch:{ all -> 0x00ad }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00ad }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x00ad }
        if (r3 == 0) goto L_0x0079;	 Catch:{ all -> 0x00ad }
    L_0x003c:
        r3 = r8.f22029j;	 Catch:{ all -> 0x00ad }
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
        r8.m25927d(r2);	 Catch:{ EOFException -> 0x005c }
        r1 = r1 + 1;
        goto L_0x0052;
    L_0x005c:
        r2 = r8.f22032m;	 Catch:{ all -> 0x00ad }
        r2 = r2.size();	 Catch:{ all -> 0x00ad }
        r1 = r1 - r2;	 Catch:{ all -> 0x00ad }
        r8.f22033n = r1;	 Catch:{ all -> 0x00ad }
        r1 = r0.exhausted();	 Catch:{ all -> 0x00ad }
        if (r1 != 0) goto L_0x006f;	 Catch:{ all -> 0x00ad }
    L_0x006b:
        r8.m25938i();	 Catch:{ all -> 0x00ad }
        goto L_0x0075;	 Catch:{ all -> 0x00ad }
    L_0x006f:
        r1 = r8.m25935g();	 Catch:{ all -> 0x00ad }
        r8.f22031l = r1;	 Catch:{ all -> 0x00ad }
    L_0x0075:
        com.squareup.okhttp.internal.C6058i.m26247a(r0);
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
        com.squareup.okhttp.internal.C6058i.m26247a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.f():void");
    }

    /* renamed from: g */
    private BufferedSink m25935g() throws FileNotFoundException {
        return C15976k.a(new C7944c(this, this.f22022c.appendingSink(this.f22024e)) {
            /* renamed from: a */
            static final /* synthetic */ boolean f29099a = true;
            /* renamed from: b */
            final /* synthetic */ C6020b f29100b;

            static {
                Class cls = C6020b.class;
            }

            /* renamed from: a */
            protected void mo7612a(IOException iOException) {
                if (f29099a == null && Thread.holdsLock(this.f29100b) == null) {
                    throw new AssertionError();
                }
                this.f29100b.f22034o = f29099a;
            }
        });
    }

    /* renamed from: d */
    private void m25927d(String str) throws IOException {
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
                this.f22032m.remove(substring);
                return;
            }
        }
        substring = str.substring(i, indexOf2);
        C6018b c6018b = (C6018b) this.f22032m.get(substring);
        if (c6018b == null) {
            c6018b = new C6018b(substring);
            this.f22032m.put(substring, c6018b);
        }
        if (indexOf2 != -1 && indexOf == "CLEAN".length() && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            c6018b.f22011f = f22020b;
            c6018b.f22012g = null;
            c6018b.m25902a(split);
        } else if (indexOf2 == -1 && indexOf == "DIRTY".length() && str.startsWith("DIRTY")) {
            c6018b.f22012g = new C6017a(c6018b);
        } else if (!(indexOf2 == -1 && indexOf == "READ".length() && str.startsWith("READ"))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: h */
    private void m25937h() throws IOException {
        this.f22022c.delete(this.f22025f);
        Iterator it = this.f22032m.values().iterator();
        while (it.hasNext()) {
            C6018b c6018b = (C6018b) it.next();
            int i = 0;
            if (c6018b.f22012g == null) {
                while (i < this.f22029j) {
                    this.f22030k += c6018b.f22008c[i];
                    i++;
                }
            } else {
                c6018b.f22012g = null;
                while (i < this.f22029j) {
                    this.f22022c.delete(c6018b.f22009d[i]);
                    this.f22022c.delete(c6018b.f22010e[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: i */
    private synchronized void m25938i() throws IOException {
        if (this.f22031l != null) {
            this.f22031l.close();
        }
        BufferedSink a = C15976k.a(this.f22022c.sink(this.f22025f));
        try {
            a.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
            a.writeUtf8("1").writeByte(10);
            a.writeDecimalLong((long) this.f22027h).writeByte(10);
            a.writeDecimalLong((long) this.f22029j).writeByte(10);
            a.writeByte(10);
            for (C6018b c6018b : this.f22032m.values()) {
                if (c6018b.f22012g != null) {
                    a.writeUtf8("DIRTY").writeByte(32);
                    a.writeUtf8(c6018b.f22007b);
                    a.writeByte(10);
                } else {
                    a.writeUtf8("CLEAN").writeByte(32);
                    a.writeUtf8(c6018b.f22007b);
                    c6018b.m25912a(a);
                    a.writeByte(10);
                }
            }
            if (this.f22022c.exists(this.f22024e)) {
                this.f22022c.rename(this.f22024e, this.f22026g);
            }
            this.f22022c.rename(this.f22025f, this.f22024e);
            this.f22022c.delete(this.f22026g);
            this.f22031l = m25935g();
            this.f22034o = false;
        } finally {
            a.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized com.squareup.okhttp.internal.C6020b.C6019c m25942a(java.lang.String r4) throws java.io.IOException {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.m25943a();	 Catch:{ all -> 0x0052 }
        r3.m25940k();	 Catch:{ all -> 0x0052 }
        r3.m25931e(r4);	 Catch:{ all -> 0x0052 }
        r0 = r3.f22032m;	 Catch:{ all -> 0x0052 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0052 }
        r0 = (com.squareup.okhttp.internal.C6020b.C6018b) r0;	 Catch:{ all -> 0x0052 }
        r1 = 0;
        if (r0 == 0) goto L_0x0050;
    L_0x0015:
        r2 = r0.f22011f;	 Catch:{ all -> 0x0052 }
        if (r2 != 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0050;
    L_0x001c:
        r0 = r0.m25911a();	 Catch:{ all -> 0x0052 }
        if (r0 != 0) goto L_0x0024;
    L_0x0022:
        monitor-exit(r3);
        return r1;
    L_0x0024:
        r1 = r3.f22033n;	 Catch:{ all -> 0x0052 }
        r1 = r1 + 1;
        r3.f22033n = r1;	 Catch:{ all -> 0x0052 }
        r1 = r3.f22031l;	 Catch:{ all -> 0x0052 }
        r2 = "READ";
        r1 = r1.writeUtf8(r2);	 Catch:{ all -> 0x0052 }
        r2 = 32;
        r1 = r1.writeByte(r2);	 Catch:{ all -> 0x0052 }
        r4 = r1.writeUtf8(r4);	 Catch:{ all -> 0x0052 }
        r1 = 10;
        r4.writeByte(r1);	 Catch:{ all -> 0x0052 }
        r4 = r3.m25939j();	 Catch:{ all -> 0x0052 }
        if (r4 == 0) goto L_0x004e;
    L_0x0047:
        r4 = r3.f22038s;	 Catch:{ all -> 0x0052 }
        r1 = r3.f22039t;	 Catch:{ all -> 0x0052 }
        r4.execute(r1);	 Catch:{ all -> 0x0052 }
    L_0x004e:
        monitor-exit(r3);
        return r0;
    L_0x0050:
        monitor-exit(r3);
        return r1;
    L_0x0052:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.a(java.lang.String):com.squareup.okhttp.internal.b$c");
    }

    /* renamed from: b */
    public C6017a m25944b(String str) throws IOException {
        return m25917a(str, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized com.squareup.okhttp.internal.C6020b.C6017a m25917a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.m25943a();	 Catch:{ all -> 0x0067 }
        r5.m25940k();	 Catch:{ all -> 0x0067 }
        r5.m25931e(r6);	 Catch:{ all -> 0x0067 }
        r0 = r5.f22032m;	 Catch:{ all -> 0x0067 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0067 }
        r0 = (com.squareup.okhttp.internal.C6020b.C6018b) r0;	 Catch:{ all -> 0x0067 }
        r1 = -1;
        r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        r1 = 0;
        if (r3 == 0) goto L_0x0025;
    L_0x0019:
        if (r0 == 0) goto L_0x0023;
    L_0x001b:
        r2 = r0.f22013h;	 Catch:{ all -> 0x0067 }
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0025;
    L_0x0023:
        monitor-exit(r5);
        return r1;
    L_0x0025:
        if (r0 == 0) goto L_0x002f;
    L_0x0027:
        r7 = r0.f22012g;	 Catch:{ all -> 0x0067 }
        if (r7 == 0) goto L_0x002f;
    L_0x002d:
        monitor-exit(r5);
        return r1;
    L_0x002f:
        r7 = r5.f22031l;	 Catch:{ all -> 0x0067 }
        r8 = "DIRTY";
        r7 = r7.writeUtf8(r8);	 Catch:{ all -> 0x0067 }
        r8 = 32;
        r7 = r7.writeByte(r8);	 Catch:{ all -> 0x0067 }
        r7 = r7.writeUtf8(r6);	 Catch:{ all -> 0x0067 }
        r8 = 10;
        r7.writeByte(r8);	 Catch:{ all -> 0x0067 }
        r7 = r5.f22031l;	 Catch:{ all -> 0x0067 }
        r7.flush();	 Catch:{ all -> 0x0067 }
        r7 = r5.f22034o;	 Catch:{ all -> 0x0067 }
        if (r7 == 0) goto L_0x0051;
    L_0x004f:
        monitor-exit(r5);
        return r1;
    L_0x0051:
        if (r0 != 0) goto L_0x005d;
    L_0x0053:
        r0 = new com.squareup.okhttp.internal.b$b;	 Catch:{ all -> 0x0067 }
        r0.<init>(r6);	 Catch:{ all -> 0x0067 }
        r7 = r5.f22032m;	 Catch:{ all -> 0x0067 }
        r7.put(r6, r0);	 Catch:{ all -> 0x0067 }
    L_0x005d:
        r6 = new com.squareup.okhttp.internal.b$a;	 Catch:{ all -> 0x0067 }
        r6.<init>(r0);	 Catch:{ all -> 0x0067 }
        r0.f22012g = r6;	 Catch:{ all -> 0x0067 }
        monitor-exit(r5);
        return r6;
    L_0x0067:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.a(java.lang.String, long):com.squareup.okhttp.internal.b$a");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized void m25919a(com.squareup.okhttp.internal.C6020b.C6017a r12, boolean r13) throws java.io.IOException {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r12.f22002b;	 Catch:{ all -> 0x011c }
        r1 = r0.f22012g;	 Catch:{ all -> 0x011c }
        if (r1 == r12) goto L_0x0011;
    L_0x000b:
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011c }
        r12.<init>();	 Catch:{ all -> 0x011c }
        throw r12;	 Catch:{ all -> 0x011c }
    L_0x0011:
        r1 = 0;
        if (r13 == 0) goto L_0x0057;
    L_0x0014:
        r2 = r0.f22011f;	 Catch:{ all -> 0x011c }
        if (r2 != 0) goto L_0x0057;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r3 = r11.f22029j;	 Catch:{ all -> 0x011c }
        if (r2 >= r3) goto L_0x0057;
    L_0x001f:
        r3 = r12.f22003c;	 Catch:{ all -> 0x011c }
        r3 = r3[r2];	 Catch:{ all -> 0x011c }
        if (r3 != 0) goto L_0x0041;
    L_0x0027:
        r12.m25897b();	 Catch:{ all -> 0x011c }
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x011c }
        r13 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011c }
        r13.<init>();	 Catch:{ all -> 0x011c }
        r0 = "Newly created entry didn't create value for index ";
        r13.append(r0);	 Catch:{ all -> 0x011c }
        r13.append(r2);	 Catch:{ all -> 0x011c }
        r13 = r13.toString();	 Catch:{ all -> 0x011c }
        r12.<init>(r13);	 Catch:{ all -> 0x011c }
        throw r12;	 Catch:{ all -> 0x011c }
    L_0x0041:
        r3 = r11.f22022c;	 Catch:{ all -> 0x011c }
        r4 = r0.f22010e;	 Catch:{ all -> 0x011c }
        r4 = r4[r2];	 Catch:{ all -> 0x011c }
        r3 = r3.exists(r4);	 Catch:{ all -> 0x011c }
        if (r3 != 0) goto L_0x0054;
    L_0x004f:
        r12.m25897b();	 Catch:{ all -> 0x011c }
        monitor-exit(r11);
        return;
    L_0x0054:
        r2 = r2 + 1;
        goto L_0x001b;
    L_0x0057:
        r12 = r11.f22029j;	 Catch:{ all -> 0x011c }
        if (r1 >= r12) goto L_0x009a;
    L_0x005b:
        r12 = r0.f22010e;	 Catch:{ all -> 0x011c }
        r12 = r12[r1];	 Catch:{ all -> 0x011c }
        if (r13 == 0) goto L_0x0092;
    L_0x0063:
        r2 = r11.f22022c;	 Catch:{ all -> 0x011c }
        r2 = r2.exists(r12);	 Catch:{ all -> 0x011c }
        if (r2 == 0) goto L_0x0097;
    L_0x006b:
        r2 = r0.f22009d;	 Catch:{ all -> 0x011c }
        r2 = r2[r1];	 Catch:{ all -> 0x011c }
        r3 = r11.f22022c;	 Catch:{ all -> 0x011c }
        r3.rename(r12, r2);	 Catch:{ all -> 0x011c }
        r12 = r0.f22008c;	 Catch:{ all -> 0x011c }
        r3 = r12[r1];	 Catch:{ all -> 0x011c }
        r12 = r11.f22022c;	 Catch:{ all -> 0x011c }
        r5 = r12.size(r2);	 Catch:{ all -> 0x011c }
        r12 = r0.f22008c;	 Catch:{ all -> 0x011c }
        r12[r1] = r5;	 Catch:{ all -> 0x011c }
        r7 = r11.f22030k;	 Catch:{ all -> 0x011c }
        r12 = 0;
        r9 = r7 - r3;
        r2 = r9 + r5;
        r11.f22030k = r2;	 Catch:{ all -> 0x011c }
        goto L_0x0097;
    L_0x0092:
        r2 = r11.f22022c;	 Catch:{ all -> 0x011c }
        r2.delete(r12);	 Catch:{ all -> 0x011c }
    L_0x0097:
        r1 = r1 + 1;
        goto L_0x0057;
    L_0x009a:
        r12 = r11.f22033n;	 Catch:{ all -> 0x011c }
        r1 = 1;
        r12 = r12 + r1;
        r11.f22033n = r12;	 Catch:{ all -> 0x011c }
        r12 = 0;
        r0.f22012g = r12;	 Catch:{ all -> 0x011c }
        r12 = r0.f22011f;	 Catch:{ all -> 0x011c }
        r12 = r12 | r13;
        r2 = 10;
        r3 = 32;
        if (r12 == 0) goto L_0x00de;
    L_0x00af:
        r0.f22011f = r1;	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r1 = "CLEAN";
        r12 = r12.writeUtf8(r1);	 Catch:{ all -> 0x011c }
        r12.writeByte(r3);	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r1 = r0.f22007b;	 Catch:{ all -> 0x011c }
        r12.writeUtf8(r1);	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r0.m25912a(r12);	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r12.writeByte(r2);	 Catch:{ all -> 0x011c }
        if (r13 == 0) goto L_0x0100;
    L_0x00d2:
        r12 = r11.f22037r;	 Catch:{ all -> 0x011c }
        r1 = 1;
        r3 = r12 + r1;
        r11.f22037r = r3;	 Catch:{ all -> 0x011c }
        r0.f22013h = r12;	 Catch:{ all -> 0x011c }
        goto L_0x0100;
    L_0x00de:
        r12 = r11.f22032m;	 Catch:{ all -> 0x011c }
        r13 = r0.f22007b;	 Catch:{ all -> 0x011c }
        r12.remove(r13);	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r13 = "REMOVE";
        r12 = r12.writeUtf8(r13);	 Catch:{ all -> 0x011c }
        r12.writeByte(r3);	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r13 = r0.f22007b;	 Catch:{ all -> 0x011c }
        r12.writeUtf8(r13);	 Catch:{ all -> 0x011c }
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r12.writeByte(r2);	 Catch:{ all -> 0x011c }
    L_0x0100:
        r12 = r11.f22031l;	 Catch:{ all -> 0x011c }
        r12.flush();	 Catch:{ all -> 0x011c }
        r12 = r11.f22030k;	 Catch:{ all -> 0x011c }
        r0 = r11.f22028i;	 Catch:{ all -> 0x011c }
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0113;
    L_0x010d:
        r12 = r11.m25939j();	 Catch:{ all -> 0x011c }
        if (r12 == 0) goto L_0x011a;
    L_0x0113:
        r12 = r11.f22038s;	 Catch:{ all -> 0x011c }
        r13 = r11.f22039t;	 Catch:{ all -> 0x011c }
        r12.execute(r13);	 Catch:{ all -> 0x011c }
    L_0x011a:
        monitor-exit(r11);
        return;
    L_0x011c:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.b.a(com.squareup.okhttp.internal.b$a, boolean):void");
    }

    /* renamed from: j */
    private boolean m25939j() {
        return (this.f22033n < 2000 || this.f22033n < this.f22032m.size()) ? false : f22020b;
    }

    /* renamed from: c */
    public synchronized boolean m25947c(String str) throws IOException {
        m25943a();
        m25940k();
        m25931e(str);
        C6018b c6018b = (C6018b) this.f22032m.get(str);
        if (c6018b == null) {
            return null;
        }
        return m25921a(c6018b);
    }

    /* renamed from: a */
    private boolean m25921a(C6018b c6018b) throws IOException {
        if (c6018b.f22012g != null) {
            c6018b.f22012g.f22004d = f22020b;
        }
        for (int i = 0; i < this.f22029j; i++) {
            this.f22022c.delete(c6018b.f22009d[i]);
            this.f22030k -= c6018b.f22008c[i];
            c6018b.f22008c[i] = 0;
        }
        this.f22033n++;
        this.f22031l.writeUtf8("REMOVE").writeByte(32).writeUtf8(c6018b.f22007b).writeByte(10);
        this.f22032m.remove(c6018b.f22007b);
        if (m25939j() != null) {
            this.f22038s.execute(this.f22039t);
        }
        return f22020b;
    }

    /* renamed from: b */
    public synchronized boolean m25945b() {
        return this.f22036q;
    }

    /* renamed from: k */
    private synchronized void m25940k() {
        if (m25945b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() throws IOException {
        if (this.f22035p) {
            if (!this.f22036q) {
                for (C6018b c6018b : (C6018b[]) this.f22032m.values().toArray(new C6018b[this.f22032m.size()])) {
                    if (c6018b.f22012g != null) {
                        c6018b.f22012g.m25897b();
                    }
                }
                m25941l();
                this.f22031l.close();
                this.f22031l = null;
                this.f22036q = f22020b;
                return;
            }
        }
        this.f22036q = f22020b;
    }

    /* renamed from: l */
    private void m25941l() throws IOException {
        while (this.f22030k > this.f22028i) {
            m25921a((C6018b) this.f22032m.values().iterator().next());
        }
    }

    /* renamed from: c */
    public void m25946c() throws IOException {
        close();
        this.f22022c.deleteContents(this.f22023d);
    }

    /* renamed from: d */
    public synchronized void m25948d() throws IOException {
        m25943a();
        for (C6018b a : (C6018b[]) this.f22032m.values().toArray(new C6018b[this.f22032m.size()])) {
            m25921a(a);
        }
    }

    /* renamed from: e */
    private void m25931e(String str) {
        if (!f22019a.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
