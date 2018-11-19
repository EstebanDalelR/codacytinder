package com.tinder.fastmatch.newcount;

import com.tinder.boost.provider.C2639c;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.newcount.d */
public final class C13200d implements Factory<C9381b> {
    /* renamed from: a */
    private final Provider<C2639c> f41902a;
    /* renamed from: b */
    private final Provider<FastMatchConfigProvider> f41903b;

    public /* synthetic */ Object get() {
        return m51182a();
    }

    public C13200d(Provider<C2639c> provider, Provider<FastMatchConfigProvider> provider2) {
        this.f41902a = provider;
        this.f41903b = provider2;
    }

    /* renamed from: a */
    public C9381b m51182a() {
        return C13200d.m51180a(this.f41902a, this.f41903b);
    }

    /* renamed from: a */
    public static C9381b m51180a(Provider<C2639c> provider, Provider<FastMatchConfigProvider> provider2) {
        return new C9381b((C2639c) provider.get(), (FastMatchConfigProvider) provider2.get());
    }

    /* renamed from: b */
    public static C13200d m51181b(Provider<C2639c> provider, Provider<FastMatchConfigProvider> provider2) {
        return new C13200d(provider, provider2);
    }
}
