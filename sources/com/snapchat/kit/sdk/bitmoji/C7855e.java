package com.snapchat.kit.sdk.bitmoji;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;

/* renamed from: com.snapchat.kit.sdk.bitmoji.e */
public final class C7855e implements Factory<ExecutorService> {
    /* renamed from: a */
    private final C5894b f28354a;

    public /* synthetic */ Object get() {
        return m33643a();
    }

    public C7855e(C5894b c5894b) {
        this.f28354a = c5894b;
    }

    /* renamed from: a */
    public ExecutorService m33643a() {
        return (ExecutorService) C15521i.a(this.f28354a.m25442b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<ExecutorService> m33642a(C5894b c5894b) {
        return new C7855e(c5894b);
    }
}
