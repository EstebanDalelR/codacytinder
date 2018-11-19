package com.tinder.domain.profile.usecase;

import rx.CompletableEmitter;
import rx.functions.Action1;

final /* synthetic */ class SetDiscoverability$$Lambda$0 implements Action1 {
    private final SetDiscoverability arg$1;
    private final Boolean arg$2;

    SetDiscoverability$$Lambda$0(SetDiscoverability setDiscoverability, Boolean bool) {
        this.arg$1 = setDiscoverability;
        this.arg$2 = bool;
    }

    public void call(Object obj) {
        this.arg$1.lambda$execute$0$SetDiscoverability(this.arg$2, (CompletableEmitter) obj);
    }
}
