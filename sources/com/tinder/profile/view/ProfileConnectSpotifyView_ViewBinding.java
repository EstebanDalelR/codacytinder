package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ProfileConnectSpotifyView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileConnectSpotifyView f50260b;
    /* renamed from: c */
    private View f50261c;

    @UiThread
    public ProfileConnectSpotifyView_ViewBinding(final ProfileConnectSpotifyView profileConnectSpotifyView, View view) {
        this.f50260b = profileConnectSpotifyView;
        profileConnectSpotifyView.spotifyShareContainer = C0761c.a(view, R.id.spotify_share_container, "field 'spotifyShareContainer'");
        view = C0761c.a(view, R.id.spotify_login_button, "method 'onSpotifyLoginClick'");
        this.f50261c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileConnectSpotifyView_ViewBinding f50259b;

            public void doClick(View view) {
                profileConnectSpotifyView.onSpotifyLoginClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        ProfileConnectSpotifyView profileConnectSpotifyView = this.f50260b;
        if (profileConnectSpotifyView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50260b = null;
        profileConnectSpotifyView.spotifyShareContainer = null;
        this.f50261c.setOnClickListener(null);
        this.f50261c = null;
    }
}
