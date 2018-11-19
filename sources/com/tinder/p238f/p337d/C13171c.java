package com.tinder.p238f.p337d;

import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.interactors.C9717h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.d.c */
public final class C13171c implements Factory<C11601a> {
    /* renamed from: a */
    private final Provider<MetaGateway> f41837a;
    /* renamed from: b */
    private final Provider<C9717h> f41838b;

    public /* synthetic */ Object get() {
        return m51097a();
    }

    public C13171c(Provider<MetaGateway> provider, Provider<C9717h> provider2) {
        this.f41837a = provider;
        this.f41838b = provider2;
    }

    /* renamed from: a */
    public C11601a m51097a() {
        return C13171c.m51095a(this.f41837a, this.f41838b);
    }

    /* renamed from: a */
    public static C11601a m51095a(Provider<MetaGateway> provider, Provider<C9717h> provider2) {
        return new C11601a((MetaGateway) provider.get(), (C9717h) provider2.get());
    }

    /* renamed from: b */
    public static C13171c m51096b(Provider<MetaGateway> provider, Provider<C9717h> provider2) {
        return new C13171c(provider, provider2);
    }
}
