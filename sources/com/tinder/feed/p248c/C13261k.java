package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.k */
public final class C13261k implements Factory<C8576g> {
    /* renamed from: a */
    private final C9461b f42015a;
    /* renamed from: b */
    private final Provider<C8576g> f42016b;

    public /* synthetic */ Object get() {
        return m51305a();
    }

    public C13261k(C9461b c9461b, Provider<C8576g> provider) {
        this.f42015a = c9461b;
        this.f42016b = provider;
    }

    /* renamed from: a */
    public C8576g m51305a() {
        return C13261k.m51303a(this.f42015a, this.f42016b);
    }

    /* renamed from: a */
    public static C8576g m51303a(C9461b c9461b, Provider<C8576g> provider) {
        return C13261k.m51302a(c9461b, (C8576g) provider.get());
    }

    /* renamed from: b */
    public static C13261k m51304b(C9461b c9461b, Provider<C8576g> provider) {
        return new C13261k(c9461b, provider);
    }

    /* renamed from: a */
    public static C8576g m51302a(C9461b c9461b, C8576g c8576g) {
        return (C8576g) C15521i.a(c9461b.m39559a(c8576g), "Cannot return null from a non-@Nullable @Provides method");
    }
}
