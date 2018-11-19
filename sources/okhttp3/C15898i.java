package okhttp3;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.C17694p.C17693a;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.i */
public final class C15898i {
    /* renamed from: a */
    private int f49223a = 64;
    /* renamed from: b */
    private int f49224b = 5;
    @Nullable
    /* renamed from: c */
    private Runnable f49225c;
    @Nullable
    /* renamed from: d */
    private ExecutorService f49226d;
    /* renamed from: e */
    private final Deque<C17693a> f49227e = new ArrayDeque();
    /* renamed from: f */
    private final Deque<C17693a> f49228f = new ArrayDeque();
    /* renamed from: g */
    private final Deque<C17694p> f49229g = new ArrayDeque();

    /* renamed from: a */
    public synchronized ExecutorService m60102a() {
        if (this.f49226d == null) {
            this.f49226d = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C15908c.m60163a("OkHttp Dispatcher", false));
        }
        return this.f49226d;
    }

    /* renamed from: a */
    public synchronized void m60103a(int i) {
        if (i < 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("max < 1: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f49224b = i;
        m60101c();
    }

    /* renamed from: a */
    synchronized void m60104a(C17693a c17693a) {
        if (this.f49228f.size() >= this.f49223a || m60100c(c17693a) >= this.f49224b) {
            this.f49227e.add(c17693a);
        } else {
            this.f49228f.add(c17693a);
            m60102a().execute(c17693a);
        }
    }

    /* renamed from: c */
    private void m60101c() {
        if (this.f49228f.size() < this.f49223a && !this.f49227e.isEmpty()) {
            Iterator it = this.f49227e.iterator();
            while (it.hasNext()) {
                C17693a c17693a = (C17693a) it.next();
                if (m60100c(c17693a) < this.f49224b) {
                    it.remove();
                    this.f49228f.add(c17693a);
                    m60102a().execute(c17693a);
                }
                if (this.f49228f.size() >= this.f49223a) {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private int m60100c(C17693a c17693a) {
        int i = 0;
        for (C17693a c17693a2 : this.f49228f) {
            if (!c17693a2.m64418b().f55074d) {
                if (c17693a2.m64417a().equals(c17693a.m64417a())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    synchronized void m60105a(C17694p c17694p) {
        this.f49229g.add(c17694p);
    }

    /* renamed from: b */
    void m60107b(C17693a c17693a) {
        m60099a(this.f49228f, c17693a, true);
    }

    /* renamed from: b */
    void m60108b(C17694p c17694p) {
        m60099a(this.f49229g, c17694p, false);
    }

    /* renamed from: a */
    private <T> void m60099a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t) == null) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z) {
                m60101c();
            }
            deque = m60106b();
            t = this.f49225c;
        }
        if (deque == null && t != null) {
            t.run();
        }
    }

    /* renamed from: b */
    public synchronized int m60106b() {
        return this.f49228f.size() + this.f49229g.size();
    }
}
