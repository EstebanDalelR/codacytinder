package com.tinder.recs.presenter;

import rx.Notification;
import rx.functions.Action1;

final /* synthetic */ class DiscoveryOffPresenter$$Lambda$0 implements Action1 {
    private final DiscoveryOffPresenter arg$1;

    DiscoveryOffPresenter$$Lambda$0(DiscoveryOffPresenter discoveryOffPresenter) {
        this.arg$1 = discoveryOffPresenter;
    }

    public void call(Object obj) {
        this.arg$1.lambda$enableDiscovery$0$DiscoveryOffPresenter((Notification) obj);
    }
}
