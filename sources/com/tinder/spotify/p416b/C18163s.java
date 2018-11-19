package com.tinder.spotify.p416b;

import com.tinder.R;
import com.tinder.model.User;
import com.tinder.presenters.PresenterBase;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.target.SpotifyThemeSongTarget;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.spotify.b.s */
public class C18163s extends PresenterBase<SpotifyThemeSongTarget> {
    /* renamed from: a */
    private final C15035a f56351a;

    @Inject
    public C18163s(C15035a c15035a) {
        this.f56351a = c15035a;
    }

    /* renamed from: b */
    public void m65907b() {
        this.f56351a.m56681h().b(Schedulers.io()).a(C19397a.a()).a(new C18923t(this), new C18924u(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m65905a(User user) {
        if (H() != null) {
            ((SpotifyThemeSongTarget) H()).setThemeTrack(user.getSpotifyThemeTrack());
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m65906a(Throwable th) {
        if (H() != null) {
            ((SpotifyThemeSongTarget) H()).toastError(R.string.spotify_connection_error);
        }
        ad.a("something wrong when try to get user's top artists", th);
    }
}
