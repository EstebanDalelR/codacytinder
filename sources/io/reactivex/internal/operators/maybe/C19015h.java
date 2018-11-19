package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.maybe.h */
public final class C19015h<T> extends C18385a<T, T> {
    /* renamed from: b */
    final Consumer<? super Disposable> f58895b;
    /* renamed from: c */
    final Consumer<? super T> f58896c;
    /* renamed from: d */
    final Consumer<? super Throwable> f58897d;
    /* renamed from: e */
    final Action f58898e;
    /* renamed from: f */
    final Action f58899f;
    /* renamed from: g */
    final Action f58900g;

    /* renamed from: io.reactivex.internal.operators.maybe.h$a */
    static final class C17421a<T> implements MaybeObserver<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53292a;
        /* renamed from: b */
        final C19015h<T> f53293b;
        /* renamed from: c */
        Disposable f53294c;

        C17421a(MaybeObserver<? super T> maybeObserver, C19015h<T> c19015h) {
            this.f53292a = maybeObserver;
            this.f53293b = c19015h;
        }

        public void dispose() {
            try {
                this.f53293b.f58900g.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
            this.f53294c.dispose();
            this.f53294c = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f53294c.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53294c, disposable)) {
                try {
                    this.f53293b.f58895b.accept(disposable);
                    this.f53294c = disposable;
                    this.f53292a.onSubscribe(this);
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    disposable.dispose();
                    this.f53294c = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, this.f53292a);
                }
            }
        }

        public void onSuccess(T t) {
            if (this.f53294c != DisposableHelper.DISPOSED) {
                try {
                    this.f53293b.f58896c.accept(t);
                    this.f53294c = DisposableHelper.DISPOSED;
                    this.f53292a.onSuccess(t);
                    m63506a();
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    m63507a(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53294c == DisposableHelper.DISPOSED) {
                C2667a.a(th);
            } else {
                m63507a(th);
            }
        }

        /* renamed from: a */
        void m63507a(Throwable th) {
            try {
                this.f53293b.f58897d.accept(th);
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                th = new CompositeException(th, th2);
            }
            this.f53294c = DisposableHelper.DISPOSED;
            this.f53292a.onError(th);
            m63506a();
        }

        public void onComplete() {
            if (this.f53294c != DisposableHelper.DISPOSED) {
                try {
                    this.f53293b.f58898e.run();
                    this.f53294c = DisposableHelper.DISPOSED;
                    this.f53292a.onComplete();
                    m63506a();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    m63507a(th);
                }
            }
        }

        /* renamed from: a */
        void m63506a() {
            try {
                this.f53293b.f58899f.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
        }
    }

    public C19015h(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Action action3) {
        super(maybeSource);
        this.f58895b = consumer;
        this.f58896c = consumer2;
        this.f58897d = consumer3;
        this.f58898e = action;
        this.f58899f = action2;
        this.f58900g = action3;
    }

    /* renamed from: a */
    protected void m67621a(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(new C17421a(maybeObserver, this));
    }
}
