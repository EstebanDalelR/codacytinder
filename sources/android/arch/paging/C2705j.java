package android.arch.paging;

import android.arch.paging.C0046e.C0045a;
import android.arch.paging.DataSource.C0035b;
import android.arch.paging.DataSource.InvalidatedCallback;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.j */
public abstract class C2705j<T> extends DataSource<Integer, T> {

    /* renamed from: android.arch.paging.j$b */
    public static abstract class C0058b<T> {
    }

    /* renamed from: android.arch.paging.j$d */
    public static class C0059d {
        /* renamed from: a */
        public final int f147a;
        /* renamed from: b */
        public final int f148b;
        /* renamed from: c */
        public final int f149c;
        /* renamed from: d */
        public final boolean f150d;

        public C0059d(int i, int i2, int i3, boolean z) {
            this.f147a = i;
            this.f148b = i2;
            this.f149c = i3;
            this.f150d = z;
        }
    }

    /* renamed from: android.arch.paging.j$e */
    public static abstract class C0060e<T> {
        /* renamed from: a */
        public abstract void mo71a(@NonNull List<T> list);
    }

    /* renamed from: android.arch.paging.j$g */
    public static class C0061g {
        /* renamed from: a */
        public final int f151a;
        /* renamed from: b */
        public final int f152b;

        public C0061g(int i, int i2) {
            this.f151a = i;
            this.f152b = i2;
        }
    }

    /* renamed from: android.arch.paging.j$c */
    static class C2703c<T> extends C0058b<T> {
        /* renamed from: a */
        final C0035b<T> f8542a;
        /* renamed from: b */
        private final boolean f8543b;
        /* renamed from: c */
        private final int f8544c;

        C2703c(@NonNull C2705j c2705j, boolean z, int i, C0045a<T> c0045a) {
            this.f8542a = new C0035b(c2705j, 0, null, c0045a);
            this.f8543b = z;
            this.f8544c = i;
            if (this.f8544c < true) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }
    }

    /* renamed from: android.arch.paging.j$f */
    static class C2704f<T> extends C0060e<T> {
        /* renamed from: a */
        private C0035b<T> f8545a;
        /* renamed from: b */
        private final int f8546b;

        C2704f(@NonNull C2705j c2705j, int i, int i2, Executor executor, C0045a<T> c0045a) {
            this.f8545a = new C0035b(c2705j, i, executor, c0045a);
            this.f8546b = i2;
        }

        /* renamed from: a */
        public void mo71a(@NonNull List<T> list) {
            if (!this.f8545a.m141a()) {
                this.f8545a.m139a(new C0046e(list, 0, 0, this.f8546b));
            }
        }
    }

    /* renamed from: android.arch.paging.j$a */
    static class C3982a<Value> extends C2694b<Integer, Value> {
        @NonNull
        /* renamed from: a */
        final C2705j<Value> f12640a;

        /* renamed from: a */
        /* synthetic */ Object mo2963a(int i, Object obj) {
            return m15539b(i, obj);
        }

        C3982a(@NonNull C2705j<Value> c2705j) {
            this.f12640a = c2705j;
        }

        /* renamed from: a */
        public void mo2967a(@NonNull InvalidatedCallback invalidatedCallback) {
            this.f12640a.mo2967a(invalidatedCallback);
        }

        /* renamed from: b */
        public void mo2968b(@NonNull InvalidatedCallback invalidatedCallback) {
            this.f12640a.mo2968b(invalidatedCallback);
        }

        /* renamed from: b */
        public boolean mo2969b() {
            return this.f12640a.mo2969b();
        }

        /* renamed from: a */
        void m15537a(@Nullable Integer num, int i, int i2, boolean z, @NonNull Executor executor, @NonNull C0045a<Value> c0045a) {
            this.f12640a.m10523a(false, num == null ? 0 : num.intValue(), i, i2, executor, c0045a);
        }

        /* renamed from: a */
        void mo2964a(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull C0045a<Value> c0045a) {
            this.f12640a.m10520a(1, i + 1, i2, executor, c0045a);
        }

        /* renamed from: b */
        void mo2966b(int i, @NonNull Value value, int i2, @NonNull Executor executor, @NonNull C0045a<Value> c0045a) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.f12640a.m10520a(2, i3, 0, executor, c0045a);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.f12640a.m10520a(2, (i3 - min) + 1, min, executor, c0045a);
        }

        /* renamed from: b */
        Integer m15539b(int i, Value value) {
            return Integer.valueOf(i);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public abstract void m10521a(@NonNull C0059d c0059d, @NonNull C0058b<T> c0058b);

    @WorkerThread
    /* renamed from: a */
    public abstract void m10522a(@NonNull C0061g c0061g, @NonNull C0060e<T> c0060e);

    /* renamed from: a */
    boolean mo47a() {
        return false;
    }

    /* renamed from: a */
    final void m10523a(boolean z, int i, int i2, int i3, @NonNull Executor executor, @NonNull C0045a<T> c0045a) {
        C0058b c2703c = new C2703c(this, z, i3, c0045a);
        m10521a(new C0059d(i, i2, i3, z), c2703c);
        c2703c.f8542a.m140a(executor);
    }

    /* renamed from: a */
    final void m10520a(int i, int i2, int i3, @NonNull Executor executor, @NonNull C0045a<T> c0045a) {
        C0060e c2704f = new C2704f(this, i, i2, executor, c0045a);
        if (i3 == 0) {
            c2704f.mo71a(Collections.emptyList());
        } else {
            m10522a(new C0061g(i2, i3), c2704f);
        }
    }

    @NonNull
    /* renamed from: c */
    C2694b<Integer, T> m10525c() {
        return new C3982a(this);
    }
}
