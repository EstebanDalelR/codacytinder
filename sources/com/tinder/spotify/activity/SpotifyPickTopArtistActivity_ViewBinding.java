package com.tinder.spotify.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.spotify.views.SpotifyPickArtistView;
import com.tinder.views.CustomTextView;

public class SpotifyPickTopArtistActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyPickTopArtistActivity f51914b;
    /* renamed from: c */
    private View f51915c;
    /* renamed from: d */
    private View f51916d;

    @UiThread
    public SpotifyPickTopArtistActivity_ViewBinding(final SpotifyPickTopArtistActivity spotifyPickTopArtistActivity, View view) {
        this.f51914b = spotifyPickTopArtistActivity;
        spotifyPickTopArtistActivity.mToolbar = (Toolbar) C0761c.b(view, R.id.toolbar_pick_artist, "field 'mToolbar'", Toolbar.class);
        spotifyPickTopArtistActivity.mSpotifyPickArtistView = (SpotifyPickArtistView) C0761c.b(view, R.id.pick_artist, "field 'mSpotifyPickArtistView'", SpotifyPickArtistView.class);
        View a = C0761c.a(view, R.id.view_back_title, "field 'mBackText' and method 'backTextClick'");
        spotifyPickTopArtistActivity.mBackText = (CustomTextView) C0761c.c(a, R.id.view_back_title, "field 'mBackText'", CustomTextView.class);
        this.f51915c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyPickTopArtistActivity_ViewBinding f51911b;

            public void doClick(View view) {
                spotifyPickTopArtistActivity.backTextClick();
            }
        });
        view = C0761c.a(view, R.id.pick_track_disconnect, "field 'mDisconnect' and method 'disConnectSpotify'");
        spotifyPickTopArtistActivity.mDisconnect = (CustomTextView) C0761c.c(view, R.id.pick_track_disconnect, "field 'mDisconnect'", CustomTextView.class);
        this.f51916d = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyPickTopArtistActivity_ViewBinding f51913b;

            public void doClick(View view) {
                spotifyPickTopArtistActivity.disConnectSpotify();
            }
        });
    }

    @CallSuper
    public void unbind() {
        SpotifyPickTopArtistActivity spotifyPickTopArtistActivity = this.f51914b;
        if (spotifyPickTopArtistActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51914b = null;
        spotifyPickTopArtistActivity.mToolbar = null;
        spotifyPickTopArtistActivity.mSpotifyPickArtistView = null;
        spotifyPickTopArtistActivity.mBackText = null;
        spotifyPickTopArtistActivity.mDisconnect = null;
        this.f51915c.setOnClickListener(null);
        this.f51915c = null;
        this.f51916d.setOnClickListener(null);
        this.f51916d = null;
    }
}
