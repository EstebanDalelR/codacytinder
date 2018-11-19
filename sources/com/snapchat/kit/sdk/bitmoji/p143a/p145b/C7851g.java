package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.g */
public final class C7851g implements Factory<C5891c> {
    /* renamed from: a */
    private final C5892d f28345a;
    /* renamed from: b */
    private final Provider<C5890a> f28346b;

    public /* synthetic */ Object get() {
        return m33635a();
    }

    public C7851g(C5892d c5892d, Provider<C5890a> provider) {
        this.f28345a = c5892d;
        this.f28346b = provider;
    }

    /* renamed from: a */
    public C5891c m33635a() {
        return (C5891c) C15521i.a(this.f28345a.m25434c((C5890a) this.f28346b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5891c> m33634a(C5892d c5892d, Provider<C5890a> provider) {
        return new C7851g(c5892d, provider);
    }
}
