package com.tinder.module;

import android.content.SharedPreferences;
import com.tinder.discovery.domain.DiscoverySegmentDataStore;
import com.tinder.domain.config.TopPicksConfig;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cj implements Factory<DiscoverySegmentDataStore> {
    /* renamed from: a */
    private final bs f42864a;
    /* renamed from: b */
    private final Provider<TopPicksConfig> f42865b;
    /* renamed from: c */
    private final Provider<SharedPreferences> f42866c;

    public /* synthetic */ Object get() {
        return m52268a();
    }

    public cj(bs bsVar, Provider<TopPicksConfig> provider, Provider<SharedPreferences> provider2) {
        this.f42864a = bsVar;
        this.f42865b = provider;
        this.f42866c = provider2;
    }

    /* renamed from: a */
    public DiscoverySegmentDataStore m52268a() {
        return m52266a(this.f42864a, this.f42865b, this.f42866c);
    }

    /* renamed from: a */
    public static DiscoverySegmentDataStore m52266a(bs bsVar, Provider<TopPicksConfig> provider, Provider<SharedPreferences> provider2) {
        return m52265a(bsVar, (TopPicksConfig) provider.get(), (SharedPreferences) provider2.get());
    }

    /* renamed from: b */
    public static cj m52267b(bs bsVar, Provider<TopPicksConfig> provider, Provider<SharedPreferences> provider2) {
        return new cj(bsVar, provider, provider2);
    }

    /* renamed from: a */
    public static DiscoverySegmentDataStore m52265a(bs bsVar, TopPicksConfig topPicksConfig, SharedPreferences sharedPreferences) {
        return (DiscoverySegmentDataStore) C15521i.a(bsVar.m40807a(topPicksConfig, sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
