package com.tinder.smsauth.ui.viewmodel;

import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.domain.usecase.C18100i;
import com.tinder.smsauth.domain.usecase.C18104n;
import com.tinder.smsauth.domain.usecase.C18112v;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.viewmodel.d */
public final class C18145d implements Factory<PhoneNumberCollectionViewModel> {
    /* renamed from: a */
    private final Provider<C18104n> f56307a;
    /* renamed from: b */
    private final Provider<C18112v> f56308b;
    /* renamed from: c */
    private final Provider<C18100i> f56309c;
    /* renamed from: d */
    private final Provider<C18098g> f56310d;

    public /* synthetic */ Object get() {
        return m65839a();
    }

    public C18145d(Provider<C18104n> provider, Provider<C18112v> provider2, Provider<C18100i> provider3, Provider<C18098g> provider4) {
        this.f56307a = provider;
        this.f56308b = provider2;
        this.f56309c = provider3;
        this.f56310d = provider4;
    }

    /* renamed from: a */
    public PhoneNumberCollectionViewModel m65839a() {
        return C18145d.m65837a(this.f56307a, this.f56308b, this.f56309c, this.f56310d);
    }

    /* renamed from: a */
    public static PhoneNumberCollectionViewModel m65837a(Provider<C18104n> provider, Provider<C18112v> provider2, Provider<C18100i> provider3, Provider<C18098g> provider4) {
        return new PhoneNumberCollectionViewModel((C18104n) provider.get(), (C18112v) provider2.get(), (C18100i) provider3.get(), (C18098g) provider4.get());
    }

    /* renamed from: b */
    public static C18145d m65838b(Provider<C18104n> provider, Provider<C18112v> provider2, Provider<C18100i> provider3, Provider<C18098g> provider4) {
        return new C18145d(provider, provider2, provider3, provider4);
    }
}
