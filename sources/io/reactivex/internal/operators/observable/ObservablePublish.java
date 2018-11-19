package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.p079d.C2667a;
import io.reactivex.p491c.C18340a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublish<T> extends C18340a<T> implements HasUpstreamObservableSource<T> {
    /* renamed from: a */
    final ObservableSource<T> f58952a;
    /* renamed from: b */
    final AtomicReference<C17439a<T>> f58953b;
    /* renamed from: c */
    final ObservableSource<T> f58954c;

    static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        /* renamed from: a */
        final Observer<? super T> f53593a;

        InnerDisposable(Observer<? super T> observer) {
            this.f53593a = observer;
        }

        public boolean isDisposed() {
            return get() == this;
        }

        public void dispose() {
            InnerDisposable andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C17439a) andSet).m63616b(this);
            }
        }

        /* renamed from: a */
        void m63614a(C17439a<T> c17439a) {
            if (!compareAndSet(null, c17439a)) {
                c17439a.m63616b(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$a */
    static final class C17439a<T> implements Observer<T>, Disposable {
        /* renamed from: b */
        static final InnerDisposable[] f53594b = new InnerDisposable[0];
        /* renamed from: c */
        static final InnerDisposable[] f53595c = new InnerDisposable[0];
        /* renamed from: a */
        final AtomicReference<C17439a<T>> f53596a;
        /* renamed from: d */
        final AtomicReference<InnerDisposable<T>[]> f53597d = new AtomicReference(f53594b);
        /* renamed from: e */
        final AtomicBoolean f53598e;
        /* renamed from: f */
        final AtomicReference<Disposable> f53599f = new AtomicReference();

        C17439a(AtomicReference<C17439a<T>> atomicReference) {
            this.f53596a = atomicReference;
            this.f53598e = new AtomicBoolean();
        }

        public void dispose() {
            if (this.f53597d.get() != f53595c && ((InnerDisposable[]) this.f53597d.getAndSet(f53595c)) != f53595c) {
                this.f53596a.compareAndSet(this, null);
                DisposableHelper.dispose(this.f53599f);
            }
        }

        public boolean isDisposed() {
            return this.f53597d.get() == f53595c;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53599f, disposable);
        }

        public void onNext(T t) {
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f53597d.get()) {
                innerDisposable.f53593a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f53596a.compareAndSet(this, null);
            InnerDisposable[] innerDisposableArr = (InnerDisposable[]) this.f53597d.getAndSet(f53595c);
            if (innerDisposableArr.length != 0) {
                for (InnerDisposable innerDisposable : innerDisposableArr) {
                    innerDisposable.f53593a.onError(th);
                }
                return;
            }
            C2667a.a(th);
        }

        public void onComplete() {
            this.f53596a.compareAndSet(this, null);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.f53597d.getAndSet(f53595c)) {
                innerDisposable.f53593a.onComplete();
            }
        }

        /* renamed from: a */
        boolean m63615a(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            Object obj;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f53597d.get();
                if (innerDisposableArr == f53595c) {
                    return false;
                }
                int length = innerDisposableArr.length;
                obj = new InnerDisposable[(length + 1)];
                System.arraycopy(innerDisposableArr, 0, obj, 0, length);
                obj[length] = innerDisposable;
            } while (!this.f53597d.compareAndSet(innerDisposableArr, obj));
            return true;
        }

        /* renamed from: b */
        void m63616b(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            Object obj;
            do {
                innerDisposableArr = (InnerDisposable[]) this.f53597d.get();
                int length = innerDisposableArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (innerDisposableArr[i2].equals(innerDisposable)) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f53594b;
                        } else {
                            Object obj2 = new InnerDisposable[(length - 1)];
                            System.arraycopy(innerDisposableArr, 0, obj2, 0, i);
                            System.arraycopy(innerDisposableArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.f53597d.compareAndSet(innerDisposableArr, obj));
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublish$b */
    static final class C17440b<T> implements ObservableSource<T> {
        /* renamed from: a */
        private final AtomicReference<C17439a<T>> f53600a;

        C17440b(AtomicReference<C17439a<T>> atomicReference) {
            this.f53600a = atomicReference;
        }

        public void subscribe(Observer<? super T> observer) {
            InnerDisposable innerDisposable = new InnerDisposable(observer);
            observer.onSubscribe(innerDisposable);
            while (true) {
                observer = (C17439a) this.f53600a.get();
                if (observer == null || observer.isDisposed()) {
                    C17439a c17439a = new C17439a(this.f53600a);
                    if (this.f53600a.compareAndSet(observer, c17439a) != null) {
                        observer = c17439a;
                    }
                }
                if (observer.m63615a(innerDisposable)) {
                    innerDisposable.m63614a(observer);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T> C18340a<T> m67629a(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return C2667a.a(new ObservablePublish(new C17440b(atomicReference), observableSource, atomicReference));
    }

    private ObservablePublish(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C17439a<T>> atomicReference) {
        this.f58954c = observableSource;
        this.f58952a = observableSource2;
        this.f58953b = atomicReference;
    }

    public ObservableSource<T> source() {
        return this.f58952a;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f58954c.subscribe(observer);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo14001a(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.f58953b;
        r0 = r0.get();
        r0 = (io.reactivex.internal.operators.observable.ObservablePublish.C17439a) r0;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r1 = r0.isDisposed();
        if (r1 == 0) goto L_0x0021;
    L_0x0010:
        r1 = new io.reactivex.internal.operators.observable.ObservablePublish$a;
        r2 = r4.f58953b;
        r1.<init>(r2);
        r2 = r4.f58953b;
        r0 = r2.compareAndSet(r0, r1);
        if (r0 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0000;
    L_0x0020:
        r0 = r1;
    L_0x0021:
        r1 = r0.f53598e;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0034;
    L_0x002b:
        r1 = r0.f53598e;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0035;
    L_0x0034:
        r2 = 0;
    L_0x0035:
        r5.accept(r0);	 Catch:{ Throwable -> 0x0040 }
        if (r2 == 0) goto L_0x003f;
    L_0x003a:
        r5 = r4.f58952a;
        r5.subscribe(r0);
    L_0x003f:
        return;
    L_0x0040:
        r5 = move-exception;
        io.reactivex.exceptions.C15678a.m58850b(r5);
        r5 = io.reactivex.internal.util.ExceptionHelper.m58962a(r5);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservablePublish.a(io.reactivex.functions.Consumer):void");
    }
}
