package okhttp3;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15917d;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C15921f.C15920a;
import okhttp3.internal.connection.C17659c;
import okhttp3.internal.p461b.C15904f;

/* renamed from: okhttp3.f */
public final class C15894f {
    /* renamed from: c */
    static final /* synthetic */ boolean f49190c = true;
    /* renamed from: d */
    private static final Executor f49191d = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C15908c.m60163a("OkHttp ConnectionPool", (boolean) f49190c));
    /* renamed from: a */
    final C15917d f49192a;
    /* renamed from: b */
    boolean f49193b;
    /* renamed from: e */
    private final int f49194e;
    /* renamed from: f */
    private final long f49195f;
    /* renamed from: g */
    private final Runnable f49196g;
    /* renamed from: h */
    private final Deque<C17659c> f49197h;

    /* renamed from: okhttp3.f$1 */
    class C158931 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C15894f f49189a;

        C158931(C15894f c15894f) {
            this.f49189a = c15894f;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r8 = this;
        L_0x0000:
            r0 = r8.f49189a;
            r1 = java.lang.System.nanoTime();
            r0 = r0.m60070a(r1);
            r2 = -1;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 != 0) goto L_0x0011;
        L_0x0010:
            return;
        L_0x0011:
            r2 = 0;
            r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r4 <= 0) goto L_0x0000;
        L_0x0017:
            r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
            r4 = r0 / r2;
            r2 = r2 * r4;
            r6 = r0 - r2;
            r0 = r8.f49189a;
            monitor-enter(r0);
            r1 = r8.f49189a;	 Catch:{ InterruptedException -> 0x002c }
            r2 = (int) r6;	 Catch:{ InterruptedException -> 0x002c }
            r1.wait(r4, r2);	 Catch:{ InterruptedException -> 0x002c }
            goto L_0x002c;
        L_0x002a:
            r1 = move-exception;
            goto L_0x002e;
        L_0x002c:
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            goto L_0x0000;	 Catch:{ all -> 0x002a }
        L_0x002e:
            monitor-exit(r0);	 Catch:{ all -> 0x002a }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.f.1.run():void");
        }
    }

    public C15894f() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C15894f(int i, long j, TimeUnit timeUnit) {
        this.f49196g = new C158931(this);
        this.f49197h = new ArrayDeque();
        this.f49192a = new C15917d();
        this.f49194e = i;
        this.f49195f = timeUnit.toNanos(j);
        if (j <= 0) {
            timeUnit = new StringBuilder();
            timeUnit.append("keepAliveDuration <= 0: ");
            timeUnit.append(j);
            throw new IllegalArgumentException(timeUnit.toString());
        }
    }

    @Nullable
    /* renamed from: a */
    C17659c m60072a(C15885a c15885a, C15921f c15921f, C15969u c15969u) {
        if (f49190c || Thread.holdsLock(this)) {
            for (C17659c c17659c : this.f49197h) {
                if (c17659c.m64312a(c15885a, c15969u)) {
                    c15921f.m60248a(c17659c, f49190c);
                    return c17659c;
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    @Nullable
    /* renamed from: a */
    Socket m60071a(C15885a c15885a, C15921f c15921f) {
        if (f49190c || Thread.holdsLock(this)) {
            for (C17659c c17659c : this.f49197h) {
                if (c17659c.m64312a(c15885a, null) && c17659c.m64314b() && c17659c != c15921f.m60251c()) {
                    return c15921f.m60244a(c17659c);
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    void m60073a(C17659c c17659c) {
        if (f49190c || Thread.holdsLock(this)) {
            if (!this.f49193b) {
                this.f49193b = f49190c;
                f49191d.execute(this.f49196g);
            }
            this.f49197h.add(c17659c);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    boolean m60074b(C17659c c17659c) {
        if (f49190c || Thread.holdsLock(this)) {
            if (!c17659c.f54886a) {
                if (this.f49194e != 0) {
                    notifyAll();
                    return null;
                }
            }
            this.f49197h.remove(c17659c);
            return f49190c;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    long m60070a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C17659c c17659c = null;
            int i = 0;
            int i2 = 0;
            for (C17659c c17659c2 : this.f49197h) {
                if (m60069a(c17659c2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c17659c2.f54890e;
                    if (j3 > j2) {
                        c17659c = c17659c2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f49195f) {
                if (i <= this.f49194e) {
                    if (i > 0) {
                        long j4 = this.f49195f - j2;
                        return j4;
                    } else if (i2 > 0) {
                        j = this.f49195f;
                        return j;
                    } else {
                        this.f49193b = false;
                        return -1;
                    }
                }
            }
            this.f49197h.remove(c17659c);
            C15908c.m60166a(c17659c.socket());
            return 0;
        }
    }

    /* renamed from: a */
    private int m60069a(C17659c c17659c, long j) {
        List list = c17659c.f54889d;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C15920a c15920a = (C15920a) reference;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("A connection to ");
                stringBuilder.append(c17659c.route().m60567a().m60021a());
                stringBuilder.append(" was leaked. Did you forget to close a response body?");
                C15904f.m60134c().mo13339a(stringBuilder.toString(), c15920a.f49334a);
                list.remove(i);
                c17659c.f54886a = f49190c;
                if (list.isEmpty()) {
                    c17659c.f54890e = j - this.f49195f;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
