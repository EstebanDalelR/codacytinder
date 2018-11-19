package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.C2671a;
import rx.Notification;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observable.Operator;
import rx.Producer;
import rx.a$a;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.producers.C19598a;
import rx.observers.C19450f;
import rx.p500e.C19575d;
import rx.schedulers.Schedulers;
import rx.subjects.C19623c;
import rx.subjects.C19785a;

/* renamed from: rx.internal.operators.p */
public final class C19887p<T> implements OnSubscribe<T> {
    /* renamed from: d */
    static final Func1<Observable<? extends Notification<?>>, Observable<?>> f62282d = new C197391();
    /* renamed from: a */
    final Observable<T> f62283a;
    /* renamed from: b */
    final boolean f62284b;
    /* renamed from: c */
    final boolean f62285c;
    /* renamed from: e */
    private final Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> f62286e;
    /* renamed from: f */
    private final C2671a f62287f;

    /* renamed from: rx.internal.operators.p$1 */
    static class C197391 implements Func1<Observable<? extends Notification<?>>, Observable<?>> {

        /* renamed from: rx.internal.operators.p$1$1 */
        class C197381 implements Func1<Notification<?>, Notification<?>> {
            /* renamed from: a */
            final /* synthetic */ C197391 f61756a;

            C197381(C197391 c197391) {
                this.f61756a = c197391;
            }

            public /* synthetic */ Object call(Object obj) {
                return m71006a((Notification) obj);
            }

            /* renamed from: a */
            public Notification<?> m71006a(Notification<?> notification) {
                return Notification.m69598a((Object) null);
            }
        }

        C197391() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m71007a((Observable) obj);
        }

