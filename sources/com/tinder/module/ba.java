package com.tinder.module;

import com.tinder.purchase.domain.repository.OfferRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ba implements Factory<OfferRepository> {
    /* renamed from: a */
    private final au f42797a;

    public /* synthetic */ Object get() {
        return m52150a();
    }

    public ba(au auVar) {
        this.f42797a = auVar;
    }

    /* renamed from: a */
    public OfferRepository m52150a() {
        return m52147a(this.f42797a);
    }

    /* renamed from: a */
    public static OfferRepository m52147a(au auVar) {
        return m52149c(auVar);
    }

    /* renamed from: b */
    public static ba m52148b(au auVar) {
        return new ba(auVar);
    }

    /* renamed from: c */
    public static OfferRepository m52149c(au auVar) {
        return (OfferRepository) C15521i.a(auVar.m40783a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
