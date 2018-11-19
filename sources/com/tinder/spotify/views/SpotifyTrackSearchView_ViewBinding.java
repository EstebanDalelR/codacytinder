package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class SpotifyTrackSearchView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyTrackSearchView f52001b;

    @UiThread
    public SpotifyTrackSearchView_ViewBinding(SpotifyTrackSearchView spotifyTrackSearchView, View view) {
        this.f52001b = spotifyTrackSearchView;
        spotifyTrackSearchView.mToolbar = (Toolbar) C0761c.b(view, R.id.toolbar_spotify_track_search, "field 'mToolbar'", Toolbar.class);
        spotifyTrackSearchView.mSearchView = (SearchView) C0761c.b(view, R.id.track_search, "field 'mSearchView'", SearchView.class);
        spotifyTrackSearchView.mRecyclerView = (RecyclerView) C0761c.b(view, R.id.songs_list, "field 'mRecyclerView'", RecyclerView.class);
        spotifyTrackSearchView.mProgressBar = (ProgressBar) C0761c.b(view, R.id.progress, "field 'mProgressBar'", ProgressBar.class);
    }

    @CallSuper
    public void unbind() {
        SpotifyTrackSearchView spotifyTrackSearchView = this.f52001b;
        if (spotifyTrackSearchView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52001b = null;
        spotifyTrackSearchView.mToolbar = null;
        spotifyTrackSearchView.mSearchView = null;
        spotifyTrackSearchView.mRecyclerView = null;
        spotifyTrackSearchView.mProgressBar = null;
    }
}
