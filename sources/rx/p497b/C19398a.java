package rx.p497b;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.exceptions.C19410a;
import rx.internal.util.C19443c;
import rx.internal.util.UtilityFunctions;

/* renamed from: rx.b.a */
public final class C19398a<T> {
    /* renamed from: a */
    static final Object f60550a = new Object();
    /* renamed from: b */
    static final Object f60551b = new Object();
    /* renamed from: c */
    static final Object f60552c = new Object();
    /* renamed from: d */
    private final Observable<? extends T> f60553d;

    private C19398a(Observable<? extends T> observable) {
        this.f60553d = observable;
    }

    /* renamed from: a */
    public static <T> C19398a<T> m69787a(Observable<? extends T> observable) {
        return new C19398a(observable);
    }

    /* renamed from: a */
    public T m69789a() {
        return m69788b(this.f60553d.m69708h());
    }

    /* renamed from: a */
    public T m69790a(T t) {
        return m69788b(this.f60553d.m69719k(UtilityFunctions.m69918b()).m69681c((Object) t));
    }

    /* renamed from: b */
    public T m69791b() {
        return m69788b(this.f60553d.m69734s());
    }

    /* renamed from: b */
    public T m69792b(T t) {
        return m69788b(this.f60553d.m69719k(UtilityFunctions.m69918b()).m69688d((Object) t));
    }

    /* renamed from: b */
    private T m69788b(Observable<? extends T> observable) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C19443c.m69971a(countDownLatch, observable.m69677b(new C19571c<T>(this) {
            /* renamed from: d */
            final /* synthetic */ C19398a f61447d;

            public void onCompleted() {
                countDownLatch.countDown();
            }

            public void onError(Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }

            public void onNext(T t) {
                atomicReference.set(t);
            }
        }));
        if (atomicReference2.get() != null) {
            C19410a.m69867a((Throwable) atomicReference2.get());
        }
        return atomicReference.get();
    }
}
