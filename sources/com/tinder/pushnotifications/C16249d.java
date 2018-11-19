package com.tinder.pushnotifications;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.pushnotifications.p380a.C14548a;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.d */
public final class C16249d implements MembersInjector<TinderGcmListenerService> {
    /* renamed from: a */
    private final Provider<C14550a> f50620a;
    /* renamed from: b */
    private final Provider<C2630h> f50621b;
    /* renamed from: c */
    private final Provider<C14548a> f50622c;
    /* renamed from: d */
    private final Provider<FastMatchConfigProvider> f50623d;
    /* renamed from: e */
    private final Provider<ManagerAnalytics> f50624e;

    public /* synthetic */ void injectMembers(Object obj) {
        m61406a((TinderGcmListenerService) obj);
    }

    /* renamed from: a */
    public void m61406a(TinderGcmListenerService tinderGcmListenerService) {
        C16249d.m61405a(tinderGcmListenerService, (C14550a) this.f50620a.get());
        C16249d.m61401a(tinderGcmListenerService, (C2630h) this.f50621b.get());
        C16249d.m61404a(tinderGcmListenerService, (C14548a) this.f50622c.get());
        C16249d.m61402a(tinderGcmListenerService, (FastMatchConfigProvider) this.f50623d.get());
        C16249d.m61403a(tinderGcmListenerService, (ManagerAnalytics) this.f50624e.get());
    }

    /* renamed from: a */
    public static void m61405a(TinderGcmListenerService tinderGcmListenerService, C14550a c14550a) {
        tinderGcmListenerService.f58110a = c14550a;
    }

    /* renamed from: a */
    public static void m61401a(TinderGcmListenerService tinderGcmListenerService, C2630h c2630h) {
        tinderGcmListenerService.f58111b = c2630h;
    }

    /* renamed from: a */
    public static void m61404a(TinderGcmListenerService tinderGcmListenerService, C14548a c14548a) {
        tinderGcmListenerService.f58112c = c14548a;
    }

    /* renamed from: a */
    public static void m61402a(TinderGcmListenerService tinderGcmListenerService, FastMatchConfigProvider fastMatchConfigProvider) {
        tinderGcmListenerService.f58113d = fastMatchConfigProvider;
    }

    /* renamed from: a */
    public static void m61403a(TinderGcmListenerService tinderGcmListenerService, ManagerAnalytics managerAnalytics) {
        tinderGcmListenerService.f58114e = managerAnalytics;
    }
}
