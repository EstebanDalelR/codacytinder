package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import com.google.android.exoplayer2.upstream.cache.Cache.Listener;
import com.google.android.exoplayer2.util.C2289a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.upstream.cache.i */
public final class C3719i implements Cache {
    /* renamed from: a */
    private static final HashSet<File> f11718a = new HashSet();
    /* renamed from: b */
    private static boolean f11719b;
    /* renamed from: c */
    private final File f11720c;
    /* renamed from: d */
    private final CacheEvictor f11721d;
    /* renamed from: e */
    private final C2283d f11722e;
    /* renamed from: f */
    private final HashMap<String, ArrayList<Listener>> f11723f;
    /* renamed from: g */
    private long f11724g;
    /* renamed from: h */
    private boolean f11725h;

    public /* synthetic */ C2280a startReadWrite(String str, long j) throws InterruptedException, CacheException {
        return m14129a(str, j);
    }

    public /* synthetic */ C2280a startReadWriteNonBlocking(String str, long j) throws CacheException {
        return m14130b(str, j);
    }

    public C3719i(File file, CacheEvictor cacheEvictor) {
        this(file, cacheEvictor, null, false);
    }

    public C3719i(File file, CacheEvictor cacheEvictor, byte[] bArr, boolean z) {
        this(file, cacheEvictor, new C2283d(file, bArr, z));
    }

