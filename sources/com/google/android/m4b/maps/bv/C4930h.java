package com.google.android.m4b.maps.bv;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.google.android.m4b.maps.bv.h */
public final class C4930h {
    /* renamed from: a */
    private final C6550c f18183a = new C6550c(100);
    /* renamed from: b */
    private final HashSet<String> f18184b = new HashSet();
    /* renamed from: c */
    private final int f18185c = 3;
    /* renamed from: d */
    private File f18186d;
    /* renamed from: e */
    private final String f18187e;

    /* renamed from: com.google.android.m4b.maps.bv.h$a */
    public static class C4928a {
    }

    /* renamed from: com.google.android.m4b.maps.bv.h$b */
    static final class C4929b implements Comparable<C4929b> {
        /* renamed from: a */
        public final File f18179a;
        /* renamed from: b */
        public final String f18180b;
        /* renamed from: c */
        public final long f18181c;
        /* renamed from: d */
        boolean f18182d = true;

        public final /* synthetic */ int compareTo(Object obj) {
            C4929b c4929b = (C4929b) obj;
            if (this.f18181c < c4929b.f18181c) {
                return -1;
            }
            return this.f18181c > c4929b.f18181c ? 1 : this.f18180b.compareTo(c4929b.f18180b);
        }

        public C4929b(File file) {
            this.f18179a = file;
            this.f18180b = file.getName();
            this.f18181c = file.lastModified();
        }

