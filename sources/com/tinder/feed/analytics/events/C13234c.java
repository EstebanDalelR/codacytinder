package com.tinder.feed.analytics.events;

import com.tinder.feed.analytics.C9432a;
import com.tinder.feed.analytics.p247a.C9426f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.events.c */
public final class C13234c implements Factory<C11688b> {
    /* renamed from: a */
    private final Provider<C9426f> f41958a;
    /* renamed from: b */
    private final Provider<C9432a> f41959b;

    public /* synthetic */ Object get() {
        return m51236a();
    }

    public C13234c(Provider<C9426f> provider, Provider<C9432a> provider2) {
        this.f41958a = provider;
        this.f41959b = provider2;
    }

    /* renamed from: a */
    public C11688b m51236a() {
        return C13234c.m51234a(this.f41958a, this.f41959b);
    }

    /* renamed from: a */
    public static C11688b m51234a(Provider<C9426f> provider, Provider<C9432a> provider2) {
        return new C11688b((C9426f) provider.get(), (C9432a) provider2.get());
    }

    /* renamed from: b */
    public static C13234c m51235b(Provider<C9426f> provider, Provider<C9432a> provider2) {
        return new C13234c(provider, provider2);
    }
}
