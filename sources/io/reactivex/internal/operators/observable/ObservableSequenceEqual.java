package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.C18423a;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableSequenceEqual<T> extends C3959e<Boolean> {
    /* renamed from: a */
    final ObservableSource<? extends T> f57207a;
    /* renamed from: b */
    final ObservableSource<? extends T> f57208b;
    /* renamed from: c */
    final BiPredicate<? super T, ? super T> f57209c;
    /* renamed from: d */
    final int f57210d;

    static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        /* renamed from: a */
        final Observer<? super Boolean> f53680a;
        /* renamed from: b */
        final BiPredicate<? super T, ? super T> f53681b;
        /* renamed from: c */
        final ArrayCompositeDisposable f53682c = new ArrayCompositeDisposable(2);
        /* renamed from: d */
        final ObservableSource<? extends T> f53683d;
        /* renamed from: e */
        final ObservableSource<? extends T> f53684e;
        /* renamed from: f */
        final C17449a<T>[] f53685f;
        /* renamed from: g */
        volatile boolean f53686g;
        /* renamed from: h */
        T f53687h;
        /* renamed from: i */
        T f53688i;

        EqualCoordinator(Observer<? super Boolean> observer, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f53680a = observer;
            this.f53683d = observableSource;
            this.f53684e = observableSource2;
            this.f53681b = biPredicate;
            observableSource = new C17449a[2];
            this.f53685f = observableSource;
            observableSource[0] = new C17449a(this, 0, i);
            observableSource[1] = new C17449a(this, 1, i);
        }

        /* renamed from: a */
        boolean m63668a(Disposable disposable, int i) {
            return this.f53682c.m63456a(i, disposable);
        }

        /* renamed from: a */
        void m63666a() {
            C17449a[] c17449aArr = this.f53685f;
            this.f53683d.subscribe(c17449aArr[0]);
            this.f53684e.subscribe(c17449aArr[1]);
        }

        public void dispose() {
            if (!this.f53686g) {
                this.f53686g = true;
                this.f53682c.dispose();
                if (getAndIncrement() == 0) {
                    C17449a[] c17449aArr = this.f53685f;
                    c17449aArr[0].f53690b.clear();
                    c17449aArr[1].f53690b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53686g;
        }

        /* renamed from: a */
        void m63667a(C18423a<T> c18423a, C18423a<T> c18423a2) {
            this.f53686g = true;
            c18423a.clear();
            c18423a2.clear();
        }

        /* renamed from: b */
        void m63669b() {
            if (getAndIncrement() == 0) {
                C17449a[] c17449aArr = this.f53685f;
                C17449a c17449a = c17449aArr[0];
                C18423a c18423a = c17449a.f53690b;
                C17449a c17449a2 = c17449aArr[1];
                C18423a c18423a2 = c17449a2.f53690b;
                int i = 1;
                while (!this.f53686g) {
                    boolean z = c17449a.f53692d;
                    if (z) {
                        Throwable th = c17449a.f53693e;
                        if (th != null) {
                            m63667a(c18423a, c18423a2);
                            this.f53680a.onError(th);
                            return;
                        }
                    }
                    boolean z2 = c17449a2.f53692d;
                    if (z2) {
                        Throwable th2 = c17449a2.f53693e;
                        if (th2 != null) {
                            m63667a(c18423a, c18423a2);
                            this.f53680a.onError(th2);
                            return;
                        }
                    }
                    if (this.f53687h == null) {
                        this.f53687h = c18423a.poll();
                    }
                    Object obj = this.f53687h == null ? 1 : null;
                    if (this.f53688i == null) {
                        this.f53688i = c18423a2.poll();
                    }
                    Object obj2 = this.f53688i == null ? 1 : null;
                    if (z && z2 && obj != null && obj2 != null) {
                        this.f53680a.onNext(Boolean.valueOf(true));
                        this.f53680a.onComplete();
                        return;
                    } else if (z && z2 && obj != obj2) {
                        m63667a(c18423a, c18423a2);
                        this.f53680a.onNext(Boolean.valueOf(false));
                        this.f53680a.onComplete();
                        return;
                    } else {
                        if (obj == null && obj2 == null) {
                            try {
                                if (this.f53681b.test(this.f53687h, this.f53688i)) {
                                    this.f53687h = null;
                                    this.f53688i = null;
                                } else {
                                    m63667a(c18423a, c18423a2);
                                    this.f53680a.onNext(Boolean.valueOf(false));
                                    this.f53680a.onComplete();
                                    return;
                                }
                            } catch (Throwable th3) {
                                C15678a.m58850b(th3);
                                m63667a(c18423a, c18423a2);
                                this.f53680a.onError(th3);
                                return;
                            }
                        }
                        if (obj != null || obj2 != null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                }
                c18423a.clear();
                c18423a2.clear();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqual$a */
    static final class C17449a<T> implements Observer<T> {
        /* renamed from: a */
        final EqualCoordinator<T> f53689a;
        /* renamed from: b */
        final C18423a<T> f53690b;
        /* renamed from: c */
        final int f53691c;
        /* renamed from: d */
        volatile boolean f53692d;
        /* renamed from: e */
        Throwable f53693e;

        C17449a(EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.f53689a = equalCoordinator;
            this.f53691c = i;
            this.f53690b = new C18423a(i2);
        }

        public void onSubscribe(Disposable disposable) {
            this.f53689a.m63668a(disposable, this.f53691c);
        }

        public void onNext(T t) {
            this.f53690b.offer(t);
            this.f53689a.m63669b();
        }

        public void onError(Throwable th) {
            this.f53693e = th;
            this.f53692d = true;
            this.f53689a.m63669b();
        }

        public void onComplete() {
            this.f53692d = true;
            this.f53689a.m63669b();
        }
    }

    public ObservableSequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.f57207a = observableSource;
        this.f57208b = observableSource2;
        this.f57209c = biPredicate;
        this.f57210d = i;
    }

    public void subscribeActual(Observer<? super Boolean> observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer, this.f57210d, this.f57207a, this.f57208b, this.f57209c);
        observer.onSubscribe(equalCoordinator);
        equalCoordinator.m63666a();
    }
}
