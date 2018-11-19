package com.tinder.onboarding;

import com.tinder.auth.interactor.C10333h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.d */
public final class C13508d implements Factory<C12162c> {
    /* renamed from: a */
    private final Provider<C10333h> f43099a;

    public /* synthetic */ Object get() {
        return m52618a();
    }

    public C13508d(Provider<C10333h> provider) {
        this.f43099a = provider;
    }

    /* renamed from: a */
    public C12162c m52618a() {
        return C13508d.m52616a(this.f43099a);
    }

    /* renamed from: a */
    public static C12162c m52616a(Provider<C10333h> provider) {
        return new C12162c((C10333h) provider.get());
    }

    /* renamed from: b */
    public static C13508d m52617b(Provider<C10333h> provider) {
        return new C13508d(provider);
    }
}
