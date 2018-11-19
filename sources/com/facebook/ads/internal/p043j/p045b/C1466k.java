package com.facebook.ads.internal.p043j.p045b;

import android.util.Log;
import java.lang.Thread.State;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.j.b.k */
class C1466k {
    /* renamed from: a */
    private final C1469n f4023a;
    /* renamed from: b */
    private final C1451a f4024b;
    /* renamed from: c */
    private final Object f4025c = new Object();
    /* renamed from: d */
    private final Object f4026d = new Object();
    /* renamed from: e */
    private final AtomicInteger f4027e;
    /* renamed from: f */
    private volatile Thread f4028f;
    /* renamed from: g */
    private volatile boolean f4029g;
    /* renamed from: h */
    private volatile int f4030h = -1;

    /* renamed from: com.facebook.ads.internal.j.b.k$a */
    private class C1465a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1466k f4022a;

        private C1465a(C1466k c1466k) {
            this.f4022a = c1466k;
        }

        public void run() {
            this.f4022a.m5127e();
        }
    }

    public C1466k(C1469n c1469n, C1451a c1451a) {
        this.f4023a = (C1469n) C1463j.m5119a(c1469n);
        this.f4024b = (C1451a) C1463j.m5119a(c1451a);
        this.f4027e = new AtomicInteger();
    }

    /* renamed from: b */
    private void m5123b() {
        int i = this.f4027e.get();
        if (i >= 1) {
            this.f4027e.set(0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error reading source ");
            stringBuilder.append(i);
            stringBuilder.append(" times");
            throw new C1467l(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m5124b(long j, long j2) {
        m5134a(j, j2);
        synchronized (this.f4025c) {
            this.f4025c.notifyAll();
        }
    }

    /* renamed from: c */
    private synchronized void m5125c() {
        Object obj = (this.f4028f == null || this.f4028f.getState() == State.TERMINATED) ? null : 1;
        if (!(this.f4029g || this.f4024b.mo1772d() || obj != null)) {
            Runnable c1465a = new C1465a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Source reader for ");
            stringBuilder.append(this.f4023a);
            this.f4028f = new Thread(c1465a, stringBuilder.toString());
            this.f4028f.start();
        }
    }

    /* renamed from: d */
    private void m5126d() {
        synchronized (this.f4025c) {
            try {
                this.f4025c.wait(1000);
            } catch (Throwable e) {
                throw new C1467l("Waiting source data is interrupted!", e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private void m5127e() {
        /*
        r9 = this;
        r0 = -1;
        r1 = 0;
        r2 = r9.f4024b;	 Catch:{ Throwable -> 0x0062, all -> 0x005d }
        r2 = r2.mo1767a();	 Catch:{ Throwable -> 0x0062, all -> 0x005d }
        r1 = r9.f4023a;	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r1.mo1779a(r2);	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r1 = r9.f4023a;	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r1 = r1.mo1777a();	 Catch:{ Throwable -> 0x0059, all -> 0x0055 }
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r3 = new byte[r3];	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
    L_0x0017:
        r4 = r9.f4023a;	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        r4 = r4.mo1778a(r3);	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        if (r4 == r0) goto L_0x0042;
    L_0x001f:
        r5 = r9.f4026d;	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        monitor-enter(r5);	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        r6 = r9.m5129g();	 Catch:{ all -> 0x003f }
        if (r6 == 0) goto L_0x0032;
    L_0x0028:
        monitor-exit(r5);	 Catch:{ all -> 0x003f }
        r9.m5130h();
        r2 = (long) r2;
        r0 = (long) r1;
        r9.m5124b(r2, r0);
        return;
    L_0x0032:
        r6 = r9.f4024b;	 Catch:{ all -> 0x003f }
        r6.mo1769a(r3, r4);	 Catch:{ all -> 0x003f }
        monitor-exit(r5);	 Catch:{ all -> 0x003f }
        r2 = r2 + r4;
        r4 = (long) r2;
        r6 = (long) r1;
        r9.m5124b(r4, r6);	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        goto L_0x0017;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
    L_0x0042:
        r9.m5128f();	 Catch:{ Throwable -> 0x0050, all -> 0x004e }
        r9.m5130h();
        r2 = (long) r2;
        r0 = (long) r1;
        r9.m5124b(r2, r0);
        return;
    L_0x004e:
        r0 = move-exception;
        goto L_0x007a;
    L_0x0050:
        r0 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
        goto L_0x0065;
    L_0x0055:
        r1 = move-exception;
        r0 = r1;
        r1 = -1;
        goto L_0x007a;
    L_0x0059:
        r1 = move-exception;
        r0 = r1;
        r1 = r2;
        goto L_0x0064;
    L_0x005d:
        r2 = move-exception;
        r0 = r2;
        r1 = -1;
        r2 = 0;
        goto L_0x007a;
    L_0x0062:
        r2 = move-exception;
        r0 = r2;
    L_0x0064:
        r2 = -1;
    L_0x0065:
        r3 = r9.f4027e;	 Catch:{ all -> 0x0076 }
        r3.incrementAndGet();	 Catch:{ all -> 0x0076 }
        r9.m5135a(r0);	 Catch:{ all -> 0x0076 }
        r9.m5130h();
        r0 = (long) r1;
        r2 = (long) r2;
        r9.m5124b(r0, r2);
        return;
    L_0x0076:
        r0 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x007a:
        r9.m5130h();
        r2 = (long) r2;
        r4 = (long) r1;
        r9.m5124b(r2, r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.j.b.k.e():void");
    }

    /* renamed from: f */
    private void m5128f() {
        synchronized (this.f4026d) {
            if (!m5129g() && this.f4024b.mo1767a() == this.f4023a.mo1777a()) {
                this.f4024b.mo1771c();
            }
        }
    }

    /* renamed from: g */
    private boolean m5129g() {
        if (!Thread.currentThread().isInterrupted()) {
            if (!this.f4029g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private void m5130h() {
        try {
            this.f4023a.mo1780b();
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error closing source ");
            stringBuilder.append(this.f4023a);
            m5135a(new C1467l(stringBuilder.toString(), e));
        }
    }

    /* renamed from: a */
    public int m5131a(byte[] bArr, long j, int i) {
        C1468m.m5139a(bArr, j, i);
        while (!this.f4024b.mo1772d() && ((long) this.f4024b.mo1767a()) < j + ((long) i) && !this.f4029g) {
            m5125c();
            m5126d();
            m5123b();
        }
        int a = this.f4024b.mo1768a(bArr, j, i);
        if (this.f4024b.mo1772d() && this.f4030h != 100) {
            this.f4030h = 100;
            mo1775a(100);
        }
        return a;
    }

    /* renamed from: a */
    public void m5132a() {
        synchronized (this.f4026d) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Shutdown proxy for ");
            stringBuilder.append(this.f4023a);
            Log.d("ProxyCache", stringBuilder.toString());
            try {
                this.f4029g = true;
                if (this.f4028f != null) {
                    this.f4028f.interrupt();
                }
                this.f4024b.mo1770b();
            } catch (Throwable e) {
                m5135a(e);
            }
        }
    }

    /* renamed from: a */
    protected void mo1775a(int i) {
    }

    /* renamed from: a */
    protected void m5134a(long j, long j2) {
        Object obj = null;
        int i = ((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)) == 0 ? 1 : null) != null ? 100 : (int) ((j * 100) / j2);
        Object obj2 = i != this.f4030h ? 1 : null;
        if (j2 >= 0) {
            obj = 1;
        }
        if (!(obj == null || obj2 == null)) {
            mo1775a(i);
        }
        this.f4030h = i;
    }

    /* renamed from: a */
    protected final void m5135a(Throwable th) {
        if (th instanceof C3310i) {
            Log.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            Log.e("ProxyCache", "ProxyCache error", th);
        }
    }
}
