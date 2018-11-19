package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzzv
public class iw<T> implements zzakv<T> {
    /* renamed from: a */
    private final Object f23333a = new Object();
    /* renamed from: b */
    private T f23334b;
    /* renamed from: c */
    private Throwable f23335c;
    /* renamed from: d */
    private boolean f23336d;
    /* renamed from: e */
    private boolean f23337e;
    /* renamed from: f */
    private final in f23338f = new in();

    /* renamed from: a */
    private final boolean mo6874a() {
        if (this.f23335c == null) {
            if (!this.f23336d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m27363a(Throwable th) {
        synchronized (this.f23333a) {
            if (this.f23337e) {
            } else if (mo6874a()) {
                ar.i().m27296a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
            } else {
                this.f23335c = th;
                this.f23333a.notifyAll();
                this.f23338f.m19932a();
            }
        }
    }

    /* renamed from: b */
    public final void m27364b(@Nullable T t) {
        synchronized (this.f23333a) {
            if (this.f23337e) {
            } else if (mo6874a()) {
                ar.i().m27296a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
            } else {
                this.f23336d = true;
                this.f23334b = t;
                this.f23333a.notifyAll();
                this.f23338f.m19932a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f23333a) {
            if (mo6874a()) {
                return false;
            }
            this.f23337e = true;
            this.f23336d = true;
            this.f23333a.notifyAll();
            this.f23338f.m19932a();
            return true;
        }
    }

    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f23333a) {
            if (!mo6874a()) {
                try {
                    this.f23333a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f23335c != null) {
                throw new ExecutionException(this.f23335c);
            } else if (this.f23337e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f23334b;
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f23333a) {
            if (!mo6874a()) {
                try {
                    j = timeUnit.toMillis(j);
                    if (j != 0) {
                        this.f23333a.wait(j);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f23335c != null) {
                throw new ExecutionException(this.f23335c);
            } else if (!this.f23336d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (this.f23337e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f23334b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f23333a) {
            z = this.f23337e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f23333a) {
            a = mo6874a();
        }
        return a;
    }

    public final void zza(Runnable runnable, Executor executor) {
        this.f23338f.m19933a(runnable, executor);
    }
}
