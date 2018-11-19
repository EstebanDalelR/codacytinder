package com.tinder.places.p311f;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.google.gson.Gson;
import com.tinder.analytics.performance.C8157y;
import com.tinder.common.logger.Logger;
import com.tinder.data.places.PlacesApiClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.f.k */
public final class C13576k implements Factory<C12346j> {
    /* renamed from: a */
    private final Provider<PlacesApiClient> f43313a;
    /* renamed from: b */
    private final Provider<FirebaseJobDispatcher> f43314b;
    /* renamed from: c */
    private final Provider<Gson> f43315c;
    /* renamed from: d */
    private final Provider<C8157y> f43316d;
    /* renamed from: e */
    private final Provider<Logger> f43317e;

    public /* synthetic */ Object get() {
        return m52998a();
    }

    public C13576k(Provider<PlacesApiClient> provider, Provider<FirebaseJobDispatcher> provider2, Provider<Gson> provider3, Provider<C8157y> provider4, Provider<Logger> provider5) {
        this.f43313a = provider;
        this.f43314b = provider2;
        this.f43315c = provider3;
        this.f43316d = provider4;
        this.f43317e = provider5;
    }

    /* renamed from: a */
    public C12346j m52998a() {
        return C13576k.m52996a(this.f43313a, this.f43314b, this.f43315c, this.f43316d, this.f43317e);
    }

    /* renamed from: a */
    public static C12346j m52996a(Provider<PlacesApiClient> provider, Provider<FirebaseJobDispatcher> provider2, Provider<Gson> provider3, Provider<C8157y> provider4, Provider<Logger> provider5) {
        return new C12346j((PlacesApiClient) provider.get(), (FirebaseJobDispatcher) provider2.get(), (Gson) provider3.get(), (C8157y) provider4.get(), (Logger) provider5.get());
    }

    /* renamed from: b */
    public static C13576k m52997b(Provider<PlacesApiClient> provider, Provider<FirebaseJobDispatcher> provider2, Provider<Gson> provider3, Provider<C8157y> provider4, Provider<Logger> provider5) {
        return new C13576k(provider, provider2, provider3, provider4, provider5);
    }
}
