package io.reactivex.internal.operators.maybe;

import io.reactivex.C15679f;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeSubscribeOn<T> extends C18385a<T, T> {
    /* renamed from: b */
    final C15679f f58891b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeSubscribeOn$a */
    static final class C15697a<T> implements Runnable {
        /* renamed from: a */
        final MaybeObserver<? super T> f48566a;
        /* renamed from: b */
        final MaybeSource<T> f48567b;

        C15697a(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f48566a = maybeObserver;
            this.f48567b = maybeSource;
        }

        public void run() {
            this.f48567b.subscribe(this.f48566a);
        }
    }

    static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 8571289934935992137L;
        /* renamed from: a */
        final SequentialDisposable f53266a = new SequentialDisposable();
        /* renamed from: b */
        final MaybeObserver<? super T> f53267b;

        SubscribeOnMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.f53267b = maybeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.f53266a.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.f53267b.onSuccess(t);
        }

        public void onError(Throwable th) {
            this.f53267b.onError(th);
        }

        public void onComplete() {
            this.f53267b.onComplete();
        }
    }

    public MaybeSubscribeOn(MaybeSource<T> maybeSource, C15679f c15679f) {
        super(maybeSource);
        this.f58891b = c15679f;
    }

    /* renamed from: a */
    protected void m67617a(MaybeObserver<? super T> maybeObserver) {
        MaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(subscribeOnMaybeObserver);
        subscribeOnMaybeObserver.f53266a.m63458b(this.f58891b.mo12918a(new C15697a(subscribeOnMaybeObserver, this.a)));
    }
}