    C3719i(File file, CacheEvictor cacheEvictor, C2283d c2283d) {
        if (C3719i.m14123a(file)) {
            this.f11720c = file;
            this.f11721d = cacheEvictor;
            this.f11722e = c2283d;
            this.f11723f = new HashMap();
            file = new ConditionVariable();
            new Thread(this, "SimpleCache.initialize()") {
                /* renamed from: b */
                final /* synthetic */ C3719i f6873b;

                public void run() {
                    synchronized (this.f6873b) {
                        file.open();
                        this.f6873b.m14117a();
                        this.f6873b.f11721d.onCacheInitialized();
                    }
                }
            }.start();
            file.block();
            return;
        }
        c2283d = new StringBuilder();
        c2283d.append("Another SimpleCache instance uses the folder: ");
        c2283d.append(file);
        throw new IllegalStateException(c2283d.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() throws com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f11725h;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);
        return;
    L_0x0007:
        r0 = r3.f11723f;	 Catch:{ all -> 0x0022 }
        r0.clear();	 Catch:{ all -> 0x0022 }
        r0 = 1;
        r3.m14125b();	 Catch:{ all -> 0x0019 }
        r1 = r3.f11720c;	 Catch:{ all -> 0x0022 }
        com.google.android.exoplayer2.upstream.cache.C3719i.m14127b(r1);	 Catch:{ all -> 0x0022 }
        r3.f11725h = r0;	 Catch:{ all -> 0x0022 }
        monitor-exit(r3);
        return;
    L_0x0019:
        r1 = move-exception;
        r2 = r3.f11720c;	 Catch:{ all -> 0x0022 }
        com.google.android.exoplayer2.upstream.cache.C3719i.m14127b(r2);	 Catch:{ all -> 0x0022 }
        r3.f11725h = r0;	 Catch:{ all -> 0x0022 }
        throw r1;	 Catch:{ all -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.i.release():void");
    }

    public synchronized NavigableSet<C2280a> addListener(String str, Listener listener) {
        C2289a.m8313b(this.f11725h ^ 1);
        ArrayList arrayList = (ArrayList) this.f11723f.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f11723f.put(str, arrayList);
        }
        arrayList.add(listener);
        return getCachedSpans(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void removeListener(java.lang.String r2, com.google.android.exoplayer2.upstream.cache.Cache.Listener r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f11725h;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r1);
        return;
    L_0x0007:
        r0 = r1.f11723f;	 Catch:{ all -> 0x0021 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0021 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x001f;
    L_0x0011:
        r0.remove(r3);	 Catch:{ all -> 0x0021 }
        r3 = r0.isEmpty();	 Catch:{ all -> 0x0021 }
        if (r3 == 0) goto L_0x001f;
    L_0x001a:
        r3 = r1.f11723f;	 Catch:{ all -> 0x0021 }
        r3.remove(r2);	 Catch:{ all -> 0x0021 }
    L_0x001f:
        monitor-exit(r1);
        return;
    L_0x0021:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.i.removeListener(java.lang.String, com.google.android.exoplayer2.upstream.cache.Cache$Listener):void");
    }

    @NonNull
    public synchronized NavigableSet<C2280a> getCachedSpans(String str) {
        NavigableSet<C2280a> treeSet;
        C2289a.m8313b(this.f11725h ^ 1);
        str = this.f11722e.m8279b(str);
        if (str != null) {
            if (!str.m8268d()) {
                treeSet = new TreeSet(str.m8267c());
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public synchronized Set<String> getKeys() {
        C2289a.m8313b(this.f11725h ^ 1);
        return new HashSet(this.f11722e.m8286e());
    }

    public synchronized long getCacheSpace() {
        C2289a.m8313b(this.f11725h ^ 1);
        return this.f11724g;
    }

    /* renamed from: a */
    public synchronized C3720j m14129a(String str, long j) throws InterruptedException, CacheException {
        C3720j b;
        while (true) {
            b = m14130b(str, j);
            if (b == null) {
                wait();
            }
        }
        return b;
    }

    /* renamed from: b */
    public synchronized C3720j m14130b(String str, long j) throws CacheException {
        C2289a.m8313b(this.f11725h ^ true);
        C3720j c = m14128c(str, j);
        if (c.d) {
            C2280a b = this.f11722e.m8279b(str).m8265b(c);
            m14122a(c, b);
            return b;
        }
        str = this.f11722e.m8275a(str);
        if (str.m8266b()) {
            return null;
        }
        str.m8262a(true);
        return c;
    }

    public synchronized File startFile(String str, long j, long j2) throws CacheException {
        Object b;
        C2289a.m8313b(this.f11725h ^ 1);
        b = this.f11722e.m8279b(str);
        C2289a.m8309a(b);
        C2289a.m8313b(b.m8266b());
        if (!this.f11720c.exists()) {
            this.f11720c.mkdirs();
            m14125b();
        }
        this.f11721d.onStartFile(this, str, j, j2);
        return C3720j.m14134a(this.f11720c, b.f6857a, j, System.currentTimeMillis());
    }

    public synchronized void commitFile(File file) throws CacheException {
        boolean z = true;
        C2289a.m8313b(this.f11725h ^ true);
        C3720j a = C3720j.m14131a(file, this.f11722e);
        C2289a.m8313b(a != null);
        Object b = this.f11722e.m8279b(a.a);
        C2289a.m8309a(b);
        C2289a.m8313b(b.m8266b());
        if (!file.exists()) {
            return;
        }
        if (file.length() == 0) {
            file.delete();
            return;
        }
        long a2 = C2284e.m8287a(b.m8258a());
        if (a2 != -1) {
            if (a.b + a.c > a2) {
                z = false;
            }
            C2289a.m8313b(z);
        }
        m14121a(a);
        this.f11722e.m8280b();
        notifyAll();
    }

    public synchronized void releaseHoleSpan(C2280a c2280a) {
        C2289a.m8313b(this.f11725h ^ 1);
        Object b = this.f11722e.m8279b(c2280a.f6851a);
        C2289a.m8309a(b);
        C2289a.m8313b(b.m8266b());
        b.m8262a(false);
        this.f11722e.m8284d(b.f6858b);
        notifyAll();
    }

    public synchronized void removeSpan(C2280a c2280a) throws CacheException {
        C2289a.m8313b(this.f11725h ^ true);
        m14119a(c2280a, true);
    }

    public synchronized boolean isCached(String str, long j, long j2) {
        boolean z;
        z = true;
        C2289a.m8313b(this.f11725h ^ true);
        str = this.f11722e.m8279b(str);
        if (str == null || str.m8257a(j, j2) < j2) {
            z = false;
        }
        return z;
    }

    public synchronized long getCachedLength(String str, long j, long j2) {
        C2289a.m8313b(this.f11725h ^ 1);
        str = this.f11722e.m8279b(str);
        return str != null ? str.m8257a(j, j2) : -j2;
    }

    public synchronized void setContentLength(String str, long j) throws CacheException {
        C2285f c2285f = new C2285f();
        C2284e.m8289a(c2285f, j);
        applyContentMetadataMutations(str, c2285f);
    }

    public synchronized long getContentLength(String str) {
        return C2284e.m8287a(getContentMetadata(str));
    }

    public synchronized void applyContentMetadataMutations(String str, C2285f c2285f) throws CacheException {
        C2289a.m8313b(this.f11725h ^ 1);
        this.f11722e.m8278a(str, c2285f);
        this.f11722e.m8280b();
    }

    public synchronized ContentMetadata getContentMetadata(String str) {
        C2289a.m8313b(this.f11725h ^ 1);
        return this.f11722e.m8285e(str);
    }

    /* renamed from: c */
    private C3720j m14128c(String str, long j) throws CacheException {
        C2282c b = this.f11722e.m8279b(str);
        if (b == null) {
            return C3720j.m14135b(str, j);
        }
        while (true) {
            str = b.m8259a(j);
            if (!str.d || str.e.exists()) {
                return str;
            }
            m14125b();
        }
        return str;
    }

    /* renamed from: a */
    private void m14117a() {
        if (this.f11720c.exists()) {
            this.f11722e.m8277a();
            File[] listFiles = this.f11720c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (!file.getName().equals("cached_content_index.exi")) {
                        C3720j a = file.length() > 0 ? C3720j.m14131a(file, this.f11722e) : null;
                        if (a != null) {
                            m14121a(a);
                        } else {
                            file.delete();
                        }
                    }
                }
                this.f11722e.m8283d();
                try {
                    this.f11722e.m8280b();
                } catch (Throwable e) {
                    Log.e("SimpleCache", "Storing index file failed", e);
                }
                return;
            }
            return;
        }
        this.f11720c.mkdirs();
    }

    /* renamed from: a */
    private void m14121a(C3720j c3720j) {
        this.f11722e.m8275a(c3720j.a).m8260a(c3720j);
        this.f11724g += c3720j.c;
        m14126b(c3720j);
    }

    /* renamed from: a */
    private void m14119a(C2280a c2280a, boolean z) throws CacheException {
        C2282c b = this.f11722e.m8279b(c2280a.f6851a);
        if (b != null) {
            if (b.m8263a(c2280a)) {
                this.f11724g -= c2280a.f6853c;
                if (z) {
                    try {
                        this.f11722e.m8284d(b.f6858b);
                        this.f11722e.m8280b();
                    } catch (Throwable th) {
                        m14118a(c2280a);
                    }
                }
                m14118a(c2280a);
            }
        }
    }

    /* renamed from: b */
    private void m14125b() throws CacheException {
        ArrayList arrayList = new ArrayList();
        for (C2282c c : this.f11722e.m8282c()) {
            Iterator it = c.m8267c().iterator();
            while (it.hasNext()) {
                C2280a c2280a = (C2280a) it.next();
                if (!c2280a.f6855e.exists()) {
                    arrayList.add(c2280a);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m14119a((C2280a) arrayList.get(i), false);
        }
        this.f11722e.m8283d();
        this.f11722e.m8280b();
    }

    /* renamed from: a */
    private void m14118a(C2280a c2280a) {
        ArrayList arrayList = (ArrayList) this.f11723f.get(c2280a.f6851a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Listener) arrayList.get(size)).onSpanRemoved(this, c2280a);
            }
        }
        this.f11721d.onSpanRemoved(this, c2280a);
    }

    /* renamed from: b */
    private void m14126b(C3720j c3720j) {
        ArrayList arrayList = (ArrayList) this.f11723f.get(c3720j.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Listener) arrayList.get(size)).onSpanAdded(this, c3720j);
            }
        }
        this.f11721d.onSpanAdded(this, c3720j);
    }

    /* renamed from: a */
    private void m14122a(C3720j c3720j, C2280a c2280a) {
        ArrayList arrayList = (ArrayList) this.f11723f.get(c3720j.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Listener) arrayList.get(size)).onSpanTouched(this, c3720j, c2280a);
            }
        }
        this.f11721d.onSpanTouched(this, c3720j, c2280a);
    }

    /* renamed from: a */
    private static synchronized boolean m14123a(File file) {
        synchronized (C3719i.class) {
            if (f11719b) {
                return true;
            }
            file = f11718a.add(file.getAbsoluteFile());
            return file;
        }
    }

    /* renamed from: b */
    private static synchronized void m14127b(File file) {
        synchronized (C3719i.class) {
            if (!f11719b) {
                f11718a.remove(file.getAbsoluteFile());
            }
        }
    }
}
