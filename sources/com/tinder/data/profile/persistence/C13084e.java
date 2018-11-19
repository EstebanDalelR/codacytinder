package com.tinder.data.profile.persistence;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.persistence.e */
public final class C13084e implements Factory<C8767d> {
    /* renamed from: a */
    private final Provider<ProfileDataStore> f41685a;

    public /* synthetic */ Object get() {
        return m50915a();
    }

    public C13084e(Provider<ProfileDataStore> provider) {
        this.f41685a = provider;
    }

    /* renamed from: a */
    public C8767d m50915a() {
        return C13084e.m50913a(this.f41685a);
    }

    /* renamed from: a */
    public static C8767d m50913a(Provider<ProfileDataStore> provider) {
        return new C8767d((ProfileDataStore) provider.get());
    }

    /* renamed from: b */
    public static C13084e m50914b(Provider<ProfileDataStore> provider) {
        return new C13084e(provider);
    }
}
