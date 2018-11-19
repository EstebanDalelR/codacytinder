package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.p498c.C19401c;

public final class OnSubscribeDetach<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable<T> f62207a;

    enum TerminatedProducer implements Producer {
        INSTANCE;

        public void request(long j) {
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$a */
    static final class C19581a<T> implements Producer, Subscription {
        /* renamed from: a */
        final C19672b<T> f61149a;

        public C19581a(C19672b<T> c19672b) {
            this.f61149a = c19672b;
        }

        public void request(long j) {
            this.f61149a.m70899a(j);
        }

        public boolean isUnsubscribed() {
            return this.f61149a.isUnsubscribed();
        }

        public void unsubscribe() {
            this.f61149a.m70898a();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$b */
    static final class C19672b<T> extends C19571c<T> {
        /* renamed from: a */
        final AtomicReference<C19571c<? super T>> f61464a;
        /* renamed from: b */
        final AtomicReference<Producer> f61465b = new AtomicReference();
        /* renamed from: c */
        final AtomicLong f61466c = new AtomicLong();

        public C19672b(C19571c<? super T> c19571c) {
            this.f61464a = new AtomicReference(c19571c);
        }

        public void onNext(T t) {
            C19571c c19571c = (C19571c) this.f61464a.get();
            if (c19571c != null) {
                c19571c.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f61465b.lazySet(TerminatedProducer.INSTANCE);
            C19571c c19571c = (C19571c) this.f61464a.getAndSet(null);
            if (c19571c != null) {
                c19571c.onError(th);
            } else {
                C19401c.m69811a(th);
            }
        }

        public void onCompleted() {
            this.f61465b.lazySet(TerminatedProducer.INSTANCE);
            C19571c c19571c = (C19571c) this.f61464a.getAndSet(null);
            if (c19571c != null) {
                c19571c.onCompleted();
            }
        }

        /* renamed from: a */
        void m70899a(long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= 0 required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            Producer producer = (Producer) this.f61465b.get();
            if (producer != null) {
                producer.request(j);
                return;
            }
            C19419a.m69900a(this.f61466c, j);
            Producer producer2 = (Producer) this.f61465b.get();
            if (producer2 != null && producer2 != TerminatedProducer.INSTANCE) {
                producer2.request(this.f61466c.getAndSet(0));
            }
        }

        public void setProducer(Producer producer) {
            if (this.f61465b.compareAndSet(null, producer)) {
                producer.request(this.f61466c.getAndSet(0));
            } else if (this.f61465b.get() != TerminatedProducer.INSTANCE) {
                throw new IllegalStateException("Producer already set!");
            }
        }

        /* renamed from: a */
        void m70898a() {
            this.f61465b.lazySet(TerminatedProducer.INSTANCE);
            this.f61464a.lazySet(null);
            unsubscribe();
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71572a((C19571c) obj);
    }

    /* renamed from: a */
    public void m71572a(C19571c<? super T> c19571c) {
        C19571c c19672b = new C19672b(c19571c);
        Object c19581a = new C19581a(c19672b);
        c19571c.add(c19581a);
        c19571c.setProducer(c19581a);
        this.f62207a.m69661a(c19672b);
    }
}
