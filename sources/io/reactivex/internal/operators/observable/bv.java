package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C19003j;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.C17528b;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class bv<T, B> extends C18394a<T, C3959e<T>> {
    /* renamed from: b */
    final ObservableSource<B> f59048b;
    /* renamed from: c */
    final int f59049c;

    /* renamed from: io.reactivex.internal.operators.observable.bv$a */
    static final class C18397a<T, B> extends C17528b<B> {
        /* renamed from: a */
        final C19187b<T, B> f57273a;
        /* renamed from: b */
        boolean f57274b;

        C18397a(C19187b<T, B> c19187b) {
            this.f57273a = c19187b;
        }

        public void onNext(B b) {
            if (this.f57274b == null) {
                this.f57273a.m68221c();
            }
        }

        public void onError(Throwable th) {
            if (this.f57274b) {
                C2667a.a(th);
                return;
            }
            this.f57274b = true;
            this.f57273a.onError(th);
        }

        public void onComplete() {
            if (!this.f57274b) {
                this.f57274b = true;
                this.f57273a.onComplete();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bv$b */
    static final class C19187b<T, B> extends C19003j<T, Object, C3959e<T>> implements Disposable {
        /* renamed from: l */
        static final Object f59557l = new Object();
        /* renamed from: g */
        final ObservableSource<B> f59558g;
        /* renamed from: h */
        final int f59559h;
        /* renamed from: i */
        Disposable f59560i;
        /* renamed from: j */
        final AtomicReference<Disposable> f59561j = new AtomicReference();
        /* renamed from: k */
        UnicastSubject<T> f59562k;
        /* renamed from: m */
        final AtomicLong f59563m = new AtomicLong();

        C19187b(Observer<? super C3959e<T>> observer, ObservableSource<B> observableSource, int i) {
            super(observer, new MpscLinkedQueue());
            this.f59558g = observableSource;
            this.f59559h = i;
            this.f59563m.lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59560i, disposable)) {
                this.f59560i = disposable;
                disposable = this.a;
                disposable.onSubscribe(this);
                if (!this.c) {
                    UnicastSubject a = UnicastSubject.m67686a(this.f59559h);
                    this.f59562k = a;
                    disposable.onNext(a);
                    disposable = new C18397a(this);
                    if (this.f59561j.compareAndSet(null, disposable)) {
                        this.f59563m.getAndIncrement();
                        this.f59558g.subscribe(disposable);
                    }
                }
            }
        }

        public void onNext(T t) {
            if (m67552a()) {
                this.f59562k.onNext(t);
                if (leave(-1) == null) {
                    return;
                }
            }
            this.b.offer(NotificationLite.next(t));
            if (enter() == null) {
                return;
            }
            m68220b();
        }

        public void onError(Throwable th) {
            if (this.d) {
                C2667a.a(th);
                return;
            }
            this.e = th;
            this.d = true;
            if (enter()) {
                m68220b();
            }
            if (this.f59563m.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.f59561j);
            }
            this.a.onError(th);
        }

        public void onComplete() {
            if (!this.d) {
                this.d = true;
                if (enter()) {
                    m68220b();
                }
                if (this.f59563m.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.f59561j);
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
        void m68220b() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.b;
            Observer observer = this.a;
            UnicastSubject unicastSubject = this.f59562k;
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
                } else if (poll == f59557l) {
                    unicastSubject.onComplete();
                    if (this.f59563m.decrementAndGet() == 0) {
                        DisposableHelper.dispose(this.f59561j);
                        return;
                    } else if (!this.c) {
                        unicastSubject = UnicastSubject.m67686a(this.f59559h);
                        this.f59563m.getAndIncrement();
                        this.f59562k = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                }
            }
            DisposableHelper.dispose(this.f59561j);
            Throwable th = this.e;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
        }

        /* renamed from: c */
        void m68221c() {
            this.b.offer(f59557l);
            if (enter()) {
                m68220b();
            }
        }
    }

    public bv(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, int i) {
        super(observableSource);
        this.f59048b = observableSource2;
        this.f59049c = i;
    }

    public void subscribeActual(Observer<? super C3959e<T>> observer) {
        this.a.subscribe(new C19187b(new C17530d(observer), this.f59048b, this.f59049c));
    }
}
