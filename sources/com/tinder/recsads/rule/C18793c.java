package com.tinder.recsads.rule;

import com.tinder.addy.Ad;
import com.tinder.addy.Ad.AdType;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.domain.match.provider.NewMatchNotifier;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.messageads.model.C12131a;
import com.tinder.messageads.model.MessageAdType;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import com.tinder.recsads.model.RecsAdType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule;", "Lcom/tinder/recsads/rule/BrandedProfileCardMatchInsertionRule;", "createAdMatch", "Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;", "messageAdMatchFactory", "Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;", "newMatchNotifier", "Lcom/tinder/domain/match/provider/NewMatchNotifier;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "(Lcom/tinder/domain/match/usecase/CreateMessageAdMatch;Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;Lcom/tinder/domain/match/provider/NewMatchNotifier;Lcom/tinder/addy/tracker/AdUrlTracker;)V", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "MessageAdMatchFactory", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.rule.c */
public final class C18793c implements BrandedProfileCardMatchInsertionRule {
    /* renamed from: a */
    private final CreateMessageAdMatch f58305a;
    /* renamed from: b */
    private final C14761a f58306b;
    /* renamed from: c */
    private final NewMatchNotifier f58307c;
    /* renamed from: d */
    private final AdUrlTracker f58308d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recsads/rule/AddyV2BrandedProfileCardMatchInsertionRule$MessageAdMatchFactory;", "", "()V", "fromAd", "Lcom/tinder/domain/match/model/MessageAdMatch;", "ad", "Lcom/tinder/addy/Ad;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.rule.c$a */
    public static final class C14761a {
        @NotNull
        /* renamed from: a */
        public final MessageAdMatch m56032a(@NotNull Ad ad) {
            Ad ad2 = ad;
            C2668g.b(ad2, "ad");
            AdType adType = ad.adType();
            DateTime a;
            String i;
            if (adType == RecsAdType.BRANDED_PROFILE_CARD) {
                a = DateTime.a();
                C16469h c16469h = (C16469h) ad2;
                i = c16469h.m61888i();
                C2668g.a(a, "now");
                return new MessageAdMatch(i, a, a, Attribution.SPONSORED_AD, false, false, c16469h.m61888i(), c16469h.m61883d(), c16469h.m61885f(), c16469h.m61886g(), c16469h.m61881b(), c16469h.m61882c(), c16469h.m61887h(), Type.BRANDED_PROFILE_CARD, c16469h.m61884e());
            } else if (adType == MessageAdType.SPONSORED_MESSAGE) {
                a = DateTime.a();
                C12131a c12131a = (C12131a) ad2;
                i = c12131a.d();
                C2668g.a(a, "now");
                return new MessageAdMatch(i, a, a, Attribution.SPONSORED_AD, false, false, c12131a.d(), c12131a.g(), c12131a.b(), c12131a.f(), c12131a.e(), c12131a.c(), c12131a.h(), Type.SPONSORED, null, 16384, null);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown Ad Type ");
                stringBuilder.append(ad.adType());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.rule.c$b */
    static final class C18791b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C18793c f58302a;
        /* renamed from: b */
        final /* synthetic */ MessageAdMatch f58303b;

        C18791b(C18793c c18793c, MessageAdMatch messageAdMatch) {
            this.f58302a = c18793c;
            this.f58303b = messageAdMatch;
        }

        public final void call() {
            this.f58302a.f58307c.notifyNewMatch(this.f58303b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.rule.c$c */
    static final class C18792c<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C16464a f58304a;

        C18792c(C16464a c16464a) {
            this.f58304a = c16464a;
        }

        public /* synthetic */ void call(Object obj) {
            m67224a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67224a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to created Branded Profile Rec Match ");
            stringBuilder.append(this.f58304a);
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C18793c(@NotNull CreateMessageAdMatch createMessageAdMatch, @NotNull C14761a c14761a, @NotNull NewMatchNotifier newMatchNotifier, @NotNull AdUrlTracker adUrlTracker) {
        C2668g.b(createMessageAdMatch, "createAdMatch");
        C2668g.b(c14761a, "messageAdMatchFactory");
        C2668g.b(newMatchNotifier, "newMatchNotifier");
        C2668g.b(adUrlTracker, "adUrlTracker");
        this.f58305a = createMessageAdMatch;
        this.f58306b = c14761a;
        this.f58307c = newMatchNotifier;
        this.f58308d = adUrlTracker;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (swipe.getType() == Swipe.Type.LIKE) {
            if (swipe.getRec().getType() == RecType.AD) {
                swipe = swipe.getRec();
                if (swipe == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.AdRec");
                }
                C16464a c16464a = (C16464a) swipe;
                if (c16464a.m61877c().adType() == RecsAdType.BRANDED_PROFILE_CARD) {
                    MessageAdMatch a = this.f58306b.m56032a(c16464a.m61877c());
                    Ad c = c16464a.m61877c();
                    if (c == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.V2BrandedProfileCardAd");
                    }
                    this.f58308d.a(((C16469h) c).lineItemId(), RecsAdTrackingEvent.SWIPE);
                    this.f58305a.execute(a).b(Schedulers.io()).a(new C18791b(this, a), new C18792c(c16464a));
                }
                return ResultType.PROCEED;
            }
        }
        return ResultType.PROCEED;
    }
}
