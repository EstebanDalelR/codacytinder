package com.tinder.profiletab.presenter;

import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.loops.analytics.C11912a;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.passport.p303f.C12263a;
import com.tinder.profiletab.p369c.C16173a;
import com.tinder.profiletab.p369c.C16176d;
import com.tinder.profiletab.p369c.C16178g;
import com.tinder.profiletab.p369c.C16184i;
import com.tinder.profiletab.p370d.C14470b.C14469b;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.presenter.y */
public final class C17788y implements Factory<C14476x> {
    /* renamed from: a */
    private final Provider<CurrentUserProvider> f55501a;
    /* renamed from: b */
    private final Provider<C14469b> f55502b;
    /* renamed from: c */
    private final Provider<C12263a> f55503c;
    /* renamed from: d */
    private final Provider<C16184i> f55504d;
    /* renamed from: e */
    private final Provider<C16173a> f55505e;
    /* renamed from: f */
    private final Provider<C16178g> f55506f;
    /* renamed from: g */
    private final Provider<C16176d> f55507g;
    /* renamed from: h */
    private final Provider<ConfirmTutorialsViewed> f55508h;
    /* renamed from: i */
    private final Provider<C8609a> f55509i;
    /* renamed from: j */
    private final Provider<C11912a> f55510j;
    /* renamed from: k */
    private final Provider<C15679f> f55511k;
    /* renamed from: l */
    private final Provider<C15679f> f55512l;

    public /* synthetic */ Object get() {
        return m64997a();
    }

    public C17788y(Provider<CurrentUserProvider> provider, Provider<C14469b> provider2, Provider<C12263a> provider3, Provider<C16184i> provider4, Provider<C16173a> provider5, Provider<C16178g> provider6, Provider<C16176d> provider7, Provider<ConfirmTutorialsViewed> provider8, Provider<C8609a> provider9, Provider<C11912a> provider10, Provider<C15679f> provider11, Provider<C15679f> provider12) {
        this.f55501a = provider;
        this.f55502b = provider2;
        this.f55503c = provider3;
        this.f55504d = provider4;
        this.f55505e = provider5;
        this.f55506f = provider6;
        this.f55507g = provider7;
        this.f55508h = provider8;
        this.f55509i = provider9;
        this.f55510j = provider10;
        this.f55511k = provider11;
        this.f55512l = provider12;
    }

    /* renamed from: a */
    public C14476x m64997a() {
        return C17788y.m64995a(this.f55501a, this.f55502b, this.f55503c, this.f55504d, this.f55505e, this.f55506f, this.f55507g, this.f55508h, this.f55509i, this.f55510j, this.f55511k, this.f55512l);
    }

    /* renamed from: a */
    public static C14476x m64995a(Provider<CurrentUserProvider> provider, Provider<C14469b> provider2, Provider<C12263a> provider3, Provider<C16184i> provider4, Provider<C16173a> provider5, Provider<C16178g> provider6, Provider<C16176d> provider7, Provider<ConfirmTutorialsViewed> provider8, Provider<C8609a> provider9, Provider<C11912a> provider10, Provider<C15679f> provider11, Provider<C15679f> provider12) {
        return new C14476x((CurrentUserProvider) provider.get(), (C14469b) provider2.get(), (C12263a) provider3.get(), (C16184i) provider4.get(), (C16173a) provider5.get(), (C16178g) provider6.get(), (C16176d) provider7.get(), (ConfirmTutorialsViewed) provider8.get(), (C8609a) provider9.get(), (C11912a) provider10.get(), (C15679f) provider11.get(), (C15679f) provider12.get());
    }

    /* renamed from: b */
    public static C17788y m64996b(Provider<CurrentUserProvider> provider, Provider<C14469b> provider2, Provider<C12263a> provider3, Provider<C16184i> provider4, Provider<C16173a> provider5, Provider<C16178g> provider6, Provider<C16176d> provider7, Provider<ConfirmTutorialsViewed> provider8, Provider<C8609a> provider9, Provider<C11912a> provider10, Provider<C15679f> provider11, Provider<C15679f> provider12) {
        return new C17788y(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }
}
