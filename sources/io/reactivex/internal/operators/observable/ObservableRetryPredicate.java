package io.reactivex.internal.operators.observable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableRetryPredicate<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Predicate<? super Throwable> f58971b;
    /* renamed from: c */
    final long f58972c;

    static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        /* renamed from: a */
        final Observer<? super T> f53655a;
        /* renamed from: b */
        final SequentialDisposable f53656b;
        /* renamed from: c */
        final ObservableSource<? extends T> f53657c;
        /* renamed from: d */
        final Predicate<? super Throwable> f53658d;
        /* renamed from: e */
        long f53659e;

        RepeatObserver(Observer<? super T> observer, long j, Predicate<? super Throwable> predicate, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f53655a = observer;
            this.f53656b = sequentialDisposable;
            this.f53657c = observableSource;
            this.f53658d = predicate;
            this.f53659e = j;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53656b.m63457a(disposable);
        }

        public void onNext(T t) {
            this.f53655a.onNext(t);
        }

        public void onError(Throwable th) {
            long j = this.f53659e;
            if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f53659e = j - 1;
            }
            if (j == 0) {
                this.f53655a.onError(th);
            } else {
                try {
                    if (this.f53658d.test(th)) {
                        m63651a();
                    } else {
                        this.f53655a.onError(th);
                    }
                } catch (Throwable th2) {
                    C15678a.m58850b(th2);
                    this.f53655a.onError(new CompositeException(th, th2));
                }
            }
        }

        public void onComplete() {
            this.f53655a.onComplete();
        }

        /* renamed from: a */
        void m63651a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f53656b.isDisposed()) {
                    this.f53657c.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public ObservableRetryPredicate(C3959e<T> c3959e, long j, Predicate<? super Throwable> predicate) {
        super(c3959e);
        this.f58971b = predicate;
        this.f58972c = j;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new RepeatObserver(observer, this.f58972c, this.f58971b, sequentialDisposable, this.a).m63651a();
    }
}
