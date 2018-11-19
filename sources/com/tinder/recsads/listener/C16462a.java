package com.tinder.recsads.listener;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recs.view.RecCardView;
import com.tinder.recsads.model.BrandedProfileCardAd;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import com.tinder.recsads.view.AddyV2BrandedProfileCardRecCardView.Listener;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recsads/listener/BrandedProfileCardImpressionTrackerListener;", "Lcom/tinder/recsads/view/AddyV2BrandedProfileCardRecCardView$Listener;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "(Lcom/tinder/addy/tracker/AdUrlTracker;)V", "onCardInfoClicked", "", "adRec", "Lcom/tinder/recsads/model/AdRec;", "brandedProfileCardAd", "Lcom/tinder/recsads/model/BrandedProfileCardAd;", "currentPhotoIndex", "", "cardView", "Lcom/tinder/recs/view/RecCardView;", "onCardMovedToTop", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.listener.a */
public final class C16462a implements Listener {
    /* renamed from: a */
    private final AdUrlTracker f51049a;

    public void onCardInfoClicked(@NotNull C16464a c16464a, @NotNull BrandedProfileCardAd brandedProfileCardAd, int i, @NotNull RecCardView<?> recCardView) {
        C2668g.b(c16464a, "adRec");
        C2668g.b(brandedProfileCardAd, "brandedProfileCardAd");
        C2668g.b(recCardView, "cardView");
    }

    @Inject
    public C16462a(@NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(adUrlTracker, "adUrlTracker");
        this.f51049a = adUrlTracker;
    }

    public void onCardMovedToTop(@NotNull BrandedProfileCardAd brandedProfileCardAd) {
        C2668g.b(brandedProfileCardAd, "brandedProfileCardAd");
        this.f51049a.a(brandedProfileCardAd.lineItemId(), RecsAdTrackingEvent.IMPRESSION);
        if (!(brandedProfileCardAd instanceof C16469h)) {
            brandedProfileCardAd = null;
        }
        C16469h c16469h = (C16469h) brandedProfileCardAd;
        if (c16469h != null) {
            brandedProfileCardAd = c16469h.m61880a();
            if (brandedProfileCardAd != null) {
                brandedProfileCardAd.recordImpression();
            }
        }
    }
}
