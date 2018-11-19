package com.tinder.chat.presenter;

import com.tinder.chat.analytics.C10529d;
import com.tinder.chat.analytics.C10541x;
import com.tinder.domain.match.usecase.MuteMatch;
import com.tinder.domain.match.usecase.UnMatch;
import com.tinder.domain.match.usecase.UnMuteMatch;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.profile.p363b.C14377c;
import com.tinder.profile.p363b.C14378e;
import com.tinder.profile.p363b.C14392s;
import com.tinder.profile.p363b.ab;
import com.tinder.profile.p363b.am;
import com.tinder.profile.p363b.ao;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.presenter.q */
public final class C12736q implements Factory<C8442a> {
    /* renamed from: a */
    private final Provider<am> f41058a;
    /* renamed from: b */
    private final Provider<ao> f41059b;
    /* renamed from: c */
    private final Provider<UnMatch> f41060c;
    /* renamed from: d */
    private final Provider<MuteMatch> f41061d;
    /* renamed from: e */
    private final Provider<UnMuteMatch> f41062e;
    /* renamed from: f */
    private final Provider<C14377c> f41063f;
    /* renamed from: g */
    private final Provider<C14378e> f41064g;
    /* renamed from: h */
    private final Provider<ab> f41065h;
    /* renamed from: i */
    private final Provider<C14392s> f41066i;
    /* renamed from: j */
    private final Provider<C12239a> f41067j;
    /* renamed from: k */
    private final Provider<C10529d> f41068k;
    /* renamed from: l */
    private final Provider<C10541x> f41069l;

    public /* synthetic */ Object get() {
        return m50114a();
    }

    public C12736q(Provider<am> provider, Provider<ao> provider2, Provider<UnMatch> provider3, Provider<MuteMatch> provider4, Provider<UnMuteMatch> provider5, Provider<C14377c> provider6, Provider<C14378e> provider7, Provider<ab> provider8, Provider<C14392s> provider9, Provider<C12239a> provider10, Provider<C10529d> provider11, Provider<C10541x> provider12) {
        this.f41058a = provider;
        this.f41059b = provider2;
        this.f41060c = provider3;
        this.f41061d = provider4;
        this.f41062e = provider5;
        this.f41063f = provider6;
        this.f41064g = provider7;
        this.f41065h = provider8;
        this.f41066i = provider9;
        this.f41067j = provider10;
        this.f41068k = provider11;
        this.f41069l = provider12;
    }

    /* renamed from: a */
    public C8442a m50114a() {
        return C12736q.m50112a(this.f41058a, this.f41059b, this.f41060c, this.f41061d, this.f41062e, this.f41063f, this.f41064g, this.f41065h, this.f41066i, this.f41067j, this.f41068k, this.f41069l);
    }

    /* renamed from: a */
    public static C8442a m50112a(Provider<am> provider, Provider<ao> provider2, Provider<UnMatch> provider3, Provider<MuteMatch> provider4, Provider<UnMuteMatch> provider5, Provider<C14377c> provider6, Provider<C14378e> provider7, Provider<ab> provider8, Provider<C14392s> provider9, Provider<C12239a> provider10, Provider<C10529d> provider11, Provider<C10541x> provider12) {
        return new C8442a((am) provider.get(), (ao) provider2.get(), (UnMatch) provider3.get(), (MuteMatch) provider4.get(), (UnMuteMatch) provider5.get(), (C14377c) provider6.get(), (C14378e) provider7.get(), (ab) provider8.get(), (C14392s) provider9.get(), (C12239a) provider10.get(), (C10529d) provider11.get(), (C10541x) provider12.get());
    }

    /* renamed from: b */
    public static C12736q m50113b(Provider<am> provider, Provider<ao> provider2, Provider<UnMatch> provider3, Provider<MuteMatch> provider4, Provider<UnMuteMatch> provider5, Provider<C14377c> provider6, Provider<C14378e> provider7, Provider<ab> provider8, Provider<C14392s> provider9, Provider<C12239a> provider10, Provider<C10529d> provider11, Provider<C10541x> provider12) {
        return new C12736q(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }
}
