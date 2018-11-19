package com.tinder.settings.activity;

import com.tinder.base.C10358b;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.settings.presenter.C18074m;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.activity.h */
public final class C16611h implements MembersInjector<GenderSearchActivity> {
    /* renamed from: a */
    private final Provider<bk> f51404a;
    /* renamed from: b */
    private final Provider<C2652a> f51405b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f51406c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f51407d;
    /* renamed from: e */
    private final Provider<bt> f51408e;
    /* renamed from: f */
    private final Provider<af> f51409f;
    /* renamed from: g */
    private final Provider<C2664c> f51410g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f51411h;
    /* renamed from: i */
    private final Provider<C18074m> f51412i;

    public /* synthetic */ void injectMembers(Object obj) {
        m62025a((GenderSearchActivity) obj);
    }

    /* renamed from: a */
    public void m62025a(GenderSearchActivity genderSearchActivity) {
        C10358b.a(genderSearchActivity, (bk) this.f51404a.get());
        C10358b.a(genderSearchActivity, (C2652a) this.f51405b.get());
        C10358b.a(genderSearchActivity, (UserMetaManager) this.f51406c.get());
        C10358b.a(genderSearchActivity, (ManagerFusedLocation) this.f51407d.get());
        C10358b.a(genderSearchActivity, (bt) this.f51408e.get());
        C10358b.a(genderSearchActivity, (af) this.f51409f.get());
        C10358b.a(genderSearchActivity, (C2664c) this.f51410g.get());
        C10358b.a(genderSearchActivity, (ManagerAnalytics) this.f51411h.get());
        C16611h.m62024a(genderSearchActivity, (C18074m) this.f51412i.get());
    }

    /* renamed from: a */
    public static void m62024a(GenderSearchActivity genderSearchActivity, C18074m c18074m) {
        genderSearchActivity.f59974a = c18074m;
    }
}
