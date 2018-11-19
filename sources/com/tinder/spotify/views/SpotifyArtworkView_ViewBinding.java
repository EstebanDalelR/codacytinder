package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class SpotifyArtworkView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyArtworkView f51960b;

    @UiThread
    public SpotifyArtworkView_ViewBinding(SpotifyArtworkView spotifyArtworkView, View view) {
        this.f51960b = spotifyArtworkView;
        spotifyArtworkView.mArtworkView = (SpotifyArtworkRoundedImageView) C0761c.b(view, R.id.spotify_artwork, "field 'mArtworkView'", SpotifyArtworkRoundedImageView.class);
        spotifyArtworkView.mLoadingSpinner = (ProgressBar) C0761c.b(view, R.id.spotify_artwork_progress, "field 'mLoadingSpinner'", ProgressBar.class);
        spotifyArtworkView.mPhotoCornerRadius = view.getContext().getResources().getDimensionPixelSize(R.dimen.spotify_top_track_image_view_corner_radius);
    }

    @CallSuper
    public void unbind() {
        SpotifyArtworkView spotifyArtworkView = this.f51960b;
        if (spotifyArtworkView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51960b = null;
        spotifyArtworkView.mArtworkView = null;
        spotifyArtworkView.mLoadingSpinner = null;
    }
}
