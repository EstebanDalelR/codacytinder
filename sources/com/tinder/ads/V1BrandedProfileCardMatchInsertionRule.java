package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.domain.match.provider.NewMatchNotifier;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.recs.model.AdRec;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import com.tinder.recsads.rule.BrandedProfileCardMatchInsertionRule;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/ads/V1BrandedProfileCardMatchInsertionRule;", "Lcom/tinder/recsads/rule/BrandedProfileCardMatchInsertionRule;", "createMessageAdMatch", "Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;", "messageAdMatchFactory", "Lcom/tinder/ads/V1BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;", "newMatchNotifier", "Lcom/tinder/domain/match/provider/NewMatchNotifier;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "(Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;Lcom/tinder/ads/V1BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;Lcom/tinder/domain/match/provider/NewMatchNotifier;Lcom/tinder/addy/tracker/AdUrlTracker;)V", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "MessageAdMatchFactory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1BrandedProfileCardMatchInsertionRule implements BrandedProfileCardMatchInsertionRule {
    private final AdUrlTracker adUrlTracker;
    private final CreateMessageAdMatch createMessageAdMatch;
    private final MessageAdMatchFactory messageAdMatchFactory;
    private final NewMatchNotifier newMatchNotifier;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/V1BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;", "", "()V", "fromAd", "Lcom/tinder/domain/match/model/MessageAdMatch;", "ad", "Lcom/tinder/ads/Ad;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class MessageAdMatchFactory {
        @NotNull
        public final MessageAdMatch fromAd(@NotNull Ad<?> ad) {
            Ad<?> ad2 = ad;
            C2668g.b(ad2, "ad");
            if (ad.adType() == TinderAdType.BRANDED_PROFILE_CARD) {
                DateTime a = DateTime.a();
                V1BrandedProfileCardAd v1BrandedProfileCardAd = (V1BrandedProfileCardAd) ad2;
                String lineItemId = v1BrandedProfileCardAd.lineItemId();
                C2668g.a(a, "now");
                return new MessageAdMatch(lineItemId, a, a, Attribution.SPONSORED_AD, false, false, v1BrandedProfileCardAd.lineItemId(), v1BrandedProfileCardAd.title(), v1BrandedProfileCardAd.profileImageUrl(), v1BrandedProfileCardAd.body(), v1BrandedProfileCardAd.clickthroughUrl(), v1BrandedProfileCardAd.clickthroughText(), v1BrandedProfileCardAd.endDate(), Type.BRANDED_PROFILE_CARD, v1BrandedProfileCardAd.profilePhotos());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown Ad Type ");
            stringBuilder.append(ad.adType());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public V1BrandedProfileCardMatchInsertionRule(@NotNull CreateMessageAdMatch createMessageAdMatch, @NotNull MessageAdMatchFactory messageAdMatchFactory, @NotNull NewMatchNotifier newMatchNotifier, @NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(createMessageAdMatch, "createMessageAdMatch");
        C2668g.b(messageAdMatchFactory, "messageAdMatchFactory");
        C2668g.b(newMatchNotifier, "newMatchNotifier");
        C2668g.b(adUrlTracker, "adUrlTracker");
        this.createMessageAdMatch = createMessageAdMatch;
        this.messageAdMatchFactory = messageAdMatchFactory;
        this.newMatchNotifier = newMatchNotifier;
        this.adUrlTracker = adUrlTracker;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (swipe.getType() == Swipe.Type.LIKE) {
            if (swipe.getRec().getType() == RecType.AD) {
                swipe = swipe.getRec();
                if (swipe == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.model.AdRec");
                }
                AdRec adRec = (AdRec) swipe;
                Ad ad = adRec.getAd();
                if (ad.adType() == TinderAdType.BRANDED_PROFILE_CARD) {
                    if (ad == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.tinder.ads.V1BrandedProfileCardAd");
                    }
                    this.adUrlTracker.m26826a(((V1BrandedProfileCardAd) ad).lineItemId(), (EventType) RecsAdTrackingEvent.SWIPE);
                    MessageAdMatch fromAd = this.messageAdMatchFactory.fromAd(ad);
                    this.createMessageAdMatch.execute(fromAd).b(Schedulers.io()).a(new V1BrandedProfileCardMatchInsertionRule$perform$1(this, fromAd), new V1BrandedProfileCardMatchInsertionRule$perform$2(adRec));
                }
                return ResultType.PROCEED;
            }
        }
        return ResultType.PROCEED;
    }
}
