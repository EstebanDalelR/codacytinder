package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ArtworkPlayerView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ArtworkPlayerView f51954b;

    @UiThread
    public ArtworkPlayerView_ViewBinding(ArtworkPlayerView artworkPlayerView, View view) {
        this.f51954b = artworkPlayerView;
        artworkPlayerView.mSpotifyPlayerView = (SpotifyPlayerView) C0761c.b(view, R.id.favorite_artist_artwork_player, "field 'mSpotifyPlayerView'", SpotifyPlayerView.class);
        artworkPlayerView.mArtworkView = (SpotifyArtworkView) C0761c.b(view, R.id.favorite_artist_artwork, "field 'mArtworkView'", SpotifyArtworkView.class);
        artworkPlayerView.mPhotoCornerRadius = view.getContext().getResources().getDimensionPixelSize(R.dimen.spotify_top_track_image_view_corner_radius);
    }

    @CallSuper
    public void unbind() {
        ArtworkPlayerView artworkPlayerView = this.f51954b;
        if (artworkPlayerView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51954b = null;
        artworkPlayerView.mSpotifyPlayerView = null;
        artworkPlayerView.mArtworkView = null;
    }
}
