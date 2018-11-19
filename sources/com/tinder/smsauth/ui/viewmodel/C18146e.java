package com.tinder.smsauth.ui.viewmodel;

import com.tinder.smsauth.domain.usecase.C18092a;
import com.tinder.smsauth.domain.usecase.C18096e;
import com.tinder.smsauth.domain.usecase.C18098g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.viewmodel.e */
public final class C18146e implements Factory<SmsAuthNavigationViewModel> {
    /* renamed from: a */
    private final Provider<C18092a> f56311a;
    /* renamed from: b */
    private final Provider<C18098g> f56312b;
    /* renamed from: c */
    private final Provider<C18096e> f56313c;

    public /* synthetic */ Object get() {
        return m65842a();
    }

    public C18146e(Provider<C18092a> provider, Provider<C18098g> provider2, Provider<C18096e> provider3) {
        this.f56311a = provider;
        this.f56312b = provider2;
        this.f56313c = provider3;
    }

    /* renamed from: a */
    public SmsAuthNavigationViewModel m65842a() {
        return C18146e.m65840a(this.f56311a, this.f56312b, this.f56313c);
    }

    /* renamed from: a */
    public static SmsAuthNavigationViewModel m65840a(Provider<C18092a> provider, Provider<C18098g> provider2, Provider<C18096e> provider3) {
        return new SmsAuthNavigationViewModel((C18092a) provider.get(), (C18098g) provider2.get(), (C18096e) provider3.get());
    }

    /* renamed from: b */
    public static C18146e m65841b(Provider<C18092a> provider, Provider<C18098g> provider2, Provider<C18096e> provider3) {
        return new C18146e(provider, provider2, provider3);
    }
}
