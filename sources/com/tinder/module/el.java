package com.tinder.module;

import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.passport.p093d.C3945a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

public final class el implements Factory<C3945a> {
    /* renamed from: a */
    private final ec f42977a;
    /* renamed from: b */
    private final Provider<ManagerWebServices> f42978b;
    /* renamed from: c */
    private final Provider<ManagerNetwork> f42979c;
    /* renamed from: d */
    private final Provider<C2664c> f42980d;
    /* renamed from: e */
    private final Provider<TinderApiClient> f42981e;
    /* renamed from: f */
    private final Provider<EnvironmentProvider> f42982f;

    public /* synthetic */ Object get() {
        return m52471a();
    }

    public el(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2, Provider<C2664c> provider3, Provider<TinderApiClient> provider4, Provider<EnvironmentProvider> provider5) {
        this.f42977a = ecVar;
        this.f42978b = provider;
        this.f42979c = provider2;
        this.f42980d = provider3;
        this.f42981e = provider4;
        this.f42982f = provider5;
    }

    /* renamed from: a */
    public C3945a m52471a() {
        return m52469a(this.f42977a, this.f42978b, this.f42979c, this.f42980d, this.f42981e, this.f42982f);
    }

    /* renamed from: a */
    public static C3945a m52469a(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2, Provider<C2664c> provider3, Provider<TinderApiClient> provider4, Provider<EnvironmentProvider> provider5) {
        return m52468a(ecVar, (ManagerWebServices) provider.get(), (ManagerNetwork) provider2.get(), (C2664c) provider3.get(), (TinderApiClient) provider4.get(), (EnvironmentProvider) provider5.get());
    }

    /* renamed from: b */
    public static el m52470b(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2, Provider<C2664c> provider3, Provider<TinderApiClient> provider4, Provider<EnvironmentProvider> provider5) {
        return new el(ecVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static C3945a m52468a(ec ecVar, ManagerWebServices managerWebServices, ManagerNetwork managerNetwork, C2664c c2664c, TinderApiClient tinderApiClient, EnvironmentProvider environmentProvider) {
        return (C3945a) C15521i.a(ecVar.m40886a(managerWebServices, managerNetwork, c2664c, tinderApiClient, environmentProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
