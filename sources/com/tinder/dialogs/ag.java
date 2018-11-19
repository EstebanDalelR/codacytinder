package com.tinder.dialogs;

import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bf;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ag implements MembersInjector<ad> {
    /* renamed from: a */
    private final Provider<C2652a> f35984a;
    /* renamed from: b */
    private final Provider<bf> f35985b;
    /* renamed from: c */
    private final Provider<ManagerAnalytics> f35986c;
    /* renamed from: d */
    private final Provider<UserMetaManager> f35987d;

    public /* synthetic */ void injectMembers(Object obj) {
        m43844a((ad) obj);
    }

    /* renamed from: a */
    public void m43844a(ad adVar) {
        m43842a(adVar, (C2652a) this.f35984a.get());
        m43843a(adVar, (bf) this.f35985b.get());
        m43840a(adVar, (ManagerAnalytics) this.f35986c.get());
        m43841a(adVar, (UserMetaManager) this.f35987d.get());
    }

    /* renamed from: a */
    public static void m43842a(ad adVar, C2652a c2652a) {
        adVar.f35978F = c2652a;
    }

    /* renamed from: a */
    public static void m43843a(ad adVar, bf bfVar) {
        adVar.f35979G = bfVar;
    }

    /* renamed from: a */
    public static void m43840a(ad adVar, ManagerAnalytics managerAnalytics) {
        adVar.f35980H = managerAnalytics;
    }

    /* renamed from: a */
    public static void m43841a(ad adVar, UserMetaManager userMetaManager) {
        adVar.f35981I = userMetaManager;
    }
}
