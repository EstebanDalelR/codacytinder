package com.tinder.fastmatch.preview;

import com.tinder.data.fastmatch.usecase.C10771d;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.preview.d */
public final class C13207d implements Factory<C9402a> {
    /* renamed from: a */
    private final Provider<C10771d> f41910a;
    /* renamed from: b */
    private final Provider<FastMatchConfigProvider> f41911b;

    public /* synthetic */ Object get() {
        return m51190a();
    }

    public C13207d(Provider<C10771d> provider, Provider<FastMatchConfigProvider> provider2) {
        this.f41910a = provider;
        this.f41911b = provider2;
    }

    /* renamed from: a */
    public C9402a m51190a() {
        return C13207d.m51188a(this.f41910a, this.f41911b);
    }

    /* renamed from: a */
    public static C9402a m51188a(Provider<C10771d> provider, Provider<FastMatchConfigProvider> provider2) {
        return new C9402a((C10771d) provider.get(), (FastMatchConfigProvider) provider2.get());
    }

    /* renamed from: b */
    public static C13207d m51189b(Provider<C10771d> provider, Provider<FastMatchConfigProvider> provider2) {
        return new C13207d(provider, provider2);
    }
}
