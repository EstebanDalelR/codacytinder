package com.tinder.module;

import com.tinder.analytics.performance.C8157y;
import com.tinder.data.places.C8747h;
import com.tinder.data.places.PlacesApiClient;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.recs.RecsEngineRegistry;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dj implements Factory<PlacesRepository> {
    /* renamed from: a */
    private final bs f42915a;
    /* renamed from: b */
    private final Provider<C8747h> f42916b;
    /* renamed from: c */
    private final Provider<PlacesApiClient> f42917c;
    /* renamed from: d */
    private final Provider<C8736b> f42918d;
    /* renamed from: e */
    private final Provider<RecsEngineRegistry> f42919e;
    /* renamed from: f */
    private final Provider<C8157y> f42920f;

    public /* synthetic */ Object get() {
        return m52369a();
    }

    public dj(bs bsVar, Provider<C8747h> provider, Provider<PlacesApiClient> provider2, Provider<C8736b> provider3, Provider<RecsEngineRegistry> provider4, Provider<C8157y> provider5) {
        this.f42915a = bsVar;
        this.f42916b = provider;
        this.f42917c = provider2;
        this.f42918d = provider3;
        this.f42919e = provider4;
        this.f42920f = provider5;
    }

    /* renamed from: a */
    public PlacesRepository m52369a() {
        return m52367a(this.f42915a, this.f42916b, this.f42917c, this.f42918d, this.f42919e, this.f42920f);
    }

    /* renamed from: a */
    public static PlacesRepository m52367a(bs bsVar, Provider<C8747h> provider, Provider<PlacesApiClient> provider2, Provider<C8736b> provider3, Provider<RecsEngineRegistry> provider4, Provider<C8157y> provider5) {
        return m52366a(bsVar, (C8747h) provider.get(), (PlacesApiClient) provider2.get(), (C8736b) provider3.get(), (RecsEngineRegistry) provider4.get(), (C8157y) provider5.get());
    }

    /* renamed from: b */
    public static dj m52368b(bs bsVar, Provider<C8747h> provider, Provider<PlacesApiClient> provider2, Provider<C8736b> provider3, Provider<RecsEngineRegistry> provider4, Provider<C8157y> provider5) {
        return new dj(bsVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static PlacesRepository m52366a(bs bsVar, C8747h c8747h, PlacesApiClient placesApiClient, C8736b c8736b, RecsEngineRegistry recsEngineRegistry, C8157y c8157y) {
        return (PlacesRepository) C15521i.a(bsVar.m40811a(c8747h, placesApiClient, c8736b, recsEngineRegistry, c8157y), "Cannot return null from a non-@Nullable @Provides method");
    }
}
