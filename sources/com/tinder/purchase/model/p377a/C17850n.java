package com.tinder.purchase.model.p377a;

import com.tinder.data.profile.adapter.ad;
import com.tinder.data.profile.adapter.aj;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.model.a.n */
public final class C17850n implements Factory<C14529b> {
    /* renamed from: a */
    private final Provider<ad> f55686a;
    /* renamed from: b */
    private final Provider<aj> f55687b;

    public /* synthetic */ Object get() {
        return m65134a();
    }

    public C17850n(Provider<ad> provider, Provider<aj> provider2) {
        this.f55686a = provider;
        this.f55687b = provider2;
    }

    /* renamed from: a */
    public C14529b m65134a() {
        return C17850n.m65132a(this.f55686a, this.f55687b);
    }

    /* renamed from: a */
    public static C14529b m65132a(Provider<ad> provider, Provider<aj> provider2) {
        return new C14529b((ad) provider.get(), (aj) provider2.get());
    }

    /* renamed from: b */
    public static C17850n m65133b(Provider<ad> provider, Provider<aj> provider2) {
        return new C17850n(provider, provider2);
    }
}
