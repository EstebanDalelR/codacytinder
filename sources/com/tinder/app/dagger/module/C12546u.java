package com.tinder.app.dagger.module;

import com.tinder.main.tooltip.C12012a.C9833a;
import com.tinder.main.tooltip.MainTabTooltipOwner;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.u */
public final class C12546u implements Factory<C9833a> {
    /* renamed from: a */
    private final C8253o f40415a;
    /* renamed from: b */
    private final Provider<MainTabTooltipOwner> f40416b;

    public /* synthetic */ Object get() {
        return m49374a();
    }

    public C12546u(C8253o c8253o, Provider<MainTabTooltipOwner> provider) {
        this.f40415a = c8253o;
        this.f40416b = provider;
    }

    /* renamed from: a */
    public C9833a m49374a() {
        return C12546u.m49372a(this.f40415a, this.f40416b);
    }

    /* renamed from: a */
    public static C9833a m49372a(C8253o c8253o, Provider<MainTabTooltipOwner> provider) {
        return C12546u.m49371a(c8253o, C17281c.b(provider));
    }

    /* renamed from: b */
    public static C12546u m49373b(C8253o c8253o, Provider<MainTabTooltipOwner> provider) {
        return new C12546u(c8253o, provider);
    }

    /* renamed from: a */
    public static C9833a m49371a(C8253o c8253o, Lazy<MainTabTooltipOwner> lazy) {
        return (C9833a) C15521i.a(c8253o.m35222a((Lazy) lazy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
