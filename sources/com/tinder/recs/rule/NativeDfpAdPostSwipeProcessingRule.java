package com.tinder.recs.rule;

import com.tinder.addy.Ad;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.TinderAdType;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.recs.model.AdRec;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16468f;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import com.tinder.recsads.model.RecsAdType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/recs/rule/NativeDfpAdPostSwipeProcessingRule;", "Lcom/tinder/domain/recs/rule/PostSwipeConsumptionRule;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/addy/tracker/AdUrlTracker;Lcom/tinder/core/experiment/AbTestUtility;)V", "legacyPingLikeSwipeTrackingUrls", "", "adRec", "Lcom/tinder/recs/model/AdRec;", "Lcom/tinder/recs/rule/LegacyAdRec;", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "pingLikeSwipeTrackingUrls", "ad", "Lcom/tinder/addy/Ad;", "shouldBeTracked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NativeDfpAdPostSwipeProcessingRule implements PostSwipeConsumptionRule {
    private final AbTestUtility abTestUtility;
    private final AdUrlTracker adUrlTracker;

    @Inject
    public NativeDfpAdPostSwipeProcessingRule(@NotNull AdUrlTracker adUrlTracker, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(adUrlTracker, "adUrlTracker");
        C2668g.b(abTestUtility, "abTestUtility");
        this.adUrlTracker = adUrlTracker;
        this.abTestUtility = abTestUtility;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        Rec rec = swipe.getRec();
        if (shouldBeTracked(swipe) != null) {
            if (this.abTestUtility.isAddyV2Enabled() != null) {
                if (rec == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.AdRec");
                }
                pingLikeSwipeTrackingUrls(((C16464a) rec).m61877c());
            } else if (rec == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.rule.LegacyAdRec /* = com.tinder.recs.model.AdRec */");
            } else {
                legacyPingLikeSwipeTrackingUrls((AdRec) rec);
            }
        }
        return ResultType.PROCEED;
    }

    private final void pingLikeSwipeTrackingUrls(Ad ad) {
        if (ad.adType() != RecsAdType.NATIVE_DISPLAY_DFP && ad.adType() != RecsAdType.NATIVE_VIDEO_DFP) {
            return;
        }
        if (ad == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsNativeDfpAd");
        }
        this.adUrlTracker.a(((C16468f) ad).getLineItemId(), RecsAdTrackingEvent.SWIPE);
    }

    private final void legacyPingLikeSwipeTrackingUrls(AdRec adRec) {
        adRec = adRec.getAd();
        if (adRec.adType() != TinderAdType.REC_NATIVE_VIDEO_DFP && adRec.adType() != TinderAdType.REC_NATIVE_DISPLAY_DFP) {
            return;
        }
        if (adRec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.ads.RecsNativeAd");
        }
        this.adUrlTracker.a(((RecsNativeAd) adRec).lineItemId(), RecsAdTrackingEvent.SWIPE);
    }

    private final boolean shouldBeTracked(Swipe swipe) {
        Rec rec = swipe.getRec();
        Method method = swipe.getActionContext().getMethod();
        return (rec.getType() == RecType.AD && ((method == SwipeMethod.GAMEPAD_BUTTON || method == SwipeMethod.CARD) && swipe.getType() == Type.LIKE)) ? true : null;
    }
}
