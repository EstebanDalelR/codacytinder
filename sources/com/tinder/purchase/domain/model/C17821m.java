package com.tinder.purchase.domain.model;

import com.tinder.purchase.domain.repository.OfferRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.domain.model.m */
public final class C17821m implements Factory<C14517l> {
    /* renamed from: a */
    private final Provider<OfferRepository> f55633a;
    /* renamed from: b */
    private final Provider<TransactionSuccessMessageTypeFactory> f55634b;

    public /* synthetic */ Object get() {
        return m65112a();
    }

    public C17821m(Provider<OfferRepository> provider, Provider<TransactionSuccessMessageTypeFactory> provider2) {
        this.f55633a = provider;
        this.f55634b = provider2;
    }

    /* renamed from: a */
    public C14517l m65112a() {
        return C17821m.m65110a(this.f55633a, this.f55634b);
    }

    /* renamed from: a */
    public static C14517l m65110a(Provider<OfferRepository> provider, Provider<TransactionSuccessMessageTypeFactory> provider2) {
        return new C14517l((OfferRepository) provider.get(), (TransactionSuccessMessageTypeFactory) provider2.get());
    }

    /* renamed from: b */
    public static C17821m m65111b(Provider<OfferRepository> provider, Provider<TransactionSuccessMessageTypeFactory> provider2) {
        return new C17821m(provider, provider2);
    }
}
