package com.tinder.places.tracker;

import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.places.logging.PlacesLogger;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.places.analytics.C10120j;
import com.tinder.places.p311f.C12346j;
import com.tinder.places.provider.PlacesEnabledProvider;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.places.tracker.d */
public final class C17737d implements Factory<TinderTracker> {
    /* renamed from: a */
    private final Provider<PilgrimLocationTracker> f55193a;
    /* renamed from: b */
    private final Provider<PlacesAvailableProvider> f55194b;
    /* renamed from: c */
    private final Provider<C12346j> f55195c;
    /* renamed from: d */
    private final Provider<PlacesLogger> f55196d;
    /* renamed from: e */
    private final Provider<PlacesEnabledProvider> f55197e;
    /* renamed from: f */
    private final Provider<AuthStatusRepository> f55198f;
    /* renamed from: g */
    private final Provider<C10120j> f55199g;
    /* renamed from: h */
    private final Provider<C15679f> f55200h;

    public /* synthetic */ Object get() {
        return m64618a();
    }

    public C17737d(Provider<PilgrimLocationTracker> provider, Provider<PlacesAvailableProvider> provider2, Provider<C12346j> provider3, Provider<PlacesLogger> provider4, Provider<PlacesEnabledProvider> provider5, Provider<AuthStatusRepository> provider6, Provider<C10120j> provider7, Provider<C15679f> provider8) {
        this.f55193a = provider;
        this.f55194b = provider2;
        this.f55195c = provider3;
        this.f55196d = provider4;
        this.f55197e = provider5;
        this.f55198f = provider6;
        this.f55199g = provider7;
        this.f55200h = provider8;
    }

    /* renamed from: a */
    public TinderTracker m64618a() {
        return C17737d.m64616a(this.f55193a, this.f55194b, this.f55195c, this.f55196d, this.f55197e, this.f55198f, this.f55199g, this.f55200h);
    }

    /* renamed from: a */
    public static TinderTracker m64616a(Provider<PilgrimLocationTracker> provider, Provider<PlacesAvailableProvider> provider2, Provider<C12346j> provider3, Provider<PlacesLogger> provider4, Provider<PlacesEnabledProvider> provider5, Provider<AuthStatusRepository> provider6, Provider<C10120j> provider7, Provider<C15679f> provider8) {
        return new TinderTracker((PilgrimLocationTracker) provider.get(), (PlacesAvailableProvider) provider2.get(), (C12346j) provider3.get(), (PlacesLogger) provider4.get(), (PlacesEnabledProvider) provider5.get(), (AuthStatusRepository) provider6.get(), (C10120j) provider7.get(), (C15679f) provider8.get());
    }

    /* renamed from: b */
    public static C17737d m64617b(Provider<PilgrimLocationTracker> provider, Provider<PlacesAvailableProvider> provider2, Provider<C12346j> provider3, Provider<PlacesLogger> provider4, Provider<PlacesEnabledProvider> provider5, Provider<AuthStatusRepository> provider6, Provider<C10120j> provider7, Provider<C15679f> provider8) {
        return new C17737d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
