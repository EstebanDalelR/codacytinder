package com.snapchat.kit.sdk.bitmoji;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Random;

/* renamed from: com.snapchat.kit.sdk.bitmoji.h */
public final class C7858h implements Factory<Random> {
    /* renamed from: a */
    private final C5894b f28360a;

    public /* synthetic */ Object get() {
        return m33649a();
    }

    public C7858h(C5894b c5894b) {
        this.f28360a = c5894b;
    }

    /* renamed from: a */
    public Random m33649a() {
        return (Random) C15521i.a(this.f28360a.m25441a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<Random> m33648a(C5894b c5894b) {
        return new C7858h(c5894b);
    }
}
