package com.tinder.managers;

import android.app.Application;
import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.analytics.C2634g;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.model.adapter.domain.CurrentUserLegacyUserAdapter;
import com.tinder.p071a.C3868l;
import com.tinder.p071a.C3870m;
import com.tinder.p257g.C9648e;
import com.tinder.profile.adapters.C14367k;
import com.tinder.profile.p364c.C14397a;
import com.tinder.session.analytics.C16579a;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

public final class be implements Factory<ManagerProfile> {
    /* renamed from: a */
    private final Provider<bk> f42486a;
    /* renamed from: b */
    private final Provider<bj> f42487b;
    /* renamed from: c */
    private final Provider<C2634g> f42488c;
    /* renamed from: d */
    private final Provider<ManagerNetwork> f42489d;
    /* renamed from: e */
    private final Provider<C9648e> f42490e;
    /* renamed from: f */
    private final Provider<BriteDatabase> f42491f;
    /* renamed from: g */
    private final Provider<EnvironmentProvider> f42492g;
    /* renamed from: h */
    private final Provider<C15193i> f42493h;
    /* renamed from: i */
    private final Provider<C16579a> f42494i;
    /* renamed from: j */
    private final Provider<Application> f42495j;
    /* renamed from: k */
    private final Provider<CurrentUserProvider> f42496k;
    /* renamed from: l */
    private final Provider<CurrentUserLegacyUserAdapter> f42497l;
    /* renamed from: m */
    private final Provider<C17692o> f42498m;
    /* renamed from: n */
    private final Provider<C3870m> f42499n;
    /* renamed from: o */
    private final Provider<C3868l> f42500o;
    /* renamed from: p */
    private final Provider<C14367k> f42501p;
    /* renamed from: q */
    private final Provider<C14397a> f42502q;
    /* renamed from: r */
    private final Provider<MetaGateway> f42503r;

    public /* synthetic */ Object get() {
        return m51811a();
    }

    public be(Provider<bk> provider, Provider<bj> provider2, Provider<C2634g> provider3, Provider<ManagerNetwork> provider4, Provider<C9648e> provider5, Provider<BriteDatabase> provider6, Provider<EnvironmentProvider> provider7, Provider<C15193i> provider8, Provider<C16579a> provider9, Provider<Application> provider10, Provider<CurrentUserProvider> provider11, Provider<CurrentUserLegacyUserAdapter> provider12, Provider<C17692o> provider13, Provider<C3870m> provider14, Provider<C3868l> provider15, Provider<C14367k> provider16, Provider<C14397a> provider17, Provider<MetaGateway> provider18) {
        this.f42486a = provider;
        this.f42487b = provider2;
        this.f42488c = provider3;
        this.f42489d = provider4;
        this.f42490e = provider5;
        this.f42491f = provider6;
        this.f42492g = provider7;
        this.f42493h = provider8;
        this.f42494i = provider9;
        this.f42495j = provider10;
        this.f42496k = provider11;
        this.f42497l = provider12;
        this.f42498m = provider13;
        this.f42499n = provider14;
        this.f42500o = provider15;
        this.f42501p = provider16;
        this.f42502q = provider17;
        this.f42503r = provider18;
    }

    /* renamed from: a */
    public ManagerProfile m51811a() {
        Provider provider = this.f42486a;
        Provider provider2 = this.f42487b;
        Provider provider3 = this.f42488c;
        Provider provider4 = this.f42489d;
        Provider provider5 = this.f42490e;
        Provider provider6 = this.f42491f;
        Provider provider7 = this.f42492g;
        Provider provider8 = this.f42493h;
        Provider provider9 = this.f42494i;
        Provider provider10 = this.f42495j;
        Provider provider11 = this.f42496k;
        Provider provider12 = this.f42497l;
        Provider provider13 = this.f42498m;
        Provider provider14 = this.f42499n;
        Provider provider15 = this.f42500o;
        return m51809a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, this.f42501p, this.f42502q, this.f42503r);
    }

    /* renamed from: a */
    public static ManagerProfile m51809a(Provider<bk> provider, Provider<bj> provider2, Provider<C2634g> provider3, Provider<ManagerNetwork> provider4, Provider<C9648e> provider5, Provider<BriteDatabase> provider6, Provider<EnvironmentProvider> provider7, Provider<C15193i> provider8, Provider<C16579a> provider9, Provider<Application> provider10, Provider<CurrentUserProvider> provider11, Provider<CurrentUserLegacyUserAdapter> provider12, Provider<C17692o> provider13, Provider<C3870m> provider14, Provider<C3868l> provider15, Provider<C14367k> provider16, Provider<C14397a> provider17, Provider<MetaGateway> provider18) {
        return new ManagerProfile((bk) provider.get(), (bj) provider2.get(), (C2634g) provider3.get(), (ManagerNetwork) provider4.get(), (C9648e) provider5.get(), (BriteDatabase) provider6.get(), (EnvironmentProvider) provider7.get(), (C15193i) provider8.get(), (C16579a) provider9.get(), (Application) provider10.get(), (CurrentUserProvider) provider11.get(), (CurrentUserLegacyUserAdapter) provider12.get(), (C17692o) provider13.get(), (C3870m) provider14.get(), (C3868l) provider15.get(), (C14367k) provider16.get(), (C14397a) provider17.get(), (MetaGateway) provider18.get());
    }

    /* renamed from: b */
    public static be m51810b(Provider<bk> provider, Provider<bj> provider2, Provider<C2634g> provider3, Provider<ManagerNetwork> provider4, Provider<C9648e> provider5, Provider<BriteDatabase> provider6, Provider<EnvironmentProvider> provider7, Provider<C15193i> provider8, Provider<C16579a> provider9, Provider<Application> provider10, Provider<CurrentUserProvider> provider11, Provider<CurrentUserLegacyUserAdapter> provider12, Provider<C17692o> provider13, Provider<C3870m> provider14, Provider<C3868l> provider15, Provider<C14367k> provider16, Provider<C14397a> provider17, Provider<MetaGateway> provider18) {
        return new be(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }
}
