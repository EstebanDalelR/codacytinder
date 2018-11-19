package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableBuffer<T, U extends Collection<? super T>> extends C18394a<T, U> {
    /* renamed from: b */
    final int f58901b;
    /* renamed from: c */
    final int f58902c;
    /* renamed from: d */
    final Callable<U> f58903d;

    static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -8223395059921494546L;
        /* renamed from: a */
        final Observer<? super U> f53310a;
        /* renamed from: b */
        final int f53311b;
        /* renamed from: c */
        final int f53312c;
        /* renamed from: d */
        final Callable<U> f53313d;
        /* renamed from: e */
        Disposable f53314e;
        /* renamed from: f */
        final ArrayDeque<U> f53315f = new ArrayDeque();
        /* renamed from: g */
        long f53316g;

        BufferSkipObserver(Observer<? super U> observer, int i, int i2, Callable<U> callable) {
            this.f53310a = observer;
            this.f53311b = i;
            this.f53312c = i2;
            this.f53313d = callable;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53314e, disposable)) {
                this.f53314e = disposable;
                this.f53310a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53314e.dispose();
        }

        public boolean isDisposed() {
            return this.f53314e.isDisposed();
        }

        public void onNext(T t) {
            long j = this.f53316g;
            this.f53316g = j + 1;
            if (j % ((long) this.f53312c) == 0) {
                try {
                    this.f53315f.offer((Collection) C15684a.m58895a(this.f53313d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (T t2) {
                    this.f53315f.clear();
                    this.f53314e.dispose();
                    this.f53310a.onError(t2);
                    return;
                }
            }
            Iterator it = this.f53315f.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t2);
                if (this.f53311b <= collection.size()) {
                    it.remove();
                    this.f53310a.onNext(collection);
                }
            }
        }

        public void onError(Throwable th) {
            this.f53315f.clear();
            this.f53310a.onError(th);
        }

        public void onComplete() {
            while (!this.f53315f.isEmpty()) {
                this.f53310a.onNext(this.f53315f.poll());
            }
            this.f53310a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableBuffer$a */
    static final class C17424a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super U> f53317a;
        /* renamed from: b */
        final int f53318b;
        /* renamed from: c */
        final Callable<U> f53319c;
        /* renamed from: d */
        U f53320d;
        /* renamed from: e */
        int f53321e;
        /* renamed from: f */
        Disposable f53322f;

        C17424a(Observer<? super U> observer, int i, Callable<U> callable) {
            this.f53317a = observer;
            this.f53318b = i;
            this.f53319c = callable;
        }

        /* renamed from: a */
        boolean m63512a() {
            try {
                this.f53320d = (Collection) C15684a.m58895a(this.f53319c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                C15678a.m58850b(th);
                this.f53320d = null;
                if (this.f53322f == null) {
                    EmptyDisposable.error(th, this.f53317a);
                } else {
                    this.f53322f.dispose();
                    this.f53317a.onError(th);
                }
                return false;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53322f, disposable)) {
                this.f53322f = disposable;
                this.f53317a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53322f.dispose();
        }

        public boolean isDisposed() {
            return this.f53322f.isDisposed();
        }

        public void onNext(T t) {
            Collection collection = this.f53320d;
            if (collection != null) {
                collection.add(t);
                t = this.f53321e + 1;
                this.f53321e = t;
                if (t >= this.f53318b) {
                    this.f53317a.onNext(collection);
                    this.f53321e = null;
                    m63512a();
                }
            }
        }

        public void onError(Throwable th) {
            this.f53320d = null;
            this.f53317a.onError(th);
        }

        public void onComplete() {
            Collection collection = this.f53320d;
            this.f53320d = null;
            if (!(collection == null || collection.isEmpty())) {
                this.f53317a.onNext(collection);
            }
            this.f53317a.onComplete();
        }
    }

    public ObservableBuffer(ObservableSource<T> observableSource, int i, int i2, Callable<U> callable) {
        super(observableSource);
        this.f58901b = i;
        this.f58902c = i2;
        this.f58903d = callable;
    }

    protected void subscribeActual(Observer<? super U> observer) {
        if (this.f58902c == this.f58901b) {
            Observer c17424a = new C17424a(observer, this.f58901b, this.f58903d);
            if (c17424a.m63512a() != null) {
                this.a.subscribe(c17424a);
                return;
            }
            return;
        }
        this.a.subscribe(new BufferSkipObserver(observer, this.f58901b, this.f58902c, this.f58903d));
    }
}
