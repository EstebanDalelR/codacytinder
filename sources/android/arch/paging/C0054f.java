package android.arch.paging;

import android.support.annotation.AnyThread;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.paging.f */
public abstract class C0054f<T> extends AbstractList<T> {
    @NonNull
    /* renamed from: a */
    final Executor f125a;
    @NonNull
    /* renamed from: b */
    final Executor f126b;
    @Nullable
    /* renamed from: c */
    final C0049a<T> f127c;
    @NonNull
    /* renamed from: d */
    final C0053d f128d;
    @NonNull
    /* renamed from: e */
    final C0056h<T> f129e;
    /* renamed from: f */
    int f130f = 0;
    /* renamed from: g */
    T f131g = null;
    /* renamed from: h */
    private boolean f132h = false;
    /* renamed from: i */
    private boolean f133i = false;
    /* renamed from: j */
    private int f134j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    /* renamed from: k */
    private int f135k = Integer.MIN_VALUE;
    /* renamed from: l */
    private final AtomicBoolean f136l = new AtomicBoolean(false);
    /* renamed from: m */
    private final ArrayList<WeakReference<C0051c>> f137m = new ArrayList();

    @MainThread
    /* renamed from: android.arch.paging.f$a */
    public static abstract class C0049a<T> {
        /* renamed from: a */
        public void m159a() {
        }

        /* renamed from: a */
        public void m160a(@NonNull T t) {
        }

        /* renamed from: b */
        public void m161b(@NonNull T t) {
        }
    }

    /* renamed from: android.arch.paging.f$b */
    public static final class C0050b<Key, Value> {
        /* renamed from: a */
        private final DataSource<Key, Value> f111a;
        /* renamed from: b */
        private final C0053d f112b;
        /* renamed from: c */
        private Executor f113c;
        /* renamed from: d */
        private Executor f114d;
        /* renamed from: e */
        private C0049a f115e;
        /* renamed from: f */
        private Key f116f;

