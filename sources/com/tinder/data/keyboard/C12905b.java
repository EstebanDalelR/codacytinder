package com.tinder.data.keyboard;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.keyboard.b */
public final class C12905b implements Factory<C10788a> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f41371a;

    public /* synthetic */ Object get() {
        return m50578a();
    }

    public C12905b(Provider<SharedPreferences> provider) {
        this.f41371a = provider;
    }

    /* renamed from: a */
    public C10788a m50578a() {
        return C12905b.m50576a(this.f41371a);
    }

    /* renamed from: a */
    public static C10788a m50576a(Provider<SharedPreferences> provider) {
        return new C10788a((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12905b m50577b(Provider<SharedPreferences> provider) {
        return new C12905b(provider);
    }
}
