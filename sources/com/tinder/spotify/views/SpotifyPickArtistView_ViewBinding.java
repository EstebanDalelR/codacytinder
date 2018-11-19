package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class SpotifyPickArtistView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyPickArtistView f51973b;

    @UiThread
    public SpotifyPickArtistView_ViewBinding(SpotifyPickArtistView spotifyPickArtistView, View view) {
        this.f51973b = spotifyPickArtistView;
        spotifyPickArtistView.mPullContainer = (SwipeRefreshLayout) C0761c.b(view, R.id.spotify_track_pick_swipeLayout, "field 'mPullContainer'", SwipeRefreshLayout.class);
        spotifyPickArtistView.mTrackList = (RecyclerView) C0761c.b(view, R.id.spotify_track_pick_list, "field 'mTrackList'", RecyclerView.class);
    }

    @CallSuper
    public void unbind() {
        SpotifyPickArtistView spotifyPickArtistView = this.f51973b;
        if (spotifyPickArtistView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51973b = null;
        spotifyPickArtistView.mPullContainer = null;
        spotifyPickArtistView.mTrackList = null;
    }
}
