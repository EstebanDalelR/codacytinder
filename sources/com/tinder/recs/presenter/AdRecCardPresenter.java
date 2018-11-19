package com.tinder.recs.presenter;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.source.dfp.BannerDfpAd;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.recs.card.AdRecCard;
import com.tinder.recs.model.AdRec;
import com.tinder.recs.target.AdRecCardTarget;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import javax.inject.Inject;

public class AdRecCardPresenter extends RecCardPresenter<AdRecCard> {
    private final AdUrlTracker adUrlTracker;
    @DeadshotTarget
    AdRecCardTarget target;

    @Inject
    public AdRecCardPresenter(AdUrlTracker adUrlTracker) {
        this.adUrlTracker = adUrlTracker;
    }

    public void handleCardMovedToTop(AdRecCard adRecCard) {
        adRecCard = ((AdRec) adRecCard.getItem()).getAd();
        if (adRecCard instanceof RecsNativeAd) {
            onNativeDfpCardMovedToTop((RecsNativeAd) adRecCard);
        }
    }

    public void handleCardRemovedFromTop(AdRecCard adRecCard) {
        super.handleCardRemovedFromTop(adRecCard);
        adRecCard = ((AdRec) adRecCard.getItem()).getAd();
        if (adRecCard instanceof BannerDfpAd) {
            onBannerDfpCardRemovedFromTop((BannerDfpAd) adRecCard);
        }
    }

    private void onBannerDfpCardRemovedFromTop(BannerDfpAd bannerDfpAd) {
        bannerDfpAd.setEventListener(null);
    }

    private void onNativeDfpCardMovedToTop(RecsNativeAd recsNativeAd) {
        this.adUrlTracker.a(recsNativeAd.lineItemId(), RecsAdTrackingEvent.IMPRESSION);
        recsNativeAd.nativeCustomTemplateAd().recordImpression();
    }
}
