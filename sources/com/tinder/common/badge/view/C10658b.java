package com.tinder.common.badge.view;

import com.tinder.common.badge.p190a.C8525a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.common.badge.view.b */
public final class C10658b implements MembersInjector<BadgeAttributionIcon> {
    /* renamed from: a */
    private final Provider<C8525a> f34959a;

    public /* synthetic */ void injectMembers(Object obj) {
        m42978a((BadgeAttributionIcon) obj);
    }

    /* renamed from: a */
    public void m42978a(BadgeAttributionIcon badgeAttributionIcon) {
        C10658b.m42977a(badgeAttributionIcon, (C8525a) this.f34959a.get());
    }

    /* renamed from: a */
    public static void m42977a(BadgeAttributionIcon badgeAttributionIcon, C8525a c8525a) {
        badgeAttributionIcon.f34953b = c8525a;
    }
}
