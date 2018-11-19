package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.z */
public final class C19033z<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Consumer<? super T> f59087b;
    /* renamed from: c */
    final Consumer<? super Throwable> f59088c;
    /* renamed from: d */
    final Action f59089d;
    /* renamed from: e */
    final Action f59090e;

    /* renamed from: io.reactivex.internal.operators.observable.z$a */
    static final class C17503a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f54041a;
        /* renamed from: b */
        final Consumer<? super T> f54042b;
        /* renamed from: c */
        final Consumer<? super Throwable> f54043c;
        /* renamed from: d */
        final Action f54044d;
        /* renamed from: e */
        final Action f54045e;
        /* renamed from: f */
        Disposable f54046f;
        /* renamed from: g */
        boolean f54047g;

        C17503a(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            this.f54041a = observer;
            this.f54042b = consumer;
            this.f54043c = consumer2;
            this.f54044d = action;
            this.f54045e = action2;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54046f, disposable)) {
                this.f54046f = disposable;
                this.f54041a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f54046f.dispose();
        }

        public boolean isDisposed() {
            return this.f54046f.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f54047g) {
                try {
                    this.f54042b.accept(t);
                    this.f54041a.onNext(t);
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f54046f.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f54047g) {
                C2667a.a(th);
                return;
            }
            this.f54047g = true;
            try {
                this.f54043c.accept(th);
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                th = new CompositeException(th, th2);
            }
            this.f54041a.onError(th);
            try {
                this.f54045e.run();
            } catch (Throwable th3) {
                C15678a.m58850b(th3);
                C2667a.a(th3);
            }
        }

        public void onComplete() {
            if (!this.f54047g) {
                try {
                    this.f54044d.run();
                    this.f54047g = true;
                    this.f54041a.onComplete();
                    try {
                        this.f54045e.run();
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        C2667a.a(th);
                    }
                } catch (Throwable th2) {
                    C15678a.m58850b(th2);
                    onError(th2);
                }
            }
        }
    }

    public C19033z(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.f59087b = consumer;
        this.f59088c = consumer2;
        this.f59089d = action;
        this.f59090e = action2;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17503a(observer, this.f59087b, this.f59088c, this.f59089d, this.f59090e));
    }
}
