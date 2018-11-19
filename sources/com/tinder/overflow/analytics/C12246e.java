package com.tinder.overflow.analytics;

import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.aj;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.overflow.analytics.e */
public final class C12246e implements MembersInjector<RecommendProfileBroadcastReceiver> {
    /* renamed from: a */
    private final Provider<aj> f39631a;
    /* renamed from: b */
    private final Provider<C14386k> f39632b;

    public /* synthetic */ void injectMembers(Object obj) {
        m48446a((RecommendProfileBroadcastReceiver) obj);
    }

    /* renamed from: a */
    public void m48446a(RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver) {
        C12246e.m48444a(recommendProfileBroadcastReceiver, (aj) this.f39631a.get());
        C12246e.m48445a(recommendProfileBroadcastReceiver, (C14386k) this.f39632b.get());
    }

    /* renamed from: a */
    public static void m48444a(RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver, aj ajVar) {
        recommendProfileBroadcastReceiver.f32895a = ajVar;
    }

    /* renamed from: a */
    public static void m48445a(RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver, C14386k c14386k) {
        recommendProfileBroadcastReceiver.f32896b = c14386k;
    }
}
