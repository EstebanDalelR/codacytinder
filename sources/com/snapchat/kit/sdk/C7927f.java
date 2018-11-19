package com.snapchat.kit.sdk;

import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.f */
public final class C7927f implements Factory<String> {
    /* renamed from: a */
    private final C5951d f28513a;

    public /* synthetic */ Object get() {
        return m33772a();
    }

    public C7927f(C5951d c5951d) {
        this.f28513a = c5951d;
    }

    /* renamed from: a */
    public String m33772a() {
        return (String) C15521i.a(this.f28513a.m25562b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<String> m33771a(C5951d c5951d) {
        return new C7927f(c5951d);
    }
}
