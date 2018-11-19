package com.tinder.feed.view;

import com.tinder.common.feed.view.C10671c;
import com.tinder.feed.p249d.C9462a;
import com.tinder.feed.usecase.C11707c;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.spotify.p416b.C18167w;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.f */
public final class C11728f implements MembersInjector<FeedSpotifyTrackPlayerView> {
    /* renamed from: a */
    private final Provider<C18167w> f38255a;
    /* renamed from: b */
    private final Provider<C11707c> f38256b;
    /* renamed from: c */
    private final Provider<C9462a> f38257c;
    /* renamed from: d */
    private final Provider<C9542a> f38258d;

    public /* synthetic */ void injectMembers(Object obj) {
        m47566a((FeedSpotifyTrackPlayerView) obj);
    }

    /* renamed from: a */
    public void m47566a(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView) {
        C10671c.m43008a(feedSpotifyTrackPlayerView, (C18167w) this.f38255a.get());
        C11728f.m47564a(feedSpotifyTrackPlayerView, (C11707c) this.f38256b.get());
        C11728f.m47563a(feedSpotifyTrackPlayerView, (C9462a) this.f38257c.get());
        C11728f.m47565a(feedSpotifyTrackPlayerView, (C9542a) this.f38258d.get());
    }

    /* renamed from: a */
    public static void m47564a(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView, C11707c c11707c) {
        feedSpotifyTrackPlayerView.f42053b = c11707c;
    }

    /* renamed from: a */
    public static void m47563a(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView, C9462a c9462a) {
        feedSpotifyTrackPlayerView.f42054c = c9462a;
    }

    /* renamed from: a */
    public static void m47565a(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView, C9542a c9542a) {
        feedSpotifyTrackPlayerView.f42055d = c9542a;
    }
}
