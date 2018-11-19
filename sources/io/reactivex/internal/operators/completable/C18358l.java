package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.completable.l */
public final class C18358l extends C3956a {
    /* renamed from: a */
    final CompletableSource f56835a;
    /* renamed from: b */
    final Consumer<? super Disposable> f56836b;
    /* renamed from: c */
    final Consumer<? super Throwable> f56837c;
    /* renamed from: d */
    final Action f56838d;
    /* renamed from: e */
    final Action f56839e;
    /* renamed from: f */
    final Action f56840f;
    /* renamed from: g */
    final Action f56841g;

    /* renamed from: io.reactivex.internal.operators.completable.l$a */
    final class C17402a implements CompletableObserver, Disposable {
        /* renamed from: a */
        final CompletableObserver f53204a;
        /* renamed from: b */
        Disposable f53205b;
        /* renamed from: c */
        final /* synthetic */ C18358l f53206c;

        C17402a(C18358l c18358l, CompletableObserver completableObserver) {
            this.f53206c = c18358l;
            this.f53204a = completableObserver;
        }

        public void onSubscribe(Disposable disposable) {
            try {
                this.f53206c.f56836b.accept(disposable);
                if (DisposableHelper.validate(this.f53205b, disposable)) {
                    this.f53205b = disposable;
                    this.f53204a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                disposable.dispose();
                this.f53205b = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.f53204a);
            }
        }

        public void onError(Throwable th) {
            if (this.f53205b == DisposableHelper.DISPOSED) {
                C2667a.a(th);
                return;
            }
            try {
                this.f53206c.f56837c.accept(th);
                this.f53206c.f56839e.run();
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                th = new CompositeException(th, th2);
            }
            this.f53204a.onError(th);
            m63489a();
        }

        public void onComplete() {
            if (this.f53205b != DisposableHelper.DISPOSED) {
                try {
                    this.f53206c.f56838d.run();
                    this.f53206c.f56839e.run();
                    this.f53204a.onComplete();
                    m63489a();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.f53204a.onError(th);
                }
            }
        }

        /* renamed from: a */
        void m63489a() {
            try {
                this.f53206c.f56840f.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
        }

        public void dispose() {
            try {
                this.f53206c.f56841g.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
            this.f53205b.dispose();
        }

        public boolean isDisposed() {
            return this.f53205b.isDisposed();
        }
    }

    public C18358l(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        this.f56835a = completableSource;
        this.f56836b = consumer;
        this.f56837c = consumer2;
        this.f56838d = action;
        this.f56839e = action2;
        this.f56840f = action3;
        this.f56841g = action4;
    }

    /* renamed from: a */
    protected void m66400a(CompletableObserver completableObserver) {
        this.f56835a.subscribe(new C17402a(this, completableObserver));
    }
}
