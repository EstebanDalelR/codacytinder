package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.k */
public final class C1724k {
    /* renamed from: a */
    static final String f4757a = "k";
    /* renamed from: b */
    private static final AtomicLong f4758b = new AtomicLong();
    /* renamed from: c */
    private final String f4759c;
    /* renamed from: d */
    private final C1720d f4760d;
    /* renamed from: e */
    private final File f4761e;
    /* renamed from: f */
    private boolean f4762f;
    /* renamed from: g */
    private boolean f4763g;
    /* renamed from: h */
    private final Object f4764h;
    /* renamed from: i */
    private AtomicLong f4765i = new AtomicLong(0);

    /* renamed from: com.facebook.internal.k$3 */
    class C17143 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1724k f4746a;

        C17143(C1724k c1724k) {
            this.f4746a = c1724k;
        }

        public void run() {
            this.f4746a.m5939d();
        }
    }

    /* renamed from: com.facebook.internal.k$a */
    private static class C1717a {
        /* renamed from: a */
        private static final FilenameFilter f4747a = new C17151();
        /* renamed from: b */
        private static final FilenameFilter f4748b = new C17162();

        /* renamed from: com.facebook.internal.k$a$1 */
        static class C17151 implements FilenameFilter {
            C17151() {
            }

            public boolean accept(File file, String str) {
                return str.startsWith("buffer") ^ 1;
            }
        }

        /* renamed from: com.facebook.internal.k$a$2 */
        static class C17162 implements FilenameFilter {
            C17162() {
            }

            public boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        }

        /* renamed from: a */
        static void m5922a(File file) {
            file = file.listFiles(C1717a.m5924b());
            if (file != null) {
                for (File delete : file) {
                    delete.delete();
                }
            }
        }

        /* renamed from: a */
        static FilenameFilter m5921a() {
            return f4747a;
        }

        /* renamed from: b */
        static FilenameFilter m5924b() {
            return f4748b;
        }

        /* renamed from: b */
        static File m5923b(File file) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("buffer");
            stringBuilder.append(Long.valueOf(C1724k.f4758b.incrementAndGet()).toString());
            return new File(file, stringBuilder.toString());
        }
    }

    /* renamed from: com.facebook.internal.k$b */
    private static class C1718b extends OutputStream {
        /* renamed from: a */
        final OutputStream f4749a;
        /* renamed from: b */
        final C1722f f4750b;

        C1718b(OutputStream outputStream, C1722f c1722f) {
            this.f4749a = outputStream;
            this.f4750b = c1722f;
        }

        public void close() throws IOException {
            try {
                this.f4749a.close();
            } finally {
                this.f4750b.mo1857a();
            }
        }

        public void flush() throws IOException {
            this.f4749a.flush();
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f4749a.write(bArr, i, i2);
        }

        public void write(byte[] bArr) throws IOException {
            this.f4749a.write(bArr);
        }

        public void write(int i) throws IOException {
            this.f4749a.write(i);
        }
    }

    /* renamed from: com.facebook.internal.k$c */
    private static final class C1719c extends InputStream {
        /* renamed from: a */
        final InputStream f4751a;
        /* renamed from: b */
        final OutputStream f4752b;

        public boolean markSupported() {
            return false;
        }

        C1719c(InputStream inputStream, OutputStream outputStream) {
            this.f4751a = inputStream;
            this.f4752b = outputStream;
        }

        public int available() throws IOException {
            return this.f4751a.available();
        }

        public void close() throws IOException {
            try {
                this.f4751a.close();
            } finally {
                this.f4752b.close();
            }
        }

        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public int read(byte[] bArr) throws IOException {
            int read = this.f4751a.read(bArr);
            if (read > 0) {
                this.f4752b.write(bArr, 0, read);
            }
            return read;
        }

        public int read() throws IOException {
            int read = this.f4751a.read();
            if (read >= 0) {
                this.f4752b.write(read);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            i2 = this.f4751a.read(bArr, i, i2);
            if (i2 > 0) {
                this.f4752b.write(bArr, i, i2);
            }
            return i2;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j) throws IOException {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, (long) bArr.length));
                if (read < 0) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }
    }

    /* renamed from: com.facebook.internal.k$d */
    public static final class C1720d {
        /* renamed from: a */
        private int f4753a = 1048576;
        /* renamed from: b */
        private int f4754b = 1024;

        /* renamed from: a */
        int m5925a() {
            return this.f4753a;
        }

        /* renamed from: b */
        int m5926b() {
            return this.f4754b;
        }
    }

    /* renamed from: com.facebook.internal.k$e */
    private static final class C1721e implements Comparable<C1721e> {
        /* renamed from: a */
        private final File f4755a;
        /* renamed from: b */
        private final long f4756b;

        public /* synthetic */ int compareTo(Object obj) {
            return m5927a((C1721e) obj);
        }

        C1721e(File file) {
            this.f4755a = file;
            this.f4756b = file.lastModified();
        }

        /* renamed from: a */
        File m5928a() {
            return this.f4755a;
        }

        /* renamed from: b */
        long m5929b() {
            return this.f4756b;
        }

        /* renamed from: a */
        public int m5927a(C1721e c1721e) {
            if (m5929b() < c1721e.m5929b()) {
                return -1;
            }
            if (m5929b() > c1721e.m5929b()) {
                return 1;
            }
            return m5928a().compareTo(c1721e.m5928a());
        }

        public boolean equals(Object obj) {
            return ((obj instanceof C1721e) && m5927a((C1721e) obj) == null) ? true : null;
        }

        public int hashCode() {
            return ((1073 + this.f4755a.hashCode()) * 37) + ((int) (this.f4756b % 2147483647L));
        }
    }

    /* renamed from: com.facebook.internal.k$f */
    private interface C1722f {
        /* renamed from: a */
        void mo1857a();
    }

    /* renamed from: com.facebook.internal.k$g */
    private static final class C1723g {
        /* renamed from: a */
        static void m5932a(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            jSONObject = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((jSONObject.length >> 16) & 255);
            outputStream.write((jSONObject.length >> 8) & 255);
            outputStream.write((jSONObject.length >> 0) & 255);
            outputStream.write(jSONObject);
        }

        /* renamed from: a */
        static JSONObject m5931a(InputStream inputStream) throws IOException {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    C1738r.m5978a(LoggingBehavior.CACHE, C1724k.f4757a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < bArr.length) {
                i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 < 1) {
                    inputStream = LoggingBehavior.CACHE;
                    String str = C1724k.f4757a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("readHeader: stream.read stopped at ");
                    stringBuilder.append(Integer.valueOf(i));
                    stringBuilder.append(" when expected ");
                    stringBuilder.append(bArr.length);
                    C1738r.m5978a(inputStream, str, stringBuilder.toString());
                    return null;
                }
                i += i2;
            }
            try {
                inputStream = new JSONTokener(new String(bArr)).nextValue();
                if (inputStream instanceof JSONObject) {
                    return (JSONObject) inputStream;
                }
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = C1724k.f4757a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("readHeader: expected JSONObject, got ");
                stringBuilder2.append(inputStream.getClass().getCanonicalName());
                C1738r.m5978a(loggingBehavior, str2, stringBuilder2.toString());
                return null;
            } catch (InputStream inputStream2) {
                throw new IOException(inputStream2.getMessage());
            }
        }
    }

    public C1724k(String str, C1720d c1720d) {
        this.f4759c = str;
        this.f4760d = c1720d;
        this.f4761e = new File(FacebookSdk.m4002m(), str);
        this.f4764h = new Object();
        if (this.f4761e.mkdirs() != null || this.f4761e.isDirectory() != null) {
            C1717a.m5922a(this.f4761e);
        }
    }

    /* renamed from: a */
    public InputStream m5940a(String str) throws IOException {
        return m5942a(str, null);
    }

    /* renamed from: a */
    public java.io.InputStream m5942a(java.lang.String r7, java.lang.String r8) throws java.io.IOException {
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
        r6 = this;
        r0 = new java.io.File;
        r1 = r6.f4761e;
        r2 = com.facebook.internal.Utility.m5787b(r7);
        r0.<init>(r1, r2);
        r1 = 0;
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0085 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0085 }
        r3 = new java.io.BufferedInputStream;
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r3.<init>(r2, r4);
        r2 = com.facebook.internal.C1724k.C1723g.m5931a(r3);	 Catch:{ all -> 0x0080 }
        if (r2 != 0) goto L_0x0022;
    L_0x001e:
        r3.close();
        return r1;
    L_0x0022:
        r4 = "key";	 Catch:{ all -> 0x0080 }
        r4 = r2.optString(r4);	 Catch:{ all -> 0x0080 }
        if (r4 == 0) goto L_0x007c;	 Catch:{ all -> 0x0080 }
    L_0x002a:
        r7 = r4.equals(r7);	 Catch:{ all -> 0x0080 }
        if (r7 != 0) goto L_0x0031;	 Catch:{ all -> 0x0080 }
    L_0x0030:
        goto L_0x007c;	 Catch:{ all -> 0x0080 }
    L_0x0031:
        r7 = "tag";	 Catch:{ all -> 0x0080 }
        r7 = r2.optString(r7, r1);	 Catch:{ all -> 0x0080 }
        if (r8 != 0) goto L_0x003b;	 Catch:{ all -> 0x0080 }
    L_0x0039:
        if (r7 != 0) goto L_0x0043;	 Catch:{ all -> 0x0080 }
    L_0x003b:
        if (r8 == 0) goto L_0x0047;	 Catch:{ all -> 0x0080 }
    L_0x003d:
        r7 = r8.equals(r7);	 Catch:{ all -> 0x0080 }
        if (r7 != 0) goto L_0x0047;
    L_0x0043:
        r3.close();
        return r1;
    L_0x0047:
        r7 = new java.util.Date;	 Catch:{ all -> 0x0080 }
        r7.<init>();	 Catch:{ all -> 0x0080 }
        r7 = r7.getTime();	 Catch:{ all -> 0x0080 }
        r1 = com.facebook.LoggingBehavior.CACHE;	 Catch:{ all -> 0x0080 }
        r2 = f4757a;	 Catch:{ all -> 0x0080 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0080 }
        r4.<init>();	 Catch:{ all -> 0x0080 }
        r5 = "Setting lastModified to ";	 Catch:{ all -> 0x0080 }
        r4.append(r5);	 Catch:{ all -> 0x0080 }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0080 }
        r4.append(r5);	 Catch:{ all -> 0x0080 }
        r5 = " for ";	 Catch:{ all -> 0x0080 }
        r4.append(r5);	 Catch:{ all -> 0x0080 }
        r5 = r0.getName();	 Catch:{ all -> 0x0080 }
        r4.append(r5);	 Catch:{ all -> 0x0080 }
        r4 = r4.toString();	 Catch:{ all -> 0x0080 }
        com.facebook.internal.C1738r.m5978a(r1, r2, r4);	 Catch:{ all -> 0x0080 }
        r0.setLastModified(r7);	 Catch:{ all -> 0x0080 }
        return r3;
    L_0x007c:
        r3.close();
        return r1;
    L_0x0080:
        r7 = move-exception;
        r3.close();
        throw r7;
    L_0x0085:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.k.a(java.lang.String, java.lang.String):java.io.InputStream");
    }

    /* renamed from: b */
    public OutputStream m5944b(String str) throws IOException {
        return m5945b(str, null);
    }

    /* renamed from: b */
    public OutputStream m5945b(String str, String str2) throws IOException {
        LoggingBehavior loggingBehavior;
        String str3;
        final File b = C1717a.m5923b(this.f4761e);
        b.delete();
        if (b.createNewFile()) {
            try {
                OutputStream fileOutputStream = new FileOutputStream(b);
                final long currentTimeMillis = System.currentTimeMillis();
                final String str4 = str;
                OutputStream bufferedOutputStream = new BufferedOutputStream(new C1718b(fileOutputStream, new C1722f(this) {
                    /* renamed from: d */
                    final /* synthetic */ C1724k f10402d;

                    /* renamed from: a */
                    public void mo1857a() {
                        if (currentTimeMillis < this.f10402d.f4765i.get()) {
                            b.delete();
                        } else {
                            this.f10402d.m5935a(str4, b);
                        }
                    }
                }), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (Utility.m5785a(str2) == null) {
                        jSONObject.put("tag", str2);
                    }
                    C1723g.m5932a(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (String str5) {
                    loggingBehavior = LoggingBehavior.CACHE;
                    str3 = f4757a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error creating JSON header for cache file: ");
                    stringBuilder.append(str5);
                    C1738r.m5976a(loggingBehavior, 5, str3, stringBuilder.toString());
                    throw new IOException(str5.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                }
            } catch (String str52) {
                loggingBehavior = LoggingBehavior.CACHE;
                str3 = f4757a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Error creating buffer output stream: ");
                stringBuilder2.append(str52);
                C1738r.m5976a(loggingBehavior, 5, str3, stringBuilder2.toString());
                throw new IOException(str52.getMessage());
            }
        }
        str2 = new StringBuilder();
        str2.append("Could not create file at ");
        str2.append(b.getAbsolutePath());
        throw new IOException(str2.toString());
    }

    /* renamed from: a */
    public void m5943a() {
        final File[] listFiles = this.f4761e.listFiles(C1717a.m5921a());
        this.f4765i.set(System.currentTimeMillis());
        if (listFiles != null) {
            FacebookSdk.m3990c().execute(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C1724k f4745b;

                public void run() {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m5935a(String str, File file) {
        if (file.renameTo(new File(this.f4761e, Utility.m5787b(str))) == null) {
            file.delete();
        }
        m5938c();
    }

    /* renamed from: a */
    public InputStream m5941a(String str, InputStream inputStream) throws IOException {
        return new C1719c(inputStream, m5944b(str));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FileLruCache: tag:");
        stringBuilder.append(this.f4759c);
        stringBuilder.append(" file:");
        stringBuilder.append(this.f4761e.getName());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private void m5938c() {
        synchronized (this.f4764h) {
            if (!this.f4762f) {
                this.f4762f = true;
                FacebookSdk.m3990c().execute(new C17143(this));
            }
        }
    }

    /* renamed from: d */
    private void m5939d() {
        C1724k c1724k;
        Throwable th;
        PriorityQueue priorityQueue = this.f4764h;
        synchronized (priorityQueue) {
            try {
                c1724k.f4762f = false;
                c1724k.f4763g = true;
            } finally {
                Object obj = 
/*
Method generation error in method: com.facebook.internal.k.d():void, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0103: MERGE  (r3_11 'obj' java.lang.Object) = (r0_5 int), (r7_7 int) in method: com.facebook.internal.k.d():void, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:229)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 29 more

*/
            }
