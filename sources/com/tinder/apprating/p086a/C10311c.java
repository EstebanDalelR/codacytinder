package com.tinder.apprating.p086a;

import com.tinder.managers.ManagerAnalytics;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.apprating.a.c */
public final class C10311c implements MembersInjector<C8257a> {
    /* renamed from: a */
    private final Provider<C8260f> f33699a;
    /* renamed from: b */
    private final Provider<ManagerAnalytics> f33700b;

    public /* synthetic */ void injectMembers(Object obj) {
        m42087a((C8257a) obj);
    }

    /* renamed from: a */
    public void m42087a(C8257a c8257a) {
        C10311c.m42085a(c8257a, (C8260f) this.f33699a.get());
        C10311c.m42086a(c8257a, (ManagerAnalytics) this.f33700b.get());
    }

    /* renamed from: a */
    public static void m42085a(C8257a c8257a, C8260f c8260f) {
        c8257a.f29468a = c8260f;
    }

    /* renamed from: a */
    public static void m42086a(C8257a c8257a, ManagerAnalytics managerAnalytics) {
        c8257a.f29469b = managerAnalytics;
    }
}
