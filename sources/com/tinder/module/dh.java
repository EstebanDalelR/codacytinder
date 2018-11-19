package com.tinder.module;

import android.content.SharedPreferences;
import com.tinder.domain.places.PlacesConfigProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dh implements Factory<PlacesConfigProvider> {
    /* renamed from: a */
    private final bs f42912a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f42913b;

    public /* synthetic */ Object get() {
        return m52361a();
    }

    public dh(bs bsVar, Provider<SharedPreferences> provider) {
        this.f42912a = bsVar;
        this.f42913b = provider;
    }

    /* renamed from: a */
    public PlacesConfigProvider m52361a() {
        return m52359a(this.f42912a, this.f42913b);
    }

    /* renamed from: a */
    public static PlacesConfigProvider m52359a(bs bsVar, Provider<SharedPreferences> provider) {
        return m52358a(bsVar, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static dh m52360b(bs bsVar, Provider<SharedPreferences> provider) {
        return new dh(bsVar, provider);
    }

    /* renamed from: a */
    public static PlacesConfigProvider m52358a(bs bsVar, SharedPreferences sharedPreferences) {
        return (PlacesConfigProvider) C15521i.a(bsVar.m40810a(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
