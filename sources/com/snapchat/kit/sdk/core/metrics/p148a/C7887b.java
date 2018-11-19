package com.snapchat.kit.sdk.core.metrics.p148a;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p149b.C5938a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a.b */
public final class C7887b implements Factory<C7139a> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f28481a;
    /* renamed from: b */
    private final Provider<MetricsClient> f28482b;
    /* renamed from: c */
    private final Provider<C5938a> f28483c;

    public /* synthetic */ Object get() {
        return m33740a();
    }

    public C7887b(Provider<SharedPreferences> provider, Provider<MetricsClient> provider2, Provider<C5938a> provider3) {
        this.f28481a = provider;
        this.f28482b = provider2;
        this.f28483c = provider3;
    }

    /* renamed from: a */
    public C7139a m33740a() {
        return new C7139a((SharedPreferences) this.f28481a.get(), (MetricsClient) this.f28482b.get(), (C5938a) this.f28483c.get());
    }

    /* renamed from: a */
    public static Factory<C7139a> m33739a(Provider<SharedPreferences> provider, Provider<MetricsClient> provider2, Provider<C5938a> provider3) {
        return new C7887b(provider, provider2, provider3);
    }
}
