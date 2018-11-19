package rx;

import rx.functions.Action1;

class Completable$5 implements Action1<Throwable> {
    /* renamed from: a */
    final /* synthetic */ Action1 f61951a;
    /* renamed from: b */
    final /* synthetic */ Completable f61952b;

    Completable$5(Completable completable, Action1 action1) {
        this.f61952b = completable;
        this.f61951a = action1;
    }

    public /* synthetic */ void call(Object obj) {
        m71412a((Throwable) obj);
    }

    /* renamed from: a */
    public void m71412a(Throwable th) {
        this.f61951a.call(Notification.m69599a(th));
    }
}
