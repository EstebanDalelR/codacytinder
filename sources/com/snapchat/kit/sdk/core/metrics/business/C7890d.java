package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.C7140a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.d */
public final class C7890d implements Factory<C7144c> {
    /* renamed from: a */
    private final Provider<C5941h> f28489a;
    /* renamed from: b */
    private final Provider<C7140a<ServerEvent>> f28490b;

    public /* synthetic */ Object get() {
        return m33746a();
    }

    public C7890d(Provider<C5941h> provider, Provider<C7140a<ServerEvent>> provider2) {
        this.f28489a = provider;
        this.f28490b = provider2;
    }

    /* renamed from: a */
    public C7144c m33746a() {
        return new C7144c((C5941h) this.f28489a.get(), (C7140a) this.f28490b.get());
    }

    /* renamed from: a */
    public static Factory<C7144c> m33745a(Provider<C5941h> provider, Provider<C7140a<ServerEvent>> provider2) {
        return new C7890d(provider, provider2);
    }
}
