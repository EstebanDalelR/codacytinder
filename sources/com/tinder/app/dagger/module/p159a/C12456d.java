package com.tinder.app.dagger.module.p159a;

import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.a.d */
public final class C12456d implements Factory<C8892a> {
    /* renamed from: a */
    private final C8243a f40163a;
    /* renamed from: b */
    private final Provider<DiscoveryTooltipOwner> f40164b;

    public /* synthetic */ Object get() {
        return m48964a();
    }

    public C12456d(C8243a c8243a, Provider<DiscoveryTooltipOwner> provider) {
        this.f40163a = c8243a;
        this.f40164b = provider;
    }

    /* renamed from: a */
    public C8892a m48964a() {
        return C12456d.m48962a(this.f40163a, this.f40164b);
    }

    /* renamed from: a */
    public static C8892a m48962a(C8243a c8243a, Provider<DiscoveryTooltipOwner> provider) {
        return C12456d.m48961a(c8243a, (DiscoveryTooltipOwner) provider.get());
    }

    /* renamed from: b */
    public static C12456d m48963b(C8243a c8243a, Provider<DiscoveryTooltipOwner> provider) {
        return new C12456d(c8243a, provider);
    }

    /* renamed from: a */
    public static C8892a m48961a(C8243a c8243a, DiscoveryTooltipOwner discoveryTooltipOwner) {
        return (C8892a) C15521i.a(c8243a.m35140a(discoveryTooltipOwner), "Cannot return null from a non-@Nullable @Provides method");
    }
}
