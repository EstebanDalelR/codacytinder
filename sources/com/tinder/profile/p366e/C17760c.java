package com.tinder.profile.p366e;

import android.content.res.Resources;
import com.tinder.boost.p178a.C10400d;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.paywall.p305d.C10057a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.e.c */
public final class C17760c implements Factory<C14409b> {
    /* renamed from: a */
    private final Provider<CurrentUserProvider> f55411a;
    /* renamed from: b */
    private final Provider<C10400d> f55412b;
    /* renamed from: c */
    private final Provider<C10057a> f55413c;
    /* renamed from: d */
    private final Provider<Resources> f55414d;
    /* renamed from: e */
    private final Provider<SubscriptionProvider> f55415e;
    /* renamed from: f */
    private final Provider<FastMatchConfigProvider> f55416f;

    public /* synthetic */ Object get() {
        return m64930a();
    }

    public C17760c(Provider<CurrentUserProvider> provider, Provider<C10400d> provider2, Provider<C10057a> provider3, Provider<Resources> provider4, Provider<SubscriptionProvider> provider5, Provider<FastMatchConfigProvider> provider6) {
        this.f55411a = provider;
        this.f55412b = provider2;
        this.f55413c = provider3;
        this.f55414d = provider4;
        this.f55415e = provider5;
        this.f55416f = provider6;
    }

    /* renamed from: a */
    public C14409b m64930a() {
        return C17760c.m64928a(this.f55411a, this.f55412b, this.f55413c, this.f55414d, this.f55415e, this.f55416f);
    }

    /* renamed from: a */
    public static C14409b m64928a(Provider<CurrentUserProvider> provider, Provider<C10400d> provider2, Provider<C10057a> provider3, Provider<Resources> provider4, Provider<SubscriptionProvider> provider5, Provider<FastMatchConfigProvider> provider6) {
        return new C14409b((CurrentUserProvider) provider.get(), (C10400d) provider2.get(), (C10057a) provider3.get(), (Resources) provider4.get(), (SubscriptionProvider) provider5.get(), (FastMatchConfigProvider) provider6.get());
    }

    /* renamed from: b */
    public static C17760c m64929b(Provider<CurrentUserProvider> provider, Provider<C10400d> provider2, Provider<C10057a> provider3, Provider<Resources> provider4, Provider<SubscriptionProvider> provider5, Provider<FastMatchConfigProvider> provider6) {
        return new C17760c(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
