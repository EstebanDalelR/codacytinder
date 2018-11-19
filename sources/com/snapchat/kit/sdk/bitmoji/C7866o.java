package com.snapchat.kit.sdk.bitmoji;

import android.support.annotation.Nullable;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.bitmoji.o */
public final class C7866o implements Factory<OnBitmojiSearchFocusChangeListener> {
    /* renamed from: a */
    private final C5897j f28375a;

    @Nullable
    public /* synthetic */ Object get() {
        return m33664a();
    }

    public C7866o(C5897j c5897j) {
        this.f28375a = c5897j;
    }

    @Nullable
    /* renamed from: a */
    public OnBitmojiSearchFocusChangeListener m33664a() {
        return this.f28375a.m25450b();
    }

    /* renamed from: a */
    public static Factory<OnBitmojiSearchFocusChangeListener> m33663a(C5897j c5897j) {
        return new C7866o(c5897j);
    }
}
