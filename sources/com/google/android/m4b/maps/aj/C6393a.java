package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* renamed from: com.google.android.m4b.maps.aj.a */
public class C6393a<V> implements C4636f<V> {
    /* renamed from: a */
    private final C4629a<V> f23722a = new C4629a();
    /* renamed from: b */
    private final C4633d f23723b = new C4633d();

    /* renamed from: com.google.android.m4b.maps.aj.a$a */
    static final class C4629a<V> extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private V f17054a;
        /* renamed from: b */
        private Throwable f17055b;

        C4629a() {
        }

        protected final int tryAcquireShared(int i) {
            return m20749b() != 0 ? 1 : -1;
        }

        protected final boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        /* renamed from: a */
        final V m20745a(long j) {
            if (tryAcquireSharedNanos(-1, j) != null) {
                return m20743e();
            }
            throw new TimeoutException("Timeout waiting for task.");
        }

        /* renamed from: a */
        final V m20744a() {
            acquireSharedInterruptibly(-1);
            return m20743e();
        }

        /* renamed from: e */
        private V m20743e() {
            int state = getState();
            if (state != 2) {
                if (state == 4 || state == 8) {
                    throw C6393a.m27906a("Task was cancelled.", this.f17055b);
                }
                StringBuilder stringBuilder = new StringBuilder("Error, synchronizer in invalid state: ");
                stringBuilder.append(state);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f17055b == null) {
                return this.f17054a;
            } else {
                throw new ExecutionException(this.f17055b);
            }
        }

        /* renamed from: b */
        final boolean m20749b() {
            return (getState() & 14) != 0;
        }

        /* renamed from: c */
        final boolean m20750c() {
            return (getState() & 12) != 0;
        }

        /* renamed from: d */
        final boolean m20751d() {
            return getState() == 8;
        }

        /* renamed from: a */
        final boolean m20746a(V v) {
            return m20742a(v, null, 2);
        }

        /* renamed from: a */
        final boolean m20747a(Throwable th) {
            return m20742a(null, th, 2);
        }

        /* renamed from: a */
        final boolean m20748a(boolean z) {
            return m20742a(null, null, z ? true : true);
        }

        /* renamed from: a */
        private boolean m20742a(V v, Throwable th, int i) {
            boolean compareAndSetState = compareAndSetState(0, 1);
            if (compareAndSetState) {
                this.f17054a = v;
                if ((i & 12) != null) {
                    th = new CancellationException("Future.cancel() was called.");
                }
                this.f17055b = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return compareAndSetState;
        }
    }

    protected C6393a() {
    }

    public V get(long j, TimeUnit timeUnit) {
        return this.f23722a.m20745a(timeUnit.toNanos(j));
    }

    public V get() {
        return this.f23722a.m20744a();
    }

    public boolean isDone() {
        return this.f23722a.m20749b();
    }

    public boolean isCancelled() {
        return this.f23722a.m20750c();
    }

    public boolean cancel(boolean z) {
        if (!this.f23722a.m20748a(z)) {
            return false;
        }
        this.f23723b.m20754a();
        return true;
    }

    /* renamed from: a */
    protected final boolean m27908a() {
        return this.f23722a.m20751d();
    }

    /* renamed from: a */
    public final void mo4860a(Runnable runnable, Executor executor) {
        this.f23723b.m20755a(runnable, executor);
    }

    /* renamed from: a */
    protected boolean mo7025a(V v) {
        v = this.f23722a.m20746a((Object) v);
        if (v != null) {
            this.f23723b.m20754a();
        }
        return v;
    }

    /* renamed from: a */
    protected boolean mo7026a(Throwable th) {
        th = this.f23722a.m20747a((Throwable) C5571j.m24292a((Object) th));
        if (th != null) {
            this.f23723b.m20754a();
        }
        return th;
    }

    /* renamed from: a */
    static final CancellationException m27906a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
