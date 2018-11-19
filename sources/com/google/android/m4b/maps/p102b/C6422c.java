package com.google.android.m4b.maps.p102b;

import com.google.android.m4b.maps.p101a.C4515b;
import com.google.android.m4b.maps.p101a.C4515b.C4514a;
import com.google.android.m4b.maps.p101a.C4535s;
import java.io.EOFException;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.b.c */
public final class C6422c implements C4515b {
    /* renamed from: a */
    private final Map<String, C4736a> f23829a = new LinkedHashMap(16, 0.75f, true);
    /* renamed from: b */
    private long f23830b = 0;
    /* renamed from: c */
    private final File f23831c;
    /* renamed from: d */
    private final int f23832d;

    /* renamed from: com.google.android.m4b.maps.b.c$a */
    static class C4736a {
        /* renamed from: a */
        public long f17377a;
        /* renamed from: b */
        public String f17378b;
        /* renamed from: c */
        public String f17379c;
        /* renamed from: d */
        public long f17380d;
        /* renamed from: e */
        public long f17381e;
        /* renamed from: f */
        public long f17382f;
        /* renamed from: g */
        public long f17383g;
        /* renamed from: h */
        public Map<String, String> f17384h;

        private C4736a() {
        }

        public C4736a(String str, C4514a c4514a) {
            this.f17378b = str;
            this.f17377a = (long) c4514a.f16770a.length;
            this.f17379c = c4514a.f16771b;
            this.f17380d = c4514a.f16772c;
            this.f17381e = c4514a.f16773d;
            this.f17382f = c4514a.f16774e;
            this.f17383g = c4514a.f16775f;
            this.f17384h = c4514a.f16776g;
        }

        /* renamed from: a */
        public static C4736a m21075a(InputStream inputStream) {
            C4736a c4736a = new C4736a();
            if (C6422c.m28048a(inputStream) != 538247942) {
                throw new IOException();
            }
            c4736a.f17378b = C6422c.m28056c(inputStream);
            c4736a.f17379c = C6422c.m28056c(inputStream);
            if (c4736a.f17379c.equals("")) {
                c4736a.f17379c = null;
            }
            c4736a.f17380d = C6422c.m28054b(inputStream);
            c4736a.f17381e = C6422c.m28054b(inputStream);
            c4736a.f17382f = C6422c.m28054b(inputStream);
            c4736a.f17383g = C6422c.m28054b(inputStream);
            c4736a.f17384h = C6422c.m28059d(inputStream);
            return c4736a;
        }

