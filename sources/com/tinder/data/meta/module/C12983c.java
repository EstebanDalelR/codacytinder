package com.tinder.data.meta.module;

import com.tinder.data.meta.p227b.C10851a;
import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.meta.module.c */
public final class C12983c implements Factory<MetaGateway> {
    /* renamed from: a */
    private final C8702a f41564a;
    /* renamed from: b */
    private final Provider<C10851a> f41565b;

    public /* synthetic */ Object get() {
        return m50736a();
    }

    public C12983c(C8702a c8702a, Provider<C10851a> provider) {
        this.f41564a = c8702a;
        this.f41565b = provider;
    }

    /* renamed from: a */
    public MetaGateway m50736a() {
        return C12983c.m50734a(this.f41564a, this.f41565b);
    }

    /* renamed from: a */
    public static MetaGateway m50734a(C8702a c8702a, Provider<C10851a> provider) {
        return C12983c.m50733a(c8702a, (C10851a) provider.get());
    }

    /* renamed from: b */
    public static C12983c m50735b(C8702a c8702a, Provider<C10851a> provider) {
        return new C12983c(c8702a, provider);
    }

    /* renamed from: a */
    public static MetaGateway m50733a(C8702a c8702a, C10851a c10851a) {
        return (MetaGateway) C15521i.a(c8702a.m37165a(c10851a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
