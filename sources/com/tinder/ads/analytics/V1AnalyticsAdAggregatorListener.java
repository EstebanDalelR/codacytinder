package com.tinder.ads.analytics;

import com.tinder.ads.Ad;
import com.tinder.ads.AdAggregator$Listener;
import com.tinder.ads.AdSource;
import com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request;
import com.tinder.utils.RxUtils;
import hugo.weaving.DebugLog;
import javax.inject.Inject;
import rx.schedulers.Schedulers;

public class V1AnalyticsAdAggregatorListener implements AdAggregator$Listener {
    private final LegacyAddAdRequestReceiveEvent legacyAddAdRequestReceiveEvent;
    private final LegacyAddAdRequestSendEvent legacyAddAdRequestSendEvent;

    @DebugLog
    public void onAdFailed(AdSource adSource, Throwable th) {
    }

    @Inject
    V1AnalyticsAdAggregatorListener(LegacyAddAdRequestSendEvent legacyAddAdRequestSendEvent, LegacyAddAdRequestReceiveEvent legacyAddAdRequestReceiveEvent) {
        this.legacyAddAdRequestSendEvent = legacyAddAdRequestSendEvent;
        this.legacyAddAdRequestReceiveEvent = legacyAddAdRequestReceiveEvent;
    }

    @DebugLog
    public void onAdAdded(Ad ad) {
        this.legacyAddAdRequestReceiveEvent.execute(Request.builder().build(), ad).b(Schedulers.io()).b(RxUtils.b());
    }

    @DebugLog
    public void onAdRequestSent(AdSource adSource) {
        this.legacyAddAdRequestSendEvent.execute(adSource);
    }
}
