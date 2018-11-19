package com.facebook.network.connectionclass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.facebook.network.connectionclass.e */
class C1802e {
    @Nullable
    /* renamed from: a */
    public static C1802e f4927a = null;
    /* renamed from: b */
    private static final ThreadLocal<byte[]> f4928b = new C18011();
    /* renamed from: c */
    private static long f4929c = -1;
    /* renamed from: d */
    private static C1800d f4930d = new C1800d();
    /* renamed from: e */
    private static C1794a f4931e = new C1794a();
    /* renamed from: f */
    private String f4932f;

    /* renamed from: com.facebook.network.connectionclass.e$1 */
    static class C18011 extends ThreadLocal<byte[]> {
        C18011() {
        }

        public /* synthetic */ Object initialValue() {
            return m6211a();
        }

        /* renamed from: a */
        public byte[] m6211a() {
            return new byte[512];
        }
    }

    @Nonnull
    /* renamed from: a */
    public static synchronized C1802e m6212a() {
        C1802e c1802e;
        synchronized (C1802e.class) {
            if (f4927a == null) {
                f4927a = new C1802e("/proc/net/xt_qtaguid/stats");
            }
            c1802e = f4927a;
        }
        return c1802e;
    }

    public C1802e(String str) {
        this.f4932f = str;
    }

    /* renamed from: a */
    public long m6213a(int r13) {
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
        r12 = this;
        r0 = android.os.StrictMode.allowThreadDiskReads();
        r1 = 0;
        r3 = -1;
        r5 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00c0 }
        r6 = r12.f4932f;	 Catch:{ IOException -> 0x00c0 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x00c0 }
        r6 = f4930d;	 Catch:{ IOException -> 0x00c0 }
        r6.m6210a(r5);	 Catch:{ IOException -> 0x00c0 }
        r6 = f4928b;	 Catch:{ IOException -> 0x00c0 }
        r6 = r6.get();	 Catch:{ IOException -> 0x00c0 }
        r6 = (byte[]) r6;	 Catch:{ IOException -> 0x00c0 }
        r7 = f4930d;	 Catch:{ all -> 0x00b9 }
        r7.m6209a();	 Catch:{ all -> 0x00b9 }
        r7 = 2;	 Catch:{ all -> 0x00b9 }
    L_0x0022:
        r8 = f4930d;	 Catch:{ all -> 0x00b9 }
        r8 = r8.m6208a(r6);	 Catch:{ all -> 0x00b9 }
        r9 = -1;
        if (r8 == r9) goto L_0x009f;
    L_0x002b:
        r9 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r9.m6195a(r6, r8);	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r9 = 32;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8.m6194a(r9);	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8.m6197b();	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r9 = "lo";	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = r8.m6196a(r9);	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        if (r8 == 0) goto L_0x0047;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
    L_0x0046:
        goto L_0x0022;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
    L_0x0047:
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8.m6197b();	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = r8.m6193a();	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        if (r8 == r13) goto L_0x0055;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
    L_0x0054:
        goto L_0x0022;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
    L_0x0055:
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8.m6197b();	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = f4931e;	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = r8.m6193a();	 Catch:{ NumberFormatException -> 0x0083, NoSuchElementException -> 0x0067 }
        r8 = (long) r8;
        r10 = r1 + r8;
        r7 = r7 + 1;
        r1 = r10;
        goto L_0x0022;
    L_0x0067:
        r8 = "QTagParser";	 Catch:{ all -> 0x00b9 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b9 }
        r9.<init>();	 Catch:{ all -> 0x00b9 }
        r10 = "Invalid number of tokens on line ";	 Catch:{ all -> 0x00b9 }
        r9.append(r10);	 Catch:{ all -> 0x00b9 }
        r9.append(r7);	 Catch:{ all -> 0x00b9 }
        r10 = ".";	 Catch:{ all -> 0x00b9 }
        r9.append(r10);	 Catch:{ all -> 0x00b9 }
        r9 = r9.toString();	 Catch:{ all -> 0x00b9 }
        android.util.Log.e(r8, r9);	 Catch:{ all -> 0x00b9 }
        goto L_0x0022;	 Catch:{ all -> 0x00b9 }
    L_0x0083:
        r8 = "QTagParser";	 Catch:{ all -> 0x00b9 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b9 }
        r9.<init>();	 Catch:{ all -> 0x00b9 }
        r10 = "Cannot parse byte count at line";	 Catch:{ all -> 0x00b9 }
        r9.append(r10);	 Catch:{ all -> 0x00b9 }
        r9.append(r7);	 Catch:{ all -> 0x00b9 }
        r10 = ".";	 Catch:{ all -> 0x00b9 }
        r9.append(r10);	 Catch:{ all -> 0x00b9 }
        r9 = r9.toString();	 Catch:{ all -> 0x00b9 }
        android.util.Log.e(r8, r9);	 Catch:{ all -> 0x00b9 }
        goto L_0x0022;
    L_0x009f:
        r5.close();	 Catch:{ IOException -> 0x00c0 }
        r5 = f4929c;	 Catch:{ IOException -> 0x00c0 }
        r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));	 Catch:{ IOException -> 0x00c0 }
        if (r13 != 0) goto L_0x00ae;	 Catch:{ IOException -> 0x00c0 }
    L_0x00a8:
        f4929c = r1;	 Catch:{ IOException -> 0x00c0 }
        android.os.StrictMode.setThreadPolicy(r0);
        return r3;
    L_0x00ae:
        r5 = f4929c;	 Catch:{ IOException -> 0x00c0 }
        r13 = 0;	 Catch:{ IOException -> 0x00c0 }
        r7 = r1 - r5;	 Catch:{ IOException -> 0x00c0 }
        f4929c = r1;	 Catch:{ IOException -> 0x00c0 }
        android.os.StrictMode.setThreadPolicy(r0);
        return r7;
    L_0x00b9:
        r13 = move-exception;
        r5.close();	 Catch:{ IOException -> 0x00c0 }
        throw r13;	 Catch:{ IOException -> 0x00c0 }
    L_0x00be:
        r13 = move-exception;
        goto L_0x00cb;
    L_0x00c0:
        r13 = "QTagParser";	 Catch:{ all -> 0x00be }
        r1 = "Error reading from /proc/net/xt_qtaguid/stats. Please check if this file exists.";	 Catch:{ all -> 0x00be }
        android.util.Log.e(r13, r1);	 Catch:{ all -> 0x00be }
        android.os.StrictMode.setThreadPolicy(r0);
        return r3;
    L_0x00cb:
        android.os.StrictMode.setThreadPolicy(r0);
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.network.connectionclass.e.a(int):long");
    }
}
