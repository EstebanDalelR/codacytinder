package com.tinder.recs.analytics;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.ads.V1BrandedProfileCardAd;
import com.tinder.messageads.model.MessageAdTrackingEvent;
import com.tinder.recs.model.AdRec;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.V1BrandedProfileCardRecCardView.Listener;
import com.tinder.recsads.model.BrandedProfileCardAd;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/analytics/V1BrandedProfileCardAdAnalyticsListener;", "Lcom/tinder/recsads/V1BrandedProfileCardRecCardView$Listener;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "(Lcom/tinder/addy/tracker/AdUrlTracker;)V", "onCardInfoClicked", "", "adRec", "Lcom/tinder/recs/model/AdRec;", "brandedProfileCardAd", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "currentPhotoIndex", "", "cardView", "Lcom/tinder/recs/view/RecCardView;", "onCardMovedToTop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1BrandedProfileCardAdAnalyticsListener implements Listener {
    private final AdUrlTracker adUrlTracker;

    @Inject
    public V1BrandedProfileCardAdAnalyticsListener(@NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(adUrlTracker, "adUrlTracker");
        this.adUrlTracker = adUrlTracker;
    }

    public void onCardMovedToTop(@NotNull BrandedProfileCardAd brandedProfileCardAd) {
        C2668g.b(brandedProfileCardAd, "brandedProfileCardAd");
        V1BrandedProfileCardAd v1BrandedProfileCardAd = (V1BrandedProfileCardAd) brandedProfileCardAd;
        this.adUrlTracker.a(v1BrandedProfileCardAd.lineItemId(), RecsAdTrackingEvent.IMPRESSION);
        v1BrandedProfileCardAd.getNativeCustomTemplateAd().recordImpression();
    }

    public void onCardInfoClicked(@NotNull AdRec adRec, @NotNull BrandedProfileCardAd brandedProfileCardAd, int i, @NotNull RecCardView<?> recCardView) {
        C2668g.b(adRec, "adRec");
        C2668g.b(brandedProfileCardAd, "brandedProfileCardAd");
        C2668g.b(recCardView, "cardView");
        this.adUrlTracker.a(((V1BrandedProfileCardAd) brandedProfileCardAd).id(), (EventType) MessageAdTrackingEvent.PROFILE);
    }
}
