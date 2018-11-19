package com.tinder.data.places;

import com.tinder.api.TinderApi;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.data.places.p329a.C10888a;
import com.tinder.data.places.p330b.C10897e;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.places.f */
public final class C13051f implements Factory<PlacesApiClient> {
    /* renamed from: a */
    private final Provider<TinderApi> f41601a;
    /* renamed from: b */
    private final Provider<C10888a> f41602b;
    /* renamed from: c */
    private final Provider<ConnectivityProvider> f41603c;
    /* renamed from: d */
    private final Provider<PlacesConfigProvider> f41604d;
    /* renamed from: e */
    private final Provider<C10897e> f41605e;
    /* renamed from: f */
    private final Provider<ResponseErrorAdapter> f41606f;

    public /* synthetic */ Object get() {
        return m50807a();
    }

    public C13051f(Provider<TinderApi> provider, Provider<C10888a> provider2, Provider<ConnectivityProvider> provider3, Provider<PlacesConfigProvider> provider4, Provider<C10897e> provider5, Provider<ResponseErrorAdapter> provider6) {
        this.f41601a = provider;
        this.f41602b = provider2;
        this.f41603c = provider3;
        this.f41604d = provider4;
        this.f41605e = provider5;
        this.f41606f = provider6;
    }

    /* renamed from: a */
    public PlacesApiClient m50807a() {
        return C13051f.m50805a(this.f41601a, this.f41602b, this.f41603c, this.f41604d, this.f41605e, this.f41606f);
    }

    /* renamed from: a */
    public static PlacesApiClient m50805a(Provider<TinderApi> provider, Provider<C10888a> provider2, Provider<ConnectivityProvider> provider3, Provider<PlacesConfigProvider> provider4, Provider<C10897e> provider5, Provider<ResponseErrorAdapter> provider6) {
        return new PlacesApiClient((TinderApi) provider.get(), (C10888a) provider2.get(), (ConnectivityProvider) provider3.get(), (PlacesConfigProvider) provider4.get(), (C10897e) provider5.get(), (ResponseErrorAdapter) provider6.get());
    }

    /* renamed from: b */
    public static C13051f m50806b(Provider<TinderApi> provider, Provider<C10888a> provider2, Provider<ConnectivityProvider> provider3, Provider<PlacesConfigProvider> provider4, Provider<C10897e> provider5, Provider<ResponseErrorAdapter> provider6) {
        return new C13051f(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
