package com.tinder.overflow.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.gt;
import com.tinder.etl.event.gt.C9100a;
import com.tinder.feed.analytics.MatchType;
import com.tinder.overflow.model.C10028a;
import com.tinder.overflow.model.FeedbackType;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.model.ReportingSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "createEvent", "Lrx/Single;", "Lcom/tinder/etl/event/FeedbackUserEvent;", "request", "execute", "", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.analytics.a */
public final class C12239a implements VoidUseCase<C10024a> {
    /* renamed from: a */
    private final C2630h f39621a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/tinder/overflow/analytics/AddFeedbackUserEvent$Request;", "", "matchId", "", "matchType", "Lcom/tinder/feed/analytics/MatchType;", "otherId", "contentId", "attribution", "Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;", "source", "Lcom/tinder/overflow/model/ReportingSource;", "feedbackType", "Lcom/tinder/overflow/model/FeedbackType;", "feedbackAction", "Lcom/tinder/overflow/model/FeedbackAction;", "reasonCustom", "(Ljava/lang/String;Lcom/tinder/feed/analytics/MatchType;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;Lcom/tinder/overflow/model/ReportingSource;Lcom/tinder/overflow/model/FeedbackType;Lcom/tinder/overflow/model/FeedbackAction;Ljava/lang/String;)V", "getAttribution", "()Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;", "getContentId", "()Ljava/lang/String;", "getFeedbackAction", "()Lcom/tinder/overflow/model/FeedbackAction;", "getFeedbackType", "()Lcom/tinder/overflow/model/FeedbackType;", "getMatchId", "getMatchType", "()Lcom/tinder/feed/analytics/MatchType;", "getOtherId", "getReasonCustom", "getSource", "()Lcom/tinder/overflow/model/ReportingSource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.a$a */
    public static final class C10024a {
        @Nullable
        /* renamed from: a */
        private final String f32898a;
        @Nullable
        /* renamed from: b */
        private final MatchType f32899b;
        @Nullable
        /* renamed from: c */
        private final String f32900c;
        @Nullable
        /* renamed from: d */
        private final String f32901d;
        @Nullable
        /* renamed from: e */
        private final AnalyticsMatchAttribution f32902e;
        @NotNull
        /* renamed from: f */
        private final ReportingSource f32903f;
        @NotNull
        /* renamed from: g */
        private final FeedbackType f32904g;
        @NotNull
        /* renamed from: h */
        private final C10028a f32905h;
        @Nullable
        /* renamed from: i */
        private final String f32906i;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10024a) {
                    C10024a c10024a = (C10024a) obj;
                    if (C2668g.a(this.f32898a, c10024a.f32898a) && C2668g.a(this.f32899b, c10024a.f32899b) && C2668g.a(this.f32900c, c10024a.f32900c) && C2668g.a(this.f32901d, c10024a.f32901d) && C2668g.a(this.f32902e, c10024a.f32902e) && C2668g.a(this.f32903f, c10024a.f32903f) && C2668g.a(this.f32904g, c10024a.f32904g) && C2668g.a(this.f32905h, c10024a.f32905h) && C2668g.a(this.f32906i, c10024a.f32906i)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f32898a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            MatchType matchType = this.f32899b;
            hashCode = (hashCode + (matchType != null ? matchType.hashCode() : 0)) * 31;
            String str2 = this.f32900c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f32901d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            AnalyticsMatchAttribution analyticsMatchAttribution = this.f32902e;
            hashCode = (hashCode + (analyticsMatchAttribution != null ? analyticsMatchAttribution.hashCode() : 0)) * 31;
            ReportingSource reportingSource = this.f32903f;
            hashCode = (hashCode + (reportingSource != null ? reportingSource.hashCode() : 0)) * 31;
            FeedbackType feedbackType = this.f32904g;
            hashCode = (hashCode + (feedbackType != null ? feedbackType.hashCode() : 0)) * 31;
            C10028a c10028a = this.f32905h;
            hashCode = (hashCode + (c10028a != null ? c10028a.hashCode() : 0)) * 31;
            str2 = this.f32906i;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f32898a);
            stringBuilder.append(", matchType=");
            stringBuilder.append(this.f32899b);
            stringBuilder.append(", otherId=");
            stringBuilder.append(this.f32900c);
            stringBuilder.append(", contentId=");
            stringBuilder.append(this.f32901d);
            stringBuilder.append(", attribution=");
            stringBuilder.append(this.f32902e);
            stringBuilder.append(", source=");
            stringBuilder.append(this.f32903f);
            stringBuilder.append(", feedbackType=");
            stringBuilder.append(this.f32904g);
            stringBuilder.append(", feedbackAction=");
            stringBuilder.append(this.f32905h);
            stringBuilder.append(", reasonCustom=");
            stringBuilder.append(this.f32906i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10024a(@Nullable String str, @Nullable MatchType matchType, @Nullable String str2, @Nullable String str3, @Nullable AnalyticsMatchAttribution analyticsMatchAttribution, @NotNull ReportingSource reportingSource, @NotNull FeedbackType feedbackType, @NotNull C10028a c10028a, @Nullable String str4) {
            C2668g.b(reportingSource, "source");
            C2668g.b(feedbackType, "feedbackType");
            C2668g.b(c10028a, "feedbackAction");
            this.f32898a = str;
            this.f32899b = matchType;
            this.f32900c = str2;
            this.f32901d = str3;
            this.f32902e = analyticsMatchAttribution;
            this.f32903f = reportingSource;
            this.f32904g = feedbackType;
            this.f32905h = c10028a;
            this.f32906i = str4;
        }

        @Nullable
        /* renamed from: a */
        public final String m41066a() {
            return this.f32898a;
        }

        @Nullable
        /* renamed from: b */
        public final MatchType m41067b() {
            return this.f32899b;
        }

        @Nullable
        /* renamed from: c */
        public final String m41068c() {
            return this.f32900c;
        }

        @Nullable
        /* renamed from: d */
        public final String m41069d() {
            return this.f32901d;
        }

        @Nullable
        /* renamed from: e */
        public final AnalyticsMatchAttribution m41070e() {
            return this.f32902e;
        }

        @NotNull
        /* renamed from: f */
        public final ReportingSource m41071f() {
            return this.f32903f;
        }

        @NotNull
        /* renamed from: g */
        public final FeedbackType m41072g() {
            return this.f32904g;
        }

        @NotNull
        /* renamed from: h */
        public final C10028a m41073h() {
            return this.f32905h;
        }

        @Nullable
        /* renamed from: i */
        public final String m41074i() {
            return this.f32906i;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/etl/event/FeedbackUserEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.a$b */
    static final class C13538b<T, R> implements Func1<gt, Completable> {
        /* renamed from: a */
        final /* synthetic */ C12239a f43259a;

        C13538b(C12239a c12239a) {
            this.f43259a = c12239a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52917a((gt) obj);
        }

        /* renamed from: a */
        public final Completable m52917a(final gt gtVar) {
            return Completable.a(new Action0() {
                public final void call() {
                    this.f43259a.f39621a.a(gtVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.a$c */
    static final class C14116c implements Action0 {
        /* renamed from: a */
        public static final C14116c f44812a = new C14116c();

        C14116c() {
        }

        public final void call() {
            C0001a.b("FeedbackUserEvent successfully logged.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.analytics.a$d */
    static final class C14117d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14117d f44813a = new C14117d();

        C14117d() {
        }

        public /* synthetic */ void call(Object obj) {
            m53840a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53840a(Throwable th) {
            C0001a.c(th, "AddFeedbackUserUseCase failed.", new Object[0]);
        }
    }

    @Inject
    public C12239a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f39621a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m48434a((C10024a) obj);
    }

    /* renamed from: a */
    public void m48434a(@NotNull C10024a c10024a) {
        C2668g.b(c10024a, "request");
        m48433b(c10024a).c(new C13538b(this)).b(Schedulers.io()).a(C14116c.f44812a, C14117d.f44813a);
    }

    /* renamed from: b */
    private final Single<gt> m48433b(C10024a c10024a) {
        C9100a d = gt.m45219a().m38322d(c10024a.m41066a());
        MatchType b = c10024a.m41067b();
        Integer num = null;
        d = d.m38323e(b != null ? b.getValue() : null).m38324f(c10024a.m41068c()).m38318a(c10024a.m41069d());
        AnalyticsMatchAttribution e = c10024a.m41070e();
        if (e != null) {
            num = Integer.valueOf(e.getValue());
        }
        d = d.m38317a((Number) num).m38327i(c10024a.m41071f().getValue()).m38321c(c10024a.m41072g().getValue()).m38320b(c10024a.m41073h().mo10700a());
        ReasonOption b2 = c10024a.m41073h().m41080b();
        if (b2 != null) {
            d.m38326h(b2.getValue());
        }
        if (c10024a.m41073h().m41080b() == ReasonOption.OTHER) {
            c10024a = c10024a.m41074i();
            if (c10024a == null || d.m38325g(c10024a) == null) {
                C12239a c12239a = this;
                d.m38325g("");
            }
        }
        c10024a = Single.a(d.m38319a());
        C2668g.a(c10024a, "Single.just(event.build())");
        return c10024a;
    }
}
