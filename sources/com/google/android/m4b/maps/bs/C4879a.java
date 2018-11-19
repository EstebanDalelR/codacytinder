package com.google.android.m4b.maps.bs;

import android.util.Log;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4664b;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bs.C4891e.C4884c;
import com.google.android.m4b.maps.p125y.C5571j;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.bs.a */
public final class C4879a {
    /* renamed from: a */
    private static final Locale f17896a = new Locale("");
    /* renamed from: b */
    private C4891e f17897b;
    /* renamed from: c */
    private final String f17898c;
    /* renamed from: d */
    private final C4712d f17899d;
    /* renamed from: e */
    private final Map<String, C4877b> f17900e = Collections.synchronizedMap(ax.m20623b());
    /* renamed from: f */
    private final C4664b f17901f;
    /* renamed from: g */
    private final int f17902g;
    /* renamed from: h */
    private final long f17903h;
    /* renamed from: i */
    private C4876a f17904i;

    /* renamed from: com.google.android.m4b.maps.bs.a$a */
    static class C4876a extends Thread {
        /* renamed from: a */
        private final int f17889a;
        /* renamed from: b */
        private final C4879a f17890b;

        C4876a(String str, int i, C4879a c4879a) {
            String str2 = "CacheCommitter:";
            str = String.valueOf(str);
            super(str.length() != 0 ? str2.concat(str) : new String(str2));
            this.f17889a = i;
            this.f17890b = c4879a;
            start();
        }

