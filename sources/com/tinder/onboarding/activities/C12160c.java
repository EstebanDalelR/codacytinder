package com.tinder.onboarding.activities;

import com.tinder.base.ActivityBase;
import com.tinder.base.C10358b;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.onboarding.presenter.dn;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.onboarding.activities.c */
public final class C12160c implements MembersInjector<OnboardingActivity> {
    /* renamed from: a */
    private final Provider<bk> f39413a;
    /* renamed from: b */
    private final Provider<C2652a> f39414b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f39415c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f39416d;
    /* renamed from: e */
    private final Provider<bt> f39417e;
    /* renamed from: f */
    private final Provider<af> f39418f;
    /* renamed from: g */
    private final Provider<C2664c> f39419g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f39420h;
    /* renamed from: i */
    private final Provider<dn> f39421i;

    public /* synthetic */ void injectMembers(Object obj) {
        m48308a((OnboardingActivity) obj);
    }

    /* renamed from: a */
    public void m48308a(OnboardingActivity onboardingActivity) {
        C10358b.m42176a((ActivityBase) onboardingActivity, (bk) this.f39413a.get());
        C10358b.m42174a((ActivityBase) onboardingActivity, (C2652a) this.f39414b.get());
        C10358b.m42173a((ActivityBase) onboardingActivity, (UserMetaManager) this.f39415c.get());
        C10358b.m42172a((ActivityBase) onboardingActivity, (ManagerFusedLocation) this.f39416d.get());
        C10358b.m42177a((ActivityBase) onboardingActivity, (bt) this.f39417e.get());
        C10358b.m42175a((ActivityBase) onboardingActivity, (af) this.f39418f.get());
        C10358b.m42178a((ActivityBase) onboardingActivity, (C2664c) this.f39419g.get());
        C10358b.m42171a((ActivityBase) onboardingActivity, (ManagerAnalytics) this.f39420h.get());
        C12160c.m48307a(onboardingActivity, (dn) this.f39421i.get());
    }

    /* renamed from: a */
    public static void m48307a(OnboardingActivity onboardingActivity, dn dnVar) {
        onboardingActivity.f45409a = dnVar;
    }
}
