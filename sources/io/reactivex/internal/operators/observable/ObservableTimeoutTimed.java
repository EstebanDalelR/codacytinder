package io.reactivex.internal.operators.observable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.C19000e;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.C17392h;
import io.reactivex.observers.C17530d;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableTimeoutTimed<T> extends C18394a<T, T> {
    /* renamed from: f */
    static final Disposable f59006f = new C17452a();
    /* renamed from: b */
    final long f59007b;
    /* renamed from: c */
    final TimeUnit f59008c;
    /* renamed from: d */
    final C15679f f59009d;
    /* renamed from: e */
    final ObservableSource<? extends T> f59010e;

    static final class TimeoutTimedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -8387234228317808253L;
        /* renamed from: a */
        final Observer<? super T> f53778a;
        /* renamed from: b */
        final long f53779b;
        /* renamed from: c */
        final TimeUnit f53780c;
        /* renamed from: d */
        final C17362c f53781d;
        /* renamed from: e */
        Disposable f53782e;
        /* renamed from: f */
        volatile long f53783f;
        /* renamed from: g */
        volatile boolean f53784g;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedObserver$a */
        final class C15708a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ TimeoutTimedObserver f48587a;
            /* renamed from: b */
            private final long f48588b;

            C15708a(TimeoutTimedObserver timeoutTimedObserver, long j) {
                this.f48587a = timeoutTimedObserver;
                this.f48588b = j;
            }

            public void run() {
                if (this.f48588b == this.f48587a.f53783f) {
                    this.f48587a.f53784g = true;
                    this.f48587a.f53782e.dispose();
                    DisposableHelper.dispose(this.f48587a);
                    this.f48587a.f53778a.onError(new TimeoutException());
                    this.f48587a.f53781d.dispose();
                }
            }
        }

        TimeoutTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C17362c c17362c) {
            this.f53778a = observer;
            this.f53779b = j;
            this.f53780c = timeUnit;
            this.f53781d = c17362c;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53782e, disposable)) {
                this.f53782e = disposable;
                this.f53778a.onSubscribe(this);
                m63685a(0);
            }
        }

        public void onNext(T t) {
            if (!this.f53784g) {
                long j = this.f53783f + 1;
                this.f53783f = j;
                this.f53778a.onNext(t);
                m63685a(j);
            }
        }

        /* renamed from: a */
        void m63685a(long j) {
            Disposable disposable = (Disposable) get();
            if (disposable != null) {
                disposable.dispose();
            }
            if (compareAndSet(disposable, ObservableTimeoutTimed.f59006f)) {
                DisposableHelper.replace(this, this.f53781d.mo13559a(new C15708a(this, j), this.f53779b, this.f53780c));
            }
        }

        public void onError(Throwable th) {
            if (this.f53784g) {
                C2667a.a(th);
                return;
            }
            this.f53784g = true;
            this.f53778a.onError(th);
            dispose();
        }

        public void onComplete() {
            if (!this.f53784g) {
                this.f53784g = true;
                this.f53778a.onComplete();
                dispose();
            }
        }

        public void dispose() {
            this.f53782e.dispose();
            this.f53781d.dispose();
        }

        public boolean isDisposed() {
            return this.f53781d.isDisposed();
        }
    }

    static final class TimeoutTimedOtherObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -4619702551964128179L;
        /* renamed from: a */
        final Observer<? super T> f53785a;
        /* renamed from: b */
        final long f53786b;
        /* renamed from: c */
        final TimeUnit f53787c;
        /* renamed from: d */
        final C17362c f53788d;
        /* renamed from: e */
        final ObservableSource<? extends T> f53789e;
        /* renamed from: f */
        Disposable f53790f;
        /* renamed from: g */
        final C19000e<T> f53791g;
        /* renamed from: h */
        volatile long f53792h;
        /* renamed from: i */
        volatile boolean f53793i;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutTimedOtherObserver$a */
        final class C15709a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ TimeoutTimedOtherObserver f48589a;
            /* renamed from: b */
            private final long f48590b;

            C15709a(TimeoutTimedOtherObserver timeoutTimedOtherObserver, long j) {
                this.f48589a = timeoutTimedOtherObserver;
                this.f48590b = j;
            }

            public void run() {
                if (this.f48590b == this.f48589a.f53792h) {
                    this.f48589a.f53793i = true;
                    this.f48589a.f53790f.dispose();
                    DisposableHelper.dispose(this.f48589a);
                    this.f48589a.m63686a();
                    this.f48589a.f53788d.dispose();
                }
            }
        }

        TimeoutTimedOtherObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, C17362c c17362c, ObservableSource<? extends T> observableSource) {
            this.f53785a = observer;
            this.f53786b = j;
            this.f53787c = timeUnit;
            this.f53788d = c17362c;
            this.f53789e = observableSource;
            this.f53791g = new C19000e(observer, this, 8);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53790f, disposable)) {
                this.f53790f = disposable;
                if (this.f53791g.m67543a(disposable) != null) {
                    this.f53785a.onSubscribe(this.f53791g);
                    m63687a(0);
                }
            }
        }

        public void onNext(T t) {
            if (!this.f53793i) {
                long j = this.f53792h + 1;
                this.f53792h = j;
                if (this.f53791g.m67544a((Object) t, this.f53790f) != null) {
                    m63687a(j);
                }
            }
        }

        /* renamed from: a */
        void m63687a(long j) {
            Disposable disposable = (Disposable) get();
            if (disposable != null) {
                disposable.dispose();
            }
            if (compareAndSet(disposable, ObservableTimeoutTimed.f59006f)) {
                DisposableHelper.replace(this, this.f53788d.mo13559a(new C15709a(this, j), this.f53786b, this.f53787c));
            }
        }

        /* renamed from: a */
        void m63686a() {
            this.f53789e.subscribe(new C17392h(this.f53791g));
        }

        public void onError(Throwable th) {
            if (this.f53793i) {
                C2667a.a(th);
                return;
            }
            this.f53793i = true;
            this.f53791g.m67542a(th, this.f53790f);
            this.f53788d.dispose();
        }

        public void onComplete() {
            if (!this.f53793i) {
                this.f53793i = true;
                this.f53791g.m67546b(this.f53790f);
                this.f53788d.dispose();
            }
        }

        public void dispose() {
            this.f53790f.dispose();
            this.f53788d.dispose();
        }

        public boolean isDisposed() {
            return this.f53788d.isDisposed();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTimeoutTimed$a */
    static final class C17452a implements Disposable {
        public void dispose() {
        }

        public boolean isDisposed() {
            return true;
        }

        C17452a() {
        }
    }

    public ObservableTimeoutTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C15679f c15679f, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f59007b = j;
        this.f59008c = timeUnit;
        this.f59009d = c15679f;
        this.f59010e = observableSource2;
    }

    public void subscribeActual(Observer<? super T> observer) {
        if (this.f59010e == null) {
            this.a.subscribe(new TimeoutTimedObserver(new C17530d(observer), this.f59007b, this.f59008c, this.f59009d.mo12872a()));
            return;
        }
        this.a.subscribe(new TimeoutTimedOtherObserver(observer, this.f59007b, this.f59008c, this.f59009d.mo12872a(), this.f59010e));
    }
}
