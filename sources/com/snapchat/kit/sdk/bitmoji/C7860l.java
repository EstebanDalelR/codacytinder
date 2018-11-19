package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.ui.view.C5927a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.l */
public final class C7860l implements Factory<C5927a> {
    /* renamed from: a */
    private final C5897j f28366a;

    public /* synthetic */ Object get() {
        return m33653a();
    }

    public C7860l(C5897j c5897j) {
        this.f28366a = c5897j;
    }

    /* renamed from: a */
    public C5927a m33653a() {
        return (C5927a) C15521i.a(this.f28366a.m25454f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5927a> m33652a(C5897j c5897j) {
        return new C7860l(c5897j);
    }
}
