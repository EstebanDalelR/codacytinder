package com.snapchat.kit.sdk.bitmoji.p143a.p144a;

import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.a.b */
public final class C7845b implements Factory<C5885a> {
    /* renamed from: a */
    private final Provider<KitEventBaseFactory> f28335a;
    /* renamed from: b */
    private final Provider<C5888f> f28336b;

    public /* synthetic */ Object get() {
        return m33623a();
    }

    public C7845b(Provider<KitEventBaseFactory> provider, Provider<C5888f> provider2) {
        this.f28335a = provider;
        this.f28336b = provider2;
    }

    /* renamed from: a */
    public C5885a m33623a() {
        return new C5885a((KitEventBaseFactory) this.f28335a.get(), (C5888f) this.f28336b.get());
    }

    /* renamed from: a */
    public static Factory<C5885a> m33622a(Provider<KitEventBaseFactory> provider, Provider<C5888f> provider2) {
        return new C7845b(provider, provider2);
    }
}
