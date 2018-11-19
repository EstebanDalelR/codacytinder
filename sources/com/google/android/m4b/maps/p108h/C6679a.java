package com.google.android.m4b.maps.p108h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.p108h.C5425k.C5424a;
import com.google.android.m4b.maps.p110j.C5456q;
import com.google.android.m4b.maps.p110j.C5462v;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.m4b.maps.h.a */
public abstract class C6679a<R extends C5427m> implements C5425k<R> {
    /* renamed from: a */
    private final Object f24972a = new Object();
    /* renamed from: b */
    private C5400a<R> f24973b;
    /* renamed from: c */
    private final CountDownLatch f24974c = new CountDownLatch(1);
    /* renamed from: d */
    private final ArrayList<C5424a> f24975d = new ArrayList();
    /* renamed from: e */
    private C5428n<R> f24976e;
    /* renamed from: f */
    private volatile R f24977f;
    /* renamed from: g */
    private volatile boolean f24978g;
    /* renamed from: h */
    private boolean f24979h;
    /* renamed from: i */
    private boolean f24980i;
    /* renamed from: j */
    private C5456q f24981j;

    /* renamed from: com.google.android.m4b.maps.h.a$a */
    public static class C5400a<R extends C5427m> extends Handler {
        public C5400a() {
            this(Looper.getMainLooper());
        }

        public C5400a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    C5428n c5428n = (C5428n) pair.first;
                    C5427m c5427m = (C5427m) pair.second;
                    return;
                case 2:
                    ((C6679a) message.obj).m29759b(C6691q.f25044c);
                    return;
                default:
                    Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                    return;
            }
        }
    }

    /* renamed from: a */
    protected abstract R mo7643a(C6691q c6691q);

    protected C6679a(Looper looper) {
        this.f24973b = new C5400a(looper);
    }

    /* renamed from: c */
    private boolean m29754c() {
        return this.f24974c.getCount() == 0;
    }

    /* renamed from: a */
    public final void m29757a(C5424a c5424a) {
        C5462v.m23771a(this.f24978g ^ 1, (Object) "Result has already been consumed.");
        synchronized (this.f24972a) {
            if (m29754c()) {
                C5427m c5427m = this.f24977f;
                c5424a.mo5397a();
            } else {
                this.f24975d.add(c5424a);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m29756a() {
        /*
        r2 = this;
        r0 = r2.f24972a;
        monitor-enter(r0);
        r1 = r2.f24979h;	 Catch:{ all -> 0x0024 }
        if (r1 != 0) goto L_0x0022;
    L_0x0007:
        r1 = r2.f24978g;	 Catch:{ all -> 0x0024 }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0022;
    L_0x000c:
        r1 = r2.f24977f;	 Catch:{ all -> 0x0024 }
        com.google.android.m4b.maps.p108h.C6679a.m29752b(r1);	 Catch:{ all -> 0x0024 }
        r1 = 0;
        r2.f24976e = r1;	 Catch:{ all -> 0x0024 }
        r1 = 1;
        r2.f24979h = r1;	 Catch:{ all -> 0x0024 }
        r1 = com.google.android.m4b.maps.p108h.C6691q.f25045d;	 Catch:{ all -> 0x0024 }
        r1 = r2.mo7643a(r1);	 Catch:{ all -> 0x0024 }
        r2.m29753c(r1);	 Catch:{ all -> 0x0024 }
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        return;
    L_0x0022:
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        return;
    L_0x0024:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.h.a.a():void");
    }

    /* renamed from: a */
    public final void m29758a(R r) {
        synchronized (this.f24972a) {
            if (!this.f24980i) {
                if (!this.f24979h) {
                    C5462v.m23771a(m29754c() ^ 1, (Object) "Results have already been set");
                    C5462v.m23771a(this.f24978g ^ 1, (Object) "Result has already been consumed");
                    m29753c(r);
                    return;
                }
            }
            C6679a.m29752b((C5427m) r);
        }
    }

    /* renamed from: b */
    public final void m29759b(C6691q c6691q) {
        synchronized (this.f24972a) {
            if (!m29754c()) {
                m29758a(mo7643a(c6691q));
                this.f24980i = true;
            }
        }
    }

    /* renamed from: c */
    private void m29753c(R r) {
        this.f24977f = r;
        this.f24981j = null;
        this.f24974c.countDown();
        r = this.f24977f;
        r = this.f24975d.iterator();
        while (r.hasNext()) {
            ((C5424a) r.next()).mo5397a();
        }
        this.f24975d.clear();
    }

    /* renamed from: b */
    static void m29752b(C5427m c5427m) {
        if ((c5427m instanceof C5426l) == null) {
        }
    }
}
