package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.r */
public final class C7870r implements Factory<C5927a> {
    /* renamed from: a */
    private final C5897j f28381a;

    public /* synthetic */ Object get() {
        return m33672a();
    }

    public C7870r(C5897j c5897j) {
        this.f28381a = c5897j;
    }

    /* renamed from: a */
    public C5927a m33672a() {
        return (C5927a) C15521i.a(this.f28381a.m25455g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5927a> m33671a(C5897j c5897j) {
        return new C7870r(c5897j);
    }
}
