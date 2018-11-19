package io.reactivex.internal.operators.observable;

import io.reactivex.C15675d;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.u */
public final class C19028u<T> extends C18394a<C15675d<T>, T> {

    /* renamed from: io.reactivex.internal.operators.observable.u$a */
    static final class C17501a<T> implements Observer<C15675d<T>>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f54036a;
        /* renamed from: b */
        boolean f54037b;
        /* renamed from: c */
        Disposable f54038c;

        public /* synthetic */ void onNext(Object obj) {
            m63711a((C15675d) obj);
        }

        C17501a(Observer<? super T> observer) {
            this.f54036a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54038c, disposable)) {
                this.f54038c = disposable;
                this.f54036a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f54038c.dispose();
        }

        public boolean isDisposed() {
            return this.f54038c.isDisposed();
        }

        /* renamed from: a */
        public void m63711a(C15675d<T> c15675d) {
            if (this.f54037b) {
                if (c15675d.m58835b()) {
                    C2667a.a(c15675d.m58838e());
                }
                return;
            }
            if (c15675d.m58835b()) {
                this.f54038c.dispose();
                onError(c15675d.m58838e());
            } else if (c15675d.m58834a()) {
                this.f54038c.dispose();
                onComplete();
            } else {
                this.f54036a.onNext(c15675d.m58837d());
            }
        }

        public void onError(Throwable th) {
            if (this.f54037b) {
                C2667a.a(th);
                return;
            }
            this.f54037b = true;
            this.f54036a.onError(th);
        }

        public void onComplete() {
            if (!this.f54037b) {
                this.f54037b = true;
                this.f54036a.onComplete();
            }
        }
    }

    public C19028u(ObservableSource<C15675d<T>> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17501a(observer));
    }
}
