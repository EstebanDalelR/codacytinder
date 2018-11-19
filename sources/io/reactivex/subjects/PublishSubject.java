package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class PublishSubject<T> extends C18432c<T> {
    /* renamed from: a */
    static final PublishDisposable[] f59136a = new PublishDisposable[0];
    /* renamed from: b */
    static final PublishDisposable[] f59137b = new PublishDisposable[0];
    /* renamed from: c */
    final AtomicReference<PublishDisposable<T>[]> f59138c = new AtomicReference(f59137b);
    /* renamed from: d */
    Throwable f59139d;

    static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        /* renamed from: a */
        final Observer<? super T> f54167a;
        /* renamed from: b */
        final PublishSubject<T> f54168b;

        PublishDisposable(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.f54167a = observer;
            this.f54168b = publishSubject;
        }

        /* renamed from: a */
        public void m63764a(T t) {
            if (!get()) {
                this.f54167a.onNext(t);
            }
        }

        /* renamed from: a */
        public void m63765a(Throwable th) {
            if (get()) {
                C2667a.a(th);
            } else {
                this.f54167a.onError(th);
            }
        }

        /* renamed from: a */
        public void m63763a() {
            if (!get()) {
                this.f54167a.onComplete();
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f54168b.m67684b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    @CheckReturnValue
    /* renamed from: a */
    public static <T> PublishSubject<T> m67682a() {
        return new PublishSubject();
    }

    PublishSubject() {
    }

    public void subscribeActual(Observer<? super T> observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        if (!m67683a(publishDisposable)) {
            Throwable th = this.f59139d;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        } else if (publishDisposable.isDisposed() != null) {
            m67684b(publishDisposable);
        }
    }

    /* renamed from: a */
    boolean m67683a(PublishDisposable<T> publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        Object obj;
        do {
            publishDisposableArr = (PublishDisposable[]) this.f59138c.get();
            if (publishDisposableArr == f59136a) {
                return false;
            }
            int length = publishDisposableArr.length;
            obj = new PublishDisposable[(length + 1)];
            System.arraycopy(publishDisposableArr, 0, obj, 0, length);
            obj[length] = publishDisposable;
        } while (!this.f59138c.compareAndSet(publishDisposableArr, obj));
        return true;
    }

    /* renamed from: b */
    void m67684b(PublishDisposable<T> publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        Object obj;
        do {
            publishDisposableArr = (PublishDisposable[]) this.f59138c.get();
            if (publishDisposableArr != f59136a) {
                if (publishDisposableArr != f59137b) {
                    int length = publishDisposableArr.length;
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (publishDisposableArr[i2] == publishDisposable) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f59137b;
                        } else {
                            Object obj2 = new PublishDisposable[(length - 1)];
                            System.arraycopy(publishDisposableArr, 0, obj2, 0, i);
                            System.arraycopy(publishDisposableArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        } while (!this.f59138c.compareAndSet(publishDisposableArr, obj));
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f59138c.get() == f59136a) {
            disposable.dispose();
        }
    }

    public void onNext(T t) {
        C15684a.m58895a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59138c.get() != f59136a) {
            for (PublishDisposable a : (PublishDisposable[]) this.f59138c.get()) {
                a.m63764a((Object) t);
            }
        }
    }

    public void onError(Throwable th) {
        C15684a.m58895a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f59138c.get() == f59136a) {
            C2667a.a(th);
            return;
        }
        this.f59139d = th;
        for (PublishDisposable a : (PublishDisposable[]) this.f59138c.getAndSet(f59136a)) {
            a.m63765a(th);
        }
    }

    public void onComplete() {
        if (this.f59138c.get() != f59136a) {
            for (PublishDisposable a : (PublishDisposable[]) this.f59138c.getAndSet(f59136a)) {
                a.m63763a();
            }
        }
    }
}
