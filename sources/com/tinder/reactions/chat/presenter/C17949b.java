package com.tinder.reactions.chat.presenter;

import com.tinder.chat.analytics.af;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.reactions.analytics.C16277h;
import com.tinder.reactions.chat.p386a.C14598a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.chat.presenter.b */
public final class C17949b implements Factory<C14603a> {
    /* renamed from: a */
    private final Provider<String> f55866a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f55867b;
    /* renamed from: c */
    private final Provider<C16277h> f55868c;
    /* renamed from: d */
    private final Provider<af> f55869d;
    /* renamed from: e */
    private final Provider<C14598a> f55870e;

    public /* synthetic */ Object get() {
        return m65276a();
    }

    public C17949b(Provider<String> provider, Provider<AbTestUtility> provider2, Provider<C16277h> provider3, Provider<af> provider4, Provider<C14598a> provider5) {
        this.f55866a = provider;
        this.f55867b = provider2;
        this.f55868c = provider3;
        this.f55869d = provider4;
        this.f55870e = provider5;
    }

    /* renamed from: a */
    public C14603a m65276a() {
        return C17949b.m65274a(this.f55866a, this.f55867b, this.f55868c, this.f55869d, this.f55870e);
    }

    /* renamed from: a */
    public static C14603a m65274a(Provider<String> provider, Provider<AbTestUtility> provider2, Provider<C16277h> provider3, Provider<af> provider4, Provider<C14598a> provider5) {
        return new C14603a((String) provider.get(), (AbTestUtility) provider2.get(), (C16277h) provider3.get(), (af) provider4.get(), (C14598a) provider5.get());
    }

    /* renamed from: b */
    public static C17949b m65275b(Provider<String> provider, Provider<AbTestUtility> provider2, Provider<C16277h> provider3, Provider<af> provider4, Provider<C14598a> provider5) {
        return new C17949b(provider, provider2, provider3, provider4, provider5);
    }
}
