package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.controller.b */
public final class C7886b implements Factory<C7136a> {
    /* renamed from: a */
    private final Provider<Handler> f28480a;

    public /* synthetic */ Object get() {
        return m33738a();
    }

    public C7886b(Provider<Handler> provider) {
        this.f28480a = provider;
    }

    /* renamed from: a */
    public C7136a m33738a() {
        return new C7136a((Handler) this.f28480a.get());
    }

    /* renamed from: a */
    public static Factory<C7136a> m33737a(Provider<Handler> provider) {
        return new C7886b(provider);
    }
}
