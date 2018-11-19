package com.tinder.feed.analytics.session;

import com.tinder.feed.view.provider.C9545e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.session.i */
public final class C13244i implements Factory<C9451h> {
    /* renamed from: a */
    private final Provider<C9545e> f41972a;

    public /* synthetic */ Object get() {
        return m51254a();
    }

    public C13244i(Provider<C9545e> provider) {
        this.f41972a = provider;
    }

    /* renamed from: a */
    public C9451h m51254a() {
        return C13244i.m51252a(this.f41972a);
    }

    /* renamed from: a */
    public static C9451h m51252a(Provider<C9545e> provider) {
        return new C9451h((C9545e) provider.get());
    }

    /* renamed from: b */
    public static C13244i m51253b(Provider<C9545e> provider) {
        return new C13244i(provider);
    }
}
