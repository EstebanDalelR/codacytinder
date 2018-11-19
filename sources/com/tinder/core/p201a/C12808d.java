package com.tinder.core.p201a;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.core.a.d */
public final class C12808d implements Factory<C8589c> {
    /* renamed from: a */
    private final Provider<C8588a> f41210a;

    public /* synthetic */ Object get() {
        return m50315a();
    }

    public C12808d(Provider<C8588a> provider) {
        this.f41210a = provider;
    }

    /* renamed from: a */
    public C8589c m50315a() {
        return C12808d.m50313a(this.f41210a);
    }

    /* renamed from: a */
    public static C8589c m50313a(Provider<C8588a> provider) {
        return new C8589c((C8588a) provider.get());
    }

    /* renamed from: b */
    public static C12808d m50314b(Provider<C8588a> provider) {
        return new C12808d(provider);
    }
}
