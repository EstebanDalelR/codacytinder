package rx.internal.operators;

import rx.C19566b;
import rx.C19571c;
import rx.Observable;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.p498c.C19401c;
import rx.p500e.C19575d;

public final class bn<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Single<? extends T> f62250a;
    /* renamed from: b */
    final Observable<?> f62251b;

    public /* synthetic */ void call(Object obj) {
        m71594a((C19566b) obj);
    }

    public bn(Single<? extends T> single, Observable<?> observable) {
        this.f62250a = single;
        this.f62251b = observable;
    }

    /* renamed from: a */
    public void m71594a(final C19566b<? super T> c19566b) {
        final C19566b c197221 = new C19566b<T>(this) {
            /* renamed from: b */
            final /* synthetic */ bn f61699b;

            /* renamed from: a */
            public void mo14737a(T t) {
                c19566b.mo14737a((Object) t);
            }

            public void onError(Throwable th) {
                c19566b.onError(th);
            }
        };
        final Subscription c19575d = new C19575d();
        c19566b.m70541a(c19575d);
        C19571c c197232 = new C19571c<Object>(this) {
            /* renamed from: a */
            boolean f61700a;
            /* renamed from: d */
            final /* synthetic */ bn f61703d;

            public void onNext(Object obj) {
                onCompleted();
            }

            public void onError(Throwable th) {
                if (this.f61700a) {
                    C19401c.m69811a(th);
                    return;
                }
                this.f61700a = true;
                c197221.onError(th);
            }

            public void onCompleted() {
                if (!this.f61700a) {
                    this.f61700a = true;
                    c19575d.m70554a(c197221);
                    this.f61703d.f62250a.m69762a(c197221);
                }
            }
        };
        c19575d.m70554a(c197232);
        this.f62251b.m69677b(c197232);
    }
}
