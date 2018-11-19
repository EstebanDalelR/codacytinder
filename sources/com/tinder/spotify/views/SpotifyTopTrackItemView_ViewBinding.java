package com.tinder.spotify.views;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class SpotifyTopTrackItemView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyTopTrackItemView f51992b;
    /* renamed from: c */
    private View f51993c;

    @UiThread
    public SpotifyTopTrackItemView_ViewBinding(final SpotifyTopTrackItemView spotifyTopTrackItemView, View view) {
        this.f51992b = spotifyTopTrackItemView;
        spotifyTopTrackItemView.mArtworkPlayerView = (ArtworkPlayerView) C0761c.b(view, R.id.spotify_top_track_artwork_player, "field 'mArtworkPlayerView'", ArtworkPlayerView.class);
        spotifyTopTrackItemView.mTopTrackSong = (TextView) C0761c.b(view, R.id.spotify_top_track_song, "field 'mTopTrackSong'", TextView.class);
        spotifyTopTrackItemView.mTopTrackArtistName = (TextView) C0761c.b(view, R.id.spotify_top_track_artist_name, "field 'mTopTrackArtistName'", TextView.class);
        spotifyTopTrackItemView.mSpotifyIcon = (ImageView) C0761c.b(view, R.id.ic_spotify_open_full_song, "field 'mSpotifyIcon'", ImageView.class);
        View a = C0761c.a(view, R.id.spotify_top_track_text_container, "field 'mTopTrackTextContainer' and method 'onTopTrackClick'");
        spotifyTopTrackItemView.mTopTrackTextContainer = a;
        this.f51993c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyTopTrackItemView_ViewBinding f51991b;

            public void doClick(View view) {
                spotifyTopTrackItemView.onTopTrackClick();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        spotifyTopTrackItemView.mGreenColor = C0432b.c(view, R.color.green);
        spotifyTopTrackItemView.mGrayColor = C0432b.c(view, R.color.gray);
        spotifyTopTrackItemView.mItemPadding = resources.getDimensionPixelSize(R.dimen.top_track_item_padding);
        spotifyTopTrackItemView.mOpenInLinkText = resources.getString(R.string.spotify_play_full_song);
        spotifyTopTrackItemView.mSpotifyInstall = resources.getString(R.string.spotify_install_play_store);
        spotifyTopTrackItemView.mSpotifyIntentResolveError = resources.getString(R.string.reported_warning_accept_agreement_error);
    }

    @CallSuper
    public void unbind() {
        SpotifyTopTrackItemView spotifyTopTrackItemView = this.f51992b;
        if (spotifyTopTrackItemView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51992b = null;
        spotifyTopTrackItemView.mArtworkPlayerView = null;
        spotifyTopTrackItemView.mTopTrackSong = null;
        spotifyTopTrackItemView.mTopTrackArtistName = null;
        spotifyTopTrackItemView.mSpotifyIcon = null;
        spotifyTopTrackItemView.mTopTrackTextContainer = null;
        this.f51993c.setOnClickListener(null);
        this.f51993c = null;
    }
}
