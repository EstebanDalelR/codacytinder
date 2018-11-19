package com.tinder.discovery.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.discovery.analytics.d */
public final class C13144d implements Factory<C11125b> {
    /* renamed from: a */
    private final Provider<C2630h> f41813a;
    /* renamed from: b */
    private final Provider<C8881i> f41814b;
    /* renamed from: c */
    private final Provider<C15679f> f41815c;

    public /* synthetic */ Object get() {
        return m51080a();
    }

    public C13144d(Provider<C2630h> provider, Provider<C8881i> provider2, Provider<C15679f> provider3) {
        this.f41813a = provider;
        this.f41814b = provider2;
        this.f41815c = provider3;
    }

    /* renamed from: a */
    public C11125b m51080a() {
        return C13144d.m51078a(this.f41813a, this.f41814b, this.f41815c);
    }

    /* renamed from: a */
    public static C11125b m51078a(Provider<C2630h> provider, Provider<C8881i> provider2, Provider<C15679f> provider3) {
        return new C11125b((C2630h) provider.get(), (C8881i) provider2.get(), (C15679f) provider3.get());
    }

    /* renamed from: b */
    public static C13144d m51079b(Provider<C2630h> provider, Provider<C8881i> provider2, Provider<C15679f> provider3) {
        return new C13144d(provider, provider2, provider3);
    }
}
