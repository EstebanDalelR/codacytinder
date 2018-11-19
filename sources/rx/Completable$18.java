package rx;

class Completable$18 implements CompletableSubscriber {
    /* renamed from: a */
    final /* synthetic */ C19571c f61102a;
    /* renamed from: b */
    final /* synthetic */ Completable f61103b;

    Completable$18(Completable completable, C19571c c19571c) {
        this.f61103b = completable;
        this.f61102a = c19571c;
    }

    public void onCompleted() {
        this.f61102a.onCompleted();
    }

    public void onError(Throwable th) {
        this.f61102a.onError(th);
    }

    public void onSubscribe(Subscription subscription) {
        this.f61102a.add(subscription);
    }
}
