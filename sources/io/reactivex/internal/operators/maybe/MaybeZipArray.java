package io.reactivex.internal.operators.maybe;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.operators.maybe.C19014g.C17420a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeZipArray<T, R> extends C3958c<R> {
    /* renamed from: a */
    final MaybeSource<? extends T>[] f57152a;
    /* renamed from: b */
    final Function<? super Object[], ? extends R> f57153b;

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        /* renamed from: a */
        final MaybeObserver<? super R> f53276a;
        /* renamed from: b */
        final Function<? super Object[], ? extends R> f53277b;
        /* renamed from: c */
        final ZipMaybeObserver<T>[] f53278c;
        /* renamed from: d */
        final Object[] f53279d;

        ZipCoordinator(MaybeObserver<? super R> maybeObserver, int i, Function<? super Object[], ? extends R> function) {
            super(i);
            this.f53276a = maybeObserver;
            this.f53277b = function;
            maybeObserver = new ZipMaybeObserver[i];
            for (function = null; function < i; function++) {
                maybeObserver[function] = new ZipMaybeObserver(this, function);
            }
            this.f53278c = maybeObserver;
            this.f53279d = new Object[i];
        }

        public boolean isDisposed() {
            return get() <= 0;
        }

        public void dispose() {
            int i = 0;
            if (getAndSet(0) > 0) {
                ZipMaybeObserver[] zipMaybeObserverArr = this.f53278c;
                int length = zipMaybeObserverArr.length;
                while (i < length) {
                    zipMaybeObserverArr[i].m63505a();
                    i++;
                }
            }
        }

        /* renamed from: a */
        void m63502a(T t, int i) {
            this.f53279d[i] = t;
            if (decrementAndGet() == null) {
                try {
                    this.f53276a.onSuccess(C15684a.m58895a(this.f53277b.apply(this.f53279d), "The zipper returned a null value"));
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53276a.onError(t2);
                }
            }
        }

        /* renamed from: a */
        void m63501a(int i) {
            ZipMaybeObserver[] zipMaybeObserverArr = this.f53278c;
            int length = zipMaybeObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2].m63505a();
            }
            while (true) {
                i++;
                if (i < length) {
                    zipMaybeObserverArr[i].m63505a();
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        void m63503a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m63501a(i);
                this.f53276a.onError(th);
                return;
            }
            C2667a.a(th);
        }

        /* renamed from: b */
        void m63504b(int i) {
            if (getAndSet(0) > 0) {
                m63501a(i);
                this.f53276a.onComplete();
            }
        }
    }

    static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        /* renamed from: a */
        final ZipCoordinator<T, ?> f53280a;
        /* renamed from: b */
        final int f53281b;

        ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.f53280a = zipCoordinator;
            this.f53281b = i;
        }

        /* renamed from: a */
        public void m63505a() {
            DisposableHelper.dispose(this);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        public void onSuccess(T t) {
            this.f53280a.m63502a((Object) t, this.f53281b);
        }

        public void onError(Throwable th) {
            this.f53280a.m63503a(th, this.f53281b);
        }

        public void onComplete() {
            this.f53280a.m63504b(this.f53281b);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeZipArray$a */
    final class C17417a implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ MaybeZipArray f53282a;

        C17417a(MaybeZipArray maybeZipArray) {
            this.f53282a = maybeZipArray;
        }

        public R apply(T t) throws Exception {
            return C15684a.m58895a(this.f53282a.f57153b.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    public MaybeZipArray(MaybeSource<? extends T>[] maybeSourceArr, Function<? super Object[], ? extends R> function) {
        this.f57152a = maybeSourceArr;
        this.f57153b = function;
    }

    /* renamed from: a */
    protected void m66483a(MaybeObserver<? super R> maybeObserver) {
        MaybeSource[] maybeSourceArr = this.f57152a;
        int length = maybeSourceArr.length;
        int i = 0;
        if (length == 1) {
            maybeSourceArr[0].subscribe(new C17420a(maybeObserver, new C17417a(this)));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(maybeObserver, length, this.f57153b);
        maybeObserver.onSubscribe(zipCoordinator);
        while (i < length && zipCoordinator.isDisposed() == null) {
            maybeObserver = maybeSourceArr[i];
            if (maybeObserver == null) {
                zipCoordinator.m63503a(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                maybeObserver.subscribe(zipCoordinator.f53278c[i]);
                i++;
            }
        }
    }
}
