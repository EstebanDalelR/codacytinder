package com.tinder.recs.data;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C2635n;
import com.tinder.analytics.performance.C6242m;
import com.tinder.analytics.performance.C8151o;
import com.tinder.api.TinderApi;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.model.rating.SuperLikeRatingResponse;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import com.tinder.api.request.LikeRatingRequest;
import com.tinder.api.request.SuperLikeRatingRequest;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.match.C10799v;
import com.tinder.data.recs.C10990e;
import com.tinder.data.recs.C10990e.C8774a;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.provider.NewMatchNotifier;
import com.tinder.domain.profile.usecase.SaveSuperlikeStatus;
import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.recs.analytics.AddNewMatchEvent;
import com.tinder.recs.analytics.AddNewMatchEvent.Request;
import com.tinder.superlike.p418a.C15066a;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.utils.RxUtils;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15966s;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001;Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0002J \u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0018\u00104\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0002J\u0018\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002072\u0006\u00102\u001a\u000203H\u0002J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/tinder/recs/data/DefaultRatingsApiClient;", "Lcom/tinder/domain/recs/RatingsApiClient;", "tinderApi", "Lcom/tinder/api/TinderApi;", "ratingRequestFactory", "Lcom/tinder/recs/data/RatingRequestFactory;", "ratingResultAdapter", "Lcom/tinder/recs/data/RatingResultAdapter;", "likeStatusProvider", "Lcom/tinder/tinderplus/provider/LikeStatusProvider;", "superlikeStatusAdapter", "Lcom/tinder/superlike/adatper/SuperlikeStatusAdapter;", "superlikeStatusProvider", "Lcom/tinder/superlike/provider/SuperlikeStatusProvider;", "matchDomainApiAdapter", "Lcom/tinder/data/match/MatchDomainApiAdapter;", "newMatchNotifier", "Lcom/tinder/domain/match/provider/NewMatchNotifier;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "addNewMatchEvent", "Lcom/tinder/recs/analytics/AddNewMatchEvent;", "insertBrandedMatch", "Lcom/tinder/data/recs/InsertBrandedMatch;", "saveSuperlikeStatus", "Lcom/tinder/domain/profile/usecase/SaveSuperlikeStatus;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/recs/data/RatingRequestFactory;Lcom/tinder/recs/data/RatingResultAdapter;Lcom/tinder/tinderplus/provider/LikeStatusProvider;Lcom/tinder/superlike/adatper/SuperlikeStatusAdapter;Lcom/tinder/superlike/provider/SuperlikeStatusProvider;Lcom/tinder/data/match/MatchDomainApiAdapter;Lcom/tinder/domain/match/provider/NewMatchNotifier;Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/recs/analytics/AddNewMatchEvent;Lcom/tinder/data/recs/InsertBrandedMatch;Lcom/tinder/domain/profile/usecase/SaveSuperlikeStatus;)V", "recsEvent", "Lcom/tinder/analytics/performance/RecsEvent;", "fireRecsPerformanceEvent", "", "timerKey", "", "recId", "response", "Lokhttp3/Response;", "handleBrandedRec", "match", "Lcom/tinder/api/model/common/ApiMatch;", "rec", "Lcom/tinder/domain/recs/model/Rec;", "domainMatch", "Lcom/tinder/domain/match/model/Match;", "handleLikeRatingResponse", "likeRatingResponse", "Lcom/tinder/api/model/rating/LikeRatingResponse;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "handleNewMatch", "handleSuperLikeRatingResponse", "superLikeRatingResponse", "Lcom/tinder/api/model/rating/SuperLikeRatingResponse;", "rate", "Lrx/Single;", "Lcom/tinder/domain/recs/model/RatingResult;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DefaultRatingsApiClient implements RatingsApiClient {
    @Deprecated
    public static final Companion Companion = new Companion();
    private static final String LIKE_TIMER_KEY = "LIKE_TIMER_KEY";
    private static final String PASS_TIMER_KEY = "PASS_TIMER_KEY";
    private static final String SUPER_LIKE_TIMER_KEY = "SUPER_LIKE_TIMER_KEY";
    private final AbTestUtility abTestUtility;
    private final AddNewMatchEvent addNewMatchEvent;
    private final C10990e insertBrandedMatch;
    private final LikeStatusProvider likeStatusProvider;
    private final C10799v matchDomainApiAdapter;
    private final NewMatchNotifier newMatchNotifier;
    private final RatingRequestFactory ratingRequestFactory;
    private final RatingResultAdapter ratingResultAdapter;
    private final RecsEngineRegistry recsEngineRegistry;
    private final C8151o recsEvent;
    private final SaveSuperlikeStatus saveSuperlikeStatus;
    private final C15066a superlikeStatusAdapter;
    private final C15082f superlikeStatusProvider;
    private final TinderApi tinderApi;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/data/DefaultRatingsApiClient$Companion;", "", "()V", "LIKE_TIMER_KEY", "", "PASS_TIMER_KEY", "SUPER_LIKE_TIMER_KEY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Type.values().length];

        static {
            $EnumSwitchMapping$0[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$0[Type.SUPERLIKE.ordinal()] = 2;
            $EnumSwitchMapping$0[Type.PASS.ordinal()] = 3;
        }
    }

    public DefaultRatingsApiClient(@NotNull TinderApi tinderApi, @NotNull RatingRequestFactory ratingRequestFactory, @NotNull RatingResultAdapter ratingResultAdapter, @NotNull LikeStatusProvider likeStatusProvider, @NotNull C15066a c15066a, @NotNull C15082f c15082f, @NotNull C10799v c10799v, @NotNull NewMatchNotifier newMatchNotifier, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull C2630h c2630h, @NotNull AbTestUtility abTestUtility, @NotNull AddNewMatchEvent addNewMatchEvent, @NotNull C10990e c10990e, @NotNull SaveSuperlikeStatus saveSuperlikeStatus) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(ratingRequestFactory, "ratingRequestFactory");
        C2668g.b(ratingResultAdapter, "ratingResultAdapter");
        C2668g.b(likeStatusProvider, "likeStatusProvider");
        C2668g.b(c15066a, "superlikeStatusAdapter");
        C2668g.b(c15082f, "superlikeStatusProvider");
        C2668g.b(c10799v, "matchDomainApiAdapter");
        C2668g.b(newMatchNotifier, "newMatchNotifier");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(addNewMatchEvent, "addNewMatchEvent");
        C2668g.b(c10990e, "insertBrandedMatch");
        C2668g.b(saveSuperlikeStatus, "saveSuperlikeStatus");
        this.tinderApi = tinderApi;
        this.ratingRequestFactory = ratingRequestFactory;
        this.ratingResultAdapter = ratingResultAdapter;
        this.likeStatusProvider = likeStatusProvider;
        this.superlikeStatusAdapter = c15066a;
        this.superlikeStatusProvider = c15082f;
        this.matchDomainApiAdapter = c10799v;
        this.newMatchNotifier = newMatchNotifier;
        this.recsEngineRegistry = recsEngineRegistry;
        this.abTestUtility = abTestUtility;
        this.addNewMatchEvent = addNewMatchEvent;
        this.insertBrandedMatch = c10990e;
        this.saveSuperlikeStatus = saveSuperlikeStatus;
        this.recsEvent = new C8151o(c2630h, this.abTestUtility);
    }

    @NotNull
    public Single<RatingResult> rate(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        switch (WhenMappings.$EnumSwitchMapping$0[swipe.getType().ordinal()]) {
            case 1:
                LikeRatingRequest createLikeRatingRequest = this.ratingRequestFactory.createLikeRatingRequest(swipe);
                String id = swipe.getRec().getId();
                swipe = this.tinderApi.like(id, createLikeRatingRequest).b(new DefaultRatingsApiClient$rate$1(this)).b(new DefaultRatingsApiClient$rate$2(this, id, swipe)).k(DefaultRatingsApiClient$rate$3.INSTANCE).a(new DefaultRatingsApiClient$sam$rx_Observable_Transformer$0(new DefaultRatingsApiClient$rate$4(this.ratingResultAdapter))).a();
                C2668g.a(swipe, "tinderApi\n              …              .toSingle()");
                return swipe;
            case 2:
                SuperLikeRatingRequest createSuperLikeRatingRequest = this.ratingRequestFactory.createSuperLikeRatingRequest(swipe);
                swipe = this.tinderApi.superlike(createSuperLikeRatingRequest).b(new DefaultRatingsApiClient$rate$5(this)).b(new DefaultRatingsApiClient$rate$6(this, createSuperLikeRatingRequest, swipe)).k(DefaultRatingsApiClient$rate$7.INSTANCE).a(new DefaultRatingsApiClient$sam$rx_Observable_Transformer$0(new DefaultRatingsApiClient$rate$8(this.ratingResultAdapter))).a();
                C2668g.a(swipe, "tinderApi\n              …              .toSingle()");
                return swipe;
            case 3:
                swipe = this.ratingRequestFactory.createPassRatingRequest(swipe);
                swipe = this.tinderApi.pass(swipe).b(new DefaultRatingsApiClient$rate$9(this)).b(new DefaultRatingsApiClient$rate$10(this, swipe)).k(DefaultRatingsApiClient$rate$11.INSTANCE).a(new DefaultRatingsApiClient$sam$rx_Observable_Transformer$0(new DefaultRatingsApiClient$rate$12(this.ratingResultAdapter))).a();
                C2668g.a(swipe, "tinderApi\n              …              .toSingle()");
                return swipe;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void handleLikeRatingResponse(LikeRatingResponse likeRatingResponse, Swipe swipe) {
        LikeStatusProvider likeStatusProvider = this.likeStatusProvider;
        Integer likesRemaining = likeRatingResponse.likesRemaining();
        if (likesRemaining == null) {
            likesRemaining = Integer.valueOf(0);
        }
        int intValue = likesRemaining.intValue();
        Long rateLimitUntil = likeRatingResponse.rateLimitUntil();
        if (rateLimitUntil == null) {
            rateLimitUntil = Long.valueOf(0);
        }
        likeStatusProvider.saveLikeStatus(LikeStatus.create(intValue, rateLimitUntil.longValue()));
        likeRatingResponse = likeRatingResponse.match();
        if (likeRatingResponse != null) {
            handleNewMatch(likeRatingResponse, swipe);
        }
    }

    private final void handleSuperLikeRatingResponse(SuperLikeRatingResponse superLikeRatingResponse, Swipe swipe) {
        SuperlikeStatus a = this.superlikeStatusAdapter.m56778a(superLikeRatingResponse.superLikes());
        if (a != null) {
            if (this.abTestUtility.profileV2EnabledForRevenue()) {
                this.saveSuperlikeStatus.execute(a);
            } else {
                this.superlikeStatusProvider.m56833a(a);
            }
        }
        superLikeRatingResponse = superLikeRatingResponse.match();
        if (superLikeRatingResponse != null) {
            handleNewMatch(superLikeRatingResponse, swipe);
        }
    }

    private final void handleNewMatch(ApiMatch apiMatch, Swipe swipe) {
        RecsEngine engine = this.recsEngineRegistry.getEngine(swipe.getRec().getSource());
        if (engine != null) {
            engine.cancelRewind(swipe).a(DefaultRatingsApiClient$handleNewMatch$1$1.INSTANCE, DefaultRatingsApiClient$handleNewMatch$1$2.INSTANCE);
        }
        this.addNewMatchEvent.execute(new Request(apiMatch, swipe)).b(Schedulers.io()).b(RxUtils.b());
        Match a = this.matchDomainApiAdapter.a(apiMatch, swipe.getRec());
        if (a != null) {
            this.newMatchNotifier.notifyNewMatch(a);
            handleBrandedRec(apiMatch, swipe.getRec(), a);
            return;
        }
        C0001a.e("Error creating a Match from ApiMatch=%s and Rec=%s", new Object[]{apiMatch, swipe.getRec()});
    }

    private final void handleBrandedRec(ApiMatch apiMatch, Rec rec, Match match) {
        if (rec instanceof UserRec) {
            UserRec userRec = (UserRec) rec;
            if (userRec.isBranded()) {
                this.insertBrandedMatch.a(new C8774a(userRec, apiMatch, match));
            }
        }
    }

    private final void fireRecsPerformanceEvent(String str, String str2, C15966s c15966s) {
        this.recsEvent.b(str);
        String str3 = str2;
        String str4 = str;
        this.recsEvent.a(str3, str4, C2635n.a(c15966s.m60553a().m60526a().toString(), ag.m64174a(C15811g.m59834a(str2, InstrumentationConstantsKt.REPLACE_USER_ID_WITH))), c15966s.m60553a().m60527b(), c15966s.m60555c(), C6242m.a().a(str2).a());
    }
}
