package rx;

import java.util.concurrent.CountDownLatch;

class Completable$10 implements CompletableSubscriber {
    /* renamed from: a */
    final /* synthetic */ CountDownLatch f61074a;
    /* renamed from: b */
    final /* synthetic */ Throwable[] f61075b;
    /* renamed from: c */
    final /* synthetic */ Completable f61076c;

    public void onSubscribe(Subscription subscription) {
    }

    Completable$10(Completable completable, CountDownLatch countDownLatch, Throwable[] thArr) {
        this.f61076c = completable;
        this.f61074a = countDownLatch;
        this.f61075b = thArr;
    }

    public void onCompleted() {
        this.f61074a.countDown();
    }

    public void onError(Throwable th) {
        this.f61075b[0] = th;
        this.f61074a.countDown();
    }
}
