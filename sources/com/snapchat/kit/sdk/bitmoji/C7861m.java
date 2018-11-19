package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.m */
public final class C7861m implements Factory<C5927a> {
    /* renamed from: a */
    private final C5897j f28367a;

    public /* synthetic */ Object get() {
        return m33655a();
    }

    public C7861m(C5897j c5897j) {
        this.f28367a = c5897j;
    }

    /* renamed from: a */
    public C5927a m33655a() {
        return (C5927a) C15521i.a(this.f28367a.m25453e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5927a> m33654a(C5897j c5897j) {
        return new C7861m(c5897j);
    }
}
