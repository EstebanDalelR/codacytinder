package com.tinder.module;

import android.content.SharedPreferences;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class df implements Factory<PlacesAvailableProvider> {
    /* renamed from: a */
    private final bs f42909a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f42910b;

    public /* synthetic */ Object get() {
        return m52353a();
    }

    public df(bs bsVar, Provider<SharedPreferences> provider) {
        this.f42909a = bsVar;
        this.f42910b = provider;
    }

    /* renamed from: a */
    public PlacesAvailableProvider m52353a() {
        return m52351a(this.f42909a, this.f42910b);
    }

    /* renamed from: a */
    public static PlacesAvailableProvider m52351a(bs bsVar, Provider<SharedPreferences> provider) {
        return m52350a(bsVar, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static df m52352b(bs bsVar, Provider<SharedPreferences> provider) {
        return new df(bsVar, provider);
    }

    /* renamed from: a */
    public static PlacesAvailableProvider m52350a(bs bsVar, SharedPreferences sharedPreferences) {
        return (PlacesAvailableProvider) C15521i.a(bsVar.m40826b(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
