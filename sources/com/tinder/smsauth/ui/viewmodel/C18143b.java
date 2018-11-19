package com.tinder.smsauth.ui.viewmodel;

import com.tinder.smsauth.domain.usecase.C18092a;
import com.tinder.smsauth.domain.usecase.C18098g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.viewmodel.b */
public final class C18143b implements Factory<ErrorViewModel> {
    /* renamed from: a */
    private final Provider<C18092a> f56299a;
    /* renamed from: b */
    private final Provider<C18098g> f56300b;

    public /* synthetic */ Object get() {
        return m65833a();
    }

    public C18143b(Provider<C18092a> provider, Provider<C18098g> provider2) {
        this.f56299a = provider;
        this.f56300b = provider2;
    }

    /* renamed from: a */
    public ErrorViewModel m65833a() {
        return C18143b.m65831a(this.f56299a, this.f56300b);
    }

    /* renamed from: a */
    public static ErrorViewModel m65831a(Provider<C18092a> provider, Provider<C18098g> provider2) {
        return new ErrorViewModel((C18092a) provider.get(), (C18098g) provider2.get());
    }

    /* renamed from: b */
    public static C18143b m65832b(Provider<C18092a> provider, Provider<C18098g> provider2) {
        return new C18143b(provider, provider2);
    }
}
