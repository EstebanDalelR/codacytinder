package com.tinder.app.dagger.module.toppicks;

import com.tinder.domain.config.TopPicksConfig;
import com.tinder.toppicks.p431b.C15234a;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.o */
public final class C12545o implements Factory<TopPicksConfig> {
    /* renamed from: a */
    private final TopPicksTinderApplicationModule f40413a;
    /* renamed from: b */
    private final Provider<C15234a> f40414b;

    public /* synthetic */ Object get() {
        return m49370a();
    }

    public C12545o(TopPicksTinderApplicationModule topPicksTinderApplicationModule, Provider<C15234a> provider) {
        this.f40413a = topPicksTinderApplicationModule;
        this.f40414b = provider;
    }

    /* renamed from: a */
    public TopPicksConfig m49370a() {
        return C12545o.m49368a(this.f40413a, this.f40414b);
    }

    /* renamed from: a */
    public static TopPicksConfig m49368a(TopPicksTinderApplicationModule topPicksTinderApplicationModule, Provider<C15234a> provider) {
        return C12545o.m49367a(topPicksTinderApplicationModule, C17281c.b(provider));
    }

    /* renamed from: b */
    public static C12545o m49369b(TopPicksTinderApplicationModule topPicksTinderApplicationModule, Provider<C15234a> provider) {
        return new C12545o(topPicksTinderApplicationModule, provider);
    }

    /* renamed from: a */
    public static TopPicksConfig m49367a(TopPicksTinderApplicationModule topPicksTinderApplicationModule, Lazy<C15234a> lazy) {
        return (TopPicksConfig) C15521i.a(topPicksTinderApplicationModule.m35227a(lazy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
