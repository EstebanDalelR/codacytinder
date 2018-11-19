package com.snapchat.kit.sdk;

import android.os.Handler;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.snapchat.kit.sdk.n */
public final class C7938n implements Factory<Handler> {
    /* renamed from: a */
    private final C5951d f28538a;

    public /* synthetic */ Object get() {
        return m33794a();
    }

    public C7938n(C5951d c5951d) {
        this.f28538a = c5951d;
    }

    /* renamed from: a */
    public Handler m33794a() {
        return (Handler) C15521i.a(this.f28538a.m25568h(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<Handler> m33793a(C5951d c5951d) {
        return new C7938n(c5951d);
    }
}
