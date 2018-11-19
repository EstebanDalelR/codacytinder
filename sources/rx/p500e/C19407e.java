package rx.p500e;

import java.util.concurrent.Future;
import rx.Subscription;
import rx.functions.Action0;

/* renamed from: rx.e.e */
public final class C19407e {
    /* renamed from: a */
    private static final C19577b f60583a = new C19577b();

    /* renamed from: rx.e.e$a */
    static final class C19576a implements Subscription {
        /* renamed from: a */
        final Future<?> f61123a;

        public C19576a(Future<?> future) {
            this.f61123a = future;
        }

        public void unsubscribe() {
            this.f61123a.cancel(true);
        }

        public boolean isUnsubscribed() {
            return this.f61123a.isCancelled();
        }
    }

    /* renamed from: rx.e.e$b */
    static final class C19577b implements Subscription {
        public boolean isUnsubscribed() {
            return true;
        }

        public void unsubscribe() {
        }

        C19577b() {
        }
    }

    /* renamed from: a */
    public static Subscription m69852a() {
        return C19572a.m70544a();
    }

    /* renamed from: b */
    public static Subscription m69855b() {
        return f60583a;
    }

    /* renamed from: a */
    public static Subscription m69854a(Action0 action0) {
        return C19572a.m70545a(action0);
    }

    /* renamed from: a */
    public static Subscription m69853a(Future<?> future) {
        return new C19576a(future);
    }
}
