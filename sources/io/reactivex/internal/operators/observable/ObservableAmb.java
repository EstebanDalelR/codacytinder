package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableAmb<T> extends C3959e<T> {
    /* renamed from: a */
    final ObservableSource<? extends T>[] f57162a;
    /* renamed from: b */
    final Iterable<? extends ObservableSource<? extends T>> f57163b;

    static final class AmbInnerObserver<T> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        /* renamed from: a */
        final C17423a<T> f53303a;
        /* renamed from: b */
        final int f53304b;
        /* renamed from: c */
        final Observer<? super T> f53305c;
        /* renamed from: d */
        boolean f53306d;

        AmbInnerObserver(C17423a<T> c17423a, int i, Observer<? super T> observer) {
            this.f53303a = c17423a;
            this.f53304b = i;
            this.f53305c = observer;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(T t) {
            if (this.f53306d) {
                this.f53305c.onNext(t);
            } else if (this.f53303a.m63511a(this.f53304b)) {
                this.f53306d = true;
                this.f53305c.onNext(t);
            } else {
                ((Disposable) get()).dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f53306d) {
                this.f53305c.onError(th);
            } else if (this.f53303a.m63511a(this.f53304b)) {
                this.f53306d = true;
                this.f53305c.onError(th);
            } else {
                C2667a.a(th);
            }
        }

        public void onComplete() {
            if (this.f53306d) {
                this.f53305c.onComplete();
            } else if (this.f53303a.m63511a(this.f53304b)) {
                this.f53306d = true;
                this.f53305c.onComplete();
            }
        }

        /* renamed from: a */
        public void m63509a() {
            DisposableHelper.dispose(this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAmb$a */
    static final class C17423a<T> implements Disposable {
        /* renamed from: a */
        final Observer<? super T> f53307a;
        /* renamed from: b */
        final AmbInnerObserver<T>[] f53308b;
        /* renamed from: c */
        final AtomicInteger f53309c = new AtomicInteger();

        C17423a(Observer<? super T> observer, int i) {
            this.f53307a = observer;
            this.f53308b = new AmbInnerObserver[i];
        }

        /* renamed from: a */
        public void m63510a(ObservableSource<? extends T>[] observableSourceArr) {
            AmbInnerObserver[] ambInnerObserverArr = this.f53308b;
            int length = ambInnerObserverArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                ambInnerObserverArr[i2] = new AmbInnerObserver(this, i3, this.f53307a);
                i2 = i3;
            }
            this.f53309c.lazySet(0);
            this.f53307a.onSubscribe(this);
            while (i < length && this.f53309c.get() == 0) {
                observableSourceArr[i].subscribe(ambInnerObserverArr[i]);
                i++;
            }
        }

        /* renamed from: a */
        public boolean m63511a(int i) {
            int i2 = this.f53309c.get();
            boolean z = true;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != i) {
                    z = false;
                }
                return z;
            } else if (!this.f53309c.compareAndSet(0, i)) {
                return false;
            } else {
                AmbInnerObserver[] ambInnerObserverArr = this.f53308b;
                int length = ambInnerObserverArr.length;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    if (i4 != i) {
                        ambInnerObserverArr[i3].m63509a();
                    }
                    i3 = i4;
                }
                return true;
            }
        }

        public void dispose() {
            if (this.f53309c.get() != -1) {
                this.f53309c.lazySet(-1);
                for (AmbInnerObserver a : this.f53308b) {
                    a.m63509a();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53309c.get() == -1;
        }
    }

    public ObservableAmb(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable) {
        this.f57162a = observableSourceArr;
        this.f57163b = iterable;
    }

    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource[] observableSourceArr = this.f57162a;
        int i;
        if (observableSourceArr == null) {
            observableSourceArr = new C3959e[8];
            try {
                i = 0;
                for (ObservableSource observableSource : this.f57163b) {
                    if (observableSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), (Observer) observer);
                        return;
                    }
                    if (i == observableSourceArr.length) {
                        Object obj = new ObservableSource[((i >> 2) + i)];
                        System.arraycopy(observableSourceArr, 0, obj, 0, i);
                        observableSourceArr = obj;
                    }
                    int i2 = i + 1;
                    observableSourceArr[i] = observableSource;
                    i = i2;
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                EmptyDisposable.error(th, (Observer) observer);
                return;
            }
        }
        i = observableSourceArr.length;
        if (i == 0) {
            EmptyDisposable.complete((Observer) observer);
        } else if (i == 1) {
            observableSourceArr[0].subscribe(observer);
        } else {
            new C17423a(observer, i).m63510a(observableSourceArr);
        }
    }
}
