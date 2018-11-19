package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements CompletableObserver, MaybeObserver<T>, Observer<T>, SingleObserver<T>, Disposable {
    /* renamed from: i */
    private final Observer<? super T> f57410i;
    /* renamed from: j */
    private final AtomicReference<Disposable> f57411j;
    /* renamed from: k */
    private QueueDisposable<T> f57412k;

    enum EmptyObserver implements Observer<Object> {
        INSTANCE;

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }

        public void onSubscribe(Disposable disposable) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public TestObserver(Observer<? super T> observer) {
        this.f57411j = new AtomicReference();
        this.f57410i = observer;
    }

    public void onSubscribe(Disposable disposable) {
        this.e = Thread.currentThread();
        if (disposable == null) {
            this.c.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (this.f57411j.compareAndSet(null, disposable)) {
            if (this.g != 0 && (disposable instanceof QueueDisposable)) {
                this.f57412k = (QueueDisposable) disposable;
                int requestFusion = this.f57412k.requestFusion(this.g);
                this.h = requestFusion;
                if (requestFusion == 1) {
                    this.f = true;
                    this.e = Thread.currentThread();
                    while (true) {
                        try {
                            disposable = this.f57412k.poll();
                            if (disposable == null) {
                                break;
                            }
                            this.b.add(disposable);
                        } catch (Disposable disposable2) {
                            this.c.add(disposable2);
                        }
                    }
                    this.d++;
                    this.f57411j.lazySet(DisposableHelper.DISPOSED);
                    return;
                }
            }
            this.f57410i.onSubscribe(disposable2);
        } else {
            disposable2.dispose();
            if (this.f57411j.get() != DisposableHelper.DISPOSED) {
                List list = this.c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onSubscribe received multiple subscriptions: ");
                stringBuilder.append(disposable2);
                list.add(new IllegalStateException(stringBuilder.toString()));
            }
        }
    }

    public void onNext(T t) {
        if (!this.f) {
            this.f = true;
            if (this.f57411j.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.e = Thread.currentThread();
        if (this.h == 2) {
            while (true) {
                try {
                    t = this.f57412k.poll();
                    if (t == null) {
                        break;
                    }
                    this.b.add(t);
                } catch (T t2) {
                    this.c.add(t2);
                    this.f57412k.dispose();
                }
            }
            return;
        }
        this.b.add(t2);
        if (t2 == null) {
            this.c.add(new NullPointerException("onNext received a null value"));
        }
        this.f57410i.onNext(t2);
    }

    public void onError(Throwable th) {
        if (!this.f) {
            this.f = true;
            if (this.f57411j.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.e = Thread.currentThread();
            if (th == null) {
                this.c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.c.add(th);
            }
            this.f57410i.onError(th);
        } finally {
            this.a.countDown();
        }
    }

    public void onComplete() {
        if (!this.f) {
            this.f = true;
            if (this.f57411j.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.e = Thread.currentThread();
            this.d++;
            this.f57410i.onComplete();
        } finally {
            this.a.countDown();
        }
    }

    public final void dispose() {
        DisposableHelper.dispose(this.f57411j);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) this.f57411j.get());
    }

    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }
}
