package com.tinder.data.profile.p331b;

import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.b.b */
public final class C13074b implements Factory<C10926a> {
    /* renamed from: a */
    private final Provider<LoadProfileOptionData> f41647a;

    public /* synthetic */ Object get() {
        return m50886a();
    }

    public C13074b(Provider<LoadProfileOptionData> provider) {
        this.f41647a = provider;
    }

    /* renamed from: a */
    public C10926a m50886a() {
        return C13074b.m50884a(this.f41647a);
    }

    /* renamed from: a */
    public static C10926a m50884a(Provider<LoadProfileOptionData> provider) {
        return new C10926a((LoadProfileOptionData) provider.get());
    }

    /* renamed from: b */
    public static C13074b m50885b(Provider<LoadProfileOptionData> provider) {
        return new C13074b(provider);
    }
}
