package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import com.tinder.presenters.PresenterBase;
import com.tinder.profile.target.ProfileTopArtistsTarget;
import com.tinder.spotify.audio.SpotifyAudioPlayer;
import javax.inject.Inject;

public class be extends PresenterBase<ProfileTopArtistsTarget> {
    /* renamed from: a */
    private final SpotifyAudioPlayer f55431a;

    @Inject
    public be(@NonNull SpotifyAudioPlayer spotifyAudioPlayer) {
        this.f55431a = spotifyAudioPlayer;
    }

    /* renamed from: a */
    public void m64950a() {
        super.a();
    }

    /* renamed from: b */
    public void m64951b() {
        if (H() != null) {
            ((ProfileTopArtistsTarget) H()).showTopTracks();
        }
    }

    /* renamed from: c */
    public void m64952c() {
        if (this.f55431a != null) {
            this.f55431a.m56698a();
        }
    }
}
