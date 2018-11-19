package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableCombineLatest<T, R> extends C3959e<R> {
    /* renamed from: a */
    final ObservableSource<? extends T>[] f57164a;
    /* renamed from: b */
    final Iterable<? extends ObservableSource<? extends T>> f57165b;
    /* renamed from: c */
    final Function<? super Object[], ? extends R> f57166c;
    /* renamed from: d */
    final int f57167d;
    /* renamed from: e */
    final boolean f57168e;

    static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        /* renamed from: a */
        final LatestCoordinator<T, R> f53351a;
        /* renamed from: b */
        final int f53352b;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.f53351a = latestCoordinator;
            this.f53352b = i;
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onNext(T t) {
            this.f53351a.m63525a(this.f53352b, (Object) t);
        }

        public void onError(Throwable th) {
            this.f53351a.m63526a(this.f53352b, th);
        }

        public void onComplete() {
            this.f53351a.m63524a(this.f53352b);
        }

        /* renamed from: a */
        public void m63522a() {
            DisposableHelper.dispose(this);
        }
    }

    static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        /* renamed from: a */
        final Observer<? super R> f53353a;
        /* renamed from: b */
        final Function<? super Object[], ? extends R> f53354b;
        /* renamed from: c */
        final CombinerObserver<T, R>[] f53355c;
        /* renamed from: d */
        Object[] f53356d;
        /* renamed from: e */
        final C18423a<Object[]> f53357e;
        /* renamed from: f */
        final boolean f53358f;
        /* renamed from: g */
        volatile boolean f53359g;
        /* renamed from: h */
        volatile boolean f53360h;
        /* renamed from: i */
        final AtomicThrowable f53361i = new AtomicThrowable();
        /* renamed from: j */
        int f53362j;
        /* renamed from: k */
        int f53363k;

        LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.f53353a = observer;
            this.f53354b = function;
            this.f53358f = z;
            this.f53356d = new Object[i];
            observer = new CombinerObserver[i];
            for (function = null; function < i; function++) {
                observer[function] = new CombinerObserver(this, function);
            }
            this.f53355c = observer;
            this.f53357e = new C18423a(i2);
        }

        /* renamed from: a */
        public void m63528a(ObservableSource<? extends T>[] observableSourceArr) {
            CombinerObserver[] combinerObserverArr = this.f53355c;
            int length = combinerObserverArr.length;
            this.f53353a.onSubscribe(this);
            for (int i = 0; i < length && !this.f53360h; i++) {
                if (this.f53359g) {
                    break;
                }
                observableSourceArr[i].subscribe(combinerObserverArr[i]);
            }
        }

        public void dispose() {
            if (!this.f53359g) {
                this.f53359g = true;
                m63523a();
                if (getAndIncrement() == 0) {
                    m63527a(this.f53357e);
                }
            }
        }

        public boolean isDisposed() {
            return this.f53359g;
        }

        /* renamed from: a */
        void m63523a() {
            for (CombinerObserver a : this.f53355c) {
                a.m63522a();
            }
        }

        /* renamed from: a */
        void m63527a(C18423a<?> c18423a) {
            synchronized (this) {
                this.f53356d = null;
            }
            c18423a.clear();
        }

        /* renamed from: b */
        void m63529b() {
            if (getAndIncrement() == 0) {
                C18423a c18423a = this.f53357e;
                Observer observer = this.f53353a;
                boolean z = this.f53358f;
                int i = 1;
                while (!this.f53359g) {
                    if (z || this.f53361i.get() == null) {
                        boolean z2 = this.f53360h;
                        Object[] objArr = (Object[]) c18423a.poll();
                        Object obj = objArr == null ? 1 : null;
                        if (z2 && obj != null) {
                            m63527a(c18423a);
                            Throwable a = this.f53361i.m58960a();
                            if (a == null) {
                                observer.onComplete();
                            } else {
                                observer.onError(a);
                            }
                            return;
                        } else if (obj != null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                observer.onNext(C15684a.m58895a(this.f53354b.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                C15678a.m58850b(th);
                                this.f53361i.m58961a(th);
                                m63523a();
                                m63527a(c18423a);
                                observer.onError(this.f53361i.m58960a());
                                return;
                            }
                        }
                    }
                    m63523a();
                    m63527a(c18423a);
                    observer.onError(this.f53361i.m58960a());
                    return;
                }
                m63527a(c18423a);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m63525a(int r4, T r5) {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.f53356d;	 Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x0029 }
            return;
        L_0x0007:
            r1 = r0[r4];	 Catch:{ all -> 0x0029 }
            r2 = r3.f53362j;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0011;
        L_0x000d:
            r2 = r2 + 1;
            r3.f53362j = r2;	 Catch:{ all -> 0x0029 }
        L_0x0011:
            r0[r4] = r5;	 Catch:{ all -> 0x0029 }
            r4 = r0.length;	 Catch:{ all -> 0x0029 }
            if (r2 != r4) goto L_0x0021;
        L_0x0016:
            r4 = r3.f53357e;	 Catch:{ all -> 0x0029 }
            r5 = r0.clone();	 Catch:{ all -> 0x0029 }
            r4.offer(r5);	 Catch:{ all -> 0x0029 }
            r4 = 1;
            goto L_0x0022;
        L_0x0021:
            r4 = 0;
        L_0x0022:
            monitor-exit(r3);	 Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x0028;
        L_0x0025:
            r3.m63529b();
        L_0x0028:
            return;
        L_0x0029:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0029 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.a(int, java.lang.Object):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m63526a(int r3, java.lang.Throwable r4) {
            /*
            r2 = this;
            r0 = r2.f53361i;
            r0 = r0.m58961a(r4);
            if (r0 == 0) goto L_0x0036;
        L_0x0008:
            r4 = r2.f53358f;
            r0 = 1;
            if (r4 == 0) goto L_0x002c;
        L_0x000d:
            monitor-enter(r2);
            r4 = r2.f53356d;	 Catch:{ all -> 0x0029 }
            if (r4 != 0) goto L_0x0014;
        L_0x0012:
            monitor-exit(r2);	 Catch:{ all -> 0x0029 }
            return;
        L_0x0014:
            r3 = r4[r3];	 Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x001a;
        L_0x0018:
            r3 = 1;
            goto L_0x001b;
        L_0x001a:
            r3 = 0;
        L_0x001b:
            if (r3 != 0) goto L_0x0025;
        L_0x001d:
            r1 = r2.f53363k;	 Catch:{ all -> 0x0029 }
            r1 = r1 + r0;
            r2.f53363k = r1;	 Catch:{ all -> 0x0029 }
            r4 = r4.length;	 Catch:{ all -> 0x0029 }
            if (r1 != r4) goto L_0x0027;
        L_0x0025:
            r2.f53360h = r0;	 Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r2);	 Catch:{ all -> 0x0029 }
            goto L_0x002d;
        L_0x0029:
            r3 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x0029 }
            throw r3;
        L_0x002c:
            r3 = 1;
        L_0x002d:
            if (r3 == 0) goto L_0x0032;
        L_0x002f:
            r2.m63523a();
        L_0x0032:
            r2.m63529b();
            goto L_0x0039;
        L_0x0036:
            io.reactivex.p079d.C2667a.a(r4);
        L_0x0039:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.a(int, java.lang.Throwable):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        void m63524a(int r4) {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.f53356d;	 Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x0025 }
            return;
        L_0x0007:
            r4 = r0[r4];	 Catch:{ all -> 0x0025 }
            r1 = 1;
            if (r4 != 0) goto L_0x000e;
        L_0x000c:
            r4 = 1;
            goto L_0x000f;
        L_0x000e:
            r4 = 0;
        L_0x000f:
            if (r4 != 0) goto L_0x0019;
        L_0x0011:
            r2 = r3.f53363k;	 Catch:{ all -> 0x0025 }
            r2 = r2 + r1;
            r3.f53363k = r2;	 Catch:{ all -> 0x0025 }
            r0 = r0.length;	 Catch:{ all -> 0x0025 }
            if (r2 != r0) goto L_0x001b;
        L_0x0019:
            r3.f53360h = r1;	 Catch:{ all -> 0x0025 }
        L_0x001b:
            monitor-exit(r3);	 Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0021;
        L_0x001e:
            r3.m63523a();
        L_0x0021:
            r3.m63529b();
            return;
        L_0x0025:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0025 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.a(int):void");
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f57164a = observableSourceArr;
        this.f57165b = iterable;
        this.f57166c = function;
        this.f57167d = i;
        this.f57168e = z;
    }

    public void subscribeActual(Observer<? super R> observer) {
        int i;
        ObservableSource[] observableSourceArr = this.f57164a;
        if (observableSourceArr == null) {
            Object obj = new C3959e[8];
            Object obj2 = obj;
            int i2 = 0;
            for (ObservableSource observableSource : this.f57165b) {
                if (i2 == obj2.length) {
                    Object obj3 = new ObservableSource[((i2 >> 2) + i2)];
                    System.arraycopy(obj2, 0, obj3, 0, i2);
                    obj2 = obj3;
                }
                i = i2 + 1;
                obj2[i2] = observableSource;
                i2 = i;
            }
            i = i2;
            observableSourceArr = obj2;
        } else {
            i = observableSourceArr.length;
        }
        if (i == 0) {
            EmptyDisposable.complete((Observer) observer);
            return;
        }
        new LatestCoordinator(observer, this.f57166c, i, this.f57167d, this.f57168e).m63528a(observableSourceArr);
    }
}
