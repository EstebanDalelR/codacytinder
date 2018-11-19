package com.tinder.managers;

import com.tinder.analytics.C2634g;
import com.tinder.api.ManagerNetwork;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8277d;
import com.tinder.auth.interactor.C8281o;
import com.tinder.common.repository.C10698c;
import com.tinder.session.p474a.C16576a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.managers.h */
public final class C13395h implements Factory<C2652a> {
    /* renamed from: a */
    private final Provider<bk> f42518a;
    /* renamed from: b */
    private final Provider<C2634g> f42519b;
    /* renamed from: c */
    private final Provider<ManagerNetwork> f42520c;
    /* renamed from: d */
    private final Provider<ManagerApp> f42521d;
    /* renamed from: e */
    private final Provider<FacebookManager> f42522e;
    /* renamed from: f */
    private final Provider<C10698c> f42523f;
    /* renamed from: g */
    private final Provider<C10333h> f42524g;
    /* renamed from: h */
    private final Provider<C8277d> f42525h;
    /* renamed from: i */
    private final Provider<C8281o> f42526i;
    /* renamed from: j */
    private final Provider<C16576a> f42527j;

    public /* synthetic */ Object get() {
        return m51827a();
    }

    public C13395h(Provider<bk> provider, Provider<C2634g> provider2, Provider<ManagerNetwork> provider3, Provider<ManagerApp> provider4, Provider<FacebookManager> provider5, Provider<C10698c> provider6, Provider<C10333h> provider7, Provider<C8277d> provider8, Provider<C8281o> provider9, Provider<C16576a> provider10) {
        this.f42518a = provider;
        this.f42519b = provider2;
        this.f42520c = provider3;
        this.f42521d = provider4;
        this.f42522e = provider5;
        this.f42523f = provider6;
        this.f42524g = provider7;
        this.f42525h = provider8;
        this.f42526i = provider9;
        this.f42527j = provider10;
    }

    /* renamed from: a */
    public C2652a m51827a() {
        return C13395h.m51825a(this.f42518a, this.f42519b, this.f42520c, this.f42521d, this.f42522e, this.f42523f, this.f42524g, this.f42525h, this.f42526i, this.f42527j);
    }

    /* renamed from: a */
    public static C2652a m51825a(Provider<bk> provider, Provider<C2634g> provider2, Provider<ManagerNetwork> provider3, Provider<ManagerApp> provider4, Provider<FacebookManager> provider5, Provider<C10698c> provider6, Provider<C10333h> provider7, Provider<C8277d> provider8, Provider<C8281o> provider9, Provider<C16576a> provider10) {
        return new C2652a((bk) provider.get(), (C2634g) provider2.get(), (ManagerNetwork) provider3.get(), (ManagerApp) provider4.get(), (FacebookManager) provider5.get(), (C10698c) provider6.get(), (C10333h) provider7.get(), (C8277d) provider8.get(), (C8281o) provider9.get(), (C16576a) provider10.get());
    }

    /* renamed from: b */
    public static C13395h m51826b(Provider<bk> provider, Provider<C2634g> provider2, Provider<ManagerNetwork> provider3, Provider<ManagerApp> provider4, Provider<FacebookManager> provider5, Provider<C10698c> provider6, Provider<C10333h> provider7, Provider<C8277d> provider8, Provider<C8281o> provider9, Provider<C16576a> provider10) {
        return new C13395h(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
