package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCreate<T> extends C3959e<T> {
    /* renamed from: a */
    final ObservableOnSubscribe<T> f57177a;

    static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        /* renamed from: a */
        final Observer<? super T> f57172a;

        CreateEmitter(Observer<? super T> observer) {
            this.f57172a = observer;
        }

        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!isDisposed()) {
                this.f57172a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C2667a.a(th);
            }
        }

        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return null;
            }
            try {
                this.f57172a.onError(th);
                return true;
            } finally {
                dispose();
            }
        }

        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.f57172a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        public void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        public ObservableEmitter<T> serialize() {
            return new SerializedEmitter(this);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    static final class SerializedEmitter<T> extends AtomicInteger implements ObservableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        /* renamed from: a */
        final ObservableEmitter<T> f57173a;
        /* renamed from: b */
        final AtomicThrowable f57174b = new AtomicThrowable();
        /* renamed from: c */
        final C18423a<T> f57175c = new C18423a(16);
        /* renamed from: d */
        volatile boolean f57176d;

        public ObservableEmitter<T> serialize() {
            return this;
        }

        SerializedEmitter(ObservableEmitter<T> observableEmitter) {
            this.f57173a = observableEmitter;
        }

        public void onNext(T t) {
            if (!this.f57173a.isDisposed()) {
                if (!this.f57176d) {
                    if (t == null) {
                        onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f57173a.onNext(t);
                        if (decrementAndGet() == null) {
                            return;
                        }
                    }
                    SimpleQueue simpleQueue = this.f57175c;
                    synchronized (simpleQueue) {
                        simpleQueue.offer(t);
                    }
                    if (getAndIncrement() != null) {
                        return;
                    }
                    m66491b();
                }
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C2667a.a(th);
            }
        }

        public boolean tryOnError(Throwable th) {
            if (!this.f57173a.isDisposed()) {
                if (!this.f57176d) {
                    if (th == null) {
                        th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                    }
                    if (this.f57174b.m58961a(th) == null) {
                        return false;
                    }
                    this.f57176d = true;
                    m66490a();
                    return true;
                }
            }
            return false;
        }

        public void onComplete() {
            if (!this.f57173a.isDisposed()) {
                if (!this.f57176d) {
                    this.f57176d = true;
                    m66490a();
                }
            }
        }

        /* renamed from: a */
        void m66490a() {
            if (getAndIncrement() == 0) {
                m66491b();
            }
        }

        /* renamed from: b */
        void m66491b() {
            ObservableEmitter observableEmitter = this.f57173a;
            C18423a c18423a = this.f57175c;
            AtomicThrowable atomicThrowable = this.f57174b;
            int i = 1;
            while (!observableEmitter.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    c18423a.clear();
                    observableEmitter.onError(atomicThrowable.m58960a());
                    return;
                }
                boolean z = this.f57176d;
                Object poll = c18423a.poll();
                Object obj = poll == null ? 1 : null;
                if (z && obj != null) {
                    observableEmitter.onComplete();
                    return;
                } else if (obj != null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    observableEmitter.onNext(poll);
                }
            }
            c18423a.clear();
        }

        public void setDisposable(Disposable disposable) {
            this.f57173a.setDisposable(disposable);
        }

        public void setCancellable(Cancellable cancellable) {
            this.f57173a.setCancellable(cancellable);
        }

        public boolean isDisposed() {
            return this.f57173a.isDisposed();
        }
    }

    public ObservableCreate(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.f57177a = observableOnSubscribe;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            this.f57177a.subscribe(createEmitter);
        } catch (Observer<? super T> observer2) {
            C15678a.m58850b(observer2);
            createEmitter.onError(observer2);
        }
    }
}
