package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.w */
public final class C13089w implements Factory<C13088u> {
    /* renamed from: a */
    private final Provider<ProfileDataStore> f41692a;

    public /* synthetic */ Object get() {
        return m50926a();
    }

    public C13089w(Provider<ProfileDataStore> provider) {
        this.f41692a = provider;
    }

    /* renamed from: a */
    public C13088u m50926a() {
        return C13089w.m50924a(this.f41692a);
    }

    /* renamed from: a */
    public static C13088u m50924a(Provider<ProfileDataStore> provider) {
        return new C13088u((ProfileDataStore) provider.get());
    }

    /* renamed from: b */
    public static C13089w m50925b(Provider<ProfileDataStore> provider) {
        return new C13089w(provider);
    }
}
