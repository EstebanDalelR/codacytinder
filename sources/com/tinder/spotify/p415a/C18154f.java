package com.tinder.spotify.p415a;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerProfile;
import com.tinder.spotify.repository.SpotifyDataRepository;
import com.tinder.utils.C15354a;
import com.tinder.utils.C15377z;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.a.f */
public final class C18154f implements Factory<C15035a> {
    /* renamed from: a */
    private final Provider<SpotifyDataRepository> f56322a;
    /* renamed from: b */
    private final Provider<ManagerProfile> f56323b;
    /* renamed from: c */
    private final Provider<AbTestUtility> f56324c;
    /* renamed from: d */
    private final Provider<ManagerAnalytics> f56325d;
    /* renamed from: e */
    private final Provider<C15354a> f56326e;
    /* renamed from: f */
    private final Provider<C15377z> f56327f;

    public /* synthetic */ Object get() {
        return m65853a();
    }

    public C18154f(Provider<SpotifyDataRepository> provider, Provider<ManagerProfile> provider2, Provider<AbTestUtility> provider3, Provider<ManagerAnalytics> provider4, Provider<C15354a> provider5, Provider<C15377z> provider6) {
        this.f56322a = provider;
        this.f56323b = provider2;
        this.f56324c = provider3;
        this.f56325d = provider4;
        this.f56326e = provider5;
        this.f56327f = provider6;
    }

    /* renamed from: a */
    public C15035a m65853a() {
        return C18154f.m65851a(this.f56322a, this.f56323b, this.f56324c, this.f56325d, this.f56326e, this.f56327f);
    }

    /* renamed from: a */
    public static C15035a m65851a(Provider<SpotifyDataRepository> provider, Provider<ManagerProfile> provider2, Provider<AbTestUtility> provider3, Provider<ManagerAnalytics> provider4, Provider<C15354a> provider5, Provider<C15377z> provider6) {
        return new C15035a((SpotifyDataRepository) provider.get(), (ManagerProfile) provider2.get(), (AbTestUtility) provider3.get(), (ManagerAnalytics) provider4.get(), (C15354a) provider5.get(), (C15377z) provider6.get());
    }

    /* renamed from: b */
    public static C18154f m65852b(Provider<SpotifyDataRepository> provider, Provider<ManagerProfile> provider2, Provider<AbTestUtility> provider3, Provider<ManagerAnalytics> provider4, Provider<C15354a> provider5, Provider<C15377z> provider6) {
        return new C18154f(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
