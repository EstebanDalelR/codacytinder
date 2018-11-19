package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.internal.operators.observable.s */
public final class C19027s<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f59078b;
    /* renamed from: c */
    final TimeUnit f59079c;
    /* renamed from: d */
    final C15679f f59080d;
    /* renamed from: e */
    final boolean f59081e;

    /* renamed from: io.reactivex.internal.operators.observable.s$a */
    static final class C17498a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f54025a;
        /* renamed from: b */
        final long f54026b;
        /* renamed from: c */
        final TimeUnit f54027c;
        /* renamed from: d */
        final C17362c f54028d;
        /* renamed from: e */
        final boolean f54029e;
        /* renamed from: f */
        Disposable f54030f;

        /* renamed from: io.reactivex.internal.operators.observable.s$a$a */
        final class C15723a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C17498a f48617a;

            C15723a(C17498a c17498a) {
                this.f48617a = c17498a;
            }

            public void run() {
                try {
                    this.f48617a.f54025a.onComplete();
                } finally {
                    this.f48617a.f54028d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.s$a$b */
        final class C15724b implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C17498a f48618a;
            /* renamed from: b */
            private final Throwable f48619b;

            C15724b(C17498a c17498a, Throwable th) {
                this.f48618a = c17498a;
                this.f48619b = th;
            }

            public void run() {
                try {
                    this.f48618a.f54025a.onError(this.f48619b);
                } finally {
                    this.f48618a.f54028d.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.s$a$c */
        final class C15725c implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C17498a f48620a;
            /* renamed from: b */
            private final T f48621b;

            C15725c(C17498a c17498a, T t) {
                this.f48620a = c17498a;
                this.f48621b = t;
            }

            public void run() {
                this.f48620a.f54025a.onNext(this.f48621b);
            }
        }

        C17498a(Observer<? super T> observer, long j, TimeUnit timeUnit, C17362c c17362c, boolean z) {
            this.f54025a = observer;
            this.f54026b = j;
            this.f54027c = timeUnit;
            this.f54028d = c17362c;
            this.f54029e = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54030f, disposable)) {
                this.f54030f = disposable;
                this.f54025a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f54028d.mo13559a(new C15725c(this, t), this.f54026b, this.f54027c);
        }

        public void onError(Throwable th) {
            this.f54028d.mo13559a(new C15724b(this, th), this.f54029e != null ? this.f54026b : 0, this.f54027c);
        }

        public void onComplete() {
            this.f54028d.mo13559a(new C15723a(this), this.f54026b, this.f54027c);
        }

        public void dispose() {
            this.f54030f.dispose();
            this.f54028d.dispose();
        }

        public boolean isDisposed() {
            return this.f54028d.isDisposed();
        }
    }

    public C19027s(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        super(observableSource);
        this.f59078b = j;
        this.f59079c = timeUnit;
        this.f59080d = c15679f;
        this.f59081e = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Observer observer2;
        if (this.f59081e) {
            observer2 = observer;
        } else {
            observer2 = new C17530d(observer);
        }
        this.a.subscribe(new C17498a(observer2, this.f59078b, this.f59079c, this.f59080d.mo12872a(), this.f59081e));
    }
}
