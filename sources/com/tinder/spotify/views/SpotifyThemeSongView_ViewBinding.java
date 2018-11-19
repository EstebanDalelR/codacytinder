package com.tinder.spotify.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomTextView;

public class SpotifyThemeSongView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SpotifyThemeSongView f51985b;
    /* renamed from: c */
    private View f51986c;

    @UiThread
    public SpotifyThemeSongView_ViewBinding(final SpotifyThemeSongView spotifyThemeSongView, View view) {
        this.f51985b = spotifyThemeSongView;
        View a = C0761c.a(view, R.id.container_theme_song, "field 'mChooseSongContainer' and method 'chooseThemeSongClicked'");
        spotifyThemeSongView.mChooseSongContainer = a;
        this.f51986c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SpotifyThemeSongView_ViewBinding f51984b;

            public void doClick(View view) {
                spotifyThemeSongView.chooseThemeSongClicked();
            }
        });
        spotifyThemeSongView.mArtistNameContainer = C0761c.a(view, R.id.spotify_theme_song_artist_container, "field 'mArtistNameContainer'");
        spotifyThemeSongView.mChooseThemeSong = (CustomTextView) C0761c.b(view, R.id.spotify_choose_theme_song, "field 'mChooseThemeSong'", CustomTextView.class);
        spotifyThemeSongView.mArtistName = (CustomTextView) C0761c.b(view, R.id.spotify_theme_song_artist_name, "field 'mArtistName'", CustomTextView.class);
        spotifyThemeSongView.mSongName = (CustomTextView) C0761c.b(view, R.id.spotify_theme_song_name, "field 'mSongName'", CustomTextView.class);
        spotifyThemeSongView.mDefaultText = view.getContext().getResources().getString(R.string.spotify_choose_theme_song);
    }

    @CallSuper
    public void unbind() {
        SpotifyThemeSongView spotifyThemeSongView = this.f51985b;
        if (spotifyThemeSongView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51985b = null;
        spotifyThemeSongView.mChooseSongContainer = null;
        spotifyThemeSongView.mArtistNameContainer = null;
        spotifyThemeSongView.mChooseThemeSong = null;
        spotifyThemeSongView.mArtistName = null;
        spotifyThemeSongView.mSongName = null;
        this.f51986c.setOnClickListener(null);
        this.f51986c = null;
    }
}
