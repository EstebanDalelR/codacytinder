package com.tinder.feed.p248c;

import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.c.j */
public final class C13260j implements Factory<C8575e> {
    /* renamed from: a */
    private final C9461b f42013a;
    /* renamed from: b */
    private final Provider<C8575e> f42014b;

    public /* synthetic */ Object get() {
        return m51301a();
    }

    public C13260j(C9461b c9461b, Provider<C8575e> provider) {
        this.f42013a = c9461b;
        this.f42014b = provider;
    }

    /* renamed from: a */
    public C8575e m51301a() {
        return C13260j.m51299a(this.f42013a, this.f42014b);
    }

    /* renamed from: a */
    public static C8575e m51299a(C9461b c9461b, Provider<C8575e> provider) {
        return C13260j.m51298a(c9461b, (C8575e) provider.get());
    }

    /* renamed from: b */
    public static C13260j m51300b(C9461b c9461b, Provider<C8575e> provider) {
        return new C13260j(c9461b, provider);
    }

    /* renamed from: a */
    public static C8575e m51298a(C9461b c9461b, C8575e c8575e) {
        return (C8575e) C15521i.a(c9461b.m39558a(c8575e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
