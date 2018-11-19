package rx.p499d;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19566b;
import rx.Single;
import rx.exceptions.C19410a;
import rx.internal.util.C19443c;

/* renamed from: rx.d.a */
public final class C19406a<T> {
    /* renamed from: a */
    private final Single<? extends T> f60582a;

    private C19406a(Single<? extends T> single) {
        this.f60582a = single;
    }

    /* renamed from: a */
    public static <T> C19406a<T> m69850a(Single<? extends T> single) {
        return new C19406a(single);
    }

    /* renamed from: a */
    public T m69851a() {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C19443c.m69971a(countDownLatch, this.f60582a.m69762a(new C19566b<T>(this) {
            /* renamed from: d */
            final /* synthetic */ C19406a f61451d;

            /* renamed from: a */
            public void mo14737a(T t) {
                atomicReference.set(t);
                countDownLatch.countDown();
            }

            public void onError(Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }
        }));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return atomicReference.get();
        }
        throw C19410a.m69867a(th);
    }
}
