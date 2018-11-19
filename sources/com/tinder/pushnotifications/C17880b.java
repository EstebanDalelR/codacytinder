package com.tinder.pushnotifications;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.pushnotifications.strategy.C16266a;
import com.tinder.pushnotifications.strategy.C16270c;
import com.tinder.pushnotifications.usecase.C14574a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.b */
public final class C17880b implements Factory<C14550a> {
    /* renamed from: a */
    private final Provider<AppVisibilityTracker> f55761a;
    /* renamed from: b */
    private final Provider<C16266a> f55762b;
    /* renamed from: c */
    private final Provider<C16270c> f55763c;
    /* renamed from: d */
    private final Provider<C2630h> f55764d;
    /* renamed from: e */
    private final Provider<C14574a> f55765e;
    /* renamed from: f */
    private final Provider<PlacesConfigProvider> f55766f;

    public /* synthetic */ Object get() {
        return m65162a();
    }

    public C17880b(Provider<AppVisibilityTracker> provider, Provider<C16266a> provider2, Provider<C16270c> provider3, Provider<C2630h> provider4, Provider<C14574a> provider5, Provider<PlacesConfigProvider> provider6) {
        this.f55761a = provider;
        this.f55762b = provider2;
        this.f55763c = provider3;
        this.f55764d = provider4;
        this.f55765e = provider5;
        this.f55766f = provider6;
    }

    /* renamed from: a */
    public C14550a m65162a() {
        return C17880b.m65160a(this.f55761a, this.f55762b, this.f55763c, this.f55764d, this.f55765e, this.f55766f);
    }

    /* renamed from: a */
    public static C14550a m65160a(Provider<AppVisibilityTracker> provider, Provider<C16266a> provider2, Provider<C16270c> provider3, Provider<C2630h> provider4, Provider<C14574a> provider5, Provider<PlacesConfigProvider> provider6) {
        return new C14550a((AppVisibilityTracker) provider.get(), (C16266a) provider2.get(), (C16270c) provider3.get(), (C2630h) provider4.get(), (C14574a) provider5.get(), (PlacesConfigProvider) provider6.get());
    }

    /* renamed from: b */
    public static C17880b m65161b(Provider<AppVisibilityTracker> provider, Provider<C16266a> provider2, Provider<C16270c> provider3, Provider<C2630h> provider4, Provider<C14574a> provider5, Provider<PlacesConfigProvider> provider6) {
        return new C17880b(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
