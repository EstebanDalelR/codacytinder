package com.tinder.spotify.views;

import com.tinder.spotify.p416b.C18162n;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.views.h */
public final class C16878h implements MembersInjector<SpotifyPlayerView> {
    /* renamed from: a */
    private final Provider<C18162n> f52007a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62455a((SpotifyPlayerView) obj);
    }

    /* renamed from: a */
    public void m62455a(SpotifyPlayerView spotifyPlayerView) {
        C16878h.m62454a(spotifyPlayerView, (C18162n) this.f52007a.get());
    }

    /* renamed from: a */
    public static void m62454a(SpotifyPlayerView spotifyPlayerView, C18162n c18162n) {
        spotifyPlayerView.f51974a = c18162n;
    }
}
