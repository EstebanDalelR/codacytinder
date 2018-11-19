package com.snapchat.kit.sdk.bitmoji.ui.controller;

import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.g */
public final class C7881g implements Factory<C7880f> {
    /* renamed from: a */
    private final Provider<C5927a> f28442a;

    public /* synthetic */ Object get() {
        return m33717a();
    }

    public C7881g(Provider<C5927a> provider) {
        this.f28442a = provider;
    }

    /* renamed from: a */
    public C7880f m33717a() {
        return new C7880f((C5927a) this.f28442a.get());
    }

    /* renamed from: a */
    public static Factory<C7880f> m33716a(Provider<C5927a> provider) {
        return new C7881g(provider);
    }
}
