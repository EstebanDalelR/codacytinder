package com.tinder.activities;

import com.facebook.CallbackManager;
import com.tinder.base.C10358b;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.presenters.bw;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.activities.v */
public final class C7289v implements MembersInjector<LoginActivity> {
    /* renamed from: a */
    private final Provider<bk> f26355a;
    /* renamed from: b */
    private final Provider<C2652a> f26356b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f26357c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f26358d;
    /* renamed from: e */
    private final Provider<bt> f26359e;
    /* renamed from: f */
    private final Provider<af> f26360f;
    /* renamed from: g */
    private final Provider<C2664c> f26361g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f26362h;
    /* renamed from: i */
    private final Provider<bw> f26363i;
    /* renamed from: j */
    private final Provider<LegacyBreadCrumbTracker> f26364j;
    /* renamed from: k */
    private final Provider<CallbackManager> f26365k;

    public /* synthetic */ void injectMembers(Object obj) {
        m31169a((LoginActivity) obj);
    }

    /* renamed from: a */
    public void m31169a(LoginActivity loginActivity) {
        C10358b.a(loginActivity, (bk) this.f26355a.get());
        C10358b.a(loginActivity, (C2652a) this.f26356b.get());
        C10358b.a(loginActivity, (UserMetaManager) this.f26357c.get());
        C10358b.a(loginActivity, (ManagerFusedLocation) this.f26358d.get());
        C10358b.a(loginActivity, (bt) this.f26359e.get());
        C10358b.a(loginActivity, (af) this.f26360f.get());
        C10358b.a(loginActivity, (C2664c) this.f26361g.get());
        C10358b.a(loginActivity, (ManagerAnalytics) this.f26362h.get());
        C7289v.m31168a(loginActivity, (bw) this.f26363i.get());
        C7289v.m31167a(loginActivity, (LegacyBreadCrumbTracker) this.f26364j.get());
        C7289v.m31166a(loginActivity, (CallbackManager) this.f26365k.get());
    }

    /* renamed from: a */
    public static void m31168a(LoginActivity loginActivity, bw bwVar) {
        loginActivity.f14889a = bwVar;
    }

    /* renamed from: a */
    public static void m31167a(LoginActivity loginActivity, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        loginActivity.f14890b = legacyBreadCrumbTracker;
    }

    /* renamed from: a */
    public static void m31166a(LoginActivity loginActivity, CallbackManager callbackManager) {
        loginActivity.f14891c = callbackManager;
    }
}
