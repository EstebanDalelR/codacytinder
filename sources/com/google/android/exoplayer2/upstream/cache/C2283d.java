package com.google.android.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2291b;
import com.google.android.exoplayer2.util.C2305n;
import com.google.android.exoplayer2.util.C2314v;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.exoplayer2.upstream.cache.d */
class C2283d {
    /* renamed from: a */
    private final HashMap<String, C2282c> f6862a;
    /* renamed from: b */
    private final SparseArray<String> f6863b;
    /* renamed from: c */
    private final C2291b f6864c;
    /* renamed from: d */
    private final Cipher f6865d;
    /* renamed from: e */
    private final SecretKeySpec f6866e;
    /* renamed from: f */
    private final boolean f6867f;
    /* renamed from: g */
    private boolean f6868g;
    /* renamed from: h */
    private C2305n f6869h;

    public C2283d(File file, byte[] bArr, boolean z) {
        this.f6867f = z;
        boolean z2 = true;
        if (bArr != null) {
            if (!bArr.length) {
                z2 = false;
            }
            C2289a.m8311a(z2);
            try {
                this.f6865d = C2283d.m8274h();
                this.f6866e = new SecretKeySpec(bArr, "AES");
            } catch (File file2) {
                throw new IllegalStateException(file2);
            }
        }
        C2289a.m8313b(z ^ 1);
        this.f6865d = null;
        this.f6866e = null;
        this.f6862a = new HashMap();
        this.f6863b = new SparseArray();
        this.f6864c = new C2291b(new File(file2, "cached_content_index.exi"));
    }

    /* renamed from: a */
    public void m8277a() {
        C2289a.m8313b(this.f6868g ^ 1);
        if (!m8272f()) {
            this.f6864c.m8316a();
            this.f6862a.clear();
            this.f6863b.clear();
        }
    }

    /* renamed from: b */
    public void m8280b() throws CacheException {
        if (this.f6868g) {
            m8273g();
            this.f6868g = false;
        }
    }

    /* renamed from: a */
    public C2282c m8275a(String str) {
        C2282c c2282c = (C2282c) this.f6862a.get(str);
        return c2282c == null ? m8271f(str) : c2282c;
    }

    /* renamed from: b */
    public C2282c m8279b(String str) {
        return (C2282c) this.f6862a.get(str);
    }

    /* renamed from: c */
    public Collection<C2282c> m8282c() {
        return this.f6862a.values();
    }

    /* renamed from: c */
    public int m8281c(String str) {
        return m8275a(str).f6857a;
    }

    /* renamed from: a */
    public String m8276a(int i) {
        return (String) this.f6863b.get(i);
    }

    /* renamed from: d */
    public void m8284d(String str) {
        C2282c c2282c = (C2282c) this.f6862a.get(str);
        if (c2282c != null && c2282c.m8268d() && !c2282c.m8266b()) {
            this.f6862a.remove(str);
            this.f6863b.remove(c2282c.f6857a);
            this.f6868g = true;
        }
    }

    /* renamed from: d */
    public void m8283d() {
        String[] strArr = new String[this.f6862a.size()];
        this.f6862a.keySet().toArray(strArr);
        for (String d : strArr) {
            m8284d(d);
        }
    }

    /* renamed from: e */
    public Set<String> m8286e() {
        return this.f6862a.keySet();
    }

    /* renamed from: a */
    public void m8278a(String str, C2285f c2285f) {
        if (m8275a(str).m8264a(c2285f) != null) {
            this.f6868g = true;
        }
    }

    /* renamed from: e */
    public ContentMetadata m8285e(String str) {
        str = m8279b(str);
        return str != null ? str.m8258a() : C3718g.f11715a;
    }

