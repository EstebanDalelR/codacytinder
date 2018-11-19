package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.r */
public final class C12701r implements Factory<C10537q> {
    /* renamed from: a */
    private final Provider<C2630h> f40985a;
    /* renamed from: b */
    private final Provider<C10522a> f40986b;

    public /* synthetic */ Object get() {
        return m50008a();
    }

    public C12701r(Provider<C2630h> provider, Provider<C10522a> provider2) {
        this.f40985a = provider;
        this.f40986b = provider2;
    }

    /* renamed from: a */
    public C10537q m50008a() {
        return C12701r.m50006a(this.f40985a, this.f40986b);
    }

    /* renamed from: a */
    public static C10537q m50006a(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C10537q((C2630h) provider.get(), (C10522a) provider2.get());
    }

    /* renamed from: b */
    public static C12701r m50007b(Provider<C2630h> provider, Provider<C10522a> provider2) {
        return new C12701r(provider, provider2);
    }
}
