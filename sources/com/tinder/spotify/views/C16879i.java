package com.tinder.spotify.views;

import com.tinder.spotify.p416b.C18163s;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.views.i */
public final class C16879i implements MembersInjector<SpotifyThemeSongView> {
    /* renamed from: a */
    private final Provider<C18163s> f52008a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62457a((SpotifyThemeSongView) obj);
    }

    /* renamed from: a */
    public void m62457a(SpotifyThemeSongView spotifyThemeSongView) {
        C16879i.m62456a(spotifyThemeSongView, (C18163s) this.f52008a.get());
    }

    /* renamed from: a */
    public static void m62456a(SpotifyThemeSongView spotifyThemeSongView, C18163s c18163s) {
        spotifyThemeSongView.f51982a = c18163s;
    }
}
