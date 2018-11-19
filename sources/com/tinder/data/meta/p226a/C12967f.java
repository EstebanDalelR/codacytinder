package com.tinder.data.meta.p226a;

import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C10742q;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.meta.a.f */
public final class C12967f implements Factory<C10845e> {
    /* renamed from: a */
    private final Provider<C10844c> f41529a;
    /* renamed from: b */
    private final Provider<C10738l> f41530b;
    /* renamed from: c */
    private final Provider<C10742q> f41531c;

    public /* synthetic */ Object get() {
        return m50709a();
    }

    public C12967f(Provider<C10844c> provider, Provider<C10738l> provider2, Provider<C10742q> provider3) {
        this.f41529a = provider;
        this.f41530b = provider2;
        this.f41531c = provider3;
    }

    /* renamed from: a */
    public C10845e m50709a() {
        return C12967f.m50707a(this.f41529a, this.f41530b, this.f41531c);
    }

    /* renamed from: a */
    public static C10845e m50707a(Provider<C10844c> provider, Provider<C10738l> provider2, Provider<C10742q> provider3) {
        return new C10845e((C10844c) provider.get(), (C10738l) provider2.get(), (C10742q) provider3.get());
    }

    /* renamed from: b */
    public static C12967f m50708b(Provider<C10844c> provider, Provider<C10738l> provider2, Provider<C10742q> provider3) {
        return new C12967f(provider, provider2, provider3);
    }
}
