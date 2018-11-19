package com.snapchat.kit.sdk.bitmoji;

import com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask.OnIndexCompleteListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.p */
public final class C7867p implements Factory<OnIndexCompleteListener> {
    /* renamed from: a */
    private final C5897j f28376a;

    public /* synthetic */ Object get() {
        return m33666a();
    }

    public C7867p(C5897j c5897j) {
        this.f28376a = c5897j;
    }

    /* renamed from: a */
    public OnIndexCompleteListener m33666a() {
        return (OnIndexCompleteListener) C15521i.a(this.f28376a.m25449a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<OnIndexCompleteListener> m33665a(C5897j c5897j) {
        return new C7867p(c5897j);
    }
}
