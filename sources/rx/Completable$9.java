package rx;

import rx.functions.Action0;
import rx.functions.Action1;

class Completable$9 implements Action1<Throwable> {
    /* renamed from: a */
    final /* synthetic */ Action0 f61957a;
    /* renamed from: b */
    final /* synthetic */ Completable f61958b;

    Completable$9(Completable completable, Action0 action0) {
        this.f61958b = completable;
        this.f61957a = action0;
    }

    public /* synthetic */ void call(Object obj) {
        m71413a((Throwable) obj);
    }

    /* renamed from: a */
    public void m71413a(Throwable th) {
        this.f61957a.call();
    }
}
