package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.business.C5941h;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.g */
public final class C7896g implements Factory<C5941h> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f28498a;

    public /* synthetic */ Object get() {
        return m33759a();
    }

    public C7896g(Provider<SharedPreferences> provider) {
        this.f28498a = provider;
    }

    /* renamed from: a */
    public C5941h m33759a() {
        return (C5941h) C15521i.a(C5942c.m25545a((SharedPreferences) this.f28498a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C5941h> m33758a(Provider<SharedPreferences> provider) {
        return new C7896g(provider);
    }
}
