package com.tinder.data.feed;

import com.tinder.api.TinderApi;
import com.tinder.data.adapter.p208a.C10727b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.feed.a */
public final class C12872a implements Factory<FeedApiClient> {
    /* renamed from: a */
    private final Provider<TinderApi> f41323a;
    /* renamed from: b */
    private final Provider<C10727b> f41324b;

    public /* synthetic */ Object get() {
        return m50516a();
    }

    public C12872a(Provider<TinderApi> provider, Provider<C10727b> provider2) {
        this.f41323a = provider;
        this.f41324b = provider2;
    }

    /* renamed from: a */
    public FeedApiClient m50516a() {
        return C12872a.m50514a(this.f41323a, this.f41324b);
    }

    /* renamed from: a */
    public static FeedApiClient m50514a(Provider<TinderApi> provider, Provider<C10727b> provider2) {
        return new FeedApiClient((TinderApi) provider.get(), (C10727b) provider2.get());
    }

    /* renamed from: b */
    public static C12872a m50515b(Provider<TinderApi> provider, Provider<C10727b> provider2) {
        return new C12872a(provider, provider2);
    }
}
