package android.arch.paging;

import android.arch.paging.C0046e.C0045a;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DataSource<Key, Value> {
    /* renamed from: a */
    private AtomicBoolean f70a = new AtomicBoolean(false);
    /* renamed from: b */
    private CopyOnWriteArrayList<InvalidatedCallback> f71b = new CopyOnWriteArrayList();

    public interface InvalidatedCallback {
        @AnyThread
        void onInvalidated();
    }

    /* renamed from: android.arch.paging.DataSource$a */
    public static abstract class C0033a<Key, Value> {
        /* renamed from: a */
        public abstract DataSource<Key, Value> m136a();
    }

    /* renamed from: android.arch.paging.DataSource$b */
    static class C0035b<T> {
        /* renamed from: a */
        final int f64a;
        /* renamed from: b */
        private final DataSource f65b;
        /* renamed from: c */
        private final C0045a<T> f66c;
        /* renamed from: d */
        private final Object f67d = new Object();
        /* renamed from: e */
        private Executor f68e = null;
        /* renamed from: f */
        private boolean f69f = false;

        /* renamed from: a */
        static void m138a(@NonNull List<?> list, int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.size() + i > i2) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            } else if (list.size() == null && i2 > 0) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        C0035b(@NonNull DataSource dataSource, int i, @Nullable Executor executor, @NonNull C0045a<T> c0045a) {
            this.f65b = dataSource;
            this.f64a = i;
            this.f68e = executor;
            this.f66c = c0045a;
        }

        /* renamed from: a */
        void m140a(Executor executor) {
            synchronized (this.f67d) {
                this.f68e = executor;
            }
        }

        /* renamed from: a */
        boolean m141a() {
            if (!this.f65b.mo2969b()) {
                return false;
            }
            m139a(C0046e.m157a());
            return true;
        }

        /* renamed from: a */
        void m139a(@NonNull final C0046e<T> c0046e) {
            synchronized (this.f67d) {
                if (this.f69f) {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
                this.f69f = true;
                Executor executor = this.f68e;
            }
            if (executor != null) {
                executor.execute(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0035b f63b;

                    public void run() {
                        this.f63b.f66c.mo48a(this.f63b.f64a, c0046e);
                    }
                });
            } else {
                this.f66c.mo48a(this.f64a, c0046e);
            }
        }
    }

    /* renamed from: a */
    abstract boolean mo47a();

    DataSource() {
    }

    @AnyThread
    /* renamed from: a */
    public void mo2967a(@NonNull InvalidatedCallback invalidatedCallback) {
        this.f71b.add(invalidatedCallback);
    }

    @AnyThread
    /* renamed from: b */
    public void mo2968b(@NonNull InvalidatedCallback invalidatedCallback) {
        this.f71b.remove(invalidatedCallback);
    }

    @WorkerThread
    /* renamed from: b */
    public boolean mo2969b() {
        return this.f70a.get();
    }
}
