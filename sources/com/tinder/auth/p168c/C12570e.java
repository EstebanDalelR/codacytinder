package com.tinder.auth.p168c;

import com.tinder.auth.repository.C10353p;
import com.tinder.common.repository.C10698c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.c.e */
public final class C12570e implements Factory<C8273d> {
    /* renamed from: a */
    private final Provider<C10353p> f40613a;
    /* renamed from: b */
    private final Provider<C10698c> f40614b;

    public /* synthetic */ Object get() {
        return m49691a();
    }

    public C12570e(Provider<C10353p> provider, Provider<C10698c> provider2) {
        this.f40613a = provider;
        this.f40614b = provider2;
    }

    /* renamed from: a */
    public C8273d m49691a() {
        return C12570e.m49689a(this.f40613a, this.f40614b);
    }

    /* renamed from: a */
    public static C8273d m49689a(Provider<C10353p> provider, Provider<C10698c> provider2) {
        return new C8273d((C10353p) provider.get(), (C10698c) provider2.get());
    }

    /* renamed from: b */
    public static C12570e m49690b(Provider<C10353p> provider, Provider<C10698c> provider2) {
        return new C12570e(provider, provider2);
    }
}
