package com.tinder.ads.analytics;

import com.tinder.ads.Ad;
import rx.functions.Action0;

final /* synthetic */ class AddAdEvent$$Lambda$0 implements Action0 {
    private final AddAdEvent arg$1;
    private final Ad arg$2;
    private final Object arg$3;

    AddAdEvent$$Lambda$0(AddAdEvent addAdEvent, Ad ad, Object obj) {
        this.arg$1 = addAdEvent;
        this.arg$2 = ad;
        this.arg$3 = obj;
    }

    public void call() {
        this.arg$1.lambda$execute$0$AddAdEvent(this.arg$2, this.arg$3);
    }
}
