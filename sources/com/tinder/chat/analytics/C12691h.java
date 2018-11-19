package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.h */
public final class C12691h implements Factory<C10531g> {
    /* renamed from: a */
    private final Provider<C2630h> f40971a;
    /* renamed from: b */
    private final Provider<C10522a> f40972b;

    public /* synthetic */ Object get() {
        return m49990a();
    }

    public C12691h(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40971a = provider;
        this.f40972b = provider2;
    }

    /* renamed from: a */
    public C10531g m49990a() {
        return C12691h.m49988a(this.f40971a, this.f40972b);
    }

    /* renamed from: a */
    public static C10531g m49988a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10531g((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12691h m49989b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12691h(provider, provider2);
    }
}
