package com.tinder.core.experiment;

import com.tinder.common.provider.C8550g;
import com.tinder.core.experiment.PlacesToggleCollapseDetails.Variant;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.experiment.q */
public final class C12815q implements Factory<C8598o> {
    /* renamed from: a */
    private final Provider<C8593g<Variant>> f41221a;
    /* renamed from: b */
    private final Provider<C8550g> f41222b;

    public /* synthetic */ Object get() {
        return m50336a();
    }

    public C12815q(Provider<C8593g<Variant>> provider, Provider<C8550g> provider2) {
        this.f41221a = provider;
        this.f41222b = provider2;
    }

    /* renamed from: a */
    public C8598o m50336a() {
        return C12815q.m50334a(this.f41221a, this.f41222b);
    }

    /* renamed from: a */
    public static C8598o m50334a(Provider<C8593g<Variant>> provider, Provider<C8550g> provider2) {
        return new C8598o((C8593g) provider.get(), (C8550g) provider2.get());
    }

    /* renamed from: b */
    public static C12815q m50335b(Provider<C8593g<Variant>> provider, Provider<C8550g> provider2) {
        return new C12815q(provider, provider2);
    }
}
