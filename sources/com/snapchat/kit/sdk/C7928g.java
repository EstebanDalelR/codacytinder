package com.snapchat.kit.sdk;

import android.content.Context;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.g */
public final class C7928g implements Factory<Context> {
    /* renamed from: a */
    private final C5951d f28514a;

    public /* synthetic */ Object get() {
        return m33774a();
    }

    public C7928g(C5951d c5951d) {
        this.f28514a = c5951d;
    }

    /* renamed from: a */
    public Context m33774a() {
        return (Context) C15521i.a(this.f28514a.m25556a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<Context> m33773a(C5951d c5951d) {
        return new C7928g(c5951d);
    }
}
