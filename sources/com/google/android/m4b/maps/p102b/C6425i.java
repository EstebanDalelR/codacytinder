package com.google.android.m4b.maps.p102b;

import com.google.android.m4b.maps.p101a.C4529m.C4527a;
import com.google.android.m4b.maps.p101a.C4529m.C4528b;
import com.google.android.m4b.maps.p101a.C4532r;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.m4b.maps.b.i */
public final class C6425i<T> implements C4527a, C4528b<T>, Future<T> {
    /* renamed from: a */
    private boolean f23841a = false;
    /* renamed from: b */
    private T f23842b;
    /* renamed from: c */
    private C4532r f23843c;

    public final boolean isCancelled() {
        return false;
    }

    /* renamed from: a */
    public static <E> C6425i<E> m28072a() {
        return new C6425i();
    }

    private C6425i() {
    }

    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        try {
            return m28073a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final T get(long j, TimeUnit timeUnit) {
        return m28073a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    /* renamed from: a */
    private synchronized T m28073a(Long l) {
        if (this.f23843c != null) {
            throw new ExecutionException(this.f23843c);
        } else if (this.f23841a) {
            return this.f23842b;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.f23843c != null) {
                throw new ExecutionException(this.f23843c);
            } else if (this.f23841a == null) {
                throw new TimeoutException();
            } else {
                return this.f23842b;
            }
        }
    }

    public final synchronized boolean isDone() {
        boolean z;
        if (!this.f23841a && this.f23843c == null) {
            if (!isCancelled()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo4906a(T t) {
        this.f23841a = true;
        this.f23842b = t;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void mo4905a(C4532r c4532r) {
        this.f23843c = c4532r;
        notifyAll();
    }
}
