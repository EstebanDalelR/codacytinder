package rx.internal.operators;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19566b;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Single;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Func1;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.atomic.C19610c;
import rx.internal.util.unsafe.C19912h;
import rx.internal.util.unsafe.af;
import rx.p498c.C19401c;
import rx.p500e.C19573b;

public final class OnSubscribeFlatMapSingle<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final Observable<T> f62212a;
    /* renamed from: b */
    final Func1<? super T, ? extends Single<? extends R>> f62213b;
    /* renamed from: c */
    final boolean f62214c;
    /* renamed from: d */
    final int f62215d;

    static final class FlatMapSingleSubscriber<T, R> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super R> f61475a;
        /* renamed from: b */
        final Func1<? super T, ? extends Single<? extends R>> f61476b;
        /* renamed from: c */
        final boolean f61477c;
        /* renamed from: d */
        final int f61478d;
        /* renamed from: e */
        final AtomicInteger f61479e = new AtomicInteger();
        /* renamed from: f */
        final AtomicInteger f61480f = new AtomicInteger();
        /* renamed from: g */
        final C19573b f61481g = new C19573b();
        /* renamed from: h */
        final AtomicReference<Throwable> f61482h = new AtomicReference();
        /* renamed from: i */
        final Queue<Object> f61483i;
        /* renamed from: j */
        final Requested f61484j = new Requested(this);
        /* renamed from: k */
        volatile boolean f61485k;
        /* renamed from: l */
        volatile boolean f61486l;

        final class Requested extends AtomicLong implements Producer, Subscription {
            private static final long serialVersionUID = -887187595446742742L;
            /* renamed from: a */
            final /* synthetic */ FlatMapSingleSubscriber f61151a;

            Requested(FlatMapSingleSubscriber flatMapSingleSubscriber) {
                this.f61151a = flatMapSingleSubscriber;
            }

            public void request(long j) {
                if (j > 0) {
                    C19419a.m69900a((AtomicLong) this, j);
                    this.f61151a.m70904a();
                }
            }

            /* renamed from: a */
            void m70567a(long j) {
                C19419a.m69902b(this, j);
            }

            public void unsubscribe() {
                this.f61151a.f61486l = true;
                this.f61151a.unsubscribe();
                if (this.f61151a.f61479e.getAndIncrement() == 0) {
                    this.f61151a.f61483i.clear();
                }
            }

            public boolean isUnsubscribed() {
                return this.f61151a.f61486l;
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber$a */
        final class C19673a extends C19566b<R> {
            /* renamed from: a */
            final /* synthetic */ FlatMapSingleSubscriber f61474a;

            C19673a(FlatMapSingleSubscriber flatMapSingleSubscriber) {
                this.f61474a = flatMapSingleSubscriber;
            }

            /* renamed from: a */
            public void mo14737a(R r) {
                this.f61474a.m70905a(this, (Object) r);
            }

            public void onError(Throwable th) {
                this.f61474a.m70906a(this, th);
            }
        }

        FlatMapSingleSubscriber(C19571c<? super R> c19571c, Func1<? super T, ? extends Single<? extends R>> func1, boolean z, int i) {
            this.f61475a = c19571c;
            this.f61476b = func1;
            this.f61477c = z;
            this.f61478d = i;
            if (af.m69984a() != null) {
                this.f61483i = new C19912h();
            } else {
                this.f61483i = new C19610c();
            }
            request(i != ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED ? (long) i : -1);
        }

        public void onNext(T t) {
            try {
                Single single = (Single) this.f61476b.call(t);
                if (single == null) {
                    throw new NullPointerException("The mapper returned a null Single");
                }
                C19566b c19673a = new C19673a(this);
                this.f61481g.m70548a((Subscription) c19673a);
                this.f61480f.incrementAndGet();
                single.m69762a(c19673a);
            } catch (T t2) {
                C19410a.m69874b(t2);
                unsubscribe();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (this.f61477c) {
                ExceptionsUtils.addThrowable(this.f61482h, th);
            } else {
                this.f61481g.unsubscribe();
                if (!this.f61482h.compareAndSet(null, th)) {
                    C19401c.m69811a(th);
                    return;
                }
            }
            this.f61485k = true;
            m70904a();
        }

        public void onCompleted() {
            this.f61485k = true;
            m70904a();
        }

        /* renamed from: a */
        void m70905a(C19673a c19673a, R r) {
            this.f61483i.offer(NotificationLite.m69885a((Object) r));
            this.f61481g.m70550b(c19673a);
            this.f61480f.decrementAndGet();
            m70904a();
        }

        /* renamed from: a */
        void m70906a(C19673a c19673a, Throwable th) {
            if (this.f61477c) {
                ExceptionsUtils.addThrowable(this.f61482h, th);
                this.f61481g.m70550b(c19673a);
                if (this.f61485k == null && this.f61478d != Integer.MAX_VALUE) {
                    request(1);
                }
            } else {
                this.f61481g.unsubscribe();
                unsubscribe();
                if (this.f61482h.compareAndSet(null, th) == null) {
                    C19401c.m69811a(th);
                    return;
                }
                this.f61485k = true;
            }
            this.f61480f.decrementAndGet();
            m70904a();
        }

        /* renamed from: a */
        void m70904a() {
            if (this.f61479e.getAndIncrement() == 0) {
                C19571c c19571c = r0.f61475a;
                Queue queue = r0.f61483i;
                boolean z = r0.f61477c;
                AtomicInteger atomicInteger = r0.f61480f;
                int i = 1;
                do {
                    long j = r0.f61484j.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (r0.f61486l) {
                            queue.clear();
                            return;
                        }
                        boolean z2 = r0.f61485k;
                        if (z || !z2 || ((Throwable) r0.f61482h.get()) == null) {
                            Object poll = queue.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z2 && atomicInteger.get() == 0 && obj != null) {
                                if (((Throwable) r0.f61482h.get()) != null) {
                                    c19571c.onError(ExceptionsUtils.terminate(r0.f61482h));
                                } else {
                                    c19571c.onCompleted();
                                }
                                return;
                            } else if (obj != null) {
                                break;
                            } else {
                                c19571c.onNext(NotificationLite.m69891e(poll));
                                j2++;
                            }
                        } else {
                            queue.clear();
                            c19571c.onError(ExceptionsUtils.terminate(r0.f61482h));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (r0.f61486l) {
                            queue.clear();
                            return;
                        } else if (r0.f61485k) {
                            if (z) {
                                if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                    if (((Throwable) r0.f61482h.get()) != null) {
                                        c19571c.onError(ExceptionsUtils.terminate(r0.f61482h));
                                    } else {
                                        c19571c.onCompleted();
                                    }
                                    return;
                                }
                            } else if (((Throwable) r0.f61482h.get()) != null) {
                                queue.clear();
                                c19571c.onError(ExceptionsUtils.terminate(r0.f61482h));
                                return;
                            } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                c19571c.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        r0.f61484j.m70567a(j2);
                        if (!(r0.f61485k || r0.f61478d == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                            request(j2);
                        }
                    }
                    i = r0.f61479e.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71574a((C19571c) obj);
    }

    public OnSubscribeFlatMapSingle(Observable<T> observable, Func1<? super T, ? extends Single<? extends R>> func1, boolean z, int i) {
        if (func1 == null) {
            throw new NullPointerException("mapper is null");
        } else if (i <= 0) {
            func1 = new StringBuilder();
            func1.append("maxConcurrency > 0 required but it was ");
            func1.append(i);
            throw new IllegalArgumentException(func1.toString());
        } else {
            this.f62212a = observable;
            this.f62213b = func1;
            this.f62214c = z;
            this.f62215d = i;
        }
    }

    /* renamed from: a */
    public void m71574a(C19571c<? super R> c19571c) {
        C19571c flatMapSingleSubscriber = new FlatMapSingleSubscriber(c19571c, this.f62213b, this.f62214c, this.f62215d);
        c19571c.add(flatMapSingleSubscriber.f61481g);
        c19571c.add(flatMapSingleSubscriber.f61484j);
        c19571c.setProducer(flatMapSingleSubscriber.f61484j);
        this.f62212a.m69661a(flatMapSingleSubscriber);
    }
}
