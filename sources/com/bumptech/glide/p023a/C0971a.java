package com.bumptech.glide.p023a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.a.a */
public final class C0971a implements Closeable {
    /* renamed from: a */
    final ThreadPoolExecutor f2589a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* renamed from: b */
    private final File f2590b;
    /* renamed from: c */
    private final File f2591c;
    /* renamed from: d */
    private final File f2592d;
    /* renamed from: e */
    private final File f2593e;
    /* renamed from: f */
    private final int f2594f;
    /* renamed from: g */
    private long f2595g;
    /* renamed from: h */
    private final int f2596h;
    /* renamed from: i */
    private long f2597i = 0;
    /* renamed from: j */
    private Writer f2598j;
    /* renamed from: k */
    private final LinkedHashMap<String, C0969b> f2599k = new LinkedHashMap(0, 0.75f, true);
    /* renamed from: l */
    private int f2600l;
    /* renamed from: m */
    private long f2601m = 0;
    /* renamed from: n */
    private final Callable<Void> f2602n = new C09671(this);

    /* renamed from: com.bumptech.glide.a.a$1 */
    class C09671 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ C0971a f2571a;

        C09671(C0971a c0971a) {
            this.f2571a = c0971a;
        }

        public /* synthetic */ Object call() throws Exception {
            return m3295a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public java.lang.Void m3295a() throws java.lang.Exception {
            /*
            r4 = this;
            r0 = r4.f2571a;
            monitor-enter(r0);
            r1 = r4.f2571a;	 Catch:{ all -> 0x0028 }
            r1 = r1.f2598j;	 Catch:{ all -> 0x0028 }
            r2 = 0;
            if (r1 != 0) goto L_0x000e;
        L_0x000c:
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return r2;
        L_0x000e:
            r1 = r4.f2571a;	 Catch:{ all -> 0x0028 }
            r1.m3336g();	 Catch:{ all -> 0x0028 }
            r1 = r4.f2571a;	 Catch:{ all -> 0x0028 }
            r1 = r1.m3333e();	 Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026;
        L_0x001b:
            r1 = r4.f2571a;	 Catch:{ all -> 0x0028 }
            r1.m3329d();	 Catch:{ all -> 0x0028 }
            r1 = r4.f2571a;	 Catch:{ all -> 0x0028 }
            r3 = 0;
            r1.f2600l = r3;	 Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            return r2;
        L_0x0028:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0028 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.1.a():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.a.a$a */
    public final class C0968a {
        /* renamed from: a */
        final /* synthetic */ C0971a f2572a;
        /* renamed from: b */
        private final C0969b f2573b;
        /* renamed from: c */
        private final boolean[] f2574c;
        /* renamed from: d */
        private boolean f2575d;

        private C0968a(C0971a c0971a, C0969b c0969b) {
            this.f2572a = c0971a;
            this.f2573b = c0969b;
            this.f2574c = c0969b.f2581f != null ? null : new boolean[c0971a.f2596h];
        }

        /* renamed from: a */
        public File m3298a(int i) throws IOException {
            synchronized (this.f2572a) {
                if (this.f2573b.f2582g != this) {
                    throw new IllegalStateException();
                }
                if (!this.f2573b.f2581f) {
                    this.f2574c[i] = true;
                }
                i = this.f2573b.m3315b(i);
                if (!this.f2572a.f2590b.exists()) {
                    this.f2572a.f2590b.mkdirs();
                }
            }
            return i;
        }

        /* renamed from: a */
        public void m3299a() throws IOException {
            this.f2572a.m3321a(this, true);
            this.f2575d = true;
        }

        /* renamed from: b */
        public void m3300b() throws IOException {
            this.f2572a.m3321a(this, false);
        }

        /* renamed from: c */
        public void m3301c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f2575d;
            if (r0 != 0) goto L_0x0007;
        L_0x0004:
            r1.m3300b();	 Catch:{ IOException -> 0x0007 }
        L_0x0007:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.a.c():void");
        }
    }

    /* renamed from: com.bumptech.glide.a.a$b */
    private final class C0969b {
        /* renamed from: a */
        File[] f2576a;
        /* renamed from: b */
        File[] f2577b;
        /* renamed from: c */
        final /* synthetic */ C0971a f2578c;
        /* renamed from: d */
        private final String f2579d;
        /* renamed from: e */
        private final long[] f2580e;
        /* renamed from: f */
        private boolean f2581f;
        /* renamed from: g */
        private C0968a f2582g;
        /* renamed from: h */
        private long f2583h;

        private C0969b(C0971a c0971a, String str) {
            this.f2578c = c0971a;
            this.f2579d = str;
            this.f2580e = new long[c0971a.f2596h];
            this.f2576a = new File[c0971a.f2596h];
            this.f2577b = new File[c0971a.f2596h];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            str = stringBuilder.length();
            for (int i = 0; i < c0971a.f2596h; i++) {
                stringBuilder.append(i);
                this.f2576a[i] = new File(c0971a.f2590b, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.f2577b[i] = new File(c0971a.f2590b, stringBuilder.toString());
                stringBuilder.setLength(str);
            }
        }

        /* renamed from: a */
        public String m3314a() throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            for (long j : this.f2580e) {
                stringBuilder.append(' ');
                stringBuilder.append(j);
            }
            return stringBuilder.toString();
        }

        /* renamed from: a */
        private void m3306a(java.lang.String[] r5) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r5.length;
            r1 = r4.f2578c;
            r1 = r1.f2596h;
            if (r0 == r1) goto L_0x000e;
        L_0x0009:
            r5 = r4.m3308b(r5);
            throw r5;
        L_0x000e:
            r0 = 0;
        L_0x000f:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x0020 }
            if (r0 >= r1) goto L_0x001f;	 Catch:{ NumberFormatException -> 0x0020 }
        L_0x0012:
            r1 = r4.f2580e;	 Catch:{ NumberFormatException -> 0x0020 }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x0020 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0020 }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x0020 }
            r0 = r0 + 1;
            goto L_0x000f;
        L_0x001f:
            return;
        L_0x0020:
            r5 = r4.m3308b(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.b.a(java.lang.String[]):void");
        }

        /* renamed from: b */
        private IOException m3308b(String[] strArr) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: a */
        public File m3313a(int i) {
            return this.f2576a[i];
        }

        /* renamed from: b */
        public File m3315b(int i) {
            return this.f2577b[i];
        }
    }

    /* renamed from: com.bumptech.glide.a.a$c */
    public final class C0970c {
        /* renamed from: a */
        final /* synthetic */ C0971a f2584a;
        /* renamed from: b */
        private final String f2585b;
        /* renamed from: c */
        private final long f2586c;
        /* renamed from: d */
        private final long[] f2587d;
        /* renamed from: e */
        private final File[] f2588e;

        private C0970c(C0971a c0971a, String str, long j, File[] fileArr, long[] jArr) {
            this.f2584a = c0971a;
            this.f2585b = str;
            this.f2586c = j;
            this.f2588e = fileArr;
            this.f2587d = jArr;
        }

        /* renamed from: a */
        public File m3316a(int i) {
            return this.f2588e[i];
        }
    }

    private C0971a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f2590b = file2;
        this.f2594f = i;
        this.f2591c = new File(file2, "journal");
        this.f2592d = new File(file2, "journal.tmp");
        this.f2593e = new File(file2, "journal.bkp");
        this.f2596h = i2;
        this.f2595g = j;
    }

    /* renamed from: a */
    public static C0971a m3319a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        } else {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    C0971a.m3324a(file2, file3, false);
                }
            }
            C0971a c0971a = new C0971a(file, i, i2, j);
            if (c0971a.f2591c.exists()) {
                try {
                    c0971a.m3325b();
                    c0971a.m3327c();
                    return c0971a;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(file);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    printStream.println(stringBuilder.toString());
                    c0971a.m3338a();
                }
            }
            file.mkdirs();
            c0971a = new C0971a(file, i, i2, j);
            c0971a.m3329d();
            return c0971a;
        }
    }

    /* renamed from: b */
    private void m3325b() throws java.io.IOException {
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
        r8 = this;
        r0 = new com.bumptech.glide.a.b;
        r1 = new java.io.FileInputStream;
        r2 = r8.f2591c;
        r1.<init>(r2);
        r2 = com.bumptech.glide.p023a.C0974c.f2609a;
        r0.<init>(r1, r2);
        r1 = r0.m3343a();	 Catch:{ all -> 0x00bf }
        r2 = r0.m3343a();	 Catch:{ all -> 0x00bf }
        r3 = r0.m3343a();	 Catch:{ all -> 0x00bf }
        r4 = r0.m3343a();	 Catch:{ all -> 0x00bf }
        r5 = r0.m3343a();	 Catch:{ all -> 0x00bf }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x00bf }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x00bf }
        if (r6 == 0) goto L_0x008b;	 Catch:{ all -> 0x00bf }
    L_0x002a:
        r6 = "1";	 Catch:{ all -> 0x00bf }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x00bf }
        if (r6 == 0) goto L_0x008b;	 Catch:{ all -> 0x00bf }
    L_0x0032:
        r6 = r8.f2594f;	 Catch:{ all -> 0x00bf }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00bf }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x00bf }
        if (r3 == 0) goto L_0x008b;	 Catch:{ all -> 0x00bf }
    L_0x003e:
        r3 = r8.f2596h;	 Catch:{ all -> 0x00bf }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x00bf }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x00bf }
        if (r3 == 0) goto L_0x008b;	 Catch:{ all -> 0x00bf }
    L_0x004a:
        r3 = "";	 Catch:{ all -> 0x00bf }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x00bf }
        if (r3 != 0) goto L_0x0053;
    L_0x0052:
        goto L_0x008b;
    L_0x0053:
        r1 = 0;
    L_0x0054:
        r2 = r0.m3343a();	 Catch:{ EOFException -> 0x005e }
        r8.m3331d(r2);	 Catch:{ EOFException -> 0x005e }
        r1 = r1 + 1;
        goto L_0x0054;
    L_0x005e:
        r2 = r8.f2599k;	 Catch:{ all -> 0x00bf }
        r2 = r2.size();	 Catch:{ all -> 0x00bf }
        r1 = r1 - r2;	 Catch:{ all -> 0x00bf }
        r8.f2600l = r1;	 Catch:{ all -> 0x00bf }
        r1 = r0.m3344b();	 Catch:{ all -> 0x00bf }
        if (r1 == 0) goto L_0x0071;	 Catch:{ all -> 0x00bf }
    L_0x006d:
        r8.m3329d();	 Catch:{ all -> 0x00bf }
        goto L_0x0087;	 Catch:{ all -> 0x00bf }
    L_0x0071:
        r1 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00bf }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00bf }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00bf }
        r4 = r8.f2591c;	 Catch:{ all -> 0x00bf }
        r5 = 1;	 Catch:{ all -> 0x00bf }
        r3.<init>(r4, r5);	 Catch:{ all -> 0x00bf }
        r4 = com.bumptech.glide.p023a.C0974c.f2609a;	 Catch:{ all -> 0x00bf }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x00bf }
        r1.<init>(r2);	 Catch:{ all -> 0x00bf }
        r8.f2598j = r1;	 Catch:{ all -> 0x00bf }
    L_0x0087:
        com.bumptech.glide.p023a.C0974c.m3345a(r0);
        return;
    L_0x008b:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x00bf }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bf }
        r6.<init>();	 Catch:{ all -> 0x00bf }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x00bf }
        r6.append(r7);	 Catch:{ all -> 0x00bf }
        r6.append(r1);	 Catch:{ all -> 0x00bf }
        r1 = ", ";	 Catch:{ all -> 0x00bf }
        r6.append(r1);	 Catch:{ all -> 0x00bf }
        r6.append(r2);	 Catch:{ all -> 0x00bf }
        r1 = ", ";	 Catch:{ all -> 0x00bf }
        r6.append(r1);	 Catch:{ all -> 0x00bf }
        r6.append(r4);	 Catch:{ all -> 0x00bf }
        r1 = ", ";	 Catch:{ all -> 0x00bf }
        r6.append(r1);	 Catch:{ all -> 0x00bf }
        r6.append(r5);	 Catch:{ all -> 0x00bf }
        r1 = "]";	 Catch:{ all -> 0x00bf }
        r6.append(r1);	 Catch:{ all -> 0x00bf }
        r1 = r6.toString();	 Catch:{ all -> 0x00bf }
        r3.<init>(r1);	 Catch:{ all -> 0x00bf }
        throw r3;	 Catch:{ all -> 0x00bf }
    L_0x00bf:
        r1 = move-exception;
        com.bumptech.glide.p023a.C0974c.m3345a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.b():void");
    }

    /* renamed from: d */
    private void m3331d(String str) throws IOException {
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
                this.f2599k.remove(substring);
                return;
            }
        }
        substring = str.substring(i, indexOf2);
        C0969b c0969b = (C0969b) this.f2599k.get(substring);
        if (c0969b == null) {
            c0969b = new C0969b(substring);
            this.f2599k.put(substring, c0969b);
        }
        if (indexOf2 != -1 && indexOf == "CLEAN".length() && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            c0969b.f2581f = true;
            c0969b.f2582g = null;
            c0969b.m3306a(split);
        } else if (indexOf2 == -1 && indexOf == "DIRTY".length() && str.startsWith("DIRTY")) {
            c0969b.f2582g = new C0968a(c0969b);
        } else if (!(indexOf2 == -1 && indexOf == "READ".length() && str.startsWith("READ"))) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private void m3327c() throws IOException {
        C0971a.m3323a(this.f2592d);
        Iterator it = this.f2599k.values().iterator();
        while (it.hasNext()) {
            C0969b c0969b = (C0969b) it.next();
            int i = 0;
            if (c0969b.f2582g == null) {
                while (i < this.f2596h) {
                    this.f2597i += c0969b.f2580e[i];
                    i++;
                }
            } else {
                c0969b.f2582g = null;
                while (i < this.f2596h) {
                    C0971a.m3323a(c0969b.m3313a(i));
                    C0971a.m3323a(c0969b.m3315b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: d */
    private synchronized void m3329d() throws IOException {
        if (this.f2598j != null) {
            this.f2598j.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2592d), C0974c.f2609a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2594f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2596h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C0969b c0969b : this.f2599k.values()) {
                StringBuilder stringBuilder;
                if (c0969b.f2582g != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("DIRTY ");
                    stringBuilder.append(c0969b.f2579d);
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CLEAN ");
                    stringBuilder.append(c0969b.f2579d);
                    stringBuilder.append(c0969b.m3314a());
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                }
            }
            if (this.f2591c.exists()) {
                C0971a.m3324a(this.f2591c, this.f2593e, true);
            }
            C0971a.m3324a(this.f2592d, this.f2591c, false);
            this.f2593e.delete();
            this.f2598j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2591c, true), C0974c.f2609a));
        } finally {
            bufferedWriter.close();
        }
    }

    /* renamed from: a */
    private static void m3323a(File file) throws IOException {
        if (file.exists() && file.delete() == null) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m3324a(File file, File file2, boolean z) throws IOException {
        if (z) {
            C0971a.m3323a(file2);
        }
        if (file.renameTo(file2) == null) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public synchronized C0970c m3337a(String str) throws IOException {
        m3335f();
        C0969b c0969b = (C0969b) this.f2599k.get(str);
        if (c0969b == null) {
            return null;
        }
        if (!c0969b.f2581f) {
            return null;
        }
        for (File exists : c0969b.f2576a) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f2600l++;
        this.f2598j.append("READ");
        this.f2598j.append(' ');
        this.f2598j.append(str);
        this.f2598j.append('\n');
        if (m3333e()) {
            this.f2589a.submit(this.f2602n);
        }
        return new C0970c(str, c0969b.f2583h, c0969b.f2576a, c0969b.f2580e);
    }

    /* renamed from: b */
    public C0968a m3339b(String str) throws IOException {
        return m3318a(str, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized com.bumptech.glide.p023a.C0971a.C0968a m3318a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.m3335f();	 Catch:{ all -> 0x005d }
        r0 = r5.f2599k;	 Catch:{ all -> 0x005d }
        r0 = r0.get(r6);	 Catch:{ all -> 0x005d }
        r0 = (com.bumptech.glide.p023a.C0971a.C0969b) r0;	 Catch:{ all -> 0x005d }
        r1 = -1;
        r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        r1 = 0;
        if (r3 == 0) goto L_0x001f;
    L_0x0013:
        if (r0 == 0) goto L_0x001d;
    L_0x0015:
        r2 = r0.f2583h;	 Catch:{ all -> 0x005d }
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r5);
        return r1;
    L_0x001f:
        if (r0 != 0) goto L_0x002c;
    L_0x0021:
        r0 = new com.bumptech.glide.a.a$b;	 Catch:{ all -> 0x005d }
        r0.<init>(r6);	 Catch:{ all -> 0x005d }
        r7 = r5.f2599k;	 Catch:{ all -> 0x005d }
        r7.put(r6, r0);	 Catch:{ all -> 0x005d }
        goto L_0x0034;
    L_0x002c:
        r7 = r0.f2582g;	 Catch:{ all -> 0x005d }
        if (r7 == 0) goto L_0x0034;
    L_0x0032:
        monitor-exit(r5);
        return r1;
    L_0x0034:
        r7 = new com.bumptech.glide.a.a$a;	 Catch:{ all -> 0x005d }
        r7.<init>(r0);	 Catch:{ all -> 0x005d }
        r0.f2582g = r7;	 Catch:{ all -> 0x005d }
        r8 = r5.f2598j;	 Catch:{ all -> 0x005d }
        r0 = "DIRTY";
        r8.append(r0);	 Catch:{ all -> 0x005d }
        r8 = r5.f2598j;	 Catch:{ all -> 0x005d }
        r0 = 32;
        r8.append(r0);	 Catch:{ all -> 0x005d }
        r8 = r5.f2598j;	 Catch:{ all -> 0x005d }
        r8.append(r6);	 Catch:{ all -> 0x005d }
        r6 = r5.f2598j;	 Catch:{ all -> 0x005d }
        r8 = 10;
        r6.append(r8);	 Catch:{ all -> 0x005d }
        r6 = r5.f2598j;	 Catch:{ all -> 0x005d }
        r6.flush();	 Catch:{ all -> 0x005d }
        monitor-exit(r5);
        return r7;
    L_0x005d:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.a(java.lang.String, long):com.bumptech.glide.a.a$a");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized void m3321a(com.bumptech.glide.p023a.C0971a.C0968a r12, boolean r13) throws java.io.IOException {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r12.f2573b;	 Catch:{ all -> 0x0112 }
        r1 = r0.f2582g;	 Catch:{ all -> 0x0112 }
        if (r1 == r12) goto L_0x0011;
    L_0x000b:
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0112 }
        r12.<init>();	 Catch:{ all -> 0x0112 }
        throw r12;	 Catch:{ all -> 0x0112 }
    L_0x0011:
        r1 = 0;
        if (r13 == 0) goto L_0x0053;
    L_0x0014:
        r2 = r0.f2581f;	 Catch:{ all -> 0x0112 }
        if (r2 != 0) goto L_0x0053;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r3 = r11.f2596h;	 Catch:{ all -> 0x0112 }
        if (r2 >= r3) goto L_0x0053;
    L_0x001f:
        r3 = r12.f2574c;	 Catch:{ all -> 0x0112 }
        r3 = r3[r2];	 Catch:{ all -> 0x0112 }
        if (r3 != 0) goto L_0x0041;
    L_0x0027:
        r12.m3300b();	 Catch:{ all -> 0x0112 }
        r12 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0112 }
        r13 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0112 }
        r13.<init>();	 Catch:{ all -> 0x0112 }
        r0 = "Newly created entry didn't create value for index ";
        r13.append(r0);	 Catch:{ all -> 0x0112 }
        r13.append(r2);	 Catch:{ all -> 0x0112 }
        r13 = r13.toString();	 Catch:{ all -> 0x0112 }
        r12.<init>(r13);	 Catch:{ all -> 0x0112 }
        throw r12;	 Catch:{ all -> 0x0112 }
    L_0x0041:
        r3 = r0.m3315b(r2);	 Catch:{ all -> 0x0112 }
        r3 = r3.exists();	 Catch:{ all -> 0x0112 }
        if (r3 != 0) goto L_0x0050;
    L_0x004b:
        r12.m3300b();	 Catch:{ all -> 0x0112 }
        monitor-exit(r11);
        return;
    L_0x0050:
        r2 = r2 + 1;
        goto L_0x001b;
    L_0x0053:
        r12 = r11.f2596h;	 Catch:{ all -> 0x0112 }
        if (r1 >= r12) goto L_0x008a;
    L_0x0057:
        r12 = r0.m3315b(r1);	 Catch:{ all -> 0x0112 }
        if (r13 == 0) goto L_0x0084;
    L_0x005d:
        r2 = r12.exists();	 Catch:{ all -> 0x0112 }
        if (r2 == 0) goto L_0x0087;
    L_0x0063:
        r2 = r0.m3313a(r1);	 Catch:{ all -> 0x0112 }
        r12.renameTo(r2);	 Catch:{ all -> 0x0112 }
        r12 = r0.f2580e;	 Catch:{ all -> 0x0112 }
        r3 = r12[r1];	 Catch:{ all -> 0x0112 }
        r5 = r2.length();	 Catch:{ all -> 0x0112 }
        r12 = r0.f2580e;	 Catch:{ all -> 0x0112 }
        r12[r1] = r5;	 Catch:{ all -> 0x0112 }
        r7 = r11.f2597i;	 Catch:{ all -> 0x0112 }
        r12 = 0;
        r9 = r7 - r3;
        r2 = r9 + r5;
        r11.f2597i = r2;	 Catch:{ all -> 0x0112 }
        goto L_0x0087;
    L_0x0084:
        com.bumptech.glide.p023a.C0971a.m3323a(r12);	 Catch:{ all -> 0x0112 }
    L_0x0087:
        r1 = r1 + 1;
        goto L_0x0053;
    L_0x008a:
        r12 = r11.f2600l;	 Catch:{ all -> 0x0112 }
        r1 = 1;
        r12 = r12 + r1;
        r11.f2600l = r12;	 Catch:{ all -> 0x0112 }
        r12 = 0;
        r0.f2582g = r12;	 Catch:{ all -> 0x0112 }
        r12 = r0.f2581f;	 Catch:{ all -> 0x0112 }
        r12 = r12 | r13;
        r2 = 10;
        r3 = 32;
        if (r12 == 0) goto L_0x00d3;
    L_0x009f:
        r0.f2581f = r1;	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r1 = "CLEAN";
        r12.append(r1);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r12.append(r3);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r1 = r0.f2579d;	 Catch:{ all -> 0x0112 }
        r12.append(r1);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r1 = r0.m3314a();	 Catch:{ all -> 0x0112 }
        r12.append(r1);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r12.append(r2);	 Catch:{ all -> 0x0112 }
        if (r13 == 0) goto L_0x00f6;
    L_0x00c7:
        r12 = r11.f2601m;	 Catch:{ all -> 0x0112 }
        r1 = 1;
        r3 = r12 + r1;
        r11.f2601m = r3;	 Catch:{ all -> 0x0112 }
        r0.f2583h = r12;	 Catch:{ all -> 0x0112 }
        goto L_0x00f6;
    L_0x00d3:
        r12 = r11.f2599k;	 Catch:{ all -> 0x0112 }
        r13 = r0.f2579d;	 Catch:{ all -> 0x0112 }
        r12.remove(r13);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r13 = "REMOVE";
        r12.append(r13);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r12.append(r3);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r13 = r0.f2579d;	 Catch:{ all -> 0x0112 }
        r12.append(r13);	 Catch:{ all -> 0x0112 }
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r12.append(r2);	 Catch:{ all -> 0x0112 }
    L_0x00f6:
        r12 = r11.f2598j;	 Catch:{ all -> 0x0112 }
        r12.flush();	 Catch:{ all -> 0x0112 }
        r12 = r11.f2597i;	 Catch:{ all -> 0x0112 }
        r0 = r11.f2595g;	 Catch:{ all -> 0x0112 }
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0109;
    L_0x0103:
        r12 = r11.m3333e();	 Catch:{ all -> 0x0112 }
        if (r12 == 0) goto L_0x0110;
    L_0x0109:
        r12 = r11.f2589a;	 Catch:{ all -> 0x0112 }
        r13 = r11.f2602n;	 Catch:{ all -> 0x0112 }
        r12.submit(r13);	 Catch:{ all -> 0x0112 }
    L_0x0110:
        monitor-exit(r11);
        return;
    L_0x0112:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.a(com.bumptech.glide.a.a$a, boolean):void");
    }

    /* renamed from: e */
    private boolean m3333e() {
        return this.f2600l >= 2000 && this.f2600l >= this.f2599k.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public synchronized boolean m3340c(java.lang.String r10) throws java.io.IOException {
        /*
        r9 = this;
        monitor-enter(r9);
        r9.m3335f();	 Catch:{ all -> 0x0090 }
        r0 = r9.f2599k;	 Catch:{ all -> 0x0090 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0090 }
        r0 = (com.bumptech.glide.p023a.C0971a.C0969b) r0;	 Catch:{ all -> 0x0090 }
        r1 = 0;
        if (r0 == 0) goto L_0x008e;
    L_0x000f:
        r2 = r0.f2582g;	 Catch:{ all -> 0x0090 }
        if (r2 == 0) goto L_0x0017;
    L_0x0015:
        goto L_0x008e;
    L_0x0017:
        r2 = r9.f2596h;	 Catch:{ all -> 0x0090 }
        if (r1 >= r2) goto L_0x005a;
    L_0x001b:
        r2 = r0.m3313a(r1);	 Catch:{ all -> 0x0090 }
        r3 = r2.exists();	 Catch:{ all -> 0x0090 }
        if (r3 == 0) goto L_0x0042;
    L_0x0025:
        r3 = r2.delete();	 Catch:{ all -> 0x0090 }
        if (r3 != 0) goto L_0x0042;
    L_0x002b:
        r10 = new java.io.IOException;	 Catch:{ all -> 0x0090 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0090 }
        r0.<init>();	 Catch:{ all -> 0x0090 }
        r1 = "failed to delete ";
        r0.append(r1);	 Catch:{ all -> 0x0090 }
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r0.toString();	 Catch:{ all -> 0x0090 }
        r10.<init>(r0);	 Catch:{ all -> 0x0090 }
        throw r10;	 Catch:{ all -> 0x0090 }
    L_0x0042:
        r2 = r9.f2597i;	 Catch:{ all -> 0x0090 }
        r4 = r0.f2580e;	 Catch:{ all -> 0x0090 }
        r5 = r4[r1];	 Catch:{ all -> 0x0090 }
        r4 = 0;
        r7 = r2 - r5;
        r9.f2597i = r7;	 Catch:{ all -> 0x0090 }
        r2 = r0.f2580e;	 Catch:{ all -> 0x0090 }
        r3 = 0;
        r2[r1] = r3;	 Catch:{ all -> 0x0090 }
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x005a:
        r0 = r9.f2600l;	 Catch:{ all -> 0x0090 }
        r1 = 1;
        r0 = r0 + r1;
        r9.f2600l = r0;	 Catch:{ all -> 0x0090 }
        r0 = r9.f2598j;	 Catch:{ all -> 0x0090 }
        r2 = "REMOVE";
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r9.f2598j;	 Catch:{ all -> 0x0090 }
        r2 = 32;
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r9.f2598j;	 Catch:{ all -> 0x0090 }
        r0.append(r10);	 Catch:{ all -> 0x0090 }
        r0 = r9.f2598j;	 Catch:{ all -> 0x0090 }
        r2 = 10;
        r0.append(r2);	 Catch:{ all -> 0x0090 }
        r0 = r9.f2599k;	 Catch:{ all -> 0x0090 }
        r0.remove(r10);	 Catch:{ all -> 0x0090 }
        r10 = r9.m3333e();	 Catch:{ all -> 0x0090 }
        if (r10 == 0) goto L_0x008c;
    L_0x0085:
        r10 = r9.f2589a;	 Catch:{ all -> 0x0090 }
        r0 = r9.f2602n;	 Catch:{ all -> 0x0090 }
        r10.submit(r0);	 Catch:{ all -> 0x0090 }
    L_0x008c:
        monitor-exit(r9);
        return r1;
    L_0x008e:
        monitor-exit(r9);
        return r1;
    L_0x0090:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.a.c(java.lang.String):boolean");
    }

    /* renamed from: f */
    private void m3335f() {
        if (this.f2598j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void close() throws IOException {
        if (this.f2598j != null) {
            Iterator it = new ArrayList(this.f2599k.values()).iterator();
            while (it.hasNext()) {
                C0969b c0969b = (C0969b) it.next();
                if (c0969b.f2582g != null) {
                    c0969b.f2582g.m3300b();
                }
            }
            m3336g();
            this.f2598j.close();
            this.f2598j = null;
        }
    }

    /* renamed from: g */
    private void m3336g() throws IOException {
        while (this.f2597i > this.f2595g) {
            m3340c((String) ((Entry) this.f2599k.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: a */
    public void m3338a() throws IOException {
        close();
        C0974c.m3346a(this.f2590b);
    }
}
