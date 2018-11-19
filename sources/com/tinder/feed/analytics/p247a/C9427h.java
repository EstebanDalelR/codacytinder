package com.tinder.feed.analytics.p247a;

import com.tinder.domain.feed.FeedCarouselItemSelected;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.analytics.ActivityCaptionType;
import com.tinder.feed.analytics.ActivityType;
import com.tinder.feed.view.model.ActivityFeedViewModel;
import com.tinder.feed.view.model.C13280h;
import com.tinder.feed.view.model.C13281i;
import com.tinder.feed.view.model.C13282k;
import com.tinder.feed.view.model.C13283l;
import com.tinder.feed.view.model.C13284m;
import com.tinder.feed.view.model.C13285n;
import com.tinder.feed.view.model.C13286o;
import com.tinder.feed.view.model.C13287p;
import com.tinder.feed.view.model.C13288q;
import com.tinder.feed.view.model.C13289r;
import io.reactivex.BackpressureStrategy;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u0012\u0010\t\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/analytics/factory/FeedViewModelAnalyticsPropertiesAdapter;", "", "carouselItemSelectedRepository", "Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;", "(Lcom/tinder/domain/feed/FeedCarouselItemSelectedRepository;)V", "resolveActivityCaption", "Lcom/tinder/feed/analytics/factory/ActivityCaption;", "viewModel", "Lcom/tinder/feed/view/model/ActivityFeedViewModel;", "resolveActivityType", "Lcom/tinder/feed/analytics/ActivityType;", "resolveMediaAvailable", "", "resolveMediaState", "Lrx/Single;", "Lcom/tinder/feed/analytics/factory/MediaState;", "resolveMediaStateForCarouselItem", "resolveTimestamp", "Lorg/joda/time/DateTime;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.h */
public final class C9427h {
    /* renamed from: a */
    private final FeedCarouselItemSelectedRepository f31595a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "feedItemIdToCarouselStateMap", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a.h$a */
    static final class C13221a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ ActivityFeedViewModel f41938a;

        C13221a(ActivityFeedViewModel activityFeedViewModel) {
            this.f41938a = activityFeedViewModel;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51215a((Map) obj);
        }

