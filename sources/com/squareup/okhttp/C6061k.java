package com.squareup.okhttp;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.squareup.okhttp.C6002d.C7210b;
import com.squareup.okhttp.internal.C6058i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.okhttp.k */
public final class C6061k {
    /* renamed from: a */
    private int f22211a = 64;
    /* renamed from: b */
    private int f22212b = 5;
    /* renamed from: c */
    private ExecutorService f22213c;
    /* renamed from: d */
    private final Deque<C7210b> f22214d = new ArrayDeque();
    /* renamed from: e */
    private final Deque<C7210b> f22215e = new ArrayDeque();
    /* renamed from: f */
    private final Deque<C6002d> f22216f = new ArrayDeque();

    /* renamed from: a */
    public synchronized ExecutorService m26261a() {
        if (this.f22213c == null) {
            this.f22213c = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C6058i.m26244a("OkHttp Dispatcher", false));
        }
        return this.f22213c;
    }

    /* renamed from: a */
    synchronized void m26262a(C7210b c7210b) {
        if (this.f22215e.size() >= this.f22211a || m26260c(c7210b) >= this.f22212b) {
            this.f22214d.add(c7210b);
        } else {
            this.f22215e.add(c7210b);
            m26261a().execute(c7210b);
        }
    }

    /* renamed from: b */
    synchronized void m26264b(C7210b c7210b) {
        if (this.f22215e.remove(c7210b) == null) {
            throw new AssertionError("AsyncCall wasn't running!");
        }
        m26259b();
    }

    /* renamed from: b */
    private void m26259b() {
        if (this.f22215e.size() < this.f22211a && !this.f22214d.isEmpty()) {
            Iterator it = this.f22214d.iterator();
            while (it.hasNext()) {
                C7210b c7210b = (C7210b) it.next();
                if (m26260c(c7210b) < this.f22212b) {
                    it.remove();
                    this.f22215e.add(c7210b);
                    m26261a().execute(c7210b);
                }
                if (this.f22215e.size() >= this.f22211a) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private int m26260c(C7210b c7210b) {
        int i = 0;
        for (C7210b a : this.f22215e) {
            if (a.m30955a().equals(c7210b.m30955a())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    synchronized void m26263a(C6002d c6002d) {
        this.f22216f.add(c6002d);
    }

    /* renamed from: b */
    synchronized void m26265b(C6002d c6002d) {
        if (this.f22216f.remove(c6002d) == null) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
