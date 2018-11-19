package com.tinder.spotify.views;

import com.tinder.spotify.p416b.C18159b;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.views.f */
public final class C16876f implements MembersInjector<SpotifyConnectView> {
    /* renamed from: a */
    private final Provider<C18159b> f52005a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62451a((SpotifyConnectView) obj);
    }

    /* renamed from: a */
    public void m62451a(SpotifyConnectView spotifyConnectView) {
        C16876f.m62450a(spotifyConnectView, (C18159b) this.f52005a.get());
    }

    /* renamed from: a */
    public static void m62450a(SpotifyConnectView spotifyConnectView, C18159b c18159b) {
        spotifyConnectView.f51961a = c18159b;
    }
}
