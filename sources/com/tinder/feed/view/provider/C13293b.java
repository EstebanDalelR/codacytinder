package com.tinder.feed.view.provider;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.provider.b */
public final class C13293b implements Factory<C9542a> {
    /* renamed from: a */
    private final Provider<C2642a> f42145a;

    public /* synthetic */ Object get() {
        return m51445a();
    }

    public C13293b(Provider<C2642a> provider) {
        this.f42145a = provider;
    }

    /* renamed from: a */
    public C9542a m51445a() {
        return C13293b.m51443a(this.f42145a);
    }

    /* renamed from: a */
    public static C9542a m51443a(Provider<C2642a> provider) {
        return new C9542a((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C13293b m51444b(Provider<C2642a> provider) {
        return new C13293b(provider);
    }
}
