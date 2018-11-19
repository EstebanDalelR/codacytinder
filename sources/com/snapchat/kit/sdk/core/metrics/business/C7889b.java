package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p149b.C5938a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.b */
public final class C7889b implements Factory<C7143a> {
    /* renamed from: a */
    private final Provider<SharedPreferences> f28485a;
    /* renamed from: b */
    private final Provider<C5941h> f28486b;
    /* renamed from: c */
    private final Provider<MetricsClient> f28487c;
    /* renamed from: d */
    private final Provider<C5938a> f28488d;

    public /* synthetic */ Object get() {
        return m33744a();
    }

    public C7889b(Provider<SharedPreferences> provider, Provider<C5941h> provider2, Provider<MetricsClient> provider3, Provider<C5938a> provider4) {
        this.f28485a = provider;
        this.f28486b = provider2;
        this.f28487c = provider3;
        this.f28488d = provider4;
    }

    /* renamed from: a */
    public C7143a m33744a() {
        return new C7143a((SharedPreferences) this.f28485a.get(), (C5941h) this.f28486b.get(), (MetricsClient) this.f28487c.get(), (C5938a) this.f28488d.get());
    }

    /* renamed from: a */
    public static Factory<C7143a> m33743a(Provider<SharedPreferences> provider, Provider<C5941h> provider2, Provider<MetricsClient> provider3, Provider<C5938a> provider4) {
        return new C7889b(provider, provider2, provider3, provider4);
    }
}