        /* renamed from: a */
        public Observable<?> m71007a(Observable<? extends Notification<?>> observable) {
            return observable.m69719k(new C197381(this));
        }
    }

    /* renamed from: rx.internal.operators.p$3 */
    class C198333 implements Operator<Notification<?>, Notification<?>> {
        /* renamed from: a */
        final /* synthetic */ C19887p f62070a;

        C198333(C19887p c19887p) {
            this.f62070a = c19887p;
        }

        public /* synthetic */ Object call(Object obj) {
            return m71474a((C19571c) obj);
        }

        /* renamed from: a */
        public C19571c<? super Notification<?>> m71474a(final C19571c<? super Notification<?>> c19571c) {
            return new C19571c<Notification<?>>(this, c19571c) {
                /* renamed from: b */
                final /* synthetic */ C198333 f61760b;

                public /* synthetic */ void onNext(Object obj) {
                    m71009a((Notification) obj);
                }

                public void onCompleted() {
                    c19571c.onCompleted();
                }

                public void onError(Throwable th) {
                    c19571c.onError(th);
                }

                /* renamed from: a */
                public void m71009a(Notification<?> notification) {
                    if (notification.m69606h() && this.f61760b.f62070a.f62284b) {
                        c19571c.onCompleted();
                    } else if (notification.m69605g() && this.f61760b.f62070a.f62285c) {
                        c19571c.onError(notification.m69600b());
                    } else {
                        c19571c.onNext(notification);
                    }
                }

                public void setProducer(Producer producer) {
                    producer.request(Format.OFFSET_SAMPLE_RELATIVE);
                }
            };
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71620a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> Observable<T> m71614a(Observable<T> observable) {
        return C19887p.m71616a((Observable) observable, f62282d);
    }

    /* renamed from: a */
    public static <T> Observable<T> m71616a(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.m69634b(new C19887p(observable, func1, true, false, Schedulers.trampoline()));
    }

    /* renamed from: b */
    public static <T> Observable<T> m71618b(Observable<T> observable) {
        return C19887p.m71615a((Observable) observable, Schedulers.trampoline());
    }

    /* renamed from: a */
    public static <T> Observable<T> m71615a(Observable<T> observable, C2671a c2671a) {
        return C19887p.m71617a(observable, f62282d, c2671a);
    }

    /* renamed from: b */
    public static <T> Observable<T> m71619b(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.m69634b(new C19887p(observable, func1, false, true, Schedulers.trampoline()));
    }

    /* renamed from: a */
    public static <T> Observable<T> m71617a(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, C2671a c2671a) {
        return Observable.m69634b(new C19887p(observable, func1, false, true, c2671a));
    }

    private C19887p(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, boolean z, boolean z2, C2671a c2671a) {
        this.f62283a = observable;
        this.f62286e = func1;
        this.f62284b = z;
        this.f62285c = z2;
        this.f62287f = c2671a;
    }

    /* renamed from: a */
    public void m71620a(C19571c<? super T> c19571c) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        a$a createWorker = this.f62287f.createWorker();
        c19571c.add(createWorker);
        final Object c19575d = new C19575d();
        c19571c.add(c19575d);
        C19623c B = C19785a.m71080w().m70662B();
        B.m69677b(C19450f.m69989a());
        C19598a c19598a = new C19598a();
        final C19571c<? super T> c19571c2 = c19571c;
        final C19623c c19623c = B;
        final C19598a c19598a2 = c19598a;
        final AtomicLong atomicLong2 = atomicLong;
        C198322 c198322 = new Action0(this) {
            /* renamed from: f */
            final /* synthetic */ C19887p f62069f;

            /* renamed from: rx.internal.operators.p$2$1 */
            class C197401 extends C19571c<T> {
                /* renamed from: a */
                boolean f61757a;
                /* renamed from: b */
                final /* synthetic */ C198322 f61758b;

                C197401(C198322 c198322) {
                    this.f61758b = c198322;
                }

                public void onCompleted() {
                    if (!this.f61757a) {
                        this.f61757a = true;
                        unsubscribe();
                        c19623c.onNext(Notification.m69597a());
                    }
                }

                public void onError(Throwable th) {
                    if (!this.f61757a) {
                        this.f61757a = true;
                        unsubscribe();
                        c19623c.onNext(Notification.m69599a(th));
                    }
                }

                public void onNext(T t) {
                    if (!this.f61757a) {
                        c19571c2.onNext(t);
                        m71008a();
                        c19598a2.m70606a(1);
                    }
                }

                /* renamed from: a */
                private void m71008a() {
                    long j;
                    do {
                        j = atomicLong2.get();
                        if (j == Format.OFFSET_SAMPLE_RELATIVE) {
                            return;
                        }
                    } while (!atomicLong2.compareAndSet(j, j - 1));
                }

                public void setProducer(Producer producer) {
                    c19598a2.m70607a(producer);
                }
            }

            public void call() {
                if (!c19571c2.isUnsubscribed()) {
                    C19571c c197401 = new C197401(this);
                    c19575d.m70554a(c197401);
                    this.f62069f.f62283a.m69661a(c197401);
                }
            }
        };
        final Observable observable = (Observable) this.f62286e.call(B.m69648a(new C198333(this)));
        final AtomicLong atomicLong3 = atomicLong;
        final a$a a_a = createWorker;
        final C198322 c1983222 = c198322;
        final AtomicBoolean atomicBoolean2 = atomicBoolean;
        createWorker.mo14740a(new Action0(this) {
            /* renamed from: g */
            final /* synthetic */ C19887p f62077g;

            public void call() {
                observable.m69661a(new C19571c<Object>(this, c19571c2) {
                    /* renamed from: a */
                    final /* synthetic */ C198344 f61761a;

                    public void onCompleted() {
                        c19571c2.onCompleted();
                    }

                    public void onError(Throwable th) {
                        c19571c2.onError(th);
                    }

                    public void onNext(Object obj) {
                        if (c19571c2.isUnsubscribed() != null) {
                            return;
                        }
                        if (atomicLong3.get() > 0) {
                            a_a.mo14740a(c1983222);
                        } else {
                            atomicBoolean2.compareAndSet(false, true);
                        }
                    }

                    public void setProducer(Producer producer) {
                        producer.request(Format.OFFSET_SAMPLE_RELATIVE);
                    }
                });
            }
        });
        final AtomicLong atomicLong4 = atomicLong;
        final C19598a c19598a3 = c19598a;
        final AtomicBoolean atomicBoolean3 = atomicBoolean;
        c19571c.setProducer(new Producer(this) {
            /* renamed from: f */
            final /* synthetic */ C19887p f61230f;

            public void request(long j) {
                if (j > 0) {
                    C19419a.m69900a(atomicLong4, j);
                    c19598a3.request(j);
                    if (atomicBoolean3.compareAndSet(true, false) != null) {
                        a_a.mo14740a(c1983222);
                    }
                }
            }
        });
    }
}
