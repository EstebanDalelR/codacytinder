package com.tinder.app.dagger.module.main;

import com.tinder.activities.MainActivity;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.dagger.qualifier.DefaultMainPage;
import com.tinder.base.p172b.C8301a;
import com.tinder.common.logger.Logger;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.p234c.C8890a;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.feed.p341b.C11695a;
import com.tinder.home.C11863a;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import com.tinder.main.router.C11997a;
import com.tinder.main.router.MainPageRouter;
import com.tinder.main.tab.listener.C12001a;
import com.tinder.main.tab.listener.C12002b;
import com.tinder.main.tab.listener.C12003d;
import com.tinder.main.tab.listener.C12004e;
import com.tinder.main.tab.listener.C12011i;
import com.tinder.main.tab.listener.C13391c;
import com.tinder.main.tab.listener.C13392f;
import com.tinder.main.tab.listener.C13393g;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.match.provider.C9876b;
import com.tinder.places.provider.C10271c;
import com.tinder.places.provider.C12421h;
import com.tinder.profiletab.p367a.C14458a;
import com.tinder.scope.ActivityScope;
import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'¨\u0006\r"}, d2 = {"Lcom/tinder/app/dagger/module/main/MainViewModule;", "", "()V", "provideMainPageViewPagerAdapter", "Lcom/tinder/main/adapter/MainPageViewPagerAdapter;", "tinderMainPageViewPagerAdapter", "Lcom/tinder/main/adapter/TinderMainPageViewPagerAdapter;", "provideTabbedPageLayoutAdapter", "Lcom/tinder/main/adapter/MainTabbedPageLayoutAdapter;", "tinderMainTabbedPageLayoutAdapter", "Lcom/tinder/home/TinderMainTabbedPageLayoutAdapter;", "Companion", "MainPageKey", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module(includes = {C8251a.class})
public abstract class MainViewModule {
    /* renamed from: a */
    public static final C2636a f8222a = new C2636a();

    @MapKey
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\t\u0010\u0002\u001a\u00020\u0003¢\u0006\u0000¨\u0006\u0004"}, d2 = {"Lcom/tinder/app/dagger/module/main/MainViewModule$MainPageKey;", "", "value", "Lcom/tinder/main/model/MainPage;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MainPageKey {
        MainPage value();
    }

    @Module
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007J?\u0010\u001a\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u001c0\u001b2\u0011\u0010\u001d\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u001c0\u001e2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u001c0 H\u0007J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J\b\u0010'\u001a\u00020\u0004H\u0007J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0007J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0007J\b\u00105\u001a\u00020\u0004H\u0007J\u0010\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u000208H\u0007¨\u00069"}, d2 = {"Lcom/tinder/app/dagger/module/main/MainViewModule$Companion;", "", "()V", "provideAnalyticsMainPageSelectedListener", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "managerAnalytics", "Lcom/tinder/managers/ManagerAnalytics;", "breadcrumbTracker", "Lcom/tinder/managers/LegacyBreadCrumbTracker;", "provideDefaultMainPage", "Lcom/tinder/main/model/MainPage;", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "provideDiscoveryPageSelectedListenerIntoSet", "placesDiscoverToggleProvider", "Lcom/tinder/places/provider/PlacesDiscoverToggleCollapseProvider;", "discoverySegmentRouter", "Lcom/tinder/discovery/router/DiscoverySegmentRouter;", "placesFrontmostProvider", "Lcom/tinder/places/provider/PlaceFrontmostProvider;", "logger", "Lcom/tinder/common/logger/Logger;", "provideFeedMainPageSelectedListener", "feedTabReselectedProvider", "Lcom/tinder/match/provider/FeedTabReselectedProvider;", "provideFeedPageSelectedListenerIntoSet", "provideMainPageListeners", "", "Lkotlin/jvm/JvmSuppressWildcards;", "activePages", "", "map", "", "provideMainPageRouter", "Lcom/tinder/main/router/MainPageRouter;", "mainActivity", "Lcom/tinder/activities/MainActivity;", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "provideMatchesPageSelectedListenerIntoSet", "providePageScrollStateChangedListener", "mainPageScrollStateChangedProvider", "Lcom/tinder/profiletab/provider/MainPageScrollStateChangedProvider;", "providePages", "provideProfileTabPageSelectedListener", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "provideRecsPageSelectedListenerIntoSet", "provideTabSelectedProviderTabPageSelectedListener", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.app.dagger.module.main.MainViewModule$a */
    public static final class C2636a {
        private C2636a() {
        }

