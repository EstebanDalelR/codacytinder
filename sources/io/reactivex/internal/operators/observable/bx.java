package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19003j;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.C17528b;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class bx<T, B> extends C18394a<T, C3959e<T>> {
    /* renamed from: b */
    final Callable<? extends ObservableSource<B>> f59053b;
    /* renamed from: c */
    final int f59054c;

    /* renamed from: io.reactivex.internal.operators.observable.bx$a */
    static final class C18400a<T, B> extends C17528b<B> {
        /* renamed from: a */
        final C19189b<T, B> f57279a;
        /* renamed from: b */
        boolean f57280b;

        C18400a(C19189b<T, B> c19189b) {
            this.f57279a = c19189b;
        }

        public void onNext(B b) {
            if (this.f57280b == null) {
                this.f57280b = true;
                dispose();
                this.f57279a.m68228c();
            }
        }

        public void onError(Throwable th) {
            if (this.f57280b) {
                C2667a.a(th);
                return;
            }
            this.f57280b = true;
            this.f57279a.onError(th);
        }

        public void onComplete() {
            if (!this.f57280b) {
                this.f57280b = true;
                this.f57279a.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bx$b */
    static final class C19189b<T, B> extends C19003j<T, Object, C3959e<T>> implements Disposable {
        /* renamed from: l */
        static final Object f59572l = new Object();
        /* renamed from: g */
        final Callable<? extends ObservableSource<B>> f59573g;
        /* renamed from: h */
        final int f59574h;
        /* renamed from: i */
        Disposable f59575i;
        /* renamed from: j */
        final AtomicReference<Disposable> f59576j = new AtomicReference();
        /* renamed from: k */
        UnicastSubject<T> f59577k;
        /* renamed from: m */
        final AtomicLong f59578m = new AtomicLong();

        C19189b(Observer<? super C3959e<T>> observer, Callable<? extends ObservableSource<B>> callable, int i) {
            super(observer, new MpscLinkedQueue());
            this.f59573g = callable;
            this.f59574h = i;
            this.f59578m.lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59575i, disposable)) {
                this.f59575i = disposable;
                Observer observer = this.a;
                observer.onSubscribe(this);
                if (!this.c) {
                    try {
                        ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f59573g.call(), "The first window ObservableSource supplied is null");
                        disposable = UnicastSubject.m67686a(this.f59574h);
                        this.f59577k = disposable;
                        observer.onNext(disposable);
                        disposable = new C18400a(this);
                        if (this.f59576j.compareAndSet(null, disposable)) {
                            this.f59578m.getAndIncrement();
                            observableSource.subscribe(disposable);
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        disposable.dispose();
                        observer.onError(th);
                    }
                }
            }
        }

        public void onNext(T t) {
            if (m67552a()) {
                this.f59577k.onNext(t);
                if (leave(-1) == null) {
                    return;
                }
            }
            this.b.offer(NotificationLite.next(t));
            if (enter() == null) {
                return;
            }
            m68227b();
        }

        public void onError(Throwable th) {
            if (this.d) {
                C2667a.a(th);
                return;
            }
            this.e = th;
            this.d = true;
            if (enter()) {
                m68227b();
            }
            if (this.f59578m.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.f59576j);
            }
            this.a.onError(th);
        }

        public void onComplete() {
            if (!this.d) {
                this.d = true;
                if (enter()) {
                    m68227b();
                }
                if (this.f59578m.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.f59576j);
                }
                this.a.onComplete();
            }
        }

        public void dispose() {
            this.c = true;
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68227b() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.b;
            Observer observer = this.a;
            UnicastSubject unicastSubject = this.f59577k;
            int i = 1;
            while (true) {
                boolean z = this.d;
                Object poll = mpscLinkedQueue.poll();
                Object obj = poll == null ? 1 : null;
                if (z && obj != null) {
                    break;
                } else if (obj != null) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll == f59572l) {
                    unicastSubject.onComplete();
                    if (this.f59578m.decrementAndGet() == 0) {
                        DisposableHelper.dispose(this.f59576j);
                        return;
                    } else if (!this.c) {
                        try {
                            ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f59573g.call(), "The ObservableSource supplied is null");
                            UnicastSubject a = UnicastSubject.m67686a(this.f59574h);
                            this.f59578m.getAndIncrement();
                            this.f59577k = a;
                            observer.onNext(a);
                            Observer c18400a = new C18400a(this);
                            if (this.f59576j.compareAndSet(this.f59576j.get(), c18400a)) {
                                observableSource.subscribe(c18400a);
                            }
                            unicastSubject = a;
                        } catch (Throwable th) {
                            C15678a.m58850b(th);
                            DisposableHelper.dispose(this.f59576j);
                            observer.onError(th);
                            return;
                        }
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                }
            }
            DisposableHelper.dispose(this.f59576j);
            Throwable th2 = this.e;
            if (th2 != null) {
                unicastSubject.onError(th2);
            } else {
                unicastSubject.onComplete();
            }
        }

        /* renamed from: c */
        void m68228c() {
            this.b.offer(f59572l);
            if (enter()) {
                m68227b();
            }
        }
    }

    public bx(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, int i) {
        super(observableSource);
        this.f59053b = callable;
        this.f59054c = i;
    }

    public void subscribeActual(Observer<? super C3959e<T>> observer) {
        this.a.subscribe(new C19189b(new C17530d(observer), this.f59053b, this.f59054c));
    }
}
