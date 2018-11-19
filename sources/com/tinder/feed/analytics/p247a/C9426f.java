package com.tinder.feed.analytics.p247a;

import com.tinder.chat.view.model.C8493c;
import com.tinder.chat.view.model.C8495g;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.feed.analytics.ActivityType;
import com.tinder.feed.analytics.TeaserType;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C9539e;
import com.tinder.feed.view.model.FeedCommentViewModel;
import com.tinder.overflow.analytics.AnalyticsMatchAttribution;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fJ\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017H\u0002J \u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/feed/analytics/factory/FeedViewAndInteractPropertiesFactory;", "", "adapter", "Lcom/tinder/feed/analytics/factory/FeedViewModelAnalyticsPropertiesAdapter;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/feed/analytics/factory/FeedViewModelAnalyticsPropertiesAdapter;Lkotlin/jvm/functions/Function0;)V", "buildCommonProperties", "Lrx/Single;", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "mediaState", "Lcom/tinder/feed/analytics/factory/MediaState;", "calculateSecondsSince", "", "startTime", "(Lorg/joda/time/DateTime;)Ljava/lang/Long;", "createCommonProperties", "getJobTeaser", "Lcom/tinder/feed/analytics/factory/Teaser;", "jobs", "", "Lcom/tinder/chat/view/model/ActivityFeedJobViewModel;", "getSchoolTeaser", "schools", "Lcom/tinder/chat/view/model/ActivityFeedSchoolViewModel;", "getTeasers", "Lkotlin/Pair;", "userInfo", "Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.f */
public final class C9426f {
    /* renamed from: a */
    private final C9427h f31593a;
    /* renamed from: b */
    private final Function0<DateTime> f31594b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "mediaState", "Lcom/tinder/feed/analytics/factory/MediaState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a.f$a */
    static final class C13219a<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C9426f f41934a;
        /* renamed from: b */
        final /* synthetic */ ActivityFeedViewModel f41935b;

        C13219a(C9426f c9426f, ActivityFeedViewModel activityFeedViewModel) {
            this.f41934a = c9426f;
            this.f41935b = activityFeedViewModel;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51211a((C9430l) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<C9425e> m51211a(C9430l c9430l) {
            C9426f c9426f = this.f41934a;
            ActivityFeedViewModel activityFeedViewModel = this.f41935b;
            C2668g.a(c9430l, "mediaState");
            return c9426f.m39420a(activityFeedViewModel, c9430l);
        }
    }

    @Inject
    public C9426f(@NotNull C9427h c9427h, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(c9427h, "adapter");
        C2668g.b(function0, "dateTimeProvider");
        this.f31593a = c9427h;
        this.f31594b = function0;
    }

    @NotNull
    /* renamed from: a */
    public final Single<C9425e> m39422a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        activityFeedViewModel = this.f31593a.m39428e(activityFeedViewModel).a(new C13219a(this, activityFeedViewModel));
        C2668g.a(activityFeedViewModel, "adapter.resolveMediaStat…aState)\n                }");
        return activityFeedViewModel;
    }

    /* renamed from: a */
    private final Single<C9425e> m39420a(ActivityFeedViewModel<?> activityFeedViewModel, C9430l c9430l) {
        C9426f c9426f = this;
        ActivityFeedViewModel<?> activityFeedViewModel2 = activityFeedViewModel;
        FeedCommentViewModel f = activityFeedViewModel.mo11144f();
        Float f2 = null;
        String b = f != null ? f.m39790b() : null;
        f = activityFeedViewModel.mo11144f();
        Long a = m39417a(f != null ? f.m39791c() : null);
        Long a2 = m39417a(c9426f.f31593a.m39424a(activityFeedViewModel2));
        Pair a3 = m39418a(activityFeedViewModel.mo11143e());
        C9431m c9431m = (C9431m) a3.c();
        C9431m c9431m2 = (C9431m) a3.d();
        String a4 = c9430l.m39430a();
        int b2 = c9430l.m39431b();
        String id = activityFeedViewModel.getId();
        String a5 = activityFeedViewModel.mo11139a();
        ActivityType b3 = c9426f.f31593a.m39425b(activityFeedViewModel2);
        String b4 = activityFeedViewModel.mo11143e().m39804b();
        String b5 = activityFeedViewModel.mo11140b();
        AnalyticsMatchAttribution a6 = C9428i.m39429a(activityFeedViewModel.mo11141c());
        int c = c9426f.f31593a.m39426c(activityFeedViewModel2);
        Double f3 = activityFeedViewModel.mo11143e().m39808f();
        if (f3 != null) {
            f2 = Float.valueOf((float) f3.doubleValue());
        }
        Single<C9425e> a7 = Single.a(new C9425e(id, a5, b3, a2, b4, b5, a6, f2, c9431m, c9431m2, c9426f.f31593a.m39427d(activityFeedViewModel2), a4, b2, c, b, a));
        C2668g.a(a7, "Single.just(it)");
        C2668g.a(a7, "FeedViewAndInteractCommo…).let { Single.just(it) }");
        return a7;
    }

    /* renamed from: a */
    private final Pair<C9431m, C9431m> m39418a(C9539e c9539e) {
        Object b;
        Object obj = null;
        if ((c9539e.m39807e().isEmpty() ^ 1) != 0) {
            b = m39421b(c9539e.m39807e());
            if ((c9539e.m39806d().isEmpty() ^ 1) != 0) {
                obj = m39416a(c9539e.m39806d());
            }
        } else if ((c9539e.m39806d().isEmpty() ^ 1) != 0) {
            b = m39416a(c9539e.m39806d());
            obj = (C9431m) null;
        } else {
            b = (C9431m) null;
            obj = b;
        }
        return new Pair(b, obj);
    }

    /* renamed from: a */
    private final C9431m m39416a(List<C8495g> list) {
        return new C9431m(TeaserType.SCHOOLS, ((C8495g) C19301m.f(list)).m36356a());
    }

    /* renamed from: b */
    private final C9431m m39421b(List<C8493c> list) {
        C8493c c8493c = (C8493c) C19301m.f(list);
        Object obj = null;
        if ((((CharSequence) c8493c.m36354a()).length() > 0 ? 1 : null) != null) {
            if ((((CharSequence) c8493c.m36355b()).length() > 0 ? 1 : null) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(c8493c.m36355b());
                stringBuilder.append(" - ");
                stringBuilder.append(c8493c.m36354a());
                list = stringBuilder.toString();
                return new C9431m(TeaserType.JOBS, list);
            }
        }
        if ((((CharSequence) c8493c.m36354a()).length() > 0 ? 1 : null) != null) {
            list = c8493c.m36354a();
        } else {
            if (c8493c.m36355b().length() > 0) {
                obj = 1;
            }
            list = obj != null ? c8493c.m36355b() : "";
        }
        return new C9431m(TeaserType.JOBS, list);
    }

    /* renamed from: a */
    private final Long m39417a(DateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(((DateTime) this.f31594b.invoke()).getMillis() - dateTime.getMillis()));
    }
}