        @ActivityScope
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final List<MainPage> m9928a(@NotNull C11695a c11695a) {
            C2668g.m10309b(c11695a, "feedExperimentUtility");
            if (c11695a.d() != null) {
                return C19301m.b(new MainPage[]{MainPage.RECS, MainPage.MATCHES, MainPage.FEED, MainPage.PROFILE});
            }
            return C19301m.b(new MainPage[]{MainPage.PROFILE, MainPage.DISCOVERY, MainPage.MATCHES});
        }

        @DefaultMainPage
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: b */
        public final MainPage m9931b(@NotNull C11695a c11695a) {
            C2668g.m10309b(c11695a, "feedExperimentUtility");
            if (c11695a.d() != null) {
                return MainPage.RECS;
            }
            return MainPage.DISCOVERY;
        }

        @IntoSet
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9923a(@NotNull ManagerAnalytics managerAnalytics, @NotNull LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
            C2668g.m10309b(managerAnalytics, "managerAnalytics");
            C2668g.m10309b(legacyBreadCrumbTracker, "breadcrumbTracker");
            return new C11863a(managerAnalytics, legacyBreadCrumbTracker);
        }

        @IntoSet
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9922a(@NotNull C9695a c9695a) {
            C2668g.m10309b(c9695a, "homePageTabSelectedProvider");
            return new C12011i(c9695a);
        }

        @IntoSet
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9924a(@NotNull C9876b c9876b) {
            C2668g.m10309b(c9876b, "feedTabReselectedProvider");
            return new C12002b(c9876b);
        }

        @IntoSet
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9926a(@NotNull C14458a c14458a) {
            C2668g.m10309b(c14458a, "mainPageScrollStateChangedProvider");
            return new C12004e(c14458a);
        }

        @ElementsIntoSet
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final Set<OnPageSelectedListener> m9929a(@NotNull List<MainPage> list, @NotNull Map<MainPage, OnPageSelectedListener> map) {
            C2668g.m10309b(list, "activePages");
            C2668g.m10309b(map, "map");
            Collection arrayList = new ArrayList();
            for (MainPage mainPage : list) {
                OnPageSelectedListener onPageSelectedListener = (OnPageSelectedListener) map.get(mainPage);
                if (onPageSelectedListener != null) {
                    arrayList.add(onPageSelectedListener);
                }
            }
            return C19301m.n((List) arrayList);
        }

        @MainPageKey(MainPage.PROFILE)
        @ActivityScope
        @IntoMap
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9921a(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull AppVisibilityTracker appVisibilityTracker, @NotNull AbTestUtility abTestUtility) {
            C2668g.m10309b(checkTutorialViewed, "checkTutorialViewed");
            C2668g.m10309b(confirmTutorialsViewed, "confirmTutorialsViewed");
            C2668g.m10309b(appVisibilityTracker, "appVisibilityTracker");
            C2668g.m10309b(abTestUtility, "abTestUtility");
            return new C13393g(MainPage.PROFILE, checkTutorialViewed, confirmTutorialsViewed, appVisibilityTracker, abTestUtility);
        }

        @MainPageKey(MainPage.MATCHES)
        @ActivityScope
        @IntoMap
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9920a() {
            return new C13392f(MainPage.MATCHES);
        }

        @MainPageKey(MainPage.RECS)
        @ActivityScope
        @IntoMap
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: b */
        public final OnPageSelectedListener m9930b() {
            return new C12003d(MainPage.RECS);
        }

