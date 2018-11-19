package com.tinder.common.feed.view;

import com.tinder.spotify.p416b.C18167w;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.common.feed.view.c */
public final class C10671c implements MembersInjector<SpotifyTrackPlayerView> {
    /* renamed from: a */
    private final Provider<C18167w> f35012a;

    public /* synthetic */ void injectMembers(Object obj) {
        m43009a((SpotifyTrackPlayerView) obj);
    }

    /* renamed from: a */
    public void m43009a(SpotifyTrackPlayerView spotifyTrackPlayerView) {
        C10671c.m43008a(spotifyTrackPlayerView, (C18167w) this.f35012a.get());
    }

    /* renamed from: a */
    public static void m43008a(SpotifyTrackPlayerView spotifyTrackPlayerView, C18167w c18167w) {
        spotifyTrackPlayerView.f34989a = c18167w;
    }
}
