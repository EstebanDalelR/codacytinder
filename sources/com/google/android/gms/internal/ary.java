package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class ary {
    /* renamed from: a */
    private final AtomicInteger f15674a;
    /* renamed from: b */
    private final Set<aom<?>> f15675b;
    /* renamed from: c */
    private final PriorityBlockingQueue<aom<?>> f15676c;
    /* renamed from: d */
    private final PriorityBlockingQueue<aom<?>> f15677d;
    /* renamed from: e */
    private final zzb f15678e;
    /* renamed from: f */
    private final zzm f15679f;
    /* renamed from: g */
    private final zzz f15680g;
    /* renamed from: h */
    private final alg[] f15681h;
    /* renamed from: i */
    private tq f15682i;
    /* renamed from: j */
    private final List<Object> f15683j;

    public ary(zzb zzb, zzm zzm) {
        this(zzb, zzm, 4);
    }

    private ary(zzb zzb, zzm zzm, int i) {
        this(zzb, zzm, 4, new ahh(new Handler(Looper.getMainLooper())));
    }

    private ary(zzb zzb, zzm zzm, int i, zzz zzz) {
        this.f15674a = new AtomicInteger();
        this.f15675b = new HashSet();
        this.f15676c = new PriorityBlockingQueue();
        this.f15677d = new PriorityBlockingQueue();
        this.f15683j = new ArrayList();
        this.f15678e = zzb;
        this.f15679f = zzm;
        this.f15681h = new alg[4];
        this.f15680g = zzz;
    }

    /* renamed from: a */
    public final <T> aom<T> m19466a(aom<T> aom) {
        aom.m19379a(this);
        synchronized (this.f15675b) {
            this.f15675b.add(aom);
        }
        aom.m19378a(this.f15674a.incrementAndGet());
        aom.m19388b("add-to-queue");
        (!aom.m19394g() ? this.f15677d : this.f15676c).add(aom);
        return aom;
    }

    /* renamed from: a */
    public final void m19467a() {
        if (this.f15682i != null) {
            this.f15682i.m20190a();
        }
        for (alg alg : this.f15681h) {
            if (alg != null) {
                alg.m19326a();
            }
        }
        this.f15682i = new tq(this.f15676c, this.f15677d, this.f15678e, this.f15680g);
        this.f15682i.start();
        for (int i = 0; i < this.f15681h.length; i++) {
            alg alg2 = new alg(this.f15677d, this.f15679f, this.f15678e, this.f15680g);
            this.f15681h[i] = alg2;
            alg2.start();
        }
    }

    /* renamed from: b */
    final <T> void m19468b(aom<T> aom) {
        synchronized (this.f15675b) {
            this.f15675b.remove(aom);
        }
        synchronized (this.f15683j) {
            Iterator it = this.f15683j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
