package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.t */
public final class C13087t implements Factory<C13086s> {
    /* renamed from: a */
    private final Provider<ProfileDataStore> f41690a;

    public /* synthetic */ Object get() {
        return m50922a();
    }

    public C13087t(Provider<ProfileDataStore> provider) {
        this.f41690a = provider;
    }

    /* renamed from: a */
    public C13086s m50922a() {
        return C13087t.m50920a(this.f41690a);
    }

    /* renamed from: a */
    public static C13086s m50920a(Provider<ProfileDataStore> provider) {
        return new C13086s((ProfileDataStore) provider.get());
    }

    /* renamed from: b */
    public static C13087t m50921b(Provider<ProfileDataStore> provider) {
        return new C13087t(provider);
    }
}
