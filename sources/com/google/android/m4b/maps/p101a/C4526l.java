package com.google.android.m4b.maps.p101a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.a.l */
public class C4526l {
    /* renamed from: a */
    private AtomicInteger f16822a = new AtomicInteger();
    /* renamed from: b */
    private final Map<String, Queue<C4525k<?>>> f16823b = new HashMap();
    /* renamed from: c */
    private final Set<C4525k<?>> f16824c = new HashSet();
    /* renamed from: d */
    private final PriorityBlockingQueue<C4525k<?>> f16825d = new PriorityBlockingQueue();
    /* renamed from: e */
    private final PriorityBlockingQueue<C4525k<?>> f16826e = new PriorityBlockingQueue();
    /* renamed from: f */
    private final C4515b f16827f;
    /* renamed from: g */
    private final C4520e f16828g;
    /* renamed from: h */
    private final C4530n f16829h;
    /* renamed from: i */
    private C4521f[] f16830i;
    /* renamed from: j */
    private C4517c f16831j;
    /* renamed from: k */
    private List<Object> f16832k = new ArrayList();

    public C4526l(C4515b c4515b, C4520e c4520e, int i, C4530n c4530n) {
        this.f16827f = c4515b;
        this.f16828g = c4520e;
        this.f16830i = new C4521f[4];
        this.f16829h = c4530n;
    }

    /* renamed from: a */
    public <T> C4525k<T> mo4884a(C4525k<T> c4525k) {
        c4525k.m20425a(this);
        synchronized (this.f16824c) {
            this.f16824c.add(c4525k);
        }
        c4525k.m20423a(this.f16822a.incrementAndGet());
        c4525k.m20430a("add-to-queue");
        if (c4525k.m20443l()) {
            synchronized (this.f16823b) {
                String d = c4525k.m20435d();
                if (this.f16823b.containsKey(d)) {
                    Queue queue = (Queue) this.f16823b.get(d);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(c4525k);
                    this.f16823b.put(d, queue);
                    if (C4535s.f16849a) {
                        C4535s.m20467a("Request for cacheKey=%s is in flight, putting on hold.", d);
                    }
                } else {
                    this.f16823b.put(d, null);
                    this.f16825d.add(c4525k);
                }
            }
            return c4525k;
        }
        this.f16826e.add(c4525k);
        return c4525k;
    }

    /* renamed from: b */
    final <T> void m20451b(C4525k<T> c4525k) {
        synchronized (this.f16824c) {
            this.f16824c.remove(c4525k);
        }
        synchronized (this.f16832k) {
            Iterator it = this.f16832k.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (c4525k.m20443l()) {
            synchronized (this.f16823b) {
                Queue queue = (Queue) this.f16823b.remove(c4525k.m20435d());
                if (queue != null) {
                    if (C4535s.f16849a) {
                        C4535s.m20467a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), c4525k);
                    }
                    this.f16825d.addAll(queue);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m20450a() {
        if (this.f16831j != null) {
            this.f16831j.m20416a();
        }
        for (int i = 0; i < this.f16830i.length; i++) {
            if (this.f16830i[i] != null) {
                this.f16830i[i].m20418a();
            }
        }
        this.f16831j = new C4517c(this.f16825d, this.f16826e, this.f16827f, this.f16829h);
        this.f16831j.start();
        for (int i2 = 0; i2 < this.f16830i.length; i2++) {
            C4521f c4521f = new C4521f(this.f16826e, this.f16828g, this.f16827f, this.f16829h);
            this.f16830i[i2] = c4521f;
            c4521f.start();
        }
    }
}
