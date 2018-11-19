package com.tinder.fragments;

import com.tinder.api.ManagerNetwork;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.passport.p093d.C3945a;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class al implements MembersInjector<FragmentMap> {
    /* renamed from: a */
    private final Provider<C3945a> f38638a;
    /* renamed from: b */
    private final Provider<ManagerFusedLocation> f38639b;
    /* renamed from: c */
    private final Provider<ManagerNetwork> f38640c;
    /* renamed from: d */
    private final Provider<ManagerAnalytics> f38641d;
    /* renamed from: e */
    private final Provider<LegacyBreadCrumbTracker> f38642e;

    public /* synthetic */ void injectMembers(Object obj) {
        m47795a((FragmentMap) obj);
    }

    /* renamed from: a */
    public void m47795a(FragmentMap fragmentMap) {
        m47794a(fragmentMap, (C3945a) this.f38638a.get());
        m47793a(fragmentMap, (ManagerFusedLocation) this.f38639b.get());
        m47790a(fragmentMap, (ManagerNetwork) this.f38640c.get());
        m47792a(fragmentMap, (ManagerAnalytics) this.f38641d.get());
        m47791a(fragmentMap, (LegacyBreadCrumbTracker) this.f38642e.get());
    }

    /* renamed from: a */
    public static void m47794a(FragmentMap fragmentMap, C3945a c3945a) {
        fragmentMap.f44443a = c3945a;
    }

    /* renamed from: a */
    public static void m47793a(FragmentMap fragmentMap, ManagerFusedLocation managerFusedLocation) {
        fragmentMap.f44444b = managerFusedLocation;
    }

    /* renamed from: a */
    public static void m47790a(FragmentMap fragmentMap, ManagerNetwork managerNetwork) {
        fragmentMap.f44445c = managerNetwork;
    }

    /* renamed from: a */
    public static void m47792a(FragmentMap fragmentMap, ManagerAnalytics managerAnalytics) {
        fragmentMap.f44446d = managerAnalytics;
    }

    /* renamed from: a */
    public static void m47791a(FragmentMap fragmentMap, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        fragmentMap.f44447e = legacyBreadCrumbTracker;
    }
}
