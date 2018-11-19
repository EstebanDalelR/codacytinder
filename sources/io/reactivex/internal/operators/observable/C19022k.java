package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.C19003j;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.C17528b;
import io.reactivex.observers.C17530d;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.k */
public final class C19022k<T, U extends Collection<? super T>, B> extends C18394a<T, U> {
    /* renamed from: b */
    final ObservableSource<B> f59066b;
    /* renamed from: c */
    final Callable<U> f59067c;

    /* renamed from: io.reactivex.internal.operators.observable.k$a */
    static final class C18406a<T, U extends Collection<? super T>, B> extends C17528b<B> {
        /* renamed from: a */
        final C19194b<T, U, B> f57293a;

        C18406a(C19194b<T, U, B> c19194b) {
            this.f57293a = c19194b;
        }

        public void onNext(B b) {
            this.f57293a.m68242b();
        }

        public void onError(Throwable th) {
            this.f57293a.onError(th);
        }

        public void onComplete() {
            this.f57293a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.k$b */
    static final class C19194b<T, U extends Collection<? super T>, B> extends C19003j<T, U, U> implements Observer<T>, Disposable {
        /* renamed from: g */
        final Callable<U> f59614g;
        /* renamed from: h */
        final ObservableSource<B> f59615h;
        /* renamed from: i */
        Disposable f59616i;
        /* renamed from: j */
        Disposable f59617j;
        /* renamed from: k */
        U f59618k;

        public /* synthetic */ void accept(Observer observer, Object obj) {
            m68241a(observer, (Collection) obj);
        }

        C19194b(Observer<? super U> observer, Callable<U> callable, ObservableSource<B> observableSource) {
            super(observer, new MpscLinkedQueue());
            this.f59614g = callable;
            this.f59615h = observableSource;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59616i, disposable)) {
                this.f59616i = disposable;
                try {
                    this.f59618k = (Collection) C15684a.m58895a(this.f59614g.call(), "The buffer supplied is null");
                    disposable = new C18406a(this);
                    this.f59617j = disposable;
                    this.a.onSubscribe(this);
                    if (!this.c) {
                        this.f59615h.subscribe(disposable);
                    }
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.c = true;
                    disposable.dispose();
                    EmptyDisposable.error(th, this.a);
                }
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                Collection collection = this.f59618k;
                if (collection == null) {
                    return;
                }
                collection.add(t);
            }
        }

        public void onError(Throwable th) {
            dispose();
            this.a.onError(th);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.f59618k;	 Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            return;
        L_0x0007:
            r1 = 0;
            r3.f59618k = r1;	 Catch:{ all -> 0x0022 }
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            r1 = r3.b;
            r1.offer(r0);
            r0 = 1;
            r3.d = r0;
            r0 = r3.enter();
            if (r0 == 0) goto L_0x0021;
        L_0x0019:
            r0 = r3.b;
            r1 = r3.a;
            r2 = 0;
            io.reactivex.internal.util.C15742i.m58996a(r0, r1, r2, r3, r3);
        L_0x0021:
            return;
        L_0x0022:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.k.b.onComplete():void");
        }

        public void dispose() {
            if (!this.c) {
                this.c = true;
                this.f59617j.dispose();
                this.f59616i.dispose();
                if (enter()) {
                    this.b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68242b() {
            try {
                Collection collection = (Collection) C15684a.m58895a(this.f59614g.call(), "The buffer supplied is null");
                synchronized (this) {
                    Collection collection2 = this.f59618k;
                    if (collection2 == null) {
                        return;
                    }
                    this.f59618k = collection;
                    m67551a(collection2, false, this);
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                dispose();
                this.a.onError(th);
            }
        }

        /* renamed from: a */
        public void m68241a(Observer<? super U> observer, U u) {
            this.a.onNext(u);
        }
    }

    public C19022k(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Callable<U> callable) {
        super(observableSource);
        this.f59066b = observableSource2;
        this.f59067c = callable;
    }

    protected void subscribeActual(Observer<? super U> observer) {
        this.a.subscribe(new C19194b(new C17530d(observer), this.f59067c, this.f59066b));
    }
}
