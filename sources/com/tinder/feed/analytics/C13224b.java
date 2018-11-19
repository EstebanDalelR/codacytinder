package com.tinder.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.feed.analytics.session.C9450f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.b */
public final class C13224b implements Factory<C9432a> {
    /* renamed from: a */
    private final Provider<C9450f> f41941a;
    /* renamed from: b */
    private final Provider<C2630h> f41942b;

    public /* synthetic */ Object get() {
        return m51222a();
    }

    public C13224b(Provider<C9450f> provider, Provider<C2630h> provider2) {
        this.f41941a = provider;
        this.f41942b = provider2;
    }

    /* renamed from: a */
    public C9432a m51222a() {
        return C13224b.m51220a(this.f41941a, this.f41942b);
    }

    /* renamed from: a */
    public static C9432a m51220a(Provider<C9450f> provider, Provider<C2630h> provider2) {
        return new C9432a((C9450f) provider.get(), (C2630h) provider2.get());
    }

    /* renamed from: b */
    public static C13224b m51221b(Provider<C9450f> provider, Provider<C2630h> provider2) {
        return new C13224b(provider, provider2);
    }
}
