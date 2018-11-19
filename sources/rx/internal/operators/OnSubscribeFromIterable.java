package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;

public final class OnSubscribeFromIterable<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Iterable<? extends T> f62217a;

    static final class IterableProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -8730475647105475802L;
        /* renamed from: a */
        private final C19571c<? super T> f61155a;
        /* renamed from: b */
        private final Iterator<? extends T> f61156b;

        IterableProducer(C19571c<? super T> c19571c, Iterator<? extends T> it) {
            this.f61155a = c19571c;
            this.f61156b = it;
        }

        public void request(long j) {
            if (get() != Format.OFFSET_SAMPLE_RELATIVE) {
                if (j == Format.OFFSET_SAMPLE_RELATIVE && compareAndSet(0, Format.OFFSET_SAMPLE_RELATIVE)) {
                    m70570a();
                } else if (j > 0 && C19419a.m69900a((AtomicLong) this, j) == 0) {
                    m70571a(j);
                }
            }
        }

        /* renamed from: a */
        void m70571a(long j) {
            Observer observer = this.f61155a;
            Iterator it = this.f61156b;
            long j2 = j;
            loop0:
            do {
                j = 0;
                while (true) {
                    if (j == j2) {
                        j2 = get();
                        if (j == j2) {
                            j2 = C19419a.m69902b(this, j);
                        }
                    } else if (!observer.isUnsubscribed()) {
                        try {
                            observer.onNext(it.next());
                            if (!observer.isUnsubscribed()) {
                                try {
                                    if (!it.hasNext()) {
                                        break loop0;
                                    }
                                    j++;
                                } catch (Throwable th) {
                                    C19410a.m69869a(th, observer);
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            C19410a.m69869a(th2, observer);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (observer.isUnsubscribed() == null) {
                    observer.onCompleted();
                }
                return;
            } while (j2 != 0);
        }

        /* renamed from: a */
        void m70570a() {
            Observer observer = this.f61155a;
            Iterator it = this.f61156b;
            while (!observer.isUnsubscribed()) {
                try {
                    observer.onNext(it.next());
                    if (!observer.isUnsubscribed()) {
                        try {
                            if (!it.hasNext()) {
                                if (!observer.isUnsubscribed()) {
                                    observer.onCompleted();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C19410a.m69869a(th, observer);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    C19410a.m69869a(th2, observer);
                    return;
                }
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71576a((C19571c) obj);
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.f62217a = iterable;
    }

    /* renamed from: a */
    public void m71576a(C19571c<? super T> c19571c) {
        try {
            Iterator it = this.f62217a.iterator();
            boolean hasNext = it.hasNext();
            if (!c19571c.isUnsubscribed()) {
                if (hasNext) {
                    c19571c.setProducer(new IterableProducer(c19571c, it));
                } else {
                    c19571c.onCompleted();
                }
            }
        } catch (Throwable th) {
            C19410a.m69869a(th, (Observer) c19571c);
        }
    }
}
