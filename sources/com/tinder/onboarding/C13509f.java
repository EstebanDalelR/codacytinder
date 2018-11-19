package com.tinder.onboarding;

import com.tinder.managers.bt;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.f */
public final class C13509f implements Factory<C12168e> {
    /* renamed from: a */
    private final Provider<bt> f43101a;

    public /* synthetic */ Object get() {
        return m52623a();
    }

    public C13509f(Provider<bt> provider) {
        this.f43101a = provider;
    }

    /* renamed from: a */
    public C12168e m52623a() {
        return C13509f.m52621a(this.f43101a);
    }

    /* renamed from: a */
    public static C12168e m52621a(Provider<bt> provider) {
        return new C12168e((bt) provider.get());
    }

    /* renamed from: b */
    public static C13509f m52622b(Provider<bt> provider) {
        return new C13509f(provider);
    }
}
