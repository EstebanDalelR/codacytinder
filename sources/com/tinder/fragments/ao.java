package com.tinder.fragments;

import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ao implements MembersInjector<am> {
    /* renamed from: a */
    private final Provider<FacebookManager> f38644a;
    /* renamed from: b */
    private final Provider<LegacyBreadCrumbTracker> f38645b;

    public /* synthetic */ void injectMembers(Object obj) {
        m47798a((am) obj);
    }

    /* renamed from: a */
    public void m47798a(am amVar) {
        m47796a(amVar, (FacebookManager) this.f38644a.get());
        m47797a(amVar, (LegacyBreadCrumbTracker) this.f38645b.get());
    }

    /* renamed from: a */
    public static void m47796a(am amVar, FacebookManager facebookManager) {
        amVar.f42202a = facebookManager;
    }

    /* renamed from: a */
    public static void m47797a(am amVar, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        amVar.f42203b = legacyBreadCrumbTracker;
    }
}
