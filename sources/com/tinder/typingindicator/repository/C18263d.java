package com.tinder.typingindicator.repository;

import com.tinder.data.p222i.C8669a;
import com.tinder.typingindicator.api.C15314a;
import com.tinder.typingindicator.p441g.C15321a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.repository.d */
public final class C18263d implements Factory<C17168c> {
    /* renamed from: a */
    private final Provider<C8669a> f56579a;
    /* renamed from: b */
    private final Provider<C15314a> f56580b;
    /* renamed from: c */
    private final Provider<C15321a> f56581c;

    public /* synthetic */ Object get() {
        return m66167a();
    }

    public C18263d(Provider<C8669a> provider, Provider<C15314a> provider2, Provider<C15321a> provider3) {
        this.f56579a = provider;
        this.f56580b = provider2;
        this.f56581c = provider3;
    }

    /* renamed from: a */
    public C17168c m66167a() {
        return C18263d.m66165a(this.f56579a, this.f56580b, this.f56581c);
    }

    /* renamed from: a */
    public static C17168c m66165a(Provider<C8669a> provider, Provider<C15314a> provider2, Provider<C15321a> provider3) {
        return new C17168c((C8669a) provider.get(), (C15314a) provider2.get(), (C15321a) provider3.get());
    }

    /* renamed from: b */
    public static C18263d m66166b(Provider<C8669a> provider, Provider<C15314a> provider2, Provider<C15321a> provider3) {
        return new C18263d(provider, provider2, provider3);
    }
}
