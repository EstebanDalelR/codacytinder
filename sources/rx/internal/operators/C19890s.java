package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.C19566b;
import rx.C19571c;
import rx.Observable;
import rx.Single.OnSubscribe;
import rx.Subscription;

/* renamed from: rx.internal.operators.s */
public class C19890s<T> implements OnSubscribe<T> {
    /* renamed from: a */
    private final Observable<T> f62295a;

    public /* synthetic */ void call(Object obj) {
        m71628a((C19566b) obj);
    }

    public C19890s(Observable<T> observable) {
        this.f62295a = observable;
    }

    /* renamed from: a */
    public void m71628a(final C19566b<? super T> c19566b) {
        C19571c c197441 = new C19571c<T>(this) {
            /* renamed from: b */
            final /* synthetic */ C19890s f61766b;
            /* renamed from: c */
            private boolean f61767c;
            /* renamed from: d */
            private boolean f61768d;
            /* renamed from: e */
            private T f61769e;

            public void onStart() {
                request(2);
            }

            public void onCompleted() {
                if (!this.f61767c) {
                    if (this.f61768d) {
                        c19566b.mo14737a(this.f61769e);
                    } else {
                        c19566b.onError(new NoSuchElementException("Observable emitted no items"));
                    }
                }
            }

            public void onError(Throwable th) {
                c19566b.onError(th);
                unsubscribe();
            }

            public void onNext(T t) {
                if (this.f61768d) {
                    this.f61767c = true;
                    c19566b.onError(new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                }
                this.f61768d = true;
                this.f61769e = t;
            }
        };
        c19566b.m70541a((Subscription) c197441);
        this.f62295a.m69661a(c197441);
    }

    /* renamed from: a */
    public static <T> C19890s<T> m71627a(Observable<T> observable) {
        return new C19890s(observable);
    }
}
