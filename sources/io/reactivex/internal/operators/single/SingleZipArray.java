package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.operators.single.C18421j.C17510a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleZipArray<T, R> extends C3960g<R> {
    /* renamed from: a */
    final SingleSource<? extends T>[] f57326a;
    /* renamed from: b */
    final Function<? super Object[], ? extends R> f57327b;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        /* renamed from: a */
        final SingleObserver<? super R> f54071a;
        /* renamed from: b */
        final Function<? super Object[], ? extends R> f54072b;
        /* renamed from: c */
        final ZipSingleObserver<T>[] f54073c;
        /* renamed from: d */
        final Object[] f54074d;

        ZipCoordinator(SingleObserver<? super R> singleObserver, int i, Function<? super Object[], ? extends R> function) {
            super(i);
            this.f54071a = singleObserver;
            this.f54072b = function;
            singleObserver = new ZipSingleObserver[i];
            for (function = null; function < i; function++) {
                singleObserver[function] = new ZipSingleObserver(this, function);
            }
            this.f54073c = singleObserver;
            this.f54074d = new Object[i];
        }

        public boolean isDisposed() {
            return get() <= 0;
        }

        public void dispose() {
            int i = 0;
            if (getAndSet(0) > 0) {
                ZipSingleObserver[] zipSingleObserverArr = this.f54073c;
                int length = zipSingleObserverArr.length;
                while (i < length) {
                    zipSingleObserverArr[i].m63717a();
                    i++;
                }
            }
        }

        /* renamed from: a */
        void m63715a(T t, int i) {
            this.f54074d[i] = t;
            if (decrementAndGet() == null) {
                try {
                    this.f54071a.onSuccess(C15684a.m58895a(this.f54072b.apply(this.f54074d), "The zipper returned a null value"));
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f54071a.onError(t2);
                }
            }
        }

        /* renamed from: a */
        void m63714a(int i) {
            ZipSingleObserver[] zipSingleObserverArr = this.f54073c;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2].m63717a();
            }
            while (true) {
                i++;
                if (i < length) {
                    zipSingleObserverArr[i].m63717a();
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        void m63716a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m63714a(i);
                this.f54071a.onError(th);
                return;
            }
            C2667a.a(th);
        }
    }

    static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        /* renamed from: a */
        final ZipCoordinator<T, ?> f54075a;
        /* renamed from: b */
        final int f54076b;

        ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.f54075a = zipCoordinator;
            this.f54076b = i;
        }

        /* renamed from: a */
        public void m63717a() {
            DisposableHelper.dispose(this);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.f54075a.m63715a((Object) t, this.f54076b);
        }

        public void onError(Throwable th) {
            this.f54075a.m63716a(th, this.f54076b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleZipArray$a */
    final class C17505a implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ SingleZipArray f54077a;

        C17505a(SingleZipArray singleZipArray) {
            this.f54077a = singleZipArray;
        }

        public R apply(T t) throws Exception {
            return C15684a.m58895a(this.f54077a.f57327b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public SingleZipArray(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.f57326a = singleSourceArr;
        this.f57327b = function;
    }

    /* renamed from: a */
    protected void m66539a(SingleObserver<? super R> singleObserver) {
        SingleSource[] singleSourceArr = this.f57326a;
        int length = singleSourceArr.length;
        int i = 0;
        if (length == 1) {
            singleSourceArr[0].subscribe(new C17510a(singleObserver, new C17505a(this)));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.f57327b);
        singleObserver.onSubscribe(zipCoordinator);
        while (i < length && zipCoordinator.isDisposed() == null) {
            singleObserver = singleSourceArr[i];
            if (singleObserver == null) {
                zipCoordinator.m63716a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                singleObserver.subscribe(zipCoordinator.f54073c[i]);
                i++;
            }
        }
    }
}
