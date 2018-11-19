package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublishSelector<T, R> extends C18394a<T, R> {
    /* renamed from: b */
    final Function<? super C3959e<T>, ? extends ObservableSource<R>> f58955b;

    static final class TargetObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, Disposable {
        private static final long serialVersionUID = 854110278590336484L;
        /* renamed from: a */
        final Observer<? super R> f53601a;
        /* renamed from: b */
        Disposable f53602b;

        TargetObserver(Observer<? super R> observer) {
            this.f53601a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53602b, disposable)) {
                this.f53602b = disposable;
                this.f53601a.onSubscribe(this);
            }
        }

        public void onNext(R r) {
            this.f53601a.onNext(r);
        }

        public void onError(Throwable th) {
            DisposableHelper.dispose(this);
            this.f53601a.onError(th);
        }

        public void onComplete() {
            DisposableHelper.dispose(this);
            this.f53601a.onComplete();
        }

        public void dispose() {
            this.f53602b.dispose();
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return this.f53602b.isDisposed();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservablePublishSelector$a */
    static final class C17441a<T, R> implements Observer<T> {
        /* renamed from: a */
        final PublishSubject<T> f53603a;
        /* renamed from: b */
        final AtomicReference<Disposable> f53604b;

        C17441a(PublishSubject<T> publishSubject, AtomicReference<Disposable> atomicReference) {
            this.f53603a = publishSubject;
            this.f53604b = atomicReference;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53604b, disposable);
        }

        public void onNext(T t) {
            this.f53603a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53603a.onError(th);
        }

        public void onComplete() {
            this.f53603a.onComplete();
        }
    }

    public ObservablePublishSelector(ObservableSource<T> observableSource, Function<? super C3959e<T>, ? extends ObservableSource<R>> function) {
        super(observableSource);
        this.f58955b = function;
    }

    protected void subscribeActual(Observer<? super R> observer) {
        PublishSubject a = PublishSubject.m67682a();
        try {
            ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f58955b.apply(a), "The selector returned a null ObservableSource");
            Object targetObserver = new TargetObserver(observer);
            observableSource.subscribe(targetObserver);
            this.a.subscribe(new C17441a(a, targetObserver));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
