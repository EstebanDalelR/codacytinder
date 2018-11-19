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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableZip<T, R> extends C3959e<R> {
    /* renamed from: a */
    final ObservableSource<? extends T>[] f57225a;
    /* renamed from: b */
    final Iterable<? extends ObservableSource<? extends T>> f57226b;
    /* renamed from: c */
    final Function<? super Object[], ? extends R> f57227c;
    /* renamed from: d */
    final int f57228d;
    /* renamed from: e */
    final boolean f57229e;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        /* renamed from: a */
        final Observer<? super R> f53837a;
        /* renamed from: b */
        final Function<? super Object[], ? extends R> f53838b;
        /* renamed from: c */
        final C17455a<T, R>[] f53839c;
        /* renamed from: d */
        final T[] f53840d;
        /* renamed from: e */
        final boolean f53841e;
        /* renamed from: f */
        volatile boolean f53842f;

        ZipCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.f53837a = observer;
            this.f53838b = function;
            this.f53839c = new C17455a[i];
            this.f53840d = (Object[]) new Object[i];
            this.f53841e = z;
        }

        /* renamed from: a */
        public void m63699a(ObservableSource<? extends T>[] observableSourceArr, int i) {
            C17455a[] c17455aArr = this.f53839c;
            int length = c17455aArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                c17455aArr[i3] = new C17455a(this, i);
            }
            lazySet(0);
            this.f53837a.onSubscribe(this);
            while (i2 < length && this.f53842f == 0) {
                observableSourceArr[i2].subscribe(c17455aArr[i2]);
                i2++;
            }
        }

        public void dispose() {
            if (!this.f53842f) {
                this.f53842f = true;
                m63701b();
                if (getAndIncrement() == 0) {
                    m63702c();
                }
            }
        }

        public boolean isDisposed() {
            return this.f53842f;
        }

        /* renamed from: a */
        void m63698a() {
            m63702c();
            m63701b();
        }

        /* renamed from: b */
        void m63701b() {
            for (C17455a a : this.f53839c) {
                a.m63704a();
            }
        }

        /* renamed from: c */
        void m63702c() {
            for (C17455a c17455a : this.f53839c) {
                c17455a.f53844b.clear();
            }
        }

        /* renamed from: d */
        public void m63703d() {
            Throwable th;
            ZipCoordinator zipCoordinator = this;
            if (getAndIncrement() == 0) {
                C17455a[] c17455aArr = zipCoordinator.f53839c;
                Observer observer = zipCoordinator.f53837a;
                Object obj = zipCoordinator.f53840d;
                boolean z = zipCoordinator.f53841e;
                int i = 1;
                while (true) {
                    int length = c17455aArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        int i5;
                        C17455a c17455a = c17455aArr[i2];
                        if (obj[i3] == null) {
                            boolean z2 = c17455a.f53845c;
                            Object poll = c17455a.f53844b.poll();
                            boolean z3 = poll == null;
                            i5 = i2;
                            if (!m63700a(z2, z3, observer, z, c17455a)) {
                                if (z3) {
                                    i4++;
                                } else {
                                    obj[i3] = poll;
                                }
                            } else {
                                return;
                            }
                        }
                        C17455a c17455a2 = c17455a;
                        i5 = i2;
                        if (c17455a2.f53845c && !z) {
                            th = c17455a2.f53846d;
                            if (th != null) {
                                m63698a();
                                observer.onError(th);
                                return;
                            }
                        }
                        i3++;
                        i2 = i5 + 1;
                    }
                    if (i4 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            observer.onNext(C15684a.m58895a(zipCoordinator.f53838b.apply(obj.clone()), "The zipper returned a null value"));
                            Arrays.fill(obj, null);
                        } catch (Throwable th2) {
                            th = th2;
                            C15678a.m58850b(th);
                            m63698a();
                            observer.onError(th);
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        boolean m63700a(boolean z, boolean z2, Observer<? super R> observer, boolean z3, C17455a<?, ?> c17455a) {
            if (this.f53842f) {
                m63698a();
                return true;
            }
            if (z) {
                if (!z3) {
                    z = c17455a.f53846d;
                    if (z) {
                        m63698a();
                        observer.onError(z);
                        return true;
                    } else if (z2) {
                        m63698a();
                        observer.onComplete();
                        return true;
                    }
                } else if (z2) {
                    z = c17455a.f53846d;
                    m63698a();
                    if (z) {
                        observer.onError(z);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableZip$a */
    static final class C17455a<T, R> implements Observer<T> {
        /* renamed from: a */
        final ZipCoordinator<T, R> f53843a;
        /* renamed from: b */
        final C18423a<T> f53844b;
        /* renamed from: c */
        volatile boolean f53845c;
        /* renamed from: d */
        Throwable f53846d;
        /* renamed from: e */
        final AtomicReference<Disposable> f53847e = new AtomicReference();

        C17455a(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.f53843a = zipCoordinator;
            this.f53844b = new C18423a(i);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f53847e, disposable);
        }

        public void onNext(T t) {
            this.f53844b.offer(t);
            this.f53843a.m63703d();
        }

        public void onError(Throwable th) {
            this.f53846d = th;
            this.f53845c = true;
            this.f53843a.m63703d();
        }

        public void onComplete() {
            this.f53845c = true;
            this.f53843a.m63703d();
        }

        /* renamed from: a */
        public void m63704a() {
            DisposableHelper.dispose(this.f53847e);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f57225a = observableSourceArr;
        this.f57226b = iterable;
        this.f57227c = function;
        this.f57228d = i;
        this.f57229e = z;
    }

    public void subscribeActual(Observer<? super R> observer) {
        ObservableSource[] observableSourceArr;
        int i;
        ObservableSource[] observableSourceArr2 = this.f57225a;
        if (observableSourceArr2 == null) {
            Object obj = new C3959e[8];
            observableSourceArr = obj;
            i = 0;
            for (ObservableSource observableSource : this.f57226b) {
                if (i == observableSourceArr.length) {
                    Object obj2 = new ObservableSource[((i >> 2) + i)];
                    System.arraycopy(observableSourceArr, 0, obj2, 0, i);
                    observableSourceArr = obj2;
                }
                int i2 = i + 1;
                observableSourceArr[i] = observableSource;
                i = i2;
            }
        } else {
            observableSourceArr = observableSourceArr2;
            i = observableSourceArr2.length;
        }
        if (i == 0) {
            EmptyDisposable.complete((Observer) observer);
        } else {
            new ZipCoordinator(observer, this.f57227c, i, this.f57229e).m63699a(observableSourceArr, this.f57228d);
        }
    }
}
