package com.snapchat.kit.sdk.bitmoji;

import com.squareup.okhttp.C5997b;
import com.squareup.okhttp.C6068p;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.f */
public final class C7856f implements Factory<C6068p> {
    /* renamed from: a */
    private final C5894b f28355a;
    /* renamed from: b */
    private final Provider<C5997b> f28356b;

    public /* synthetic */ Object get() {
        return m33645a();
    }

    public C7856f(C5894b c5894b, Provider<C5997b> provider) {
        this.f28355a = c5894b;
        this.f28356b = provider;
    }

    /* renamed from: a */
    public C6068p m33645a() {
        return (C6068p) C15521i.a(this.f28355a.m25438a((C5997b) this.f28356b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C6068p> m33644a(C5894b c5894b, Provider<C5997b> provider) {
        return new C7856f(c5894b, provider);
    }
}
