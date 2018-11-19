package com.tinder.smsauth.ui.viewmodel;

import com.tinder.common.logger.Logger;
import com.tinder.smsauth.domain.usecase.C18098g;
import com.tinder.smsauth.domain.usecase.C18100i;
import com.tinder.smsauth.domain.usecase.C18102k;
import com.tinder.smsauth.domain.usecase.C18106p;
import com.tinder.smsauth.domain.usecase.C18110t;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.ui.viewmodel.c */
public final class C18144c implements Factory<OneTimePasswordCollectionViewModel> {
    /* renamed from: a */
    private final Provider<C18110t> f56301a;
    /* renamed from: b */
    private final Provider<C18100i> f56302b;
    /* renamed from: c */
    private final Provider<C18106p> f56303c;
    /* renamed from: d */
    private final Provider<Logger> f56304d;
    /* renamed from: e */
    private final Provider<C18098g> f56305e;
    /* renamed from: f */
    private final Provider<C18102k> f56306f;

    public /* synthetic */ Object get() {
        return m65836a();
    }

    public C18144c(Provider<C18110t> provider, Provider<C18100i> provider2, Provider<C18106p> provider3, Provider<Logger> provider4, Provider<C18098g> provider5, Provider<C18102k> provider6) {
        this.f56301a = provider;
        this.f56302b = provider2;
        this.f56303c = provider3;
        this.f56304d = provider4;
        this.f56305e = provider5;
        this.f56306f = provider6;
    }

    /* renamed from: a */
    public OneTimePasswordCollectionViewModel m65836a() {
        return C18144c.m65834a(this.f56301a, this.f56302b, this.f56303c, this.f56304d, this.f56305e, this.f56306f);
    }

    /* renamed from: a */
    public static OneTimePasswordCollectionViewModel m65834a(Provider<C18110t> provider, Provider<C18100i> provider2, Provider<C18106p> provider3, Provider<Logger> provider4, Provider<C18098g> provider5, Provider<C18102k> provider6) {
        return new OneTimePasswordCollectionViewModel((C18110t) provider.get(), (C18100i) provider2.get(), (C18106p) provider3.get(), (Logger) provider4.get(), (C18098g) provider5.get(), (C18102k) provider6.get());
    }

    /* renamed from: b */
    public static C18144c m65835b(Provider<C18110t> provider, Provider<C18100i> provider2, Provider<C18106p> provider3, Provider<Logger> provider4, Provider<C18098g> provider5, Provider<C18102k> provider6) {
        return new C18144c(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
