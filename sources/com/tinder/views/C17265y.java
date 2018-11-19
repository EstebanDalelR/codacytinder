package com.tinder.views;

import com.tinder.managers.ManagerAnalytics;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.views.y */
public final class C17265y implements MembersInjector<MapFrameLayout> {
    /* renamed from: a */
    private final Provider<ManagerAnalytics> f52933a;

    public /* synthetic */ void injectMembers(Object obj) {
        m63212a((MapFrameLayout) obj);
    }

    /* renamed from: a */
    public void m63212a(MapFrameLayout mapFrameLayout) {
        C17265y.m63211a(mapFrameLayout, (ManagerAnalytics) this.f52933a.get());
    }

    /* renamed from: a */
    public static void m63211a(MapFrameLayout mapFrameLayout, ManagerAnalytics managerAnalytics) {
        mapFrameLayout.f47786a = managerAnalytics;
    }
}
