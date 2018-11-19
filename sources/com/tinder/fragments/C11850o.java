package com.tinder.fragments;

import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerProfile;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fragments.o */
public final class C11850o implements MembersInjector<C13309n> {
    /* renamed from: a */
    private final Provider<ManagerProfile> f38661a;
    /* renamed from: b */
    private final Provider<LegacyBreadCrumbTracker> f38662b;

    public /* synthetic */ void injectMembers(Object obj) {
        m47814a((C13309n) obj);
    }

    /* renamed from: a */
    public void m47814a(C13309n c13309n) {
        C11850o.m47813a(c13309n, (ManagerProfile) this.f38661a.get());
        C11850o.m47812a(c13309n, (LegacyBreadCrumbTracker) this.f38662b.get());
    }

    /* renamed from: a */
    public static void m47813a(C13309n c13309n, ManagerProfile managerProfile) {
        c13309n.f42229b = managerProfile;
    }

    /* renamed from: a */
    public static void m47812a(C13309n c13309n, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        c13309n.f42230c = legacyBreadCrumbTracker;
    }
}
