package com.tinder.app.dagger.module;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import com.tinder.activities.MainActivity;
import com.tinder.ads.module.RecsAdsModule;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.tracker.recyclerview.rx.C10706a;
import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import com.tinder.home.lifecycleobserver.HomePageScreenNotifyingLifecycleObserver;
import com.tinder.home.navigation.C9703a;
import com.tinder.main.BackPressInterceptor;
import com.tinder.main.p345a.C11989a;
import com.tinder.main.p345a.C11990b;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.match.provider.C12079f;
import com.tinder.match.provider.MatchesSearchStateProvider;
import com.tinder.match.sponsoredmessage.C9882h;
import com.tinder.module.Published;
import com.tinder.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Published
@Module(includes = {RecsAdsModule.class, C9882h.class, C8253o.class})
/* renamed from: com.tinder.app.dagger.module.h */
public abstract class C8250h {
    @ActivityScope
    @Provides
    /* renamed from: a */
    static Lifecycle m35192a(MainActivity mainActivity) {
        return mainActivity.getLifecycle();
    }

    @ActivityScope
    @Provides
    /* renamed from: a */
    static MatchesSearchStateProvider m35195a() {
        return new C12079f();
    }

    @IntoSet
    @Provides
    /* renamed from: b */
    static BackPressInterceptor m35197b(MainActivity mainActivity) {
        return new C11989a(mainActivity);
    }

    @IntoSet
    @Provides
    /* renamed from: a */
    static BackPressInterceptor m35194a(MatchesSearchStateProvider matchesSearchStateProvider) {
        return new C11990b(matchesSearchStateProvider);
    }

    @IntoSet
    @MainActivityQualifier
    @Provides
    /* renamed from: a */
    static LifecycleObserver m35193a(C9703a c9703a, CurrentScreenNotifier currentScreenNotifier) {
        return new HomePageScreenNotifyingLifecycleObserver(c9703a, currentScreenNotifier);
    }

    @Provides
    /* renamed from: b */
    static ViewVisibleObserver m35196b() {
        return new C10706a();
    }
}
