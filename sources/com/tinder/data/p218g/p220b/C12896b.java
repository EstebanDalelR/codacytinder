package com.tinder.data.p218g.p220b;

import com.google.android.gms.iid.C2553a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.g.b.b */
public final class C12896b implements Factory<C8665a> {
    /* renamed from: a */
    private final Provider<C2553a> f41358a;

    public /* synthetic */ Object get() {
        return m50553a();
    }

    public C12896b(Provider<C2553a> provider) {
        this.f41358a = provider;
    }

    /* renamed from: a */
    public C8665a m50553a() {
        return C12896b.m50551a(this.f41358a);
    }

    /* renamed from: a */
    public static C8665a m50551a(Provider<C2553a> provider) {
        return new C8665a((C2553a) provider.get());
    }

    /* renamed from: b */
    public static C12896b m50552b(Provider<C2553a> provider) {
        return new C12896b(provider);
    }
}
