package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ai implements Factory<ah> {
    /* renamed from: a */
    private final Provider<C2630h> f40946a;
    /* renamed from: b */
    private final Provider<C10522a> f40947b;

    public /* synthetic */ Object get() {
        return m49968a();
    }

    public ai(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40946a = provider;
        this.f40947b = provider2;
    }

    /* renamed from: a */
    public ah m49968a() {
        return m49966a(this.f40946a, this.f40947b);
    }

    /* renamed from: a */
    public static ah m49966a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new ah((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static ai m49967b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new ai(provider, provider2);
    }
}
