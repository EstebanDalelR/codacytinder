package rx;

import rx.functions.Action0;
import rx.functions.Action1;
import rx.p498c.C19401c;
import rx.p500e.C19574c;

class Completable$16 implements CompletableSubscriber {
    /* renamed from: a */
    boolean f61093a;
    /* renamed from: b */
    final /* synthetic */ Action0 f61094b;
    /* renamed from: c */
    final /* synthetic */ C19574c f61095c;
    /* renamed from: d */
    final /* synthetic */ Action1 f61096d;
    /* renamed from: e */
    final /* synthetic */ Completable f61097e;

    Completable$16(Completable completable, Action0 action0, C19574c c19574c, Action1 action1) {
        this.f61097e = completable;
        this.f61094b = action0;
        this.f61095c = c19574c;
        this.f61096d = action1;
    }

    public void onCompleted() {
        if (!this.f61093a) {
            this.f61093a = true;
            try {
                this.f61094b.call();
                this.f61095c.unsubscribe();
            } catch (Throwable th) {
                m70531a(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f61093a) {
            C19401c.m69811a(th);
            Completable.c(th);
            return;
        }
        this.f61093a = true;
        m70531a(th);
    }

    /* renamed from: a */
    void m70531a(Throwable th) {
        try {
            this.f61096d.call(th);
        } catch (Throwable th2) {
            this.f61095c.unsubscribe();
        }
        this.f61095c.unsubscribe();
    }

    public void onSubscribe(Subscription subscription) {
        this.f61095c.m70552a(subscription);
    }
}
