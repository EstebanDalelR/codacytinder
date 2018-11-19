package com.tinder.intropricing.domain.worker;

import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.intropricing.domain.worker.b */
public final class C13350b implements Factory<C9733a> {
    /* renamed from: a */
    private final Provider<Set<IntroPricingWorker>> f42352a;

    public /* synthetic */ Object get() {
        return m51651a();
    }

    public C13350b(Provider<Set<IntroPricingWorker>> provider) {
        this.f42352a = provider;
    }

    /* renamed from: a */
    public C9733a m51651a() {
        return C13350b.m51649a(this.f42352a);
    }

    /* renamed from: a */
    public static C9733a m51649a(Provider<Set<IntroPricingWorker>> provider) {
        return new C9733a((Set) provider.get());
    }

    /* renamed from: b */
    public static C13350b m51650b(Provider<Set<IntroPricingWorker>> provider) {
        return new C13350b(provider);
    }
}
