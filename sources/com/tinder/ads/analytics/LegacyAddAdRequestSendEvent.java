package com.tinder.ads.analytics;

import com.tinder.ads.AdSource;
import com.tinder.ads.analytics.AdEventFields.From;
import com.tinder.ads.analytics.AdEventFields.Provider;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.ag;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import rx.Completable;
import rx.schedulers.Schedulers;

public class LegacyAddAdRequestSendEvent implements VoidUseCase<AdSource> {
    private final C2630h fireworks;
    private final RecsAdsConfig recsAdsConfig;

    @Inject
    public LegacyAddAdRequestSendEvent(RecsAdsConfig recsAdsConfig, C2630h c2630h) {
        this.recsAdsConfig = recsAdsConfig;
        this.fireworks = c2630h;
    }

    public void execute(AdSource adSource) {
        Completable.a(new LegacyAddAdRequestSendEvent$$Lambda$0(this, adSource)).b(Schedulers.io()).b(RxUtils.b());
    }

    final /* synthetic */ void lambda$execute$0$LegacyAddAdRequestSendEvent(AdSource adSource) {
        this.fireworks.a(ag.a().a(Integer.valueOf(this.recsAdsConfig.cadence())).c(Provider.Companion.forSource(adSource).key()).b(From.RECS.key()).a());
    }
}
