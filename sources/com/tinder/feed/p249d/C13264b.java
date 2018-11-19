package com.tinder.feed.p249d;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.d.b */
public final class C13264b implements Factory<C9462a> {
    /* renamed from: a */
    private final Provider<C2642a> f42021a;

    public /* synthetic */ Object get() {
        return m51316a();
    }

    public C13264b(Provider<C2642a> provider) {
        this.f42021a = provider;
    }

    /* renamed from: a */
    public C9462a m51316a() {
        return C13264b.m51314a(this.f42021a);
    }

    /* renamed from: a */
    public static C9462a m51314a(Provider<C2642a> provider) {
        return new C9462a((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C13264b m51315b(Provider<C2642a> provider) {
        return new C13264b(provider);
    }
}
