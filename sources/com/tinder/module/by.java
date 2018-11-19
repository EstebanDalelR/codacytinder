package com.tinder.module;

import com.google.gson.Gson;
import com.tinder.api.TinderApiClient;
import com.tinder.boost.repository.BoostStatusRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class by implements Factory<BoostStatusRepository> {
    /* renamed from: a */
    private final bs f42841a;
    /* renamed from: b */
    private final Provider<TinderApiClient> f42842b;
    /* renamed from: c */
    private final Provider<Gson> f42843c;

    public /* synthetic */ Object get() {
        return m52220a();
    }

    public by(bs bsVar, Provider<TinderApiClient> provider, Provider<Gson> provider2) {
        this.f42841a = bsVar;
        this.f42842b = provider;
        this.f42843c = provider2;
    }

    /* renamed from: a */
    public BoostStatusRepository m52220a() {
        return m52218a(this.f42841a, this.f42842b, this.f42843c);
    }

    /* renamed from: a */
    public static BoostStatusRepository m52218a(bs bsVar, Provider<TinderApiClient> provider, Provider<Gson> provider2) {
        return m52217a(bsVar, (TinderApiClient) provider.get(), (Gson) provider2.get());
    }

    /* renamed from: b */
    public static by m52219b(bs bsVar, Provider<TinderApiClient> provider, Provider<Gson> provider2) {
        return new by(bsVar, provider, provider2);
    }

    /* renamed from: a */
    public static BoostStatusRepository m52217a(bs bsVar, TinderApiClient tinderApiClient, Gson gson) {
        return (BoostStatusRepository) C15521i.a(bsVar.m40803a(tinderApiClient, gson), "Cannot return null from a non-@Nullable @Provides method");
    }
}
