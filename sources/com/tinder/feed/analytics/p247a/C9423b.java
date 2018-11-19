package com.tinder.feed.analytics.p247a;

import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.feed.analytics.TabSource;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import com.tinder.match.navigation.MatchSubscreensTracker;
import io.reactivex.BackpressureStrategy;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/feed/analytics/factory/FeedShowBadgeEventTabSourceTracker;", "", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "matchSubscreensTracker", "Lcom/tinder/match/navigation/MatchSubscreensTracker;", "(Lcom/tinder/home/provider/HomePageTabSelectedProvider;Lcom/tinder/match/navigation/MatchSubscreensTracker;)V", "currentTabSource", "Lrx/Single;", "Lcom/tinder/feed/analytics/TabSource;", "mapMainPageToTabSource", "mainPage", "Lcom/tinder/main/model/MainPage;", "mapMatchesMainPageToTabSource", "mapSubscreenToTabSource", "it", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.b */
public final class C9423b {
    /* renamed from: a */
    private final C9695a f31573a;
    /* renamed from: b */
    private final MatchSubscreensTracker f31574b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/feed/analytics/TabSource;", "it", "Lcom/tinder/main/model/MainPage;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a.b$a */
    static final class C13216a<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C9423b f41930a;

        C13216a(C9423b c9423b) {
            this.f41930a = c9423b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51206a((MainPage) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<TabSource> m51206a(MainPage mainPage) {
            C9423b c9423b = this.f41930a;
            C2668g.a(mainPage, "it");
            return c9423b.m39397a(mainPage);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/feed/analytics/TabSource;", "it", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.a.b$b */
    static final class C13217b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C9423b f41931a;

        C13217b(C9423b c9423b) {
            this.f41931a = c9423b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51207a((Subscreen) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TabSource m51207a(Subscreen subscreen) {
            C9423b c9423b = this.f41931a;
            C2668g.a(subscreen, "it");
            return c9423b.m39394a(subscreen);
        }
    }

    @Inject
    public C9423b(@NotNull C9695a c9695a, @NotNull MatchSubscreensTracker matchSubscreensTracker) {
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        C2668g.b(matchSubscreensTracker, "matchSubscreensTracker");
        this.f31573a = c9695a;
        this.f31574b = matchSubscreensTracker;
    }

    @NotNull
    /* renamed from: a */
    public final Single<TabSource> m39399a() {
        Single<TabSource> a = this.f31573a.m40151a().a(MainPage.class).c(1).a().a(new C13216a(this));
        C2668g.a(a, "homePageTabSelectedProvi…MainPageToTabSource(it) }");
        return a;
    }

    /* renamed from: a */
    private final Single<TabSource> m39397a(MainPage mainPage) {
        switch (C9424c.f31575a[mainPage.ordinal()]) {
            case 1:
                mainPage = Single.a(TabSource.ACCOUNT);
                C2668g.a(mainPage, "Single.just(TabSource.ACCOUNT)");
                return mainPage;
            case 2:
                mainPage = Single.a(TabSource.RECS);
                C2668g.a(mainPage, "Single.just(TabSource.RECS)");
                return mainPage;
            case 3:
                return m39398b();
            case 4:
                mainPage = Single.a(TabSource.ACTIVITY);
                C2668g.a(mainPage, "Single.just(TabSource.ACTIVITY)");
                return mainPage;
            case 5:
                mainPage = Single.a(TabSource.DISCOVERY);
                C2668g.a(mainPage, "Single.just(TabSource.DISCOVERY)");
                return mainPage;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private final Single<TabSource> m39398b() {
        Single<TabSource> d = RxJavaInteropExtKt.toV1Observable(this.f31574b.observe(), BackpressureStrategy.LATEST).c(1).a().d(new C13217b(this));
        C2668g.a(d, "matchSubscreensTracker\n …ubscreenToTabSource(it) }");
        return d;
    }

    /* renamed from: a */
    private final TabSource m39394a(Subscreen subscreen) {
        switch (C9424c.f31576b[subscreen.ordinal()]) {
            case 1:
                return TabSource.ACTIVITY;
            case 2:
                return TabSource.MESSAGES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
