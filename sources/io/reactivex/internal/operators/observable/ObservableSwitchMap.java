package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableSwitchMap<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends ObservableSource<? extends R>> f58989b;
    /* renamed from: c */
    final int f58990c;
    /* renamed from: d */
    final boolean f58991d;

    static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        /* renamed from: a */
        final SwitchMapObserver<T, R> f53723a;
        /* renamed from: b */
        final long f53724b;
        /* renamed from: c */
        final C18423a<R> f53725c;
        /* renamed from: d */
        volatile boolean f53726d;

        SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j, int i) {
            this.f53723a = switchMapObserver;
            this.f53724b = j;
            this.f53725c = new C18423a(i);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(R r) {
            if (this.f53724b == this.f53723a.f53737k) {
                this.f53725c.offer(r);
                this.f53723a.m63679b();
            }
        }

        public void onError(Throwable th) {
            this.f53723a.m63678a(this, th);
        }

        public void onComplete() {
            if (this.f53724b == this.f53723a.f53737k) {
                this.f53726d = true;
                this.f53723a.m63679b();
            }
        }

        /* renamed from: a */
        public void m63676a() {
            DisposableHelper.dispose(this);
        }
    }

    static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        /* renamed from: j */
        static final SwitchMapInnerObserver<Object, Object> f53727j = new SwitchMapInnerObserver(null, -1, 1);
        private static final long serialVersionUID = -3491074160481096299L;
        /* renamed from: a */
        final Observer<? super R> f53728a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f53729b;
        /* renamed from: c */
        final int f53730c;
        /* renamed from: d */
        final boolean f53731d;
        /* renamed from: e */
        final AtomicThrowable f53732e;
        /* renamed from: f */
        volatile boolean f53733f;
        /* renamed from: g */
        volatile boolean f53734g;
        /* renamed from: h */
        Disposable f53735h;
        /* renamed from: i */
        final AtomicReference<SwitchMapInnerObserver<T, R>> f53736i = new AtomicReference();
        /* renamed from: k */
        volatile long f53737k;

        static {
            f53727j.m63676a();
        }

        SwitchMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.f53728a = observer;
            this.f53729b = function;
            this.f53730c = i;
            this.f53731d = z;
            this.f53732e = new AtomicThrowable();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53735h, disposable)) {
                this.f53735h = disposable;
                this.f53728a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            long j = this.f53737k + 1;
            this.f53737k = j;
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.f53736i.get();
            if (switchMapInnerObserver != null) {
                switchMapInnerObserver.m63676a();
            }
            try {
                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f53729b.apply(t), "The ObservableSource returned is null");
                Observer switchMapInnerObserver2 = new SwitchMapInnerObserver(this, j, this.f53730c);
                SwitchMapInnerObserver switchMapInnerObserver3;
                do {
                    switchMapInnerObserver3 = (SwitchMapInnerObserver) this.f53736i.get();
                    if (switchMapInnerObserver3 == f53727j) {
                        break;
                    }
                } while (!this.f53736i.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2));
                observableSource.subscribe(switchMapInnerObserver2);
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53735h.dispose();
                onError(t2);
            }
        }

        public void onError(Throwable th) {
            if (this.f53733f || !this.f53732e.m58961a(th)) {
                C2667a.a(th);
                return;
            }
            if (this.f53731d == null) {
                m63677a();
            }
            this.f53733f = true;
            m63679b();
        }

        public void onComplete() {
            if (!this.f53733f) {
                this.f53733f = true;
                m63679b();
            }
        }

        public void dispose() {
            if (!this.f53734g) {
                this.f53734g = true;
                this.f53735h.dispose();
                m63677a();
            }
        }

        public boolean isDisposed() {
            return this.f53734g;
        }

        /* renamed from: a */
        void m63677a() {
            if (((SwitchMapInnerObserver) this.f53736i.get()) != f53727j) {
                SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.f53736i.getAndSet(f53727j);
                if (switchMapInnerObserver != f53727j && switchMapInnerObserver != null) {
                    switchMapInnerObserver.m63676a();
                }
            }
        }

        /* renamed from: b */
        void m63679b() {
            if (getAndIncrement() == 0) {
                Observer observer = this.f53728a;
                int i = 1;
                while (!this.f53734g) {
                    Object obj = null;
                    if (this.f53733f) {
                        Object obj2 = this.f53736i.get() == null ? 1 : null;
                        if (this.f53731d) {
                            if (obj2 != null) {
                                Throwable th = (Throwable) this.f53732e.get();
                                if (th != null) {
                                    observer.onError(th);
                                } else {
                                    observer.onComplete();
                                }
                                return;
                            }
                        } else if (((Throwable) this.f53732e.get()) != null) {
                            observer.onError(this.f53732e.m58960a());
                            return;
                        } else if (obj2 != null) {
                            observer.onComplete();
                            return;
                        }
                    }
                    SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.f53736i.get();
                    if (switchMapInnerObserver != null) {
                        boolean isEmpty;
                        C18423a c18423a = switchMapInnerObserver.f53725c;
                        if (switchMapInnerObserver.f53726d) {
                            isEmpty = c18423a.isEmpty();
                            if (this.f53731d) {
                                if (isEmpty) {
                                    this.f53736i.compareAndSet(switchMapInnerObserver, null);
                                }
                            } else if (((Throwable) this.f53732e.get()) != null) {
                                observer.onError(this.f53732e.m58960a());
                                return;
                            } else if (isEmpty) {
                                this.f53736i.compareAndSet(switchMapInnerObserver, null);
                            }
                        }
                        while (!this.f53734g) {
                            if (switchMapInnerObserver == this.f53736i.get()) {
                                if (this.f53731d || ((Throwable) this.f53732e.get()) == null) {
                                    isEmpty = switchMapInnerObserver.f53726d;
                                    Object poll = c18423a.poll();
                                    Object obj3 = poll == null ? 1 : null;
                                    if (isEmpty && obj3 != null) {
                                        this.f53736i.compareAndSet(switchMapInnerObserver, null);
                                    } else if (obj3 == null) {
                                        observer.onNext(poll);
                                    } else if (obj != null) {
                                    }
                                } else {
                                    observer.onError(this.f53732e.m58960a());
                                    return;
                                }
                            }
                            obj = 1;
                            if (obj != null) {
                            }
                        }
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        void m63678a(SwitchMapInnerObserver<T, R> switchMapInnerObserver, Throwable th) {
            if (switchMapInnerObserver.f53724b == this.f53737k && this.f53732e.m58961a(th)) {
                if (this.f53731d == null) {
                    this.f53735h.dispose();
                }
                switchMapInnerObserver.f53726d = true;
                m63679b();
                return;
            }
            C2667a.a(th);
        }
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.f58989b = function;
        this.f58990c = i;
        this.f58991d = z;
    }

    public void subscribeActual(Observer<? super R> observer) {
        if (!ObservableScalarXMap.m58934a(this.a, observer, this.f58989b)) {
            this.a.subscribe(new SwitchMapObserver(observer, this.f58989b, this.f58990c, this.f58991d));
        }
    }
}