        @MainPageKey(MainPage.FEED)
        @ActivityScope
        @IntoMap
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: c */
        public final OnPageSelectedListener m9932c() {
            return new C13391c(MainPage.FEED);
        }

        @MainPageKey(MainPage.DISCOVERY)
        @ActivityScope
        @IntoMap
        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final OnPageSelectedListener m9925a(@NotNull C12421h c12421h, @NotNull C8890a c8890a, @NotNull C10271c c10271c, @NotNull Logger logger) {
            C2668g.m10309b(c12421h, "placesDiscoverToggleProvider");
            C2668g.m10309b(c8890a, "discoverySegmentRouter");
            C2668g.m10309b(c10271c, "placesFrontmostProvider");
            C2668g.m10309b(logger, "logger");
            return new C12001a(c12421h, c8890a, c10271c, logger);
        }

        @JvmStatic
        @NotNull
        @Provides
        /* renamed from: a */
        public final MainPageRouter m9927a(@NotNull MainActivity mainActivity, @NotNull C8301a c8301a) {
            C2668g.m10309b(mainActivity, "mainActivity");
            C2668g.m10309b(c8301a, "mainThreadExecutionVerifier");
            return new C11997a(mainActivity, c8301a);
        }
    }

    @MainPageKey(MainPage.MATCHES)
    @ActivityScope
    @IntoMap
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9933a() {
        return f8222a.m9920a();
    }

    @MainPageKey(MainPage.PROFILE)
    @ActivityScope
    @IntoMap
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9934a(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull AppVisibilityTracker appVisibilityTracker, @NotNull AbTestUtility abTestUtility) {
        return f8222a.m9921a(checkTutorialViewed, confirmTutorialsViewed, appVisibilityTracker, abTestUtility);
    }

    @IntoSet
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9935a(@NotNull C9695a c9695a) {
        return f8222a.m9922a(c9695a);
    }

    @IntoSet
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9936a(@NotNull ManagerAnalytics managerAnalytics, @NotNull LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        return f8222a.m9923a(managerAnalytics, legacyBreadCrumbTracker);
    }

    @IntoSet
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9937a(@NotNull C9876b c9876b) {
        return f8222a.m9924a(c9876b);
    }

    @MainPageKey(MainPage.DISCOVERY)
    @ActivityScope
    @IntoMap
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9938a(@NotNull C12421h c12421h, @NotNull C8890a c8890a, @NotNull C10271c c10271c, @NotNull Logger logger) {
        return f8222a.m9925a(c12421h, c8890a, c10271c, logger);
    }

    @IntoSet
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final OnPageSelectedListener m9939a(@NotNull C14458a c14458a) {
        return f8222a.m9926a(c14458a);
    }

    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final MainPageRouter m9940a(@NotNull MainActivity mainActivity, @NotNull C8301a c8301a) {
        return f8222a.m9927a(mainActivity, c8301a);
    }

    @ActivityScope
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final List<MainPage> m9941a(@NotNull C11695a c11695a) {
        return f8222a.m9928a(c11695a);
    }

    @ElementsIntoSet
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: a */
    public static final Set<OnPageSelectedListener> m9942a(@NotNull List<MainPage> list, @NotNull Map<MainPage, OnPageSelectedListener> map) {
        return f8222a.m9929a((List) list, (Map) map);
    }

    @MainPageKey(MainPage.RECS)
    @ActivityScope
    @IntoMap
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: b */
    public static final OnPageSelectedListener m9943b() {
        return f8222a.m9930b();
    }

    @DefaultMainPage
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: b */
    public static final MainPage m9944b(@NotNull C11695a c11695a) {
        return f8222a.m9931b(c11695a);
    }

    @MainPageKey(MainPage.FEED)
    @ActivityScope
    @IntoMap
    @JvmStatic
    @NotNull
    @Provides
    /* renamed from: c */
    public static final OnPageSelectedListener m9945c() {
        return f8222a.m9932c();
    }
}
