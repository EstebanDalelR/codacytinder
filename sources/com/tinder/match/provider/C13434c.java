package com.tinder.match.provider;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.provider.c */
public final class C13434c implements Factory<C9876b> {
    /* renamed from: a */
    private final Provider<C2642a> f42620a;

    public /* synthetic */ Object get() {
        return m51927a();
    }

    public C13434c(Provider<C2642a> provider) {
        this.f42620a = provider;
    }

    /* renamed from: a */
    public C9876b m51927a() {
        return C13434c.m51925a(this.f42620a);
    }

    /* renamed from: a */
    public static C9876b m51925a(Provider<C2642a> provider) {
        return new C9876b((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C13434c m51926b(Provider<C2642a> provider) {
        return new C13434c(provider);
    }
}