    /* renamed from: f */
    private boolean m8272f() {
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
        r0 = 0;
        r1 = 0;
        r2 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x00a3, all -> 0x009b }
        r3 = r9.f6864c;	 Catch:{ IOException -> 0x00a3, all -> 0x009b }
        r3 = r3.m8319c();	 Catch:{ IOException -> 0x00a3, all -> 0x009b }
        r2.<init>(r3);	 Catch:{ IOException -> 0x00a3, all -> 0x009b }
        r3 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x00a3, all -> 0x009b }
        r3.<init>(r2);	 Catch:{ IOException -> 0x00a3, all -> 0x009b }
        r1 = r3.readInt();	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        if (r1 < 0) goto L_0x0093;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0018:
        r4 = 2;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        if (r1 <= r4) goto L_0x001d;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x001b:
        goto L_0x0093;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x001d:
        r5 = r3.readInt();	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r6 = 1;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r5 = r5 & r6;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        if (r5 == 0) goto L_0x0057;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0025:
        r5 = r9.f6865d;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        if (r5 != 0) goto L_0x002f;
    L_0x0029:
        if (r3 == 0) goto L_0x002e;
    L_0x002b:
        com.google.android.exoplayer2.util.C2314v.m8473a(r3);
    L_0x002e:
        return r0;
    L_0x002f:
        r5 = 16;
        r5 = new byte[r5];	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r3.readFully(r5);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r7 = new javax.crypto.spec.IvParameterSpec;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r7.<init>(r5);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r5 = r9.f6865d;	 Catch:{ InvalidKeyException -> 0x0050, InvalidKeyException -> 0x0050 }
        r8 = r9.f6866e;	 Catch:{ InvalidKeyException -> 0x0050, InvalidKeyException -> 0x0050 }
        r5.init(r4, r8, r7);	 Catch:{ InvalidKeyException -> 0x0050, InvalidKeyException -> 0x0050 }
        r4 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r5 = new javax.crypto.CipherInputStream;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r7 = r9.f6865d;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r5.<init>(r2, r7);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r3 = r4;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        goto L_0x005d;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0050:
        r1 = move-exception;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r2 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        throw r2;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0057:
        r2 = r9.f6867f;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        if (r2 == 0) goto L_0x005d;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x005b:
        r9.f6868g = r6;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x005d:
        r2 = r3.readInt();	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r4 = 0;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r5 = 0;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0063:
        if (r4 >= r2) goto L_0x0074;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0065:
        r7 = com.google.android.exoplayer2.upstream.cache.C2282c.m8255a(r1, r3);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r9.m8270a(r7);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r7 = r7.m8256a(r1);	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r5 = r5 + r7;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r4 = r4 + 1;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        goto L_0x0063;	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
    L_0x0074:
        r1 = r3.readInt();	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r2 = r3.read();	 Catch:{ IOException -> 0x00a4, all -> 0x0099 }
        r4 = -1;
        if (r2 != r4) goto L_0x0081;
    L_0x007f:
        r2 = 1;
        goto L_0x0082;
    L_0x0081:
        r2 = 0;
    L_0x0082:
        if (r1 != r5) goto L_0x008d;
    L_0x0084:
        if (r2 != 0) goto L_0x0087;
    L_0x0086:
        goto L_0x008d;
    L_0x0087:
        if (r3 == 0) goto L_0x008c;
    L_0x0089:
        com.google.android.exoplayer2.util.C2314v.m8473a(r3);
    L_0x008c:
        return r6;
    L_0x008d:
        if (r3 == 0) goto L_0x0092;
    L_0x008f:
        com.google.android.exoplayer2.util.C2314v.m8473a(r3);
    L_0x0092:
        return r0;
    L_0x0093:
        if (r3 == 0) goto L_0x0098;
    L_0x0095:
        com.google.android.exoplayer2.util.C2314v.m8473a(r3);
    L_0x0098:
        return r0;
    L_0x0099:
        r0 = move-exception;
        goto L_0x009d;
    L_0x009b:
        r0 = move-exception;
        r3 = r1;
    L_0x009d:
        if (r3 == 0) goto L_0x00a2;
    L_0x009f:
        com.google.android.exoplayer2.util.C2314v.m8473a(r3);
    L_0x00a2:
        throw r0;
    L_0x00a3:
        r3 = r1;
    L_0x00a4:
        if (r3 == 0) goto L_0x00a9;
    L_0x00a6:
        com.google.android.exoplayer2.util.C2314v.m8473a(r3);
    L_0x00a9:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.d.f():boolean");
    }

    /* renamed from: g */
    private void m8273g() throws CacheException {
        Closeable dataOutputStream;
        Throwable e;
        Throwable th;
        try {
            OutputStream b = this.f6864c.m8318b();
            if (this.f6869h == null) {
                this.f6869h = new C2305n(b);
            } else {
                this.f6869h.m8429a(b);
            }
            dataOutputStream = new DataOutputStream(this.f6869h);
            try {
                DataOutputStream dataOutputStream2;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.f6867f);
                if (this.f6867f) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    this.f6865d.init(1, this.f6866e, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f6869h, this.f6865d));
                }
                dataOutputStream2.writeInt(this.f6862a.size());
                int i = 0;
                for (C2282c c2282c : this.f6862a.values()) {
                    c2282c.m8261a(dataOutputStream2);
                    i += c2282c.m8256a(2);
                }
                dataOutputStream2.writeInt(i);
                this.f6864c.m8317a(dataOutputStream2);
                C2314v.m8473a(null);
            } catch (Throwable e2) {
                throw new IllegalStateException(e2);
            } catch (IOException e3) {
                e2 = e3;
                try {
                    throw new CacheException(e2);
                } catch (Throwable th2) {
                    e2 = th2;
                    C2314v.m8473a(dataOutputStream);
                    throw e2;
                }
            }
        } catch (Throwable e4) {
            th = e4;
            dataOutputStream = null;
            e2 = th;
            throw new CacheException(e2);
        } catch (Throwable e42) {
            th = e42;
            dataOutputStream = null;
            e2 = th;
            C2314v.m8473a(dataOutputStream);
            throw e2;
        }
    }

    /* renamed from: f */
    private C2282c m8271f(String str) {
        C2282c c2282c = new C2282c(C2283d.m8269a(this.f6863b), str);
        m8270a(c2282c);
        this.f6868g = true;
        return c2282c;
    }

    /* renamed from: a */
    private void m8270a(C2282c c2282c) {
        this.f6862a.put(c2282c.f6858b, c2282c);
        this.f6863b.put(c2282c.f6857a, c2282c.f6858b);
    }

    /* renamed from: h */
    private static javax.crypto.Cipher m8274h() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
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
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r1 = 18;
        if (r0 != r1) goto L_0x000f;
    L_0x0006:
        r0 = "AES/CBC/PKCS5PADDING";	 Catch:{ Throwable -> 0x000f }
        r1 = "BC";	 Catch:{ Throwable -> 0x000f }
        r0 = javax.crypto.Cipher.getInstance(r0, r1);	 Catch:{ Throwable -> 0x000f }
        return r0;
    L_0x000f:
        r0 = "AES/CBC/PKCS5PADDING";
        r0 = javax.crypto.Cipher.getInstance(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.d.h():javax.crypto.Cipher");
    }

    /* renamed from: a */
    public static int m8269a(SparseArray<String> sparseArray) {
        int i;
        int size = sparseArray.size();
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            i = 0;
            while (i < size) {
                if (i != sparseArray.keyAt(i)) {
                    break;
                }
                i++;
            }
        }
        return i;
    }
}
