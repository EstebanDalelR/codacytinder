package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatten<T, R> extends C18385a<T, R> {
    /* renamed from: b */
    final Function<? super T, ? extends MaybeSource<? extends R>> f58889b;

    static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        /* renamed from: a */
        final MaybeObserver<? super R> f53259a;
        /* renamed from: b */
        final Function<? super T, ? extends MaybeSource<? extends R>> f53260b;
        /* renamed from: c */
        Disposable f53261c;

        /* renamed from: io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver$a */
        final class C17414a implements MaybeObserver<R> {
            /* renamed from: a */
            final /* synthetic */ FlatMapMaybeObserver f53258a;

            C17414a(FlatMapMaybeObserver flatMapMaybeObserver) {
                this.f53258a = flatMapMaybeObserver;
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f53258a, disposable);
            }

            public void onSuccess(R r) {
                this.f53258a.f53259a.onSuccess(r);
            }

            public void onError(Throwable th) {
                this.f53258a.f53259a.onError(th);
            }

            public void onComplete() {
                this.f53258a.f53259a.onComplete();
            }
        }

        FlatMapMaybeObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f53259a = maybeObserver;
            this.f53260b = function;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
            this.f53261c.dispose();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53261c, disposable)) {
                this.f53261c = disposable;
                this.f53259a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) C15684a.m58895a(this.f53260b.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    maybeSource.subscribe(new C17414a(this));
                }
            } catch (T t2) {
                C15678a.m58850b(t2);
                this.f53259a.onError(t2);
            }
        }

        public void onError(Throwable th) {
            this.f53259a.onError(th);
        }

        public void onComplete() {
            this.f53259a.onComplete();
        }
    }

    public MaybeFlatten(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        super(maybeSource);
        this.f58889b = function;
    }

    /* renamed from: a */
    protected void m67615a(MaybeObserver<? super R> maybeObserver) {
        this.a.subscribe(new FlatMapMaybeObserver(maybeObserver, this.f58889b));
    }
}
