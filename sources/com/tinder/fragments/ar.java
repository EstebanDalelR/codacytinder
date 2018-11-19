package com.tinder.fragments;

import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ar implements MembersInjector<ap> {
    /* renamed from: a */
    private final Provider<LegacyBreadCrumbTracker> f38646a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47800a((ap) obj);
    }

    /* renamed from: a */
    public void m47800a(ap apVar) {
        m47799a(apVar, (LegacyBreadCrumbTracker) this.f38646a.get());
    }

    /* renamed from: a */
    public static void m47799a(ap apVar, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        apVar.f42210a = legacyBreadCrumbTracker;
    }
}
