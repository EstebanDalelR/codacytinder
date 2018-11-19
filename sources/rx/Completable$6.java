package rx;

import rx.functions.Action0;
import rx.functions.Action1;

class Completable$6 implements Action0 {
    /* renamed from: a */
    final /* synthetic */ Action1 f61953a;
    /* renamed from: b */
    final /* synthetic */ Completable f61954b;

    Completable$6(Completable completable, Action1 action1) {
        this.f61954b = completable;
        this.f61953a = action1;
    }

    public void call() {
        this.f61953a.call(Notification.m69597a());
    }
}