        public final void run() {
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
            r3 = this;
            r0 = com.google.android.m4b.maps.bx.ao.m22336c();	 Catch:{ SecurityException -> 0x000a }
            r0 = r0 + 1;	 Catch:{ SecurityException -> 0x000a }
            android.os.Process.setThreadPriority(r0);	 Catch:{ SecurityException -> 0x000a }
            goto L_0x001b;
        L_0x000a:
            r0 = move-exception;
            r1 = "DiskProtoBufCache";
            r2 = 6;
            r1 = com.google.android.m4b.maps.ay.C4728u.m21050a(r1, r2);
            if (r1 == 0) goto L_0x001b;
        L_0x0014:
            r1 = "DiskProtoBufCache";
            r2 = "Could not set thread priority";
            android.util.Log.e(r1, r2, r0);
        L_0x001b:
            r0 = r3.f17889a;	 Catch:{ InterruptedException -> 0x002a }
            r0 = (long) r0;	 Catch:{ InterruptedException -> 0x002a }
            com.google.android.m4b.maps.bs.C4879a.C4876a.sleep(r0);	 Catch:{ InterruptedException -> 0x002a }
            r0 = r3.f17890b;
            r0 = r0.m21836b();
            if (r0 == 0) goto L_0x001b;
        L_0x0029:
            return;
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.a.a.run():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.a$b */
    static class C4877b {
        /* renamed from: a */
        final String f17891a;
        /* renamed from: b */
        final C4662a f17892b;
        /* renamed from: c */
        final long f17893c;

        C4877b(String str, C4662a c4662a, long j) {
            this.f17891a = str;
            this.f17892b = c4662a;
            this.f17893c = j;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.a$c */
    public static class C4878c {
        /* renamed from: a */
        public final C4662a f17894a;
        /* renamed from: b */
        public final long f17895b;

        C4878c(C4662a c4662a, long j) {
            this.f17894a = (C4662a) C5571j.m24292a((Object) c4662a);
            this.f17895b = j;
        }
    }

    public C4879a(C4712d c4712d, String str, C4664b c4664b, int i, long j) {
        this.f17899d = c4712d;
        this.f17898c = str;
        this.f17901f = c4664b;
        this.f17902g = 3000;
        this.f17903h = j;
    }

    /* renamed from: a */
    public final boolean m21840a(java.io.File r10, com.google.android.m4b.maps.ch.C5203e r11) {
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
        r9 = this;
        r4 = new com.google.android.m4b.maps.bg.a$a;
        r4.<init>(r10);
        r7 = android.os.SystemClock.uptimeMillis();
        r10 = r9.f17898c;	 Catch:{ IOException -> 0x0011 }
        r0 = 0;	 Catch:{ IOException -> 0x0011 }
        r10 = com.google.android.m4b.maps.bs.C4891e.m21894a(r10, r4, r0, r11);	 Catch:{ IOException -> 0x0011 }
        goto L_0x001e;
    L_0x0011:
        r0 = r9.f17898c;	 Catch:{ IOException -> 0x0097 }
        r1 = 4090; // 0xffa float:5.731E-42 double:2.0207E-320;	 Catch:{ IOException -> 0x0097 }
        r2 = -1;	 Catch:{ IOException -> 0x0097 }
        r3 = f17896a;	 Catch:{ IOException -> 0x0097 }
        r5 = 0;	 Catch:{ IOException -> 0x0097 }
        r6 = r11;	 Catch:{ IOException -> 0x0097 }
        r10 = com.google.android.m4b.maps.bs.C4891e.m21893a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x0097 }
    L_0x001e:
        r0 = android.os.SystemClock.uptimeMillis();
        r2 = r0 - r7;
        r9.f17897b = r10;
        r10 = "DiskProtoBufCache";
        r11 = 3;
        r10 = com.google.android.m4b.maps.ay.C4728u.m21050a(r10, r11);
        if (r10 == 0) goto L_0x0095;
    L_0x002f:
        r10 = "DiskProtoBufCache";
        r11 = r9.f17898c;
        r0 = r9.f17897b;
        r0 = r0.m21937d();
        r1 = r9.f17897b;
        r1 = r1.m21928a();
        r4 = r9.f17897b;
        r4 = r4.m21936c();
        r4 = java.lang.String.valueOf(r4);
        r5 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r11);
        r6 = r6.length();
        r6 = r6 + 100;
        r7 = java.lang.String.valueOf(r4);
        r7 = r7.length();
        r6 = r6 + r7;
        r5.<init>(r6);
        r6 = "Loaded cache: ";
        r5.append(r6);
        r5.append(r11);
        r11 = " with ";
        r5.append(r11);
        r5.append(r0);
        r11 = " entries, data version: ";
        r5.append(r11);
        r5.append(r1);
        r11 = ", locale: ";
        r5.append(r11);
        r5.append(r4);
        r11 = ", ";
        r5.append(r11);
        r5.append(r2);
        r11 = "ms";
        r5.append(r11);
        r11 = r5.toString();
        android.util.Log.d(r10, r11);
    L_0x0095:
        r10 = 1;
        return r10;
    L_0x0097:
        r10 = move-exception;
        r11 = "DiskProtoBufCache";
        r0 = 6;
        r11 = com.google.android.m4b.maps.ay.C4728u.m21050a(r11, r0);
        if (r11 == 0) goto L_0x00a8;
    L_0x00a1:
        r11 = "DiskProtoBufCache";
        r0 = "Error creating the disk cache";
        android.util.Log.e(r11, r0, r10);
    L_0x00a8:
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.a.a(java.io.File, com.google.android.m4b.maps.ch.e):boolean");
    }

    /* renamed from: a */
    private long m21833a(long j) {
        return this.f17903h == 0 ? -1 : j + this.f17903h;
    }

    /* renamed from: a */
    public final void m21838a(String str, C4662a c4662a) {
        if (this.f17897b != null) {
            synchronized (this.f17900e) {
                if (this.f17900e.size() < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    this.f17900e.put(str, new C4877b(str, c4662a, C4712d.m20956b()));
                }
                if (this.f17904i == null) {
                    this.f17904i = new C4876a(this.f17898c, this.f17902g, this);
                }
            }
        }
    }

    /* renamed from: a */
    public final C4878c m21837a(String str) {
        if (this.f17897b == null) {
            return null;
        }
        C4877b c4877b = (C4877b) this.f17900e.get(str);
        if (c4877b != null) {
            return new C4878c(c4877b.f17892b, m21833a(c4877b.f17893c));
        }
        str = this.f17897b.m21933a(C4733b.m21060a(str), str);
        if (str == null) {
            return null;
        }
        InputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(str));
        try {
            dataInputStream.readInt();
            long readLong = dataInputStream.readLong();
            C4662a c4662a = new C4662a(this.f17901f);
            c4662a.m20811a(dataInputStream, dataInputStream.readInt());
            return new C4878c(c4662a, m21833a(readLong));
        } catch (String str2) {
            if (C4728u.m21050a("DiskProtoBufCache", 6)) {
                Log.e("DiskProtoBufCache", "Error reading in the disk cache", str2);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m21841a(Locale locale) {
        if (this.f17897b == null) {
            return false;
        }
        if (this.f17897b.m21936c().equals(locale)) {
            return true;
        }
        try {
            this.f17897b.m21932a(this.f17897b.m21928a(), locale);
            this.f17900e.clear();
            return true;
        } catch (Locale locale2) {
            if (C4728u.m21050a("DiskProtoBufCache", 6)) {
                Log.e("DiskProtoBufCache", "Error clearing value in the cache", locale2);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m21839a() {
        if (this.f17897b == null) {
            return false;
        }
        try {
            this.f17897b.m21932a(this.f17897b.m21928a(), this.f17897b.m21936c());
            this.f17900e.clear();
            return true;
        } catch (Throwable e) {
            if (C4728u.m21050a("DiskProtoBufCache", 6)) {
                Log.e("DiskProtoBufCache", "Error clearing value in the cache", e);
            }
            return false;
        }
    }

    /* renamed from: a */
    private static List<C4884c> m21834a(List<C4877b> list) {
        List<C4884c> a = au.m20524a(list.size());
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (C4877b c4877b : list) {
            long a2 = C4733b.m21060a(c4877b.f17891a);
            String str = c4877b.f17891a;
            try {
                dataOutputStream.writeInt(-1);
                dataOutputStream.writeLong(c4877b.f17893c);
                c4877b.f17892b.m20824a(dataOutputStream);
                dataOutputStream.flush();
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.reset();
                a.add(C4891e.m21888a(a2, str, toByteArray));
            } catch (List<C4877b> list2) {
                if (C4728u.m21050a("DiskProtoBufCache", 6)) {
                    Log.e("DiskProtoBufCache", "Error writing on the stream", list2);
                }
            }
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private synchronized boolean m21836b() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f17900e;	 Catch:{ all -> 0x0081 }
        monitor-enter(r0);	 Catch:{ all -> 0x0081 }
        r1 = r7.f17900e;	 Catch:{ all -> 0x007e }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x007e }
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0013;
    L_0x000e:
        r7.f17904i = r3;	 Catch:{ all -> 0x007e }
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        monitor-exit(r7);
        return r2;
    L_0x0013:
        r1 = r7.f17900e;	 Catch:{ all -> 0x007e }
        r1 = r1.values();	 Catch:{ all -> 0x007e }
        r1 = com.google.android.m4b.maps.aa.au.m20525a(r1);	 Catch:{ all -> 0x007e }
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        r0 = com.google.android.m4b.maps.bs.C4879a.m21834a(r1);	 Catch:{ all -> 0x0081 }
        android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0081 }
        r4 = r0.size();	 Catch:{ all -> 0x0081 }
        if (r4 <= 0) goto L_0x0042;
    L_0x002b:
        r4 = r7.f17897b;	 Catch:{ IOException -> 0x0031 }
        r4.m21930a(r0);	 Catch:{ IOException -> 0x0031 }
        goto L_0x0042;
    L_0x0031:
        r0 = move-exception;
        r4 = "DiskProtoBufCache";
        r5 = 6;
        r4 = com.google.android.m4b.maps.ay.C4728u.m21050a(r4, r5);	 Catch:{ all -> 0x0081 }
        if (r4 == 0) goto L_0x0042;
    L_0x003b:
        r4 = "DiskProtoBufCache";
        r5 = "writeToDisk error: ";
        android.util.Log.e(r4, r5, r0);	 Catch:{ all -> 0x0081 }
    L_0x0042:
        android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0081 }
        r0 = r7.f17900e;	 Catch:{ all -> 0x0081 }
        monitor-enter(r0);	 Catch:{ all -> 0x0081 }
        r1 = r1.iterator();	 Catch:{ all -> 0x007b }
    L_0x004c:
        r4 = r1.hasNext();	 Catch:{ all -> 0x007b }
        if (r4 == 0) goto L_0x006a;
    L_0x0052:
        r4 = r1.next();	 Catch:{ all -> 0x007b }
        r4 = (com.google.android.m4b.maps.bs.C4879a.C4877b) r4;	 Catch:{ all -> 0x007b }
        r5 = r7.f17900e;	 Catch:{ all -> 0x007b }
        r6 = r4.f17891a;	 Catch:{ all -> 0x007b }
        r5 = r5.get(r6);	 Catch:{ all -> 0x007b }
        if (r4 != r5) goto L_0x004c;
    L_0x0062:
        r5 = r7.f17900e;	 Catch:{ all -> 0x007b }
        r4 = r4.f17891a;	 Catch:{ all -> 0x007b }
        r5.remove(r4);	 Catch:{ all -> 0x007b }
        goto L_0x004c;
    L_0x006a:
        r1 = r7.f17900e;	 Catch:{ all -> 0x007b }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x007b }
        if (r1 == 0) goto L_0x0077;
    L_0x0072:
        r7.f17904i = r3;	 Catch:{ all -> 0x007b }
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        monitor-exit(r7);
        return r2;
    L_0x0077:
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        r0 = 0;
        monitor-exit(r7);
        return r0;
    L_0x007b:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        throw r1;	 Catch:{ all -> 0x0081 }
    L_0x007e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        throw r1;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.a.b():boolean");
    }
}
