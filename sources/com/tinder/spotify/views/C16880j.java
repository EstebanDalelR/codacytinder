package com.tinder.spotify.views;

import com.tinder.spotify.p416b.C18167w;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.views.j */
public final class C16880j implements MembersInjector<SpotifyTopTrackItemView> {
    /* renamed from: a */
    private final Provider<C18167w> f52009a;

    public /* synthetic */ void injectMembers(Object obj) {
        m62459a((SpotifyTopTrackItemView) obj);
    }

    /* renamed from: a */
    public void m62459a(SpotifyTopTrackItemView spotifyTopTrackItemView) {
        C16880j.m62458a(spotifyTopTrackItemView, (C18167w) this.f52009a.get());
    }

    /* renamed from: a */
    public static void m62458a(SpotifyTopTrackItemView spotifyTopTrackItemView, C18167w c18167w) {
        spotifyTopTrackItemView.f51988a = c18167w;
    }
}
