package com.tinder.spotify.p416b;

import com.tinder.api.ManagerWebServices;
import com.tinder.common.utils.C8578a;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.DefaultObserver;
import com.tinder.model.User;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.target.SpotifyConnectTarget;
import javax.inject.Inject;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.b.b */
public class C18159b extends PresenterBase<SpotifyConnectTarget> {
    /* renamed from: a */
    private final ManagerProfile f56337a;
    /* renamed from: b */
    private final C19573b f56338b;
    /* renamed from: c */
    private boolean f56339c = false;

    /* renamed from: com.tinder.spotify.b.b$1 */
    class C181581 extends DefaultObserver<User> {
        /* renamed from: a */
        final /* synthetic */ C18159b f56336a;

        C181581(C18159b c18159b) {
            this.f56336a = c18159b;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65866a((User) obj);
        }

        /* renamed from: a */
        public void m65866a(User user) {
            SpotifyConnectTarget spotifyConnectTarget = (SpotifyConnectTarget) this.f56336a.H();
            if (spotifyConnectTarget != null) {
                if (!this.f56336a.f56339c) {
                    spotifyConnectTarget.initView(user.isSpotifyConnected());
                    if (user.isSpotifyConnected()) {
                        spotifyConnectTarget.setTopArtists(user.getSpotifyTopArtists());
                    }
                }
            }
        }
    }

    @Inject
    public C18159b(ManagerProfile managerProfile) {
        this.f56337a = managerProfile;
        this.f56338b = new C19573b();
    }

    /* renamed from: b */
    public void m65869b() {
        this.f56338b.a(this.f56337a.d().b(Schedulers.io()).a(C19397a.a()).a(new C181581(this)));
    }

    /* renamed from: c */
    public String m65870c() {
        if (this.f56337a.c() == null) {
            return null;
        }
        String spotifyUserName;
        if (!C8578a.a(this.f56337a.c().getSpotifyUserName())) {
            if (!ManagerWebServices.NULL_STRING_VALUE.equalsIgnoreCase(this.f56337a.c().getSpotifyUserName())) {
                spotifyUserName = this.f56337a.c().getSpotifyUserName();
                return spotifyUserName;
            }
        }
        spotifyUserName = this.f56337a.c().getName();
        return spotifyUserName;
    }

    /* renamed from: a */
    public void m65868a() {
        super.a();
        this.f56338b.unsubscribe();
    }
}
