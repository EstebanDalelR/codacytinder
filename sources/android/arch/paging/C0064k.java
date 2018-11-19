package android.arch.paging;

import android.arch.core.p002a.C2673a;
import android.arch.paging.C0054f.C0049a;
import android.arch.paging.C0054f.C0050b;
import android.arch.paging.C0054f.C0053d;
import android.arch.paging.C0054f.C0053d.C0052a;
import android.arch.paging.DataSource.C0033a;
import android.arch.paging.DataSource.InvalidatedCallback;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import io.reactivex.schedulers.C15756a;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.k */
public final class C0064k<Key, Value> {
    /* renamed from: a */
    private Key f156a;
    /* renamed from: b */
    private C0053d f157b;
    /* renamed from: c */
    private C0033a<Key, Value> f158c;
    /* renamed from: d */
    private C0049a f159d;
    /* renamed from: e */
    private Executor f160e;
    /* renamed from: f */
    private Executor f161f;
    /* renamed from: g */
    private C15679f f162g;
    /* renamed from: h */
    private C15679f f163h;

    /* renamed from: android.arch.paging.k$1 */
    class C00621 implements Executor {
        /* renamed from: a */
        final /* synthetic */ C17362c f153a;

        public void execute(@NonNull Runnable runnable) {
            this.f153a.a(runnable);
        }
    }

    /* renamed from: android.arch.paging.k$a */
    static class C2706a<Key, Value> implements InvalidatedCallback, ObservableOnSubscribe<C0054f<Value>>, Cancellable, Runnable {
        @Nullable
        /* renamed from: a */
        private final Key f8547a;
        @NonNull
        /* renamed from: b */
        private final C0053d f8548b;
        @Nullable
        /* renamed from: c */
        private final C0049a f8549c;
        @NonNull
        /* renamed from: d */
        private final C0033a<Key, Value> f8550d;
        @NonNull
        /* renamed from: e */
        private final Executor f8551e;
        @NonNull
        /* renamed from: f */
        private final Executor f8552f;
        @Nullable
        /* renamed from: g */
        private C0054f<Value> f8553g;
        @Nullable
        /* renamed from: h */
        private DataSource<Key, Value> f8554h;
        /* renamed from: i */
        private ObservableEmitter<C0054f<Value>> f8555i;

        private C2706a(@Nullable Key key, @NonNull C0053d c0053d, @Nullable C0049a c0049a, @NonNull C0033a<Key, Value> c0033a, @NonNull Executor executor, @NonNull Executor executor2) {
            this.f8547a = key;
            this.f8548b = c0053d;
            this.f8549c = c0049a;
            this.f8550d = c0033a;
            this.f8551e = executor;
            this.f8552f = executor2;
        }

        public void subscribe(ObservableEmitter<C0054f<Value>> observableEmitter) throws Exception {
            this.f8555i = observableEmitter;
            this.f8555i.setCancellable(this);
            this.f8555i.onNext(m10526a());
        }

        public void cancel() throws Exception {
            if (this.f8554h != null) {
                this.f8554h.mo2968b(this);
            }
        }

        public void run() {
            this.f8555i.onNext(m10526a());
        }

        public void onInvalidated() {
            if (!this.f8555i.isDisposed()) {
                this.f8552f.execute(this);
            }
        }

        /* renamed from: a */
        private C0054f<Value> m10526a() {
            Object obj = this.f8547a;
            if (this.f8553g != null) {
                obj = this.f8553g.mo57c();
            }
            do {
                if (this.f8554h != null) {
                    this.f8554h.mo2968b(this);
                }
                this.f8554h = this.f8550d.m136a();
                this.f8554h.mo2967a(this);
                this.f8553g = new C0050b(this.f8554h, this.f8548b).m164a(this.f8551e).m166b(this.f8552f).m162a(this.f8549c).m163a(obj).m165a();
            } while (this.f8553g.mo74f());
            return this.f8553g;
        }
    }

    public C0064k(@NonNull C0033a<Key, Value> c0033a, @NonNull C0053d c0053d) {
        if (c0053d == null) {
            throw new IllegalArgumentException("PagedList.Config must be provided");
        } else if (c0033a == null) {
            throw new IllegalArgumentException("DataSource.Factory must be provided");
        } else {
            this.f158c = c0033a;
            this.f157b = c0053d;
        }
    }

    public C0064k(@NonNull C0033a<Key, Value> c0033a, int i) {
        this((C0033a) c0033a, new C0052a().m169a(i).m170a());
    }

    @NonNull
    /* renamed from: a */
    public C0064k<Key, Value> m226a(@NonNull final C15679f c15679f) {
        this.f161f = new Executor(this) {
            /* renamed from: b */
            final /* synthetic */ C0064k f155b;

            public void execute(@NonNull Runnable runnable) {
                c15679f.a(runnable);
            }
        };
        this.f162g = c15679f;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public C3959e<C0054f<Value>> m228a() {
        if (this.f160e == null) {
            this.f160e = C2673a.m10424b();
            this.f163h = C15756a.a(this.f160e);
        }
        if (this.f161f == null) {
            this.f161f = C2673a.m10425c();
            this.f162g = C15756a.a(this.f161f);
        }
        return C3959e.create(new C2706a(this.f156a, this.f157b, this.f159d, this.f158c, this.f160e, this.f161f)).observeOn(this.f163h).subscribeOn(this.f162g);
    }

    @NonNull
    /* renamed from: a */
    public C3957b<C0054f<Value>> m227a(BackpressureStrategy backpressureStrategy) {
        return m228a().toFlowable(backpressureStrategy);
    }
}
