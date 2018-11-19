package io.reactivex.internal.operators.observable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableRepeat<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f58960b;

    static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        /* renamed from: a */
        final Observer<? super T> f53612a;
        /* renamed from: b */
        final SequentialDisposable f53613b;
        /* renamed from: c */
        final ObservableSource<? extends T> f53614c;
        /* renamed from: d */
        long f53615d;

        RepeatObserver(Observer<? super T> observer, long j, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.f53612a = observer;
            this.f53613b = sequentialDisposable;
            this.f53614c = observableSource;
            this.f53615d = j;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53613b.m63458b(disposable);
        }

        public void onNext(T t) {
            this.f53612a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53612a.onError(th);
        }

        public void onComplete() {
            long j = this.f53615d;
            if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                this.f53615d = j - 1;
            }
            if (j != 0) {
                m63619a();
            } else {
                this.f53612a.onComplete();
            }
        }

        /* renamed from: a */
        void m63619a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f53613b.isDisposed()) {
                    this.f53614c.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public ObservableRepeat(C3959e<T> c3959e, long j) {
        super(c3959e);
        this.f58960b = j;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j = this.f58960b;
        long j2 = Format.OFFSET_SAMPLE_RELATIVE;
        if (j != Format.OFFSET_SAMPLE_RELATIVE) {
            j2 = this.f58960b - 1;
        }
        new RepeatObserver(observer, j2, sequentialDisposable, this.a).m63619a();
    }
}
