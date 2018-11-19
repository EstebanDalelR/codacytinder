package com.tinder.activities;

import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.f */
public final class C7281f implements MembersInjector<ActivityBanned> {
    /* renamed from: a */
    private final Provider<C2652a> f26292a;
    /* renamed from: b */
    private final Provider<C2664c> f26293b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f26294c;
    /* renamed from: d */
    private final Provider<LegacyBreadCrumbTracker> f26295d;

    public /* synthetic */ void injectMembers(Object obj) {
        m31146a((ActivityBanned) obj);
    }

    /* renamed from: a */
    public void m31146a(ActivityBanned activityBanned) {
        C7281f.m31144a(activityBanned, (C2652a) this.f26292a.get());
        C7281f.m31145a(activityBanned, (C2664c) this.f26293b.get());
        C7281f.m31143a(activityBanned, (ManagerAnalytics) this.f26294c.get());
        C7281f.m31142a(activityBanned, (LegacyBreadCrumbTracker) this.f26295d.get());
    }

    /* renamed from: a */
    public static void m31144a(ActivityBanned activityBanned, C2652a c2652a) {
        activityBanned.f22659a = c2652a;
    }

    /* renamed from: a */
    public static void m31145a(ActivityBanned activityBanned, C2664c c2664c) {
        activityBanned.f22660b = c2664c;
    }

    /* renamed from: a */
    public static void m31143a(ActivityBanned activityBanned, ManagerAnalytics managerAnalytics) {
        activityBanned.f22661c = managerAnalytics;
    }

    /* renamed from: a */
    public static void m31142a(ActivityBanned activityBanned, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        activityBanned.f22662d = legacyBreadCrumbTracker;
    }
}
