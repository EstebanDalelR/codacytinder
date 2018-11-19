package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.single.b */
public final class C18413b<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57329a;
    /* renamed from: b */
    final Action f57330b;

    /* renamed from: io.reactivex.internal.operators.single.b$a */
    static final class C17506a<T> implements SingleObserver<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f54078a;
        /* renamed from: b */
        final Action f54079b;
        /* renamed from: c */
        Disposable f54080c;

        C17506a(SingleObserver<? super T> singleObserver, Action action) {
            this.f54078a = singleObserver;
            this.f54079b = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54080c, disposable)) {
                this.f54080c = disposable;
                this.f54078a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f54078a.onSuccess(t);
            m63718a();
        }

        public void onError(Throwable th) {
            this.f54078a.onError(th);
            m63718a();
        }

        public void dispose() {
            this.f54080c.dispose();
        }

        public boolean isDisposed() {
            return this.f54080c.isDisposed();
        }

        /* renamed from: a */
        private void m63718a() {
            try {
                this.f54079b.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
        }
    }

    public C18413b(SingleSource<T> singleSource, Action action) {
        this.f57329a = singleSource;
        this.f57330b = action;
    }

    /* renamed from: a */
    protected void m66541a(SingleObserver<? super T> singleObserver) {
        this.f57329a.subscribe(new C17506a(singleObserver, this.f57330b));
    }
}
