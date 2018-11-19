package com.tinder.module;

import com.tinder.api.TinderApiClient;
import com.tinder.managers.ManagerProfile;
import com.tinder.spotify.api.AdjustClient;
import com.tinder.spotify.api.SpotifyLogMauApiClient;
import com.tinder.spotify.repository.SpotifyDataRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dp implements Factory<SpotifyDataRepository> {
    /* renamed from: a */
    private final bs f42933a;
    /* renamed from: b */
    private final Provider<TinderApiClient> f42934b;
    /* renamed from: c */
    private final Provider<ManagerProfile> f42935c;
    /* renamed from: d */
    private final Provider<AdjustClient> f42936d;
    /* renamed from: e */
    private final Provider<SpotifyLogMauApiClient> f42937e;

    public /* synthetic */ Object get() {
        return m52393a();
    }

    public dp(bs bsVar, Provider<TinderApiClient> provider, Provider<ManagerProfile> provider2, Provider<AdjustClient> provider3, Provider<SpotifyLogMauApiClient> provider4) {
        this.f42933a = bsVar;
        this.f42934b = provider;
        this.f42935c = provider2;
        this.f42936d = provider3;
        this.f42937e = provider4;
    }

    /* renamed from: a */
    public SpotifyDataRepository m52393a() {
        return m52391a(this.f42933a, this.f42934b, this.f42935c, this.f42936d, this.f42937e);
    }

    /* renamed from: a */
    public static SpotifyDataRepository m52391a(bs bsVar, Provider<TinderApiClient> provider, Provider<ManagerProfile> provider2, Provider<AdjustClient> provider3, Provider<SpotifyLogMauApiClient> provider4) {
        return m52390a(bsVar, (TinderApiClient) provider.get(), (ManagerProfile) provider2.get(), (AdjustClient) provider3.get(), (SpotifyLogMauApiClient) provider4.get());
    }

    /* renamed from: b */
    public static dp m52392b(bs bsVar, Provider<TinderApiClient> provider, Provider<ManagerProfile> provider2, Provider<AdjustClient> provider3, Provider<SpotifyLogMauApiClient> provider4) {
        return new dp(bsVar, provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static SpotifyDataRepository m52390a(bs bsVar, TinderApiClient tinderApiClient, ManagerProfile managerProfile, AdjustClient adjustClient, SpotifyLogMauApiClient spotifyLogMauApiClient) {
        return (SpotifyDataRepository) C15521i.a(bsVar.m40821a(tinderApiClient, managerProfile, adjustClient, spotifyLogMauApiClient), "Cannot return null from a non-@Nullable @Provides method");
    }
}
