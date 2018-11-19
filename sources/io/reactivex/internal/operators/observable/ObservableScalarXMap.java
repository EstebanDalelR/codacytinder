package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableScalarXMap {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableScalarXMap$a */
    static final class C18392a<T, R> extends C3959e<R> {
        /* renamed from: a */
        final T f57205a;
        /* renamed from: b */
        final Function<? super T, ? extends ObservableSource<? extends R>> f57206b;

        C18392a(T t, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f57205a = t;
            this.f57206b = function;
        }

        public void subscribeActual(Observer<? super R> observer) {
            try {
                ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f57206b.apply(this.f57205a), "The mapper returned a null ObservableSource");
                if (observableSource instanceof Callable) {
                    try {
                        Object call = ((Callable) observableSource).call();
                        if (call == null) {
                            EmptyDisposable.complete((Observer) observer);
                            return;
                        }
                        Object scalarDisposable = new ScalarDisposable(observer, call);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        EmptyDisposable.error(th, (Observer) observer);
                        return;
                    }
                }
                observableSource.subscribe(observer);
            } catch (Throwable th2) {
                EmptyDisposable.error(th2, (Observer) observer);
            }
        }
    }

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        /* renamed from: a */
        final Observer<? super T> f58980a;
        /* renamed from: b */
        final T f58981b;

        public ScalarDisposable(Observer<? super T> observer, T t) {
            this.f58980a = observer;
            this.f58981b = t;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Nullable
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f58981b;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        public boolean isDisposed() {
            return get() == 3;
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f58980a.onNext(this.f58981b);
                if (get() == 2) {
                    lazySet(3);
                    this.f58980a.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m58934a(ObservableSource<T> observableSource, Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Callable)) {
            return null;
        }
        try {
            observableSource = ((Callable) observableSource).call();
            if (observableSource == null) {
                EmptyDisposable.complete((Observer) observer);
                return true;
            }
            try {
                observableSource = (ObservableSource) C15684a.m58895a(function.apply(observableSource), "The mapper returned a null ObservableSource");
                if ((observableSource instanceof Callable) != null) {
                    try {
                        observableSource = ((Callable) observableSource).call();
                        if (observableSource == null) {
                            EmptyDisposable.complete((Observer) observer);
                            return true;
                        }
                        function = new ScalarDisposable(observer, observableSource);
                        observer.onSubscribe(function);
                        function.run();
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        EmptyDisposable.error(th, (Observer) observer);
                        return true;
                    }
                }
                observableSource.subscribe(observer);
                return true;
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                EmptyDisposable.error(th2, (Observer) observer);
                return true;
            }
        } catch (Throwable th22) {
            C15678a.m58850b(th22);
            EmptyDisposable.error(th22, (Observer) observer);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C3959e<U> m58933a(T t, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return C2667a.a(new C18392a(t, function));
    }
}
