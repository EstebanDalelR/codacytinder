package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6040g;
import com.squareup.okhttp.internal.C6058i;
import java.net.SocketException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.okhttp.h */
public final class C6009h {
    /* renamed from: a */
    private static final C6009h f21969a;
    /* renamed from: b */
    private final int f21970b;
    /* renamed from: c */
    private final long f21971c;
    /* renamed from: d */
    private final Deque<C6007g> f21972d = new ArrayDeque();
    /* renamed from: e */
    private Executor f21973e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C6058i.m26244a("OkHttp ConnectionPool", true));
    /* renamed from: f */
    private final Runnable f21974f = new C60081(this);

    /* renamed from: com.squareup.okhttp.h$1 */
    class C60081 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C6009h f21968a;

        C60081(C6009h c6009h) {
            this.f21968a = c6009h;
        }

        public void run() {
            this.f21968a.m25847c();
        }
    }

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000;
        if (property != null && !Boolean.parseBoolean(property)) {
            f21969a = new C6009h(0, parseLong);
        } else if (property3 != null) {
            f21969a = new C6009h(Integer.parseInt(property3), parseLong);
        } else {
            f21969a = new C6009h(5, parseLong);
        }
    }

    public C6009h(int i, long j) {
        this.f21970b = i;
        this.f21971c = (j * 1000) * 1000;
    }

    /* renamed from: a */
    public static C6009h m25845a() {
        return f21969a;
    }

    /* renamed from: a */
    public synchronized C6007g m25849a(C5995a c5995a) {
        C6007g c6007g;
        c6007g = null;
        Iterator descendingIterator = this.f21972d.descendingIterator();
        while (descendingIterator.hasNext()) {
            C6007g c6007g2 = (C6007g) descendingIterator.next();
            if (c6007g2.m25834c().m26414a().equals(c5995a) && c6007g2.m25836e()) {
                if (System.nanoTime() - c6007g2.m25840i() < this.f21971c) {
                    descendingIterator.remove();
                    if (!c6007g2.m25842k()) {
                        try {
                            C6040g.m26108a().mo6527a(c6007g2.m25835d());
                        } catch (SocketException e) {
                            C6058i.m26249a(c6007g2.m25835d());
                            C6040g a = C6040g.m26108a();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to tagSocket(): ");
                            stringBuilder.append(e);
                            a.m26111a(stringBuilder.toString());
                        }
                    }
                    c6007g = c6007g2;
                    break;
                }
            }
        }
        if (!(c6007g == null || c6007g.m25842k() == null)) {
            this.f21972d.addFirst(c6007g);
        }
        return c6007g;
    }

    /* renamed from: a */
    void m25850a(C6007g c6007g) {
        if (c6007g.m25842k() || !c6007g.m25831a()) {
            return;
        }
        if (c6007g.m25836e()) {
            try {
                C6040g.m26108a().mo6531b(c6007g.m25835d());
                synchronized (this) {
                    m25848c(c6007g);
                    c6007g.m25843l();
                    c6007g.m25838g();
                }
                return;
            } catch (SocketException e) {
                C6040g a = C6040g.m26108a();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to untagSocket(): ");
                stringBuilder.append(e);
                a.m26111a(stringBuilder.toString());
                C6058i.m26249a(c6007g.m25835d());
                return;
            }
        }
        C6058i.m26249a(c6007g.m25835d());
    }

    /* renamed from: c */
    private void m25848c(C6007g c6007g) {
        boolean isEmpty = this.f21972d.isEmpty();
        this.f21972d.addFirst(c6007g);
        if (isEmpty) {
            this.f21973e.execute(this.f21974f);
        } else {
            notifyAll();
        }
    }

    /* renamed from: b */
    void m25851b(C6007g c6007g) {
        if (!c6007g.m25842k()) {
            throw new IllegalArgumentException();
        } else if (c6007g.m25836e()) {
            synchronized (this) {
                m25848c(c6007g);
            }
        }
    }

    /* renamed from: c */
    private void m25847c() {
        do {
        } while (m25852b());
    }

    /* renamed from: b */
    boolean m25852b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r15 = this;
        monitor-enter(r15);
        r0 = r15.f21972d;	 Catch:{ all -> 0x00ab }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00ab }
        r1 = 0;	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x00ab }
    L_0x000a:
        monitor-exit(r15);	 Catch:{ all -> 0x00ab }
        return r1;	 Catch:{ all -> 0x00ab }
    L_0x000c:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00ab }
        r0.<init>();	 Catch:{ all -> 0x00ab }
        r2 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00ab }
        r4 = r15.f21971c;	 Catch:{ all -> 0x00ab }
        r6 = r15.f21972d;	 Catch:{ all -> 0x00ab }
        r6 = r6.descendingIterator();	 Catch:{ all -> 0x00ab }
        r7 = r4;	 Catch:{ all -> 0x00ab }
        r4 = 0;	 Catch:{ all -> 0x00ab }
    L_0x001f:
        r5 = r6.hasNext();	 Catch:{ all -> 0x00ab }
        if (r5 == 0) goto L_0x0057;	 Catch:{ all -> 0x00ab }
    L_0x0025:
        r5 = r6.next();	 Catch:{ all -> 0x00ab }
        r5 = (com.squareup.okhttp.C6007g) r5;	 Catch:{ all -> 0x00ab }
        r9 = r5.m25840i();	 Catch:{ all -> 0x00ab }
        r11 = r15.f21971c;	 Catch:{ all -> 0x00ab }
        r13 = 0;	 Catch:{ all -> 0x00ab }
        r13 = r9 + r11;	 Catch:{ all -> 0x00ab }
        r9 = r13 - r2;	 Catch:{ all -> 0x00ab }
        r11 = 0;	 Catch:{ all -> 0x00ab }
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ all -> 0x00ab }
        if (r13 <= 0) goto L_0x0050;	 Catch:{ all -> 0x00ab }
    L_0x003c:
        r11 = r5.m25836e();	 Catch:{ all -> 0x00ab }
        if (r11 != 0) goto L_0x0043;	 Catch:{ all -> 0x00ab }
    L_0x0042:
        goto L_0x0050;	 Catch:{ all -> 0x00ab }
    L_0x0043:
        r5 = r5.m25839h();	 Catch:{ all -> 0x00ab }
        if (r5 == 0) goto L_0x001f;	 Catch:{ all -> 0x00ab }
    L_0x0049:
        r4 = r4 + 1;	 Catch:{ all -> 0x00ab }
        r7 = java.lang.Math.min(r7, r9);	 Catch:{ all -> 0x00ab }
        goto L_0x001f;	 Catch:{ all -> 0x00ab }
    L_0x0050:
        r6.remove();	 Catch:{ all -> 0x00ab }
        r0.add(r5);	 Catch:{ all -> 0x00ab }
        goto L_0x001f;	 Catch:{ all -> 0x00ab }
    L_0x0057:
        r2 = r15.f21972d;	 Catch:{ all -> 0x00ab }
        r2 = r2.descendingIterator();	 Catch:{ all -> 0x00ab }
    L_0x005d:
        r3 = r2.hasNext();	 Catch:{ all -> 0x00ab }
        if (r3 == 0) goto L_0x007c;	 Catch:{ all -> 0x00ab }
    L_0x0063:
        r3 = r15.f21970b;	 Catch:{ all -> 0x00ab }
        if (r4 <= r3) goto L_0x007c;	 Catch:{ all -> 0x00ab }
    L_0x0067:
        r3 = r2.next();	 Catch:{ all -> 0x00ab }
        r3 = (com.squareup.okhttp.C6007g) r3;	 Catch:{ all -> 0x00ab }
        r5 = r3.m25839h();	 Catch:{ all -> 0x00ab }
        if (r5 == 0) goto L_0x005d;	 Catch:{ all -> 0x00ab }
    L_0x0073:
        r0.add(r3);	 Catch:{ all -> 0x00ab }
        r2.remove();	 Catch:{ all -> 0x00ab }
        r4 = r4 + -1;	 Catch:{ all -> 0x00ab }
        goto L_0x005d;	 Catch:{ all -> 0x00ab }
    L_0x007c:
        r2 = r0.isEmpty();	 Catch:{ all -> 0x00ab }
        r3 = 1;
        if (r2 == 0) goto L_0x0093;
    L_0x0083:
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r9 = r7 / r4;	 Catch:{ InterruptedException -> 0x0093 }
        r4 = r4 * r9;	 Catch:{ InterruptedException -> 0x0093 }
        r2 = 0;	 Catch:{ InterruptedException -> 0x0093 }
        r11 = r7 - r4;	 Catch:{ InterruptedException -> 0x0093 }
        r2 = (int) r11;	 Catch:{ InterruptedException -> 0x0093 }
        r15.wait(r9, r2);	 Catch:{ InterruptedException -> 0x0093 }
        monitor-exit(r15);	 Catch:{ all -> 0x00ab }
        return r3;	 Catch:{ all -> 0x00ab }
    L_0x0093:
        monitor-exit(r15);	 Catch:{ all -> 0x00ab }
        r2 = r0.size();
    L_0x0098:
        if (r1 >= r2) goto L_0x00aa;
    L_0x009a:
        r4 = r0.get(r1);
        r4 = (com.squareup.okhttp.C6007g) r4;
        r4 = r4.m25835d();
        com.squareup.okhttp.internal.C6058i.m26249a(r4);
        r1 = r1 + 1;
        goto L_0x0098;
    L_0x00aa:
        return r3;
    L_0x00ab:
        r0 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00ab }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.h.b():boolean");
    }
}
