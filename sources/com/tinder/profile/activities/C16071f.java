package com.tinder.profile.activities;

import com.tinder.base.C10358b;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.profile.presenter.bd;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.activities.f */
public final class C16071f implements MembersInjector<ProfileSpotifyAuthActivity> {
    /* renamed from: a */
    private final Provider<bk> f49947a;
    /* renamed from: b */
    private final Provider<C2652a> f49948b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f49949c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f49950d;
    /* renamed from: e */
    private final Provider<bt> f49951e;
    /* renamed from: f */
    private final Provider<af> f49952f;
    /* renamed from: g */
    private final Provider<C2664c> f49953g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f49954h;
    /* renamed from: i */
    private final Provider<bd> f49955i;

    public /* synthetic */ void injectMembers(Object obj) {
        m60829a((ProfileSpotifyAuthActivity) obj);
    }

    /* renamed from: a */
    public void m60829a(ProfileSpotifyAuthActivity profileSpotifyAuthActivity) {
        C10358b.a(profileSpotifyAuthActivity, (bk) this.f49947a.get());
        C10358b.a(profileSpotifyAuthActivity, (C2652a) this.f49948b.get());
        C10358b.a(profileSpotifyAuthActivity, (UserMetaManager) this.f49949c.get());
        C10358b.a(profileSpotifyAuthActivity, (ManagerFusedLocation) this.f49950d.get());
        C10358b.a(profileSpotifyAuthActivity, (bt) this.f49951e.get());
        C10358b.a(profileSpotifyAuthActivity, (af) this.f49952f.get());
        C10358b.a(profileSpotifyAuthActivity, (C2664c) this.f49953g.get());
        C10358b.a(profileSpotifyAuthActivity, (ManagerAnalytics) this.f49954h.get());
        C16071f.m60828a(profileSpotifyAuthActivity, (bd) this.f49955i.get());
    }

    /* renamed from: a */
    public static void m60828a(ProfileSpotifyAuthActivity profileSpotifyAuthActivity, bd bdVar) {
        profileSpotifyAuthActivity.f59972a = bdVar;
    }
}
