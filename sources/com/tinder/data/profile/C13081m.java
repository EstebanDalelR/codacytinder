package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.m */
public final class C13081m implements Factory<C10951l> {
    /* renamed from: a */
    private final Provider<ProfileDataStore> f41682a;

    public /* synthetic */ Object get() {
        return m50906a();
    }

    public C13081m(Provider<ProfileDataStore> provider) {
        this.f41682a = provider;
    }

    /* renamed from: a */
    public C10951l m50906a() {
        return C13081m.m50904a(this.f41682a);
    }

    /* renamed from: a */
    public static C10951l m50904a(Provider<ProfileDataStore> provider) {
        return new C10951l((ProfileDataStore) provider.get());
    }

    /* renamed from: b */
    public static C13081m m50905b(Provider<ProfileDataStore> provider) {
        return new C13081m(provider);
    }
}
