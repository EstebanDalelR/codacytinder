package com.tinder.app.dagger.module.main;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.u */
public final class C12520u implements Factory<OnPageSelectedListener> {
    /* renamed from: a */
    private final Provider<ManagerAnalytics> f40354a;
    /* renamed from: b */
    private final Provider<LegacyBreadCrumbTracker> f40355b;

    public /* synthetic */ Object get() {
        return m49274a();
    }

    /* renamed from: a */
    public OnPageSelectedListener m49274a() {
        return C12520u.m49273a(this.f40354a, this.f40355b);
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49273a(Provider<ManagerAnalytics> provider, Provider<LegacyBreadCrumbTracker> provider2) {
        return C12520u.m49272a((ManagerAnalytics) provider.get(), (LegacyBreadCrumbTracker) provider2.get());
    }

    /* renamed from: a */
    public static OnPageSelectedListener m49272a(ManagerAnalytics managerAnalytics, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        return (OnPageSelectedListener) C15521i.a(MainViewModule.a(managerAnalytics, legacyBreadCrumbTracker), "Cannot return null from a non-@Nullable @Provides method");
    }
}
