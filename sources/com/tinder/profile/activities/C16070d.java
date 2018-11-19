package com.tinder.profile.activities;

import com.tinder.base.C10358b;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.profile.presenter.ae;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.activities.d */
public final class C16070d implements MembersInjector<ProfileInstagramAuthActivity> {
    /* renamed from: a */
    private final Provider<bk> f49938a;
    /* renamed from: b */
    private final Provider<C2652a> f49939b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f49940c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f49941d;
    /* renamed from: e */
    private final Provider<bt> f49942e;
    /* renamed from: f */
    private final Provider<af> f49943f;
    /* renamed from: g */
    private final Provider<C2664c> f49944g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f49945h;
    /* renamed from: i */
    private final Provider<ae> f49946i;

    public /* synthetic */ void injectMembers(Object obj) {
        m60827a((ProfileInstagramAuthActivity) obj);
    }

    /* renamed from: a */
    public void m60827a(ProfileInstagramAuthActivity profileInstagramAuthActivity) {
        C10358b.a(profileInstagramAuthActivity, (bk) this.f49938a.get());
        C10358b.a(profileInstagramAuthActivity, (C2652a) this.f49939b.get());
        C10358b.a(profileInstagramAuthActivity, (UserMetaManager) this.f49940c.get());
        C10358b.a(profileInstagramAuthActivity, (ManagerFusedLocation) this.f49941d.get());
        C10358b.a(profileInstagramAuthActivity, (bt) this.f49942e.get());
        C10358b.a(profileInstagramAuthActivity, (af) this.f49943f.get());
        C10358b.a(profileInstagramAuthActivity, (C2664c) this.f49944g.get());
        C10358b.a(profileInstagramAuthActivity, (ManagerAnalytics) this.f49945h.get());
        C16070d.m60826a(profileInstagramAuthActivity, (ae) this.f49946i.get());
    }

    /* renamed from: a */
    public static void m60826a(ProfileInstagramAuthActivity profileInstagramAuthActivity, ae aeVar) {
        profileInstagramAuthActivity.f59970a = aeVar;
    }
}
