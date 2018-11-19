package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableRetryBiPredicate<T> extends C18394a<T, T> {
    /* renamed from: b */
    final BiPredicate<? super Integer, ? super Throwable> f58970b;

    static final class RetryBiObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        /* renamed from: a */
        final Observer<? super T> f53650a;
        /* renamed from: b */
        final SequentialDisposable f53651b;
        /* renamed from: c */
        final ObservableSource<? extends T> f53652c;
        /* renamed from: d */
        final BiPredicate<? super Integer, ? super Throwable> f53653d;
        /* renamed from: e */
        int f53654e;

        RetryBiObserver(Observer<? super T> observer, BiPredicate<? super Integer, ? super Throwable> biPredicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f53650a = observer;
            this.f53651b = sequentialDisposable;
            this.f53652c = observableSource;
            this.f53653d = biPredicate;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53651b.m63457a(disposable);
        }

        public void onNext(T t) {
            this.f53650a.onNext(t);
        }

        public void onError(Throwable th) {
            try {
                BiPredicate biPredicate = this.f53653d;
                int i = this.f53654e + 1;
                this.f53654e = i;
                if (biPredicate.test(Integer.valueOf(i), th)) {
                    m63650a();
                } else {
                    this.f53650a.onError(th);
                }
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.f53650a.onError(new CompositeException(th, th2));
            }
        }

        public void onComplete() {
            this.f53650a.onComplete();
        }

        /* renamed from: a */
        void m63650a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f53651b.isDisposed()) {
                    this.f53652c.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public ObservableRetryBiPredicate(C3959e<T> c3959e, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(c3959e);
        this.f58970b = biPredicate;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new RetryBiObserver(observer, this.f58970b, sequentialDisposable, this.a).m63650a();
    }
}
