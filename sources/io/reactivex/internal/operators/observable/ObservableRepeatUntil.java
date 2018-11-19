package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableRepeatUntil<T> extends C18394a<T, T> {
    /* renamed from: b */
    final BooleanSupplier f58961b;

    static final class RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        /* renamed from: a */
        final Observer<? super T> f53616a;
        /* renamed from: b */
        final SequentialDisposable f53617b;
        /* renamed from: c */
        final ObservableSource<? extends T> f53618c;
        /* renamed from: d */
        final BooleanSupplier f53619d;

        RepeatUntilObserver(Observer<? super T> observer, BooleanSupplier booleanSupplier, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f53616a = observer;
            this.f53617b = sequentialDisposable;
            this.f53618c = observableSource;
            this.f53619d = booleanSupplier;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53617b.m63458b(disposable);
        }

        public void onNext(T t) {
            this.f53616a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53616a.onError(th);
        }

        public void onComplete() {
            try {
                if (this.f53619d.getAsBoolean()) {
                    this.f53616a.onComplete();
                } else {
                    m63620a();
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                this.f53616a.onError(th);
            }
        }

        /* renamed from: a */
        void m63620a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f53618c.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    public ObservableRepeatUntil(C3959e<T> c3959e, BooleanSupplier booleanSupplier) {
        super(c3959e);
        this.f58961b = booleanSupplier;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new RepeatUntilObserver(observer, this.f58961b, sequentialDisposable, this.a).m63620a();
    }
}
