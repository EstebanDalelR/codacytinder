package io.reactivex.subjects;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleSubject<T> extends C3960g<T> implements SingleObserver<T> {
    /* renamed from: b */
    static final SingleDisposable[] f57421b = new SingleDisposable[0];
    /* renamed from: c */
    static final SingleDisposable[] f57422c = new SingleDisposable[0];
    /* renamed from: a */
    final AtomicReference<SingleDisposable<T>[]> f57423a = new AtomicReference(f57421b);
    /* renamed from: d */
    final AtomicBoolean f57424d = new AtomicBoolean();
    /* renamed from: e */
    T f57425e;
    /* renamed from: f */
    Throwable f57426f;

    static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        /* renamed from: a */
        final SingleObserver<? super T> f54169a;

        SingleDisposable(SingleObserver<? super T> singleObserver, SingleSubject<T> singleSubject) {
            this.f54169a = singleObserver;
            lazySet(singleSubject);
        }

        public void dispose() {
            SingleSubject singleSubject = (SingleSubject) getAndSet(null);
            if (singleSubject != null) {
                singleSubject.m66607b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    @CheckReturnValue
    @NonNull
    /* renamed from: f */
    public static <T> SingleSubject<T> m66604f() {
        return new SingleSubject();
    }

    SingleSubject() {
    }

    public void onSubscribe(@NonNull Disposable disposable) {
        if (this.f57423a.get() == f57422c) {
            disposable.dispose();
        }
    }

    public void onSuccess(@NonNull T t) {
        C15684a.m58895a((Object) t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.f57424d.compareAndSet(false, true)) {
            this.f57425e = t;
            SingleDisposable[] singleDisposableArr = (SingleDisposable[]) this.f57423a.getAndSet(f57422c);
            int length = singleDisposableArr.length;
            while (i < length) {
                singleDisposableArr[i].f54169a.onSuccess(t);
                i++;
            }
        }
    }

    public void onError(@NonNull Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        int i = 0;
        if (this.f57424d.compareAndSet(false, true)) {
            this.f57426f = th;
            SingleDisposable[] singleDisposableArr = (SingleDisposable[]) this.f57423a.getAndSet(f57422c);
            int length = singleDisposableArr.length;
            while (i < length) {
                singleDisposableArr[i].f54169a.onError(th);
                i++;
            }
            return;
        }
        C2667a.a(th);
    }

    /* renamed from: a */
    protected void m66605a(@NonNull SingleObserver<? super T> singleObserver) {
        SingleDisposable singleDisposable = new SingleDisposable(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        if (!m66606a(singleDisposable)) {
            Throwable th = this.f57426f;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.f57425e);
            }
        } else if (singleDisposable.isDisposed() != null) {
            m66607b(singleDisposable);
        }
    }

    /* renamed from: a */
    boolean m66606a(@NonNull SingleDisposable<T> singleDisposable) {
        SingleDisposable[] singleDisposableArr;
        Object obj;
        do {
            singleDisposableArr = (SingleDisposable[]) this.f57423a.get();
            if (singleDisposableArr == f57422c) {
                return false;
            }
            int length = singleDisposableArr.length;
            obj = new SingleDisposable[(length + 1)];
            System.arraycopy(singleDisposableArr, 0, obj, 0, length);
            obj[length] = singleDisposable;
        } while (!this.f57423a.compareAndSet(singleDisposableArr, obj));
        return true;
    }

    /* renamed from: b */
    void m66607b(@NonNull SingleDisposable<T> singleDisposable) {
        SingleDisposable[] singleDisposableArr;
        Object obj;
        do {
            singleDisposableArr = (SingleDisposable[]) this.f57423a.get();
            int length = singleDisposableArr.length;
            if (length != 0) {
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (singleDisposableArr[i2] == singleDisposable) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = f57421b;
                    } else {
                        Object obj2 = new SingleDisposable[(length - 1)];
                        System.arraycopy(singleDisposableArr, 0, obj2, 0, i);
                        System.arraycopy(singleDisposableArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            }
            return;
        } while (!this.f57423a.compareAndSet(singleDisposableArr, obj));
    }
}
