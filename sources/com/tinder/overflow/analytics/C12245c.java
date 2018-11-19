package com.tinder.overflow.analytics;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.analytics.MatchType;
import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.analytics.C12239a.C10024a;
import com.tinder.overflow.model.FeedbackType;
import com.tinder.overflow.model.ReportingSource;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/overflow/analytics/AddFeedbackUserReportEventFromProfile;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/overflow/analytics/AddFeedbackUserReportEventFromProfile$Request;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "addFeedbackUserEvent", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;", "(Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;)V", "createEventRequest", "Lio/reactivex/Single;", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent$Request;", "request", "execute", "Lio/reactivex/Completable;", "toAnalyticsMatchAttribution", "Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;", "Lcom/tinder/domain/match/model/Match$Attribution;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.analytics.c */
public final class C12245c implements CompletableUseCase<C10025a> {
    /* renamed from: a */
    private final GetMatch f39629a;
    /* renamed from: b */
    private final C12239a f39630b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/overflow/analytics/AddFeedbackUserReportEventFromProfile$Request;", "", "matchId", "", "personId", "feedbackInfo", "Lcom/tinder/feed/view/model/FeedbackInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/feed/view/model/FeedbackInfo;)V", "getFeedbackInfo", "()Lcom/tinder/feed/view/model/FeedbackInfo;", "getMatchId", "()Ljava/lang/String;", "getPersonId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.c$a */
    public static final class C10025a {
        @Nullable
        /* renamed from: a */
        private final String f32907a;
        @Nullable
        /* renamed from: b */
        private final String f32908b;
        @NotNull
        /* renamed from: c */
        private final C9541g f32909c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10025a) {
                    C10025a c10025a = (C10025a) obj;
                    if (C2668g.a(this.f32907a, c10025a.f32907a) && C2668g.a(this.f32908b, c10025a.f32908b) && C2668g.a(this.f32909c, c10025a.f32909c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f32907a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f32908b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C9541g c9541g = this.f32909c;
            if (c9541g != null) {
                i = c9541g.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f32907a);
            stringBuilder.append(", personId=");
            stringBuilder.append(this.f32908b);
            stringBuilder.append(", feedbackInfo=");
            stringBuilder.append(this.f32909c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10025a(@Nullable String str, @Nullable String str2, @NotNull C9541g c9541g) {
            C2668g.b(c9541g, "feedbackInfo");
            this.f32907a = str;
            this.f32908b = str2;
            this.f32909c = c9541g;
        }

        @Nullable
        /* renamed from: a */
        public final String m41075a() {
            return this.f32907a;
        }

        @Nullable
        /* renamed from: b */
        public final String m41076b() {
            return this.f32908b;
        }

        @NotNull
        /* renamed from: c */
        public final C9541g m41077c() {
            return this.f32909c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.c$b */
    static final class C12240b<T> implements Predicate<Optional<Match>> {
        /* renamed from: a */
        public static final C12240b f39622a = new C12240b();

        C12240b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48435a((Optional) obj);
        }

        /* renamed from: a */
        public final boolean m48435a(@NotNull Optional<Match> optional) {
            C2668g.b(optional, "optionalMatch");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.c$c */
    static final class C12241c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12241c f39623a = new C12241c();

        C12241c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48436a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m48436a(@NotNull Optional<Match> optional) {
            C2668g.b(optional, "optionalMatch");
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent$Request;", "match", "Lcom/tinder/domain/match/model/Match;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.c$d */
    static final class C12242d<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C12245c f39624a;
        /* renamed from: b */
        final /* synthetic */ C10025a f39625b;

        C12242d(C12245c c12245c, C10025a c10025a) {
            this.f39624a = c12245c;
            this.f39625b = c10025a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48437a((Match) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C10024a m48437a(@NotNull Match match) {
            C2668g.b(match, "match");
            boolean z = match instanceof PlacesMatch;
            String str = null;
            String id = z ? ((PlacesMatch) match).getPlace().getId() : null;
            if (match instanceof CoreMatch) {
                str = ((CoreMatch) match).getPerson().id();
            } else if (z) {
                str = ((PlacesMatch) match).getPerson().id();
            }
            return new C10024a(match.getId(), MatchType.SOLO, str, id, this.f39624a.m48439a((Attribution) match.getAttribution()), ReportingSource.PROFILE, FeedbackType.REPORT, this.f39625b.m41077c().m39815b(), this.f39625b.m41077c().m39816c());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent$Request;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.c$e */
    static final class C12244e<T, R> implements Function<C10024a, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C12245c f39628a;

        C12244e(C12245c c12245c) {
            this.f39628a = c12245c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48438a((C10024a) obj);
        }

        /* renamed from: a */
        public final C3956a m48438a(@NotNull final C10024a c10024a) {
            C2668g.b(c10024a, "it");
            return C3956a.a(new Action() {
                public final void run() {
                    C12239a a = this.f39628a.f39630b;
                    C10024a c10024a = c10024a;
                    C2668g.a(c10024a, "it");
                    a.m48434a(c10024a);
                }
            });
        }
    }

    @Inject
    public C12245c(@NotNull GetMatch getMatch, @NotNull C12239a c12239a) {
        C2668g.b(getMatch, "getMatch");
        C2668g.b(c12239a, "addFeedbackUserEvent");
        this.f39629a = getMatch;
        this.f39630b = c12239a;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m48443a((C10025a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m48443a(@NotNull C10025a c10025a) {
        C2668g.b(c10025a, "request");
        c10025a = m48442b(c10025a).d(new C12244e(this));
        C2668g.a(c10025a, "createEventRequest(reque…          }\n            }");
        return c10025a;
    }

    /* renamed from: b */
    private final C3960g<C10024a> m48442b(C10025a c10025a) {
        if (c10025a.m41075a() != null) {
            c10025a = RxJavaInteropExtKt.toV2Observable(this.f39629a.execute(c10025a.m41075a())).filter(C12240b.f39622a).firstOrError().e(C12241c.f39623a).e(new C12242d(this, c10025a));
            C2668g.a(c10025a, "getMatch.execute(request…      )\n                }");
            return c10025a;
        }
        c10025a = C3960g.a(new C10024a(null, MatchType.SOLO, c10025a.m41076b(), null, null, ReportingSource.PROFILE, FeedbackType.REPORT, c10025a.m41077c().m39815b(), c10025a.m41077c().m39816c()));
        C2668g.a(c10025a, "Single.just(eventRequest)");
        return c10025a;
    }

    /* renamed from: a */
    private final AnalyticsMatchAttribution m48439a(@NotNull Attribution attribution) {
        switch (C10026d.f32910a[attribution.ordinal()]) {
            case 1:
                return AnalyticsMatchAttribution.DEFAULT;
            case 2:
            case 3:
                return AnalyticsMatchAttribution.SUPER_LIKE;
            case 4:
                return AnalyticsMatchAttribution.BOOST;
            case 5:
                return AnalyticsMatchAttribution.LIKES_YOU;
            case 6:
                return AnalyticsMatchAttribution.PLACES;
            case 7:
                return AnalyticsMatchAttribution.TOP_PICKS;
            default:
                return AnalyticsMatchAttribution.DEFAULT;
        }
    }
}
