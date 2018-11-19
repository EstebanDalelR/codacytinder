package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.Iterator;

public final class bz<T, U, V> extends C3959e<V> {
    /* renamed from: a */
    final C3959e<? extends T> f57281a;
    /* renamed from: b */
    final Iterable<U> f57282b;
    /* renamed from: c */
    final BiFunction<? super T, ? super U, ? extends V> f57283c;

    /* renamed from: io.reactivex.internal.operators.observable.bz$a */
    static final class C17488a<T, U, V> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super V> f53982a;
        /* renamed from: b */
        final Iterator<U> f53983b;
        /* renamed from: c */
        final BiFunction<? super T, ? super U, ? extends V> f53984c;
        /* renamed from: d */
        Disposable f53985d;
        /* renamed from: e */
        boolean f53986e;

        C17488a(Observer<? super V> observer, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f53982a = observer;
            this.f53983b = it;
            this.f53984c = biFunction;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53985d, disposable)) {
                this.f53985d = disposable;
                this.f53982a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53985d.dispose();
        }

        public boolean isDisposed() {
            return this.f53985d.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53986e) {
                try {
                    try {
                        this.f53982a.onNext(C15684a.m58895a(this.f53984c.apply(t, C15684a.m58895a(this.f53983b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (this.f53983b.hasNext() == null) {
                                this.f53986e = true;
                                this.f53985d.dispose();
                                this.f53982a.onComplete();
                            }
                        } catch (T t2) {
                            C15678a.m58850b(t2);
                            m63709a(t2);
                        }
                    } catch (T t22) {
                        C15678a.m58850b(t22);
                        m63709a(t22);
                    }
                } catch (T t222) {
                    C15678a.m58850b(t222);
                    m63709a(t222);
                }
            }
        }

        /* renamed from: a */
        void m63709a(Throwable th) {
            this.f53986e = true;
            this.f53985d.dispose();
            this.f53982a.onError(th);
        }

        public void onError(Throwable th) {
            if (this.f53986e) {
                C2667a.a(th);
                return;
            }
            this.f53986e = true;
            this.f53982a.onError(th);
        }

        public void onComplete() {
            if (!this.f53986e) {
                this.f53986e = true;
                this.f53982a.onComplete();
            }
        }
    }

    public bz(C3959e<? extends T> c3959e, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f57281a = c3959e;
        this.f57282b = iterable;
        this.f57283c = biFunction;
    }

    public void subscribeActual(Observer<? super V> observer) {
        try {
            Iterator it = (Iterator) C15684a.m58895a(this.f57282b.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f57281a.subscribe(new C17488a(observer, it, this.f57283c));
                } else {
                    EmptyDisposable.complete((Observer) observer);
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                EmptyDisposable.error(th, (Observer) observer);
            }
        } catch (Throwable th2) {
            C15678a.m58850b(th2);
            EmptyDisposable.error(th2, (Observer) observer);
        }
    }
}
