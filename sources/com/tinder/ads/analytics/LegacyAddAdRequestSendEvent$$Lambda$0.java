package com.tinder.ads.analytics;

import com.tinder.ads.AdSource;
import rx.functions.Action0;

final /* synthetic */ class LegacyAddAdRequestSendEvent$$Lambda$0 implements Action0 {
    private final LegacyAddAdRequestSendEvent arg$1;
    private final AdSource arg$2;

    LegacyAddAdRequestSendEvent$$Lambda$0(LegacyAddAdRequestSendEvent legacyAddAdRequestSendEvent, AdSource adSource) {
        this.arg$1 = legacyAddAdRequestSendEvent;
        this.arg$2 = adSource;
    }

    public void call() {
        this.arg$1.lambda$execute$0$LegacyAddAdRequestSendEvent(this.arg$2);
    }
}
