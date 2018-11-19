package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableSequenceEqualSingle<T> extends C3960g<Boolean> implements FuseToObservable<Boolean> {
    /* renamed from: a */
    final ObservableSource<? extends T> f57211a;
    /* renamed from: b */
    final ObservableSource<? extends T> f57212b;
    /* renamed from: c */
    final BiPredicate<? super T, ? super T> f57213c;
    /* renamed from: d */
    final int f57214d;

    static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        /* renamed from: a */
        final SingleObserver<? super Boolean> f53694a;
        /* renamed from: b */
        final BiPredicate<? super T, ? super T> f53695b;
        /* renamed from: c */
        final ArrayCompositeDisposable f53696c = new ArrayCompositeDisposable(2);
        /* renamed from: d */
        final ObservableSource<? extends T> f53697d;
        /* renamed from: e */
        final ObservableSource<? extends T> f53698e;
        /* renamed from: f */
        final C17450a<T>[] f53699f;
        /* renamed from: g */
        volatile boolean f53700g;
        /* renamed from: h */
        T f53701h;
        /* renamed from: i */
        T f53702i;

        EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f53694a = singleObserver;
            this.f53697d = observableSource;
            this.f53698e = observableSource2;
            this.f53695b = biPredicate;
            observableSource = new C17450a[2];
            this.f53699f = observableSource;
            observableSource[0] = new C17450a(this, 0, i);
            observableSource[1] = new C17450a(this, 1, i);
        }

        /* renamed from: a */
        boolean m63672a(Disposable disposable, int i) {
            return this.f53696c.m63456a(i, disposable);
        }

        /* renamed from: a */
        void m63670a() {
            C17450a[] c17450aArr = this.f53699f;
            this.f53697d.subscribe(c17450aArr[0]);
            this.f53698e.subscribe(c17450aArr[1]);
        }

        public void dispose() {
            if (!this.f53700g) {
                this.f53700g = true;
                this.f53696c.dispose();
                if (getAndIncrement() == 0) {
                    C17450a[] c17450aArr = this.f53699f;
                    c17450aArr[0].f53704b.clear();
                    c17450aArr[1].f53704b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53700g;
        }

        /* renamed from: a */
        void m63671a(C18423a<T> c18423a, C18423a<T> c18423a2) {
            this.f53700g = true;
            c18423a.clear();
            c18423a2.clear();
        }

        /* renamed from: b */
        void m63673b() {
            if (getAndIncrement() == 0) {
                C17450a[] c17450aArr = this.f53699f;
                C17450a c17450a = c17450aArr[0];
                C18423a c18423a = c17450a.f53704b;
                C17450a c17450a2 = c17450aArr[1];
                C18423a c18423a2 = c17450a2.f53704b;
                int i = 1;
                while (!this.f53700g) {
                    boolean z = c17450a.f53706d;
                    if (z) {
                        Throwable th = c17450a.f53707e;
                        if (th != null) {
                            m63671a(c18423a, c18423a2);
                            this.f53694a.onError(th);
                            return;
                        }
                    }
                    boolean z2 = c17450a2.f53706d;
                    if (z2) {
                        Throwable th2 = c17450a2.f53707e;
                        if (th2 != null) {
                            m63671a(c18423a, c18423a2);
                            this.f53694a.onError(th2);
                            return;
                        }
                    }
                    if (this.f53701h == null) {
                        this.f53701h = c18423a.poll();
                    }
                    Object obj = this.f53701h == null ? 1 : null;
                    if (this.f53702i == null) {
                        this.f53702i = c18423a2.poll();
                    }
                    Object obj2 = this.f53702i == null ? 1 : null;
                    if (z && z2 && obj != null && obj2 != null) {
                        this.f53694a.onSuccess(Boolean.valueOf(true));
                        return;
                    } else if (z && z2 && obj != obj2) {
                        m63671a(c18423a, c18423a2);
                        this.f53694a.onSuccess(Boolean.valueOf(false));
                        return;
                    } else {
                        if (obj == null && obj2 == null) {
                            try {
                                if (this.f53695b.test(this.f53701h, this.f53702i)) {
                                    this.f53701h = null;
                                    this.f53702i = null;
                                } else {
                                    m63671a(c18423a, c18423a2);
                                    this.f53694a.onSuccess(Boolean.valueOf(false));
                                    return;
                                }
                            } catch (Throwable th3) {
                                C15678a.m58850b(th3);
                                m63671a(c18423a, c18423a2);
                                this.f53694a.onError(th3);
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

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$a */
    static final class C17450a<T> implements Observer<T> {
        /* renamed from: a */
        final EqualCoordinator<T> f53703a;
        /* renamed from: b */
        final C18423a<T> f53704b;
        /* renamed from: c */
        final int f53705c;
        /* renamed from: d */
        volatile boolean f53706d;
        /* renamed from: e */
        Throwable f53707e;

        C17450a(EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.f53703a = equalCoordinator;
            this.f53705c = i;
            this.f53704b = new C18423a(i2);
        }

        public void onSubscribe(Disposable disposable) {
            this.f53703a.m63672a(disposable, this.f53705c);
        }

        public void onNext(T t) {
            this.f53704b.offer(t);
            this.f53703a.m63673b();
        }

        public void onError(Throwable th) {
            this.f53707e = th;
            this.f53706d = true;
            this.f53703a.m63673b();
        }

        public void onComplete() {
            this.f53706d = true;
            this.f53703a.m63673b();
        }
    }

    public ObservableSequenceEqualSingle(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.f57211a = observableSource;
        this.f57212b = observableSource2;
        this.f57213c = biPredicate;
        this.f57214d = i;
    }

    /* renamed from: a */
    public void m66507a(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.f57214d, this.f57211a, this.f57212b, this.f57213c);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.m63670a();
    }

    public C3959e<Boolean> fuseToObservable() {
        return C2667a.a(new ObservableSequenceEqual(this.f57211a, this.f57212b, this.f57213c, this.f57214d));
    }
}
