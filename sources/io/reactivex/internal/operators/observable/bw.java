package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19003j;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.C17528b;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class bw<T, B, V> extends C18394a<T, C3959e<T>> {
    /* renamed from: b */
    final ObservableSource<B> f59050b;
    /* renamed from: c */
    final Function<? super B, ? extends ObservableSource<V>> f59051c;
    /* renamed from: d */
    final int f59052d;

    /* renamed from: io.reactivex.internal.operators.observable.bw$d */
    static final class C15712d<T, B> {
        /* renamed from: a */
        final UnicastSubject<T> f48593a;
        /* renamed from: b */
        final B f48594b;

        C15712d(UnicastSubject<T> unicastSubject, B b) {
            this.f48593a = unicastSubject;
            this.f48594b = b;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bw$a */
    static final class C18398a<T, V> extends C17528b<V> {
        /* renamed from: a */
        final C19188c<T, ?, V> f57275a;
        /* renamed from: b */
        final UnicastSubject<T> f57276b;
        /* renamed from: c */
        boolean f57277c;

        C18398a(C19188c<T, ?, V> c19188c, UnicastSubject<T> unicastSubject) {
            this.f57275a = c19188c;
            this.f57276b = unicastSubject;
        }

        public void onNext(V v) {
            if (this.f57277c == null) {
                this.f57277c = true;
                dispose();
                this.f57275a.m68222a(this);
            }
        }

        public void onError(Throwable th) {
            if (this.f57277c) {
                C2667a.a(th);
                return;
            }
            this.f57277c = true;
            this.f57275a.m68224a(th);
        }

        public void onComplete() {
            if (!this.f57277c) {
                this.f57277c = true;
                this.f57275a.m68222a(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bw$b */
    static final class C18399b<T, B> extends C17528b<B> {
        /* renamed from: a */
        final C19188c<T, B, ?> f57278a;

        C18399b(C19188c<T, B, ?> c19188c) {
            this.f57278a = c19188c;
        }

        public void onNext(B b) {
            this.f57278a.m68223a((Object) b);
        }

        public void onError(Throwable th) {
            this.f57278a.m68224a(th);
        }

        public void onComplete() {
            this.f57278a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bw$c */
    static final class C19188c<T, B, V> extends C19003j<T, Object, C3959e<T>> implements Disposable {
        /* renamed from: g */
        final ObservableSource<B> f59564g;
        /* renamed from: h */
        final Function<? super B, ? extends ObservableSource<V>> f59565h;
        /* renamed from: i */
        final int f59566i;
        /* renamed from: j */
        final C17356a f59567j;
        /* renamed from: k */
        Disposable f59568k;
        /* renamed from: l */
        final AtomicReference<Disposable> f59569l = new AtomicReference();
        /* renamed from: m */
        final List<UnicastSubject<T>> f59570m;
        /* renamed from: n */
        final AtomicLong f59571n = new AtomicLong();

        public void accept(Observer<? super C3959e<T>> observer, Object obj) {
        }

        C19188c(Observer<? super C3959e<T>> observer, ObservableSource<B> observableSource, Function<? super B, ? extends ObservableSource<V>> function, int i) {
            super(observer, new MpscLinkedQueue());
            this.f59564g = observableSource;
            this.f59565h = function;
            this.f59566i = i;
            this.f59567j = new C17356a();
            this.f59570m = new ArrayList();
            this.f59571n.lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59568k, disposable)) {
                this.f59568k = disposable;
                this.a.onSubscribe(this);
                if (this.c == null) {
                    disposable = new C18399b(this);
                    if (this.f59569l.compareAndSet(null, disposable)) {
                        this.f59571n.getAndIncrement();
                        this.f59564g.subscribe(disposable);
                    }
                }
            }
        }

        public void onNext(T t) {
            if (m67552a()) {
                for (UnicastSubject onNext : this.f59570m) {
                    onNext.onNext(t);
                }
                if (leave(-1) == null) {
                    return;
                }
            }
            this.b.offer(NotificationLite.next(t));
            if (enter() == null) {
                return;
            }
            m68226c();
        }

        public void onError(Throwable th) {
            if (this.d) {
                C2667a.a(th);
                return;
            }
            this.e = th;
            this.d = true;
            if (enter()) {
                m68226c();
            }
            if (this.f59571n.decrementAndGet() == 0) {
                this.f59567j.dispose();
            }
            this.a.onError(th);
        }

        public void onComplete() {
            if (!this.d) {
                this.d = true;
                if (enter()) {
                    m68226c();
                }
                if (this.f59571n.decrementAndGet() == 0) {
                    this.f59567j.dispose();
                }
                this.a.onComplete();
            }
        }

        /* renamed from: a */
        void m68224a(Throwable th) {
            this.f59568k.dispose();
            this.f59567j.dispose();
            onError(th);
        }

        public void dispose() {
            this.c = true;
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68225b() {
            this.f59567j.dispose();
            DisposableHelper.dispose(this.f59569l);
        }

        /* renamed from: c */
        void m68226c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.b;
            Observer observer = this.a;
            List<UnicastSubject> list = this.f59570m;
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
                } else if (poll instanceof C15712d) {
                    C15712d c15712d = (C15712d) poll;
                    if (c15712d.f48593a != null) {
                        if (list.remove(c15712d.f48593a)) {
                            c15712d.f48593a.onComplete();
                            if (this.f59571n.decrementAndGet() == 0) {
                                m68225b();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.c) {
                        UnicastSubject a = UnicastSubject.m67686a(this.f59566i);
                        list.add(a);
                        observer.onNext(a);
                        try {
                            ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f59565h.apply(c15712d.f48594b), "The ObservableSource supplied is null");
                            obj = new C18398a(this, a);
                            if (this.f59567j.add(obj)) {
                                this.f59571n.getAndIncrement();
                                observableSource.subscribe(obj);
                            }
                        } catch (Throwable th) {
                            C15678a.m58850b(th);
                            this.c = true;
                            observer.onError(th);
                        }
                    }
                } else {
                    for (UnicastSubject onNext : list) {
                        onNext.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
            m68225b();
            Throwable th2 = this.e;
            if (th2 != null) {
                for (UnicastSubject onError : list) {
                    onError.onError(th2);
                }
            } else {
                for (UnicastSubject onComplete : list) {
                    onComplete.onComplete();
                }
            }
            list.clear();
        }

        /* renamed from: a */
        void m68223a(B b) {
            this.b.offer(new C15712d(null, b));
            if (enter() != null) {
                m68226c();
            }
        }

        /* renamed from: a */
        void m68222a(C18398a<T, V> c18398a) {
            this.f59567j.delete(c18398a);
            this.b.offer(new C15712d(c18398a.f57276b, null));
            if (enter() != null) {
                m68226c();
            }
        }
    }

    public bw(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i) {
        super(observableSource);
        this.f59050b = observableSource2;
        this.f59051c = function;
        this.f59052d = i;
    }

    public void subscribeActual(Observer<? super C3959e<T>> observer) {
        this.a.subscribe(new C19188c(new C17530d(observer), this.f59050b, this.f59051c, this.f59052d));
    }
}
