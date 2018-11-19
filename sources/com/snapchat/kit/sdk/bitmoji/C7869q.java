package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.q */
public final class C7869q implements Factory<C5927a> {
    /* renamed from: a */
    private final C5897j f28380a;

    public /* synthetic */ Object get() {
        return m33670a();
    }

    public C7869q(C5897j c5897j) {
        this.f28380a = c5897j;
    }

    /* renamed from: a */
    public C5927a m33670a() {
        return (C5927a) C15521i.a(this.f28380a.m25451c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5927a> m33669a(C5897j c5897j) {
        return new C7869q(c5897j);
    }
}
