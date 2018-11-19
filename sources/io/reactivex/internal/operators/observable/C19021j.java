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
import io.reactivex.p079d.C2667a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.operators.observable.j */
public final class C19021j<T, U extends Collection<? super T>, B> extends C18394a<T, U> {
    /* renamed from: b */
    final Callable<? extends ObservableSource<B>> f59064b;
    /* renamed from: c */
    final Callable<U> f59065c;

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    static final class C18405a<T, U extends Collection<? super T>, B> extends C17528b<B> {
        /* renamed from: a */
        final C19193b<T, U, B> f57291a;
        /* renamed from: b */
        boolean f57292b;

        C18405a(C19193b<T, U, B> c19193b) {
            this.f57291a = c19193b;
        }

        public void onNext(B b) {
            if (this.f57292b == null) {
                this.f57292b = true;
                dispose();
                this.f57291a.m68240c();
            }
        }

        public void onError(Throwable th) {
            if (this.f57292b) {
                C2667a.a(th);
                return;
            }
            this.f57292b = true;
            this.f57291a.onError(th);
        }

        public void onComplete() {
            if (!this.f57292b) {
                this.f57292b = true;
                this.f57291a.m68240c();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.j$b */
    static final class C19193b<T, U extends Collection<? super T>, B> extends C19003j<T, U, U> implements Observer<T>, Disposable {
        /* renamed from: g */
        final Callable<U> f59609g;
        /* renamed from: h */
        final Callable<? extends ObservableSource<B>> f59610h;
        /* renamed from: i */
        Disposable f59611i;
        /* renamed from: j */
        final AtomicReference<Disposable> f59612j = new AtomicReference();
        /* renamed from: k */
        U f59613k;

        public /* synthetic */ void accept(Observer observer, Object obj) {
            m68238a(observer, (Collection) obj);
        }

        C19193b(Observer<? super U> observer, Callable<U> callable, Callable<? extends ObservableSource<B>> callable2) {
            super(observer, new MpscLinkedQueue());
            this.f59609g = callable;
            this.f59610h = callable2;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59611i, disposable)) {
                this.f59611i = disposable;
                Observer observer = this.a;
                try {
                    this.f59613k = (Collection) C15684a.m58895a(this.f59609g.call(), "The buffer supplied is null");
                    try {
                        ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f59610h.call(), "The boundary ObservableSource supplied is null");
                        disposable = new C18405a(this);
                        this.f59612j.set(disposable);
                        observer.onSubscribe(this);
                        if (!this.c) {
                            observableSource.subscribe(disposable);
                        }
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        this.c = true;
                        disposable.dispose();
                        EmptyDisposable.error(th, observer);
                    }
                } catch (Throwable th2) {
                    C15678a.m58850b(th2);
                    this.c = true;
                    disposable.dispose();
                    EmptyDisposable.error(th2, observer);
                }
            }
        }

        public void onNext(T t) {
            synchronized (this) {
                Collection collection = this.f59613k;
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
            r0 = r3.f59613k;	 Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x0022 }
            return;
        L_0x0007:
            r1 = 0;
            r3.f59613k = r1;	 Catch:{ all -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.j.b.onComplete():void");
        }

        public void dispose() {
            if (!this.c) {
                this.c = true;
                this.f59611i.dispose();
                m68239b();
                if (enter()) {
                    this.b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.c;
        }

        /* renamed from: b */
        void m68239b() {
            DisposableHelper.dispose(this.f59612j);
        }

        /* renamed from: c */
        void m68240c() {
            try {
                Collection collection = (Collection) C15684a.m58895a(this.f59609g.call(), "The buffer supplied is null");
                try {
                    ObservableSource observableSource = (ObservableSource) C15684a.m58895a(this.f59610h.call(), "The boundary ObservableSource supplied is null");
                    Observer c18405a = new C18405a(this);
                    if (this.f59612j.compareAndSet((Disposable) this.f59612j.get(), c18405a)) {
                        synchronized (this) {
                            Collection collection2 = this.f59613k;
                            if (collection2 == null) {
                                return;
                            }
                            this.f59613k = collection;
                            observableSource.subscribe(c18405a);
                            m67551a(collection2, false, this);
                        }
                    }
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.c = true;
                    this.f59611i.dispose();
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                C15678a.m58850b(th2);
                dispose();
                this.a.onError(th2);
            }
        }

        /* renamed from: a */
        public void m68238a(Observer<? super U> observer, U u) {
            this.a.onNext(u);
        }
    }

    public C19021j(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        super(observableSource);
        this.f59064b = callable;
        this.f59065c = callable2;
    }

    protected void subscribeActual(Observer<? super U> observer) {
        this.a.subscribe(new C19193b(new C17530d(observer), this.f59065c, this.f59064b));
    }
}