        /* renamed from: a */
        public final boolean m21076a(OutputStream outputStream) {
            try {
                C6422c.m28049a(outputStream, 538247942);
                C6422c.m28051a(outputStream, this.f17378b);
                C6422c.m28051a(outputStream, this.f17379c == null ? "" : this.f17379c);
                C6422c.m28050a(outputStream, this.f17380d);
                C6422c.m28050a(outputStream, this.f17381e);
                C6422c.m28050a(outputStream, this.f17382f);
                C6422c.m28050a(outputStream, this.f17383g);
                Map map = this.f17384h;
                if (map != null) {
                    C6422c.m28049a(outputStream, map.size());
                    for (Entry entry : map.entrySet()) {
                        C6422c.m28051a(outputStream, (String) entry.getKey());
                        C6422c.m28051a(outputStream, (String) entry.getValue());
                    }
                } else {
                    C6422c.m28049a(outputStream, 0);
                }
                outputStream.flush();
                return true;
            } catch (OutputStream outputStream2) {
                C4535s.m20469b("%s", outputStream2.toString());
                return false;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.b.c$b */
    static class C4737b extends FilterInputStream {
        /* renamed from: a */
        private int f17385a;

        private C4737b(InputStream inputStream) {
            super(inputStream);
            this.f17385a = null;
        }

        public final int read() {
            int read = super.read();
            if (read != -1) {
                this.f17385a++;
            }
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            bArr = super.read(bArr, i, i2);
            if (bArr != -1) {
                this.f17385a += bArr;
            }
            return bArr;
        }
    }

    public C6422c(File file, int i) {
        this.f23831c = file;
        this.f23832d = 20971520;
    }

    /* renamed from: a */
    public final synchronized com.google.android.m4b.maps.p101a.C4515b.C4514a mo4900a(java.lang.String r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r11.f23829a;	 Catch:{ all -> 0x0089 }
        r0 = r0.get(r12);	 Catch:{ all -> 0x0089 }
        r0 = (com.google.android.m4b.maps.p102b.C6422c.C4736a) r0;	 Catch:{ all -> 0x0089 }
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r11);
        return r1;
    L_0x000e:
        r2 = r11.m28058d(r12);	 Catch:{ all -> 0x0089 }
        r3 = 0;
        r4 = new com.google.android.m4b.maps.b.c$b;	 Catch:{ IOException -> 0x005b, all -> 0x0058 }
        r5 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x005b, all -> 0x0058 }
        r5.<init>(r2);	 Catch:{ IOException -> 0x005b, all -> 0x0058 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x005b, all -> 0x0058 }
        com.google.android.m4b.maps.p102b.C6422c.C4736a.m21075a(r4);	 Catch:{ IOException -> 0x0056 }
        r5 = r2.length();	 Catch:{ IOException -> 0x0056 }
        r7 = r4.f17385a;	 Catch:{ IOException -> 0x0056 }
        r7 = (long) r7;	 Catch:{ IOException -> 0x0056 }
        r9 = r5 - r7;	 Catch:{ IOException -> 0x0056 }
        r5 = (int) r9;	 Catch:{ IOException -> 0x0056 }
        r5 = com.google.android.m4b.maps.p102b.C6422c.m28053a(r4, r5);	 Catch:{ IOException -> 0x0056 }
        r6 = new com.google.android.m4b.maps.a.b$a;	 Catch:{ IOException -> 0x0056 }
        r6.<init>();	 Catch:{ IOException -> 0x0056 }
        r6.f16770a = r5;	 Catch:{ IOException -> 0x0056 }
        r5 = r0.f17379c;	 Catch:{ IOException -> 0x0056 }
        r6.f16771b = r5;	 Catch:{ IOException -> 0x0056 }
        r7 = r0.f17380d;	 Catch:{ IOException -> 0x0056 }
        r6.f16772c = r7;	 Catch:{ IOException -> 0x0056 }
        r7 = r0.f17381e;	 Catch:{ IOException -> 0x0056 }
        r6.f16773d = r7;	 Catch:{ IOException -> 0x0056 }
        r7 = r0.f17382f;	 Catch:{ IOException -> 0x0056 }
        r6.f16774e = r7;	 Catch:{ IOException -> 0x0056 }
        r7 = r0.f17383g;	 Catch:{ IOException -> 0x0056 }
        r6.f16775f = r7;	 Catch:{ IOException -> 0x0056 }
        r0 = r0.f17384h;	 Catch:{ IOException -> 0x0056 }
        r6.f16776g = r0;	 Catch:{ IOException -> 0x0056 }
        r4.close();	 Catch:{ IOException -> 0x0054 }
        monitor-exit(r11);
        return r6;
    L_0x0054:
        monitor-exit(r11);
        return r1;
    L_0x0056:
        r0 = move-exception;
        goto L_0x005d;
    L_0x0058:
        r12 = move-exception;
        r4 = r1;
        goto L_0x0080;
    L_0x005b:
        r0 = move-exception;
        r4 = r1;
    L_0x005d:
        r5 = "%s: %s";	 Catch:{ all -> 0x007f }
        r6 = 2;	 Catch:{ all -> 0x007f }
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x007f }
        r2 = r2.getAbsolutePath();	 Catch:{ all -> 0x007f }
        r6[r3] = r2;	 Catch:{ all -> 0x007f }
        r2 = 1;	 Catch:{ all -> 0x007f }
        r0 = r0.toString();	 Catch:{ all -> 0x007f }
        r6[r2] = r0;	 Catch:{ all -> 0x007f }
        com.google.android.m4b.maps.p101a.C4535s.m20469b(r5, r6);	 Catch:{ all -> 0x007f }
        r11.m28055b(r12);	 Catch:{ all -> 0x007f }
        if (r4 == 0) goto L_0x007d;
    L_0x0077:
        r4.close();	 Catch:{ IOException -> 0x007b }
        goto L_0x007d;
    L_0x007b:
        monitor-exit(r11);
        return r1;
    L_0x007d:
        monitor-exit(r11);
        return r1;
    L_0x007f:
        r12 = move-exception;
    L_0x0080:
        if (r4 == 0) goto L_0x0088;
    L_0x0082:
        r4.close();	 Catch:{ IOException -> 0x0086 }
        goto L_0x0088;
    L_0x0086:
        monitor-exit(r11);
        return r1;
    L_0x0088:
        throw r12;	 Catch:{ all -> 0x0089 }
    L_0x0089:
        r12 = move-exception;
        monitor-exit(r11);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.c.a(java.lang.String):com.google.android.m4b.maps.a.b$a");
    }

