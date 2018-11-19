package com.tinder.fastmatch.analytics;

import com.tinder.common.provider.C8550g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.analytics.h */
public final class C13183h implements Factory<C9372g> {
    /* renamed from: a */
    private final Provider<C8550g> f41874a;

    public /* synthetic */ Object get() {
        return m51133a();
    }

    public C13183h(Provider<C8550g> provider) {
        this.f41874a = provider;
    }

    /* renamed from: a */
    public C9372g m51133a() {
        return C13183h.m51131a(this.f41874a);
    }

    /* renamed from: a */
    public static C9372g m51131a(Provider<C8550g> provider) {
        return new C9372g((C8550g) provider.get());
    }

    /* renamed from: b */
    public static C13183h m51132b(Provider<C8550g> provider) {
        return new C13183h(provider);
    }
}
