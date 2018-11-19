package com.tinder.spotify.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.spotify.views.SpotifyTrackSearchView;

public class SpotifyTrackSearchActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyTrackSearchActivity f51917b;

    @UiThread
    public SpotifyTrackSearchActivity_ViewBinding(SpotifyTrackSearchActivity spotifyTrackSearchActivity, View view) {
        this.f51917b = spotifyTrackSearchActivity;
        spotifyTrackSearchActivity.mSpotifyTrackSearchView = (SpotifyTrackSearchView) C0761c.b(view, R.id.track_search_view, "field 'mSpotifyTrackSearchView'", SpotifyTrackSearchView.class);
    }

    @CallSuper
    public void unbind() {
        SpotifyTrackSearchActivity spotifyTrackSearchActivity = this.f51917b;
        if (spotifyTrackSearchActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51917b = null;
        spotifyTrackSearchActivity.mSpotifyTrackSearchView = null;
    }
}
