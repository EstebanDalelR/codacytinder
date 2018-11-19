package com.google.android.gms.internal;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class iq implements zzb {
    /* renamed from: a */
    private final Map<String, jo> f23328a;
    /* renamed from: b */
    private long f23329b;
    /* renamed from: c */
    private final File f23330c;
    /* renamed from: d */
    private final int f23331d;

    public iq(File file) {
        this(file, 5242880);
    }

    private iq(File file, int i) {
        this.f23328a = new LinkedHashMap(16, 0.75f, true);
        this.f23329b = 0;
        this.f23330c = file;
        this.f23331d = 5242880;
    }

    /* renamed from: a */
    static int m27347a(InputStream inputStream) throws IOException {
        return (m27359c(inputStream) << 24) | (((m27359c(inputStream) | 0) | (m27359c(inputStream) << 8)) | (m27359c(inputStream) << 16));
    }

    /* renamed from: a */
    private static InputStream m27348a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    static String m27349a(kn knVar) throws IOException {
        return new String(m27355a(knVar, m27356b((InputStream) knVar)), "UTF-8");
    }

    /* renamed from: a */
    static void m27350a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static void m27351a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m27352a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m27351a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private final synchronized void m27353a(String str) {
        boolean delete = m27360c(str).delete();
        m27361d(str);
        if (!delete) {
            cg.m19569b("Could not delete cache entry for key=%s, filename=%s", str, m27357b(str));
        }
    }

    /* renamed from: a */
    private final void m27354a(String str, jo joVar) {
        if (this.f23328a.containsKey(str)) {
            this.f23329b += joVar.f16215a - ((jo) this.f23328a.get(str)).f16215a;
        } else {
            this.f23329b += joVar.f16215a;
        }
        this.f23328a.put(str, joVar);
    }

    /* renamed from: a */
    private static byte[] m27355a(kn knVar, long j) throws IOException {
        long a = knVar.m19984a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(knVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(73);
        stringBuilder.append("streamToBytes length=");
        stringBuilder.append(j);
        stringBuilder.append(", maxLength=");
        stringBuilder.append(a);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: b */
    static long m27356b(InputStream inputStream) throws IOException {
        return ((((((((((long) m27359c(inputStream)) & 255) | 0) | ((((long) m27359c(inputStream)) & 255) << 8)) | ((((long) m27359c(inputStream)) & 255) << 16)) | ((((long) m27359c(inputStream)) & 255) << 24)) | ((((long) m27359c(inputStream)) & 255) << 32)) | ((((long) m27359c(inputStream)) & 255) << 40)) | ((((long) m27359c(inputStream)) & 255) << 48)) | ((((long) m27359c(inputStream)) & 255) << 56);
    }

    /* renamed from: b */
    private static String m27357b(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        str = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: b */
    static List<ajr> m27358b(kn knVar) throws IOException {
        int a = m27347a((InputStream) knVar);
        List<ajr> emptyList = a == 0 ? Collections.emptyList() : new ArrayList(a);
        for (int i = 0; i < a; i++) {
            emptyList.add(new ajr(m27349a(knVar).intern(), m27349a(knVar).intern()));
        }
        return emptyList;
    }

    /* renamed from: c */
    private static int m27359c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    private final File m27360c(String str) {
        return new File(this.f23330c, m27357b(str));
    }

    /* renamed from: d */
    private final void m27361d(String str) {
        jo joVar = (jo) this.f23328a.remove(str);
        if (joVar != null) {
            this.f23329b -= joVar.f16215a;
        }
    }

    public final synchronized void initialize() {
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
        r9 = this;
        monitor-enter(r9);
        r0 = r9.f23330c;	 Catch:{ all -> 0x0061 }
        r0 = r0.exists();	 Catch:{ all -> 0x0061 }
        r1 = 0;	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0024;	 Catch:{ all -> 0x0061 }
    L_0x000a:
        r0 = r9.f23330c;	 Catch:{ all -> 0x0061 }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x0061 }
    L_0x0012:
        r0 = "Unable to create cache dir %s";	 Catch:{ all -> 0x0061 }
        r2 = 1;	 Catch:{ all -> 0x0061 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0061 }
        r3 = r9.f23330c;	 Catch:{ all -> 0x0061 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0061 }
        r2[r1] = r3;	 Catch:{ all -> 0x0061 }
        com.google.android.gms.internal.cg.m19570c(r0, r2);	 Catch:{ all -> 0x0061 }
    L_0x0022:
        monitor-exit(r9);
        return;
    L_0x0024:
        r0 = r9.f23330c;	 Catch:{ all -> 0x0061 }
        r0 = r0.listFiles();	 Catch:{ all -> 0x0061 }
        if (r0 != 0) goto L_0x002e;
    L_0x002c:
        monitor-exit(r9);
        return;
    L_0x002e:
        r2 = r0.length;	 Catch:{ all -> 0x0061 }
    L_0x002f:
        if (r1 >= r2) goto L_0x005f;	 Catch:{ all -> 0x0061 }
    L_0x0031:
        r3 = r0[r1];	 Catch:{ all -> 0x0061 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0059 }
        r6 = new com.google.android.gms.internal.kn;	 Catch:{ IOException -> 0x0059 }
        r7 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0059 }
        r8 = m27348a(r3);	 Catch:{ IOException -> 0x0059 }
        r7.<init>(r8);	 Catch:{ IOException -> 0x0059 }
        r6.<init>(r7, r4);	 Catch:{ IOException -> 0x0059 }
        r7 = com.google.android.gms.internal.jo.m19943a(r6);	 Catch:{ all -> 0x0054 }
        r7.f16215a = r4;	 Catch:{ all -> 0x0054 }
        r4 = r7.f16216b;	 Catch:{ all -> 0x0054 }
        r9.m27354a(r4, r7);	 Catch:{ all -> 0x0054 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        goto L_0x005c;	 Catch:{ IOException -> 0x0059 }
    L_0x0054:
        r4 = move-exception;	 Catch:{ IOException -> 0x0059 }
        r6.close();	 Catch:{ IOException -> 0x0059 }
        throw r4;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r3.delete();	 Catch:{ all -> 0x0061 }
    L_0x005c:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x005f:
        monitor-exit(r9);
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.iq.initialize():void");
    }

    public final synchronized pt zza(String str) {
        kn knVar;
        jo joVar = (jo) this.f23328a.get(str);
        if (joVar == null) {
            return null;
        }
        File c = m27360c(str);
        try {
            knVar = new kn(new BufferedInputStream(m27348a(c)), c.length());
            if (TextUtils.equals(str, jo.m19943a(knVar).f16216b)) {
                byte[] a = m27355a(knVar, knVar.m19984a());
                pt ptVar = new pt();
                ptVar.f16398a = a;
                ptVar.f16399b = joVar.f16217c;
                ptVar.f16400c = joVar.f16218d;
                ptVar.f16401d = joVar.f16219e;
                ptVar.f16402e = joVar.f16220f;
                ptVar.f16403f = joVar.f16221g;
                ptVar.f16404g = lh.m20032a(joVar.f16222h);
                ptVar.f16405h = Collections.unmodifiableList(joVar.f16222h);
                knVar.close();
                return ptVar;
            }
            cg.m19569b("%s: key=%s, found=%s", c.getAbsolutePath(), str, jo.m19943a(knVar).f16216b);
            m27361d(str);
            knVar.close();
            return null;
        } catch (IOException e) {
            cg.m19569b("%s: %s", c.getAbsolutePath(), e.toString());
            m27353a(str);
            return null;
        } catch (Throwable th) {
            knVar.close();
        }
    }

    public final synchronized void zza(java.lang.String r20, com.google.android.gms.internal.pt r21) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r19 = this;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        monitor-enter(r19);
        r4 = r3.f16398a;	 Catch:{ all -> 0x0120 }
        r4 = r4.length;	 Catch:{ all -> 0x0120 }
        r5 = r1.f23329b;	 Catch:{ all -> 0x0120 }
        r7 = (long) r4;	 Catch:{ all -> 0x0120 }
        r9 = r5 + r7;	 Catch:{ all -> 0x0120 }
        r4 = r1.f23331d;	 Catch:{ all -> 0x0120 }
        r4 = (long) r4;	 Catch:{ all -> 0x0120 }
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));	 Catch:{ all -> 0x0120 }
        r5 = 0;	 Catch:{ all -> 0x0120 }
        if (r6 < 0) goto L_0x00c9;	 Catch:{ all -> 0x0120 }
    L_0x0017:
        r6 = com.google.android.gms.internal.cg.f15916a;	 Catch:{ all -> 0x0120 }
        if (r6 == 0) goto L_0x0022;	 Catch:{ all -> 0x0120 }
    L_0x001b:
        r6 = "Pruning old cache entries.";	 Catch:{ all -> 0x0120 }
        r9 = new java.lang.Object[r5];	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.cg.m19567a(r6, r9);	 Catch:{ all -> 0x0120 }
    L_0x0022:
        r9 = r1.f23329b;	 Catch:{ all -> 0x0120 }
        r11 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0120 }
        r6 = r1.f23328a;	 Catch:{ all -> 0x0120 }
        r6 = r6.entrySet();	 Catch:{ all -> 0x0120 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0120 }
        r13 = 0;	 Catch:{ all -> 0x0120 }
    L_0x0033:
        r14 = r6.hasNext();	 Catch:{ all -> 0x0120 }
        r15 = 2;	 Catch:{ all -> 0x0120 }
        if (r14 == 0) goto L_0x009b;	 Catch:{ all -> 0x0120 }
    L_0x003a:
        r14 = r6.next();	 Catch:{ all -> 0x0120 }
        r14 = (java.util.Map.Entry) r14;	 Catch:{ all -> 0x0120 }
        r14 = r14.getValue();	 Catch:{ all -> 0x0120 }
        r14 = (com.google.android.gms.internal.jo) r14;	 Catch:{ all -> 0x0120 }
        r4 = r14.f16216b;	 Catch:{ all -> 0x0120 }
        r4 = r1.m27360c(r4);	 Catch:{ all -> 0x0120 }
        r4 = r4.delete();	 Catch:{ all -> 0x0120 }
        if (r4 == 0) goto L_0x0062;	 Catch:{ all -> 0x0120 }
    L_0x0052:
        r16 = r6;	 Catch:{ all -> 0x0120 }
        r5 = r1.f23329b;	 Catch:{ all -> 0x0120 }
        r3 = r14.f16215a;	 Catch:{ all -> 0x0120 }
        r14 = 0;	 Catch:{ all -> 0x0120 }
        r17 = r11;	 Catch:{ all -> 0x0120 }
        r11 = r5 - r3;	 Catch:{ all -> 0x0120 }
        r1.f23329b = r11;	 Catch:{ all -> 0x0120 }
    L_0x005f:
        r3 = r16;	 Catch:{ all -> 0x0120 }
        goto L_0x007c;	 Catch:{ all -> 0x0120 }
    L_0x0062:
        r16 = r6;	 Catch:{ all -> 0x0120 }
        r17 = r11;	 Catch:{ all -> 0x0120 }
        r3 = "Could not delete cache entry for key=%s, filename=%s";	 Catch:{ all -> 0x0120 }
        r4 = new java.lang.Object[r15];	 Catch:{ all -> 0x0120 }
        r5 = r14.f16216b;	 Catch:{ all -> 0x0120 }
        r6 = 0;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        r5 = r14.f16216b;	 Catch:{ all -> 0x0120 }
        r5 = m27357b(r5);	 Catch:{ all -> 0x0120 }
        r6 = 1;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.cg.m19569b(r3, r4);	 Catch:{ all -> 0x0120 }
        goto L_0x005f;	 Catch:{ all -> 0x0120 }
    L_0x007c:
        r3.remove();	 Catch:{ all -> 0x0120 }
        r13 = r13 + 1;	 Catch:{ all -> 0x0120 }
        r4 = r1.f23329b;	 Catch:{ all -> 0x0120 }
        r6 = 0;	 Catch:{ all -> 0x0120 }
        r11 = r4 + r7;	 Catch:{ all -> 0x0120 }
        r4 = (float) r11;	 Catch:{ all -> 0x0120 }
        r5 = r1.f23331d;	 Catch:{ all -> 0x0120 }
        r5 = (float) r5;	 Catch:{ all -> 0x0120 }
        r6 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;	 Catch:{ all -> 0x0120 }
        r5 = r5 * r6;	 Catch:{ all -> 0x0120 }
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));	 Catch:{ all -> 0x0120 }
        if (r4 >= 0) goto L_0x0094;	 Catch:{ all -> 0x0120 }
    L_0x0093:
        goto L_0x009d;	 Catch:{ all -> 0x0120 }
    L_0x0094:
        r6 = r3;	 Catch:{ all -> 0x0120 }
        r11 = r17;	 Catch:{ all -> 0x0120 }
        r3 = r21;	 Catch:{ all -> 0x0120 }
        r5 = 0;	 Catch:{ all -> 0x0120 }
        goto L_0x0033;	 Catch:{ all -> 0x0120 }
    L_0x009b:
        r17 = r11;	 Catch:{ all -> 0x0120 }
    L_0x009d:
        r3 = com.google.android.gms.internal.cg.f15916a;	 Catch:{ all -> 0x0120 }
        if (r3 == 0) goto L_0x00c9;	 Catch:{ all -> 0x0120 }
    L_0x00a1:
        r3 = "pruned %d files, %d bytes, %d ms";	 Catch:{ all -> 0x0120 }
        r4 = 3;	 Catch:{ all -> 0x0120 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0120 }
        r5 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0120 }
        r6 = 0;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        r5 = r1.f23329b;	 Catch:{ all -> 0x0120 }
        r7 = 0;	 Catch:{ all -> 0x0120 }
        r7 = r5 - r9;	 Catch:{ all -> 0x0120 }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0120 }
        r6 = 1;	 Catch:{ all -> 0x0120 }
        r4[r6] = r5;	 Catch:{ all -> 0x0120 }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0120 }
        r7 = 0;	 Catch:{ all -> 0x0120 }
        r7 = r5 - r17;	 Catch:{ all -> 0x0120 }
        r5 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0120 }
        r4[r15] = r5;	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.cg.m19567a(r3, r4);	 Catch:{ all -> 0x0120 }
    L_0x00c9:
        r3 = r19.m27360c(r20);	 Catch:{ all -> 0x0120 }
        r4 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x0109 }
        r5 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0109 }
        r5.<init>(r3);	 Catch:{ IOException -> 0x0109 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x0109 }
        r5 = new com.google.android.gms.internal.jo;	 Catch:{ IOException -> 0x0109 }
        r6 = r21;	 Catch:{ IOException -> 0x0109 }
        r5.<init>(r2, r6);	 Catch:{ IOException -> 0x0109 }
        r7 = r5.m19944a(r4);	 Catch:{ IOException -> 0x0109 }
        if (r7 != 0) goto L_0x00fc;	 Catch:{ IOException -> 0x0109 }
    L_0x00e4:
        r4.close();	 Catch:{ IOException -> 0x0109 }
        r2 = "Failed to write header for %s";	 Catch:{ IOException -> 0x0109 }
        r4 = 1;	 Catch:{ IOException -> 0x0109 }
        r5 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0109 }
        r4 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x0109 }
        r6 = 0;	 Catch:{ IOException -> 0x0109 }
        r5[r6] = r4;	 Catch:{ IOException -> 0x0109 }
        com.google.android.gms.internal.cg.m19569b(r2, r5);	 Catch:{ IOException -> 0x0109 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0109 }
        r2.<init>();	 Catch:{ IOException -> 0x0109 }
        throw r2;	 Catch:{ IOException -> 0x0109 }
    L_0x00fc:
        r6 = r6.f16398a;	 Catch:{ IOException -> 0x0109 }
        r4.write(r6);	 Catch:{ IOException -> 0x0109 }
        r4.close();	 Catch:{ IOException -> 0x0109 }
        r1.m27354a(r2, r5);	 Catch:{ IOException -> 0x0109 }
        monitor-exit(r19);
        return;
    L_0x0109:
        r2 = r3.delete();	 Catch:{ all -> 0x0120 }
        if (r2 != 0) goto L_0x011e;	 Catch:{ all -> 0x0120 }
    L_0x010f:
        r2 = "Could not clean up file %s";	 Catch:{ all -> 0x0120 }
        r4 = 1;	 Catch:{ all -> 0x0120 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0120 }
        r3 = r3.getAbsolutePath();	 Catch:{ all -> 0x0120 }
        r5 = 0;	 Catch:{ all -> 0x0120 }
        r4[r5] = r3;	 Catch:{ all -> 0x0120 }
        com.google.android.gms.internal.cg.m19569b(r2, r4);	 Catch:{ all -> 0x0120 }
    L_0x011e:
        monitor-exit(r19);
        return;
    L_0x0120:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r19);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.iq.zza(java.lang.String, com.google.android.gms.internal.pt):void");
    }
}
