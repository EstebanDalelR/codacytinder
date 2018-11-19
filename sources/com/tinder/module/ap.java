package com.tinder.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.p152a.C7309c;
import com.tinder.managers.ManagerAnalytics;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ap implements Factory<ManagerAnalytics> {
    /* renamed from: a */
    private final aa f42775a;
    /* renamed from: b */
    private final Provider<C2630h> f42776b;
    /* renamed from: c */
    private final Provider<C7309c> f42777c;

    public /* synthetic */ Object get() {
        return m52110a();
    }

    public ap(aa aaVar, Provider<C2630h> provider, Provider<C7309c> provider2) {
        this.f42775a = aaVar;
        this.f42776b = provider;
        this.f42777c = provider2;
    }

    /* renamed from: a */
    public ManagerAnalytics m52110a() {
        return m52108a(this.f42775a, this.f42776b, this.f42777c);
    }

    /* renamed from: a */
    public static ManagerAnalytics m52108a(aa aaVar, Provider<C2630h> provider, Provider<C7309c> provider2) {
        return m52107a(aaVar, (C2630h) provider.get(), (C7309c) provider2.get());
    }

    /* renamed from: b */
    public static ap m52109b(aa aaVar, Provider<C2630h> provider, Provider<C7309c> provider2) {
        return new ap(aaVar, provider, provider2);
    }

    /* renamed from: a */
    public static ManagerAnalytics m52107a(aa aaVar, C2630h c2630h, C7309c c7309c) {
        return (ManagerAnalytics) C15521i.a(aaVar.m40774a(c2630h, c7309c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
