package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.f */
public final class C7850f implements Factory<C5891c> {
    /* renamed from: a */
    private final C5892d f28343a;
    /* renamed from: b */
    private final Provider<C5890a> f28344b;

    public /* synthetic */ Object get() {
        return m33633a();
    }

    public C7850f(C5892d c5892d, Provider<C5890a> provider) {
        this.f28343a = c5892d;
        this.f28344b = provider;
    }

    /* renamed from: a */
    public C5891c m33633a() {
        return (C5891c) C15521i.a(this.f28343a.m25432a((C5890a) this.f28344b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5891c> m33632a(C5892d c5892d, Provider<C5890a> provider) {
        return new C7850f(c5892d, provider);
    }
}