        public final int hashCode() {
            return this.f18180b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    return this.f18180b.equals(((C4929b) obj).f18180b);
                }
            }
            return null;
        }

        public final String toString() {
            return this.f18180b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.h$c */
    static class C6550c extends C4933j<String, C4929b> {
        /* renamed from: a */
        protected final /* synthetic */ void mo5201a(Object obj, Object obj2) {
            C4929b c4929b = (C4929b) obj2;
            if (c4929b.f18182d != null && c4929b.f18179a.delete() == null) {
                obj = String.valueOf(c4929b.f18179a);
                obj2 = new StringBuilder(String.valueOf(obj).length() + 28);
                obj2.append("Failed to delete cache file ");
                obj2.append(obj);
                ac.m22036a(obj2.toString());
            }
        }

        public C6550c(int i) {
            super(i);
        }

        /* renamed from: a */
        public final void m28936a(C4929b c4929b) {
            C4929b c4929b2 = (C4929b) m22104a((Object) c4929b.f18180b);
            if (c4929b2 != null) {
                c4929b2.f18182d = false;
            }
            m22108b(c4929b.f18180b, c4929b);
        }
    }

    public C4930h(int i, String str, int i2) {
        this.f18187e = str;
        m22091a();
    }

    /* renamed from: a */
    public static void m22093a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0006;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0006 }
        return;
    L_0x0006:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.h.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    public final byte[] m22100a(String str, boolean z, C4928a c4928a, String str2, long j) {
        if (str2 != null && str2.length() < true) {
            throw new IllegalArgumentException("persistentKey");
        } else if (j < 1) {
            throw new IllegalArgumentException("shelfLife");
        } else if (this.f18186d == null || str2 == null) {
            return null;
        } else {
            str = m22097b(str2, j);
            if (str != null) {
                return str;
            }
            C4930h.m22095b("read");
            return null;
        }
    }

    /* renamed from: a */
    private synchronized void m22092a(C4929b c4929b) {
        if (c4929b != null) {
            this.f18183a.m22106b((Object) c4929b.f18180b);
        }
    }

    /* renamed from: a */
    public final synchronized boolean m22099a(String str, long j) {
        if (str != null) {
            if (str.length() >= 5) {
                if (j < 1) {
                    throw new IllegalArgumentException("shelfLife");
                }
                C4929b c4929b = (C4929b) this.f18183a.m22104a((Object) str);
                str = (c4929b == null || System.currentTimeMillis() - c4929b.f18181c > j) ? null : true;
            }
        }
        throw new IllegalArgumentException("persistentKey");
        return str;
    }

    /* renamed from: b */
    private synchronized byte[] m22097b(String str, long j) {
        C4929b c4929b = (C4929b) this.f18183a.m22104a((Object) str);
        if (c4929b == null) {
            return null;
        }
        return m22094a(c4929b, j);
    }

    /* renamed from: a */
    private File m22090a(String str) {
        return new File(this.f18186d, str);
    }

    /* renamed from: a */
    public final void m22098a(byte[] bArr, String str) {
        if (str != null) {
            if (str.length() >= 5) {
                if (this.f18186d != null) {
                    m22096b(bArr, str);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("persistentKey");
    }

    /* renamed from: b */
    private void m22096b(byte[] r6, java.lang.String r7) {
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
        r5 = this;
        r0 = 0;
        r7 = r5.m22090a(r7);	 Catch:{ FileNotFoundException -> 0x0033, all -> 0x002f }
        monitor-enter(r5);	 Catch:{ FileNotFoundException -> 0x002c, all -> 0x0026 }
        r1 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0023 }
        r1.<init>(r7);	 Catch:{ all -> 0x0023 }
        r1.write(r6);	 Catch:{ all -> 0x0020 }
        com.google.android.m4b.maps.bv.C4930h.m22093a(r1);	 Catch:{ all -> 0x0020 }
        r6 = r5.f18183a;	 Catch:{ all -> 0x0023 }
        r1 = new com.google.android.m4b.maps.bv.h$b;	 Catch:{ all -> 0x0023 }
        r1.<init>(r7);	 Catch:{ all -> 0x0023 }
        r6.m28936a(r1);	 Catch:{ all -> 0x0023 }
        monitor-exit(r5);	 Catch:{ all -> 0x0023 }
        com.google.android.m4b.maps.bv.C4930h.m22093a(r0);
        return;
    L_0x0020:
        r6 = move-exception;
        r0 = r1;
        goto L_0x0024;
    L_0x0023:
        r6 = move-exception;
    L_0x0024:
        monitor-exit(r5);	 Catch:{ all -> 0x0023 }
        throw r6;	 Catch:{ FileNotFoundException -> 0x002c, all -> 0x0026 }
    L_0x0026:
        r6 = move-exception;
        r4 = r7;
        r7 = r6;
        r6 = r0;
        r0 = r4;
        goto L_0x005a;
    L_0x002c:
        r6 = r0;
        r0 = r7;
        goto L_0x0034;
    L_0x002f:
        r6 = move-exception;
        r7 = r6;
        r6 = r0;
        goto L_0x005a;
    L_0x0033:
        r6 = r0;
    L_0x0034:
        r7 = new java.io.IOException;	 Catch:{ all -> 0x0059 }
        r1 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0059 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0059 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0059 }
        r3 = r3.length();	 Catch:{ all -> 0x0059 }
        r3 = r3 + 27;	 Catch:{ all -> 0x0059 }
        r2.<init>(r3);	 Catch:{ all -> 0x0059 }
        r3 = "Couldn't create cache file ";	 Catch:{ all -> 0x0059 }
        r2.append(r3);	 Catch:{ all -> 0x0059 }
        r2.append(r1);	 Catch:{ all -> 0x0059 }
        r1 = r2.toString();	 Catch:{ all -> 0x0059 }
        r7.<init>(r1);	 Catch:{ all -> 0x0059 }
        throw r7;	 Catch:{ all -> 0x0059 }
    L_0x0059:
        r7 = move-exception;
    L_0x005a:
        com.google.android.m4b.maps.bv.C4930h.m22093a(r6);
        if (r0 == 0) goto L_0x0062;
    L_0x005f:
        r0.delete();
    L_0x0062:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.h.b(byte[], java.lang.String):void");
    }

    /* renamed from: a */
    private synchronized void m22091a() {
        File file = new File(this.f18187e);
        if (file.isDirectory() || file.mkdirs()) {
            System.currentTimeMillis();
            String[] list = file.list();
            System.currentTimeMillis();
            this.f18186d = file;
            C4929b[] c4929bArr = new C4929b[list.length];
            for (int i = 0; i < list.length; i++) {
                c4929bArr[i] = new C4929b(m22090a(list[i]));
            }
            System.currentTimeMillis();
            Arrays.sort(c4929bArr);
            System.currentTimeMillis();
            for (C4929b c4929b : c4929bArr) {
                if (c4929b.f18179a.isFile()) {
                    this.f18183a.m28936a(c4929b);
                }
            }
            return;
        }
        String str = "Could not open cache directory ";
        String valueOf = String.valueOf(this.f18187e);
        ac.m22036a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: b */
    private static void m22095b(String str) {
        if (Thread.interrupted()) {
            throw new InterruptedException(str);
        }
    }

    /* renamed from: a */
    private byte[] m22094a(C4929b c4929b, long j) {
        Closeable dataInputStream;
        Object e;
        String valueOf;
        StringBuilder stringBuilder;
        if (System.currentTimeMillis() - c4929b.f18181c > j) {
            String valueOf2 = String.valueOf(c4929b);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            stringBuilder2.append("Expired cache file: ");
            stringBuilder2.append(valueOf2);
            ac.m22036a(stringBuilder2.toString());
            m22092a(c4929b);
            return null;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(c4929b.f18179a));
            try {
                byte[] bArr = new byte[((int) c4929b.f18179a.length())];
                dataInputStream.readFully(bArr);
                C4930h.m22093a(dataInputStream);
                return bArr;
            } catch (FileNotFoundException e2) {
                e = e2;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Could not find cache file: ");
                stringBuilder.append(valueOf);
                ac.m22036a(stringBuilder.toString());
                C4930h.m22093a(dataInputStream);
                m22092a(c4929b);
                return null;
            } catch (IOException e3) {
                e = e3;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Could not read cache file: ");
                stringBuilder.append(valueOf);
                ac.m22036a(stringBuilder.toString());
                C4930h.m22093a(dataInputStream);
                m22092a(c4929b);
                return null;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            dataInputStream = null;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Could not find cache file: ");
            stringBuilder.append(valueOf);
            ac.m22036a(stringBuilder.toString());
            C4930h.m22093a(dataInputStream);
            m22092a(c4929b);
            return null;
        } catch (IOException e5) {
            e = e5;
            dataInputStream = null;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Could not read cache file: ");
            stringBuilder.append(valueOf);
            ac.m22036a(stringBuilder.toString());
            C4930h.m22093a(dataInputStream);
            m22092a(c4929b);
            return null;
        } catch (Throwable th) {
            j = th;
            C4930h.m22093a(dataInputStream);
            m22092a(c4929b);
            throw j;
        }
    }
}
