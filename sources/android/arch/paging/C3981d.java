package android.arch.paging;

import android.arch.paging.C0046e.C0045a;
import android.arch.paging.DataSource.C0035b;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.d */
public abstract class C3981d<Key, Value> extends C2694b<Key, Value> {

    /* renamed from: android.arch.paging.d$a */
    public static abstract class C0042a<Value> {
        /* renamed from: a */
        public abstract void mo59a(@NonNull List<Value> list);
    }

    /* renamed from: android.arch.paging.d$e */
    public static class C0043e<Key> {
        @Nullable
        /* renamed from: a */
        public final Key f94a;
        /* renamed from: b */
        public final int f95b;
        /* renamed from: c */
        public final boolean f96c;

        public C0043e(@Nullable Key key, int i, boolean z) {
            this.f94a = key;
            this.f95b = i;
            this.f96c = z;
        }
    }

    /* renamed from: android.arch.paging.d$f */
    public static class C0044f<Key> {
        /* renamed from: a */
        public final Key f97a;
        /* renamed from: b */
        public final int f98b;

        public C0044f(Key key, int i) {
            this.f97a = key;
            this.f98b = i;
        }
    }

    /* renamed from: android.arch.paging.d$b */
    static class C2697b<Value> extends C0042a<Value> {
        /* renamed from: a */
        final C0035b<Value> f8530a;

        C2697b(@NonNull C3981d c3981d, int i, @Nullable Executor executor, @NonNull C0045a<Value> c0045a) {
            this.f8530a = new C0035b(c3981d, i, executor, c0045a);
        }

        /* renamed from: a */
        public void mo59a(@NonNull List<Value> list) {
            if (!this.f8530a.m141a()) {
                this.f8530a.m139a(new C0046e(list, 0, 0, 0));
            }
        }
    }

    /* renamed from: android.arch.paging.d$c */
    public static abstract class C2698c<Value> extends C0042a<Value> {
        /* renamed from: a */
        public abstract void mo2962a(@NonNull List<Value> list, int i, int i2);
    }

    /* renamed from: android.arch.paging.d$d */
    static class C3980d<Value> extends C2698c<Value> {
        /* renamed from: a */
        final C0035b<Value> f12638a;
        /* renamed from: b */
        private final boolean f12639b;

        C3980d(@NonNull C3981d c3981d, boolean z, @NonNull C0045a<Value> c0045a) {
            this.f12638a = new C0035b(c3981d, 0, null, c0045a);
            this.f12639b = z;
        }

        /* renamed from: a */
        public void mo2962a(@NonNull List<Value> list, int i, int i2) {
            if (!this.f12638a.m141a()) {
                C0035b.m138a(list, i, i2);
                i2 = (i2 - i) - list.size();
                if (this.f12639b) {
                    this.f12638a.m139a(new C0046e(list, i, i2, 0));
                } else {
                    this.f12638a.m139a(new C0046e(list, i));
                }
            }
        }

        /* renamed from: a */
        public void mo59a(@NonNull List<Value> list) {
            if (!this.f12638a.m141a()) {
                this.f12638a.m139a(new C0046e(list, 0, 0, 0));
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public abstract Key m15527a(@NonNull Value value);

    /* renamed from: a */
    public abstract void m15529a(@NonNull C0043e<Key> c0043e, @NonNull C2698c<Value> c2698c);

    /* renamed from: a */
    public abstract void m15530a(@NonNull C0044f<Key> c0044f, @NonNull C0042a<Value> c0042a);

    /* renamed from: b */
    public abstract void m15533b(@NonNull C0044f<Key> c0044f, @NonNull C0042a<Value> c0042a);

    @Nullable
    /* renamed from: a */
    final Key mo2963a(int i, Value value) {
        return value == null ? null : m15527a(value);
    }

    /* renamed from: a */
    final void mo2965a(@Nullable Key key, int i, int i2, boolean z, @NonNull Executor executor, @NonNull C0045a<Value> c0045a) {
        C2698c c3980d = new C3980d(this, z, c0045a);
        m15529a(new C0043e(key, i, z), c3980d);
        c3980d.f12638a.m140a(executor);
    }

    /* renamed from: a */
    final void mo2964a(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull C0045a<Value> c0045a) {
        m15530a(new C0044f(m15527a(value), i2), new C2697b(this, 1, executor, c0045a));
    }

    /* renamed from: b */
    final void mo2966b(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull C0045a<Value> c0045a) {
        m15533b(new C0044f(m15527a(value), i2), new C2697b(this, 2, executor, c0045a));
    }
}
