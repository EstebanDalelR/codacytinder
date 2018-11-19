package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.h */
public final class C7852h implements Factory<C5891c> {
    /* renamed from: a */
    private final C5892d f28347a;
    /* renamed from: b */
    private final Provider<C5890a> f28348b;

    public /* synthetic */ Object get() {
        return m33637a();
    }

    public C7852h(C5892d c5892d, Provider<C5890a> provider) {
        this.f28347a = c5892d;
        this.f28348b = provider;
    }

    /* renamed from: a */
    public C5891c m33637a() {
        return (C5891c) C15521i.a(this.f28347a.m25435d((C5890a) this.f28348b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5891c> m33636a(C5892d c5892d, Provider<C5890a> provider) {
        return new C7852h(c5892d, provider);
    }
}