    /* renamed from: a */
    public final synchronized void mo4901a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f23831c;	 Catch:{ all -> 0x006e }
        r0 = r0.exists();	 Catch:{ all -> 0x006e }
        r1 = 0;	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x006e }
    L_0x000a:
        r0 = r8.f23831c;	 Catch:{ all -> 0x006e }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x006e }
    L_0x0012:
        r0 = "Unable to create cache dir %s";	 Catch:{ all -> 0x006e }
        r2 = 1;	 Catch:{ all -> 0x006e }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006e }
        r3 = r8.f23831c;	 Catch:{ all -> 0x006e }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x006e }
        r2[r1] = r3;	 Catch:{ all -> 0x006e }
        com.google.android.m4b.maps.p101a.C4535s.m20470c(r0, r2);	 Catch:{ all -> 0x006e }
    L_0x0022:
        monitor-exit(r8);
        return;
    L_0x0024:
        r0 = r8.f23831c;	 Catch:{ all -> 0x006e }
        r0 = r0.listFiles();	 Catch:{ all -> 0x006e }
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        monitor-exit(r8);
        return;
    L_0x002e:
        r2 = r0.length;	 Catch:{ all -> 0x006e }
    L_0x002f:
        if (r1 >= r2) goto L_0x006c;	 Catch:{ all -> 0x006e }
    L_0x0031:
        r3 = r0[r1];	 Catch:{ all -> 0x006e }
        r4 = 0;
        r5 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0058 }
        r6 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0058 }
        r6.<init>(r3);	 Catch:{ IOException -> 0x0058 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x0058 }
        r4 = com.google.android.m4b.maps.p102b.C6422c.C4736a.m21075a(r5);	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r6 = r3.length();	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r4.f17377a = r6;	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r6 = r4.f17378b;	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r8.m28052a(r6, r4);	 Catch:{ IOException -> 0x0054, all -> 0x0051 }
        r5.close();	 Catch:{ IOException -> 0x0069 }
        goto L_0x0069;
    L_0x0051:
        r0 = move-exception;
        r4 = r5;
        goto L_0x005e;
    L_0x0054:
        r4 = r5;
        goto L_0x0058;
    L_0x0056:
        r0 = move-exception;
        goto L_0x005e;
    L_0x0058:
        if (r3 == 0) goto L_0x0064;
    L_0x005a:
        r3.delete();	 Catch:{ all -> 0x0056 }
        goto L_0x0064;
    L_0x005e:
        if (r4 == 0) goto L_0x0063;
    L_0x0060:
        r4.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0063:
        throw r0;	 Catch:{ all -> 0x006e }
    L_0x0064:
        if (r4 == 0) goto L_0x0069;
    L_0x0066:
        r4.close();	 Catch:{ IOException -> 0x0069 }
    L_0x0069:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x006c:
        monitor-exit(r8);
        return;
    L_0x006e:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.c.a():void");
    }

    /* renamed from: a */
    public final synchronized void mo4902a(java.lang.String r20, com.google.android.m4b.maps.p101a.C4515b.C4514a r21) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r2 = r20;
        r3 = r21;
        monitor-enter(r19);
        r4 = r3.f16770a;	 Catch:{ all -> 0x011a }
        r4 = r4.length;	 Catch:{ all -> 0x011a }
        r5 = r1.f23830b;	 Catch:{ all -> 0x011a }
        r7 = (long) r4;	 Catch:{ all -> 0x011a }
        r9 = r5 + r7;	 Catch:{ all -> 0x011a }
        r4 = r1.f23832d;	 Catch:{ all -> 0x011a }
        r4 = (long) r4;	 Catch:{ all -> 0x011a }
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));	 Catch:{ all -> 0x011a }
        r5 = 0;	 Catch:{ all -> 0x011a }
        if (r6 < 0) goto L_0x00c8;	 Catch:{ all -> 0x011a }
    L_0x0017:
        r6 = com.google.android.m4b.maps.p101a.C4535s.f16849a;	 Catch:{ all -> 0x011a }
        if (r6 == 0) goto L_0x0022;	 Catch:{ all -> 0x011a }
    L_0x001b:
        r6 = "Pruning old cache entries.";	 Catch:{ all -> 0x011a }
        r9 = new java.lang.Object[r5];	 Catch:{ all -> 0x011a }
        com.google.android.m4b.maps.p101a.C4535s.m20467a(r6, r9);	 Catch:{ all -> 0x011a }
    L_0x0022:
        r9 = r1.f23830b;	 Catch:{ all -> 0x011a }
        r11 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x011a }
        r6 = r1.f23829a;	 Catch:{ all -> 0x011a }
        r6 = r6.entrySet();	 Catch:{ all -> 0x011a }
        r6 = r6.iterator();	 Catch:{ all -> 0x011a }
        r13 = 0;	 Catch:{ all -> 0x011a }
    L_0x0033:
        r14 = r6.hasNext();	 Catch:{ all -> 0x011a }
        r15 = 2;	 Catch:{ all -> 0x011a }
        if (r14 == 0) goto L_0x009a;	 Catch:{ all -> 0x011a }
    L_0x003a:
        r14 = r6.next();	 Catch:{ all -> 0x011a }
        r14 = (java.util.Map.Entry) r14;	 Catch:{ all -> 0x011a }
        r14 = r14.getValue();	 Catch:{ all -> 0x011a }
        r14 = (com.google.android.m4b.maps.p102b.C6422c.C4736a) r14;	 Catch:{ all -> 0x011a }
        r4 = r14.f17378b;	 Catch:{ all -> 0x011a }
        r4 = r1.m28058d(r4);	 Catch:{ all -> 0x011a }
        r4 = r4.delete();	 Catch:{ all -> 0x011a }
        if (r4 == 0) goto L_0x0062;	 Catch:{ all -> 0x011a }
    L_0x0052:
        r16 = r6;	 Catch:{ all -> 0x011a }
        r5 = r1.f23830b;	 Catch:{ all -> 0x011a }
        r3 = r14.f17377a;	 Catch:{ all -> 0x011a }
        r14 = 0;	 Catch:{ all -> 0x011a }
        r17 = r11;	 Catch:{ all -> 0x011a }
        r11 = r5 - r3;	 Catch:{ all -> 0x011a }
        r1.f23830b = r11;	 Catch:{ all -> 0x011a }
    L_0x005f:
        r3 = r16;	 Catch:{ all -> 0x011a }
        goto L_0x007c;	 Catch:{ all -> 0x011a }
    L_0x0062:
        r16 = r6;	 Catch:{ all -> 0x011a }
        r17 = r11;	 Catch:{ all -> 0x011a }
        r3 = "Could not delete cache entry for key=%s, filename=%s";	 Catch:{ all -> 0x011a }
        r4 = new java.lang.Object[r15];	 Catch:{ all -> 0x011a }
        r5 = r14.f17378b;	 Catch:{ all -> 0x011a }
        r6 = 0;	 Catch:{ all -> 0x011a }
        r4[r6] = r5;	 Catch:{ all -> 0x011a }
        r5 = r14.f17378b;	 Catch:{ all -> 0x011a }
        r5 = com.google.android.m4b.maps.p102b.C6422c.m28057c(r5);	 Catch:{ all -> 0x011a }
        r6 = 1;	 Catch:{ all -> 0x011a }
        r4[r6] = r5;	 Catch:{ all -> 0x011a }
        com.google.android.m4b.maps.p101a.C4535s.m20469b(r3, r4);	 Catch:{ all -> 0x011a }
        goto L_0x005f;	 Catch:{ all -> 0x011a }
    L_0x007c:
        r3.remove();	 Catch:{ all -> 0x011a }
        r13 = r13 + 1;	 Catch:{ all -> 0x011a }
        r4 = r1.f23830b;	 Catch:{ all -> 0x011a }
        r6 = 0;	 Catch:{ all -> 0x011a }
        r11 = r4 + r7;	 Catch:{ all -> 0x011a }
        r4 = (float) r11;	 Catch:{ all -> 0x011a }
        r5 = r1.f23832d;	 Catch:{ all -> 0x011a }
        r5 = (float) r5;	 Catch:{ all -> 0x011a }
        r6 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;	 Catch:{ all -> 0x011a }
        r5 = r5 * r6;	 Catch:{ all -> 0x011a }
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));	 Catch:{ all -> 0x011a }
        if (r4 < 0) goto L_0x009c;	 Catch:{ all -> 0x011a }
    L_0x0093:
        r6 = r3;	 Catch:{ all -> 0x011a }
        r11 = r17;	 Catch:{ all -> 0x011a }
        r3 = r21;	 Catch:{ all -> 0x011a }
        r5 = 0;	 Catch:{ all -> 0x011a }
        goto L_0x0033;	 Catch:{ all -> 0x011a }
    L_0x009a:
        r17 = r11;	 Catch:{ all -> 0x011a }
    L_0x009c:
        r3 = com.google.android.m4b.maps.p101a.C4535s.f16849a;	 Catch:{ all -> 0x011a }
        if (r3 == 0) goto L_0x00c8;	 Catch:{ all -> 0x011a }
    L_0x00a0:
        r3 = "pruned %d files, %d bytes, %d ms";	 Catch:{ all -> 0x011a }
        r4 = 3;	 Catch:{ all -> 0x011a }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x011a }
        r5 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x011a }
        r6 = 0;	 Catch:{ all -> 0x011a }
        r4[r6] = r5;	 Catch:{ all -> 0x011a }
        r5 = r1.f23830b;	 Catch:{ all -> 0x011a }
        r7 = 0;	 Catch:{ all -> 0x011a }
        r7 = r5 - r9;	 Catch:{ all -> 0x011a }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x011a }
        r6 = 1;	 Catch:{ all -> 0x011a }
        r4[r6] = r5;	 Catch:{ all -> 0x011a }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x011a }
        r7 = 0;	 Catch:{ all -> 0x011a }
        r7 = r5 - r17;	 Catch:{ all -> 0x011a }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x011a }
        r4[r15] = r5;	 Catch:{ all -> 0x011a }
        com.google.android.m4b.maps.p101a.C4535s.m20467a(r3, r4);	 Catch:{ all -> 0x011a }
    L_0x00c8:
        r3 = r19.m28058d(r20);	 Catch:{ all -> 0x011a }
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0103 }
        r4.<init>(r3);	 Catch:{ IOException -> 0x0103 }
        r5 = new com.google.android.m4b.maps.b.c$a;	 Catch:{ IOException -> 0x0103 }
        r6 = r21;	 Catch:{ IOException -> 0x0103 }
        r5.<init>(r2, r6);	 Catch:{ IOException -> 0x0103 }
        r7 = r5.m21076a(r4);	 Catch:{ IOException -> 0x0103 }
        if (r7 != 0) goto L_0x00f6;	 Catch:{ IOException -> 0x0103 }
    L_0x00de:
        r4.close();	 Catch:{ IOException -> 0x0103 }
        r2 = "Failed to write header for %s";	 Catch:{ IOException -> 0x0103 }
        r4 = 1;	 Catch:{ IOException -> 0x0103 }
        r5 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0103 }
        r4 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x0103 }
        r6 = 0;	 Catch:{ IOException -> 0x0103 }
        r5[r6] = r4;	 Catch:{ IOException -> 0x0103 }
        com.google.android.m4b.maps.p101a.C4535s.m20469b(r2, r5);	 Catch:{ IOException -> 0x0103 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0103 }
        r2.<init>();	 Catch:{ IOException -> 0x0103 }
        throw r2;	 Catch:{ IOException -> 0x0103 }
    L_0x00f6:
        r6 = r6.f16770a;	 Catch:{ IOException -> 0x0103 }
        r4.write(r6);	 Catch:{ IOException -> 0x0103 }
        r4.close();	 Catch:{ IOException -> 0x0103 }
        r1.m28052a(r2, r5);	 Catch:{ IOException -> 0x0103 }
        monitor-exit(r19);
        return;
    L_0x0103:
        r2 = r3.delete();	 Catch:{ all -> 0x011a }
        if (r2 != 0) goto L_0x0118;	 Catch:{ all -> 0x011a }
    L_0x0109:
        r2 = "Could not clean up file %s";	 Catch:{ all -> 0x011a }
        r4 = 1;	 Catch:{ all -> 0x011a }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x011a }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x011a }
        r5 = 0;	 Catch:{ all -> 0x011a }
        r4[r5] = r3;	 Catch:{ all -> 0x011a }
        com.google.android.m4b.maps.p101a.C4535s.m20469b(r2, r4);	 Catch:{ all -> 0x011a }
    L_0x0118:
        monitor-exit(r19);
        return;
    L_0x011a:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r19);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.b.c.a(java.lang.String, com.google.android.m4b.maps.a.b$a):void");
    }

    /* renamed from: b */
    private synchronized void m28055b(String str) {
        boolean delete = m28058d(str).delete();
        C4736a c4736a = (C4736a) this.f23829a.get(str);
        if (c4736a != null) {
            this.f23830b -= c4736a.f17377a;
            this.f23829a.remove(str);
        }
        if (!delete) {
            C4535s.m20469b("Could not delete cache entry for key=%s, filename=%s", str, C6422c.m28057c(str));
        }
    }

    /* renamed from: c */
    private static String m28057c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(valueOf);
        stringBuilder.append(String.valueOf(str.substring(length).hashCode()));
        return stringBuilder.toString();
    }

    /* renamed from: d */
    private File m28058d(String str) {
        return new File(this.f23831c, C6422c.m28057c(str));
    }

    /* renamed from: a */
    private void m28052a(String str, C4736a c4736a) {
        if (this.f23829a.containsKey(str)) {
            this.f23830b += c4736a.f17377a - ((C4736a) this.f23829a.get(str)).f17377a;
        } else {
            this.f23830b += c4736a.f17377a;
        }
        this.f23829a.put(str, c4736a);
    }

    /* renamed from: a */
    private static byte[] m28053a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        stringBuilder.append(i);
        stringBuilder.append(" bytes, read ");
        stringBuilder.append(i2);
        stringBuilder.append(" bytes");
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: e */
    private static int m28060e(InputStream inputStream) {
        inputStream = inputStream.read();
        if (inputStream != -1) {
            return inputStream;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m28049a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static int m28048a(InputStream inputStream) {
        return (C6422c.m28060e(inputStream) << 24) | ((((C6422c.m28060e(inputStream) << 0) | 0) | (C6422c.m28060e(inputStream) << 8)) | (C6422c.m28060e(inputStream) << 16));
    }

    /* renamed from: a */
    static void m28050a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: b */
    static long m28054b(InputStream inputStream) {
        return (((((((((((long) C6422c.m28060e(inputStream)) & 255) << null) | 0) | ((((long) C6422c.m28060e(inputStream)) & 255) << 8)) | ((((long) C6422c.m28060e(inputStream)) & 255) << 16)) | ((((long) C6422c.m28060e(inputStream)) & 255) << 24)) | ((((long) C6422c.m28060e(inputStream)) & 255) << 32)) | ((((long) C6422c.m28060e(inputStream)) & 255) << 40)) | ((((long) C6422c.m28060e(inputStream)) & 255) << 48)) | ((((long) C6422c.m28060e(inputStream)) & 255) << 56);
    }

    /* renamed from: a */
    static void m28051a(OutputStream outputStream, String str) {
        str = str.getBytes("UTF-8");
        C6422c.m28050a(outputStream, (long) str.length);
        outputStream.write(str, 0, str.length);
    }

    /* renamed from: c */
    static String m28056c(InputStream inputStream) {
        return new String(C6422c.m28053a(inputStream, (int) C6422c.m28054b(inputStream)), "UTF-8");
    }

    /* renamed from: d */
    static Map<String, String> m28059d(InputStream inputStream) {
        int a = C6422c.m28048a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(C6422c.m28056c(inputStream).intern(), C6422c.m28056c(inputStream).intern());
        }
        return emptyMap;
    }
}
