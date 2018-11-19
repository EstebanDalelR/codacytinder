package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.security.b */
public final class C7925b implements Factory<Fingerprint> {
    /* renamed from: a */
    private final Provider<Context> f28511a;

    public /* synthetic */ Object get() {
        return m33768a();
    }

    public C7925b(Provider<Context> provider) {
        this.f28511a = provider;
    }

    /* renamed from: a */
    public Fingerprint m33768a() {
        return new Fingerprint((Context) this.f28511a.get());
    }

    /* renamed from: a */
    public static Factory<Fingerprint> m33767a(Provider<Context> provider) {
        return new C7925b(provider);
    }
}
