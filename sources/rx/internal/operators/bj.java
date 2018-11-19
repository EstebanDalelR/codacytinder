package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.C19566b;
import rx.C19571c;
import rx.Observable;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.p498c.C19401c;

public final class bj<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable.OnSubscribe<T> f62243a;

    /* renamed from: rx.internal.operators.bj$a */
    static final class C19719a<T> extends C19571c<T> {
        /* renamed from: a */
        final C19566b<? super T> f61692a;
        /* renamed from: b */
        T f61693b;
        /* renamed from: c */
        int f61694c;

        C19719a(C19566b<? super T> c19566b) {
            this.f61692a = c19566b;
        }

        public void onNext(T t) {
            int i = this.f61694c;
            if (i == 0) {
                this.f61694c = 1;
                this.f61693b = t;
            } else if (i == 1) {
                this.f61694c = 2;
                this.f61692a.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }

        public void onError(Throwable th) {
            if (this.f61694c == 2) {
                C19401c.m69811a(th);
                return;
            }
            this.f61693b = null;
            this.f61692a.onError(th);
        }

        public void onCompleted() {
            int i = this.f61694c;
            if (i == 0) {
                this.f61692a.onError(new NoSuchElementException());
            } else if (i == 1) {
                this.f61694c = 2;
                Object obj = this.f61693b;
                this.f61693b = null;
                this.f61692a.mo14737a(obj);
            }
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71589a((C19566b) obj);
    }

    public bj(Observable.OnSubscribe<T> onSubscribe) {
        this.f62243a = onSubscribe;
    }

    /* renamed from: a */
    public void m71589a(C19566b<? super T> c19566b) {
        Subscription c19719a = new C19719a(c19566b);
        c19566b.m70541a(c19719a);
        this.f62243a.call(c19719a);
    }
}