        @NotNull
        /* renamed from: a */
        public final FeedCarouselItemSelected m51215a(Map<String, FeedCarouselItemSelected> map) {
            map = map.get(this.f41938a.getId());
            if (map != null) {
                return (FeedCarouselItemSelected) map;
            }
            map = new StringBuilder();
            map.append("Could not resolve carousel state for ");
            map.append(this.f41938a.getId());
            throw new IllegalStateException(map.toString().toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/feed/analytics/factory/MediaState;", "<name for destructuring parameter 0>", "Lcom/tinder/domain/feed/FeedCarouselItemSelected;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a.h$b */
    static final class C13222b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13222b f41939a = new C13222b();

        C13222b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m51216a((FeedCarouselItemSelected) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C9430l m51216a(FeedCarouselItemSelected feedCarouselItemSelected) {
            return new C9430l(feedCarouselItemSelected.component2(), feedCarouselItemSelected.component3());
        }
    }

    @Inject
    public C9427h(@NotNull FeedCarouselItemSelectedRepository feedCarouselItemSelectedRepository) {
        C2668g.b(feedCarouselItemSelectedRepository, "carouselItemSelectedRepository");
        this.f31595a = feedCarouselItemSelectedRepository;
    }

    @NotNull
    /* renamed from: a */
    public final DateTime m39424a(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        long b;
        C2668g.b(activityFeedViewModel, "viewModel");
        if (activityFeedViewModel instanceof C13281i) {
            b = ((C13281i) activityFeedViewModel).m51379g().m42952b();
        } else if (activityFeedViewModel instanceof C13282k) {
            b = ((C13282k) activityFeedViewModel).m51388g().m42958b();
        } else if (activityFeedViewModel instanceof C13289r) {
            b = ((C13289r) activityFeedViewModel).m51439g().m42933b();
        } else if (activityFeedViewModel instanceof C13284m) {
            b = ((C13284m) activityFeedViewModel).m51404g().m42914b();
        } else if (activityFeedViewModel instanceof C13288q) {
            b = ((C13288q) activityFeedViewModel).m51432g().m42929b();
        } else if (activityFeedViewModel instanceof C13280h) {
            b = ((C13280h) activityFeedViewModel).m51372g().m42949b();
        } else if (activityFeedViewModel instanceof C13283l) {
            b = ((C13283l) activityFeedViewModel).m51395g().m42911b();
        } else if (activityFeedViewModel instanceof C13285n) {
            b = ((C13285n) activityFeedViewModel).m51411g().m42917b();
        } else if (activityFeedViewModel instanceof C13287p) {
            b = ((C13287p) activityFeedViewModel).m51425g().m42925b();
        } else if (activityFeedViewModel instanceof C13286o) {
            b = ((C13286o) activityFeedViewModel).m51418g().m42921b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new DateTime(b);
    }

    @NotNull
    /* renamed from: b */
    public final ActivityType m39425b(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        if (activityFeedViewModel instanceof C13281i) {
            return ActivityType.INSTAGRAM_POST;
        }
        if (activityFeedViewModel instanceof C13282k) {
            return ActivityType.NEW_MATCH;
        }
        if (activityFeedViewModel instanceof C13289r) {
            return ActivityType.NEW_ANTHEM;
        }
        if (activityFeedViewModel instanceof C13284m) {
            return ActivityType.NEW_PROFILE_PHOTO;
        }
        if (activityFeedViewModel instanceof C13288q) {
            return ActivityType.NEW_TOP_SPOTIFY_ARTIST;
        }
        if (activityFeedViewModel instanceof C13280h) {
            return ActivityType.CONNECT_INSTAGRAM;
        }
        if (activityFeedViewModel instanceof C13283l) {
            return ActivityType.NEW_PROFILE_LOOP;
        }
        if (activityFeedViewModel instanceof C13285n) {
            return ActivityType.NEW_PROFILE_BIO;
        }
        if (activityFeedViewModel instanceof C13287p) {
            return ActivityType.NEW_PROFILE_WORK;
        }
        if ((activityFeedViewModel instanceof C13286o) != null) {
            return ActivityType.NEW_PROFILE_SCHOOL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public final int m39426c(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        if (activityFeedViewModel instanceof C13281i) {
            return ((C13281i) activityFeedViewModel).m51379g().m42956f().size();
        }
        if (activityFeedViewModel instanceof C13282k) {
            return activityFeedViewModel.mo11143e().m39805c().size();
        }
        if (activityFeedViewModel instanceof C13289r) {
            return 1;
        }
        if (activityFeedViewModel instanceof C13284m) {
            return 1;
        }
        if (activityFeedViewModel instanceof C13288q) {
            return ((C13288q) activityFeedViewModel).m51432g().m42930c().size();
        }
        if (activityFeedViewModel instanceof C13280h) {
            return ((C13280h) activityFeedViewModel).m51372g().m42950c().size();
        }
        if (activityFeedViewModel instanceof C13283l) {
            return ((C13283l) activityFeedViewModel).m51395g().m42912c().size();
        }
        if (activityFeedViewModel instanceof C13285n) {
            return 1;
        }
        if (activityFeedViewModel instanceof C13287p) {
            return 1;
        }
        if ((activityFeedViewModel instanceof C13286o) != null) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    /* renamed from: d */
    public final C9422a m39427d(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        return activityFeedViewModel instanceof C13281i ? new C9422a(ActivityCaptionType.INSTAGRAM_CAPTION, ((C13281i) activityFeedViewModel).m51379g().m42955e()) : null;
    }

    @NotNull
    /* renamed from: e */
    public final Single<C9430l> m39428e(@NotNull ActivityFeedViewModel<?> activityFeedViewModel) {
        C2668g.b(activityFeedViewModel, "viewModel");
        if (!(activityFeedViewModel instanceof C13289r)) {
            return m39423f(activityFeedViewModel);
        }
        activityFeedViewModel = Single.a(new C9430l(((C13289r) activityFeedViewModel).m51439g().m42934c().m36349a(), 0));
        C2668g.a(activityFeedViewModel, "Single.just(MediaState(\n…L_ITEM)\n                )");
        return activityFeedViewModel;
    }

    /* renamed from: f */
    private final Single<C9430l> m39423f(ActivityFeedViewModel<?> activityFeedViewModel) {
        activityFeedViewModel = RxJavaInteropExtKt.toV1Observable(this.f31595a.observe(), BackpressureStrategy.LATEST).c(1).a().d(new C13221a(activityFeedViewModel)).d(C13222b.f41939a);
        C2668g.a(activityFeedViewModel, "carouselItemSelectedRepo…      )\n                }");
        return activityFeedViewModel;
    }
}
