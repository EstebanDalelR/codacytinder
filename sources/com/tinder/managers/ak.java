package com.tinder.managers;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.interactors.C9719k;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ak implements Factory<af> {
    /* renamed from: a */
    private final Provider<ManagerFusedLocation> f42473a;
    /* renamed from: b */
    private final Provider<ManagerNetwork> f42474b;
    /* renamed from: c */
    private final Provider<bk> f42475c;
    /* renamed from: d */
    private final Provider<ManagerAnalytics> f42476d;
    /* renamed from: e */
    private final Provider<C15193i> f42477e;
    /* renamed from: f */
    private final Provider<C9719k> f42478f;
    /* renamed from: g */
    private final Provider<C2630h> f42479g;
    /* renamed from: h */
    private final Provider<AbTestUtility> f42480h;
    /* renamed from: i */
    private final Provider<EnvironmentProvider> f42481i;
    /* renamed from: j */
    private final Provider<MetaGateway> f42482j;
    /* renamed from: k */
    private final Provider<SyncProfileData> f42483k;

    public /* synthetic */ Object get() {
        return m51808a();
    }

    public ak(Provider<ManagerFusedLocation> provider, Provider<ManagerNetwork> provider2, Provider<bk> provider3, Provider<ManagerAnalytics> provider4, Provider<C15193i> provider5, Provider<C9719k> provider6, Provider<C2630h> provider7, Provider<AbTestUtility> provider8, Provider<EnvironmentProvider> provider9, Provider<MetaGateway> provider10, Provider<SyncProfileData> provider11) {
        this.f42473a = provider;
        this.f42474b = provider2;
        this.f42475c = provider3;
        this.f42476d = provider4;
        this.f42477e = provider5;
        this.f42478f = provider6;
        this.f42479g = provider7;
        this.f42480h = provider8;
        this.f42481i = provider9;
        this.f42482j = provider10;
        this.f42483k = provider11;
    }

    /* renamed from: a */
    public af m51808a() {
        return m51806a(this.f42473a, this.f42474b, this.f42475c, this.f42476d, this.f42477e, this.f42478f, this.f42479g, this.f42480h, this.f42481i, this.f42482j, this.f42483k);
    }

    /* renamed from: a */
    public static af m51806a(Provider<ManagerFusedLocation> provider, Provider<ManagerNetwork> provider2, Provider<bk> provider3, Provider<ManagerAnalytics> provider4, Provider<C15193i> provider5, Provider<C9719k> provider6, Provider<C2630h> provider7, Provider<AbTestUtility> provider8, Provider<EnvironmentProvider> provider9, Provider<MetaGateway> provider10, Provider<SyncProfileData> provider11) {
        return new af((ManagerFusedLocation) provider.get(), (ManagerNetwork) provider2.get(), (bk) provider3.get(), (ManagerAnalytics) provider4.get(), (C15193i) provider5.get(), (C9719k) provider6.get(), (C2630h) provider7.get(), (AbTestUtility) provider8.get(), (EnvironmentProvider) provider9.get(), (MetaGateway) provider10.get(), (SyncProfileData) provider11.get());
    }

    /* renamed from: b */
    public static ak m51807b(Provider<ManagerFusedLocation> provider, Provider<ManagerNetwork> provider2, Provider<bk> provider3, Provider<ManagerAnalytics> provider4, Provider<C15193i> provider5, Provider<C9719k> provider6, Provider<C2630h> provider7, Provider<AbTestUtility> provider8, Provider<EnvironmentProvider> provider9, Provider<MetaGateway> provider10, Provider<SyncProfileData> provider11) {
        return new ak(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }
}
