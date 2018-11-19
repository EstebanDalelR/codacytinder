package com.tinder.utils;

import com.tinder.analytics.C2634g;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.pushnotifications.p381b.C14552c;
import com.tinder.pushnotifications.usecase.NotifyPushServer;
import com.tinder.tinderplus.p428a.C15192e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.utils.j */
public final class C17231j implements MembersInjector<AppLifeCycleTracker> {
    /* renamed from: a */
    private final Provider<C2652a> f52816a;
    /* renamed from: b */
    private final Provider<ManagerFusedLocation> f52817b;
    /* renamed from: c */
    private final Provider<ManagerDeepLinking> f52818c;
    /* renamed from: d */
    private final Provider<C2630h> f52819d;
    /* renamed from: e */
    private final Provider<ManagerAnalytics> f52820e;
    /* renamed from: f */
    private final Provider<C2634g> f52821f;
    /* renamed from: g */
    private final Provider<C15192e> f52822g;
    /* renamed from: h */
    private final Provider<OfferRepository> f52823h;
    /* renamed from: i */
    private final Provider<NotifyPushServer> f52824i;
    /* renamed from: j */
    private final Provider<C14552c> f52825j;

    public /* synthetic */ void injectMembers(Object obj) {
        m63132a((AppLifeCycleTracker) obj);
    }

    /* renamed from: a */
    public void m63132a(AppLifeCycleTracker appLifeCycleTracker) {
        C17231j.m63127a(appLifeCycleTracker, (C2652a) this.f52816a.get());
        C17231j.m63126a(appLifeCycleTracker, (ManagerFusedLocation) this.f52817b.get());
        C17231j.m63125a(appLifeCycleTracker, (ManagerDeepLinking) this.f52818c.get());
        C17231j.m63122a(appLifeCycleTracker, (C2630h) this.f52819d.get());
        C17231j.m63124a(appLifeCycleTracker, (ManagerAnalytics) this.f52820e.get());
        C17231j.m63123a(appLifeCycleTracker, (C2634g) this.f52821f.get());
        C17231j.m63131a(appLifeCycleTracker, (C15192e) this.f52822g.get());
        C17231j.m63128a(appLifeCycleTracker, (OfferRepository) this.f52823h.get());
        C17231j.m63130a(appLifeCycleTracker, (NotifyPushServer) this.f52824i.get());
        C17231j.m63129a(appLifeCycleTracker, (C14552c) this.f52825j.get());
    }

    /* renamed from: a */
    public static void m63127a(AppLifeCycleTracker appLifeCycleTracker, C2652a c2652a) {
        appLifeCycleTracker.f8383b = c2652a;
    }

    /* renamed from: a */
    public static void m63126a(AppLifeCycleTracker appLifeCycleTracker, ManagerFusedLocation managerFusedLocation) {
        appLifeCycleTracker.f8384c = managerFusedLocation;
    }

    /* renamed from: a */
    public static void m63125a(AppLifeCycleTracker appLifeCycleTracker, ManagerDeepLinking managerDeepLinking) {
        appLifeCycleTracker.f8385d = managerDeepLinking;
    }

    /* renamed from: a */
    public static void m63122a(AppLifeCycleTracker appLifeCycleTracker, C2630h c2630h) {
        appLifeCycleTracker.f8386e = c2630h;
    }

    /* renamed from: a */
    public static void m63124a(AppLifeCycleTracker appLifeCycleTracker, ManagerAnalytics managerAnalytics) {
        appLifeCycleTracker.f8387f = managerAnalytics;
    }

    /* renamed from: a */
    public static void m63123a(AppLifeCycleTracker appLifeCycleTracker, C2634g c2634g) {
        appLifeCycleTracker.f8388g = c2634g;
    }

    /* renamed from: a */
    public static void m63131a(AppLifeCycleTracker appLifeCycleTracker, C15192e c15192e) {
        appLifeCycleTracker.f8389h = c15192e;
    }

    /* renamed from: a */
    public static void m63128a(AppLifeCycleTracker appLifeCycleTracker, OfferRepository offerRepository) {
        appLifeCycleTracker.f8390i = offerRepository;
    }

    /* renamed from: a */
    public static void m63130a(AppLifeCycleTracker appLifeCycleTracker, NotifyPushServer notifyPushServer) {
        appLifeCycleTracker.f8391j = notifyPushServer;
    }

    /* renamed from: a */
    public static void m63129a(AppLifeCycleTracker appLifeCycleTracker, C14552c c14552c) {
        appLifeCycleTracker.f8392k = c14552c;
    }
}
