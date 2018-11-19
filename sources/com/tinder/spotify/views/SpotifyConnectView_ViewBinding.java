package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomTextView;

public class SpotifyConnectView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyConnectView f51966b;
    /* renamed from: c */
    private View f51967c;
    /* renamed from: d */
    private View f51968d;

    @UiThread
    public SpotifyConnectView_ViewBinding(final SpotifyConnectView spotifyConnectView, View view) {
        this.f51966b = spotifyConnectView;
        View a = C0761c.a(view, R.id.spotify_container, "field 'mSpotifyContainer' and method 'spotifyClicked'");
        spotifyConnectView.mSpotifyContainer = a;
        this.f51967c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyConnectView_ViewBinding f51963b;

            public void doClick(View view) {
                spotifyConnectView.spotifyClicked();
            }
        });
        a = C0761c.a(view, R.id.spotify_connected_top_artists_container, "field 'mConnectedContainer' and method 'connectedClicked'");
        spotifyConnectView.mConnectedContainer = a;
        this.f51968d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyConnectView_ViewBinding f51965b;

            public void doClick(View view) {
                spotifyConnectView.connectedClicked();
            }
        });
        spotifyConnectView.mProgressBarContainer = C0761c.a(view, R.id.spotify_connect_progress_container, "field 'mProgressBarContainer'");
        spotifyConnectView.mSpotifyAuthButton = (CustomTextView) C0761c.b(view, R.id.button_spotify_auth, "field 'mSpotifyAuthButton'", CustomTextView.class);
        spotifyConnectView.mCurrentUserName = (CustomTextView) C0761c.b(view, R.id.spotify_connect_user_name, "field 'mCurrentUserName'", CustomTextView.class);
        spotifyConnectView.mArtistNames = (CustomTextView) C0761c.b(view, R.id.spotify_connect_artists_names, "field 'mArtistNames'", CustomTextView.class);
        spotifyConnectView.mMore = (CustomTextView) C0761c.b(view, R.id.spotify_connect_artists_more, "field 'mMore'", CustomTextView.class);
        spotifyConnectView.mProgressBar = (ProgressBar) C0761c.b(view, R.id.spotify_progress_web, "field 'mProgressBar'", ProgressBar.class);
        spotifyConnectView.mMaxChar = view.getContext().getResources().getInteger(R.integer.spotify_max_artist_name_chars);
    }

    @CallSuper
    public void unbind() {
        SpotifyConnectView spotifyConnectView = this.f51966b;
        if (spotifyConnectView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51966b = null;
        spotifyConnectView.mSpotifyContainer = null;
        spotifyConnectView.mConnectedContainer = null;
        spotifyConnectView.mProgressBarContainer = null;
        spotifyConnectView.mSpotifyAuthButton = null;
        spotifyConnectView.mCurrentUserName = null;
        spotifyConnectView.mArtistNames = null;
        spotifyConnectView.mMore = null;
        spotifyConnectView.mProgressBar = null;
        this.f51967c.setOnClickListener(null);
        this.f51967c = null;
        this.f51968d.setOnClickListener(null);
        this.f51968d = null;
    }
}