        public C0050b(@NonNull DataSource<Key, Value> dataSource, @NonNull C0053d c0053d) {
            if (dataSource == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (c0053d == null) {
                throw new IllegalArgumentException("Config may not be null");
            } else {
                this.f111a = dataSource;
                this.f112b = c0053d;
            }
        }

        @NonNull
        /* renamed from: a */
        public C0050b<Key, Value> m164a(@NonNull Executor executor) {
            this.f113c = executor;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public C0050b<Key, Value> m166b(@NonNull Executor executor) {
            this.f114d = executor;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public C0050b<Key, Value> m162a(@Nullable C0049a c0049a) {
            this.f115e = c0049a;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public C0050b<Key, Value> m163a(@Nullable Key key) {
            this.f116f = key;
            return this;
        }

        @WorkerThread
        @NonNull
        /* renamed from: a */
        public C0054f<Value> m165a() {
            if (this.f113c == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            } else if (this.f114d != null) {
                return C0054f.m176b(this.f111a, this.f113c, this.f114d, this.f115e, this.f112b, this.f116f);
            } else {
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
        }
    }

    /* renamed from: android.arch.paging.f$c */
    public static abstract class C0051c {
        /* renamed from: a */
        public abstract void mo45a(int i, int i2);

        /* renamed from: b */
        public abstract void mo46b(int i, int i2);
    }

    /* renamed from: android.arch.paging.f$d */
    public static class C0053d {
        /* renamed from: a */
        public final int f121a;
        /* renamed from: b */
        public final int f122b;
        /* renamed from: c */
        public final boolean f123c;
        /* renamed from: d */
        public final int f124d;

        /* renamed from: android.arch.paging.f$d$a */
        public static final class C0052a {
            /* renamed from: a */
            private int f117a = -1;
            /* renamed from: b */
            private int f118b = -1;
            /* renamed from: c */
            private int f119c = -1;
            /* renamed from: d */
            private boolean f120d = true;

            /* renamed from: a */
            public C0052a m169a(int i) {
                this.f117a = i;
                return this;
            }

            /* renamed from: a */
            public C0053d m170a() {
                if (this.f117a < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                if (this.f118b < 0) {
                    this.f118b = this.f117a;
                }
                if (this.f119c < 0) {
                    this.f119c = this.f117a * 3;
                }
                if (this.f120d || this.f118b != 0) {
                    return new C0053d(this.f117a, this.f118b, this.f120d, this.f119c);
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }
        }

        private C0053d(int i, int i2, boolean z, int i3) {
            this.f121a = i;
            this.f122b = i2;
            this.f123c = z;
            this.f124d = i3;
        }
    }

    /* renamed from: a */
    abstract void mo49a(int i);

    /* renamed from: a */
    abstract void mo52a(@NonNull C0054f<T> c0054f, @NonNull C0051c c0051c);

    /* renamed from: a */
    abstract boolean mo53a();

    @NonNull
    /* renamed from: b */
    public abstract DataSource<?, T> mo54b();

    @Nullable
    /* renamed from: c */
    public abstract Object mo57c();

    C0054f(@NonNull C0056h<T> c0056h, @NonNull Executor executor, @NonNull Executor executor2, @Nullable C0049a<T> c0049a, @NonNull C0053d c0053d) {
        this.f129e = c0056h;
        this.f125a = executor;
        this.f126b = executor2;
        this.f127c = c0049a;
        this.f128d = c0053d;
    }

    @NonNull
    /* renamed from: b */
    private static <K, T> C0054f<T> m176b(@NonNull DataSource<K, T> dataSource, @NonNull Executor executor, @NonNull Executor executor2, @Nullable C0049a<T> c0049a, @NonNull C0053d c0053d, @Nullable K k) {
        int intValue;
        if (!dataSource.mo47a()) {
            if (c0053d.f123c) {
                return new C2709m((C2705j) dataSource, executor, executor2, c0049a, c0053d, k != null ? ((Integer) k).intValue() : 0);
            }
        }
        if (!dataSource.mo47a()) {
            dataSource = ((C2705j) dataSource).m10525c();
            if (k != null) {
                intValue = ((Integer) k).intValue();
                return new C2696c((C2694b) dataSource, executor, executor2, c0049a, c0053d, k, intValue);
            }
        }
        intValue = -1;
        return new C2696c((C2694b) dataSource, executor, executor2, c0049a, c0053d, k, intValue);
    }

    @Nullable
    public T get(int i) {
        i = this.f129e.get(i);
        if (i != 0) {
            this.f131g = i;
        }
        return i;
    }

    /* renamed from: d */
    public void m189d(int i) {
        this.f130f = m195h() + i;
        mo49a(i);
        this.f134j = Math.min(this.f134j, i);
        this.f135k = Math.max(this.f135k, i);
        m173a((boolean) 1);
    }

    @AnyThread
    /* renamed from: a */
    void m183a(final boolean z, final boolean z2, final boolean z3) {
        if (this.f127c == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.f134j == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            this.f134j = this.f129e.size();
        }
        if (this.f135k == Integer.MIN_VALUE) {
            this.f135k = 0;
        }
        if (z || z2 || z3) {
            this.f125a.execute(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C0054f f107d;

                public void run() {
                    if (z) {
                        this.f107d.f127c.m159a();
                    }
                    if (z2) {
                        this.f107d.f132h = true;
                    }
                    if (z3) {
                        this.f107d.f133i = true;
                    }
                    this.f107d.m173a(false);
                }
            });
        }
    }

    /* renamed from: a */
    private void m173a(boolean z) {
        boolean z2 = true;
        final boolean z3 = this.f132h && this.f134j <= this.f128d.f122b;
        if (!this.f133i || this.f135k < (size() - 1) - this.f128d.f122b) {
            z2 = false;
        }
        if (z3 || z2) {
            if (z3) {
                this.f132h = false;
            }
            if (z2) {
                this.f133i = false;
            }
            if (z) {
                this.f125a.execute(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0054f f110c;

                    public void run() {
                        this.f110c.m174a(z3, z2);
                    }
                });
            } else {
                m174a(z3, z2);
            }
        }
    }

    /* renamed from: a */
    private void m174a(boolean z, boolean z2) {
        if (z) {
            this.f127c.m160a(this.f129e.m221l());
        }
        if (z2) {
            this.f127c.m161b(this.f129e.m222m());
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    void m192e(int i) {
        this.f134j += i;
        this.f135k += i;
    }

    public int size() {
        return this.f129e.size();
    }

    /* renamed from: d */
    public boolean mo73d() {
        return mo74f();
    }

    @NonNull
    /* renamed from: e */
    public List<T> m191e() {
        if (mo73d()) {
            return this;
        }
        return new C2707l(this);
    }

    /* renamed from: f */
    public boolean mo74f() {
        return this.f136l.get();
    }

    /* renamed from: g */
    public void m194g() {
        this.f136l.set(true);
    }

    /* renamed from: h */
    public int m195h() {
        return this.f129e.m218i();
    }

    /* renamed from: a */
    public void m182a(@Nullable List<T> list, @NonNull C0051c c0051c) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo52a((C0054f) list, c0051c);
            } else if (this.f129e.isEmpty() == null) {
                c0051c.mo45a(null, this.f129e.size());
            }
        }
        for (list = this.f137m.size() - 1; list >= null; list--) {
            if (((C0051c) ((WeakReference) this.f137m.get(list)).get()) == null) {
                this.f137m.remove(list);
            }
        }
        this.f137m.add(new WeakReference(c0051c));
    }

    /* renamed from: a */
    public void m180a(@NonNull C0051c c0051c) {
        for (int size = this.f137m.size() - 1; size >= 0; size--) {
            C0051c c0051c2 = (C0051c) ((WeakReference) this.f137m.get(size)).get();
            if (c0051c2 == null || c0051c2 == c0051c) {
                this.f137m.remove(size);
            }
        }
    }

    /* renamed from: b */
    void m186b(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f137m.size() - 1; size >= 0; size--) {
                C0051c c0051c = (C0051c) ((WeakReference) this.f137m.get(size)).get();
                if (c0051c != null) {
                    c0051c.mo45a(i, i2);
                }
            }
        }
    }

    /* renamed from: c */
    void m188c(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f137m.size() - 1; size >= 0; size--) {
                C0051c c0051c = (C0051c) ((WeakReference) this.f137m.get(size)).get();
                if (c0051c != null) {
                    c0051c.mo46b(i, i2);
                }
            }
        }
    }
}
