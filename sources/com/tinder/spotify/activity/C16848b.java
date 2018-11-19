package com.tinder.spotify.activity;

import com.tinder.base.C10358b;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bt;
import com.tinder.spotify.p416b.C18157a;
import dagger.MembersInjector;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.activity.b */
public final class C16848b implements MembersInjector<SpotifyAuthActivity> {
    /* renamed from: a */
    private final Provider<bk> f51918a;
    /* renamed from: b */
    private final Provider<C2652a> f51919b;
    /* renamed from: c */
    private final Provider<UserMetaManager> f51920c;
    /* renamed from: d */
    private final Provider<ManagerFusedLocation> f51921d;
    /* renamed from: e */
    private final Provider<bt> f51922e;
    /* renamed from: f */
    private final Provider<af> f51923f;
    /* renamed from: g */
    private final Provider<C2664c> f51924g;
    /* renamed from: h */
    private final Provider<ManagerAnalytics> f51925h;
    /* renamed from: i */
    private final Provider<C18157a> f51926i;

    public /* synthetic */ void injectMembers(Object obj) {
        m62401a((SpotifyAuthActivity) obj);
    }

    /* renamed from: a */
    public void m62401a(SpotifyAuthActivity spotifyAuthActivity) {
        C10358b.a(spotifyAuthActivity, (bk) this.f51918a.get());
        C10358b.a(spotifyAuthActivity, (C2652a) this.f51919b.get());
        C10358b.a(spotifyAuthActivity, (UserMetaManager) this.f51920c.get());
        C10358b.a(spotifyAuthActivity, (ManagerFusedLocation) this.f51921d.get());
        C10358b.a(spotifyAuthActivity, (bt) this.f51922e.get());
        C10358b.a(spotifyAuthActivity, (af) this.f51923f.get());
        C10358b.a(spotifyAuthActivity, (C2664c) this.f51924g.get());
        C10358b.a(spotifyAuthActivity, (ManagerAnalytics) this.f51925h.get());
        C16848b.m62400a(spotifyAuthActivity, (C18157a) this.f51926i.get());
    }

    /* renamed from: a */
    public static void m62400a(SpotifyAuthActivity spotifyAuthActivity, C18157a c18157a) {
        spotifyAuthActivity.f59979a = c18157a;
    }
}
