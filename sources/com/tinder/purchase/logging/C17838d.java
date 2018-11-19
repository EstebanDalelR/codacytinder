package com.tinder.purchase.logging;

import com.tinder.api.TinderApi;
import com.tinder.managers.C2652a;
import com.tinder.purchase.logging.p376a.C14521a;
import com.tinder.purchase.logging.repository.PurchaseLogRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.logging.d */
public final class C17838d implements Factory<C16231c> {
    /* renamed from: a */
    private final Provider<TinderApi> f55665a;
    /* renamed from: b */
    private final Provider<PurchaseLogRepository> f55666b;
    /* renamed from: c */
    private final Provider<C14521a> f55667c;
    /* renamed from: d */
    private final Provider<C2652a> f55668d;

    public /* synthetic */ Object get() {
        return m65131a();
    }

    public C17838d(Provider<TinderApi> provider, Provider<PurchaseLogRepository> provider2, Provider<C14521a> provider3, Provider<C2652a> provider4) {
        this.f55665a = provider;
        this.f55666b = provider2;
        this.f55667c = provider3;
        this.f55668d = provider4;
    }

    /* renamed from: a */
    public C16231c m65131a() {
        return C17838d.m65129a(this.f55665a, this.f55666b, this.f55667c, this.f55668d);
    }

    /* renamed from: a */
    public static C16231c m65129a(Provider<TinderApi> provider, Provider<PurchaseLogRepository> provider2, Provider<C14521a> provider3, Provider<C2652a> provider4) {
        return new C16231c((TinderApi) provider.get(), (PurchaseLogRepository) provider2.get(), (C14521a) provider3.get(), (C2652a) provider4.get());
    }

    /* renamed from: b */
    public static C17838d m65130b(Provider<TinderApi> provider, Provider<PurchaseLogRepository> provider2, Provider<C14521a> provider3, Provider<C2652a> provider4) {
        return new C17838d(provider, provider2, provider3, provider4);
    }
}
