package com.tinder.fragments;

import com.tinder.api.ManagerNetwork;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fragments.m */
public final class C11849m implements MembersInjector<C13308g> {
    /* renamed from: a */
    private final Provider<FacebookManager> f38658a;
    /* renamed from: b */
    private final Provider<ManagerNetwork> f38659b;
    /* renamed from: c */
    private final Provider<LegacyBreadCrumbTracker> f38660c;

    public /* synthetic */ void injectMembers(Object obj) {
        m47811a((C13308g) obj);
    }

    /* renamed from: a */
    public void m47811a(C13308g c13308g) {
        C11849m.m47809a(c13308g, (FacebookManager) this.f38658a.get());
        C11849m.m47808a(c13308g, (ManagerNetwork) this.f38659b.get());
        C11849m.m47810a(c13308g, (LegacyBreadCrumbTracker) this.f38660c.get());
    }

    /* renamed from: a */
    public static void m47809a(C13308g c13308g, FacebookManager facebookManager) {
        c13308g.f42215a = facebookManager;
    }

    /* renamed from: a */
    public static void m47808a(C13308g c13308g, ManagerNetwork managerNetwork) {
        c13308g.f42216b = managerNetwork;
    }

    /* renamed from: a */
    public static void m47810a(C13308g c13308g, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        c13308g.f42217c = legacyBreadCrumbTracker;
    }
}
