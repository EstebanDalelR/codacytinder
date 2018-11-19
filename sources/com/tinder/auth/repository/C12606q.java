package com.tinder.auth.repository;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.repository.q */
public final class C12606q implements Factory<C10353p> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f40698a;

    public /* synthetic */ Object get() {
        return m49797a();
    }

    public C12606q(Provider<SharedPreferences> provider) {
        this.f40698a = provider;
    }

    /* renamed from: a */
    public C10353p m49797a() {
        return C12606q.m49795a(this.f40698a);
    }

    /* renamed from: a */
    public static C10353p m49795a(Provider<SharedPreferences> provider) {
        return new C10353p((SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12606q m49796b(Provider<SharedPreferences> provider) {
        return new C12606q(provider);
    }
}
