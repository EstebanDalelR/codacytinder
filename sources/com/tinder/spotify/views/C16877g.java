package com.tinder.spotify.views;

import com.tinder.spotify.p416b.C18161c;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.views.g */
public final class C16877g implements MembersInjector<SpotifyPickArtistView> {
    /* renamed from: a */
    private final Provider<C18161c> f52006a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62453a((SpotifyPickArtistView) obj);
    }

    /* renamed from: a */
    public void m62453a(SpotifyPickArtistView spotifyPickArtistView) {
        C16877g.m62452a(spotifyPickArtistView, (C18161c) this.f52006a.get());
    }

    /* renamed from: a */
    public static void m62452a(SpotifyPickArtistView spotifyPickArtistView, C18161c c18161c) {
        spotifyPickArtistView.f51970a = c18161c;
    }
}
