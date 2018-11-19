package com.tinder.module;

import com.tinder.addy.AdAggregator;
import com.tinder.addy.Addy;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.e */
public final class C13484e implements Factory<AdAggregator> {
    /* renamed from: a */
    private final C9940d f42956a;
    /* renamed from: b */
    private final Provider<Addy> f42957b;

    public /* synthetic */ Object get() {
        return m52433a();
    }

    public C13484e(C9940d c9940d, Provider<Addy> provider) {
        this.f42956a = c9940d;
        this.f42957b = provider;
    }

    /* renamed from: a */
    public AdAggregator m52433a() {
        return C13484e.m52431a(this.f42956a, this.f42957b);
    }

    /* renamed from: a */
    public static AdAggregator m52431a(C9940d c9940d, Provider<Addy> provider) {
        return C13484e.m52430a(c9940d, (Addy) provider.get());
    }

    /* renamed from: b */
    public static C13484e m52432b(C9940d c9940d, Provider<Addy> provider) {
        return new C13484e(c9940d, provider);
    }

    /* renamed from: a */
    public static AdAggregator m52430a(C9940d c9940d, Addy addy) {
        return (AdAggregator) C15521i.a(c9940d.m40854a(addy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
