package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.C19419a;

public final class PublishSubject<T> extends C19623c<T, T> {
    /* renamed from: b */
    final PublishSubjectState<T> f61866b;

    static final class PublishSubjectProducer<T> extends AtomicLong implements Observer<T>, Producer, Subscription {
        private static final long serialVersionUID = 6451806817170721536L;
        /* renamed from: a */
        final PublishSubjectState<T> f61314a;
        /* renamed from: b */
        final C19571c<? super T> f61315b;
        /* renamed from: c */
        long f61316c;

        public PublishSubjectProducer(PublishSubjectState<T> publishSubjectState, C19571c<? super T> c19571c) {
            this.f61314a = publishSubjectState;
            this.f61315b = c19571c;
        }

        public void request(long j) {
            if (C19419a.m69901a(j)) {
                long j2;
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, C19419a.m69899a(j2, j)));
            }
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f61314a.m71650b(this);
            }
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.f61316c;
                if (j != j2) {
                    this.f61316c = j2 + 1;
                    this.f61315b.onNext(t);
                    return;
                }
                unsubscribe();
                this.f61315b.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f61315b.onError(th);
            }
        }

        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.f61315b.onCompleted();
            }
        }
    }

    static final class PublishSubjectState<T> extends AtomicReference<PublishSubjectProducer<T>[]> implements OnSubscribe<T>, Observer<T> {
        /* renamed from: a */
        static final PublishSubjectProducer[] f62340a = new PublishSubjectProducer[0];
        /* renamed from: b */
        static final PublishSubjectProducer[] f62341b = new PublishSubjectProducer[0];
        private static final long serialVersionUID = -7568940796666027140L;
        /* renamed from: c */
        Throwable f62342c;

        public /* synthetic */ void call(Object obj) {
            m71648a((C19571c) obj);
        }

        public PublishSubjectState() {
            lazySet(f62340a);
        }

        /* renamed from: a */
        public void m71648a(C19571c<? super T> c19571c) {
            PublishSubjectProducer publishSubjectProducer = new PublishSubjectProducer(this, c19571c);
            c19571c.add(publishSubjectProducer);
            c19571c.setProducer(publishSubjectProducer);
            if (!m71649a(publishSubjectProducer)) {
                Throwable th = this.f62342c;
                if (th != null) {
                    c19571c.onError(th);
                } else {
                    c19571c.onCompleted();
                }
            } else if (publishSubjectProducer.isUnsubscribed() != null) {
                m71650b(publishSubjectProducer);
            }
        }

        /* renamed from: a */
        boolean m71649a(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer[] publishSubjectProducerArr;
            Object obj;
            do {
                publishSubjectProducerArr = (PublishSubjectProducer[]) get();
                if (publishSubjectProducerArr == f62341b) {
                    return false;
                }
                int length = publishSubjectProducerArr.length;
                obj = new PublishSubjectProducer[(length + 1)];
                System.arraycopy(publishSubjectProducerArr, 0, obj, 0, length);
                obj[length] = publishSubjectProducer;
            } while (!compareAndSet(publishSubjectProducerArr, obj));
            return true;
        }

        /* renamed from: b */
        void m71650b(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer[] publishSubjectProducerArr;
            Object obj;
            do {
                publishSubjectProducerArr = (PublishSubjectProducer[]) get();
                if (publishSubjectProducerArr != f62341b) {
                    if (publishSubjectProducerArr != f62340a) {
                        int length = publishSubjectProducerArr.length;
                        int i = -1;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (publishSubjectProducerArr[i2] == publishSubjectProducer) {
                                i = i2;
                                break;
                            }
                        }
                        if (i >= 0) {
                            if (length == 1) {
                                obj = f62340a;
                            } else {
                                Object obj2 = new PublishSubjectProducer[(length - 1)];
                                System.arraycopy(publishSubjectProducerArr, 0, obj2, 0, i);
                                System.arraycopy(publishSubjectProducerArr, i + 1, obj2, i, (length - i) - 1);
                                obj = obj2;
                            }
                        } else {
                            return;
                        }
                    }
                }
                return;
            } while (!compareAndSet(publishSubjectProducerArr, obj));
        }

        public void onNext(T t) {
            for (PublishSubjectProducer onNext : (PublishSubjectProducer[]) get()) {
                onNext.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f62342c = th;
            List list = null;
            for (PublishSubjectProducer onError : (PublishSubjectProducer[]) getAndSet(f62341b)) {
                try {
                    onError.onError(th);
                } catch (Throwable th2) {
                    if (list == null) {
                        list = new ArrayList(1);
                    }
                    list.add(th2);
                }
            }
            C19410a.m69873a(list);
        }

        public void onCompleted() {
            for (PublishSubjectProducer onCompleted : (PublishSubjectProducer[]) getAndSet(f62341b)) {
                onCompleted.onCompleted();
            }
        }
    }

    /* renamed from: w */
    public static <T> PublishSubject<T> m71070w() {
        return new PublishSubject(new PublishSubjectState());
    }

    protected PublishSubject(PublishSubjectState<T> publishSubjectState) {
        super(publishSubjectState);
        this.f61866b = publishSubjectState;
    }

    public void onNext(T t) {
        this.f61866b.onNext(t);
    }

    public void onError(Throwable th) {
        this.f61866b.onError(th);
    }

    public void onCompleted() {
        this.f61866b.onCompleted();
    }

    /* renamed from: x */
    public boolean m71071x() {
        return ((PublishSubjectProducer[]) this.f61866b.get()).length != 0;
    }
}
