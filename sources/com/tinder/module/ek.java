package com.tinder.module;

import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerWebServices;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.ad;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ek implements Factory<ad> {
    /* renamed from: a */
    private final ec f42971a;
    /* renamed from: b */
    private final Provider<ManagerWebServices> f42972b;
    /* renamed from: c */
    private final Provider<ManagerProfile> f42973c;
    /* renamed from: d */
    private final Provider<EnvironmentProvider> f42974d;
    /* renamed from: e */
    private final Provider<C15193i> f42975e;
    /* renamed from: f */
    private final Provider<UserMetaManager> f42976f;

    public /* synthetic */ Object get() {
        return m52467a();
    }

    public ek(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerProfile> provider2, Provider<EnvironmentProvider> provider3, Provider<C15193i> provider4, Provider<UserMetaManager> provider5) {
        this.f42971a = ecVar;
        this.f42972b = provider;
        this.f42973c = provider2;
        this.f42974d = provider3;
        this.f42975e = provider4;
        this.f42976f = provider5;
    }

    /* renamed from: a */
    public ad m52467a() {
        return m52465a(this.f42971a, this.f42972b, this.f42973c, this.f42974d, this.f42975e, this.f42976f);
    }

    /* renamed from: a */
    public static ad m52465a(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerProfile> provider2, Provider<EnvironmentProvider> provider3, Provider<C15193i> provider4, Provider<UserMetaManager> provider5) {
        return m52464a(ecVar, (ManagerWebServices) provider.get(), (ManagerProfile) provider2.get(), (EnvironmentProvider) provider3.get(), (C15193i) provider4.get(), (UserMetaManager) provider5.get());
    }

    /* renamed from: b */
    public static ek m52466b(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerProfile> provider2, Provider<EnvironmentProvider> provider3, Provider<C15193i> provider4, Provider<UserMetaManager> provider5) {
        return new ek(ecVar, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static ad m52464a(ec ecVar, ManagerWebServices managerWebServices, ManagerProfile managerProfile, EnvironmentProvider environmentProvider, C15193i c15193i, UserMetaManager userMetaManager) {
        return (ad) C15521i.a(ecVar.m40883a(managerWebServices, managerProfile, environmentProvider, c15193i, userMetaManager), "Cannot return null from a non-@Nullable @Provides method");
    }
}
