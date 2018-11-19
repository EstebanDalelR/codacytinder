package com.tinder.home.navigation;

import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10682a;
import com.tinder.common.navigation.Screen.C10686e;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import com.tinder.match.navigation.MatchSubscreensTracker;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/home/navigation/HomePageScreenTracker;", "", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "matchSubscreensTracker", "Lcom/tinder/match/navigation/MatchSubscreensTracker;", "(Lcom/tinder/home/provider/HomePageTabSelectedProvider;Lcom/tinder/match/navigation/MatchSubscreensTracker;)V", "mapHomePageToScreen", "Lio/reactivex/Observable;", "Lcom/tinder/common/navigation/Screen;", "homePage", "Lcom/tinder/main/model/MainPage;", "mapMatchesHomePageToMatchesScreen", "observe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.home.navigation.a */
public final class C9703a {
    /* renamed from: a */
    private final C9695a f32285a;
    /* renamed from: b */
    private final MatchSubscreensTracker f32286b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/common/navigation/Screen$Matches;", "it", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.home.navigation.a$a */
    static final class C11867a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11867a f38704a = new C11867a();

        C11867a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47840a((Subscreen) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Matches m47840a(@NotNull Subscreen subscreen) {
            C2668g.b(subscreen, "it");
            return new Matches(subscreen);
        }
    }

    @Inject
    public C9703a(@NotNull C9695a c9695a, @NotNull MatchSubscreensTracker matchSubscreensTracker) {
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        C2668g.b(matchSubscreensTracker, "matchSubscreensTracker");
        this.f32285a = c9695a;
        this.f32286b = matchSubscreensTracker;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Screen> m40167a() {
        C3959e<Screen> switchMap = RxJavaInteropExtKt.toV2Observable(this.f32285a.m40151a()).cast(MainPage.class).switchMap(new C11868c(new HomePageScreenTracker$observe$1(this)));
        C2668g.a(switchMap, "homePageTabSelectedProvi…ap(::mapHomePageToScreen)");
        return switchMap;
    }

    /* renamed from: a */
    private final C3959e<Screen> m40165a(MainPage mainPage) {
        switch (C9704b.f32287a[mainPage.ordinal()]) {
            case 1:
                mainPage = C3959e.just(C10682a.f35023a);
                C2668g.a(mainPage, "Observable.just(Screen.Account)");
                return mainPage;
            case 2:
                mainPage = C3959e.just(C10692k.f35033a);
                C2668g.a(mainPage, "Observable.just(Screen.Recs)");
                return mainPage;
            case 3:
                return m40166b();
            case 4:
                mainPage = C3959e.just(C10692k.f35033a);
                C2668g.a(mainPage, "Observable.just(Screen.Recs)");
                return mainPage;
            case 5:
                mainPage = C3959e.just(C10686e.f35027a);
                C2668g.a(mainPage, "Observable.just(Screen.Feed)");
                return mainPage;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private final C3959e<Screen> m40166b() {
        C3959e<Screen> map = this.f32286b.observe().map(C11867a.f38704a);
        C2668g.a(map, "matchSubscreensTracker\n …s(activeSubscreen = it) }");
        return map;
    }
}
