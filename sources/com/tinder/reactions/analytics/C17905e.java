package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.match.usecase.GetMatch;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.analytics.e */
public final class C17905e implements Factory<C16274d> {
    /* renamed from: a */
    private final Provider<C2630h> f55806a;
    /* renamed from: b */
    private final Provider<GetMatch> f55807b;

    public /* synthetic */ Object get() {
        return m65208a();
    }

    public C17905e(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        this.f55806a = provider;
        this.f55807b = provider2;
    }

    /* renamed from: a */
    public C16274d m65208a() {
        return C17905e.m65206a(this.f55806a, this.f55807b);
    }

    /* renamed from: a */
    public static C16274d m65206a(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        return new C16274d((C2630h) provider.get(), (GetMatch) provider2.get());
    }

    /* renamed from: b */
    public static C17905e m65207b(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        return new C17905e(provider, provider2);
    }
}
