package com.tinder.home.p259b;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.home.b.b */
public final class C13324b implements Factory<C9695a> {
    /* renamed from: a */
    private final Provider<C2642a> f42275a;

    public /* synthetic */ Object get() {
        return m51564a();
    }

    public C13324b(Provider<C2642a> provider) {
        this.f42275a = provider;
    }

    /* renamed from: a */
    public C9695a m51564a() {
        return C13324b.m51562a(this.f42275a);
    }

    /* renamed from: a */
    public static C9695a m51562a(Provider<C2642a> provider) {
        return new C9695a((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C13324b m51563b(Provider<C2642a> provider) {
        return new C13324b(provider);
    }
}
