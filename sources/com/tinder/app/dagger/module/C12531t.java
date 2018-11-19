package com.tinder.app.dagger.module;

import com.tinder.discovery.analytics.C11125b;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.tooltip.MainTabTooltipOwner;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.t */
public final class C12531t implements Factory<MainTabTooltipOwner> {
    /* renamed from: a */
    private final C8253o f40384a;
    /* renamed from: b */
    private final Provider<C13390c> f40385b;
    /* renamed from: c */
    private final Provider<C11125b> f40386c;

    public /* synthetic */ Object get() {
        return m49315a();
    }

    public C12531t(C8253o c8253o, Provider<C13390c> provider, Provider<C11125b> provider2) {
        this.f40384a = c8253o;
        this.f40385b = provider;
        this.f40386c = provider2;
    }

    /* renamed from: a */
    public MainTabTooltipOwner m49315a() {
        return C12531t.m49313a(this.f40384a, this.f40385b, this.f40386c);
    }

    /* renamed from: a */
    public static MainTabTooltipOwner m49313a(C8253o c8253o, Provider<C13390c> provider, Provider<C11125b> provider2) {
        return C12531t.m49312a(c8253o, C17281c.b(provider), (C11125b) provider2.get());
    }

    /* renamed from: b */
    public static C12531t m49314b(C8253o c8253o, Provider<C13390c> provider, Provider<C11125b> provider2) {
        return new C12531t(c8253o, provider, provider2);
    }

    /* renamed from: a */
    public static MainTabTooltipOwner m49312a(C8253o c8253o, Lazy<C13390c> lazy, C11125b c11125b) {
        return (MainTabTooltipOwner) C15521i.a(c8253o.m35221a((Lazy) lazy, c11125b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
