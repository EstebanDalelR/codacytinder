package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.security.C7158g;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.l */
public final class C7933l implements Factory<C7158g> {
    /* renamed from: a */
    private final C5951d f28527a;
    /* renamed from: b */
    private final Provider<Gson> f28528b;
    /* renamed from: c */
    private final Provider<SharedPreferences> f28529c;

    public /* synthetic */ Object get() {
        return m33784a();
    }

    public C7933l(C5951d c5951d, Provider<Gson> provider, Provider<SharedPreferences> provider2) {
        this.f28527a = c5951d;
        this.f28528b = provider;
        this.f28529c = provider2;
    }

    /* renamed from: a */
    public C7158g m33784a() {
        return (C7158g) C15521i.a(this.f28527a.m25561a((Gson) this.f28528b.get(), (SharedPreferences) this.f28529c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C7158g> m33783a(C5951d c5951d, Provider<Gson> provider, Provider<SharedPreferences> provider2) {
        return new C7933l(c5951d, provider, provider2);
    }
}
