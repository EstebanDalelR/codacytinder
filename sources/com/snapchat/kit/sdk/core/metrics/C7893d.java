package com.snapchat.kit.sdk.core.metrics;

import android.os.Handler;
import com.snapchat.kit.sdk.core.metrics.business.C7143a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.d */
public final class C7893d implements Factory<C7140a<ServerEvent>> {
    /* renamed from: a */
    private final Provider<C7143a> f28493a;
    /* renamed from: b */
    private final Provider<Handler> f28494b;

    public /* synthetic */ Object get() {
        return m33753a();
    }

    public C7893d(Provider<C7143a> provider, Provider<Handler> provider2) {
        this.f28493a = provider;
        this.f28494b = provider2;
    }

    /* renamed from: a */
    public C7140a<ServerEvent> m33753a() {
        return (C7140a) C15521i.a(C5942c.m25544a((C7143a) this.f28493a.get(), (Handler) this.f28494b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<C7140a<ServerEvent>> m33752a(Provider<C7143a> provider, Provider<Handler> provider2) {
        return new C7893d(provider, provider2);
    }
}
