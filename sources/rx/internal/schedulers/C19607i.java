package rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.C2671a;
import rx.Subscription;
import rx.a$a;
import rx.functions.Action0;
import rx.p500e.C19407e;
import rx.p500e.C19572a;

/* renamed from: rx.internal.schedulers.i */
public final class C19607i extends C2671a {
    /* renamed from: a */
    public static final C19607i f61274a = new C19607i();

    /* renamed from: rx.internal.schedulers.i$b */
    static final class C19437b implements Comparable<C19437b> {
        /* renamed from: a */
        final Action0 f60638a;
        /* renamed from: b */
        final Long f60639b;
        /* renamed from: c */
        final int f60640c;

        public /* synthetic */ int compareTo(Object obj) {
            return m69916a((C19437b) obj);
        }

        C19437b(Action0 action0, Long l, int i) {
            this.f60638a = action0;
            this.f60639b = l;
            this.f60640c = i;
        }

        /* renamed from: a */
        public int m69916a(C19437b c19437b) {
            int compareTo = this.f60639b.compareTo(c19437b.f60639b);
            return compareTo == 0 ? C19607i.m70617a(this.f60640c, c19437b.f60640c) : compareTo;
        }
    }

    /* renamed from: rx.internal.schedulers.i$a */
    static final class C19756a extends a$a implements Subscription {
        /* renamed from: a */
        final AtomicInteger f61821a = new AtomicInteger();
        /* renamed from: b */
        final PriorityBlockingQueue<C19437b> f61822b = new PriorityBlockingQueue();
        /* renamed from: c */
        private final C19572a f61823c = new C19572a();
        /* renamed from: d */
        private final AtomicInteger f61824d = new AtomicInteger();

        C19756a() {
        }

        /* renamed from: a */
        public Subscription mo14740a(Action0 action0) {
            return m71037a(action0, mo14759a());
        }

        /* renamed from: a */
        public Subscription mo14741a(Action0 action0, long j, TimeUnit timeUnit) {
            long a = mo14759a() + timeUnit.toMillis(j);
            return m71037a(new C19851h(action0, this, a), a);
        }

        /* renamed from: a */
        private Subscription m71037a(Action0 action0, long j) {
            if (this.f61823c.isUnsubscribed()) {
                return C19407e.m69855b();
            }
            final C19437b c19437b = new C19437b(action0, Long.valueOf(j), this.f61821a.incrementAndGet());
            this.f61822b.add(c19437b);
            if (this.f61824d.getAndIncrement() != null) {
                return C19407e.m69854a(new Action0(this) {
                    /* renamed from: b */
                    final /* synthetic */ C19756a f62125b;

                    public void call() {
                        this.f62125b.f61822b.remove(c19437b);
                    }
                });
            }
            do {
                C19437b c19437b2 = (C19437b) this.f61822b.poll();
                if (c19437b2 != null) {
                    c19437b2.f60638a.call();
                }
            } while (this.f61824d.decrementAndGet() > null);
            return C19407e.m69855b();
        }

        public void unsubscribe() {
            this.f61823c.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f61823c.isUnsubscribed();
        }
    }

    /* renamed from: a */
    static int m70617a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public a$a createWorker() {
        return new C19756a();
    }

    private C19607i() {
    }
}
