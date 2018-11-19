package com.tinder.spotify.views;

import com.tinder.managers.ManagerAnalytics;
import com.tinder.spotify.p416b.C18170x;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.views.l */
public final class C16881l implements MembersInjector<SpotifyTrackSearchView> {
    /* renamed from: a */
    private final Provider<C18170x> f52010a;
    /* renamed from: b */
    private final Provider<ManagerAnalytics> f52011b;

    public /* synthetic */ void injectMembers(Object obj) {
        m62462a((SpotifyTrackSearchView) obj);
    }

    /* renamed from: a */
    public void m62462a(SpotifyTrackSearchView spotifyTrackSearchView) {
        C16881l.m62461a(spotifyTrackSearchView, (C18170x) this.f52010a.get());
        C16881l.m62460a(spotifyTrackSearchView, (ManagerAnalytics) this.f52011b.get());
    }

    /* renamed from: a */
    public static void m62461a(SpotifyTrackSearchView spotifyTrackSearchView, C18170x c18170x) {
        spotifyTrackSearchView.f51996a = c18170x;
    }

    /* renamed from: a */
    public static void m62460a(SpotifyTrackSearchView spotifyTrackSearchView, ManagerAnalytics managerAnalytics) {
        spotifyTrackSearchView.f51997b = managerAnalytics;
    }
}
