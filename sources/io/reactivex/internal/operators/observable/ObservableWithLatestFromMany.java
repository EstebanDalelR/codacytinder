package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.C15738e;
import io.reactivex.p079d.C2667a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ObservableWithLatestFromMany<T, R> extends C18394a<T, R> {
    @Nullable
    /* renamed from: b */
    final ObservableSource<?>[] f59017b;
    @Nullable
    /* renamed from: c */
    final Iterable<? extends ObservableSource<?>> f59018c;
    @NonNull
    /* renamed from: d */
    final Function<? super Object[], R> f59019d;

    static final class WithLatestFromObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 1577321883966341961L;
        /* renamed from: a */
        final Observer<? super R> f53826a;
        /* renamed from: b */
        final Function<? super Object[], R> f53827b;
        /* renamed from: c */
        final WithLatestInnerObserver[] f53828c;
        /* renamed from: d */
        final AtomicReferenceArray<Object> f53829d;
        /* renamed from: e */
        final AtomicReference<Disposable> f53830e;
        /* renamed from: f */
        final AtomicThrowable f53831f;
        /* renamed from: g */
        volatile boolean f53832g;

        WithLatestFromObserver(Observer<? super R> observer, Function<? super Object[], R> function, int i) {
            this.f53826a = observer;
            this.f53827b = function;
            observer = new WithLatestInnerObserver[i];
            for (function = null; function < i; function++) {
                observer[function] = new WithLatestInnerObserver(this, function);
            }
            this.f53828c = observer;
            this.f53829d = new AtomicReferenceArray(i);
            this.f53830e = new AtomicReference();
            this.f53831f = new AtomicThrowable();
        }

        /* renamed from: a */
        void m63696a(ObservableSource<?>[] observableSourceArr, int i) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f53828c;
            AtomicReference atomicReference = this.f53830e;
            for (int i2 = 0; i2 < i && !DisposableHelper.isDisposed((Disposable) atomicReference.get()); i2++) {
                if (this.f53832g) {
                    break;
                }
                observableSourceArr[i2].subscribe(withLatestInnerObserverArr[i2]);
            }
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53830e, disposable);
        }

        public void onNext(T t) {
            if (!this.f53832g) {
                AtomicReferenceArray atomicReferenceArray = this.f53829d;
                int length = atomicReferenceArray.length();
                Object obj = new Object[(length + 1)];
                int i = 0;
                obj[0] = t;
                while (i < length) {
                    t = atomicReferenceArray.get(i);
                    if (t != null) {
                        i++;
                        obj[i] = t;
                    } else {
                        return;
                    }
                }
                try {
                    C15738e.m58978a(this.f53826a, C15684a.m58895a(this.f53827b.apply(obj), "combiner returned a null value"), (AtomicInteger) this, this.f53831f);
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53832g) {
                C2667a.a(th);
                return;
            }
            this.f53832g = true;
            m63692a(-1);
            C15738e.m58979a(this.f53826a, th, (AtomicInteger) this, this.f53831f);
        }

        public void onComplete() {
            if (!this.f53832g) {
                this.f53832g = true;
                m63692a(-1);
                C15738e.m58980a(this.f53826a, (AtomicInteger) this, this.f53831f);
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) this.f53830e.get());
        }

        public void dispose() {
            DisposableHelper.dispose(this.f53830e);
            for (WithLatestInnerObserver a : this.f53828c) {
                a.m63697a();
            }
        }

        /* renamed from: a */
        void m63693a(int i, Object obj) {
            this.f53829d.set(i, obj);
        }

        /* renamed from: a */
        void m63694a(int i, Throwable th) {
            this.f53832g = true;
            DisposableHelper.dispose(this.f53830e);
            m63692a(i);
            C15738e.m58979a(this.f53826a, th, (AtomicInteger) this, this.f53831f);
        }

        /* renamed from: a */
        void m63695a(int i, boolean z) {
            if (!z) {
                this.f53832g = true;
                m63692a(i);
                C15738e.m58980a(this.f53826a, (AtomicInteger) this, this.f53831f);
            }
        }

        /* renamed from: a */
        void m63692a(int i) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f53828c;
            for (int i2 = 0; i2 < withLatestInnerObserverArr.length; i2++) {
                if (i2 != i) {
                    withLatestInnerObserverArr[i2].m63697a();
                }
            }
        }
    }

    static final class WithLatestInnerObserver extends AtomicReference<Disposable> implements Observer<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        /* renamed from: a */
        final WithLatestFromObserver<?, ?> f53833a;
        /* renamed from: b */
        final int f53834b;
        /* renamed from: c */
        boolean f53835c;

        WithLatestInnerObserver(WithLatestFromObserver<?, ?> withLatestFromObserver, int i) {
            this.f53833a = withLatestFromObserver;
            this.f53834b = i;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(Object obj) {
            if (!this.f53835c) {
                this.f53835c = true;
            }
            this.f53833a.m63693a(this.f53834b, obj);
        }

        public void onError(Throwable th) {
            this.f53833a.m63694a(this.f53834b, th);
        }

        public void onComplete() {
            this.f53833a.m63695a(this.f53834b, this.f53835c);
        }

        /* renamed from: a */
        public void m63697a() {
            DisposableHelper.dispose(this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$a */
    final class C17454a implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ ObservableWithLatestFromMany f53836a;

        C17454a(ObservableWithLatestFromMany observableWithLatestFromMany) {
            this.f53836a = observableWithLatestFromMany;
        }

        public R apply(T t) throws Exception {
            return C15684a.m58895a(this.f53836a.f59019d.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource<T> observableSource, @NonNull ObservableSource<?>[] observableSourceArr, @NonNull Function<? super Object[], R> function) {
        super(observableSource);
        this.f59017b = observableSourceArr;
        this.f59018c = null;
        this.f59019d = function;
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource<T> observableSource, @NonNull Iterable<? extends ObservableSource<?>> iterable, @NonNull Function<? super Object[], R> function) {
        super(observableSource);
        this.f59017b = null;
        this.f59018c = iterable;
        this.f59019d = function;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        int i;
        ObservableSource[] observableSourceArr = this.f59017b;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                i = 0;
                for (ObservableSource observableSource : this.f59018c) {
                    if (i == observableSourceArr.length) {
                        observableSourceArr = (ObservableSource[]) Arrays.copyOf(observableSourceArr, (i >> 1) + i);
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
            new aw(this.a, new C17454a(this)).subscribeActual(observer);
            return;
        }
        Observer withLatestFromObserver = new WithLatestFromObserver(observer, this.f59019d, i);
        observer.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.m63696a(observableSourceArr, i);
        this.a.subscribe(withLatestFromObserver);
    }
}
