package com.tinder.fragments;

import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerProfile;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fragments.p */
public final class C11851p implements MembersInjector<FragmentAgeMoreGender> {
    /* renamed from: a */
    private final Provider<ManagerProfile> f38663a;
    /* renamed from: b */
    private final Provider<LegacyBreadCrumbTracker> f38664b;

    public /* synthetic */ void injectMembers(Object obj) {
        m47817a((FragmentAgeMoreGender) obj);
    }

    /* renamed from: a */
    public void m47817a(FragmentAgeMoreGender fragmentAgeMoreGender) {
        C11851p.m47816a(fragmentAgeMoreGender, (ManagerProfile) this.f38663a.get());
        C11851p.m47815a(fragmentAgeMoreGender, (LegacyBreadCrumbTracker) this.f38664b.get());
    }

    /* renamed from: a */
    public static void m47816a(FragmentAgeMoreGender fragmentAgeMoreGender, ManagerProfile managerProfile) {
        fragmentAgeMoreGender.f42178b = managerProfile;
    }

    /* renamed from: a */
    public static void m47815a(FragmentAgeMoreGender fragmentAgeMoreGender, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        fragmentAgeMoreGender.f42179c = legacyBreadCrumbTracker;
    }
}
