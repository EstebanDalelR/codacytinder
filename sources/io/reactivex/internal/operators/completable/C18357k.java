package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;

/* renamed from: io.reactivex.internal.operators.completable.k */
public final class C18357k extends C3956a {
    /* renamed from: a */
    final CompletableSource f56833a;
    /* renamed from: b */
    final Predicate<? super Throwable> f56834b;

    /* renamed from: io.reactivex.internal.operators.completable.k$a */
    final class C17401a implements CompletableObserver {
        /* renamed from: a */
        final /* synthetic */ C18357k f53202a;
        /* renamed from: b */
        private final CompletableObserver f53203b;

        C17401a(C18357k c18357k, CompletableObserver completableObserver) {
            this.f53202a = c18357k;
            this.f53203b = completableObserver;
        }

        public void onComplete() {
            this.f53203b.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (this.f53202a.f56834b.test(th)) {
                    this.f53203b.onComplete();
                } else {
                    this.f53203b.onError(th);
                }
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                this.f53203b.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f53203b.onSubscribe(disposable);
        }
    }

    public C18357k(CompletableSource completableSource, Predicate<? super Throwable> predicate) {
        this.f56833a = completableSource;
        this.f56834b = predicate;
    }

    /* renamed from: a */
    protected void m66399a(CompletableObserver completableObserver) {
        this.f56833a.subscribe(new C17401a(this, completableObserver));
    }
}
