package com.tinder.smsauth.core;

import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.smsauth.entity.SmsAuthRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.core.b */
public final class C18084b implements Factory<C14964a> {
    /* renamed from: a */
    private final Provider<C14965c> f56170a;
    /* renamed from: b */
    private final Provider<SmsAuthRepository> f56171b;
    /* renamed from: c */
    private final Provider<Schedulers> f56172c;
    /* renamed from: d */
    private final Provider<Logger> f56173d;

    public /* synthetic */ Object get() {
        return m65664a();
    }

    public C18084b(Provider<C14965c> provider, Provider<SmsAuthRepository> provider2, Provider<Schedulers> provider3, Provider<Logger> provider4) {
        this.f56170a = provider;
        this.f56171b = provider2;
        this.f56172c = provider3;
        this.f56173d = provider4;
    }

    /* renamed from: a */
    public C14964a m65664a() {
        return C18084b.m65662a(this.f56170a, this.f56171b, this.f56172c, this.f56173d);
    }

    /* renamed from: a */
    public static C14964a m65662a(Provider<C14965c> provider, Provider<SmsAuthRepository> provider2, Provider<Schedulers> provider3, Provider<Logger> provider4) {
        return new C14964a((C14965c) provider.get(), (SmsAuthRepository) provider2.get(), (Schedulers) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: b */
    public static C18084b m65663b(Provider<C14965c> provider, Provider<SmsAuthRepository> provider2, Provider<Schedulers> provider3, Provider<Logger> provider4) {
        return new C18084b(provider, provider2, provider3, provider4);
    }
}
