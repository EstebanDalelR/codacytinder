package com.tinder.activities;

import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.i */
public final class C7284i implements MembersInjector<ActivityGiphy> {
    /* renamed from: a */
    private final Provider<C2664c> f26317a;
    /* renamed from: b */
    private final Provider<LegacyBreadCrumbTracker> f26318b;

    public /* synthetic */ void injectMembers(Object obj) {
        m31152a((ActivityGiphy) obj);
    }

    /* renamed from: a */
    public void m31152a(ActivityGiphy activityGiphy) {
        C7284i.m31151a(activityGiphy, (C2664c) this.f26317a.get());
        C7284i.m31150a(activityGiphy, (LegacyBreadCrumbTracker) this.f26318b.get());
    }

    /* renamed from: a */
    public static void m31151a(ActivityGiphy activityGiphy, C2664c c2664c) {
        activityGiphy.f29421a = c2664c;
    }

    /* renamed from: a */
    public static void m31150a(ActivityGiphy activityGiphy, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityGiphy.f29422b = legacyBreadCrumbTracker;
    }
}
