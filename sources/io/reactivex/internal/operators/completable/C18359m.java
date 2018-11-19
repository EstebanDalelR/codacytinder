package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;

/* renamed from: io.reactivex.internal.operators.completable.m */
public final class C18359m extends C3956a {
    /* renamed from: a */
    final CompletableSource f56842a;
    /* renamed from: b */
    final Function<? super Throwable, ? extends CompletableSource> f56843b;

    /* renamed from: io.reactivex.internal.operators.completable.m$a */
    final class C17404a implements CompletableObserver {
        /* renamed from: a */
        final CompletableObserver f53208a;
        /* renamed from: b */
        final SequentialDisposable f53209b;
        /* renamed from: c */
        final /* synthetic */ C18359m f53210c;

        /* renamed from: io.reactivex.internal.operators.completable.m$a$a */
        final class C17403a implements CompletableObserver {
            /* renamed from: a */
            final /* synthetic */ C17404a f53207a;

            C17403a(C17404a c17404a) {
                this.f53207a = c17404a;
            }

            public void onComplete() {
                this.f53207a.f53208a.onComplete();
            }

            public void onError(Throwable th) {
                this.f53207a.f53208a.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                this.f53207a.f53209b.m63457a(disposable);
            }
        }

        C17404a(C18359m c18359m, CompletableObserver completableObserver, SequentialDisposable sequentialDisposable) {
            this.f53210c = c18359m;
            this.f53208a = completableObserver;
            this.f53209b = sequentialDisposable;
        }

        public void onComplete() {
            this.f53208a.onComplete();
        }

        public void onError(Throwable th) {
            Throwable nullPointerException;
            try {
                CompletableSource completableSource = (CompletableSource) this.f53210c.f56843b.apply(th);
                if (completableSource == null) {
                    nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                    nullPointerException.initCause(th);
                    this.f53208a.onError(nullPointerException);
                    return;
                }
                completableSource.subscribe(new C17403a(this));
            } catch (Throwable nullPointerException2) {
                C15678a.m58850b(nullPointerException2);
                this.f53208a.onError(new CompositeException(nullPointerException2, th));
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f53209b.m63457a(disposable);
        }
    }

    public C18359m(CompletableSource completableSource, Function<? super Throwable, ? extends CompletableSource> function) {
        this.f56842a = completableSource;
        this.f56843b = function;
    }

    /* renamed from: a */
    protected void m66401a(CompletableObserver completableObserver) {
        Object sequentialDisposable = new SequentialDisposable();
        completableObserver.onSubscribe(sequentialDisposable);
        this.f56842a.subscribe(new C17404a(this, completableObserver, sequentialDisposable));
    }
}
