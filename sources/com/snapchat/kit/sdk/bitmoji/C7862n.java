package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.n */
public final class C7862n implements Factory<C5927a> {
    /* renamed from: a */
    private final C5897j f28368a;

    public /* synthetic */ Object get() {
        return m33657a();
    }

    public C7862n(C5897j c5897j) {
        this.f28368a = c5897j;
    }

    /* renamed from: a */
    public C5927a m33657a() {
        return (C5927a) C15521i.a(this.f28368a.m25452d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5927a> m33656a(C5897j c5897j) {
        return new C7862n(c5897j);
    }
}
