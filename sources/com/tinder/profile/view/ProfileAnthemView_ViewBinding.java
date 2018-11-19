package com.tinder.profile.view;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.spotify.views.ArtworkPlayerView;

public class ProfileAnthemView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileAnthemView f50249b;
    /* renamed from: c */
    private View f50250c;

    @UiThread
    public ProfileAnthemView_ViewBinding(final ProfileAnthemView profileAnthemView, View view) {
        this.f50249b = profileAnthemView;
        profileAnthemView.mTopArtistName = (TextView) C0761c.b(view, R.id.spotify_top_artist_name, "field 'mTopArtistName'", TextView.class);
        profileAnthemView.mArtworkPlayerView = (ArtworkPlayerView) C0761c.b(view, R.id.spotify_top_artist_artwork_player, "field 'mArtworkPlayerView'", ArtworkPlayerView.class);
        profileAnthemView.mCurrentSong = (TextView) C0761c.b(view, R.id.spotify_top_artist_song_name, "field 'mCurrentSong'", TextView.class);
        View a = C0761c.a(view, R.id.spotify_anthem_container, "field 'mAnthemContainer' and method 'onThemeSongTrackClick'");
        profileAnthemView.mAnthemContainer = a;
        this.f50250c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ProfileAnthemView_ViewBinding f50248b;

            public void doClick(View view) {
                profileAnthemView.onThemeSongTrackClick();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        profileAnthemView.mPlayFullSongColor = C0432b.c(view, R.color.green);
        profileAnthemView.mArtworkSize = resources.getDimensionPixelSize(R.dimen.spotify_top_artist_artwork_player_size);
        profileAnthemView.mSpotifyInstall = resources.getString(R.string.spotify_install_play_store);
        profileAnthemView.mPlayFullSong = resources.getString(R.string.spotify_play_full_song);
        profileAnthemView.mSpotifyIntentResolveError = resources.getString(R.string.reported_warning_accept_agreement_error);
    }

    @CallSuper
    public void unbind() {
        ProfileAnthemView profileAnthemView = this.f50249b;
        if (profileAnthemView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50249b = null;
        profileAnthemView.mTopArtistName = null;
        profileAnthemView.mArtworkPlayerView = null;
        profileAnthemView.mCurrentSong = null;
        profileAnthemView.mAnthemContainer = null;
        this.f50250c.setOnClickListener(null);
        this.f50250c = null;
    }
}
