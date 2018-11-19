package com.snapchat.kit.sdk.bitmoji.p143a.p145b;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.a.b.e */
public final class C7849e implements Factory<C5891c> {
    /* renamed from: a */
    private final C5892d f28341a;
    /* renamed from: b */
    private final Provider<C5890a> f28342b;

    public /* synthetic */ Object get() {
        return m33631a();
    }

    public C7849e(C5892d c5892d, Provider<C5890a> provider) {
        this.f28341a = c5892d;
        this.f28342b = provider;
    }

    /* renamed from: a */
    public C5891c m33631a() {
        return (C5891c) C15521i.a(this.f28341a.m25433b((C5890a) this.f28342b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5891c> m33630a(C5892d c5892d, Provider<C5890a> provider) {
        return new C7849e(c5892d, provider);
    }
}
