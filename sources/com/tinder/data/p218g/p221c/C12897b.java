package com.tinder.data.p218g.p221c;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.g.c.b */
public final class C12897b implements Factory<C10780a> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f41359a;

    public /* synthetic */ Object get() {
        return m50556a();
    }

    public C12897b(Provider<SharedPreferences> provider) {
        this.f41359a = provider;
    }

    /* renamed from: a */
    public C10780a m50556a() {
        return C12897b.m50554a(this.f41359a);
    }

    /* renamed from: a */
    public static C10780a m50554a(Provider<SharedPreferences> provider) {
        return new C10780a((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12897b m50555b(Provider<SharedPreferences> provider) {
        return new C12897b(provider);
    }
}
