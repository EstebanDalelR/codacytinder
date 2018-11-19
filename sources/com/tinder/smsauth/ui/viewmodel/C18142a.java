package com.tinder.smsauth.ui.viewmodel;

import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.smsauth.domain.usecase.C18094c;
import com.tinder.smsauth.domain.usecase.C18108r;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.viewmodel.a */
public final class C18142a implements Factory<CountryCodeSelectionViewModel> {
    /* renamed from: a */
    private final Provider<C18108r> f56295a;
    /* renamed from: b */
    private final Provider<C18094c> f56296b;
    /* renamed from: c */
    private final Provider<Schedulers> f56297c;
    /* renamed from: d */
    private final Provider<Logger> f56298d;

    public /* synthetic */ Object get() {
        return m65830a();
    }

    public C18142a(Provider<C18108r> provider, Provider<C18094c> provider2, Provider<Schedulers> provider3, Provider<Logger> provider4) {
        this.f56295a = provider;
        this.f56296b = provider2;
        this.f56297c = provider3;
        this.f56298d = provider4;
    }

    /* renamed from: a */
    public CountryCodeSelectionViewModel m65830a() {
        return C18142a.m65828a(this.f56295a, this.f56296b, this.f56297c, this.f56298d);
    }

    /* renamed from: a */
    public static CountryCodeSelectionViewModel m65828a(Provider<C18108r> provider, Provider<C18094c> provider2, Provider<Schedulers> provider3, Provider<Logger> provider4) {
        return new CountryCodeSelectionViewModel((C18108r) provider.get(), (C18094c) provider2.get(), (Schedulers) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: b */
    public static C18142a m65829b(Provider<C18108r> provider, Provider<C18094c> provider2, Provider<Schedulers> provider3, Provider<Logger> provider4) {
        return new C18142a(provider, provider2, provider3, provider4);
    }
}
