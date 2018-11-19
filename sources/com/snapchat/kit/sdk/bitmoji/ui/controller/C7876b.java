package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.b */
public final class C7876b implements Factory<C5918a> {
    /* renamed from: a */
    private final Provider<Context> f28419a;

    public /* synthetic */ Object get() {
        return m33698a();
    }

    public C7876b(Provider<Context> provider) {
        this.f28419a = provider;
    }

    /* renamed from: a */
    public C5918a m33698a() {
        return new C5918a((Context) this.f28419a.get());
    }

    /* renamed from: a */
    public static Factory<C5918a> m33697a(Provider<Context> provider) {
        return new C7876b(provider);
    }
}
