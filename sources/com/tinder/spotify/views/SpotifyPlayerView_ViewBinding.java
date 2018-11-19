package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.common.view.SafeViewFlipper;

public class SpotifyPlayerView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyPlayerView f51980b;
    /* renamed from: c */
    private View f51981c;

    @UiThread
    public SpotifyPlayerView_ViewBinding(final SpotifyPlayerView spotifyPlayerView, View view) {
        this.f51980b = spotifyPlayerView;
        spotifyPlayerView.mCircularProgressBar = (CircularProgressBar) C0761c.b(view, R.id.spotify_player_circular_progress, "field 'mCircularProgressBar'", CircularProgressBar.class);
        view = C0761c.a(view, R.id.spotify_player_controls_flipper, "field 'mControlFlipper' and method 'onPlayButtonClick'");
        spotifyPlayerView.mControlFlipper = (SafeViewFlipper) C0761c.c(view, R.id.spotify_player_controls_flipper, "field 'mControlFlipper'", SafeViewFlipper.class);
        this.f51981c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyPlayerView_ViewBinding f51979b;

            public void doClick(View view) {
                spotifyPlayerView.onPlayButtonClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        SpotifyPlayerView spotifyPlayerView = this.f51980b;
        if (spotifyPlayerView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51980b = null;
        spotifyPlayerView.mCircularProgressBar = null;
        spotifyPlayerView.mControlFlipper = null;
        this.f51981c.setOnClickListener(null);
        this.f51981c = null;
    }
}
