package com.tinder.reactions.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.match.usecase.GetMatch;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.analytics.i */
public final class C17912i implements Factory<C16277h> {
    /* renamed from: a */
    private final Provider<C2630h> f55814a;
    /* renamed from: b */
    private final Provider<GetMatch> f55815b;

    public /* synthetic */ Object get() {
        return m65217a();
    }

    public C17912i(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        this.f55814a = provider;
        this.f55815b = provider2;
    }

    /* renamed from: a */
    public C16277h m65217a() {
        return C17912i.m65215a(this.f55814a, this.f55815b);
    }

    /* renamed from: a */
    public static C16277h m65215a(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        return new C16277h((C2630h) provider.get(), (GetMatch) provider2.get());
    }

    /* renamed from: b */
    public static C17912i m65216b(Provider<C2630h> provider, Provider<GetMatch> provider2) {
        return new C17912i(provider, provider2);
    }
}
