package com.tinder.analytics.fireworks;

import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bj;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.fireworks.f */
public final class C8016f implements Factory<C7329e> {
    /* renamed from: a */
    private final Provider<C15193i> f28649a;
    /* renamed from: b */
    private final Provider<bj> f28650b;
    /* renamed from: c */
    private final Provider<ManagerProfile> f28651c;

    public /* synthetic */ Object get() {
        return m33921a();
    }

    public C8016f(Provider<C15193i> provider, Provider<bj> provider2, Provider<ManagerProfile> provider3) {
        this.f28649a = provider;
        this.f28650b = provider2;
        this.f28651c = provider3;
    }

    /* renamed from: a */
    public C7329e m33921a() {
        return C8016f.m33919a(this.f28649a, this.f28650b, this.f28651c);
    }

    /* renamed from: a */
    public static C7329e m33919a(Provider<C15193i> provider, Provider<bj> provider2, Provider<ManagerProfile> provider3) {
        return new C7329e((C15193i) provider.get(), (bj) provider2.get(), C17281c.b(provider3));
    }

    /* renamed from: b */
    public static C8016f m33920b(Provider<C15193i> provider, Provider<bj> provider2, Provider<ManagerProfile> provider3) {
        return new C8016f(provider, provider2, provider3);
    }
}
