package com.tinder.fragments;

import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class at implements MembersInjector<as> {
    /* renamed from: a */
    private final Provider<LegacyBreadCrumbTracker> f38647a;

    public /* synthetic */ void injectMembers(Object obj) {
        m47802a((as) obj);
    }

    /* renamed from: a */
    public void m47802a(as asVar) {
        m47801a(asVar, (LegacyBreadCrumbTracker) this.f38647a.get());
    }

    /* renamed from: a */
    public static void m47801a(as asVar, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        asVar.f42212b = legacyBreadCrumbTracker;
    }
}
