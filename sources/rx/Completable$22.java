package rx;

import rx.functions.Func0;

class Completable$22 implements Func0<T> {
    /* renamed from: a */
    final /* synthetic */ Object f61430a;
    /* renamed from: b */
    final /* synthetic */ Completable f61431b;

    Completable$22(Completable completable, Object obj) {
        this.f61431b = completable;
        this.f61430a = obj;
    }

    public T call() {
        return this.f61430a;
    }
}
