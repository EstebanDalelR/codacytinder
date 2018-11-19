package io.reactivex.internal.operators.completable;

import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.operators.completable.a */
public final class C18346a extends C3956a {
    /* renamed from: a */
    final CompletableSource f56817a;
    /* renamed from: b */
    final long f56818b;
    /* renamed from: c */
    final TimeUnit f56819c;
    /* renamed from: d */
    final C15679f f56820d;
    /* renamed from: e */
    final boolean f56821e;

    /* renamed from: io.reactivex.internal.operators.completable.a$a */
    final class C17397a implements CompletableObserver {
        /* renamed from: a */
        final CompletableObserver f53193a;
        /* renamed from: b */
        final /* synthetic */ C18346a f53194b;
        /* renamed from: c */
        private final C17356a f53195c;

        /* renamed from: io.reactivex.internal.operators.completable.a$a$a */
        final class C15686a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C17397a f48552a;

            C15686a(C17397a c17397a) {
                this.f48552a = c17397a;
            }

            public void run() {
                this.f48552a.f53193a.onComplete();
            }
        }

        /* renamed from: io.reactivex.internal.operators.completable.a$a$b */
        final class C15687b implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C17397a f48553a;
            /* renamed from: b */
            private final Throwable f48554b;

            C15687b(C17397a c17397a, Throwable th) {
                this.f48553a = c17397a;
                this.f48554b = th;
            }

            public void run() {
                this.f48553a.f53193a.onError(this.f48554b);
            }
        }

        C17397a(C18346a c18346a, C17356a c17356a, CompletableObserver completableObserver) {
            this.f53194b = c18346a;
            this.f53195c = c17356a;
            this.f53193a = completableObserver;
        }

        public void onComplete() {
            this.f53195c.add(this.f53194b.f56820d.mo12871a(new C15686a(this), this.f53194b.f56818b, this.f53194b.f56819c));
        }

        public void onError(Throwable th) {
            this.f53195c.add(this.f53194b.f56820d.mo12871a(new C15687b(this, th), this.f53194b.f56821e != null ? this.f53194b.f56818b : 0, this.f53194b.f56819c));
        }

        public void onSubscribe(Disposable disposable) {
            this.f53195c.add(disposable);
            this.f53193a.onSubscribe(this.f53195c);
        }
    }

    public C18346a(CompletableSource completableSource, long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        this.f56817a = completableSource;
        this.f56818b = j;
        this.f56819c = timeUnit;
        this.f56820d = c15679f;
        this.f56821e = z;
    }

    /* renamed from: a */
    protected void m66389a(CompletableObserver completableObserver) {
        this.f56817a.subscribe(new C17397a(this, new C17356a(), completableObserver));
    }
}
