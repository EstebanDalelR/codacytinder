package com.tinder.data.places.p330b;

import com.tinder.data.profile.persistence.ProfileDataStore;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.places.b.f */
public final class C13047f implements Factory<C10897e> {
    /* renamed from: a */
    private final Provider<ProfileDataStore> f41597a;

    public /* synthetic */ Object get() {
        return m50801a();
    }

    public C13047f(Provider<ProfileDataStore> provider) {
        this.f41597a = provider;
    }

    /* renamed from: a */
    public C10897e m50801a() {
        return C13047f.m50799a(this.f41597a);
    }

    /* renamed from: a */
    public static C10897e m50799a(Provider<ProfileDataStore> provider) {
        return new C10897e((ProfileDataStore) provider.get());
    }

    /* renamed from: b */
    public static C13047f m50800b(Provider<ProfileDataStore> provider) {
        return new C13047f(provider);
    }
}
